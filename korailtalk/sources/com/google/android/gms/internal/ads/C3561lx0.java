package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.lx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3561lx0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Kr0 f20794a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f20795b;

    private C3561lx0(byte[] bArr, byte[] bArr2) {
        this.f20794a = new Kr0(bArr);
        this.f20795b = bArr2;
    }

    private final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f20794a.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public static InterfaceC3885oo0 zzb(C3092hq0 c3092hq0) {
        return new C3561lx0(c3092hq0.zzd().zzd(AbstractC5024yo0.zza()), c3092hq0.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f20795b;
        if (bArr3.length == 0) {
            return a(bArr, bArr2);
        }
        if (!At0.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f20795b;
        return a(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
