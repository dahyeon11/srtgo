package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2977gq0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f19409a;

    /* renamed from: b, reason: collision with root package name */
    private final C2747eq0 f19410b;

    /* synthetic */ C2977gq0(int i8, C2747eq0 c2747eq0, AbstractC2862fq0 abstractC2862fq0) {
        this.f19409a = i8;
        this.f19410b = c2747eq0;
    }

    public static C2632dq0 zzc() {
        return new C2632dq0(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2977gq0)) {
            return false;
        }
        C2977gq0 c2977gq0 = (C2977gq0) obj;
        return c2977gq0.f19409a == this.f19409a && c2977gq0.f19410b == this.f19410b;
    }

    public final int hashCode() {
        return Objects.hash(C2977gq0.class, Integer.valueOf(this.f19409a), this.f19410b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f19410b) + ", " + this.f19409a + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f19410b != C2747eq0.zzc;
    }

    public final int zzb() {
        return this.f19409a;
    }

    public final C2747eq0 zzd() {
        return this.f19410b;
    }
}
