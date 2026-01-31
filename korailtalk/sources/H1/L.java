package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public abstract class L extends AbstractBinderC1623Mc implements M {
    public L() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzc();
        } else {
            if (i8 != 2) {
                return false;
            }
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzb(c0534f1);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // H1.M
    public abstract /* synthetic */ void zzb(C0534f1 c0534f1);

    @Override // H1.M
    public abstract /* synthetic */ void zzc();
}
