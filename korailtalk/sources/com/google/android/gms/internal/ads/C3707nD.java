package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3707nD implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1319En0 f21222a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3821oD f21223b;

    C3707nD(C3821oD c3821oD, InterfaceC1319En0 interfaceC1319En0) {
        this.f21222a = interfaceC1319En0;
        this.f21223b = c3821oD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hD
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d();
            }
        });
        this.f21222a.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hD
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d();
            }
        });
        this.f21222a.zzb((YC) obj);
    }
}
