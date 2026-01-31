package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.td0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4432td0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC4660vd0 f22896a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f22897b;

    C4432td0(RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0) {
        this.f22896a = runnableC4660vd0;
        this.f22897b = interfaceC3407kd0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        InterfaceC3407kd0 interfaceC3407kd0 = this.f22897b;
        interfaceC3407kd0.zzi(th);
        interfaceC3407kd0.zzh(false);
        this.f22896a.zza(interfaceC3407kd0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zzb(Object obj) {
    }
}
