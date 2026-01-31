package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2972go extends AbstractBinderC1623Mc implements InterfaceC3087ho {
    public AbstractBinderC2972go() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static InterfaceC3087ho zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3087ho ? (InterfaceC3087ho) iInterfaceQueryLocalInterface : new C2857fo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                InterfaceC2503cj interfaceC2503cjZzl = zzl();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2503cjZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                H1.V0 v0Zzj = zzj();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, null);
                return true;
            case 13:
                InterfaceC6172a interfaceC6172aZzm = zzm();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzm);
                return true;
            case 14:
                InterfaceC6172a interfaceC6172aZzn = zzn();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzn);
                return true;
            case 15:
                InterfaceC6172a interfaceC6172aZzo = zzo();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i11 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzw(interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzy(interfaceC6172aAsInterface2, interfaceC6172aAsInterface3, interfaceC6172aAsInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzz(interfaceC6172aAsInterface5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ boolean zzA();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ boolean zzB();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ double zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ float zzf();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ float zzg();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ float zzh();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ Bundle zzi();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ H1.V0 zzj();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ InterfaceC2004Vi zzk();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ InterfaceC2503cj zzl();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ InterfaceC6172a zzm();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ InterfaceC6172a zzn();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ InterfaceC6172a zzo();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ String zzp();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ String zzq();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ String zzr();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ String zzs();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ String zzt();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ String zzu();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ List zzv();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ void zzw(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ void zzx();

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ void zzy(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3);

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public abstract /* synthetic */ void zzz(InterfaceC6172a interfaceC6172a);
}
