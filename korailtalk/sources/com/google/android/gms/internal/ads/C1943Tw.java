package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1943Tw {

    /* renamed from: a, reason: collision with root package name */
    private final int f16546a;
    public final int zza;
    public final int zzb;

    private C1943Tw(int i8, int i9, int i10) {
        this.f16546a = i8;
        this.zzb = i9;
        this.zza = i10;
    }

    public static C1943Tw zza() {
        return new C1943Tw(0, 0, 0);
    }

    public static C1943Tw zzb(int i8, int i9) {
        return new C1943Tw(1, i8, i9);
    }

    public static C1943Tw zzc(H1.d2 d2Var) {
        return d2Var.zzd ? new C1943Tw(3, 0, 0) : d2Var.zzi ? new C1943Tw(2, 0, 0) : d2Var.zzh ? zza() : zzb(d2Var.zzf, d2Var.zzc);
    }

    public static C1943Tw zzd() {
        return new C1943Tw(5, 0, 0);
    }

    public static C1943Tw zze() {
        return new C1943Tw(4, 0, 0);
    }

    public final boolean zzf() {
        return this.f16546a == 0;
    }

    public final boolean zzg() {
        return this.f16546a == 2;
    }

    public final boolean zzh() {
        return this.f16546a == 5;
    }

    public final boolean zzi() {
        return this.f16546a == 3;
    }

    public final boolean zzj() {
        return this.f16546a == 4;
    }
}
