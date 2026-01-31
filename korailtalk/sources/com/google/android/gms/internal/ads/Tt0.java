package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Tt0 {

    /* renamed from: a, reason: collision with root package name */
    private C3100hu0 f16537a = null;

    /* renamed from: b, reason: collision with root package name */
    private Nx0 f16538b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f16539c = null;

    /* synthetic */ Tt0(St0 st0) {
    }

    public final Tt0 zza(Integer num) {
        this.f16539c = num;
        return this;
    }

    public final Tt0 zzb(Nx0 nx0) {
        this.f16538b = nx0;
        return this;
    }

    public final Tt0 zzc(C3100hu0 c3100hu0) {
        this.f16537a = c3100hu0;
        return this;
    }

    public final Vt0 zzd() throws GeneralSecurityException {
        Nx0 nx0;
        Mx0 mx0Zza;
        C3100hu0 c3100hu0 = this.f16537a;
        if (c3100hu0 == null || (nx0 = this.f16538b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c3100hu0.zzc() != nx0.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c3100hu0.zza() && this.f16539c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f16537a.zza() && this.f16539c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f16537a.zzg() == C2870fu0.zzd) {
            mx0Zza = Ks0.zza;
        } else if (this.f16537a.zzg() == C2870fu0.zzc || this.f16537a.zzg() == C2870fu0.zzb) {
            mx0Zza = Ks0.zza(this.f16539c.intValue());
        } else {
            if (this.f16537a.zzg() != C2870fu0.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f16537a.zzg())));
            }
            mx0Zza = Ks0.zzb(this.f16539c.intValue());
        }
        return new Vt0(this.f16537a, this.f16538b, mx0Zza, this.f16539c, null);
    }
}
