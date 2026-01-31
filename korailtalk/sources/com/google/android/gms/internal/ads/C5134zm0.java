package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5134zm0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final C5134zm0 f24196c = new C5134zm0(new int[0], 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f24197a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24198b;

    private C5134zm0(int[] iArr, int i8, int i9) {
        this.f24197a = iArr;
        this.f24198b = i9;
    }

    public static C5134zm0 zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new C5134zm0(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public static C5134zm0 zzc() {
        return f24196c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5134zm0)) {
            return false;
        }
        C5134zm0 c5134zm0 = (C5134zm0) obj;
        if (this.f24198b != c5134zm0.f24198b) {
            return false;
        }
        for (int i8 = 0; i8 < this.f24198b; i8++) {
            if (zza(i8) != c5134zm0.zza(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f24198b; i9++) {
            i8 = (i8 * 31) + this.f24197a[i9];
        }
        return i8;
    }

    public final String toString() {
        int i8 = this.f24198b;
        if (i8 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i8 * 5);
        sb.append('[');
        sb.append(this.f24197a[0]);
        for (int i9 = 1; i9 < this.f24198b; i9++) {
            sb.append(", ");
            sb.append(this.f24197a[i9]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zza(int i8) {
        AbstractC1188Bj0.zza(i8, this.f24198b, "index");
        return this.f24197a[i8];
    }
}
