package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Yn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2137Yn extends AbstractC1583Lc implements InterfaceC2284ao {
    C2137Yn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2284ao
    public final InterfaceC6172a zze() {
        Parcel parcelB = b(1, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2284ao
    public final boolean zzf() {
        Parcel parcelB = b(2, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
