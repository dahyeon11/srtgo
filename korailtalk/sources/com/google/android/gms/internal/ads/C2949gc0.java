package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2949gc0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f19380a;

    /* renamed from: c, reason: collision with root package name */
    private long f19382c;

    /* renamed from: b, reason: collision with root package name */
    private final C2719ec0 f19381b = new C2719ec0();

    /* renamed from: d, reason: collision with root package name */
    private int f19383d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f19384e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f19385f = 0;

    public C2949gc0() {
        long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
        this.f19380a = jCurrentTimeMillis;
        this.f19382c = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.f19383d;
    }

    public final long zzb() {
        return this.f19380a;
    }

    public final long zzc() {
        return this.f19382c;
    }

    public final C2719ec0 zzd() {
        C2719ec0 c2719ec0 = this.f19381b;
        C2719ec0 c2719ec0Clone = c2719ec0.clone();
        c2719ec0.zza = false;
        c2719ec0.zzb = 0;
        return c2719ec0Clone;
    }

    public final String zze() {
        return "Created: " + this.f19380a + " Last accessed: " + this.f19382c + " Accesses: " + this.f19383d + "\nEntries retrieved: Valid: " + this.f19384e + " Stale: " + this.f19385f;
    }

    public final void zzf() {
        this.f19382c = G1.u.zzB().currentTimeMillis();
        this.f19383d++;
    }

    public final void zzg() {
        this.f19385f++;
        this.f19381b.zzb++;
    }

    public final void zzh() {
        this.f19384e++;
        this.f19381b.zza = true;
    }
}
