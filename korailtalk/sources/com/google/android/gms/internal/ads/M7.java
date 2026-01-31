package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class M7 {

    /* renamed from: a, reason: collision with root package name */
    private int f14537a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f14538b;

    public final int zza() {
        return this.f14538b;
    }

    public final int zzb() {
        return this.f14537a;
    }

    public final void zzc(C2898g8 c2898g8) throws C2898g8 {
        int i8 = this.f14538b + 1;
        this.f14538b = i8;
        int i9 = this.f14537a;
        this.f14537a = i9 + i9;
        if (i8 > 1) {
            throw c2898g8;
        }
    }
}
