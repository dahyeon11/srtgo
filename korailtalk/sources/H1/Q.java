package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.C1840Ri;
import com.google.android.gms.internal.ads.C3197im;
import com.google.android.gms.internal.ads.InterfaceC1187Bj;
import com.google.android.gms.internal.ads.InterfaceC1310Ej;
import com.google.android.gms.internal.ads.InterfaceC1433Hj;
import com.google.android.gms.internal.ads.InterfaceC1597Lj;
import com.google.android.gms.internal.ads.InterfaceC1760Pj;
import com.google.android.gms.internal.ads.InterfaceC1883Sj;
import com.google.android.gms.internal.ads.InterfaceC4335sm;

/* loaded from: classes.dex */
public final class Q extends AbstractC1583Lc implements T {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // H1.T
    public final P zze() {
        P n8;
        Parcel parcelB = b(1, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            n8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            n8 = iInterfaceQueryLocalInterface instanceof P ? (P) iInterfaceQueryLocalInterface : new N(strongBinder);
        }
        parcelB.recycle();
        return n8;
    }

    @Override // H1.T
    public final void zzf(InterfaceC1187Bj interfaceC1187Bj) {
        throw null;
    }

    @Override // H1.T
    public final void zzg(InterfaceC1310Ej interfaceC1310Ej) {
        throw null;
    }

    @Override // H1.T
    public final void zzh(String str, InterfaceC1597Lj interfaceC1597Lj, InterfaceC1433Hj interfaceC1433Hj) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1597Lj);
        AbstractC1664Nc.zzf(parcelA, interfaceC1433Hj);
        c(5, parcelA);
    }

    @Override // H1.T
    public final void zzi(InterfaceC4335sm interfaceC4335sm) {
        throw null;
    }

    @Override // H1.T
    public final void zzj(InterfaceC1760Pj interfaceC1760Pj, d2 d2Var) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1760Pj);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        c(8, parcelA);
    }

    @Override // H1.T
    public final void zzk(InterfaceC1883Sj interfaceC1883Sj) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1883Sj);
        c(10, parcelA);
    }

    @Override // H1.T
    public final void zzl(J j8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, j8);
        c(2, parcelA);
    }

    @Override // H1.T
    public final void zzm(B1.a aVar) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, aVar);
        c(15, parcelA);
    }

    @Override // H1.T
    public final void zzn(C3197im c3197im) {
        throw null;
    }

    @Override // H1.T
    public final void zzo(C1840Ri c1840Ri) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1840Ri);
        c(6, parcelA);
    }

    @Override // H1.T
    public final void zzp(B1.g gVar) {
        throw null;
    }

    @Override // H1.T
    public final void zzq(C0545j0 c0545j0) {
        throw null;
    }
}
