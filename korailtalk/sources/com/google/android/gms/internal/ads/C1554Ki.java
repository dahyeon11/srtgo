package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ki, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1554Ki {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13857a;

    public C1554Ki(Context context) {
        this.f13857a = context;
    }

    public final void zza(InterfaceC4913xq interfaceC4913xq) {
        try {
            ((C1595Li) L1.r.zzb(this.f13857a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new L1.p() { // from class: com.google.android.gms.internal.ads.Ji
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof C1595Li ? (C1595Li) iInterfaceQueryLocalInterface : new C1595Li(obj);
                }
            })).zze(interfaceC4913xq);
        } catch (L1.q e8) {
            L1.n.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e8.getMessage())));
        } catch (RemoteException e9) {
            L1.n.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e9.getMessage())));
        }
    }
}
