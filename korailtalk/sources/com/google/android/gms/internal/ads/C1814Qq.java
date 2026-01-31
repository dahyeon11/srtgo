package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1814Qq extends AbstractC1583Lc implements InterfaceC1896Sq {
    C1814Qq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1896Sq
    public final void zze(K1.D d9) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, d9);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1896Sq
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, parcelFileDescriptor);
        c(1, parcelA);
    }
}
