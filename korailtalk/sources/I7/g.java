package I7;

import C7.B;
import C7.E;
import C7.F;
import C7.H;
import C7.J;
import C7.z;
import P7.v;
import P7.w;
import P7.x;
import io.grpc.internal.U;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g implements G7.c {

    /* renamed from: g */
    private static final List f2456g = D7.e.immutableList("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", c.TARGET_METHOD_UTF8, c.TARGET_PATH_UTF8, c.TARGET_SCHEME_UTF8, c.TARGET_AUTHORITY_UTF8);

    /* renamed from: h */
    private static final List f2457h = D7.e.immutableList("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final B.a f2458a;

    /* renamed from: b */
    private final F7.e f2459b;

    /* renamed from: c */
    private final f f2460c;

    /* renamed from: d */
    private volatile i f2461d;

    /* renamed from: e */
    private final F f2462e;

    /* renamed from: f */
    private volatile boolean f2463f;

    public g(E e8, F7.e eVar, B.a aVar, f fVar) {
        this.f2459b = eVar;
        this.f2458a = aVar;
        this.f2460c = fVar;
        List<F> listProtocols = e8.protocols();
        F f8 = F.H2_PRIOR_KNOWLEDGE;
        this.f2462e = listProtocols.contains(f8) ? f8 : F.HTTP_2;
    }

    public static List<c> http2HeadersList(H h8) {
        z zVarHeaders = h8.headers();
        ArrayList arrayList = new ArrayList(zVarHeaders.size() + 4);
        arrayList.add(new c(c.TARGET_METHOD, h8.method()));
        arrayList.add(new c(c.TARGET_PATH, G7.i.requestPath(h8.url())));
        String strHeader = h8.header("Host");
        if (strHeader != null) {
            arrayList.add(new c(c.TARGET_AUTHORITY, strHeader));
        }
        arrayList.add(new c(c.TARGET_SCHEME, h8.url().scheme()));
        int size = zVarHeaders.size();
        for (int i8 = 0; i8 < size; i8++) {
            String lowerCase = zVarHeaders.name(i8).toLowerCase(Locale.US);
            if (!f2456g.contains(lowerCase) || (lowerCase.equals("te") && zVarHeaders.value(i8).equals(U.TE_TRAILERS))) {
                arrayList.add(new c(lowerCase, zVarHeaders.value(i8)));
            }
        }
        return arrayList;
    }

    public static J.a readHttp2HeadersList(z zVar, F f8) throws ProtocolException, NumberFormatException {
        z.a aVar = new z.a();
        int size = zVar.size();
        G7.k kVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            String strName = zVar.name(i8);
            String strValue = zVar.value(i8);
            if (strName.equals(c.RESPONSE_STATUS_UTF8)) {
                kVar = G7.k.parse("HTTP/1.1 " + strValue);
            } else if (!f2457h.contains(strName)) {
                D7.a.instance.addLenient(aVar, strName, strValue);
            }
        }
        if (kVar != null) {
            return new J.a().protocol(f8).code(kVar.code).message(kVar.message).headers(aVar.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // G7.c
    public void cancel() {
        this.f2463f = true;
        if (this.f2461d != null) {
            this.f2461d.closeLater(b.CANCEL);
        }
    }

    @Override // G7.c
    public F7.e connection() {
        return this.f2459b;
    }

    @Override // G7.c
    public v createRequestBody(H h8, long j8) {
        return this.f2461d.getSink();
    }

    @Override // G7.c
    public void finishRequest() {
        this.f2461d.getSink().close();
    }

    @Override // G7.c
    public void flushRequest() {
        this.f2460c.flush();
    }

    @Override // G7.c
    public w openResponseBodySource(J j8) {
        return this.f2461d.getSource();
    }

    @Override // G7.c
    public J.a readResponseHeaders(boolean z8) throws ProtocolException, NumberFormatException {
        J.a http2HeadersList = readHttp2HeadersList(this.f2461d.takeHeaders(), this.f2462e);
        if (z8 && D7.a.instance.code(http2HeadersList) == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // G7.c
    public long reportedContentLength(J j8) {
        return G7.e.contentLength(j8);
    }

    @Override // G7.c
    public z trailers() {
        return this.f2461d.trailers();
    }

    @Override // G7.c
    public void writeRequestHeaders(H h8) throws IOException {
        if (this.f2461d != null) {
            return;
        }
        this.f2461d = this.f2460c.newStream(http2HeadersList(h8), h8.body() != null);
        if (this.f2463f) {
            this.f2461d.closeLater(b.CANCEL);
            throw new IOException("Canceled");
        }
        x timeout = this.f2461d.readTimeout();
        long timeoutMillis = this.f2458a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(timeoutMillis, timeUnit);
        this.f2461d.writeTimeout().timeout(this.f2458a.writeTimeoutMillis(), timeUnit);
    }
}
