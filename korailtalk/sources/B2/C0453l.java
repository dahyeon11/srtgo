package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: B2.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0453l extends AbstractC0442a implements InterfaceC0455n {
    C0453l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // B2.InterfaceC0455n
    public final void zzd(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC0444c.zze(parcelA, bundle);
        c(1, parcelA);
    }
}
