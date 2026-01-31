package com.google.android.gms.internal.ads;

import H1.C0534f1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2830fa0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4709w10 f19203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC4660vd0 f19204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f19205c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3060ha0 f19206d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3175ia0 f19207e;

    C2830fa0(C3175ia0 c3175ia0, InterfaceC4709w10 interfaceC4709w10, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0, C3060ha0 c3060ha0) {
        this.f19203a = interfaceC4709w10;
        this.f19204b = runnableC4660vd0;
        this.f19205c = interfaceC3407kd0;
        this.f19206d = c3060ha0;
        this.f19207e = c3175ia0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        RunnableC4660vd0 runnableC4660vd0;
        RO ro = (RO) this.f19207e.f19951e.zzd();
        final C0534f1 c0534f1Zzb = ro == null ? AbstractC4542ub0.zzb(th, null) : ro.zzb().zza(th);
        synchronized (this.f19207e) {
            try {
                if (ro != null) {
                    ro.zza().zzdB(c0534f1Zzb);
                    this.f19207e.f19948b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.da0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.f19207e.f19950d.zzdB(c0534f1Zzb);
                        }
                    });
                } else {
                    this.f19207e.f19950d.zzdB(c0534f1Zzb);
                    this.f19207e.h(this.f19206d).zzh().zzb().zzc().zzh();
                }
                AbstractC3973pb0.zzb(c0534f1Zzb.zza, th, "RewardedAdLoader.onFailure");
                this.f19203a.zza();
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f19204b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f19207e.f19953g;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f19205c;
                    interfaceC3407kd0.zza(c0534f1Zzb);
                    interfaceC3407kd0.zzi(th);
                    interfaceC3407kd0.zzh(false);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzc(c0534f1Zzb);
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f19205c;
                    interfaceC3407kd02.zzi(th);
                    interfaceC3407kd02.zzh(false);
                    runnableC4660vd0.zza(interfaceC3407kd02);
                    runnableC4660vd0.zzi();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        RunnableC4660vd0 runnableC4660vd0;
        MO mo = (MO) obj;
        synchronized (this.f19207e) {
            try {
                mo.zzn().zzd(this.f19207e.f19950d);
                this.f19203a.zzb(mo);
                C3175ia0 c3175ia0 = this.f19207e;
                Executor executor = c3175ia0.f19948b;
                final X90 x90 = c3175ia0.f19950d;
                Objects.requireNonNull(x90);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ea0
                    @Override // java.lang.Runnable
                    public final void run() {
                        x90.zzs();
                    }
                });
                this.f19207e.f19950d.onAdMetadataChanged();
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f19204b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f19207e.f19953g;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f19205c;
                    interfaceC3407kd0.zzb(mo.zzp().zzb);
                    interfaceC3407kd0.zze(mo.zzl().zzg());
                    interfaceC3407kd0.zzh(true);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzh(mo.zzp().zzb);
                    runnableC4660vd0.zzf(mo.zzl().zzg());
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f19205c;
                    interfaceC3407kd02.zzh(true);
                    runnableC4660vd0.zza(interfaceC3407kd02);
                    runnableC4660vd0.zzi();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
