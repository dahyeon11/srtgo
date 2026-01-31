package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1977Up extends AbstractBinderC1623Mc implements InterfaceC2018Vp {
    public static InterfaceC2018Vp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2018Vp ? (InterfaceC2018Vp) iInterfaceQueryLocalInterface : new C1936Tp(iBinder);
    }
}
