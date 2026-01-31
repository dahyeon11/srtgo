package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public final class W0 extends AbstractC1583Lc implements Y0 {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // H1.Y0
    public final void zze() {
        c(4, a());
    }

    @Override // H1.Y0
    public final void zzf(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(5, parcelA);
    }

    @Override // H1.Y0
    public final void zzg() {
        c(3, a());
    }

    @Override // H1.Y0
    public final void zzh() {
        c(2, a());
    }

    @Override // H1.Y0
    public final void zzi() {
        c(1, a());
    }
}
