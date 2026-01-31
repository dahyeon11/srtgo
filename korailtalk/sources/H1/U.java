package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class U extends AbstractC1583Lc implements IInterface {
    U(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zze(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        parcelB.recycle();
        return strongBinder;
    }
}
