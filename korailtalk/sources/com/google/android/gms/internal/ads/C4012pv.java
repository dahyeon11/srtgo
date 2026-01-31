package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.pv */
/* loaded from: classes2.dex */
public final class C4012pv extends AbstractC2986gv implements InterfaceC3440ku {
    public static final /* synthetic */ int zzd = 0;

    /* renamed from: d */
    private AbstractC3554lu f21821d;

    /* renamed from: e */
    private String f21822e;

    /* renamed from: f */
    private boolean f21823f;

    /* renamed from: g */
    private boolean f21824g;

    /* renamed from: h */
    private C2146Yu f21825h;

    /* renamed from: i */
    private long f21826i;

    /* renamed from: j */
    private long f21827j;

    public C4012pv(InterfaceC4579uu interfaceC4579uu, C4465tu c4465tu) {
        super(interfaceC4579uu);
        C1492Iv c1492Iv = new C1492Iv(interfaceC4579uu.getContext(), c4465tu, (InterfaceC4579uu) this.f19447c.get(), null);
        L1.n.zzi("ExoPlayerAdapter initialized.");
        this.f21821d = c1492Iv;
        c1492Iv.zzL(this);
    }

    protected static final String d(String str) {
        return "cache:".concat(String.valueOf(L1.g.zzf(str)));
    }

    private static String e(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void f(long j8) {
        K1.K0.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.ov
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.c();
            }
        }, j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void c() throws Throwable {
        String str;
        C4012pv c4012pv;
        C4012pv c4012pv2;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        C4012pv c4012pv3;
        long j8;
        long j9;
        String str2;
        C4012pv c4012pv4;
        long j10;
        String strD = d(this.f21822e);
        try {
            jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzx)).longValue() * 1000;
            jIntValue = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzw)).intValue();
            zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue();
        } catch (Exception e8) {
            e = e8;
            str = strD;
            c4012pv = this;
        }
        try {
            synchronized (this) {
                try {
                    if (G1.u.zzB().currentTimeMillis() - this.f21826i > jLongValue) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                    }
                    if (this.f21823f) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f21824g) {
                        if (!this.f21821d.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzz = this.f21821d.zzz();
                        if (jZzz > 0) {
                            long jZzv = this.f21821d.zzv();
                            if (jZzv != this.f21827j) {
                                try {
                                    j9 = jIntValue;
                                    str2 = strD;
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = strD;
                                    c4012pv4 = this;
                                }
                                try {
                                    zzo(this.f21822e, strD, jZzv, jZzz, jZzv > 0, zBooleanValue != 0 ? this.f21821d.zzA() : -1L, zBooleanValue != 0 ? this.f21821d.zzx() : -1L, zBooleanValue != 0 ? this.f21821d.zzB() : -1L, AbstractC3554lu.zzs(), AbstractC3554lu.zzu());
                                    c4012pv4 = this;
                                    j8 = jZzv;
                                    try {
                                        c4012pv4.f21827j = j8;
                                        j10 = jZzz;
                                        c4012pv4 = c4012pv4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str2;
                                        c4012pv = c4012pv4;
                                        try {
                                            throw th;
                                        } catch (Exception e9) {
                                            e = e9;
                                            L1.n.zzj("Failed to preload url " + c4012pv.f21822e + " Exception: " + e.getMessage());
                                            G1.u.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            c4012pv.zzg(c4012pv.f21822e, str, "error", e("error", e));
                                            c4012pv2 = c4012pv;
                                            G1.u.zzy().zzc(c4012pv2.f21825h);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c4012pv4 = this;
                                    str = str2;
                                    c4012pv = c4012pv4;
                                    throw th;
                                }
                            } else {
                                j8 = jZzv;
                                j9 = jIntValue;
                                str2 = strD;
                                c4012pv4 = this;
                                j10 = jZzz;
                            }
                            if (j8 >= j10) {
                                c4012pv4.zzj(c4012pv4.f21822e, str2, j10);
                                c4012pv2 = c4012pv4;
                            } else {
                                long jZzw = c4012pv4.f21821d.zzw();
                                c4012pv3 = c4012pv4;
                                if (jZzw >= j9) {
                                    c4012pv3 = c4012pv4;
                                    if (j8 > 0) {
                                        c4012pv2 = c4012pv4;
                                    }
                                }
                            }
                        } else {
                            c4012pv3 = this;
                        }
                        c4012pv3.f(((Long) H1.C.zzc().zza(AbstractC4439th.zzy)).longValue());
                        return;
                    }
                    c4012pv2 = this;
                    G1.u.zzy().zzc(c4012pv2.f21825h);
                } catch (Throwable th4) {
                    th = th4;
                    str = strD;
                    c4012pv = this;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            c4012pv = zBooleanValue;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv, g2.InterfaceC5549k
    public final void release() {
        AbstractC3554lu abstractC3554lu = this.f21821d;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzL(null);
            this.f21821d.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzD(int i8, int i9) {
    }

    public final AbstractC3554lu zza() {
        synchronized (this) {
            this.f21824g = true;
            notify();
        }
        this.f21821d.zzL(null);
        AbstractC3554lu abstractC3554lu = this.f21821d;
        this.f21821d = null;
        return abstractC3554lu;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzf() {
        synchronized (this) {
            this.f21823f = true;
            notify();
            release();
        }
        String str = this.f21822e;
        if (str != null) {
            zzg(this.f21822e, d(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzi(final boolean z8, final long j8) {
        final InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) this.f19447c.get();
        if (interfaceC4579uu != null) {
            AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nv
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4579uu.zzv(z8, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzk(String str, Exception exc) {
        L1.n.zzk("Precache error", exc);
        G1.u.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzl(String str, Exception exc) {
        L1.n.zzk("Precache exception", exc);
        G1.u.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzm(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzp(int i8) {
        this.f21821d.zzJ(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzq(int i8) {
        this.f21821d.zzK(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzr(int i8) {
        this.f21821d.zzM(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzs(int i8) {
        this.f21821d.zzN(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        String str2;
        String str3;
        C4012pv c4012pv;
        long j8;
        long j9;
        String str4;
        ?? r52;
        long j10;
        long j11;
        String str5;
        long j12;
        C4012pv c4012pv2 = this;
        String str6 = str;
        c4012pv2.f21822e = str6;
        String strD = d(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            c4012pv2.f21821d.zzF(uriArr, c4012pv2.f19446b);
            InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) c4012pv2.f19447c.get();
            if (interfaceC4579uu != null) {
                interfaceC4579uu.zzt(strD, c4012pv2);
            }
            o2.f fVarZzB = G1.u.zzB();
            long jCurrentTimeMillis = fVarZzB.currentTimeMillis();
            long jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzy)).longValue();
            long jLongValue2 = ((Long) H1.C.zzc().zza(AbstractC4439th.zzx)).longValue() * 1000;
            long jIntValue = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue();
            long j13 = -1;
            ?? r62 = jIntValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (fVarZzB.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (c4012pv2.f21823f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c4012pv2.f21824g) {
                            break;
                        }
                        if (!c4012pv2.f21821d.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzz = c4012pv2.f21821d.zzz();
                        if (jZzz > 0) {
                            long jZzv = c4012pv2.f21821d.zzv();
                            if (jZzv != j13) {
                                try {
                                    j8 = r62;
                                    long j14 = jZzz;
                                    j9 = jLongValue2;
                                    j11 = jLongValue;
                                    str5 = strD;
                                    try {
                                        zzo(str, strD, jZzv, j14, jZzv > 0, zBooleanValue ? c4012pv2.f21821d.zzA() : -1L, zBooleanValue ? c4012pv2.f21821d.zzx() : -1L, zBooleanValue ? c4012pv2.f21821d.zzB() : -1L, AbstractC3554lu.zzs(), AbstractC3554lu.zzu());
                                        j13 = jZzv;
                                        j12 = jZzz;
                                        str4 = j14;
                                    } catch (Throwable th) {
                                        th = th;
                                        c4012pv = this;
                                        str2 = str;
                                        str3 = str5;
                                        try {
                                            throw th;
                                        } catch (Exception e8) {
                                            e = e8;
                                            L1.n.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                            G1.u.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            c4012pv.zzg(str2, str3, "error", e("error", e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str5 = strD;
                                }
                            } else {
                                j8 = r62;
                                j9 = jLongValue2;
                                j11 = jLongValue;
                                str5 = strD;
                                j12 = jZzz;
                                str4 = r62;
                            }
                            r52 = (jZzv > j12 ? 1 : (jZzv == j12 ? 0 : -1));
                            if (r52 >= 0) {
                                zzj(str, str5, j12);
                            } else {
                                try {
                                    C4012pv c4012pv3 = this;
                                    str4 = str;
                                    str3 = str5;
                                    if (c4012pv3.f21821d.zzw() < j8 || jZzv <= 0) {
                                        j10 = j11;
                                        r52 = c4012pv3;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c4012pv = r52;
                                    str2 = str4;
                                    throw th;
                                }
                            }
                        } else {
                            j8 = r62;
                            j9 = jLongValue2;
                            str4 = str6;
                            str3 = strD;
                            r52 = c4012pv2;
                            j10 = jLongValue;
                        }
                        try {
                            r52.wait(j10);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str6;
                        str3 = strD;
                        c4012pv = c4012pv2;
                    }
                }
                jLongValue = j10;
                c4012pv2 = r52;
                str6 = str4;
                strD = str3;
                r62 = j8;
                jLongValue2 = j9;
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            str2 = str6;
            str3 = strD;
            c4012pv = c4012pv2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzv() {
        L1.n.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final boolean zzw(String str, String[] strArr, C2146Yu c2146Yu) {
        this.f21822e = str;
        this.f21825h = c2146Yu;
        String strD = d(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            this.f21821d.zzF(uriArr, this.f19446b);
            InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) this.f19447c.get();
            if (interfaceC4579uu != null) {
                interfaceC4579uu.zzt(strD, this);
            }
            this.f21826i = G1.u.zzB().currentTimeMillis();
            this.f21827j = -1L;
            f(0L);
            return true;
        } catch (Exception e8) {
            L1.n.zzj("Failed to preload url " + str + " Exception: " + e8.getMessage());
            G1.u.zzo().zzv(e8, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strD, "error", e("error", e8));
            return false;
        }
    }
}
