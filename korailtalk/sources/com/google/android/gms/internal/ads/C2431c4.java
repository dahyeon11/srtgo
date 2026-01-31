package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2431c4 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18234a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f18235b;

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f18236c;

    /* renamed from: d, reason: collision with root package name */
    private int f18237d;

    /* renamed from: e, reason: collision with root package name */
    private int f18238e;
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;

    public C2431c4(C4099qh0 c4099qh0, C4099qh0 c4099qh02, boolean z8) throws C1901Sv {
        this.f18236c = c4099qh0;
        this.f18235b = c4099qh02;
        this.f18234a = z8;
        c4099qh02.zzK(12);
        this.zza = c4099qh02.zzp();
        c4099qh0.zzK(12);
        this.f18238e = c4099qh0.zzp();
        AbstractC2884g1.zzb(c4099qh0.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i8 = this.zzb + 1;
        this.zzb = i8;
        if (i8 == this.zza) {
            return false;
        }
        this.zzd = this.f18234a ? this.f18235b.zzv() : this.f18235b.zzu();
        if (this.zzb == this.f18237d) {
            this.zzc = this.f18236c.zzp();
            this.f18236c.zzL(4);
            int i9 = this.f18238e - 1;
            this.f18238e = i9;
            this.f18237d = i9 > 0 ? (-1) + this.f18236c.zzp() : -1;
        }
        return true;
    }
}
