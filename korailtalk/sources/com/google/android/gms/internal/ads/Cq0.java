package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Cq0 extends C2181Zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Iq0 f12581a;

    /* renamed from: b, reason: collision with root package name */
    private final Mx0 f12582b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f12583c;

    private Cq0(Iq0 iq0, Mx0 mx0, Integer num) {
        this.f12581a = iq0;
        this.f12582b = mx0;
        this.f12583c = num;
    }

    public static Cq0 zza(Iq0 iq0, Integer num) throws GeneralSecurityException {
        Mx0 mx0Zzb;
        if (iq0.zzc() == Gq0.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            mx0Zzb = Ks0.zza;
        } else {
            if (iq0.zzc() != Gq0.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(iq0.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            mx0Zzb = Ks0.zzb(num.intValue());
        }
        return new Cq0(iq0, mx0Zzb, num);
    }

    public final Iq0 zzb() {
        return this.f12581a;
    }

    public final Mx0 zzc() {
        return this.f12582b;
    }

    public final Integer zzd() {
        return this.f12583c;
    }
}
