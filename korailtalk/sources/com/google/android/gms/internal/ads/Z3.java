package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class Z3 extends C2317b4 {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public Z3(int i8, long j8) {
        super(i8);
        this.zza = j8;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.C2317b4
    public final String toString() {
        List list = this.zzb;
        return C2317b4.zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final Z3 zza(int i8) {
        int size = this.zzc.size();
        for (int i9 = 0; i9 < size; i9++) {
            Z3 z32 = (Z3) this.zzc.get(i9);
            if (z32.zzd == i8) {
                return z32;
            }
        }
        return null;
    }

    public final C2202a4 zzb(int i8) {
        int size = this.zzb.size();
        for (int i9 = 0; i9 < size; i9++) {
            C2202a4 c2202a4 = (C2202a4) this.zzb.get(i9);
            if (c2202a4.zzd == i8) {
                return c2202a4;
            }
        }
        return null;
    }

    public final void zzc(Z3 z32) {
        this.zzc.add(z32);
    }

    public final void zzd(C2202a4 c2202a4) {
        this.zzb.add(c2202a4);
    }
}
