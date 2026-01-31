package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2520cr0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2406br0 f18354a;

    private C2520cr0(C2406br0 c2406br0) {
        this.f18354a = c2406br0;
    }

    public static C2520cr0 zzc(C2406br0 c2406br0) {
        return new C2520cr0(c2406br0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2520cr0) && ((C2520cr0) obj).f18354a == this.f18354a;
    }

    public final int hashCode() {
        return Objects.hash(C2520cr0.class, this.f18354a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f18354a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f18354a != C2406br0.zzc;
    }

    public final C2406br0 zzb() {
        return this.f18354a;
    }
}
