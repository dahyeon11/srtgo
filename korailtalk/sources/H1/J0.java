package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public final class J0 extends AbstractC1583Lc implements L0 {
    J0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // H1.L0
    public final void zze(f2 f2Var) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, f2Var);
        c(1, parcelA);
    }

    @Override // H1.L0
    public final boolean zzf() {
        Parcel parcelB = b(2, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
