package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class Qr0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f16022a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16023b;

    private Qr0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zzc()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f16022a = bArr;
        this.f16023b = bArr2;
    }

    public static InterfaceC3885oo0 zzb(Wq0 wq0) {
        return new Qr0(wq0.zzd().zzd(AbstractC5024yo0.zza()), wq0.zzc().zzc());
    }

    public static boolean zzc() {
        return C5144zr0.a() != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f16023b;
        if (bArr.length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f16023b.length, bArr4, 0, 24);
        int[] iArrD = Fr0.d(Fr0.e(this.f16022a), Fr0.e(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrD.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher cipherA = C5144zr0.a();
        cipherA.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        return cipherA.doFinal(bArr, this.f16023b.length + 24, (r1 - r10) - 24);
    }
}
