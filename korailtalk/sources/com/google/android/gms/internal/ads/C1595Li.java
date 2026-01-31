package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1595Li extends AbstractC1583Lc implements IInterface {
    C1595Li(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(InterfaceC4913xq interfaceC4913xq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4913xq);
        c(1, parcelA);
    }
}
