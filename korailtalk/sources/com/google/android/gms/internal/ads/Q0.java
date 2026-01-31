package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q0 implements InterfaceC2540d1 {

    /* renamed from: b, reason: collision with root package name */
    private final UL0 f15677b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15678c;

    /* renamed from: d, reason: collision with root package name */
    private long f15679d;

    /* renamed from: f, reason: collision with root package name */
    private int f15681f;

    /* renamed from: g, reason: collision with root package name */
    private int f15682g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f15680e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15676a = new byte[4096];

    static {
        AbstractC1609Lp.zzb("media3.extractor");
    }

    public Q0(UL0 ul0, long j8, long j9) {
        this.f15677b = ul0;
        this.f15679d = j8;
        this.f15678c = j9;
    }

    private final int a(byte[] bArr, int i8, int i9) {
        int i10 = this.f15682g;
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, i9);
        System.arraycopy(this.f15680e, 0, bArr, i8, iMin);
        f(iMin);
        return iMin;
    }

    private final int b(byte[] bArr, int i8, int i9, int i10, boolean z8) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.f15677b.zza(bArr, i8 + i10, i9 - i10);
        if (iZza != -1) {
            return i10 + iZza;
        }
        if (i10 == 0 && z8) {
            return -1;
        }
        throw new EOFException();
    }

    private final int c(int i8) {
        int iMin = Math.min(this.f15682g, i8);
        f(iMin);
        return iMin;
    }

    private final void d(int i8) {
        if (i8 != -1) {
            this.f15679d += i8;
        }
    }

    private final void e(int i8) {
        int i9 = this.f15681f + i8;
        int length = this.f15680e.length;
        if (i9 > length) {
            this.f15680e = Arrays.copyOf(this.f15680e, Math.max(65536 + i9, Math.min(length + length, i9 + 524288)));
        }
    }

    private final void f(int i8) {
        int i9 = this.f15682g - i8;
        this.f15682g = i9;
        this.f15681f = 0;
        byte[] bArr = this.f15680e;
        byte[] bArr2 = i9 < bArr.length + (-524288) ? new byte[65536 + i9] : bArr;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        this.f15680e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        int iA = a(bArr, i8, i9);
        if (iA == 0) {
            iA = b(bArr, i8, i9, 0, true);
        }
        d(iA);
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final int zzb(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        int iMin;
        e(i9);
        int i10 = this.f15682g;
        int i11 = this.f15681f;
        int i12 = i10 - i11;
        if (i12 == 0) {
            iMin = b(this.f15680e, i11, i9, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f15682g += iMin;
        } else {
            iMin = Math.min(i9, i12);
        }
        System.arraycopy(this.f15680e, this.f15681f, bArr, i8, iMin);
        this.f15681f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final int zzc(int i8) throws EOFException, InterruptedIOException {
        int iC = c(1);
        if (iC == 0) {
            iC = b(this.f15676a, 0, Math.min(1, 4096), 0, true);
        }
        d(iC);
        return iC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final long zzd() {
        return this.f15678c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final long zze() {
        return this.f15679d + this.f15681f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final long zzf() {
        return this.f15679d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzg(int i8) throws EOFException, InterruptedIOException {
        zzl(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzh(byte[] bArr, int i8, int i9) {
        zzm(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzi(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        zzn(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzj() {
        this.f15681f = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzk(int i8) throws EOFException, InterruptedIOException {
        zzo(i8, false);
    }

    public final boolean zzl(int i8, boolean z8) throws EOFException, InterruptedIOException {
        e(i8);
        int iB = this.f15682g - this.f15681f;
        while (iB < i8) {
            iB = b(this.f15680e, this.f15681f, i8, iB, z8);
            if (iB == -1) {
                return false;
            }
            this.f15682g = this.f15681f + iB;
        }
        this.f15681f += i8;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final boolean zzm(byte[] bArr, int i8, int i9, boolean z8) {
        if (!zzl(i9, z8)) {
            return false;
        }
        System.arraycopy(this.f15680e, this.f15681f - i9, bArr, i8, i9);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final boolean zzn(byte[] bArr, int i8, int i9, boolean z8) throws EOFException, InterruptedIOException {
        int iA = a(bArr, i8, i9);
        while (iA < i9 && iA != -1) {
            iA = b(bArr, i8, i9, iA, z8);
        }
        d(iA);
        return iA != -1;
    }

    public final boolean zzo(int i8, boolean z8) throws EOFException, InterruptedIOException {
        int iC = c(i8);
        while (iC < i8 && iC != -1) {
            iC = b(this.f15676a, -iC, Math.min(i8, iC + 4096), iC, false);
        }
        d(iC);
        return iC != -1;
    }
}
