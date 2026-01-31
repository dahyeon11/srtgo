package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4443tj extends AbstractBinderC1623Mc implements InterfaceC4557uj {
    public AbstractBinderC4443tj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                InterfaceC6172a interfaceC6172aZzg = zzg();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzg);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                InterfaceC2503cj interfaceC2503cjZze = zze();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2503cjZze);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                H1.V0 v0Zzc = zzc();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                boolean zZzq = zzq(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC2004Vi interfaceC2004ViZzd = zzd();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2004ViZzd);
                return true;
            case 16:
                InterfaceC6172a interfaceC6172aZzf = zzf();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzf);
                return true;
            case 17:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ Bundle zzb();

    public abstract /* synthetic */ H1.V0 zzc();

    public abstract /* synthetic */ InterfaceC2004Vi zzd();

    public abstract /* synthetic */ InterfaceC2503cj zze();

    public abstract /* synthetic */ InterfaceC6172a zzf();

    public abstract /* synthetic */ InterfaceC6172a zzg();

    public abstract /* synthetic */ String zzh();

    public abstract /* synthetic */ String zzi();

    public abstract /* synthetic */ String zzj();

    public abstract /* synthetic */ String zzk();

    public abstract /* synthetic */ String zzl();

    public abstract /* synthetic */ List zzm();

    public abstract /* synthetic */ void zzn();

    public abstract /* synthetic */ void zzo(Bundle bundle);

    public abstract /* synthetic */ void zzp(Bundle bundle);

    public abstract /* synthetic */ boolean zzq(Bundle bundle);
}
