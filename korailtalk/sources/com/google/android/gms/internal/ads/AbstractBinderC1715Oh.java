package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Oh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1715Oh extends AbstractBinderC1623Mc implements InterfaceC1756Ph {
    public static InterfaceC1756Ph zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1756Ph ? (InterfaceC1756Ph) iInterfaceQueryLocalInterface : new C1674Nh(iBinder);
    }
}
