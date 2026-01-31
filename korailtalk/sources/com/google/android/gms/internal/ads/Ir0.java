package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ir0 extends Jr0 {
    public Ir0(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.Jr0
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.Jr0
    public final int[] zzb(int[] iArr, int i8) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        Fr0.b(iArr2, this.f13699a);
        iArr2[12] = i8;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
