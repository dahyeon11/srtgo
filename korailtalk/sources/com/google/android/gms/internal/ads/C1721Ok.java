package com.google.android.gms.internal.ads;

import K1.C0634e0;

/* renamed from: com.google.android.gms.internal.ads.Ok, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1721Ok implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2065Wv f15148a;

    C1721Ok(InterfaceC2065Wv interfaceC2065Wv) {
        this.f15148a = interfaceC2065Wv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        G1.u.zzo().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC2065Wv interfaceC2065Wv = this.f15148a;
        new C0634e0(interfaceC2065Wv.getContext(), interfaceC2065Wv.zzn().afmaVersion, (String) obj).zzb();
    }
}
