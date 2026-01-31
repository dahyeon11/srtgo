package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Sp0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16345a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16346b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f16347c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final Qp0 f16348d;

    /* synthetic */ Sp0(int i8, int i9, int i10, Qp0 qp0, Rp0 rp0) {
        this.f16345a = i8;
        this.f16348d = qp0;
    }

    public static Pp0 zzc() {
        return new Pp0(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Sp0)) {
            return false;
        }
        Sp0 sp0 = (Sp0) obj;
        return sp0.f16345a == this.f16345a && sp0.f16348d == this.f16348d;
    }

    public final int hashCode() {
        return Objects.hash(Sp0.class, Integer.valueOf(this.f16345a), 12, 16, this.f16348d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f16348d) + ", 12-byte IV, 16-byte tag, and " + this.f16345a + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f16348d != Qp0.zzc;
    }

    public final int zzb() {
        return this.f16345a;
    }

    public final Qp0 zzd() {
        return this.f16348d;
    }
}
