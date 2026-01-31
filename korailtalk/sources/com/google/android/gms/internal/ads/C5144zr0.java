package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.zr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5144zr0 implements InterfaceC3885oo0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f24200c = Dx0.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f24201d = Dx0.zza("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f24202e = Dx0.zza("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f24203f = new C5030yr0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f24204a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f24205b;

    private C5144zr0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zze()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f24204a = new SecretKeySpec(bArr, "ChaCha20");
        this.f24205b = bArr2;
    }

    static Cipher a() {
        return (Cipher) f24203f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f24201d);
            byte[] bArr = f24200c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f24202e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static InterfaceC3885oo0 zzb(C3092hq0 c3092hq0) {
        return new C5144zr0(c3092hq0.zzd().zzd(AbstractC5024yo0.zza()), c3092hq0.zzc().zzc());
    }

    public static boolean zze() {
        return f24203f.get() != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f24205b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f24205b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f24203f.get();
        cipher.init(2, this.f24204a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, this.f24205b.length + 12, (r1 - r7) - 12);
    }
}
