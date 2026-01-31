package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Vp0 {

    /* renamed from: a */
    private C2977gq0 f16897a = null;

    /* renamed from: b */
    private Nx0 f16898b = null;

    /* renamed from: c */
    private Integer f16899c = null;

    /* synthetic */ Vp0(Up0 up0) {
    }

    public final Vp0 zza(Integer num) {
        this.f16899c = num;
        return this;
    }

    public final Vp0 zzb(Nx0 nx0) {
        this.f16898b = nx0;
        return this;
    }

    public final Vp0 zzc(C2977gq0 c2977gq0) {
        this.f16897a = c2977gq0;
        return this;
    }

    public final Xp0 zzd() throws GeneralSecurityException {
        Nx0 nx0;
        Mx0 mx0Zzb;
        C2977gq0 c2977gq0 = this.f16897a;
        if (c2977gq0 == null || (nx0 = this.f16898b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2977gq0.zzb() != nx0.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c2977gq0.zza() && this.f16899c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f16897a.zza() && this.f16899c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f16897a.zzd() == C2747eq0.zzc) {
            mx0Zzb = Ks0.zza;
        } else if (this.f16897a.zzd() == C2747eq0.zzb) {
            mx0Zzb = Ks0.zza(this.f16899c.intValue());
        } else {
            if (this.f16897a.zzd() != C2747eq0.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f16897a.zzd())));
            }
            mx0Zzb = Ks0.zzb(this.f16899c.intValue());
        }
        return new Xp0(this.f16897a, this.f16898b, mx0Zzb, this.f16899c, null);
    }
}
