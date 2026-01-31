package L1;

/* loaded from: classes.dex */
public final class s implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f3023a;

    public s() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[PHI: r1
  0x00e4: PHI (r1v1 boolean) = (r1v0 boolean), (r1v0 boolean), (r1v3 boolean) binds: [B:39:0x00e2, B:35:0x00bd, B:23:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // L1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ". "
            r1 = 0
            boolean r2 = o2.e.isPackageSide()     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            if (r2 == 0) goto L12
            r2 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            goto L12
        Lf:
            r7 = move-exception
            goto Le8
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            r2.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            java.lang.String r3 = "Pinging URL: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            r2.append(r7)     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            L1.n.zze(r2)     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            r2.<init>(r7)     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            H1.C0591z.zzb()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = r6.f3023a     // Catch: java.lang.Throwable -> L4b
            r4 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L4b
            r5 = 1
            r2.setInstanceFollowRedirects(r5)     // Catch: java.lang.Throwable -> L4b
            r2.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4d
            java.lang.String r4 = "User-Agent"
            r2.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r3 = move-exception
            goto L97
        L4d:
            r2.setUseCaches(r1)     // Catch: java.lang.Throwable -> L4b
            L1.m r3 = new L1.m     // Catch: java.lang.Throwable -> L4b
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4b
            r3.zzc(r2, r4)     // Catch: java.lang.Throwable -> L4b
            int r4 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L4b
            r3.zze(r2, r4)     // Catch: java.lang.Throwable -> L4b
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L6b
            r3 = 300(0x12c, float:4.2E-43)
            if (r4 < r3) goto L69
            goto L6b
        L69:
            r1 = r5
            goto L87
        L6b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r3.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "Received non-success response code "
            r3.append(r5)     // Catch: java.lang.Throwable -> L4b
            r3.append(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = " from pinging URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4b
            r3.append(r7)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4b
            L1.n.zzj(r3)     // Catch: java.lang.Throwable -> L4b
        L87:
            r2.disconnect()     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            boolean r7 = o2.e.isPackageSide()
            if (r7 == 0) goto Le7
            goto Le4
        L91:
            r2 = move-exception
            goto L9b
        L93:
            r2 = move-exception
            goto L9b
        L95:
            r2 = move-exception
            goto Lc0
        L97:
            r2.disconnect()     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
            throw r3     // Catch: java.lang.Throwable -> Lf java.lang.RuntimeException -> L91 java.io.IOException -> L93 java.lang.IndexOutOfBoundsException -> L95
        L9b:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "Error while pinging URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf
            r3.append(r7)     // Catch: java.lang.Throwable -> Lf
            r3.append(r0)     // Catch: java.lang.Throwable -> Lf
            r3.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            L1.n.zzj(r7)     // Catch: java.lang.Throwable -> Lf
            boolean r7 = o2.e.isPackageSide()
            if (r7 == 0) goto Le7
            goto Le4
        Lc0:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "Error while parsing ping URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf
            r3.append(r7)     // Catch: java.lang.Throwable -> Lf
            r3.append(r0)     // Catch: java.lang.Throwable -> Lf
            r3.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            L1.n.zzj(r7)     // Catch: java.lang.Throwable -> Lf
            boolean r7 = o2.e.isPackageSide()
            if (r7 == 0) goto Le7
        Le4:
            android.net.TrafficStats.clearThreadStatsTag()
        Le7:
            return r1
        Le8:
            boolean r0 = o2.e.isPackageSide()
            if (r0 == 0) goto Lf1
            android.net.TrafficStats.clearThreadStatsTag()
        Lf1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.s.zza(java.lang.String):boolean");
    }

    public s(String str) {
        this.f3023a = str;
    }
}
