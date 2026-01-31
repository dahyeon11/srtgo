package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public abstract class K0 extends AbstractBinderC1623Mc implements L0 {
    public K0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static L0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof L0 ? (L0) iInterfaceQueryLocalInterface : new J0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            f2 f2Var = (f2) AbstractC1664Nc.zza(parcel, f2.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zze(f2Var);
            parcel2.writeNoException();
        } else {
            if (i8 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i10 = AbstractC1664Nc.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }

    @Override // H1.L0
    public abstract /* synthetic */ void zze(f2 f2Var);

    @Override // H1.L0
    public abstract /* synthetic */ boolean zzf();
}
