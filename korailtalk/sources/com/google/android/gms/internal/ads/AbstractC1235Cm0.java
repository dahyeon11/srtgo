package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Cm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1235Cm0 extends AbstractC1276Dm0 {
    static /* bridge */ /* synthetic */ int a(int[] iArr, int i8, int i9, int i10) {
        while (i9 < i10) {
            if (iArr[i9] == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int zzb(long j8) {
        int i8 = (int) j8;
        AbstractC1188Bj0.zzg(((long) i8) == j8, "Out of range: %s", j8);
        return i8;
    }

    public static int zzc(int i8, int i9, int i10) {
        AbstractC1188Bj0.zzh(true, "min (%s) must be less than or equal to max (%s)", i9, s7.x.MAX_CAPACITY_MASK);
        return Math.min(Math.max(i8, i9), s7.x.MAX_CAPACITY_MASK);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        AbstractC1188Bj0.zzh(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << AbstractC5358c.CAN) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static List zzf(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new C1153Am0(iArr, 0, length);
    }

    public static int[] zzg(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            Object obj = array[i8];
            obj.getClass();
            iArr[i8] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
