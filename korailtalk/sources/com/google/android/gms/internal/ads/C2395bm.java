package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2395bm extends AbstractC1583Lc implements InterfaceC2624dm {
    C2395bm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2624dm
    public final void zzb(List list) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        c(1, parcelA);
    }
}
