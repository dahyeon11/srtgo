package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gp0 */
/* loaded from: classes2.dex */
public final class C2975gp0 {

    /* renamed from: a */
    private C4456tp0 f19405a = null;

    /* renamed from: b */
    private Nx0 f19406b = null;

    /* renamed from: c */
    private Nx0 f19407c = null;

    /* renamed from: d */
    private Integer f19408d = null;

    /* synthetic */ C2975gp0(AbstractC2860fp0 abstractC2860fp0) {
    }

    public final C2975gp0 zza(Nx0 nx0) {
        this.f19406b = nx0;
        return this;
    }

    public final C2975gp0 zzb(Nx0 nx0) {
        this.f19407c = nx0;
        return this;
    }

    public final C2975gp0 zzc(Integer num) {
        this.f19408d = num;
        return this;
    }

    public final C2975gp0 zzd(C4456tp0 c4456tp0) {
        this.f19405a = c4456tp0;
        return this;
    }

    public final C3204ip0 zze() throws GeneralSecurityException {
        Mx0 mx0Zzb;
        C4456tp0 c4456tp0 = this.f19405a;
        if (c4456tp0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Nx0 nx0 = this.f19406b;
        if (nx0 == null || this.f19407c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c4456tp0.zzb() != nx0.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c4456tp0.zzc() != this.f19407c.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f19405a.zza() && this.f19408d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19405a.zza() && this.f19408d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f19405a.zzh() == C4115qp0.zzc) {
            mx0Zzb = Ks0.zza;
        } else if (this.f19405a.zzh() == C4115qp0.zzb) {
            mx0Zzb = Ks0.zza(this.f19408d.intValue());
        } else {
            if (this.f19405a.zzh() != C4115qp0.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f19405a.zzh())));
            }
            mx0Zzb = Ks0.zzb(this.f19408d.intValue());
        }
        return new C3204ip0(this.f19405a, this.f19406b, this.f19407c, mx0Zzb, this.f19408d, null);
    }
}
