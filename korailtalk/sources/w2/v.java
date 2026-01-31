package w2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class v extends d implements w {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // w2.w
    public final void zzc(u uVar, com.google.android.gms.auth.api.credentials.a aVar) {
        Parcel parcelA = a();
        e.zzc(parcelA, uVar);
        e.zzc(parcelA, aVar);
        b(1, parcelA);
    }

    @Override // w2.w
    public final void zzc(u uVar, y yVar) {
        Parcel parcelA = a();
        e.zzc(parcelA, uVar);
        e.zzc(parcelA, yVar);
        b(2, parcelA);
    }

    @Override // w2.w
    public final void zzc(u uVar, s sVar) {
        Parcel parcelA = a();
        e.zzc(parcelA, uVar);
        e.zzc(parcelA, sVar);
        b(3, parcelA);
    }

    @Override // w2.w
    public final void zzc(u uVar) {
        Parcel parcelA = a();
        e.zzc(parcelA, uVar);
        b(4, parcelA);
    }
}
