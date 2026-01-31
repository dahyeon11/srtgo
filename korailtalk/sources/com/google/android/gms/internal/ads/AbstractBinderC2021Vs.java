package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Vs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2021Vs extends AbstractBinderC1623Mc implements InterfaceC2062Ws {
    public static InterfaceC2062Ws zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2062Ws ? (InterfaceC2062Ws) iInterfaceQueryLocalInterface : new C1980Us(iBinder);
    }
}
