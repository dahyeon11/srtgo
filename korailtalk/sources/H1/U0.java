package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public abstract class U0 extends AbstractBinderC1623Mc implements V0 {
    public U0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static V0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof V0 ? (V0) iInterfaceQueryLocalInterface : new T0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        Y0 w02;
        switch (i8) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzj(zZzg);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 5:
                int iZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(iZzh);
                return true;
            case 6:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 7:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    w02 = iInterfaceQueryLocalInterface instanceof Y0 ? (Y0) iInterfaceQueryLocalInterface : new W0(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzm(w02);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 10:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i11 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 11:
                Y0 y0Zzi = zzi();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, y0Zzi);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i12 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // H1.V0
    public abstract /* synthetic */ float zze();

    @Override // H1.V0
    public abstract /* synthetic */ float zzf();

    @Override // H1.V0
    public abstract /* synthetic */ float zzg();

    @Override // H1.V0
    public abstract /* synthetic */ int zzh();

    @Override // H1.V0
    public abstract /* synthetic */ Y0 zzi();

    @Override // H1.V0
    public abstract /* synthetic */ void zzj(boolean z8);

    @Override // H1.V0
    public abstract /* synthetic */ void zzk();

    @Override // H1.V0
    public abstract /* synthetic */ void zzl();

    @Override // H1.V0
    public abstract /* synthetic */ void zzm(Y0 y02);

    @Override // H1.V0
    public abstract /* synthetic */ void zzn();

    @Override // H1.V0
    public abstract /* synthetic */ boolean zzo();

    @Override // H1.V0
    public abstract /* synthetic */ boolean zzp();

    @Override // H1.V0
    public abstract /* synthetic */ boolean zzq();
}
