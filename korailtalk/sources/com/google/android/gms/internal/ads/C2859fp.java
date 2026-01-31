package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2859fp implements N1.k, N1.q, N1.x, N1.t, N1.i {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC2096Xn f19241a;

    C2859fp(InterfaceC2096Xn interfaceC2096Xn) {
        this.f19241a = interfaceC2096Xn;
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void onAdClosed() {
        try {
            this.f19241a.zzf();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.q, N1.x
    public final void onAdFailedToShow(C6521b c6521b) {
        try {
            L1.n.zzj("Mediated ad failed to show: Error Code = " + c6521b.getCode() + ". Error Message = " + c6521b.getMessage() + " Error Domain = " + c6521b.getDomain());
            this.f19241a.zzk(c6521b.zza());
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.k, N1.q, N1.t
    public final void onAdLeftApplication() {
        try {
            this.f19241a.zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void onAdOpened() {
        try {
            this.f19241a.zzp();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.x
    public final void onUserEarnedReward(U1.b bVar) {
        try {
            this.f19241a.zzt(new BinderC2407bs(bVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.x
    public final void onVideoComplete() {
        try {
            this.f19241a.zzv();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.t
    public final void onVideoMute() {
    }

    @Override // N1.t
    public final void onVideoPause() {
        try {
            this.f19241a.zzw();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.t
    public final void onVideoPlay() {
        try {
            this.f19241a.zzx();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.x
    public final void onVideoStart() {
        try {
            this.f19241a.zzy();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.t
    public final void onVideoUnmute() {
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void reportAdClicked() {
        try {
            this.f19241a.zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.k, N1.InterfaceC0678c
    public final void reportAdImpression() {
        try {
            this.f19241a.zzm();
        } catch (RemoteException unused) {
        }
    }

    @Override // N1.q, N1.x
    public final void onAdFailedToShow(String str) {
        try {
            L1.n.zzj("Mediated ad failed to show: " + str);
            this.f19241a.zzl(str);
        } catch (RemoteException unused) {
        }
    }
}
