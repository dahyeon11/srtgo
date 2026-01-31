package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class P0 extends AbstractC1583Lc implements IInterface {
    P0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final O0 zze(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        O0 m02;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            m02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            m02 = iInterfaceQueryLocalInterface instanceof O0 ? (O0) iInterfaceQueryLocalInterface : new M0(strongBinder);
        }
        parcelB.recycle();
        return m02;
    }
}
