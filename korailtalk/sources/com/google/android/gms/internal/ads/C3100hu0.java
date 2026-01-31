package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.hu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3100hu0 extends AbstractC3441ku0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f19866a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19867b;

    /* renamed from: c, reason: collision with root package name */
    private final C2870fu0 f19868c;

    /* renamed from: d, reason: collision with root package name */
    private final C2755eu0 f19869d;

    /* synthetic */ C3100hu0(int i8, int i9, C2870fu0 c2870fu0, C2755eu0 c2755eu0, AbstractC2985gu0 abstractC2985gu0) {
        this.f19866a = i8;
        this.f19867b = i9;
        this.f19868c = c2870fu0;
        this.f19869d = c2755eu0;
    }

    public static C2640du0 zze() {
        return new C2640du0(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3100hu0)) {
            return false;
        }
        C3100hu0 c3100hu0 = (C3100hu0) obj;
        return c3100hu0.f19866a == this.f19866a && c3100hu0.zzd() == zzd() && c3100hu0.f19868c == this.f19868c && c3100hu0.f19869d == this.f19869d;
    }

    public final int hashCode() {
        return Objects.hash(C3100hu0.class, Integer.valueOf(this.f19866a), Integer.valueOf(this.f19867b), this.f19868c, this.f19869d);
    }

    public final String toString() {
        C2755eu0 c2755eu0 = this.f19869d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f19868c) + ", hashType: " + String.valueOf(c2755eu0) + ", " + this.f19867b + "-byte tags, and " + this.f19866a + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f19868c != C2870fu0.zzd;
    }

    public final int zzb() {
        return this.f19867b;
    }

    public final int zzc() {
        return this.f19866a;
    }

    public final int zzd() {
        C2870fu0 c2870fu0 = this.f19868c;
        if (c2870fu0 == C2870fu0.zzd) {
            return this.f19867b;
        }
        if (c2870fu0 == C2870fu0.zza || c2870fu0 == C2870fu0.zzb || c2870fu0 == C2870fu0.zzc) {
            return this.f19867b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final C2755eu0 zzf() {
        return this.f19869d;
    }

    public final C2870fu0 zzg() {
        return this.f19868c;
    }
}
