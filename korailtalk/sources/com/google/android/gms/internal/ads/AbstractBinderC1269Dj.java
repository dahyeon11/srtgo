package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1269Dj extends AbstractBinderC1623Mc implements InterfaceC1310Ej {
    public static InterfaceC1310Ej zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1310Ej ? (InterfaceC1310Ej) iInterfaceQueryLocalInterface : new C1228Cj(iBinder);
    }
}
