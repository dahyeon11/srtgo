package O7;

import C7.B;
import C7.C;
import C7.H;
import C7.I;
import C7.InterfaceC0478l;
import C7.J;
import C7.K;
import C7.z;
import G7.e;
import K7.j;
import O7.a;
import P7.c;
import Q7.X;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: d */
    private static final Charset f3548d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final b f3549a;

    /* renamed from: b */
    private volatile Set f3550b;

    /* renamed from: c */
    private volatile EnumC0062a f3551c;

    /* renamed from: O7.a$a */
    public enum EnumC0062a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {
        public static final b DEFAULT = new b() { // from class: O7.b
            @Override // O7.a.b
            public final void log(String str) {
                a.b.a(str);
            }
        };

        static /* synthetic */ void a(String str) {
            j.get().log(4, str, null);
        }

        void log(String str);
    }

    public a() {
        this(b.DEFAULT);
    }

    private static boolean a(z zVar) {
        String str = zVar.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) ? false : true;
    }

    static boolean b(c cVar) {
        try {
            c cVar2 = new c();
            cVar.copyTo(cVar2, 0L, cVar.size() < 64 ? cVar.size() : 64L);
            for (int i8 = 0; i8 < 16; i8++) {
                if (cVar2.exhausted()) {
                    return true;
                }
                int utf8CodePoint = cVar2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private void c(z zVar, int i8) {
        String strValue = this.f3550b.contains(zVar.name(i8)) ? "██" : zVar.value(i8);
        this.f3549a.log(zVar.name(i8) + ": " + strValue);
    }

    public EnumC0062a getLevel() {
        return this.f3551c;
    }

    @Override // C7.B
    public J intercept(B.a aVar) throws Exception {
        long j8;
        char c9;
        String string;
        Long lValueOf;
        EnumC0062a enumC0062a = this.f3551c;
        H hRequest = aVar.request();
        if (enumC0062a == EnumC0062a.NONE) {
            return aVar.proceed(hRequest);
        }
        boolean z8 = enumC0062a == EnumC0062a.BODY;
        boolean z9 = z8 || enumC0062a == EnumC0062a.HEADERS;
        I iBody = hRequest.body();
        boolean z10 = iBody != null;
        InterfaceC0478l interfaceC0478lConnection = aVar.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(hRequest.method());
        sb.append(' ');
        sb.append(hRequest.url());
        sb.append(interfaceC0478lConnection != null ? X.SPACE + interfaceC0478lConnection.protocol() : "");
        String string2 = sb.toString();
        if (!z9 && z10) {
            string2 = string2 + " (" + iBody.contentLength() + "-byte body)";
        }
        this.f3549a.log(string2);
        if (z9) {
            if (z10) {
                if (iBody.contentType() != null) {
                    this.f3549a.log("Content-Type: " + iBody.contentType());
                }
                if (iBody.contentLength() != -1) {
                    this.f3549a.log("Content-Length: " + iBody.contentLength());
                }
            }
            z zVarHeaders = hRequest.headers();
            int size = zVarHeaders.size();
            for (int i8 = 0; i8 < size; i8++) {
                String strName = zVarHeaders.name(i8);
                if (!"Content-Type".equalsIgnoreCase(strName) && !"Content-Length".equalsIgnoreCase(strName)) {
                    c(zVarHeaders, i8);
                }
            }
            if (!z8 || !z10) {
                this.f3549a.log("--> END " + hRequest.method());
            } else if (a(hRequest.headers())) {
                this.f3549a.log("--> END " + hRequest.method() + " (encoded body omitted)");
            } else if (iBody.isDuplex()) {
                this.f3549a.log("--> END " + hRequest.method() + " (duplex request body omitted)");
            } else {
                c cVar = new c();
                iBody.writeTo(cVar);
                Charset charset = f3548d;
                C cContentType = iBody.contentType();
                if (cContentType != null) {
                    charset = cContentType.charset(charset);
                }
                this.f3549a.log("");
                if (b(cVar)) {
                    this.f3549a.log(cVar.readString(charset));
                    this.f3549a.log("--> END " + hRequest.method() + " (" + iBody.contentLength() + "-byte body)");
                } else {
                    this.f3549a.log("--> END " + hRequest.method() + " (binary " + iBody.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            J jProceed = aVar.proceed(hRequest);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            K kBody = jProceed.body();
            long jContentLength = kBody.contentLength();
            String str = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            b bVar = this.f3549a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(jProceed.code());
            if (jProceed.message().isEmpty()) {
                string = "";
                j8 = jContentLength;
                c9 = ' ';
            } else {
                StringBuilder sb3 = new StringBuilder();
                j8 = jContentLength;
                c9 = ' ';
                sb3.append(' ');
                sb3.append(jProceed.message());
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(c9);
            sb2.append(jProceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z9 ? "" : ", " + str + " body");
            sb2.append(')');
            bVar.log(sb2.toString());
            if (z9) {
                z zVarHeaders2 = jProceed.headers();
                int size2 = zVarHeaders2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    c(zVarHeaders2, i9);
                }
                if (!z8 || !e.hasBody(jProceed)) {
                    this.f3549a.log("<-- END HTTP");
                } else if (a(jProceed.headers())) {
                    this.f3549a.log("<-- END HTTP (encoded body omitted)");
                } else {
                    P7.e eVarSource = kBody.source();
                    eVarSource.request(Long.MAX_VALUE);
                    c buffer = eVarSource.getBuffer();
                    if ("gzip".equalsIgnoreCase(zVarHeaders2.get("Content-Encoding"))) {
                        lValueOf = Long.valueOf(buffer.size());
                        P7.j jVar = new P7.j(buffer.m11clone());
                        try {
                            buffer = new c();
                            buffer.writeAll(jVar);
                            jVar.close();
                        } finally {
                        }
                    } else {
                        lValueOf = null;
                    }
                    Charset charset2 = f3548d;
                    C cContentType2 = kBody.contentType();
                    if (cContentType2 != null) {
                        charset2 = cContentType2.charset(charset2);
                    }
                    if (!b(buffer)) {
                        this.f3549a.log("");
                        this.f3549a.log("<-- END HTTP (binary " + buffer.size() + "-byte body omitted)");
                        return jProceed;
                    }
                    if (j8 != 0) {
                        this.f3549a.log("");
                        this.f3549a.log(buffer.m11clone().readString(charset2));
                    }
                    if (lValueOf != null) {
                        this.f3549a.log("<-- END HTTP (" + buffer.size() + "-byte, " + lValueOf + "-gzipped-byte body)");
                    } else {
                        this.f3549a.log("<-- END HTTP (" + buffer.size() + "-byte body)");
                    }
                }
            }
            return jProceed;
        } catch (Exception e8) {
            this.f3549a.log("<-- HTTP FAILED: " + e8);
            throw e8;
        }
    }

    public void redactHeader(String str) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(this.f3550b);
        treeSet.add(str);
        this.f3550b = treeSet;
    }

    public a setLevel(EnumC0062a enumC0062a) {
        if (enumC0062a == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.f3551c = enumC0062a;
        return this;
    }

    public a(b bVar) {
        this.f3550b = Collections.emptySet();
        this.f3551c = EnumC0062a.NONE;
        this.f3549a = bVar;
    }
}
