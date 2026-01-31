package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Uk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1968Uk0 {
    AbstractC1968Uk0() {
    }

    static int a(int i8, int i9) {
        int i10 = i8 + (i8 >> 1) + 1;
        if (i10 < i9) {
            int iHighestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    public abstract AbstractC1968Uk0 zzb(Object obj);
}
