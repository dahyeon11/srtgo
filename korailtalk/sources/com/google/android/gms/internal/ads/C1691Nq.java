package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1691Nq extends AbstractC1583Lc implements InterfaceC1773Pq {
    C1691Nq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1773Pq
    public final void zze(C1405Gq c1405Gq, InterfaceC1896Sq interfaceC1896Sq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1405Gq);
        AbstractC1664Nc.zzf(parcelA, interfaceC1896Sq);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1773Pq
    public final void zzf(C1241Cq c1241Cq, InterfaceC1896Sq interfaceC1896Sq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1241Cq);
        AbstractC1664Nc.zzf(parcelA, interfaceC1896Sq);
        c(1, parcelA);
    }
}
