package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4687vr extends AbstractBinderC1623Mc implements InterfaceC4801wr {
    public static InterfaceC4801wr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4801wr ? (InterfaceC4801wr) iInterfaceQueryLocalInterface : new C4573ur(iBinder);
    }
}
