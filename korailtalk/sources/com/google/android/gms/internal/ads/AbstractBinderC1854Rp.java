package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1854Rp extends AbstractBinderC1623Mc implements InterfaceC1895Sp {
    public AbstractBinderC1854Rp() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static InterfaceC1895Sp zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1895Sp ? (InterfaceC1895Sp) iInterfaceQueryLocalInterface : new C1813Qp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzk(interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int i11 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                AbstractC1664Nc.zzc(parcel);
                zzp(i11, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ boolean zzH();

    public abstract /* synthetic */ void zzh(int i8, int i9, Intent intent);

    public abstract /* synthetic */ void zzi();

    public abstract /* synthetic */ void zzk(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzl(Bundle bundle);

    public abstract /* synthetic */ void zzm();

    public abstract /* synthetic */ void zzo();

    public abstract /* synthetic */ void zzp(int i8, String[] strArr, int[] iArr);

    public abstract /* synthetic */ void zzq();

    public abstract /* synthetic */ void zzr();

    public abstract /* synthetic */ void zzs(Bundle bundle);

    public abstract /* synthetic */ void zzt();

    public abstract /* synthetic */ void zzu();

    public abstract /* synthetic */ void zzv();

    public abstract /* synthetic */ void zzx();
}
