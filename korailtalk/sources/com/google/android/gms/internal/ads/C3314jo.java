package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i2.AbstractC5683p;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3314jo implements N1.k, N1.q, N1.t, N1.i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2096Xn f20310a;

    public C3314jo(InterfaceC2096Xn interfaceC2096Xn) {
        this.f20310a = interfaceC2096Xn;
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void onAdClosed() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClosed.");
        try {
            this.f20310a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.q, N1.x
    public final void onAdFailedToShow(C6521b c6521b) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToShow.");
        L1.n.zzj("Mediation ad failed to show: Error Code = " + c6521b.getCode() + ". Error Message = " + c6521b.getMessage() + " Error Domain = " + c6521b.getDomain());
        try {
            this.f20310a.zzk(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.k, N1.q, N1.t
    public final void onAdLeftApplication() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLeftApplication.");
        try {
            this.f20310a.zzn();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void onAdOpened() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdOpened.");
        try {
            this.f20310a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.t
    public final void onVideoComplete() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onVideoComplete.");
        try {
            this.f20310a.zzu();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.t
    public final void onVideoMute() {
    }

    @Override // N1.t
    public final void onVideoPause() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onVideoPause.");
        try {
            this.f20310a.zzw();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.t
    public final void onVideoPlay() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onVideoPlay.");
        try {
            this.f20310a.zzx();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.t
    public final void onVideoUnmute() {
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void reportAdClicked() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called reportAdClicked.");
        try {
            this.f20310a.zze();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void reportAdImpression() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called reportAdImpression.");
        try {
            this.f20310a.zzm();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.q, N1.x
    public final void onAdFailedToShow(String str) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToShow.");
        L1.n.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f20310a.zzl(str);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
