package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Wq0 extends C2181Zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2520cr0 f17070a;

    /* renamed from: b, reason: collision with root package name */
    private final Nx0 f17071b;

    /* renamed from: c, reason: collision with root package name */
    private final Mx0 f17072c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f17073d;

    private Wq0(C2520cr0 c2520cr0, Nx0 nx0, Mx0 mx0, Integer num) {
        this.f17070a = c2520cr0;
        this.f17071b = nx0;
        this.f17072c = mx0;
        this.f17073d = num;
    }

    public static Wq0 zza(C2406br0 c2406br0, Nx0 nx0, Integer num) throws GeneralSecurityException {
        Mx0 mx0Zzb;
        C2406br0 c2406br02 = C2406br0.zzc;
        if (c2406br0 != c2406br02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c2406br0.toString() + " the value of idRequirement must be non-null");
        }
        if (c2406br0 == c2406br02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (nx0.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + nx0.zza());
        }
        C2520cr0 c2520cr0Zzc = C2520cr0.zzc(c2406br0);
        if (c2520cr0Zzc.zzb() == c2406br02) {
            mx0Zzb = Ks0.zza;
        } else if (c2520cr0Zzc.zzb() == C2406br0.zzb) {
            mx0Zzb = Ks0.zza(num.intValue());
        } else {
            if (c2520cr0Zzc.zzb() != C2406br0.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(c2520cr0Zzc.zzb().toString()));
            }
            mx0Zzb = Ks0.zzb(num.intValue());
        }
        return new Wq0(c2520cr0Zzc, nx0, mx0Zzb, num);
    }

    public final C2520cr0 zzb() {
        return this.f17070a;
    }

    public final Mx0 zzc() {
        return this.f17072c;
    }

    public final Nx0 zzd() {
        return this.f17071b;
    }

    public final Integer zze() {
        return this.f17073d;
    }
}
