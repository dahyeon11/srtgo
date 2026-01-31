package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public final class N extends AbstractC1583Lc implements P {
    N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // H1.P
    public final String zze() {
        throw null;
    }

    @Override // H1.P
    public final String zzf() {
        throw null;
    }

    @Override // H1.P
    public final void zzg(Y1 y12) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        c(1, parcelA);
    }

    @Override // H1.P
    public final void zzh(Y1 y12, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeInt(i8);
        c(5, parcelA);
    }

    @Override // H1.P
    public final boolean zzi() {
        Parcel parcelB = b(3, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
