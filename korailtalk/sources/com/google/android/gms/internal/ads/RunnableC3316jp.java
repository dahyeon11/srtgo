package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.jp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3316jp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f20312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbtx f20313b;

    RunnableC3316jp(zzbtx zzbtxVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f20312a = adOverlayInfoParcel;
        this.f20313b = zzbtxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G1.u.zzi();
        J1.v.zza(this.f20313b.f24226a, this.f20312a, true);
    }
}
