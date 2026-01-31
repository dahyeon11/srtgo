package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.wq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4800wq0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23548a;

    /* renamed from: b, reason: collision with root package name */
    private final C4686vq0 f23549b;

    private C4800wq0(String str, C4686vq0 c4686vq0) {
        this.f23548a = str;
        this.f23549b = c4686vq0;
    }

    public static C4800wq0 zzc(String str, C4686vq0 c4686vq0) {
        return new C4800wq0(str, c4686vq0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4800wq0)) {
            return false;
        }
        C4800wq0 c4800wq0 = (C4800wq0) obj;
        return c4800wq0.f23548a.equals(this.f23548a) && c4800wq0.f23549b.equals(this.f23549b);
    }

    public final int hashCode() {
        return Objects.hash(C4800wq0.class, this.f23548a, this.f23549b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f23548a + ", variant: " + this.f23549b.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f23549b != C4686vq0.zzb;
    }

    public final C4686vq0 zzb() {
        return this.f23549b;
    }

    public final String zzd() {
        return this.f23548a;
    }
}
