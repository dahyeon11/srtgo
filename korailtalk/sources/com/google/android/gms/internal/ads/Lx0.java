package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Lx0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Nr0 f14382a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14383b;

    private Lx0(byte[] bArr, byte[] bArr2) {
        this.f14382a = new Nr0(bArr);
        this.f14383b = bArr2;
    }

    private final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f14382a.zzb(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public static InterfaceC3885oo0 zzb(Wq0 wq0) {
        return new Lx0(wq0.zzd().zzd(AbstractC5024yo0.zza()), wq0.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14383b;
        if (bArr3.length == 0) {
            return a(bArr, bArr2);
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f14383b;
        return a(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
