package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4215rj extends AbstractBinderC1623Mc implements InterfaceC4329sj {
    public AbstractBinderC4215rj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                InterfaceC6172a interfaceC6172aZzh = zzh();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzh);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                InterfaceC2503cj interfaceC2503cjZzf = zzf();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2503cjZzf);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                H1.V0 v0Zzd = zzd();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC2004Vi interfaceC2004ViZze = zze();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2004ViZze);
                return true;
            case 18:
                InterfaceC6172a interfaceC6172aZzg = zzg();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzg);
                return true;
            case 19:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ double zzb();

    public abstract /* synthetic */ Bundle zzc();

    public abstract /* synthetic */ H1.V0 zzd();

    public abstract /* synthetic */ InterfaceC2004Vi zze();

    public abstract /* synthetic */ InterfaceC2503cj zzf();

    public abstract /* synthetic */ InterfaceC6172a zzg();

    public abstract /* synthetic */ InterfaceC6172a zzh();

    public abstract /* synthetic */ String zzi();

    public abstract /* synthetic */ String zzj();

    public abstract /* synthetic */ String zzk();

    public abstract /* synthetic */ String zzl();

    public abstract /* synthetic */ String zzm();

    public abstract /* synthetic */ String zzn();

    public abstract /* synthetic */ List zzo();

    public abstract /* synthetic */ void zzp();

    public abstract /* synthetic */ void zzq(Bundle bundle);

    public abstract /* synthetic */ void zzr(Bundle bundle);

    public abstract /* synthetic */ boolean zzs(Bundle bundle);
}
