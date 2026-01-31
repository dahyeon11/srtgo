package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3988pj extends AbstractBinderC1623Mc implements InterfaceC4102qj {
    public static InterfaceC4102qj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4102qj ? (InterfaceC4102qj) iInterfaceQueryLocalInterface : new C3874oj(iBinder);
    }
}
