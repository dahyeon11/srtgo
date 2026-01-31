package H1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Q0 extends AbstractC1583Lc implements S0 {
    Q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // H1.S0
    public final Bundle zze() {
        Parcel parcelB = b(5, a());
        Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        return bundle;
    }

    @Override // H1.S0
    public final h2 zzf() {
        Parcel parcelB = b(4, a());
        h2 h2Var = (h2) AbstractC1664Nc.zza(parcelB, h2.CREATOR);
        parcelB.recycle();
        return h2Var;
    }

    @Override // H1.S0
    public final String zzg() {
        Parcel parcelB = b(1, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // H1.S0
    public final String zzh() {
        Parcel parcelB = b(6, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // H1.S0
    public final String zzi() {
        Parcel parcelB = b(2, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // H1.S0
    public final List zzj() {
        Parcel parcelB = b(3, a());
        ArrayList arrayListCreateTypedArrayList = parcelB.createTypedArrayList(h2.CREATOR);
        parcelB.recycle();
        return arrayListCreateTypedArrayList;
    }
}
