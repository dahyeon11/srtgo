package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public final class T0 extends AbstractC1583Lc implements V0 {
    T0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // H1.V0
    public final float zze() {
        throw null;
    }

    @Override // H1.V0
    public final float zzf() {
        throw null;
    }

    @Override // H1.V0
    public final float zzg() {
        throw null;
    }

    @Override // H1.V0
    public final int zzh() {
        Parcel parcelB = b(5, a());
        int i8 = parcelB.readInt();
        parcelB.recycle();
        return i8;
    }

    @Override // H1.V0
    public final Y0 zzi() {
        Y0 w02;
        Parcel parcelB = b(11, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            w02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            w02 = iInterfaceQueryLocalInterface instanceof Y0 ? (Y0) iInterfaceQueryLocalInterface : new W0(strongBinder);
        }
        parcelB.recycle();
        return w02;
    }

    @Override // H1.V0
    public final void zzj(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(3, parcelA);
    }

    @Override // H1.V0
    public final void zzk() {
        c(2, a());
    }

    @Override // H1.V0
    public final void zzl() {
        c(1, a());
    }

    @Override // H1.V0
    public final void zzm(Y0 y02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, y02);
        c(8, parcelA);
    }

    @Override // H1.V0
    public final void zzn() {
        c(13, a());
    }

    @Override // H1.V0
    public final boolean zzo() {
        Parcel parcelB = b(12, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // H1.V0
    public final boolean zzp() {
        Parcel parcelB = b(10, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // H1.V0
    public final boolean zzq() {
        Parcel parcelB = b(4, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
