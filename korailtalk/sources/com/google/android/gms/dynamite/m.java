package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;
import z2.AbstractC6618a;

/* loaded from: classes.dex */
public final class m extends AbstractC6618a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() {
        Parcel parcelA = a(6, b());
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    public final int zzf(InterfaceC6172a interfaceC6172a, String str, boolean z8) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(z8 ? 1 : 0);
        Parcel parcelA = a(3, parcelB);
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    public final int zzg(InterfaceC6172a interfaceC6172a, String str, boolean z8) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(z8 ? 1 : 0);
        Parcel parcelA = a(5, parcelB);
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    public final InterfaceC6172a zzh(InterfaceC6172a interfaceC6172a, String str, int i8) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(i8);
        Parcel parcelA = a(2, parcelB);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }

    public final InterfaceC6172a zzi(InterfaceC6172a interfaceC6172a, String str, int i8, InterfaceC6172a interfaceC6172a2) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(i8);
        z2.n.zze(parcelB, interfaceC6172a2);
        Parcel parcelA = a(8, parcelB);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }

    public final InterfaceC6172a zzj(InterfaceC6172a interfaceC6172a, String str, int i8) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(i8);
        Parcel parcelA = a(4, parcelB);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }

    public final InterfaceC6172a zzk(InterfaceC6172a interfaceC6172a, String str, boolean z8, long j8) {
        Parcel parcelB = b();
        z2.n.zze(parcelB, interfaceC6172a);
        parcelB.writeString(str);
        parcelB.writeInt(z8 ? 1 : 0);
        parcelB.writeLong(j8);
        Parcel parcelA = a(7, parcelB);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }
}
