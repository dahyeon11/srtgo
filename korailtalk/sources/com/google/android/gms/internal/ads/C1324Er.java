package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Er, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1324Er extends AbstractC1583Lc implements InterfaceC1406Gr {
    C1324Er(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1406Gr
    public final int zze() {
        Parcel parcelB = b(2, a());
        int i8 = parcelB.readInt();
        parcelB.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1406Gr
    public final String zzf() {
        Parcel parcelB = b(1, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }
}
