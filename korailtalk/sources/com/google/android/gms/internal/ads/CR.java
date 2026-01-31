package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class CR implements InterfaceC3619mR {

    /* renamed from: a, reason: collision with root package name */
    private final long f12522a;

    /* renamed from: b, reason: collision with root package name */
    private final C4188rR f12523b;

    /* renamed from: c, reason: collision with root package name */
    private final BinderC3629ma0 f12524c;

    CR(long j8, Context context, C4188rR c4188rR, AbstractC2302ax abstractC2302ax, String str) {
        this.f12522a = j8;
        this.f12523b = c4188rR;
        InterfaceC3857oa0 interfaceC3857oa0Zzw = abstractC2302ax.zzw();
        interfaceC3857oa0Zzw.zzb(context);
        interfaceC3857oa0Zzw.zza(str);
        this.f12524c = interfaceC3857oa0Zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3619mR
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3619mR
    public final void zzb(H1.Y1 y12) {
        try {
            this.f12524c.zzf(y12, new AR(this));
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3619mR
    public final void zzc() {
        try {
            this.f12524c.zzk(new BR(this));
            this.f12524c.zzm(r2.b.wrap(null));
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
