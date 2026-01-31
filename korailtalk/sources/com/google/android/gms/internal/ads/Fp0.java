package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Fp0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f13074a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13075b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13076c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final Dp0 f13077d;

    /* synthetic */ Fp0(int i8, int i9, int i10, Dp0 dp0, Ep0 ep0) {
        this.f13074a = i8;
        this.f13075b = i9;
        this.f13077d = dp0;
    }

    public static Cp0 zzd() {
        return new Cp0(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Fp0)) {
            return false;
        }
        Fp0 fp0 = (Fp0) obj;
        return fp0.f13074a == this.f13074a && fp0.f13075b == this.f13075b && fp0.f13077d == this.f13077d;
    }

    public final int hashCode() {
        return Objects.hash(Fp0.class, Integer.valueOf(this.f13074a), Integer.valueOf(this.f13075b), 16, this.f13077d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f13077d) + ", " + this.f13075b + "-byte IV, 16-byte tag, and " + this.f13074a + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f13077d != Dp0.zzc;
    }

    public final int zzb() {
        return this.f13075b;
    }

    public final int zzc() {
        return this.f13074a;
    }

    public final Dp0 zze() {
        return this.f13077d;
    }
}
