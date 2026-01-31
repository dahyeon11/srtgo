package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ld, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1585Ld extends A1.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1748Pd f14328a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14329b;

    /* renamed from: c, reason: collision with root package name */
    private final BinderC1625Md f14330c = new BinderC1625Md();

    /* renamed from: d, reason: collision with root package name */
    y1.m f14331d;

    public C1585Ld(InterfaceC1748Pd interfaceC1748Pd, String str) {
        this.f14328a = interfaceC1748Pd;
        this.f14329b = str;
    }

    @Override // A1.a
    public final String getAdUnitId() {
        return this.f14329b;
    }

    @Override // A1.a
    public final y1.m getFullScreenContentCallback() {
        return this.f14331d;
    }

    @Override // A1.a
    public final y1.s getOnPaidEventListener() {
        return null;
    }

    @Override // A1.a
    public final y1.y getResponseInfo() {
        H1.S0 s0Zzf;
        try {
            s0Zzf = this.f14328a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            s0Zzf = null;
        }
        return y1.y.zzb(s0Zzf);
    }

    @Override // A1.a
    public final void setFullScreenContentCallback(y1.m mVar) {
        this.f14331d = mVar;
        this.f14330c.zzg(mVar);
    }

    @Override // A1.a
    public final void setImmersiveMode(boolean z8) {
        try {
            this.f14328a.zzg(z8);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // A1.a
    public final void setOnPaidEventListener(y1.s sVar) {
        try {
            this.f14328a.zzh(new H1.L1(sVar));
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // A1.a
    public final void show(Activity activity) {
        try {
            this.f14328a.zzi(r2.b.wrap(activity), this.f14330c);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
