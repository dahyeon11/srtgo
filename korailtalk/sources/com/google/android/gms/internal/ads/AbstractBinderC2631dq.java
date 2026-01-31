package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2631dq extends AbstractBinderC1623Mc implements InterfaceC2746eq {
    public static InterfaceC2746eq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2746eq ? (InterfaceC2746eq) iInterfaceQueryLocalInterface : new C2517cq(iBinder);
    }
}
