package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;

/* loaded from: classes.dex */
public abstract class F extends AbstractBinderC1623Mc implements G {
    public F() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb();
}
