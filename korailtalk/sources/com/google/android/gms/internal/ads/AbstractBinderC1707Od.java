package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Od, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1707Od extends AbstractBinderC1623Mc implements InterfaceC1748Pd {
    public AbstractBinderC1707Od() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2035Wd c1953Ud;
        switch (i8) {
            case 2:
                H1.X xZze = zze();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, xZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC1912Td) {
                    }
                }
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c1953Ud = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c1953Ud = iInterfaceQueryLocalInterface2 instanceof InterfaceC2035Wd ? (InterfaceC2035Wd) iInterfaceQueryLocalInterface2 : new C1953Ud(strongBinder2);
                }
                AbstractC1664Nc.zzc(parcel);
                zzi(interfaceC6172aAsInterface, c1953Ud);
                parcel2.writeNoException();
                return true;
            case 5:
                H1.S0 s0Zzf = zzf();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, s0Zzf);
                return true;
            case 6:
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzg(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                H1.L0 l0Zzb = H1.K0.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzh(l0Zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ H1.X zze();

    public abstract /* synthetic */ H1.S0 zzf();

    public abstract /* synthetic */ void zzg(boolean z8);

    public abstract /* synthetic */ void zzh(H1.L0 l02);

    public abstract /* synthetic */ void zzi(InterfaceC6172a interfaceC6172a, InterfaceC2035Wd interfaceC2035Wd);
}
