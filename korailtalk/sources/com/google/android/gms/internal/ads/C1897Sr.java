package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Sr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1897Sr extends AbstractC1583Lc implements IInterface {
    C1897Sr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(InterfaceC1406Gr interfaceC1406Gr, String str, String str2) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1406Gr);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        c(2, parcelA);
    }
}
