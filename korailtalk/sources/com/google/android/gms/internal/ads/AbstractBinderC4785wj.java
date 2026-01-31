package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4785wj extends AbstractBinderC1623Mc implements InterfaceC4899xj {
    public AbstractBinderC4785wj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static InterfaceC4899xj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4899xj ? (InterfaceC4899xj) iInterfaceQueryLocalInterface : new C4671vj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                String string = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC2503cj interfaceC2503cjZzg = zzg(string2);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2503cjZzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                H1.V0 v0Zze = zze();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC6172a interfaceC6172aZzh = zzh();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzh);
                return true;
            case 10:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                boolean zZzs = zzs(interfaceC6172aAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i11 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzp(interfaceC6172aAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                InterfaceC2168Zi interfaceC2168ZiZzf = zzf();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2168ZiZzf);
                return true;
            case 17:
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                boolean zZzr = zzr(interfaceC6172aAsInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ H1.V0 zze();

    public abstract /* synthetic */ InterfaceC2168Zi zzf();

    public abstract /* synthetic */ InterfaceC2503cj zzg(String str);

    public abstract /* synthetic */ InterfaceC6172a zzh();

    public abstract /* synthetic */ String zzi();

    public abstract /* synthetic */ String zzj(String str);

    public abstract /* synthetic */ List zzk();

    public abstract /* synthetic */ void zzl();

    public abstract /* synthetic */ void zzm();

    public abstract /* synthetic */ void zzn(String str);

    public abstract /* synthetic */ void zzo();

    public abstract /* synthetic */ void zzp(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ boolean zzq();

    public abstract /* synthetic */ boolean zzr(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ boolean zzs(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ boolean zzt();
}
