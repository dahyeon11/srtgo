package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2288aq extends AbstractBinderC1623Mc implements InterfaceC2403bq {
    public static InterfaceC2403bq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2403bq ? (InterfaceC2403bq) iInterfaceQueryLocalInterface : new C2182Zp(iBinder);
    }
}
