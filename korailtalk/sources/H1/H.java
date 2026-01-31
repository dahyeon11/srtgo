package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public final class H extends AbstractC1583Lc implements J {
    H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // H1.J
    public final void zzc() {
        c(6, a());
    }

    @Override // H1.J
    public final void zzd() {
        c(1, a());
    }

    @Override // H1.J
    public final void zze(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(2, parcelA);
    }

    @Override // H1.J
    public final void zzf(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(8, parcelA);
    }

    @Override // H1.J
    public final void zzg() {
        c(7, a());
    }

    @Override // H1.J
    public final void zzh() {
        c(3, a());
    }

    @Override // H1.J
    public final void zzi() {
        c(4, a());
    }

    @Override // H1.J
    public final void zzj() {
        c(5, a());
    }

    @Override // H1.J
    public final void zzk() {
        c(9, a());
    }
}
