package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Ss, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1898Ss extends AbstractBinderC1623Mc implements InterfaceC1939Ts {
    public AbstractBinderC1898Ss() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static InterfaceC1939Ts zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1939Ts ? (InterfaceC1939Ts) iInterfaceQueryLocalInterface : new C1857Rs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1816Qs c1734Os = null;
        switch (i8) {
            case 1:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                C2103Xs c2103Xs = (C2103Xs) AbstractC1664Nc.zza(parcel, C2103Xs.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c1734Os = iInterfaceQueryLocalInterface instanceof InterfaceC1816Qs ? (InterfaceC1816Qs) iInterfaceQueryLocalInterface : new C1734Os(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzf(interfaceC6172aAsInterface, c2103Xs, c1734Os);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzk(interfaceC6172aAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, null);
                return true;
            case 4:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC3091hq interfaceC3091hqZzb = AbstractBinderC2976gq.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzm(arrayListCreateTypedArrayList, interfaceC6172aAsInterface3, interfaceC3091hqZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC3091hq interfaceC3091hqZzb2 = AbstractBinderC2976gq.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzl(arrayListCreateTypedArrayList2, interfaceC6172aAsInterface4, interfaceC3091hqZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                C3546lq c3546lq = (C3546lq) AbstractC1664Nc.zza(parcel, C3546lq.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzg(c3546lq);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzj(interfaceC6172aAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC6172a interfaceC6172aAsInterface6 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC3091hq interfaceC3091hqZzb3 = AbstractBinderC2976gq.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzi(arrayListCreateTypedArrayList3, interfaceC6172aAsInterface6, interfaceC3091hqZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC6172a interfaceC6172aAsInterface7 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC3091hq interfaceC3091hqZzb4 = AbstractBinderC2976gq.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzh(arrayListCreateTypedArrayList4, interfaceC6172aAsInterface7, interfaceC3091hqZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC6172a interfaceC6172aAsInterface8 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface9 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                InterfaceC6172a interfaceC6172aAsInterface10 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                InterfaceC6172a interfaceC6172aZze = zze(interfaceC6172aAsInterface8, interfaceC6172aAsInterface9, string, interfaceC6172aAsInterface10);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZze);
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ InterfaceC6172a zze(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, String str, InterfaceC6172a interfaceC6172a3);

    public abstract /* synthetic */ void zzf(InterfaceC6172a interfaceC6172a, C2103Xs c2103Xs, InterfaceC1816Qs interfaceC1816Qs);

    public abstract /* synthetic */ void zzg(C3546lq c3546lq);

    public abstract /* synthetic */ void zzh(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq);

    public abstract /* synthetic */ void zzi(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq);

    public abstract /* synthetic */ void zzj(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzk(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzl(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq);

    public abstract /* synthetic */ void zzm(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq);
}
