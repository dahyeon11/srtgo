package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.jx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3333jx0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f20337a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f20338b;

    private C3333jx0(byte[] bArr, Mx0 mx0) throws GeneralSecurityException {
        if (!Zr0.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        Kx0.zza(bArr.length);
        this.f20337a = new SecretKeySpec(bArr, "AES");
        this.f20338b = mx0.zzc();
    }

    public static InterfaceC3885oo0 zzb(Jp0 jp0) {
        return new C3333jx0(jp0.zzd().zzd(AbstractC5024yo0.zza()), jp0.zzc());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f20338b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f20338b.length, bArr4, 0, 12);
        int i8 = Hr0.zza;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr4, 0, 12);
        SecretKey secretKey = this.f20337a;
        Cipher cipherZza = Hr0.zza();
        cipherZza.init(2, secretKey, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, 12 + this.f20338b.length, (r2 - r8) - 12);
    }
}
