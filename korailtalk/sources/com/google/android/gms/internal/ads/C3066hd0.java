package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.hd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3066hd0 {

    /* renamed from: a, reason: collision with root package name */
    private int f19828a;

    /* renamed from: b, reason: collision with root package name */
    private int f19829b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f19830c;

    /* renamed from: d, reason: collision with root package name */
    private int f19831d;

    public C3066hd0() {
        throw null;
    }

    public final long zza() {
        if (this.f19829b != 0) {
            return this.f19830c[this.f19828a];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i8 = this.f19829b;
        if (i8 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f19830c;
        int i9 = this.f19828a;
        long j8 = jArr[i9];
        this.f19828a = this.f19831d & (i9 + 1);
        this.f19829b = i8 - 1;
        return j8;
    }

    public final void zzc() {
        this.f19828a = 0;
        this.f19829b = 0;
    }

    public final boolean zzd() {
        return this.f19829b == 0;
    }

    public C3066hd0(int i8) {
        int i9 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i9 = iHighestOneBit + iHighestOneBit;
        }
        this.f19828a = 0;
        this.f19829b = 0;
        this.f19830c = new long[i9];
        this.f19831d = r3.length - 1;
    }
}
