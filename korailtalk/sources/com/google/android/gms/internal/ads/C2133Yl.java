package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Yl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2133Yl extends AbstractC1583Lc implements InterfaceC2280am {
    C2133Yl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2280am
    public final void zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2280am
    public final void zzf() {
        c(2, a());
    }
}
