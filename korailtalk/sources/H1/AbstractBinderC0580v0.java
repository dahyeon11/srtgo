package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;

/* renamed from: H1.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0580v0 extends AbstractBinderC1623Mc implements InterfaceC0583w0 {
    public AbstractBinderC0580v0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static InterfaceC0583w0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0583w0 ? (InterfaceC0583w0) iInterfaceQueryLocalInterface : new C0577u0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }

    @Override // H1.InterfaceC0583w0
    public abstract /* synthetic */ void zze();
}
