package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.kakao.sdk.common.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2567dE0 extends Dv0 implements InterfaceC3596mE0 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18548e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18549f;

    /* renamed from: g, reason: collision with root package name */
    private final int f18550g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18551h;

    /* renamed from: i, reason: collision with root package name */
    private final C3482lE0 f18552i;

    /* renamed from: j, reason: collision with root package name */
    private final C3482lE0 f18553j;

    /* renamed from: k, reason: collision with root package name */
    private NB0 f18554k;

    /* renamed from: l, reason: collision with root package name */
    private HttpURLConnection f18555l;

    /* renamed from: m, reason: collision with root package name */
    private InputStream f18556m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18557n;

    /* renamed from: o, reason: collision with root package name */
    private int f18558o;

    /* renamed from: p, reason: collision with root package name */
    private long f18559p;

    /* renamed from: q, reason: collision with root package name */
    private long f18560q;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection d(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f18549f
            r3.setConnectTimeout(r4)
            int r4 = r2.f18550g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.lE0 r5 = r2.f18552i
            if (r5 == 0) goto L20
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
        L20:
            com.google.android.gms.internal.ads.lE0 r5 = r2.f18553j
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L34
        L50:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5f
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5e
            r4 = 0
            goto L7e
        L5e:
            r6 = r4
        L5f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L7a
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L7a:
            java.lang.String r4 = r4.toString()
        L7e:
            if (r4 == 0) goto L85
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L85:
            java.lang.String r4 = r2.f18551h
            if (r4 == 0) goto L8e
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8e:
            r4 = 1
            if (r4 == r10) goto L94
            java.lang.String r4 = "identity"
            goto L96
        L94:
            java.lang.String r4 = "gzip"
        L96:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.NB0.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2567dE0.d(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL e(URL url, String str, NB0 nb0) throws C3254jE0 {
        if (str == null) {
            throw new C3254jE0("Null location redirect", nb0, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new C3254jE0("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), nb0, 2001, 1);
            }
            if (this.f18548e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C3254jE0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", nb0, 2001, 1);
        } catch (MalformedURLException e8) {
            throw new C3254jE0(e8, nb0, 2001, 1);
        }
    }

    private final void f() {
        HttpURLConnection httpURLConnection = this.f18555l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                AbstractC2834fc0.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e8);
            }
            this.f18555l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #0 {IOException -> 0x001f, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:12:0x0021, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.f18559p     // Catch: java.io.IOException -> L1f
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L21
            long r4 = r6.f18560q     // Catch: java.io.IOException -> L1f
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
        L16:
            r7 = r3
            goto L35
        L18:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1f
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1f
            int r9 = (int) r0     // Catch: java.io.IOException -> L1f
            goto L21
        L1f:
            r7 = move-exception
            goto L36
        L21:
            java.io.InputStream r0 = r6.f18556m     // Catch: java.io.IOException -> L1f
            int r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zza     // Catch: java.io.IOException -> L1f
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1f
            if (r7 != r3) goto L2c
            goto L16
        L2c:
            long r8 = r6.f18560q     // Catch: java.io.IOException -> L1f
            long r0 = (long) r7     // Catch: java.io.IOException -> L1f
            long r8 = r8 + r0
            r6.f18560q = r8     // Catch: java.io.IOException -> L1f
            r6.zzg(r7)     // Catch: java.io.IOException -> L1f
        L35:
            return r7
        L36:
            com.google.android.gms.internal.ads.NB0 r8 = r6.f18554k
            int r9 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r9 = 2
            com.google.android.gms.internal.ads.jE0 r7 = com.google.android.gms.internal.ads.C3254jE0.zza(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2567dE0.zza(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.NB0 r27) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2567dE0.zzb(com.google.android.gms.internal.ads.NB0):long");
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f18555l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        try {
            InputStream inputStream = this.f18556m;
            if (inputStream != null) {
                if (this.f18555l != null) {
                    int i8 = AbstractC2281am0.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    NB0 nb0 = this.f18554k;
                    int i9 = AbstractC2281am0.zza;
                    throw new C3254jE0(e8, nb0, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, 3);
                }
            }
        } finally {
            this.f18556m = null;
            f();
            if (this.f18557n) {
                this.f18557n = false;
                a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f18555l;
        return httpURLConnection == null ? AbstractC2737el0.zzd() : new C2338bE0(httpURLConnection.getHeaderFields());
    }

    @Deprecated
    public C2567dE0() {
        this(null, 8000, 8000, false, null, null, false);
    }

    private C2567dE0(String str, int i8, int i9, boolean z8, C3482lE0 c3482lE0, InterfaceC1229Cj0 interfaceC1229Cj0, boolean z9) {
        super(true);
        this.f18551h = str;
        this.f18549f = i8;
        this.f18550g = i9;
        this.f18548e = z8;
        this.f18552i = c3482lE0;
        this.f18553j = new C3482lE0();
    }
}
