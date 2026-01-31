package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3658mp {
    public final String zzc;
    public final C1478Il zzd;

    @Deprecated
    public final C1478Il zze;
    public final C3306jk zzf;
    public final C3550ls zzg;
    public final C1419Hc zzh;

    @Deprecated
    public final C1462Id zzi;
    public final C3540ln zzj;
    public static final C3658mp zza = new C4881xa().zzc();

    /* renamed from: a, reason: collision with root package name */
    private static final String f20986a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f20987b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f20988c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f20989d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f20990e = Integer.toString(4, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f20991f = Integer.toString(5, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.U8
    };

    /* synthetic */ C3658mp(String str, C1462Id c1462Id, C1478Il c1478Il, C3306jk c3306jk, C3550ls c3550ls, C3540ln c3540ln, AbstractC1647Mo abstractC1647Mo) {
        this.zzc = str;
        this.zzd = c1478Il;
        this.zze = c1478Il;
        this.zzf = c3306jk;
        this.zzg = c3550ls;
        this.zzh = c1462Id;
        this.zzi = c1462Id;
        this.zzj = c3540ln;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3658mp)) {
            return false;
        }
        C3658mp c3658mp = (C3658mp) obj;
        return AbstractC2281am0.zzG(this.zzc, c3658mp.zzc) && this.zzh.equals(c3658mp.zzh) && AbstractC2281am0.zzG(this.zzd, c3658mp.zzd) && AbstractC2281am0.zzG(this.zzf, c3658mp.zzf) && AbstractC2281am0.zzG(this.zzg, c3658mp.zzg) && AbstractC2281am0.zzG(this.zzj, c3658mp.zzj);
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() * 31;
        C1478Il c1478Il = this.zzd;
        return (((((((iHashCode + (c1478Il != null ? c1478Il.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
