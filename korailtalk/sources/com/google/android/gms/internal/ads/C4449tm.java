package com.google.android.gms.internal.ads;

import H1.C0525c1;
import H1.C0591z;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import y1.AbstractC6525f;
import z1.AbstractC6617c;

/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4449tm extends AbstractC6617c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22914a;

    /* renamed from: b, reason: collision with root package name */
    private final H1.c2 f22915b;

    /* renamed from: c, reason: collision with root package name */
    private final H1.X f22916c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22917d;

    /* renamed from: e, reason: collision with root package name */
    private final BinderC1686Nn f22918e;

    /* renamed from: f, reason: collision with root package name */
    private z1.e f22919f;

    /* renamed from: g, reason: collision with root package name */
    private y1.m f22920g;

    public C4449tm(Context context, String str) {
        BinderC1686Nn binderC1686Nn = new BinderC1686Nn();
        this.f22918e = binderC1686Nn;
        this.f22914a = context;
        this.f22917d = str;
        this.f22915b = H1.c2.zza;
        this.f22916c = C0591z.zza().zze(context, new H1.d2(), str, binderC1686Nn);
    }

    @Override // M1.a
    public final String getAdUnitId() {
        return this.f22917d;
    }

    @Override // z1.AbstractC6617c
    public final z1.e getAppEventListener() {
        return this.f22919f;
    }

    @Override // M1.a
    public final y1.m getFullScreenContentCallback() {
        return this.f22920g;
    }

    @Override // M1.a
    public final y1.s getOnPaidEventListener() {
        return null;
    }

    @Override // M1.a
    public final y1.y getResponseInfo() {
        H1.S0 s0Zzk = null;
        try {
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                s0Zzk = x8.zzk();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return y1.y.zzb(s0Zzk);
    }

    @Override // z1.AbstractC6617c
    public final void setAppEventListener(z1.e eVar) {
        try {
            this.f22919f = eVar;
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                x8.zzG(eVar != null ? new BinderC3406kd(eVar) : null);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // M1.a
    public final void setFullScreenContentCallback(y1.m mVar) {
        try {
            this.f22920g = mVar;
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                x8.zzJ(new H1.D(mVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // M1.a
    public final void setImmersiveMode(boolean z8) {
        try {
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                x8.zzL(z8);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // M1.a
    public final void setOnPaidEventListener(y1.s sVar) {
        try {
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                x8.zzP(new H1.L1(sVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // M1.a
    public final void show(Activity activity) {
        if (activity == null) {
            L1.n.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                x8.zzW(r2.b.wrap(activity));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zza(C0525c1 c0525c1, AbstractC6525f abstractC6525f) {
        try {
            H1.X x8 = this.f22916c;
            if (x8 != null) {
                x8.zzy(this.f22915b.zza(this.f22914a, c0525c1), new H1.U1(abstractC6525f, this));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            abstractC6525f.onAdFailedToLoad(new y1.n(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }
}
