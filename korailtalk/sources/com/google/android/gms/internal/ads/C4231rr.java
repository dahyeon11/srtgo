package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.rr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4231rr extends AbstractC1583Lc implements IInterface {
    C4231rr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(InterfaceC4118qr interfaceC4118qr, String str, String str2) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4118qr);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        c(2, parcelA);
    }
}
