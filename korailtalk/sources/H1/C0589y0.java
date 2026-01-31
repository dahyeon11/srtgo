package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;

/* renamed from: H1.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589y0 extends AbstractC1583Lc implements A0 {
    C0589y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // H1.A0
    public final String zze() {
        Parcel parcelB = b(1, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // H1.A0
    public final String zzf() {
        Parcel parcelB = b(2, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }
}
