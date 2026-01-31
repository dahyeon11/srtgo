package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class JN0 {

    /* renamed from: a, reason: collision with root package name */
    private final Random f13632a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f13633b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f13634c;

    public JN0(int i8) {
        this(0, new Random());
    }

    public final int zza() {
        int[] iArr = this.f13633b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] iArr = this.f13633b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zzc() {
        return this.f13633b.length;
    }

    public final int zzd(int i8) {
        int i9 = this.f13634c[i8] + 1;
        int[] iArr = this.f13633b;
        if (i9 < iArr.length) {
            return iArr[i9];
        }
        return -1;
    }

    public final int zze(int i8) {
        int i9 = this.f13634c[i8] - 1;
        if (i9 >= 0) {
            return this.f13633b[i9];
        }
        return -1;
    }

    public final JN0 zzf() {
        return new JN0(0, new Random(this.f13632a.nextLong()));
    }

    public final JN0 zzg(int i8, int i9) {
        int[] iArr = new int[i9];
        int[] iArr2 = new int[i9];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i9) {
            iArr[i11] = this.f13632a.nextInt(this.f13633b.length + 1);
            int i12 = i11 + 1;
            int iNextInt = this.f13632a.nextInt(i12);
            iArr2[i11] = iArr2[iNextInt];
            iArr2[iNextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f13633b.length + i9];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr4 = this.f13633b;
            if (i10 >= iArr4.length + i9) {
                return new JN0(iArr3, new Random(this.f13632a.nextLong()));
            }
            if (i13 >= i9 || i14 != iArr[i13]) {
                int i15 = i14 + 1;
                int i16 = iArr4[i14];
                iArr3[i10] = i16;
                if (i16 >= 0) {
                    iArr3[i10] = i16 + i9;
                }
                i14 = i15;
            } else {
                iArr3[i10] = iArr2[i13];
                i13++;
            }
            i10++;
        }
    }

    public final JN0 zzh(int i8, int i9) {
        int[] iArr = new int[this.f13633b.length - i9];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f13633b;
            if (i10 >= iArr2.length) {
                return new JN0(iArr, new Random(this.f13632a.nextLong()));
            }
            int i12 = iArr2[i10];
            if (i12 < 0 || i12 >= i9) {
                int i13 = i10 - i11;
                if (i12 >= 0) {
                    i12 -= i9;
                }
                iArr[i13] = i12;
            } else {
                i11++;
            }
            i10++;
        }
    }

    private JN0(int i8, Random random) {
        this(new int[0], random);
    }

    private JN0(int[] iArr, Random random) {
        this.f13633b = iArr;
        this.f13632a = random;
        this.f13634c = new int[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f13634c[iArr[i8]] = i8;
        }
    }
}
