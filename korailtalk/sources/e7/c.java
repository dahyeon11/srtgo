package E7;

import C7.C0471e;
import C7.H;
import C7.J;
import C7.z;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class c {
    public final J cacheResponse;
    public final H networkRequest;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f1061a;

        /* renamed from: b, reason: collision with root package name */
        final H f1062b;

        /* renamed from: c, reason: collision with root package name */
        final J f1063c;

        /* renamed from: d, reason: collision with root package name */
        private Date f1064d;

        /* renamed from: e, reason: collision with root package name */
        private String f1065e;

        /* renamed from: f, reason: collision with root package name */
        private Date f1066f;

        /* renamed from: g, reason: collision with root package name */
        private String f1067g;

        /* renamed from: h, reason: collision with root package name */
        private Date f1068h;

        /* renamed from: i, reason: collision with root package name */
        private long f1069i;

        /* renamed from: j, reason: collision with root package name */
        private long f1070j;

        /* renamed from: k, reason: collision with root package name */
        private String f1071k;

        /* renamed from: l, reason: collision with root package name */
        private int f1072l;

        public a(long j8, H h8, J j9) {
            this.f1072l = -1;
            this.f1061a = j8;
            this.f1062b = h8;
            this.f1063c = j9;
            if (j9 != null) {
                this.f1069i = j9.sentRequestAtMillis();
                this.f1070j = j9.receivedResponseAtMillis();
                z zVarHeaders = j9.headers();
                int size = zVarHeaders.size();
                for (int i8 = 0; i8 < size; i8++) {
                    String strName = zVarHeaders.name(i8);
                    String strValue = zVarHeaders.value(i8);
                    if ("Date".equalsIgnoreCase(strName)) {
                        this.f1064d = G7.d.parse(strValue);
                        this.f1065e = strValue;
                    } else if ("Expires".equalsIgnoreCase(strName)) {
                        this.f1068h = G7.d.parse(strValue);
                    } else if ("Last-Modified".equalsIgnoreCase(strName)) {
                        this.f1066f = G7.d.parse(strValue);
                        this.f1067g = strValue;
                    } else if ("ETag".equalsIgnoreCase(strName)) {
                        this.f1071k = strValue;
                    } else if ("Age".equalsIgnoreCase(strName)) {
                        this.f1072l = G7.e.parseSeconds(strValue, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f1064d;
            long jMax = date != null ? Math.max(0L, this.f1070j - date.getTime()) : 0L;
            int i8 = this.f1072l;
            if (i8 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i8));
            }
            long j8 = this.f1070j;
            return jMax + (j8 - this.f1069i) + (this.f1061a - j8);
        }

        private long b() {
            if (this.f1063c.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            if (this.f1068h != null) {
                Date date = this.f1064d;
                long time = this.f1068h.getTime() - (date != null ? date.getTime() : this.f1070j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f1066f == null || this.f1063c.request().url().query() != null) {
                return 0L;
            }
            Date date2 = this.f1064d;
            long time2 = (date2 != null ? date2.getTime() : this.f1069i) - this.f1066f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private c c() {
            String str;
            if (this.f1063c == null) {
                return new c(this.f1062b, null);
            }
            if (this.f1062b.isHttps() && this.f1063c.handshake() == null) {
                return new c(this.f1062b, null);
            }
            if (!c.isCacheable(this.f1063c, this.f1062b)) {
                return new c(this.f1062b, null);
            }
            C0471e c0471eCacheControl = this.f1062b.cacheControl();
            if (c0471eCacheControl.noCache() || d(this.f1062b)) {
                return new c(this.f1062b, null);
            }
            C0471e c0471eCacheControl2 = this.f1063c.cacheControl();
            long jA = a();
            long jB = b();
            if (c0471eCacheControl.maxAgeSeconds() != -1) {
                jB = Math.min(jB, TimeUnit.SECONDS.toMillis(c0471eCacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = c0471eCacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(c0471eCacheControl.minFreshSeconds()) : 0L;
            if (!c0471eCacheControl2.mustRevalidate() && c0471eCacheControl.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c0471eCacheControl.maxStaleSeconds());
            }
            if (!c0471eCacheControl2.noCache()) {
                long j8 = millis2 + jA;
                if (j8 < millis + jB) {
                    J.a aVarNewBuilder = this.f1063c.newBuilder();
                    if (j8 >= jB) {
                        aVarNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && e()) {
                        aVarNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, aVarNewBuilder.build());
                }
            }
            String str2 = this.f1071k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f1066f != null) {
                    str2 = this.f1067g;
                } else {
                    if (this.f1064d == null) {
                        return new c(this.f1062b, null);
                    }
                    str2 = this.f1065e;
                }
                str = "If-Modified-Since";
            }
            z.a aVarNewBuilder2 = this.f1062b.headers().newBuilder();
            D7.a.instance.addLenient(aVarNewBuilder2, str, str2);
            return new c(this.f1062b.newBuilder().headers(aVarNewBuilder2.build()).build(), this.f1063c);
        }

        private static boolean d(H h8) {
            return (h8.header("If-Modified-Since") == null && h8.header("If-None-Match") == null) ? false : true;
        }

        private boolean e() {
            return this.f1063c.cacheControl().maxAgeSeconds() == -1 && this.f1068h == null;
        }

        public c get() {
            c cVarC = c();
            return (cVarC.networkRequest == null || !this.f1062b.cacheControl().onlyIfCached()) ? cVarC : new c(null, null);
        }
    }

    c(H h8, J j8) {
        this.networkRequest = h8;
        this.cacheResponse = j8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.cacheControl().isPrivate() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCacheable(C7.J r3, C7.H r4) {
        /*
            int r0 = r3.code()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L5a
            C7.e r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds()
            r1 = -1
            if (r0 != r1) goto L5a
            C7.e r0 = r3.cacheControl()
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L5a
            C7.e r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            C7.e r3 = r3.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L6f
            C7.e r3 = r4.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.c.isCacheable(C7.J, C7.H):boolean");
    }
}
