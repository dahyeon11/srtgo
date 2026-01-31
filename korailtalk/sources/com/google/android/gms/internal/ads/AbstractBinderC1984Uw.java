package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Uw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1984Uw extends AbstractBinderC1623Mc implements InterfaceC2025Vw {
    public AbstractBinderC1984Uw() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzp(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                Bundle bundleZzd = zzd(bundle2);
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzd);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzo(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzt(string3, string4, interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                Map mapZzk = zzk(string5, string6, zZzg);
                parcel2.writeNoException();
                parcel2.writeMap(mapZzk);
                return true;
            case 6:
                String string7 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                int iZzb = zzb(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzm(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                List listZzj = zzj(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listZzj);
                return true;
            case 10:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 11:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 12:
                long jZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(jZzc);
                return true;
            case 13:
                String string12 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzl(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzn(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzs(interfaceC6172aAsInterface2, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 17:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 18:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzr(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ int zzb(String str);

    public abstract /* synthetic */ long zzc();

    public abstract /* synthetic */ Bundle zzd(Bundle bundle);

    public abstract /* synthetic */ String zze();

    public abstract /* synthetic */ String zzf();

    public abstract /* synthetic */ String zzg();

    public abstract /* synthetic */ String zzh();

    public abstract /* synthetic */ String zzi();

    public abstract /* synthetic */ List zzj(String str, String str2);

    public abstract /* synthetic */ Map zzk(String str, String str2, boolean z8);

    public abstract /* synthetic */ void zzl(String str);

    public abstract /* synthetic */ void zzm(String str, String str2, Bundle bundle);

    public abstract /* synthetic */ void zzn(String str);

    public abstract /* synthetic */ void zzo(String str, String str2, Bundle bundle);

    public abstract /* synthetic */ void zzp(Bundle bundle);

    public abstract /* synthetic */ void zzq(Bundle bundle);

    public abstract /* synthetic */ void zzr(Bundle bundle);

    public abstract /* synthetic */ void zzs(InterfaceC6172a interfaceC6172a, String str, String str2);

    public abstract /* synthetic */ void zzt(String str, String str2, InterfaceC6172a interfaceC6172a);
}
