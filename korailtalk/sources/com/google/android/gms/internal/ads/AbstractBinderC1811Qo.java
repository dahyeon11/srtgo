package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1811Qo extends AbstractBinderC1623Mc implements InterfaceC1852Ro {
    public AbstractBinderC1811Qo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static InterfaceC1852Ro zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1852Ro ? (InterfaceC1852Ro) iInterfaceQueryLocalInterface : new C1770Po(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1975Uo c1893So = null;
        InterfaceC1197Bo c5137zo = null;
        InterfaceC1566Ko c1484Io = null;
        InterfaceC1320Eo c1238Co = null;
        InterfaceC1729Oo c1607Lo = null;
        InterfaceC1566Ko c1484Io2 = null;
        InterfaceC1729Oo c1607Lo2 = null;
        InterfaceC1443Ho c1361Fo = null;
        InterfaceC1320Eo c1238Co2 = null;
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC1664Nc.zza(parcel, creator);
            H1.d2 d2Var = (H1.d2) AbstractC1664Nc.zza(parcel, H1.d2.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                c1893So = iInterfaceQueryLocalInterface instanceof InterfaceC1975Uo ? (InterfaceC1975Uo) iInterfaceQueryLocalInterface : new C1893So(strongBinder);
            }
            InterfaceC1975Uo interfaceC1975Uo = c1893So;
            AbstractC1664Nc.zzc(parcel);
            zzh(interfaceC6172aAsInterface, string, bundle, bundle2, d2Var, interfaceC1975Uo);
            parcel2.writeNoException();
        } else if (i8 == 2) {
            C2974gp c2974gpZzf = zzf();
            parcel2.writeNoException();
            AbstractC1664Nc.zze(parcel2, c2974gpZzf);
        } else if (i8 == 3) {
            C2974gp c2974gpZzg = zzg();
            parcel2.writeNoException();
            AbstractC1664Nc.zze(parcel2, c2974gpZzg);
        } else if (i8 == 5) {
            H1.V0 v0Zze = zze();
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, v0Zze);
        } else if (i8 == 10) {
            InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            parcel2.writeNoException();
        } else if (i8 != 11) {
            switch (i8) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    H1.Y1 y12 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c1238Co2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1320Eo ? (InterfaceC1320Eo) iInterfaceQueryLocalInterface2 : new C1238Co(strongBinder2);
                    }
                    InterfaceC1320Eo interfaceC1320Eo = c1238Co2;
                    InterfaceC2096Xn interfaceC2096XnZzb = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    H1.d2 d2Var2 = (H1.d2) AbstractC1664Nc.zza(parcel, H1.d2.CREATOR);
                    AbstractC1664Nc.zzc(parcel);
                    zzj(string2, string3, y12, interfaceC6172aAsInterface2, interfaceC1320Eo, interfaceC2096XnZzb, d2Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    H1.Y1 y13 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        c1361Fo = iInterfaceQueryLocalInterface3 instanceof InterfaceC1443Ho ? (InterfaceC1443Ho) iInterfaceQueryLocalInterface3 : new C1361Fo(strongBinder3);
                    }
                    InterfaceC1443Ho interfaceC1443Ho = c1361Fo;
                    InterfaceC2096Xn interfaceC2096XnZzb2 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    zzl(string4, string5, y13, interfaceC6172aAsInterface3, interfaceC1443Ho, interfaceC2096XnZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    boolean zZzs = zzs(interfaceC6172aAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    H1.Y1 y14 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c1607Lo2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1729Oo ? (InterfaceC1729Oo) iInterfaceQueryLocalInterface4 : new C1607Lo(strongBinder4);
                    }
                    InterfaceC1729Oo interfaceC1729Oo = c1607Lo2;
                    InterfaceC2096Xn interfaceC2096XnZzb3 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    zzp(string6, string7, y14, interfaceC6172aAsInterface5, interfaceC1729Oo, interfaceC2096XnZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    InterfaceC6172a interfaceC6172aAsInterface6 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    boolean zZzt = zzt(interfaceC6172aAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    H1.Y1 y15 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface7 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c1484Io2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC1566Ko ? (InterfaceC1566Ko) iInterfaceQueryLocalInterface5 : new C1484Io(strongBinder5);
                    }
                    InterfaceC1566Ko interfaceC1566Ko = c1484Io2;
                    InterfaceC2096Xn interfaceC2096XnZzb4 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    zzm(string8, string9, y15, interfaceC6172aAsInterface7, interfaceC1566Ko, interfaceC2096XnZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    AbstractC1664Nc.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    H1.Y1 y16 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface8 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c1607Lo = iInterfaceQueryLocalInterface6 instanceof InterfaceC1729Oo ? (InterfaceC1729Oo) iInterfaceQueryLocalInterface6 : new C1607Lo(strongBinder6);
                    }
                    InterfaceC1729Oo interfaceC1729Oo2 = c1607Lo;
                    InterfaceC2096Xn interfaceC2096XnZzb5 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    zzo(string11, string12, y16, interfaceC6172aAsInterface8, interfaceC1729Oo2, interfaceC2096XnZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    H1.Y1 y17 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface9 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c1238Co = iInterfaceQueryLocalInterface7 instanceof InterfaceC1320Eo ? (InterfaceC1320Eo) iInterfaceQueryLocalInterface7 : new C1238Co(strongBinder7);
                    }
                    InterfaceC1320Eo interfaceC1320Eo2 = c1238Co;
                    InterfaceC2096Xn interfaceC2096XnZzb6 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    H1.d2 d2Var3 = (H1.d2) AbstractC1664Nc.zza(parcel, H1.d2.CREATOR);
                    AbstractC1664Nc.zzc(parcel);
                    zzk(string13, string14, y17, interfaceC6172aAsInterface9, interfaceC1320Eo2, interfaceC2096XnZzb6, d2Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    H1.Y1 y18 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface10 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c1484Io = iInterfaceQueryLocalInterface8 instanceof InterfaceC1566Ko ? (InterfaceC1566Ko) iInterfaceQueryLocalInterface8 : new C1484Io(strongBinder8);
                    }
                    InterfaceC1566Ko interfaceC1566Ko2 = c1484Io;
                    InterfaceC2096Xn interfaceC2096XnZzb7 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    C1840Ri c1840Ri = (C1840Ri) AbstractC1664Nc.zza(parcel, C1840Ri.CREATOR);
                    AbstractC1664Nc.zzc(parcel);
                    zzn(string15, string16, y18, interfaceC6172aAsInterface10, interfaceC1566Ko2, interfaceC2096XnZzb7, c1840Ri);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    H1.Y1 y19 = (H1.Y1) AbstractC1664Nc.zza(parcel, H1.Y1.CREATOR);
                    InterfaceC6172a interfaceC6172aAsInterface11 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        c5137zo = iInterfaceQueryLocalInterface9 instanceof InterfaceC1197Bo ? (InterfaceC1197Bo) iInterfaceQueryLocalInterface9 : new C5137zo(strongBinder9);
                    }
                    InterfaceC1197Bo interfaceC1197Bo = c5137zo;
                    InterfaceC2096Xn interfaceC2096XnZzb8 = AbstractBinderC2055Wn.zzb(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    zzi(string17, string18, y19, interfaceC6172aAsInterface11, interfaceC1197Bo, interfaceC2096XnZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    InterfaceC6172a interfaceC6172aAsInterface12 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                    AbstractC1664Nc.zzc(parcel);
                    boolean zZzr = zzr(interfaceC6172aAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            AbstractC1664Nc.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ H1.V0 zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ C2974gp zzf();

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ C2974gp zzg();

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzh(InterfaceC6172a interfaceC6172a, String str, Bundle bundle, Bundle bundle2, H1.d2 d2Var, InterfaceC1975Uo interfaceC1975Uo);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzi(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1197Bo interfaceC1197Bo, InterfaceC2096Xn interfaceC2096Xn);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzj(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1320Eo interfaceC1320Eo, InterfaceC2096Xn interfaceC2096Xn, H1.d2 d2Var);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzk(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1320Eo interfaceC1320Eo, InterfaceC2096Xn interfaceC2096Xn, H1.d2 d2Var);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzl(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1443Ho interfaceC1443Ho, InterfaceC2096Xn interfaceC2096Xn);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzm(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1566Ko interfaceC1566Ko, InterfaceC2096Xn interfaceC2096Xn);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzn(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1566Ko interfaceC1566Ko, InterfaceC2096Xn interfaceC2096Xn, C1840Ri c1840Ri);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzo(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1729Oo interfaceC1729Oo, InterfaceC2096Xn interfaceC2096Xn);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzp(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1729Oo interfaceC1729Oo, InterfaceC2096Xn interfaceC2096Xn);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ void zzq(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ boolean zzr(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ boolean zzs(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1852Ro
    public abstract /* synthetic */ boolean zzt(InterfaceC6172a interfaceC6172a);
}
