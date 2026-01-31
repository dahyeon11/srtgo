package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Us, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1980Us extends AbstractC1583Lc implements InterfaceC2062Ws {
    C1980Us(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2062Ws
    public final InterfaceC1939Ts zze(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        InterfaceC1939Ts c1857Rs;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(2, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c1857Rs = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c1857Rs = iInterfaceQueryLocalInterface instanceof InterfaceC1939Ts ? (InterfaceC1939Ts) iInterfaceQueryLocalInterface : new C1857Rs(strongBinder);
        }
        parcelB.recycle();
        return c1857Rs;
    }
}
