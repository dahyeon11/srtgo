package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class Yr0 implements InterfaceC3885oo0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f17433c = Dx0.zza("7a806c");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f17434d = Dx0.zza("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f17435e = Dx0.zza("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f17436f = Dx0.zza("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f17437g = Dx0.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f17438h = new Xr0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f17439a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f17440b;

    private Yr0(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f17440b = bArr2;
        Kx0.zza(bArr.length);
        this.f17439a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec b(byte[] bArr, int i8, int i9) {
        return new GCMParameterSpec(128, bArr, 0, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = f17436f;
            cipher.init(2, new SecretKeySpec(f17435e, "AES"), b(bArr, 0, bArr.length));
            cipher.updateAAD(f17434d);
            byte[] bArr2 = f17437g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f17433c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f17438h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f17439a, b(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    public static InterfaceC3885oo0 zzb(Xp0 xp0) {
        return new Yr0(xp0.zzd().zzd(AbstractC5024yo0.zza()), xp0.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f17440b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f17440b;
        return d(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
