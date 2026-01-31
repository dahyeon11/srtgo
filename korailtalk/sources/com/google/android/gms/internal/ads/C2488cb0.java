package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2488cb0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2717eb0 f18331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f18332b;

    C2488cb0(C2717eb0 c2717eb0, int i8) {
        this.f18332b = i8;
        this.f18331a = c2717eb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        G1.u.zzo().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i8 = this.f18332b;
        this.f18331a.zzb((String) obj, i8);
    }
}
