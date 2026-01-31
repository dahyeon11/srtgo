package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1746Pc extends AbstractBinderC1623Mc implements InterfaceC1787Qc {
    public static InterfaceC1787Qc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1787Qc ? (InterfaceC1787Qc) iInterfaceQueryLocalInterface : new C1705Oc(iBinder);
    }
}
