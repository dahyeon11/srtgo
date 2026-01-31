package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3304jj extends AbstractBinderC1623Mc implements InterfaceC3418kj {
    public static InterfaceC3418kj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3418kj ? (InterfaceC3418kj) iInterfaceQueryLocalInterface : new C3191ij(iBinder);
    }
}
