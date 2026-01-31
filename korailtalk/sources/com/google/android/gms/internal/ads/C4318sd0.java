package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4318sd0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC4660vd0 f22671a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f22672b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f22673c;

    C4318sd0(RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0, boolean z8) {
        this.f22671a = runnableC4660vd0;
        this.f22672b = interfaceC3407kd0;
        this.f22673c = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        InterfaceC3407kd0 interfaceC3407kd0 = this.f22672b;
        if (interfaceC3407kd0.zzl()) {
            RunnableC4660vd0 runnableC4660vd0 = this.f22671a;
            interfaceC3407kd0.zzi(th);
            interfaceC3407kd0.zzh(false);
            runnableC4660vd0.zza(interfaceC3407kd0);
            if (this.f22673c) {
                this.f22671a.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zzb(Object obj) {
        InterfaceC3407kd0 interfaceC3407kd0 = this.f22672b;
        interfaceC3407kd0.zzh(true);
        this.f22671a.zza(interfaceC3407kd0);
        if (this.f22673c) {
            this.f22671a.zzi();
        }
    }
}
