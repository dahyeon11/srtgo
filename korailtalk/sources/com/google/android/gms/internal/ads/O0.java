package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class O0 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f14979a;
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;

    public O0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.f14979a = 0L;
        } else {
            int i8 = length - 1;
            this.f14979a = jArr2[i8] + jArr3[i8];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        return "ChunkIndex(length=" + this.zza + ", sizes=" + Arrays.toString(this.zzb) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f14979a;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        long[] jArr = this.zze;
        int iZzc = AbstractC2281am0.zzc(jArr, j8, true, true);
        D1 d12 = new D1(jArr[iZzc], this.zzc[iZzc]);
        if (d12.zzb >= j8 || iZzc == this.zza - 1) {
            return new A1(d12, d12);
        }
        int i8 = iZzc + 1;
        return new A1(d12, new D1(this.zze[i8], this.zzc[i8]));
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
