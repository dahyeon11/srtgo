package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class RO0 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f16094a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f16095b;

    /* renamed from: c, reason: collision with root package name */
    private final SN0[] f16096c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f16097d;

    /* renamed from: e, reason: collision with root package name */
    private final int[][][] f16098e;

    /* renamed from: f, reason: collision with root package name */
    private final SN0 f16099f;

    RO0(String[] strArr, int[] iArr, SN0[] sn0Arr, int[] iArr2, int[][][] iArr3, SN0 sn0) {
        this.f16094a = strArr;
        this.f16095b = iArr;
        this.f16096c = sn0Arr;
        this.f16098e = iArr3;
        this.f16097d = iArr2;
        this.f16099f = sn0;
    }

    public final int zza(int i8, int i9, boolean z8) {
        int i10 = this.f16096c[i8].zzb(i9).zzb;
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            if ((this.f16098e[i8][i9][i13] & 7) == 4) {
                iArr[i12] = i13;
                i12++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
        String str = null;
        int i14 = 0;
        int iMin = 16;
        boolean z9 = false;
        while (i11 < iArrCopyOf.length) {
            String str2 = this.f16096c[i8].zzb(i9).zzb(iArrCopyOf[i11]).zzn;
            int i15 = i14 + 1;
            if (i14 == 0) {
                str = str2;
            } else {
                z9 |= !AbstractC2281am0.zzG(str, str2);
            }
            iMin = Math.min(iMin, this.f16098e[i8][i9][i11] & 24);
            i11++;
            i14 = i15;
        }
        return z9 ? Math.min(iMin, this.f16097d[i8]) : iMin;
    }

    public final int zzb(int i8, int i9, int i10) {
        return this.f16098e[i8][i9][i10];
    }

    public final int zzc(int i8) {
        return this.f16095b[i8];
    }

    public final SN0 zzd(int i8) {
        return this.f16096c[i8];
    }

    public final SN0 zze() {
        return this.f16099f;
    }
}
