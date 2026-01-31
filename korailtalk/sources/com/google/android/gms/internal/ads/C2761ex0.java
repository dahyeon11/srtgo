package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ex0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2761ex0 implements Ex0 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f18862d = new C2646dx0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f18863a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18864b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18865c;

    public C2761ex0(byte[] bArr, int i8) throws GeneralSecurityException {
        if (!Zr0.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        Kx0.zza(bArr.length);
        this.f18863a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f18862d.get()).getBlockSize();
        this.f18865c = blockSize;
        if (i8 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f18864b = i8;
    }

    @Override // com.google.android.gms.internal.ads.Ex0
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i8 = this.f18864b;
        if (length < i8) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        int i9 = this.f18864b;
        int i10 = length - i9;
        byte[] bArr3 = new byte[i10];
        Cipher cipher = (Cipher) f18862d.get();
        byte[] bArr4 = new byte[this.f18865c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f18864b);
        cipher.init(2, this.f18863a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i9, i10, bArr3, 0) == i10) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
