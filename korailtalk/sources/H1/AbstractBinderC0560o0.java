package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0560o0 extends AbstractBinderC1623Mc implements InterfaceC0563p0 {
    public AbstractBinderC0560o0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC0563p0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0563p0 ? (InterfaceC0563p0) iInterfaceQueryLocalInterface : new C0557n0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            C0575t1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC1664Nc.zze(parcel2, liteSdkVersion);
        } else {
            if (i8 != 2) {
                return false;
            }
            InterfaceC1850Rn adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, adapterCreator);
        }
        return true;
    }

    @Override // H1.InterfaceC0563p0
    public abstract /* synthetic */ InterfaceC1850Rn getAdapterCreator();

    @Override // H1.InterfaceC0563p0
    public abstract /* synthetic */ C0575t1 getLiteSdkVersion();
}
