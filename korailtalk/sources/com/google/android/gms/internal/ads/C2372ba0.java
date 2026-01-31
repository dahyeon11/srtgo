package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ba0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2372ba0 {

    /* renamed from: a, reason: collision with root package name */
    private J1 f18154a = new J1();

    /* renamed from: b, reason: collision with root package name */
    private boolean f18155b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18156c;
    public final Object zza;

    public C2372ba0(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2372ba0.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((C2372ba0) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i8, Z80 z80) {
        if (this.f18156c) {
            return;
        }
        if (i8 != -1) {
            this.f18154a.zza(i8);
        }
        this.f18155b = true;
        z80.zza(this.zza);
    }

    public final void zzb(A90 a90) {
        if (this.f18156c || !this.f18155b) {
            return;
        }
        L2 l2Zzb = this.f18154a.zzb();
        this.f18154a = new J1();
        this.f18155b = false;
        a90.zza(this.zza, l2Zzb);
    }

    public final void zzc(A90 a90) {
        this.f18156c = true;
        if (this.f18155b) {
            this.f18155b = false;
            a90.zza(this.zza, this.f18154a.zzb());
        }
    }
}
