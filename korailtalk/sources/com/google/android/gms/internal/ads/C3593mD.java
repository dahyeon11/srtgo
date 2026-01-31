package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3593mD implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1319En0 f20861a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3821oD f20862b;

    C3593mD(C3821oD c3821oD, InterfaceC1319En0 interfaceC1319En0) {
        this.f20861a = interfaceC1319En0;
        this.f20862b = c3821oD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        this.f20861a.zza(th);
        AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hD
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C3821oD.b(this.f20862b, ((C2908gD) obj).zza, this.f20861a);
    }
}
