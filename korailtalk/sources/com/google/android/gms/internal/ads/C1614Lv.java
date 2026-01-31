package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Lv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1614Lv extends Dv0 implements InterfaceC3596mE0 {

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f14364v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    private final int f14365e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14366f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14367g;

    /* renamed from: h, reason: collision with root package name */
    private final C3482lE0 f14368h;

    /* renamed from: i, reason: collision with root package name */
    private NB0 f14369i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f14370j;

    /* renamed from: k, reason: collision with root package name */
    private final Queue f14371k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f14372l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14373m;

    /* renamed from: n, reason: collision with root package name */
    private int f14374n;

    /* renamed from: o, reason: collision with root package name */
    private long f14375o;

    /* renamed from: p, reason: collision with root package name */
    private long f14376p;

    /* renamed from: q, reason: collision with root package name */
    private long f14377q;

    /* renamed from: r, reason: collision with root package name */
    private long f14378r;

    /* renamed from: s, reason: collision with root package name */
    private long f14379s;

    /* renamed from: t, reason: collision with root package name */
    private final long f14380t;

    /* renamed from: u, reason: collision with root package name */
    private final long f14381u;

    C1614Lv(String str, InterfaceC4279sE0 interfaceC4279sE0, int i8, int i9, long j8, long j9) {
        super(true);
        F10.zzc(str);
        this.f14367g = str;
        this.f14368h = new C3482lE0();
        this.f14365e = i8;
        this.f14366f = i9;
        this.f14371k = new ArrayDeque();
        this.f14380t = j8;
        this.f14381u = j9;
        if (interfaceC4279sE0 != null) {
            zzf(interfaceC4279sE0);
        }
    }

    private final void e() {
        while (!this.f14371k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f14371k.remove()).disconnect();
            } catch (Exception e8) {
                L1.n.zzh("Unexpected error while disconnecting", e8);
            }
        }
        this.f14370j = null;
    }

    final HttpURLConnection d(long j8, long j9, int i8) throws IOException {
        String string = this.f14369i.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f14365e);
            httpURLConnection.setReadTimeout(this.f14366f);
            for (Map.Entry entry : this.f14368h.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j8 + g5.e.STATE_NAME_NONE + j9);
            httpURLConnection.setRequestProperty("User-Agent", this.f14367g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f14371k.add(httpURLConnection);
            String string2 = this.f14369i.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f14374n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    e();
                    throw new C1574Kv(this.f14374n, headerFields, this.f14369i, i8);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f14372l != null) {
                        inputStream = new SequenceInputStream(this.f14372l, inputStream);
                    }
                    this.f14372l = inputStream;
                    return httpURLConnection;
                } catch (IOException e8) {
                    e();
                    throw new C3254jE0(e8, this.f14369i, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, i8);
                }
            } catch (IOException e9) {
                e();
                throw new C3254jE0("Unable to connect to ".concat(String.valueOf(string2)), e9, this.f14369i, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, i8);
            }
        } catch (IOException e10) {
            throw new C3254jE0("Unable to connect to ".concat(String.valueOf(string)), e10, this.f14369i, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        try {
            long j8 = this.f14375o;
            long j9 = this.f14376p;
            if (j8 - j9 == 0) {
                return -1;
            }
            long j10 = this.f14377q + j9;
            long j11 = i9;
            long j12 = j10 + j11 + this.f14381u;
            long j13 = this.f14379s;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.f14378r;
                if (j13 < j15) {
                    long jMin = Math.min(j15, Math.max(((this.f14380t + j14) - r3) - 1, (-1) + j14 + j11));
                    d(j14, jMin, 2);
                    this.f14379s = jMin;
                    j13 = jMin;
                }
            }
            int i10 = this.f14372l.read(bArr, i8, (int) Math.min(j11, ((j13 + 1) - this.f14377q) - this.f14376p));
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f14376p += i10;
            zzg(i10);
            return i10;
        } catch (IOException e8) {
            throw new C3254jE0(e8, this.f14369i, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws IOException, NumberFormatException {
        this.f14369i = nb0;
        this.f14376p = 0L;
        long j8 = nb0.zze;
        long j9 = nb0.zzf;
        long jMin = j9 == -1 ? this.f14380t : Math.min(this.f14380t, j9);
        this.f14377q = j8;
        HttpURLConnection httpURLConnectionD = d(j8, (jMin + j8) - 1, 1);
        this.f14370j = httpURLConnectionD;
        String headerField = httpURLConnectionD.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f14364v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j10 = Long.parseLong(matcher.group(2));
                    long j11 = Long.parseLong(matcher.group(3));
                    long j12 = nb0.zzf;
                    if (j12 != -1) {
                        this.f14375o = j12;
                        this.f14378r = Math.max(j10, (this.f14377q + j12) - 1);
                    } else {
                        this.f14375o = j11 - this.f14377q;
                        this.f14378r = j11 - 1;
                    }
                    this.f14379s = j10;
                    this.f14373m = true;
                    c(nb0);
                    return this.f14375o;
                } catch (NumberFormatException unused) {
                    L1.n.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new C1533Jv(headerField, nb0);
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f14370j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        try {
            InputStream inputStream = this.f14372l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new C3254jE0(e8, this.f14369i, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, 3);
                }
            }
        } finally {
            this.f14372l = null;
            e();
            if (this.f14373m) {
                this.f14373m = false;
                a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f14370j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
