package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Z1 implements T1 {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private Z1(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.zza = i8;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
    }

    public static Z1 zzb(C4099qh0 c4099qh0) {
        int iZzi = c4099qh0.zzi();
        c4099qh0.zzL(12);
        int iZzi2 = c4099qh0.zzi();
        int iZzi3 = c4099qh0.zzi();
        int iZzi4 = c4099qh0.zzi();
        c4099qh0.zzL(4);
        int iZzi5 = c4099qh0.zzi();
        int iZzi6 = c4099qh0.zzi();
        c4099qh0.zzL(8);
        return new Z1(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6);
    }

    @Override // com.google.android.gms.internal.ads.T1
    public final int zza() {
        return 1752331379;
    }
}
