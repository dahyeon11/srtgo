package com.google.android.gms.internal.ads;

import H1.C0534f1;
import K1.AbstractC0667v0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class VE implements InterfaceC5078zF, InterfaceC3035hJ, XH, RF, InterfaceC1992Vc {

    /* renamed from: a, reason: collision with root package name */
    private final TF f16814a;

    /* renamed from: b, reason: collision with root package name */
    private final C4654va0 f16815b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f16816c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f16817d;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture f16819f;

    /* renamed from: h, reason: collision with root package name */
    private final String f16821h;

    /* renamed from: e, reason: collision with root package name */
    private final C2514co0 f16818e = C2514co0.zze();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f16820g = new AtomicBoolean();

    VE(TF tf, C4654va0 c4654va0, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f16814a = tf;
        this.f16815b = c4654va0;
        this.f16816c = scheduledExecutorService;
        this.f16817d = executor;
        this.f16821h = str;
    }

    private final boolean c() {
        return this.f16821h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    final /* synthetic */ void b() {
        synchronized (this) {
            try {
                if (this.f16818e.isDone()) {
                    return;
                }
                this.f16818e.zzc(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() {
        C4654va0 c4654va0 = this.f16815b;
        if (c4654va0.zzf == 3) {
            return;
        }
        int i8 = c4654va0.zzZ;
        if (i8 == 0 || i8 == 1) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlw)).booleanValue() && c()) {
                return;
            }
            this.f16814a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final void zzdp(C1951Uc c1951Uc) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlw)).booleanValue() && c() && c1951Uc.zzj && this.f16820g.compareAndSet(false, true) && this.f16815b.zzf != 3) {
            AbstractC0667v0.zza("Full screen 1px impression occurred");
            this.f16814a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(InterfaceC4118qr interfaceC4118qr, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.XH
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.XH
    public final synchronized void zzj() {
        try {
            if (this.f16818e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f16819f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f16818e.zzc(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3035hJ
    public final void zzk() {
        if (this.f16815b.zzf == 3) {
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbx)).booleanValue()) {
            C4654va0 c4654va0 = this.f16815b;
            if (c4654va0.zzZ == 2) {
                if (c4654va0.zzr == 0) {
                    this.f16814a.zza();
                } else {
                    AbstractC1483In0.zzr(this.f16818e, new UE(this), this.f16817d);
                    this.f16819f = this.f16816c.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.TE
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.b();
                        }
                    }, this.f16815b.zzr, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3035hJ
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final synchronized void zzq(C0534f1 c0534f1) {
        try {
            if (this.f16818e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f16819f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f16818e.zzd(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }
}
