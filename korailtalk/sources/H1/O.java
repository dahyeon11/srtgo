package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public abstract class O extends AbstractBinderC1623Mc implements P {
    public O() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Y1 y12 = (Y1) AbstractC1664Nc.zza(parcel, Y1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzg(y12);
            parcel2.writeNoException();
        } else if (i8 == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i8 == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i10 = AbstractC1664Nc.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i8 == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i8 != 5) {
                return false;
            }
            Y1 y13 = (Y1) AbstractC1664Nc.zza(parcel, Y1.CREATOR);
            int i11 = parcel.readInt();
            AbstractC1664Nc.zzc(parcel);
            zzh(y13, i11);
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // H1.P
    public abstract /* synthetic */ String zze();

    @Override // H1.P
    public abstract /* synthetic */ String zzf();

    @Override // H1.P
    public abstract /* synthetic */ void zzg(Y1 y12);

    @Override // H1.P
    public abstract /* synthetic */ void zzh(Y1 y12, int i8);

    @Override // H1.P
    public abstract /* synthetic */ boolean zzi();
}
