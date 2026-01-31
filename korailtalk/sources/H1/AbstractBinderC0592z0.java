package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;

/* renamed from: H1.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0592z0 extends AbstractBinderC1623Mc implements A0 {
    public AbstractBinderC0592z0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static A0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof A0 ? (A0) iInterfaceQueryLocalInterface : new C0589y0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i8 != 2) {
                return false;
            }
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }

    public abstract /* synthetic */ String zze();

    public abstract /* synthetic */ String zzf();
}
