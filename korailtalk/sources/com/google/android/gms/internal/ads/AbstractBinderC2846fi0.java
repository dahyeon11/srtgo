package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.fi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2846fi0 extends AbstractBinderC1623Mc implements InterfaceC2961gi0 {
    public static InterfaceC2961gi0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2961gi0 ? (InterfaceC2961gi0) iInterfaceQueryLocalInterface : new C2731ei0(iBinder);
    }
}
