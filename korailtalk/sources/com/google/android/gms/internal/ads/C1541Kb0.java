package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1541Kb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1500Jb0 f13841a = new C1500Jb0();

    /* renamed from: b, reason: collision with root package name */
    private int f13842b;

    /* renamed from: c, reason: collision with root package name */
    private int f13843c;

    /* renamed from: d, reason: collision with root package name */
    private int f13844d;

    /* renamed from: e, reason: collision with root package name */
    private int f13845e;

    /* renamed from: f, reason: collision with root package name */
    private int f13846f;

    C1541Kb0() {
    }

    public final C1500Jb0 zza() {
        C1500Jb0 c1500Jb0 = this.f13841a;
        C1500Jb0 c1500Jb0Clone = c1500Jb0.clone();
        c1500Jb0.zza = false;
        c1500Jb0.zzb = false;
        return c1500Jb0Clone;
    }

    public final String zzb() {
        return "\n\tPool does not exist: " + this.f13844d + "\n\tNew pools created: " + this.f13842b + "\n\tPools removed: " + this.f13843c + "\n\tEntries added: " + this.f13846f + "\n\tNo entries retrieved: " + this.f13845e + Q7.X.LF;
    }

    public final void zzc() {
        this.f13846f++;
    }

    public final void zzd() {
        this.f13842b++;
        this.f13841a.zza = true;
    }

    public final void zze() {
        this.f13845e++;
    }

    public final void zzf() {
        this.f13844d++;
    }

    public final void zzg() {
        this.f13843c++;
        this.f13841a.zzb = true;
    }
}
