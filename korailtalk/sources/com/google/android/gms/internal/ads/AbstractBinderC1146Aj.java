package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1146Aj extends AbstractBinderC1623Mc implements InterfaceC1187Bj {
    public static InterfaceC1187Bj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1187Bj ? (InterfaceC1187Bj) iInterfaceQueryLocalInterface : new C5127zj(iBinder);
    }
}
