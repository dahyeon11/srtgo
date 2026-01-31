package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Ct0 {

    /* renamed from: a, reason: collision with root package name */
    private Nt0 f12588a = null;

    /* renamed from: b, reason: collision with root package name */
    private Nx0 f12589b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f12590c = null;

    /* synthetic */ Ct0(Bt0 bt0) {
    }

    public final Ct0 zza(Nx0 nx0) {
        this.f12589b = nx0;
        return this;
    }

    public final Ct0 zzb(Integer num) {
        this.f12590c = num;
        return this;
    }

    public final Ct0 zzc(Nt0 nt0) {
        this.f12588a = nt0;
        return this;
    }

    public final Et0 zzd() throws GeneralSecurityException {
        Nx0 nx0;
        Mx0 mx0Zza;
        Nt0 nt0 = this.f12588a;
        if (nt0 == null || (nx0 = this.f12589b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nt0.zzc() != nx0.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (nt0.zza() && this.f12590c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f12588a.zza() && this.f12590c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f12588a.zzf() == Lt0.zzd) {
            mx0Zza = Ks0.zza;
        } else if (this.f12588a.zzf() == Lt0.zzc || this.f12588a.zzf() == Lt0.zzb) {
            mx0Zza = Ks0.zza(this.f12590c.intValue());
        } else {
            if (this.f12588a.zzf() != Lt0.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f12588a.zzf())));
            }
            mx0Zza = Ks0.zzb(this.f12590c.intValue());
        }
        return new Et0(this.f12588a, this.f12589b, mx0Zza, this.f12590c, null);
    }
}
