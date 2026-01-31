package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Wr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2061Wr {
    public static final InterfaceC1570Kr zza(Context context, String str, InterfaceC1850Rn interfaceC1850Rn) {
        try {
            IBinder iBinderZze = ((C1733Or) L1.r.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new L1.p() { // from class: com.google.android.gms.internal.ads.Vr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof C1733Or ? (C1733Or) iInterfaceQueryLocalInterface : new C1733Or(obj);
                }
            })).zze(r2.b.wrap(context), str, interfaceC1850Rn, 241806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1570Kr ? (InterfaceC1570Kr) iInterfaceQueryLocalInterface : new C1447Hr(iBinderZze);
        } catch (L1.q e8) {
            e = e8;
            L1.n.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e9) {
            e = e9;
            L1.n.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
