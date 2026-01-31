package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class Jr0 {

    /* renamed from: a, reason: collision with root package name */
    int[] f13699a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13700b;

    public Jr0(byte[] bArr, int i8) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f13699a = Fr0.e(bArr);
        this.f13700b = i8;
    }

    final ByteBuffer a(byte[] bArr, int i8) {
        int[] iArrZzb = zzb(Fr0.e(bArr), i8);
        int[] iArr = (int[]) iArrZzb.clone();
        Fr0.c(iArr);
        for (int i9 = 0; i9 < 16; i9++) {
            iArrZzb[i9] = iArrZzb[i9] + iArr[i9];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i8);

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer.remaining();
        int i8 = iRemaining / 64;
        for (int i9 = 0; i9 < i8 + 1; i9++) {
            ByteBuffer byteBufferA = a(bArr, this.f13700b + i9);
            if (i9 == i8) {
                AbstractC3447kx0.zza(byteBufferAllocate, byteBuffer, byteBufferA, iRemaining % 64);
            } else {
                AbstractC3447kx0.zza(byteBufferAllocate, byteBuffer, byteBufferA, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
