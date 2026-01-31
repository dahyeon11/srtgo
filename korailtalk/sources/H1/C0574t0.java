package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import r2.InterfaceC6172a;

/* renamed from: H1.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574t0 extends AbstractC1583Lc implements IInterface {
    C0574t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder zze(InterfaceC6172a interfaceC6172a, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        parcelB.recycle();
        return strongBinder;
    }
}
