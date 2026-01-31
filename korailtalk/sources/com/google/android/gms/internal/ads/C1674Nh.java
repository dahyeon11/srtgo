package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1674Nh extends AbstractC1583Lc implements InterfaceC1756Ph {
    C1674Nh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1756Ph
    public final void zze(InterfaceC1633Mh interfaceC1633Mh) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1633Mh);
        c(1, parcelA);
    }
}
