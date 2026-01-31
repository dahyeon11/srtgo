package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1839Rh0 {
    public static final C1839Rh0 zza = new C1839Rh0(-1, -1);
    public static final C1839Rh0 zzb = new C1839Rh0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f16148a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16149b;

    public C1839Rh0(int i8, int i9) {
        boolean z8 = false;
        if ((i8 == -1 || i8 >= 0) && (i9 == -1 || i9 >= 0)) {
            z8 = true;
        }
        F10.zzd(z8);
        this.f16148a = i8;
        this.f16149b = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1839Rh0) {
            C1839Rh0 c1839Rh0 = (C1839Rh0) obj;
            if (this.f16148a == c1839Rh0.f16148a && this.f16149b == c1839Rh0.f16149b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f16148a;
        return ((i8 >>> 16) | (i8 << 16)) ^ this.f16149b;
    }

    public final String toString() {
        return this.f16148a + "x" + this.f16149b;
    }

    public final int zza() {
        return this.f16149b;
    }

    public final int zzb() {
        return this.f16148a;
    }
}
