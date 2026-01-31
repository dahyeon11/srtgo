package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class Fx0 implements Uu0 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f13085a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f13086b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13087c;

    public Fx0(byte[] bArr) throws GeneralSecurityException {
        Kx0.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f13085a = secretKeySpec;
        Cipher cipherA = a();
        cipherA.init(1, secretKeySpec);
        byte[] bArrZza = Au0.zza(cipherA.doFinal(new byte[16]));
        this.f13086b = bArrZza;
        this.f13087c = Au0.zza(bArrZza);
    }

    private static Cipher a() throws GeneralSecurityException {
        if (Zr0.zza(1)) {
            return (Cipher) C4586ux0.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.Uu0
    public final byte[] zza(byte[] bArr, int i8) throws GeneralSecurityException {
        byte[] bArrZzc;
        if (i8 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f13085a;
        Cipher cipherA = a();
        cipherA.init(1, secretKey);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(length / 16.0d));
        int i9 = iMax - 1;
        int i10 = i9 * 16;
        if (iMax * 16 == length) {
            bArrZzc = AbstractC3447kx0.zzd(bArr, i10, this.f13086b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrZzc = AbstractC3447kx0.zzc(bArrCopyOf, this.f13087c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < i9; i11++) {
            bArrDoFinal = cipherA.doFinal(AbstractC3447kx0.zzd(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherA.doFinal(AbstractC3447kx0.zzc(bArrZzc, bArrDoFinal)), i8);
    }
}
