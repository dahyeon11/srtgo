package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* renamed from: H1.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0530e0 extends AbstractBinderC1623Mc implements InterfaceC0533f0 {
    public AbstractBinderC0530e0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC0533f0 zzd(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0533f0 ? (InterfaceC0533f0) iInterfaceQueryLocalInterface : new C0524c0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        AbstractC1664Nc.zzc(parcel);
        zzc(string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // H1.InterfaceC0533f0
    public abstract /* synthetic */ void zzc(String str, String str2);
}
