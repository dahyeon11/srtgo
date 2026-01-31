package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class QG0 {

    /* renamed from: a, reason: collision with root package name */
    private final L2 f15760a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f15761b;

    public QG0(L2 l22, SparseArray sparseArray) {
        this.f15760a = l22;
        SparseArray sparseArray2 = new SparseArray(l22.zzb());
        for (int i8 = 0; i8 < l22.zzb(); i8++) {
            int iZza = l22.zza(i8);
            PG0 pg0 = (PG0) sparseArray.get(iZza);
            pg0.getClass();
            sparseArray2.append(iZza, pg0);
        }
        this.f15761b = sparseArray2;
    }

    public final int zza(int i8) {
        return this.f15760a.zza(i8);
    }

    public final int zzb() {
        return this.f15760a.zzb();
    }

    public final PG0 zzc(int i8) {
        PG0 pg0 = (PG0) this.f15761b.get(i8);
        pg0.getClass();
        return pg0;
    }

    public final boolean zzd(int i8) {
        return this.f15760a.zzc(i8);
    }
}
