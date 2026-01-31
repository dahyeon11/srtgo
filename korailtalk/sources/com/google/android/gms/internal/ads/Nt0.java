package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Nt0 extends AbstractC3441ku0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f14963a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14964b;

    /* renamed from: c, reason: collision with root package name */
    private final Lt0 f14965c;

    /* synthetic */ Nt0(int i8, int i9, Lt0 lt0, Mt0 mt0) {
        this.f14963a = i8;
        this.f14964b = i9;
        this.f14965c = lt0;
    }

    public static Kt0 zze() {
        return new Kt0(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Nt0)) {
            return false;
        }
        Nt0 nt0 = (Nt0) obj;
        return nt0.f14963a == this.f14963a && nt0.zzd() == zzd() && nt0.f14965c == this.f14965c;
    }

    public final int hashCode() {
        return Objects.hash(Nt0.class, Integer.valueOf(this.f14963a), Integer.valueOf(this.f14964b), this.f14965c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f14965c) + ", " + this.f14964b + "-byte tags, and " + this.f14963a + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f14965c != Lt0.zzd;
    }

    public final int zzb() {
        return this.f14964b;
    }

    public final int zzc() {
        return this.f14963a;
    }

    public final int zzd() {
        Lt0 lt0 = this.f14965c;
        if (lt0 == Lt0.zzd) {
            return this.f14964b;
        }
        if (lt0 == Lt0.zza || lt0 == Lt0.zzb || lt0 == Lt0.zzc) {
            return this.f14964b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final Lt0 zzf() {
        return this.f14965c;
    }
}
