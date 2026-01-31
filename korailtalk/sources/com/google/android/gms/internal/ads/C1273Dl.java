package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Dl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1273Dl extends AbstractC1583Lc implements InterfaceC1355Fl {
    C1273Dl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1355Fl
    public final InterfaceC1232Cl zze(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8, InterfaceC5131zl interfaceC5131zl) {
        InterfaceC1232Cl c1150Al;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        AbstractC1664Nc.zzf(parcelA, interfaceC5131zl);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c1150Al = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            c1150Al = iInterfaceQueryLocalInterface instanceof InterfaceC1232Cl ? (InterfaceC1232Cl) iInterfaceQueryLocalInterface : new C1150Al(strongBinder);
        }
        parcelB.recycle();
        return c1150Al;
    }
}
