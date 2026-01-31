package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2847fj extends AbstractBinderC1623Mc implements InterfaceC2962gj {
    public AbstractBinderC2847fj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC2962gj zzdA(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2962gj ? (InterfaceC2962gj) iInterfaceQueryLocalInterface : new C2732ej(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2168Zi c2086Xi;
        switch (i8) {
            case 1:
                String string = parcel.readString();
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzdv(string, interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC6172a interfaceC6172aZzb = zzb(string2);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzb);
                return true;
            case 3:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzdz(interfaceC6172aAsInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzdw(interfaceC6172aAsInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzd(interfaceC6172aAsInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2086Xi = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c2086Xi = iInterfaceQueryLocalInterface instanceof InterfaceC2168Zi ? (InterfaceC2168Zi) iInterfaceQueryLocalInterface : new C2086Xi(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzdx(c2086Xi);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzdy(interfaceC6172aAsInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ InterfaceC6172a zzb(String str);

    public abstract /* synthetic */ void zzc();

    public abstract /* synthetic */ void zzd(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzdv(String str, InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzdw(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzdx(InterfaceC2168Zi interfaceC2168Zi);

    public abstract /* synthetic */ void zzdy(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzdz(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zze(InterfaceC6172a interfaceC6172a, int i8);
}
