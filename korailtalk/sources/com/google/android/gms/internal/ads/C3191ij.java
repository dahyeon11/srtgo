package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3191ij extends AbstractC1583Lc implements InterfaceC3418kj {
    C3191ij(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418kj
    public final IBinder zze(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a3);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        parcelB.recycle();
        return strongBinder;
    }
}
