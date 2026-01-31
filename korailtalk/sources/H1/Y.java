package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class Y extends AbstractC1583Lc implements IInterface {
    Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8, int i9) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        parcelA.writeInt(i9);
        Parcel parcelB = b(2, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        parcelB.recycle();
        return strongBinder;
    }
}
