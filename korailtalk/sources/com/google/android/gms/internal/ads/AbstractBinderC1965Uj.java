package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1965Uj extends AbstractBinderC1623Mc implements InterfaceC2006Vj {
    public static InterfaceC2006Vj zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2006Vj ? (InterfaceC2006Vj) iInterfaceQueryLocalInterface : new C1924Tj(iBinder);
    }
}
