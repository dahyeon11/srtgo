package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Yw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2148Yw extends AbstractBinderC1623Mc implements InterfaceC2189Zw {
    public static InterfaceC2189Zw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2189Zw ? (InterfaceC2189Zw) iInterfaceQueryLocalInterface : new C2107Xw(iBinder);
    }
}
