package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* loaded from: classes2.dex */
final class D10 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4709w10 f12605a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC4660vd0 f12606b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f12607c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2351bL f12608d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E10 f12609e;

    D10(E10 e10, InterfaceC4709w10 interfaceC4709w10, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0, AbstractC2351bL abstractC2351bL) {
        this.f12605a = interfaceC4709w10;
        this.f12606b = runnableC4660vd0;
        this.f12607c = interfaceC3407kd0;
        this.f12608d = abstractC2351bL;
        this.f12609e = e10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        RunnableC4660vd0 runnableC4660vd0;
        final C0534f1 c0534f1Zza = this.f12608d.zza().zza(th);
        this.f12608d.zzb().zzdB(c0534f1Zza);
        this.f12609e.f12735b.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.C10
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.f12609e.f12737d.zza().zzdB(c0534f1Zza);
            }
        });
        AbstractC3973pb0.zzb(c0534f1Zza.zza, th, "NativeAdLoader.onFailure");
        this.f12605a.zza();
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() && (runnableC4660vd0 = this.f12606b) != null) {
            runnableC4660vd0.zzc(c0534f1Zza);
            InterfaceC3407kd0 interfaceC3407kd0 = this.f12607c;
            interfaceC3407kd0.zzi(th);
            interfaceC3407kd0.zzh(false);
            runnableC4660vd0.zza(interfaceC3407kd0);
            runnableC4660vd0.zzi();
            return;
        }
        E10 e10 = this.f12609e;
        InterfaceC3407kd0 interfaceC3407kd02 = this.f12607c;
        RunnableC5002yd0 runnableC5002yd0 = e10.f12738e;
        interfaceC3407kd02.zza(c0534f1Zza);
        interfaceC3407kd02.zzi(th);
        interfaceC3407kd02.zzh(false);
        runnableC5002yd0.zzb(interfaceC3407kd02.zzn());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        RunnableC4660vd0 runnableC4660vd0;
        YC yc = (YC) obj;
        synchronized (this.f12609e) {
            try {
                yc.zzn().zza(this.f12609e.f12737d.zzd());
                this.f12605a.zzb(yc);
                this.f12609e.f12735b.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.B10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.f12609e.f12737d.zzb().zzs();
                    }
                });
                if (!((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() || (runnableC4660vd0 = this.f12606b) == null) {
                    RunnableC5002yd0 runnableC5002yd0 = this.f12609e.f12738e;
                    InterfaceC3407kd0 interfaceC3407kd0 = this.f12607c;
                    interfaceC3407kd0.zzb(yc.zzp().zzb);
                    interfaceC3407kd0.zze(yc.zzl().zzg());
                    interfaceC3407kd0.zzh(true);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                } else {
                    runnableC4660vd0.zzh(yc.zzp().zzb);
                    runnableC4660vd0.zzf(yc.zzl().zzg());
                    InterfaceC3407kd0 interfaceC3407kd02 = this.f12607c;
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
