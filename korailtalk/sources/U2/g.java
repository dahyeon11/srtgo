package u2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class g extends AbstractC6413a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(X1.d dVar, f fVar) {
        Parcel parcelA = a();
        AbstractC6415c.zzb(parcelA, dVar);
        AbstractC6415c.zzc(parcelA, fVar);
        b(1, parcelA);
    }
}
