package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i2.AbstractC5683p;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.as, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2292as implements N1.x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2096Xn f18044a;

    public C2292as(InterfaceC2096Xn interfaceC2096Xn) {
        this.f18044a = interfaceC2096Xn;
    }

    @Override // N1.x, N1.InterfaceC0678c
    public final void onAdClosed() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClosed.");
        try {
            this.f18044a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x
    public final void onAdFailedToShow(C6521b c6521b) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToShow.");
        L1.n.zzj("Mediation ad failed to show: Error Code = " + c6521b.getCode() + ". Error Message = " + c6521b.getMessage() + " Error Domain = " + c6521b.getDomain());
        try {
            this.f18044a.zzk(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x, N1.InterfaceC0678c
    public final void onAdOpened() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdOpened.");
        try {
            this.f18044a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x
    public final void onUserEarnedReward(U1.b bVar) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onUserEarnedReward.");
        try {
            this.f18044a.zzt(new BinderC2407bs(bVar));
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x
    public final void onVideoComplete() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onVideoComplete.");
        try {
            this.f18044a.zzu();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x
    public final void onVideoStart() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onVideoStart.");
        try {
            this.f18044a.zzy();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x, N1.InterfaceC0678c
    public final void reportAdClicked() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called reportAdClicked.");
        try {
            this.f18044a.zze();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x, N1.InterfaceC0678c
    public final void reportAdImpression() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called reportAdImpression.");
        try {
            this.f18044a.zzm();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.x
    public final void onAdFailedToShow(String str) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToShow.");
        L1.n.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f18044a.zzl(str);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
