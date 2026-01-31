package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
final class O3 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f14985d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14986a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f14987b;

    /* renamed from: c, reason: collision with root package name */
    private int f14988c;

    public static int zzb(int i8) {
        int i9 = 0;
        while (i9 < 8) {
            int i10 = i9 + 1;
            if ((f14985d[i9] & i8) != 0) {
                return i10;
            }
            i9 = i10;
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i8, boolean z8) {
        long j8 = bArr[0] & 255;
        if (z8) {
            j8 &= ~f14985d[i8 - 1];
        }
        for (int i9 = 1; i9 < i8; i9++) {
            j8 = (j8 << 8) | (bArr[i9] & 255);
        }
        return j8;
    }

    public final int zza() {
        return this.f14988c;
    }

    public final long zzd(InterfaceC2540d1 interfaceC2540d1, boolean z8, boolean z9, int i8) throws EOFException, InterruptedIOException {
        if (this.f14987b == 0) {
            if (!interfaceC2540d1.zzn(this.f14986a, 0, 1, z8)) {
                return -1L;
            }
            int iZzb = zzb(this.f14986a[0] & 255);
            this.f14988c = iZzb;
            if (iZzb == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14987b = 1;
        }
        int i9 = this.f14988c;
        if (i9 > i8) {
            this.f14987b = 0;
            return -2L;
        }
        if (i9 != 1) {
            ((Q0) interfaceC2540d1).zzn(this.f14986a, 1, i9 - 1, false);
        }
        this.f14987b = 0;
        return zzc(this.f14986a, this.f14988c, z9);
    }

    public final void zze() {
        this.f14987b = 0;
        this.f14988c = 0;
    }
}
