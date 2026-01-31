package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ix0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219ix0 implements InterfaceC3885oo0 {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f20031f = new C2876fx0();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f20032g = new C3106hx0();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20033a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f20034b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f20035c;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKeySpec f20036d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20037e;

    private C3219ix0(byte[] bArr, int i8, byte[] bArr2) throws GeneralSecurityException {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i8 != 12 && i8 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f20037e = i8;
        Kx0.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f20036d = secretKeySpec;
        Cipher cipher = (Cipher) f20031f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrA = a(cipher.doFinal(new byte[16]));
        this.f20033a = bArrA;
        this.f20034b = a(bArrA);
        this.f20035c = bArr2;
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (i8 < 15) {
            byte b9 = bArr[i8];
            int i9 = i8 + 1;
            bArr2[i8] = (byte) (((b9 + b9) ^ ((bArr[i9] & 255) >>> 7)) & 255);
            i8 = i9;
        }
        byte b10 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b10 + b10));
        return bArr2;
    }

    private final byte[] b(Cipher cipher, int i8, byte[] bArr, int i9, int i10) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrD;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i8;
        if (i10 == 0) {
            return cipher.doFinal(d(bArr2, this.f20033a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i11 = 0;
        int i12 = 0;
        while (i10 - i12 > 16) {
            for (int i13 = 0; i13 < 16; i13++) {
                bArrDoFinal[i13] = (byte) (bArr[(i9 + i12) + i13] ^ bArrDoFinal[i13]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i12 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12 + i9, i9 + i10);
        if (bArrCopyOfRange.length == 16) {
            bArrD = d(bArrCopyOfRange, this.f20033a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f20034b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i11 >= length) {
                    break;
                }
                bArrCopyOf[i11] = (byte) (bArrCopyOf[i11] ^ bArrCopyOfRange[i11]);
                i11++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrD = bArrCopyOf;
        }
        return cipher.doFinal(d(bArrDoFinal, bArrD));
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i8 = (length - this.f20037e) - 16;
        if (i8 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f20031f.get();
        cipher.init(1, this.f20036d);
        byte[] bArrB = b(cipher, 0, bArr, 0, this.f20037e);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrB2 = b(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrB3 = b(cipher, 2, bArr, this.f20037e, i8);
        int i9 = length - 16;
        byte b9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b9 = (byte) (b9 | (((bArr[i9 + i10] ^ bArrB2[i10]) ^ bArrB[i10]) ^ bArrB3[i10]));
        }
        if (b9 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f20032g.get();
        cipher2.init(1, this.f20036d, new IvParameterSpec(bArrB));
        return cipher2.doFinal(bArr, this.f20037e, i8);
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr3[i8] = (byte) (bArr[i8] ^ bArr2[i8]);
        }
        return bArr3;
    }

    public static InterfaceC3885oo0 zzb(C4912xp0 c4912xp0) throws GeneralSecurityException {
        if (Zr0.zza(1)) {
            return new C3219ix0(c4912xp0.zzd().zzd(AbstractC5024yo0.zza()), c4912xp0.zzb().zzb(), c4912xp0.zzc().zzc());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f20035c;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f20035c;
        return c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
