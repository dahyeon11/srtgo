package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0518a0;
import H1.InterfaceC0521b0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4345sr extends AbstractBinderC1623Mc implements InterfaceC4459tr {
    public AbstractBinderC4345sr() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            C4915xr c4915xr = (C4915xr) AbstractC1664Nc.zza(parcel, C4915xr.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzg(c4915xr);
            parcel2.writeNoException();
        } else if (i8 != 2) {
            InterfaceC4801wr c4573ur = null;
            C4231rr c4231rr = null;
            if (i8 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c4573ur = iInterfaceQueryLocalInterface instanceof InterfaceC4801wr ? (InterfaceC4801wr) iInterfaceQueryLocalInterface : new C4573ur(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzo(c4573ur);
                parcel2.writeNoException();
            } else if (i8 != 34) {
                switch (i8) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i10 = AbstractC1664Nc.zza;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                        AbstractC1664Nc.zzc(parcel);
                        zzi(interfaceC6172aAsInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                        AbstractC1664Nc.zzc(parcel);
                        zzk(interfaceC6172aAsInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                        AbstractC1664Nc.zzc(parcel);
                        zzf(interfaceC6172aAsInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        AbstractC1664Nc.zzc(parcel);
                        zzp(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        InterfaceC0521b0 interfaceC0521b0Zzb = AbstractBinderC0518a0.zzb(parcel.readStrongBinder());
                        AbstractC1664Nc.zzc(parcel);
                        zzl(interfaceC0521b0Zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        AbstractC1664Nc.zze(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c4231rr = iInterfaceQueryLocalInterface2 instanceof C4231rr ? (C4231rr) iInterfaceQueryLocalInterface2 : new C4231rr(strongBinder2);
                        }
                        AbstractC1664Nc.zzc(parcel);
                        zzu(c4231rr);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        AbstractC1664Nc.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                        AbstractC1664Nc.zzc(parcel);
                        zzr(interfaceC6172aAsInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        AbstractC1664Nc.zzc(parcel);
                        zzm(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        int i11 = AbstractC1664Nc.zza;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        H1.S0 s0Zzc = zzc();
                        parcel2.writeNoException();
                        AbstractC1664Nc.zzf(parcel2, s0Zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzn(zZzg);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }

    public abstract /* synthetic */ Bundle zzb();

    public abstract /* synthetic */ H1.S0 zzc();

    public abstract /* synthetic */ String zzd();

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzg(C4915xr c4915xr);

    public abstract /* synthetic */ void zzh();

    public abstract /* synthetic */ void zzi(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzj();

    public abstract /* synthetic */ void zzk(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzl(InterfaceC0521b0 interfaceC0521b0);

    public abstract /* synthetic */ void zzm(String str);

    public abstract /* synthetic */ void zzn(boolean z8);

    public abstract /* synthetic */ void zzo(InterfaceC4801wr interfaceC4801wr);

    public abstract /* synthetic */ void zzp(String str);

    public abstract /* synthetic */ void zzq();

    public abstract /* synthetic */ void zzr(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ boolean zzs();

    public abstract /* synthetic */ boolean zzt();

    public abstract /* synthetic */ void zzu(C4231rr c4231rr);
}
