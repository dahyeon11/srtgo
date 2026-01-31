package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1809Qn extends AbstractBinderC1623Mc implements InterfaceC1850Rn {
    public AbstractBinderC1809Qn() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC1850Rn zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1850Rn ? (InterfaceC1850Rn) iInterfaceQueryLocalInterface : new C1768Pn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            InterfaceC1973Un interfaceC1973UnZzb = zzb(string);
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, interfaceC1973UnZzb);
        } else if (i8 == 2) {
            String string2 = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i8 == 3) {
            String string3 = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            InterfaceC1852Ro interfaceC1852RoZzc = zzc(string3);
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, interfaceC1852RoZzc);
        } else {
            if (i8 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }

    public abstract /* synthetic */ InterfaceC1973Un zzb(String str);

    public abstract /* synthetic */ InterfaceC1852Ro zzc(String str);

    public abstract /* synthetic */ boolean zzd(String str);

    public abstract /* synthetic */ boolean zze(String str);
}
