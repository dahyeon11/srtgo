package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* loaded from: classes2.dex */
final class V70 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4709w10 f16778a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC4660vd0 f16779b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f16780c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y70 f16781d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z70 f16782e;

    V70(Z70 z70, InterfaceC4709w10 interfaceC4709w10, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0, Y70 y70) {
        this.f16778a = interfaceC4709w10;
        this.f16779b = runnableC4660vd0;
        this.f16780c = interfaceC3407kd0;
        this.f16781d = y70;
        this.f16782e = z70;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.vB, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        RunnableC4660vd0 runnableC4660vd0;
        InterfaceC4614vB interfaceC4614vB = (InterfaceC4614vB) this.f16782e.f17516e.zzd();
        final C0534f1 c0534f1Zzb = interfaceC4614vB == null ? AbstractC4542ub0.zzb(th, null) : interfaceC4614vB.zzb().zza(th);
        synchronized (this.f16782e) {
            try {
                this.f16782e.f17521j = null;
                if (interfaceC4614vB != null) {
                    interfaceC4614vB.zzc().zzdB(c0534f1Zzb);
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzil)).booleanValue()) {
                        this.f16782e.f17513b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.U70
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.f16782e.f17515d.zzdB(c0534f1Zzb);
                            }
                        });
                    }
                } else {
                    this.f16782e.f17515d.zzdB(c0534f1Zzb);
                    this.f16782e.i(this.f16781d).zzh().zzb().zzc().zzh();
                }
                AbstractC3973pb0.zzb(c0534f1Zzb.zza, th, "AppOpenAdLoader.onFailure");
                this.f16778a.zza();
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f16779b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f16782e.f17519h;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f16780c;
                    interfaceC3407kd0.zza(c0534f1Zzb);
                    interfaceC3407kd0.zzi(th);
                    interfaceC3407kd0.zzh(false);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzc(c0534f1Zzb);
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f16780c;
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
        YC yc = (YC) obj;
        synchronized (this.f16782e) {
            try {
                this.f16782e.f17521j = null;
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzil)).booleanValue()) {
                    yc.zzn().zzb(this.f16782e.f17515d);
                }
                this.f16778a.zzb(yc);
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f16779b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f16782e.f17519h;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f16780c;
                    interfaceC3407kd0.zzb(yc.zzp().zzb);
                    interfaceC3407kd0.zze(yc.zzl().zzg());
                    interfaceC3407kd0.zzh(true);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzh(yc.zzp().zzb);
                    runnableC4660vd0.zzf(yc.zzl().zzg());
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f16780c;
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
