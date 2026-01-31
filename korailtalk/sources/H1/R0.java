package H1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import java.util.List;

/* loaded from: classes.dex */
public abstract class R0 extends AbstractBinderC1623Mc implements S0 {
    public R0() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static S0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof S0 ? (S0) iInterfaceQueryLocalInterface : new Q0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 2:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 3:
                List listZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzj);
                return true;
            case 4:
                h2 h2VarZzf = zzf();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, h2VarZzf);
                return true;
            case 5:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZze);
                return true;
            case 6:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            default:
                return false;
        }
    }

    @Override // H1.S0
    public abstract /* synthetic */ Bundle zze();

    @Override // H1.S0
    public abstract /* synthetic */ h2 zzf();

    @Override // H1.S0
    public abstract /* synthetic */ String zzg();

    @Override // H1.S0
    public abstract /* synthetic */ String zzh();

    @Override // H1.S0
    public abstract /* synthetic */ String zzi();

    @Override // H1.S0
    public abstract /* synthetic */ List zzj();
}
