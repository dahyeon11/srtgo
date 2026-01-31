package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1690Np extends AbstractBinderC1623Mc implements InterfaceC1731Op {
    public static InterfaceC1731Op zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1731Op ? (InterfaceC1731Op) iInterfaceQueryLocalInterface : new C1649Mp(iBinder);
    }
}
