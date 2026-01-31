package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1146Aj;
import com.google.android.gms.internal.ads.AbstractBinderC1269Dj;
import com.google.android.gms.internal.ads.AbstractBinderC1392Gj;
import com.google.android.gms.internal.ads.AbstractBinderC1556Kj;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractBinderC1719Oj;
import com.google.android.gms.internal.ads.AbstractBinderC1842Rj;
import com.google.android.gms.internal.ads.AbstractBinderC4221rm;
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
public abstract class S extends AbstractBinderC1623Mc implements T {
    public S() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        J h8 = null;
        C0545j0 c0545j0 = null;
        switch (i8) {
            case 1:
                P pZze = zze();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, pZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    h8 = iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new H(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzl(h8);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC1187Bj interfaceC1187BjZzb = AbstractBinderC1146Aj.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzf(interfaceC1187BjZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC1310Ej interfaceC1310EjZzb = AbstractBinderC1269Dj.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzg(interfaceC1310EjZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                InterfaceC1597Lj interfaceC1597LjZzb = AbstractBinderC1556Kj.zzb(parcel.readStrongBinder());
                InterfaceC1433Hj interfaceC1433HjZzb = AbstractBinderC1392Gj.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzh(string, interfaceC1597LjZzb, interfaceC1433HjZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                C1840Ri c1840Ri = (C1840Ri) AbstractC1664Nc.zza(parcel, C1840Ri.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzo(c1840Ri);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0545j0 = iInterfaceQueryLocalInterface2 instanceof C0545j0 ? (C0545j0) iInterfaceQueryLocalInterface2 : new C0545j0(strongBinder2);
                }
                AbstractC1664Nc.zzc(parcel);
                zzq(c0545j0);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC1760Pj interfaceC1760PjZzb = AbstractBinderC1719Oj.zzb(parcel.readStrongBinder());
                d2 d2Var = (d2) AbstractC1664Nc.zza(parcel, d2.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzj(interfaceC1760PjZzb, d2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                B1.g gVar = (B1.g) AbstractC1664Nc.zza(parcel, B1.g.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzp(gVar);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC1883Sj interfaceC1883SjZzb = AbstractBinderC1842Rj.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzk(interfaceC1883SjZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C3197im c3197im = (C3197im) AbstractC1664Nc.zza(parcel, C3197im.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzn(c3197im);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC4335sm interfaceC4335smZzb = AbstractBinderC4221rm.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzi(interfaceC4335smZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                B1.a aVar = (B1.a) AbstractC1664Nc.zza(parcel, B1.a.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzm(aVar);
                parcel2.writeNoException();
                return true;
        }
    }

    public abstract /* synthetic */ P zze();

    public abstract /* synthetic */ void zzf(InterfaceC1187Bj interfaceC1187Bj);

    public abstract /* synthetic */ void zzg(InterfaceC1310Ej interfaceC1310Ej);

    public abstract /* synthetic */ void zzh(String str, InterfaceC1597Lj interfaceC1597Lj, InterfaceC1433Hj interfaceC1433Hj);

    public abstract /* synthetic */ void zzi(InterfaceC4335sm interfaceC4335sm);

    public abstract /* synthetic */ void zzj(InterfaceC1760Pj interfaceC1760Pj, d2 d2Var);

    public abstract /* synthetic */ void zzk(InterfaceC1883Sj interfaceC1883Sj);

    public abstract /* synthetic */ void zzl(J j8);

    public abstract /* synthetic */ void zzm(B1.a aVar);

    public abstract /* synthetic */ void zzn(C3197im c3197im);

    public abstract /* synthetic */ void zzo(C1840Ri c1840Ri);

    public abstract /* synthetic */ void zzp(B1.g gVar);

    public abstract /* synthetic */ void zzq(C0545j0 c0545j0);
}
