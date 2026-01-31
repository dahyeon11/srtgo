package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class H {

    /* renamed from: c, reason: collision with root package name */
    private boolean f13222c;

    /* renamed from: e, reason: collision with root package name */
    private int f13224e;

    /* renamed from: a, reason: collision with root package name */
    private G f13220a = new G();

    /* renamed from: b, reason: collision with root package name */
    private G f13221b = new G();

    /* renamed from: d, reason: collision with root package name */
    private long f13223d = -9223372036854775807L;

    public final float zza() {
        if (this.f13220a.zzf()) {
            return (float) (1.0E9d / this.f13220a.zza());
        }
        return -1.0f;
    }

    public final int zzb() {
        return this.f13224e;
    }

    public final long zzc() {
        if (this.f13220a.zzf()) {
            return this.f13220a.zza();
        }
        return -9223372036854775807L;
    }

    public final long zzd() {
        if (this.f13220a.zzf()) {
            return this.f13220a.zzb();
        }
        return -9223372036854775807L;
    }

    public final void zze(long j8) {
        this.f13220a.zzc(j8);
        if (this.f13220a.zzf()) {
            this.f13222c = false;
        } else if (this.f13223d != -9223372036854775807L) {
            if (!this.f13222c || this.f13221b.zze()) {
                this.f13221b.zzd();
                this.f13221b.zzc(this.f13223d);
            }
            this.f13222c = true;
            this.f13221b.zzc(j8);
        }
        if (this.f13222c && this.f13221b.zzf()) {
            G g8 = this.f13220a;
            this.f13220a = this.f13221b;
            this.f13221b = g8;
            this.f13222c = false;
        }
        this.f13223d = j8;
        this.f13224e = this.f13220a.zzf() ? 0 : this.f13224e + 1;
    }

    public final void zzf() {
        this.f13220a.zzd();
        this.f13221b.zzd();
        this.f13222c = false;
        this.f13223d = -9223372036854775807L;
        this.f13224e = 0;
    }

    public final boolean zzg() {
        return this.f13220a.zzf();
    }
}
