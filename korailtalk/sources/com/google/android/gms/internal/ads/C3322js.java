package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3322js implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.C f20321a;

    C3322js(C3664ms c3664ms, com.google.common.util.concurrent.C c9) {
        this.f20321a = c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        C3664ms.f21003m.remove(this.f20321a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C3664ms.f21003m.remove(this.f20321a);
    }
}
