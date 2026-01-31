package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4221rm extends AbstractBinderC1623Mc implements InterfaceC4335sm {
    public static InterfaceC4335sm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4335sm ? (InterfaceC4335sm) iInterfaceQueryLocalInterface : new C4108qm(iBinder);
    }
}
