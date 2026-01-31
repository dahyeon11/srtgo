package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Hp0 {

    /* renamed from: a */
    private Sp0 f13363a = null;

    /* renamed from: b */
    private Nx0 f13364b = null;

    /* renamed from: c */
    private Integer f13365c = null;

    /* synthetic */ Hp0(Gp0 gp0) {
    }

    public final Hp0 zza(Integer num) {
        this.f13365c = num;
        return this;
    }

    public final Hp0 zzb(Nx0 nx0) {
        this.f13364b = nx0;
        return this;
    }

    public final Hp0 zzc(Sp0 sp0) {
        this.f13363a = sp0;
        return this;
    }

    public final Jp0 zzd() throws GeneralSecurityException {
        Nx0 nx0;
        Mx0 mx0Zzb;
        Sp0 sp0 = this.f13363a;
        if (sp0 == null || (nx0 = this.f13364b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (sp0.zzb() != nx0.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (sp0.zza() && this.f13365c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f13363a.zza() && this.f13365c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f13363a.zzd() == Qp0.zzc) {
            mx0Zzb = Ks0.zza;
        } else if (this.f13363a.zzd() == Qp0.zzb) {
            mx0Zzb = Ks0.zza(this.f13365c.intValue());
        } else {
            if (this.f13363a.zzd() != Qp0.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f13363a.zzd())));
            }
            mx0Zzb = Ks0.zzb(this.f13365c.intValue());
        }
        return new Jp0(this.f13363a, this.f13364b, mx0Zzb, this.f13365c, null);
    }
}
