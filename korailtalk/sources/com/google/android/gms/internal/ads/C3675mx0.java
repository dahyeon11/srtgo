package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.mx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3675mx0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ex0 f21044a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1689No0 f21045b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21046c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f21047d;

    private C3675mx0(Ex0 ex0, InterfaceC1689No0 interfaceC1689No0, int i8, byte[] bArr) {
        this.f21044a = ex0;
        this.f21045b = interfaceC1689No0;
        this.f21046c = i8;
        this.f21047d = bArr;
    }

    public static InterfaceC3885oo0 zzb(C3204ip0 c3204ip0) {
        C2761ex0 c2761ex0 = new C2761ex0(c3204ip0.zzd().zzd(AbstractC5024yo0.zza()), c3204ip0.zzb().zzd());
        String strValueOf = String.valueOf(c3204ip0.zzb().zzg());
        return new C3675mx0(c2761ex0, new Jx0(new Ix0("HMAC".concat(strValueOf), new SecretKeySpec(c3204ip0.zze().zzd(AbstractC5024yo0.zza()), "HMAC")), c3204ip0.zzb().zze()), c3204ip0.zzb().zze(), c3204ip0.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f21047d;
        int i8 = this.f21046c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i8 + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f21047d.length, length2 - this.f21046c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.f21046c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((Jx0) this.f21045b).zzc(AbstractC3447kx0.zzb(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.f21044a.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
