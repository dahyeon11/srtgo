package com.google.android.gms.internal.ads;

import H1.C0525c1;
import H1.C0591z;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Tr */
/* loaded from: classes2.dex */
public final class C1938Tr extends U1.c {

    /* renamed from: a */
    private final String f16527a;

    /* renamed from: b */
    private final InterfaceC1570Kr f16528b;

    /* renamed from: c */
    private final Context f16529c;

    /* renamed from: d */
    private final BinderC2521cs f16530d = new BinderC2521cs();

    /* renamed from: e */
    private U1.a f16531e;

    /* renamed from: f */
    private y1.m f16532f;

    public C1938Tr(Context context, String str) {
        this.f16529c = context.getApplicationContext();
        this.f16527a = str;
        this.f16528b = C0591z.zza().zzq(context, str, new BinderC1686Nn());
    }

    @Override // U1.c
    public final Bundle getAdMetadata() {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                return interfaceC1570Kr.zzb();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return new Bundle();
    }

    @Override // U1.c
    public final String getAdUnitId() {
        return this.f16527a;
    }

    @Override // U1.c
    public final y1.m getFullScreenContentCallback() {
        return this.f16532f;
    }

    @Override // U1.c
    public final U1.a getOnAdMetadataChangedListener() {
        return this.f16531e;
    }

    @Override // U1.c
    public final y1.s getOnPaidEventListener() {
        return null;
    }

    @Override // U1.c
    public final y1.y getResponseInfo() {
        H1.S0 s0Zzc = null;
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                s0Zzc = interfaceC1570Kr.zzc();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return y1.y.zzb(s0Zzc);
    }

    @Override // U1.c
    public final U1.b getRewardItem() {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            InterfaceC1406Gr interfaceC1406GrZzd = interfaceC1570Kr != null ? interfaceC1570Kr.zzd() : null;
            return interfaceC1406GrZzd == null ? U1.b.DEFAULT_REWARD : new C1979Ur(interfaceC1406GrZzd);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            return U1.b.DEFAULT_REWARD;
        }
    }

    @Override // U1.c
    public final void setFullScreenContentCallback(y1.m mVar) {
        this.f16532f = mVar;
        this.f16530d.zzb(mVar);
    }

    @Override // U1.c
    public final void setImmersiveMode(boolean z8) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzh(z8);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // U1.c
    public final void setOnAdMetadataChangedListener(U1.a aVar) {
        try {
            this.f16531e = aVar;
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzi(new H1.K1(aVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // U1.c
    public final void setOnPaidEventListener(y1.s sVar) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzj(new H1.L1(sVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // U1.c
    public final void show(Activity activity, y1.t tVar) {
        this.f16530d.zzc(tVar);
        if (activity == null) {
            L1.n.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzk(this.f16530d);
                this.f16528b.zzm(r2.b.wrap(activity));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zza(C0525c1 c0525c1, U1.d dVar) {
        try {
            InterfaceC1570Kr interfaceC1570Kr = this.f16528b;
            if (interfaceC1570Kr != null) {
                interfaceC1570Kr.zzf(H1.c2.zza.zza(this.f16529c, c0525c1), new BinderC2102Xr(dVar, this));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // U1.c
    public final void setServerSideVerificationOptions(U1.e eVar) {
    }
}
