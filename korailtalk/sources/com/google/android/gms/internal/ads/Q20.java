package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Q20 implements M50 {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;

    public Q20(int i8, boolean z8, boolean z9, int i9, int i10, int i11, int i12, int i13, float f8, boolean z10) {
        this.zza = i8;
        this.zzb = z8;
        this.zzc = z9;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = f8;
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkV)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
    }
}
