package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Al, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1150Al extends AbstractC1583Lc implements InterfaceC1232Cl {
    C1150Al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1232Cl
    public final void zze() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1232Cl
    public final void zzf(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(1, parcelA);
    }
}
