package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1527Jp extends AbstractBinderC1623Mc implements InterfaceC1568Kp {
    public AbstractBinderC1527Jp() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static InterfaceC1568Kp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1568Kp ? (InterfaceC1568Kp) iInterfaceQueryLocalInterface : new C1486Ip(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Intent intent = (Intent) AbstractC1664Nc.zza(parcel, Intent.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zze(intent);
                break;
            case 2:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzi(interfaceC6172aAsInterface, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzg(interfaceC6172aAsInterface2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzf(strArrCreateStringArray, iArrCreateIntArray, interfaceC6172aAsInterface3);
                break;
            case 6:
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                I1.a aVar = (I1.a) AbstractC1664Nc.zza(parcel, I1.a.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzj(interfaceC6172aAsInterface4, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(Intent intent);

    public abstract /* synthetic */ void zzf(String[] strArr, int[] iArr, InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzg(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzh();

    public abstract /* synthetic */ void zzi(InterfaceC6172a interfaceC6172a, String str, String str2);

    public abstract /* synthetic */ void zzj(InterfaceC6172a interfaceC6172a, I1.a aVar);
}
