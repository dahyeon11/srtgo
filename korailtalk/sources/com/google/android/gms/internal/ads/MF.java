package com.google.android.gms.internal.ads;

import H1.C0534f1;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class MF extends AbstractC4400tI implements DF {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f14560b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f14561c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14562d;

    public MF(LF lf, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f14562d = false;
        this.f14560b = scheduledExecutorService;
        zzo(lf, executor);
    }

    @Override // com.google.android.gms.internal.ads.DF
    public final void zza(final C0534f1 c0534f1) {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.EF
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((DF) obj).zza(c0534f1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DF
    public final void zzb() {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.FF
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((DF) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DF
    public final void zzc(final LK lk) {
        if (this.f14562d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f14561c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.HF
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((DF) obj).zzc(lk);
            }
        });
    }

    final /* synthetic */ void zzd() {
        synchronized (this) {
            L1.n.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new LK("Timeout for show call succeed."));
            this.f14562d = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f14561c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.f14561c = this.f14560b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.GF
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzkJ)).intValue(), TimeUnit.MILLISECONDS);
    }
}
