package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vp0 */
/* loaded from: classes2.dex */
public final class C4684vp0 {

    /* renamed from: a */
    private Fp0 f23326a = null;

    /* renamed from: b */
    private Nx0 f23327b = null;

    /* renamed from: c */
    private Integer f23328c = null;

    /* synthetic */ C4684vp0(AbstractC4570up0 abstractC4570up0) {
    }

    public final C4684vp0 zza(Integer num) {
        this.f23328c = num;
        return this;
    }

    public final C4684vp0 zzb(Nx0 nx0) {
        this.f23327b = nx0;
        return this;
    }

    public final C4684vp0 zzc(Fp0 fp0) {
        this.f23326a = fp0;
        return this;
    }

    public final C4912xp0 zzd() throws GeneralSecurityException {
        Nx0 nx0;
        Mx0 mx0Zzb;
        Fp0 fp0 = this.f23326a;
        if (fp0 == null || (nx0 = this.f23327b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (fp0.zzc() != nx0.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (fp0.zza() && this.f23328c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f23326a.zza() && this.f23328c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f23326a.zze() == Dp0.zzc) {
            mx0Zzb = Ks0.zza;
        } else if (this.f23326a.zze() == Dp0.zzb) {
            mx0Zzb = Ks0.zza(this.f23328c.intValue());
        } else {
            if (this.f23326a.zze() != Dp0.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f23326a.zze())));
            }
            mx0Zzb = Ks0.zzb(this.f23328c.intValue());
        }
        return new C4912xp0(this.f23326a, this.f23327b, mx0Zzb, this.f23328c, null);
    }
}
