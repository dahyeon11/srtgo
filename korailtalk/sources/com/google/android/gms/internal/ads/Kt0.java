package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class Kt0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f13868a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f13869b = null;

    /* renamed from: c, reason: collision with root package name */
    private Lt0 f13870c = Lt0.zzd;

    /* synthetic */ Kt0(Jt0 jt0) {
    }

    public final Kt0 zza(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i8 * 8)));
        }
        this.f13868a = Integer.valueOf(i8);
        return this;
    }

    public final Kt0 zzb(int i8) throws GeneralSecurityException {
        if (i8 >= 10 && i8 <= 16) {
            this.f13869b = Integer.valueOf(i8);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i8);
    }

    public final Kt0 zzc(Lt0 lt0) {
        this.f13870c = lt0;
        return this;
    }

    public final Nt0 zzd() throws GeneralSecurityException {
        Integer num = this.f13868a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f13869b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f13870c != null) {
            return new Nt0(num.intValue(), this.f13869b.intValue(), this.f13870c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
