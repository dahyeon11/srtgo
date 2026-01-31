package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Mr0 extends Jr0 {
    public Mr0(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.Jr0
    final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.Jr0
    final int[] zzb(int[] iArr, int i8) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        Fr0.b(iArr2, Fr0.d(this.f13699a, iArr));
        iArr2[12] = i8;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
