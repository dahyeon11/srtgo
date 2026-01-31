package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.bN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2355bN {

    /* renamed from: e, reason: collision with root package name */
    private static final String f18116e = Integer.toString(0, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f18117f = Integer.toString(1, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f18118g = Integer.toString(3, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f18119h = Integer.toString(4, 36);

    @Deprecated
    public static final RG0 zza = new RG0() { // from class: com.google.android.gms.internal.ads.AM
    };

    /* renamed from: a, reason: collision with root package name */
    private final TH f18120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18121b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f18122c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f18123d;
    public final int zzb;

    public C2355bN(TH th, boolean z8, int[] iArr, boolean[] zArr) {
        int i8 = th.zzb;
        this.zzb = i8;
        F10.zzd(i8 == iArr.length && i8 == zArr.length);
        this.f18120a = th;
        this.f18121b = z8 && i8 > 1;
        this.f18122c = (int[]) iArr.clone();
        this.f18123d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2355bN.class == obj.getClass()) {
            C2355bN c2355bN = (C2355bN) obj;
            if (this.f18121b == c2355bN.f18121b && this.f18120a.equals(c2355bN.f18120a) && Arrays.equals(this.f18122c, c2355bN.f18122c) && Arrays.equals(this.f18123d, c2355bN.f18123d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f18120a.hashCode() * 31) + (this.f18121b ? 1 : 0)) * 31) + Arrays.hashCode(this.f18122c)) * 31) + Arrays.hashCode(this.f18123d);
    }

    public final int zza() {
        return this.f18120a.zzd;
    }

    public final Q5 zzb(int i8) {
        return this.f18120a.zzb(i8);
    }

    public final boolean zzc() {
        for (boolean z8 : this.f18123d) {
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i8) {
        return this.f18123d[i8];
    }
}
