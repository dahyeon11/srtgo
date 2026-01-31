package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Ar, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1160Ar extends AbstractBinderC1623Mc implements InterfaceC1201Br {
    public AbstractBinderC1160Ar() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static InterfaceC1201Br zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1201Br ? (InterfaceC1201Br) iInterfaceQueryLocalInterface : new C5143zr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzl(interfaceC6172aAsInterface);
                break;
            case 2:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                zzk(interfaceC6172aAsInterface2, i10);
                break;
            case 3:
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzi(interfaceC6172aAsInterface3);
                break;
            case 4:
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzj(interfaceC6172aAsInterface4);
                break;
            case 5:
                InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzo(interfaceC6172aAsInterface5);
                break;
            case 6:
                InterfaceC6172a interfaceC6172aAsInterface6 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzf(interfaceC6172aAsInterface6);
                break;
            case 7:
                InterfaceC6172a interfaceC6172aAsInterface7 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                C1242Cr c1242Cr = (C1242Cr) AbstractC1664Nc.zza(parcel, C1242Cr.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzm(interfaceC6172aAsInterface7, c1242Cr);
                break;
            case 8:
                InterfaceC6172a interfaceC6172aAsInterface8 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zze(interfaceC6172aAsInterface8);
                break;
            case 9:
                InterfaceC6172a interfaceC6172aAsInterface9 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                zzg(interfaceC6172aAsInterface9, i11);
                break;
            case 10:
                InterfaceC6172a interfaceC6172aAsInterface10 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzh(interfaceC6172aAsInterface10);
                break;
            case 11:
                InterfaceC6172a interfaceC6172aAsInterface11 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzn(interfaceC6172aAsInterface11);
                break;
            case 12:
                AbstractC1664Nc.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zze(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzf(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzg(InterfaceC6172a interfaceC6172a, int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzh(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzi(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzj(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzk(InterfaceC6172a interfaceC6172a, int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzl(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzm(InterfaceC6172a interfaceC6172a, C1242Cr c1242Cr);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzn(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1201Br
    public abstract /* synthetic */ void zzo(InterfaceC6172a interfaceC6172a);
}
