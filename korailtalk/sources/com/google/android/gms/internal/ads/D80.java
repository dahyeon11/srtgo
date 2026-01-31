package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class D80 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4709w10 f12640a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC4660vd0 f12641b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f12642c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC3819oC f12643d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E80 f12644e;

    D80(E80 e80, InterfaceC4709w10 interfaceC4709w10, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0, AbstractC3819oC abstractC3819oC) {
        this.f12640a = interfaceC4709w10;
        this.f12641b = runnableC4660vd0;
        this.f12642c = interfaceC3407kd0;
        this.f12643d = abstractC3819oC;
        this.f12644e = e80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        RunnableC4660vd0 runnableC4660vd0;
        final C0534f1 c0534f1Zza = this.f12643d.zzd().zza(th);
        synchronized (this.f12644e) {
            try {
                this.f12644e.f12784l = null;
                this.f12643d.zzf().zzdB(c0534f1Zza);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzik)).booleanValue()) {
                    this.f12644e.f12774b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.B80
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.f12644e.f12776d.zzdB(c0534f1Zza);
                        }
                    });
                }
                E80 e80 = this.f12644e;
                e80.f12780h.zzd(e80.f12782j.zzc());
                AbstractC3973pb0.zzb(c0534f1Zza.zza, th, "BannerAdLoader.onFailure");
                this.f12640a.zza();
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f12641b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f12644e.f12781i;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f12642c;
                    interfaceC3407kd0.zza(c0534f1Zza);
                    interfaceC3407kd0.zzi(th);
                    interfaceC3407kd0.zzh(false);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzc(c0534f1Zza);
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f12642c;
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
        MB mb = (MB) obj;
        synchronized (this.f12644e) {
            try {
                this.f12644e.f12784l = null;
                this.f12644e.f12778f.removeAllViews();
                if (mb.zzc() != null) {
                    ViewParent parent = mb.zzc().getParent();
                    if (parent instanceof ViewGroup) {
                        L1.n.zzj("Banner view provided from " + (mb.zzl() != null ? mb.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(mb.zzc());
                    }
                }
                AbstractC3414kh abstractC3414kh = AbstractC4439th.zzik;
                if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                    JH jhZzn = mb.zzn();
                    jhZzn.zza(this.f12644e.f12776d);
                    jhZzn.zzc(this.f12644e.f12777e);
                }
                this.f12644e.f12778f.addView(mb.zzc());
                this.f12640a.zzb(mb);
                if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                    E80 e80 = this.f12644e;
                    Executor executor = e80.f12774b;
                    final C3000h10 c3000h10 = e80.f12776d;
                    Objects.requireNonNull(c3000h10);
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.C80
                        @Override // java.lang.Runnable
                        public final void run() {
                            c3000h10.zzs();
                        }
                    });
                }
                this.f12644e.f12780h.zzd(mb.zza());
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f12641b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f12644e.f12781i;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f12642c;
                    interfaceC3407kd0.zzb(mb.zzp().zzb);
                    interfaceC3407kd0.zze(mb.zzl().zzg());
                    interfaceC3407kd0.zzh(true);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzh(mb.zzp().zzb);
                    runnableC4660vd0.zzf(mb.zzl().zzg());
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f12642c;
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
