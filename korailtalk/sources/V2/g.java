package v2;

import a2.C0829b;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class g extends AbstractC6429a implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    @Override // v2.f
    public final void zza(d dVar, C0829b c0829b) {
        Parcel parcelA = a();
        r.zza(parcelA, dVar);
        r.zza(parcelA, c0829b);
        b(1, parcelA);
    }

    @Override // v2.f
    public final void zza(d dVar) {
        Parcel parcelA = a();
        r.zza(parcelA, dVar);
        b(3, parcelA);
    }
}
