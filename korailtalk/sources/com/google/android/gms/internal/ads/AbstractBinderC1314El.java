package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.El, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1314El extends AbstractBinderC1623Mc implements InterfaceC1355Fl {
    public static InterfaceC1355Fl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1355Fl ? (InterfaceC1355Fl) iInterfaceQueryLocalInterface : new C1273Dl(iBinder);
    }
}
