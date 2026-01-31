package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class RJ0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16075a;

    /* renamed from: b, reason: collision with root package name */
    private final SJ0 f16076b;

    public RJ0(Handler handler, SJ0 sj0) {
        this.f16075a = sj0 == null ? null : handler;
        this.f16076b = sj0;
    }

    final /* synthetic */ void a(Exception exc) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zza(exc);
    }

    final /* synthetic */ void b(Exception exc) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzh(exc);
    }

    final /* synthetic */ void c(TJ0 tj0) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzi(tj0);
    }

    final /* synthetic */ void d(TJ0 tj0) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzj(tj0);
    }

    final /* synthetic */ void e(String str, long j8, long j9) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzb(str, j8, j9);
    }

    final /* synthetic */ void f(String str) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzc(str);
    }

    final /* synthetic */ void g(LE0 le0) {
        le0.zza();
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzd(le0);
    }

    final /* synthetic */ void h(LE0 le0) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zze(le0);
    }

    final /* synthetic */ void i(Q5 q52, ME0 me0) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzf(q52, me0);
    }

    final /* synthetic */ void j(long j8) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzg(j8);
    }

    final /* synthetic */ void k(boolean z8) {
        int i8 = AbstractC2281am0.zza;
        this.f16076b.zzn(z8);
    }

    final /* synthetic */ void l(int i8, long j8, long j9) {
        int i9 = AbstractC2281am0.zza;
        this.f16076b.zzk(i8, j8, j9);
    }

    public final void zza(final Exception exc) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.LJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.MJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b(exc);
                }
            });
        }
    }

    public final void zzc(final TJ0 tj0) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.JJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.c(tj0);
                }
            });
        }
    }

    public final void zzd(final TJ0 tj0) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.KJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d(tj0);
                }
            });
        }
    }

    public final void zze(final String str, final long j8, final long j9) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.PJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.e(str, j8, j9);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.QJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f(str);
                }
            });
        }
    }

    public final void zzg(final LE0 le0) {
        le0.zza();
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.GJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.g(le0);
                }
            });
        }
    }

    public final void zzh(final LE0 le0) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.FJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.h(le0);
                }
            });
        }
    }

    public final void zzi(final Q5 q52, final ME0 me0) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.NJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.i(q52, me0);
                }
            });
        }
    }

    public final void zzv(final long j8) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.HJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.j(j8);
                }
            });
        }
    }

    public final void zzw(final boolean z8) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.OJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.k(z8);
                }
            });
        }
    }

    public final void zzx(final int i8, final long j8, final long j9) {
        Handler handler = this.f16075a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.IJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.l(i8, j8, j9);
                }
            });
        }
    }
}
