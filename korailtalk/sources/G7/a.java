package G7;

import C7.B;
import C7.C;
import C7.C0481o;
import C7.H;
import C7.I;
import C7.J;
import C7.p;
import P7.n;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: a */
    private final p f1491a;

    public a(p pVar) {
        this.f1491a = pVar;
    }

    private String a(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                sb.append("; ");
            }
            C0481o c0481o = (C0481o) list.get(i8);
            sb.append(c0481o.name());
            sb.append('=');
            sb.append(c0481o.value());
        }
        return sb.toString();
    }

    @Override // C7.B
    public J intercept(B.a aVar) {
        H hRequest = aVar.request();
        H.a aVarNewBuilder = hRequest.newBuilder();
        I iBody = hRequest.body();
        if (iBody != null) {
            C cContentType = iBody.contentType();
            if (cContentType != null) {
                aVarNewBuilder.header("Content-Type", cContentType.toString());
            }
            long jContentLength = iBody.contentLength();
            if (jContentLength != -1) {
                aVarNewBuilder.header("Content-Length", Long.toString(jContentLength));
                aVarNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                aVarNewBuilder.header("Transfer-Encoding", "chunked");
                aVarNewBuilder.removeHeader("Content-Length");
            }
        }
        boolean z8 = false;
        if (hRequest.header("Host") == null) {
            aVarNewBuilder.header("Host", D7.e.hostHeader(hRequest.url(), false));
        }
        if (hRequest.header("Connection") == null) {
            aVarNewBuilder.header("Connection", "Keep-Alive");
        }
        if (hRequest.header("Accept-Encoding") == null && hRequest.header("Range") == null) {
            aVarNewBuilder.header("Accept-Encoding", "gzip");
            z8 = true;
        }
        List<C0481o> listLoadForRequest = this.f1491a.loadForRequest(hRequest.url());
        if (!listLoadForRequest.isEmpty()) {
            aVarNewBuilder.header("Cookie", a(listLoadForRequest));
        }
        if (hRequest.header("User-Agent") == null) {
            aVarNewBuilder.header("User-Agent", D7.f.userAgent());
        }
        J jProceed = aVar.proceed(aVarNewBuilder.build());
        e.receiveHeaders(this.f1491a, hRequest.url(), jProceed.headers());
        J.a aVarRequest = jProceed.newBuilder().request(hRequest);
        if (z8 && "gzip".equalsIgnoreCase(jProceed.header("Content-Encoding")) && e.hasBody(jProceed)) {
            P7.j jVar = new P7.j(jProceed.body().source());
            aVarRequest.headers(jProceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            aVarRequest.body(new h(jProceed.header("Content-Type"), -1L, n.buffer(jVar)));
        }
        return aVarRequest.build();
    }
}
