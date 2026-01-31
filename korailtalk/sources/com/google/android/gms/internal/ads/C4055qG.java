package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.qG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4055qG {

    /* renamed from: b, reason: collision with root package name */
    private static final C3658mp f21900b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f21901c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f21902d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f21903e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f21904f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f21905g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f21906h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f21907i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f21908j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f21909k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f21910l;

    /* renamed from: m, reason: collision with root package name */
    private static final String f21911m;

    /* renamed from: n, reason: collision with root package name */
    private static final String f21912n;

    /* renamed from: o, reason: collision with root package name */
    private static final String f21913o;

    @Deprecated
    public static final RG0 zzb;

    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;
    public C3306jk zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();

    /* renamed from: a, reason: collision with root package name */
    private static final Object f21899a = new Object();
    public Object zzc = zza;
    public C3658mp zze = f21900b;

    static {
        C4881xa c4881xa = new C4881xa();
        c4881xa.zza("androidx.media3.common.Timeline");
        c4881xa.zzb(Uri.EMPTY);
        f21900b = c4881xa.zzc();
        f21901c = Integer.toString(1, 36);
        f21902d = Integer.toString(2, 36);
        f21903e = Integer.toString(3, 36);
        f21904f = Integer.toString(4, 36);
        f21905g = Integer.toString(5, 36);
        f21906h = Integer.toString(6, 36);
        f21907i = Integer.toString(7, 36);
        f21908j = Integer.toString(8, 36);
        f21909k = Integer.toString(9, 36);
        f21910l = Integer.toString(10, 36);
        f21911m = Integer.toString(11, 36);
        f21912n = Integer.toString(12, 36);
        f21913o = Integer.toString(13, 36);
        zzb = new RG0() { // from class: com.google.android.gms.internal.ads.PF
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4055qG.class.equals(obj.getClass())) {
            C4055qG c4055qG = (C4055qG) obj;
            if (AbstractC2281am0.zzG(this.zzc, c4055qG.zzc) && AbstractC2281am0.zzG(this.zze, c4055qG.zze) && AbstractC2281am0.zzG(null, null) && AbstractC2281am0.zzG(this.zzl, c4055qG.zzl) && this.zzf == c4055qG.zzf && this.zzg == c4055qG.zzg && this.zzh == c4055qG.zzh && this.zzi == c4055qG.zzi && this.zzj == c4055qG.zzj && this.zzm == c4055qG.zzm && this.zzo == c4055qG.zzo && this.zzp == c4055qG.zzp && this.zzq == c4055qG.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        C3306jk c3306jk = this.zzl;
        int iHashCode2 = ((iHashCode * 961) + (c3306jk == null ? 0 : c3306jk.hashCode())) * 31;
        long j8 = this.zzf;
        int i8 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.zzg;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.zzh;
        int i10 = ((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j11 = this.zzo;
        return ((((((i10 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final C4055qG zza(Object obj, C3658mp c3658mp, Object obj2, long j8, long j9, long j10, boolean z8, boolean z9, C3306jk c3306jk, long j11, long j12, int i8, int i9, long j13) {
        this.zzc = obj;
        this.zze = c3658mp == null ? f21900b : c3658mp;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z8;
        this.zzj = z9;
        this.zzk = c3306jk != null;
        this.zzl = c3306jk;
        this.zzn = 0L;
        this.zzo = j12;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        F10.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}
