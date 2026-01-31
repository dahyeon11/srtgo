package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class GM0 extends BM0 {
    public static final Object zzd = new Object();

    /* renamed from: e */
    private final Object f13137e;

    /* renamed from: f */
    private final Object f13138f;

    private GM0(RG rg, Object obj, Object obj2) {
        super(rg);
        this.f13137e = obj;
        this.f13138f = obj2;
    }

    public static GM0 zzq(C3658mp c3658mp) {
        return new GM0(new HM0(c3658mp), C4055qG.zza, zzd);
    }

    public static GM0 zzr(RG rg, Object obj, Object obj2) {
        return new GM0(rg, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.BM0, com.google.android.gms.internal.ads.RG
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.f13138f) != null) {
            obj = obj2;
        }
        return this.f12272d.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.BM0, com.google.android.gms.internal.ads.RG
    public final C3711nF zzd(int i8, C3711nF c3711nF, boolean z8) {
        this.f12272d.zzd(i8, c3711nF, z8);
        if (AbstractC2281am0.zzG(c3711nF.zzc, this.f13138f) && z8) {
            c3711nF.zzc = zzd;
        }
        return c3711nF;
    }

    @Override // com.google.android.gms.internal.ads.BM0, com.google.android.gms.internal.ads.RG
    public final C4055qG zze(int i8, C4055qG c4055qG, long j8) {
        this.f12272d.zze(i8, c4055qG, j8);
        if (AbstractC2281am0.zzG(c4055qG.zzc, this.f13137e)) {
            c4055qG.zzc = C4055qG.zza;
        }
        return c4055qG;
    }

    @Override // com.google.android.gms.internal.ads.BM0, com.google.android.gms.internal.ads.RG
    public final Object zzf(int i8) {
        Object objZzf = this.f12272d.zzf(i8);
        return AbstractC2281am0.zzG(objZzf, this.f13138f) ? zzd : objZzf;
    }

    public final GM0 zzp(RG rg) {
        return new GM0(rg, this.f13137e, this.f13138f);
    }
}
