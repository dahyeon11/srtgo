package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Xw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2107Xw extends AbstractC1583Lc implements InterfaceC2189Zw {
    C2107Xw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2189Zw
    public final void zze(InterfaceC6172a interfaceC6172a, InterfaceC2025Vw interfaceC2025Vw) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC2025Vw);
        c(2, parcelA);
    }
}
