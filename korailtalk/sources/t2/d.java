package t2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class d extends AbstractC6362a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // t2.f
    public final String zzc() {
        Parcel parcelB = b(1, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // t2.f
    public final boolean zzd() {
        Parcel parcelB = b(6, a());
        boolean zZzb = c.zzb(parcelB);
        parcelB.recycle();
        return zZzb;
    }

    @Override // t2.f
    public final boolean zze(boolean z8) {
        Parcel parcelA = a();
        c.zza(parcelA, true);
        Parcel parcelB = b(2, parcelA);
        boolean zZzb = c.zzb(parcelB);
        parcelB.recycle();
        return zZzb;
    }
}
