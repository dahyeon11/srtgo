package B2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: B2.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0454m extends AbstractBinderC0443b implements InterfaceC0455n {
    public AbstractBinderC0454m() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // B2.AbstractBinderC0443b
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
        AbstractC0444c.zzc(parcel);
        zzd(bundle);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzd(Bundle bundle);
}
