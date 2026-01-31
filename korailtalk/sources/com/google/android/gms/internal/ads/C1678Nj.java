package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1678Nj extends AbstractC1583Lc implements InterfaceC1760Pj {
    C1678Nj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1760Pj
    public final void zze(H1.X x8, InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, x8);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(1, parcelA);
    }
}
