package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class OO0 {
    public final TH zza;
    public final int[] zzb;

    public OO0(TH th, int[] iArr, int i8) {
        if (iArr.length == 0) {
            AbstractC2834fc0.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = th;
        this.zzb = iArr;
    }
}
