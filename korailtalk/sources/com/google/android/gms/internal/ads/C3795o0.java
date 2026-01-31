package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3795o0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f21379a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3909p0 f21380b;

    public C3795o0(Handler handler, InterfaceC3909p0 interfaceC3909p0) {
        this.f21379a = interfaceC3909p0 == null ? null : handler;
        this.f21380b = interfaceC3909p0;
    }

    final /* synthetic */ void a(String str, long j8, long j9) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzp(str, j8, j9);
    }

    final /* synthetic */ void b(String str) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzq(str);
    }

    final /* synthetic */ void c(LE0 le0) {
        le0.zza();
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzr(le0);
    }

    final /* synthetic */ void d(int i8, long j8) {
        int i9 = AbstractC2281am0.zza;
        this.f21380b.zzl(i8, j8);
    }

    final /* synthetic */ void e(LE0 le0) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzs(le0);
    }

    final /* synthetic */ void f(Q5 q52, ME0 me0) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzu(q52, me0);
    }

    final /* synthetic */ void g(Object obj, long j8) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzm(obj, j8);
    }

    final /* synthetic */ void h(long j8, int i8) {
        int i9 = AbstractC2281am0.zza;
        this.f21380b.zzt(j8, i8);
    }

    final /* synthetic */ void i(Exception exc) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzo(exc);
    }

    final /* synthetic */ void j(IQ iq) {
        int i8 = AbstractC2281am0.zza;
        this.f21380b.zzv(iq);
    }

    public final void zza(final String str, final long j8, final long j9) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(str, j8, j9);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b(str);
                }
            });
        }
    }

    public final void zzc(final LE0 le0) {
        le0.zza();
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.c(le0);
                }
            });
        }
    }

    public final void zzd(final int i8, final long j8) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d(i8, j8);
                }
            });
        }
    }

    public final void zze(final LE0 le0) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.e(le0);
                }
            });
        }
    }

    public final void zzf(final Q5 q52, final ME0 me0) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f(q52, me0);
                }
            });
        }
    }

    public final void zzq(final Object obj) {
        Handler handler = this.f21379a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.g(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j8, final int i8) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.h(j8, i8);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.i(exc);
                }
            });
        }
    }

    public final void zzt(final IQ iq) {
        Handler handler = this.f21379a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.j(iq);
                }
            });
        }
    }
}
