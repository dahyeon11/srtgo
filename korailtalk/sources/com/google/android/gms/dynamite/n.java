package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;
import z2.AbstractC6618a;

/* loaded from: classes.dex */
public final class n extends AbstractC6618a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC6172a zze(InterfaceC6172a interfaceC6172a, String str, int i8, InterfaceC6172a interfaceC6172a2) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(i8);
        z2.n.zze(parcelB, interfaceC6172a2);
        Parcel parcelA = a(2, parcelB);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }

    public final InterfaceC6172a zzf(InterfaceC6172a interfaceC6172a, String str, int i8, InterfaceC6172a interfaceC6172a2) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(i8);
        z2.n.zze(parcelB, interfaceC6172a2);
        Parcel parcelA = a(3, parcelB);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }
}
