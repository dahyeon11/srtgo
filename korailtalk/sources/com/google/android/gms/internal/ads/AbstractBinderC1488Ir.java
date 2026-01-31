package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Ir, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1488Ir extends AbstractBinderC1623Mc implements InterfaceC1570Kr {
    public AbstractBinderC1488Ir() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static InterfaceC1570Kr zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1570Kr ? (InterfaceC1570Kr) iInterfaceQueryLocalInterface : new C1447Hr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1856Rr c1774Pr = null;
        InterfaceC1856Rr c1774Pr2 = null;
        C1897Sr c1897Sr = null;
        InterfaceC1692Nr lr = null;
        switch (i8) {
            case 1:
                H1.Y1 y12 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c1774Pr = iInterfaceQueryLocalInterface instanceof InterfaceC1856Rr ? (InterfaceC1856Rr) iInterfaceQueryLocalInterface : new C1774Pr(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzf(y12, c1774Pr);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    lr = iInterfaceQueryLocalInterface2 instanceof InterfaceC1692Nr ? (InterfaceC1692Nr) iInterfaceQueryLocalInterface2 : new Lr(strongBinder2);
                }
                AbstractC1664Nc.zzc(parcel);
                zzk(lr);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzm(interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c1897Sr = iInterfaceQueryLocalInterface3 instanceof C1897Sr ? (C1897Sr) iInterfaceQueryLocalInterface3 : new C1897Sr(strongBinder3);
                }
                AbstractC1664Nc.zzc(parcel);
                zzp(c1897Sr);
                parcel2.writeNoException();
                return true;
            case 7:
                C2143Yr c2143Yr = (C2143Yr) AbstractC1664Nc.zza(parcel, C2143Yr.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzl(c2143Yr);
                parcel2.writeNoException();
                return true;
            case 8:
                H1.I0 i0Zzb = H1.H0.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzi(i0Zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzb);
                return true;
            case 10:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzn(interfaceC6172aAsInterface2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1406Gr interfaceC1406GrZzd = zzd();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC1406GrZzd);
                return true;
            case 12:
                H1.S0 s0Zzc = zzc();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, s0Zzc);
                return true;
            case 13:
                H1.L0 l0Zzb = H1.K0.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzj(l0Zzb);
                parcel2.writeNoException();
                return true;
            case 14:
                H1.Y1 y13 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c1774Pr2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1856Rr ? (InterfaceC1856Rr) iInterfaceQueryLocalInterface4 : new C1774Pr(strongBinder4);
                }
                AbstractC1664Nc.zzc(parcel);
                zzg(y13, c1774Pr2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzh(zZzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ Bundle zzb();

    public abstract /* synthetic */ H1.S0 zzc();

    public abstract /* synthetic */ InterfaceC1406Gr zzd();

    public abstract /* synthetic */ String zze();

    public abstract /* synthetic */ void zzf(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr);

    public abstract /* synthetic */ void zzg(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr);

    public abstract /* synthetic */ void zzh(boolean z8);

    public abstract /* synthetic */ void zzi(H1.I0 i02);

    public abstract /* synthetic */ void zzj(H1.L0 l02);

    public abstract /* synthetic */ void zzk(InterfaceC1692Nr interfaceC1692Nr);

    public abstract /* synthetic */ void zzl(C2143Yr c2143Yr);

    public abstract /* synthetic */ void zzm(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzn(InterfaceC6172a interfaceC6172a, boolean z8);

    public abstract /* synthetic */ boolean zzo();

    public abstract /* synthetic */ void zzp(C1897Sr c1897Sr);
}
