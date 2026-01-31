package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class SZ implements InterfaceC3397kX {

    /* renamed from: a, reason: collision with root package name */
    private final C4821x00 f16301a;

    /* renamed from: b, reason: collision with root package name */
    private final C5098zP f16302b;

    SZ(C4821x00 c4821x00, C5098zP c5098zP) {
        this.f16301a = c4821x00;
        this.f16302b = c5098zP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397kX
    public final C3511lX zza(String str, JSONObject jSONObject) {
        InterfaceC1852Ro interfaceC1852RoZzb;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbF)).booleanValue()) {
            try {
                interfaceC1852RoZzb = this.f16302b.zzb(str);
            } catch (RemoteException e8) {
                L1.n.zzh("Coundn't create RTB adapter: ", e8);
                interfaceC1852RoZzb = null;
            }
        } else {
            interfaceC1852RoZzb = this.f16301a.zza(str);
        }
        if (interfaceC1852RoZzb == null) {
            return null;
        }
        return new C3511lX(interfaceC1852RoZzb, new BinderC2942gY(), str);
    }
}
