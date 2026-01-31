package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0580v0;
import H1.AbstractBinderC0592z0;
import H1.InterfaceC0583w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2276ak extends AbstractBinderC1623Mc implements InterfaceC2391bk {
    public AbstractBinderC2276ak() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2129Yj c2047Wj;
        switch (i8) {
            case 2:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                InterfaceC2503cj interfaceC2503cjZzk = zzk();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2503cjZzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                H1.V0 v0Zzh = zzh();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC2004Vi interfaceC2004ViZzi = zzi();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2004ViZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                boolean zZzI = zzI(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzI ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzB(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC6172a interfaceC6172aZzm = zzm();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzm);
                return true;
            case 19:
                InterfaceC6172a interfaceC6172aZzl = zzl();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2047Wj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2047Wj = iInterfaceQueryLocalInterface instanceof InterfaceC2129Yj ? (InterfaceC2129Yj) iInterfaceQueryLocalInterface : new C2047Wj(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzF(c2047Wj);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 25:
                H1.A0 a0Zzb = AbstractBinderC0592z0.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzy(a0Zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC0583w0 interfaceC0583w0Zzb = AbstractBinderC0580v0.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzD(interfaceC0583w0Zzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                InterfaceC2168Zi interfaceC2168ZiZzj = zzj();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2168ZiZzj);
                return true;
            case 30:
                boolean zZzG = zzG();
                parcel2.writeNoException();
                int i11 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzG ? 1 : 0);
                return true;
            case 31:
                H1.S0 s0Zzg = zzg();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, s0Zzg);
                return true;
            case 32:
                H1.L0 l0Zzb = H1.K0.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzE(l0Zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzA();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzB(Bundle bundle);

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzC();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzD(InterfaceC0583w0 interfaceC0583w0);

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzE(H1.L0 l02);

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzF(InterfaceC2129Yj interfaceC2129Yj);

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ boolean zzG();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ boolean zzH();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ boolean zzI(Bundle bundle);

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ double zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ Bundle zzf();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ H1.S0 zzg();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ H1.V0 zzh();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ InterfaceC2004Vi zzi();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ InterfaceC2168Zi zzj();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ InterfaceC2503cj zzk();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ InterfaceC6172a zzl();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ InterfaceC6172a zzm();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzn();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzo();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzp();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzq();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzr();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzs();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ String zzt();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ List zzu();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ List zzv();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzw();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzx();

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzy(H1.A0 a02);

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public abstract /* synthetic */ void zzz(Bundle bundle);
}
