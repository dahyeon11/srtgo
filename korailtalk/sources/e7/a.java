package E7;

import C7.B;
import C7.F;
import C7.H;
import C7.J;
import C7.z;
import E7.c;
import G7.h;
import P7.n;
import P7.v;
import P7.w;
import P7.x;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import maum.m2u.map.Map;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: a */
    final f f1055a;

    /* renamed from: E7.a$a */
    class C0026a implements w {

        /* renamed from: a */
        boolean f1056a;

        /* renamed from: b */
        final /* synthetic */ P7.e f1057b;

        /* renamed from: c */
        final /* synthetic */ b f1058c;

        /* renamed from: d */
        final /* synthetic */ P7.d f1059d;

        C0026a(P7.e eVar, b bVar, P7.d dVar) {
            this.f1057b = eVar;
            this.f1058c = bVar;
            this.f1059d = dVar;
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f1056a && !D7.e.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.f1056a = true;
                this.f1058c.abort();
            }
            this.f1057b.close();
        }

        @Override // P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            try {
                long j9 = this.f1057b.read(cVar, j8);
                if (j9 != -1) {
                    cVar.copyTo(this.f1059d.buffer(), cVar.size() - j9, j9);
                    this.f1059d.emitCompleteSegments();
                    return j9;
                }
                if (!this.f1056a) {
                    this.f1056a = true;
                    this.f1059d.close();
                }
                return -1L;
            } catch (IOException e8) {
                if (!this.f1056a) {
                    this.f1056a = true;
                    this.f1058c.abort();
                }
                throw e8;
            }
        }

        @Override // P7.w
        public x timeout() {
            return this.f1057b.timeout();
        }
    }

    public a(f fVar) {
        this.f1055a = fVar;
    }

    private J a(b bVar, J j8) {
        v vVarBody;
        if (bVar == null || (vVarBody = bVar.body()) == null) {
            return j8;
        }
        return j8.newBuilder().body(new h(j8.header("Content-Type"), j8.body().contentLength(), n.buffer(new C0026a(j8.body().source(), bVar, n.buffer(vVarBody))))).build();
    }

    private static z b(z zVar, z zVar2) {
        z.a aVar = new z.a();
        int size = zVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            String strName = zVar.name(i8);
            String strValue = zVar.value(i8);
            if ((!"Warning".equalsIgnoreCase(strName) || !strValue.startsWith("1")) && (c(strName) || !d(strName) || zVar2.get(strName) == null)) {
                D7.a.instance.addLenient(aVar, strName, strValue);
            }
        }
        int size2 = zVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            String strName2 = zVar2.name(i9);
            if (!c(strName2) && d(strName2)) {
                D7.a.instance.addLenient(aVar, strName2, zVar2.value(i9));
            }
        }
        return aVar.build();
    }

    static boolean c(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean d(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static J e(J j8) {
        return (j8 == null || j8.body() == null) ? j8 : j8.newBuilder().body(null).build();
    }

    @Override // C7.B
    public J intercept(B.a aVar) throws IOException {
        f fVar = this.f1055a;
        J j8 = fVar != null ? fVar.get(aVar.request()) : null;
        c cVar = new c.a(System.currentTimeMillis(), aVar.request(), j8).get();
        H h8 = cVar.networkRequest;
        J j9 = cVar.cacheResponse;
        f fVar2 = this.f1055a;
        if (fVar2 != null) {
            fVar2.trackResponse(cVar);
        }
        if (j8 != null && j9 == null) {
            D7.e.closeQuietly(j8.body());
        }
        if (h8 == null && j9 == null) {
            return new J.a().request(aVar.request()).protocol(F.HTTP_1_1).code(Map.MapException.StatusCode.GRPC_AUTH_SIGN_IN_ERROR_VALUE).message("Unsatisfiable Request (only-if-cached)").body(D7.e.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (h8 == null) {
            return j9.newBuilder().cacheResponse(e(j9)).build();
        }
        try {
            J jProceed = aVar.proceed(h8);
            if (jProceed == null && j8 != null) {
            }
            if (j9 != null) {
                if (jProceed.code() == 304) {
                    J jBuild = j9.newBuilder().headers(b(j9.headers(), jProceed.headers())).sentRequestAtMillis(jProceed.sentRequestAtMillis()).receivedResponseAtMillis(jProceed.receivedResponseAtMillis()).cacheResponse(e(j9)).networkResponse(e(jProceed)).build();
                    jProceed.body().close();
                    this.f1055a.trackConditionalCacheHit();
                    this.f1055a.update(j9, jBuild);
                    return jBuild;
                }
                D7.e.closeQuietly(j9.body());
            }
            J jBuild2 = jProceed.newBuilder().cacheResponse(e(j9)).networkResponse(e(jProceed)).build();
            if (this.f1055a != null) {
                if (G7.e.hasBody(jBuild2) && c.isCacheable(jBuild2, h8)) {
                    return a(this.f1055a.put(jBuild2), jBuild2);
                }
                if (G7.f.invalidatesCache(h8.method())) {
                    try {
                        this.f1055a.remove(h8);
                    } catch (IOException unused) {
                    }
                }
            }
            return jBuild2;
        } finally {
            if (j8 != null) {
                D7.e.closeQuietly(j8.body());
            }
        }
    }
}
