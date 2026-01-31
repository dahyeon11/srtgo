package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.a0 */
/* loaded from: classes2.dex */
public final class C2194a0 {

    /* renamed from: a */
    private final H f17858a = new H();

    /* renamed from: b */
    private final Y f17859b;

    /* renamed from: c */
    private final Z f17860c;

    /* renamed from: d */
    private boolean f17861d;

    /* renamed from: e */
    private Surface f17862e;

    /* renamed from: f */
    private float f17863f;

    /* renamed from: g */
    private float f17864g;

    /* renamed from: h */
    private float f17865h;

    /* renamed from: i */
    private float f17866i;

    /* renamed from: j */
    private int f17867j;

    /* renamed from: k */
    private long f17868k;

    /* renamed from: l */
    private long f17869l;

    /* renamed from: m */
    private long f17870m;

    /* renamed from: n */
    private long f17871n;

    /* renamed from: o */
    private long f17872o;

    /* renamed from: p */
    private long f17873p;

    /* renamed from: q */
    private long f17874q;

    public C2194a0(Context context) {
        DisplayManager displayManager;
        Y y8 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new Y(this, displayManager);
        this.f17859b = y8;
        this.f17860c = y8 != null ? Z.zza() : null;
        this.f17868k = -9223372036854775807L;
        this.f17869l = -9223372036854775807L;
        this.f17863f = -1.0f;
        this.f17866i = 1.0f;
        this.f17867j = 0;
    }

    static /* bridge */ /* synthetic */ void a(C2194a0 c2194a0, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c2194a0.f17868k = refreshRate;
            c2194a0.f17869l = (refreshRate * 80) / 100;
        } else {
            AbstractC2834fc0.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c2194a0.f17868k = -9223372036854775807L;
            c2194a0.f17869l = -9223372036854775807L;
        }
    }

    private final void b() {
        Surface surface;
        if (AbstractC2281am0.zza < 30 || (surface = this.f17862e) == null || this.f17867j == Integer.MIN_VALUE || this.f17865h == 0.0f) {
            return;
        }
        this.f17865h = 0.0f;
        X.zza(surface, 0.0f);
    }

    private final void c() {
        this.f17870m = 0L;
        this.f17873p = -1L;
        this.f17871n = -1L;
    }

    private final void d() {
        if (AbstractC2281am0.zza < 30 || this.f17862e == null) {
            return;
        }
        float fZza = this.f17858a.zzg() ? this.f17858a.zza() : this.f17863f;
        float f8 = this.f17864g;
        if (fZza != f8) {
            if (fZza != -1.0f && f8 != -1.0f) {
                float f9 = 1.0f;
                if (this.f17858a.zzg() && this.f17858a.zzd() >= 5000000000L) {
                    f9 = 0.02f;
                }
                if (Math.abs(fZza - this.f17864g) < f9) {
                    return;
                }
            } else if (fZza == -1.0f && this.f17858a.zzb() < 30) {
                return;
            }
            this.f17864g = fZza;
            e(false);
        }
    }

    private final void e(boolean z8) {
        Surface surface;
        if (AbstractC2281am0.zza < 30 || (surface = this.f17862e) == null || this.f17867j == Integer.MIN_VALUE) {
            return;
        }
        float f8 = 0.0f;
        if (this.f17861d) {
            float f9 = this.f17864g;
            if (f9 != -1.0f) {
                f8 = this.f17866i * f9;
            }
        }
        if (z8 || this.f17865h != f8) {
            this.f17865h = f8;
            X.zza(surface, f8);
        }
    }

    public final long zza(long j8) {
        long j9;
        if (this.f17873p != -1 && this.f17858a.zzg()) {
            long jZzc = this.f17858a.zzc();
            long j10 = this.f17874q + ((long) ((jZzc * (this.f17870m - this.f17873p)) / this.f17866i));
            if (Math.abs(j8 - j10) > 20000000) {
                c();
            } else {
                j8 = j10;
            }
        }
        this.f17871n = this.f17870m;
        this.f17872o = j8;
        Z z8 = this.f17860c;
        if (z8 != null && this.f17868k != -9223372036854775807L) {
            long j11 = z8.zza;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f17868k;
                long j13 = j11 + (((j8 - j11) / j12) * j12);
                if (j8 <= j13) {
                    j9 = j13 - j12;
                } else {
                    j13 = j12 + j13;
                    j9 = j13;
                }
                long j14 = this.f17869l;
                if (j13 - j8 >= j8 - j9) {
                    j13 = j9;
                }
                return j13 - j14;
            }
        }
        return j8;
    }

    public final void zzc(float f8) {
        this.f17863f = f8;
        this.f17858a.zzf();
        d();
    }

    public final void zzd(long j8) {
        long j9 = this.f17871n;
        if (j9 != -1) {
            this.f17873p = j9;
            this.f17874q = this.f17872o;
        }
        this.f17870m++;
        this.f17858a.zze(j8 * 1000);
        d();
    }

    public final void zze(float f8) {
        this.f17866i = f8;
        c();
        e(false);
    }

    public final void zzf() {
        c();
    }

    public final void zzg() {
        this.f17861d = true;
        c();
        if (this.f17859b != null) {
            Z z8 = this.f17860c;
            z8.getClass();
            z8.zzb();
            this.f17859b.zza();
        }
        e(false);
    }

    public final void zzh() {
        this.f17861d = false;
        Y y8 = this.f17859b;
        if (y8 != null) {
            y8.zzb();
            Z z8 = this.f17860c;
            z8.getClass();
            z8.zzc();
        }
        b();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof Q)) {
            surface = null;
        }
        if (this.f17862e == surface) {
            return;
        }
        b();
        this.f17862e = surface;
        e(true);
    }

    public final void zzj(int i8) {
        if (this.f17867j == i8) {
            return;
        }
        this.f17867j = i8;
        e(true);
    }
}
