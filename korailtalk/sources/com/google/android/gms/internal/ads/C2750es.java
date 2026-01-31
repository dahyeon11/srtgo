package com.google.android.gms.internal.ads;

import H1.C0525c1;
import H1.C0591z;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2750es extends V1.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18831a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1570Kr f18832b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f18833c;

    /* renamed from: d, reason: collision with root package name */
    private final BinderC2521cs f18834d = new BinderC2521cs();

    /* renamed from: e, reason: collision with root package name */
    private y1.m f18835e;

    /* renamed from: f, reason: collision with root package name */
    private U1.a f18836f;

    public C2750es(Context context, String str) {
        this.f18831a = str;
        this.f18833c = context.getApplicationContext();
        this.f18832b = C0591z.zza().zzq(context, str, new BinderC1686Nn());
    }

    @Override // V1.a
    public final Bundle getAdMetadata() {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                return interfaceC1570Kr.zzb();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return new Bundle();
    }

    @Override // V1.a
    public final String getAdUnitId() {
        return this.f18831a;
    }

    @Override // V1.a
    public final y1.m getFullScreenContentCallback() {
        return this.f18835e;
    }

    @Override // V1.a
    public final U1.a getOnAdMetadataChangedListener() {
        return this.f18836f;
    }

    @Override // V1.a
    public final y1.s getOnPaidEventListener() {
        return null;
    }

    @Override // V1.a
    public final y1.y getResponseInfo() {
        H1.S0 s0Zzc = null;
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                s0Zzc = interfaceC1570Kr.zzc();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return y1.y.zzb(s0Zzc);
    }

    @Override // V1.a
    public final U1.b getRewardItem() {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            InterfaceC1406Gr interfaceC1406GrZzd = interfaceC1570Kr != null ? interfaceC1570Kr.zzd() : null;
            if (interfaceC1406GrZzd != null) {
                return new C1979Ur(interfaceC1406GrZzd);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return U1.b.DEFAULT_REWARD;
    }

    @Override // V1.a
    public final void setFullScreenContentCallback(y1.m mVar) {
        this.f18835e = mVar;
        this.f18834d.zzb(mVar);
    }

    @Override // V1.a
    public final void setImmersiveMode(boolean z8) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzh(z8);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // V1.a
    public final void setOnAdMetadataChangedListener(U1.a aVar) {
        this.f18836f = aVar;
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzi(new H1.K1(aVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // V1.a
    public final void setOnPaidEventListener(y1.s sVar) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzj(new H1.L1(sVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // V1.a
    public final void setServerSideVerificationOptions(U1.e eVar) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzl(new C2143Yr(eVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // V1.a
    public final void show(Activity activity, y1.t tVar) {
        this.f18834d.zzc(tVar);
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzk(this.f18834d);
                this.f18832b.zzm(r2.b.wrap(activity));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zza(C0525c1 c0525c1, V1.b bVar) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f18832b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzg(H1.c2.zza.zza(this.f18833c, c0525c1), new BinderC2635ds(bVar, this));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
