package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4456tp0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f22936a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22937b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22938c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22939d;

    /* renamed from: e, reason: collision with root package name */
    private final C4115qp0 f22940e;

    /* renamed from: f, reason: collision with root package name */
    private final C4001pp0 f22941f;

    /* synthetic */ C4456tp0(int i8, int i9, int i10, int i11, C4115qp0 c4115qp0, C4001pp0 c4001pp0, AbstractC4228rp0 abstractC4228rp0) {
        this.f22936a = i8;
        this.f22937b = i9;
        this.f22938c = i10;
        this.f22939d = i11;
        this.f22940e = c4115qp0;
        this.f22941f = c4001pp0;
    }

    public static C3887op0 zzf() {
        return new C3887op0(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4456tp0)) {
            return false;
        }
        C4456tp0 c4456tp0 = (C4456tp0) obj;
        return c4456tp0.f22936a == this.f22936a && c4456tp0.f22937b == this.f22937b && c4456tp0.f22938c == this.f22938c && c4456tp0.f22939d == this.f22939d && c4456tp0.f22940e == this.f22940e && c4456tp0.f22941f == this.f22941f;
    }

    public final int hashCode() {
        return Objects.hash(C4456tp0.class, Integer.valueOf(this.f22936a), Integer.valueOf(this.f22937b), Integer.valueOf(this.f22938c), Integer.valueOf(this.f22939d), this.f22940e, this.f22941f);
    }

    public final String toString() {
        C4001pp0 c4001pp0 = this.f22941f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f22940e) + ", hashType: " + String.valueOf(c4001pp0) + ", " + this.f22938c + "-byte IV, and " + this.f22939d + "-byte tags, and " + this.f22936a + "-byte AES key, and " + this.f22937b + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f22940e != C4115qp0.zzc;
    }

    public final int zzb() {
        return this.f22936a;
    }

    public final int zzc() {
        return this.f22937b;
    }

    public final int zzd() {
        return this.f22938c;
    }

    public final int zze() {
        return this.f22939d;
    }

    public final C4001pp0 zzg() {
        return this.f22941f;
    }

    public final C4115qp0 zzh() {
        return this.f22940e;
    }
}
