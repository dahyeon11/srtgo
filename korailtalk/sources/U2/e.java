package u2;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class e extends AbstractBinderC6414b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // u2.AbstractBinderC6414b
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        zzb((Status) AbstractC6415c.zza(parcel, Status.CREATOR), (X1.f) AbstractC6415c.zza(parcel, X1.f.CREATOR));
        return true;
    }

    @Override // u2.f
    public abstract /* synthetic */ void zzb(Status status, X1.f fVar);
}
