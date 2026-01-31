package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4902xk0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f23780a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f23781b;

    /* renamed from: c, reason: collision with root package name */
    private int f23782c;

    /* renamed from: d, reason: collision with root package name */
    private int f23783d;

    public C4902xk0() {
        throw null;
    }

    private final Object a() {
        F10.zzf(this.f23783d > 0);
        Object[] objArr = this.f23781b;
        int i8 = this.f23782c;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f23782c = (i8 + 1) % objArr.length;
        this.f23783d--;
        return obj;
    }

    public final synchronized int zza() {
        return this.f23783d;
    }

    public final synchronized Object zzb() {
        if (this.f23783d == 0) {
            return null;
        }
        return a();
    }

    public final synchronized Object zzc(long j8) {
        Object objA;
        objA = null;
        while (this.f23783d > 0 && j8 - this.f23780a[this.f23782c] >= 0) {
            objA = a();
        }
        return objA;
    }

    public final synchronized void zzd(long j8, Object obj) {
        try {
            if (this.f23783d > 0) {
                if (j8 <= this.f23780a[((this.f23782c + r0) - 1) % this.f23781b.length]) {
                    zze();
                }
            }
            int length = this.f23781b.length;
            if (this.f23783d >= length) {
                int i8 = length + length;
                long[] jArr = new long[i8];
                Object[] objArr = new Object[i8];
                int i9 = this.f23782c;
                int i10 = length - i9;
                System.arraycopy(this.f23780a, i9, jArr, 0, i10);
                System.arraycopy(this.f23781b, this.f23782c, objArr, 0, i10);
                int i11 = this.f23782c;
                if (i11 > 0) {
                    System.arraycopy(this.f23780a, 0, jArr, i10, i11);
                    System.arraycopy(this.f23781b, 0, objArr, i10, this.f23782c);
                }
                this.f23780a = jArr;
                this.f23781b = objArr;
                this.f23782c = 0;
            }
            int i12 = this.f23782c;
            int i13 = this.f23783d;
            Object[] objArr2 = this.f23781b;
            int length2 = (i12 + i13) % objArr2.length;
            this.f23780a[length2] = j8;
            objArr2[length2] = obj;
            this.f23783d = i13 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zze() {
        this.f23782c = 0;
        this.f23783d = 0;
        Arrays.fill(this.f23781b, (Object) null);
    }

    public C4902xk0(int i8) {
        this.f23780a = new long[10];
        this.f23781b = new Object[10];
    }
}
