package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Or, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1733Or extends AbstractC1583Lc implements IInterface {
    C1733Or(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        parcelB.recycle();
        return strongBinder;
    }
}
