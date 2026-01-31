package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4071qO implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4654va0 f21923a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4996ya0 f21924b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IA f21925c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4754wO f21926d;

    C4071qO(C4754wO c4754wO, C4654va0 c4654va0, C4996ya0 c4996ya0, IA ia) {
        this.f21923a = c4654va0;
        this.f21924b = c4996ya0;
        this.f21925c = ia;
        this.f21926d = c4754wO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        interfaceC2065Wv.zzW(this.f21923a, this.f21924b);
        InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzke)).booleanValue() || interfaceC1861RwZzN == null) {
            return;
        }
        IA ia = this.f21925c;
        C4754wO c4754wO = this.f21926d;
        interfaceC1861RwZzN.zzI(ia, c4754wO.f23506j, c4754wO.f23507k);
        IA ia2 = this.f21925c;
        C4754wO c4754wO2 = this.f21926d;
        interfaceC1861RwZzN.zzK(ia2, c4754wO2.f23506j, c4754wO2.f23501e);
    }
}
