package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3092hq0 extends C2181Zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3661mq0 f19846a;

    /* renamed from: b, reason: collision with root package name */
    private final Nx0 f19847b;

    /* renamed from: c, reason: collision with root package name */
    private final Mx0 f19848c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f19849d;

    private C3092hq0(C3661mq0 c3661mq0, Nx0 nx0, Mx0 mx0, Integer num) {
        this.f19846a = c3661mq0;
        this.f19847b = nx0;
        this.f19848c = mx0;
        this.f19849d = num;
    }

    public static C3092hq0 zza(C3547lq0 c3547lq0, Nx0 nx0, Integer num) throws GeneralSecurityException {
        Mx0 mx0Zzb;
        C3547lq0 c3547lq02 = C3547lq0.zzc;
        if (c3547lq0 != c3547lq02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c3547lq0.toString() + " the value of idRequirement must be non-null");
        }
        if (c3547lq0 == c3547lq02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (nx0.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + nx0.zza());
        }
        C3661mq0 c3661mq0Zzc = C3661mq0.zzc(c3547lq0);
        if (c3661mq0Zzc.zzb() == c3547lq02) {
            mx0Zzb = Ks0.zza;
        } else if (c3661mq0Zzc.zzb() == C3547lq0.zzb) {
            mx0Zzb = Ks0.zza(num.intValue());
        } else {
            if (c3661mq0Zzc.zzb() != C3547lq0.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(c3661mq0Zzc.zzb().toString()));
            }
            mx0Zzb = Ks0.zzb(num.intValue());
        }
        return new C3092hq0(c3661mq0Zzc, nx0, mx0Zzb, num);
    }

    public final C3661mq0 zzb() {
        return this.f19846a;
    }

    public final Mx0 zzc() {
        return this.f19848c;
    }

    public final Nx0 zzd() {
        return this.f19847b;
    }

    public final Integer zze() {
        return this.f19849d;
    }
}
