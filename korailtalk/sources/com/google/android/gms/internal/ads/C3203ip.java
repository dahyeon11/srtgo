package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3203ip implements J1.w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbtx f19979a;

    C3203ip(zzbtx zzbtxVar) {
        this.f19979a = zzbtxVar;
    }

    @Override // J1.w
    public final void zzdH() {
        L1.n.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // J1.w
    public final void zzdk() {
        L1.n.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // J1.w
    public final void zzdq() {
        L1.n.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // J1.w
    public final void zzdr() {
        L1.n.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbtx zzbtxVar = this.f19979a;
        zzbtxVar.f24227b.onAdOpened(zzbtxVar);
    }

    @Override // J1.w
    public final void zzdt() {
    }

    @Override // J1.w
    public final void zzdu(int i8) {
        L1.n.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbtx zzbtxVar = this.f19979a;
        zzbtxVar.f24227b.onAdClosed(zzbtxVar);
    }
}
