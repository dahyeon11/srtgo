package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1649Mp extends AbstractC1583Lc implements InterfaceC1731Op {
    C1649Mp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1731Op
    public final InterfaceC1568Kp zze(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        InterfaceC1568Kp c1486Ip;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c1486Ip = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c1486Ip = iInterfaceQueryLocalInterface instanceof InterfaceC1568Kp ? (InterfaceC1568Kp) iInterfaceQueryLocalInterface : new C1486Ip(strongBinder);
        }
        parcelB.recycle();
        return c1486Ip;
    }
}
