package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Gc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1379Gc0 {

    /* renamed from: a, reason: collision with root package name */
    private int f13177a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f13178b;

    public C1379Gc0() {
        throw null;
    }

    public final int zza() {
        return this.f13177a;
    }

    public final long zzb(int i8) {
        if (i8 >= 0 && i8 < this.f13177a) {
            return this.f13178b[i8];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i8 + ", size is " + this.f13177a);
    }

    public final void zzc(long j8) {
        int i8 = this.f13177a;
        long[] jArr = this.f13178b;
        if (i8 == jArr.length) {
            this.f13178b = Arrays.copyOf(jArr, i8 + i8);
        }
        long[] jArr2 = this.f13178b;
        int i9 = this.f13177a;
        this.f13177a = i9 + 1;
        jArr2[i9] = j8;
    }

    public C1379Gc0(int i8) {
        this.f13178b = new long[32];
    }
}
