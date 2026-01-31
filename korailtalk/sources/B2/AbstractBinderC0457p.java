package B2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: B2.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0457p extends AbstractBinderC0443b implements InterfaceC0458q {
    public AbstractBinderC0457p() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // B2.AbstractBinderC0443b
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
            long j8 = parcel.readLong();
            AbstractC0444c.zzc(parcel);
            zze(string, string2, bundle, j8);
            parcel2.writeNoException();
        } else {
            if (i8 != 2) {
                return false;
            }
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        }
        return true;
    }

    public abstract /* synthetic */ int zzd();

    public abstract /* synthetic */ void zze(String str, String str2, Bundle bundle, long j8);
}
