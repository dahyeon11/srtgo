package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WO0 {
    public final int zza;
    public final HG0[] zzb;
    public final PO0[] zzc;
    public final CN zzd;
    public final Object zze;

    public WO0(HG0[] hg0Arr, PO0[] po0Arr, CN cn, Object obj) {
        this.zzb = hg0Arr;
        this.zzc = (PO0[]) po0Arr.clone();
        this.zzd = cn;
        this.zze = obj;
        this.zza = hg0Arr.length;
    }

    public final boolean zza(WO0 wo0, int i8) {
        return wo0 != null && AbstractC2281am0.zzG(this.zzb[i8], wo0.zzb[i8]) && AbstractC2281am0.zzG(this.zzc[i8], wo0.zzc[i8]);
    }

    public final boolean zzb(int i8) {
        return this.zzb[i8] != null;
    }
}
