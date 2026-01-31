package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3661mq0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3547lq0 f20997a;

    private C3661mq0(C3547lq0 c3547lq0) {
        this.f20997a = c3547lq0;
    }

    public static C3661mq0 zzc(C3547lq0 c3547lq0) {
        return new C3661mq0(c3547lq0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3661mq0) && ((C3661mq0) obj).f20997a == this.f20997a;
    }

    public final int hashCode() {
        return Objects.hash(C3661mq0.class, this.f20997a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f20997a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f20997a != C3547lq0.zzc;
    }

    public final C3547lq0 zzb() {
        return this.f20997a;
    }
}
