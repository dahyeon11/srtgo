package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4903xl extends AbstractC1583Lc implements InterfaceC5131zl {
    C4903xl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131zl
    public final void zzb(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(1, parcelA);
    }
}
