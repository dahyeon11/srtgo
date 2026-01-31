package k2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i2.C5687t;
import x2.AbstractC6484a;
import x2.AbstractC6486c;

/* renamed from: k2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5855j extends AbstractC6484a implements IInterface {
    C5855j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(C5687t c5687t) {
        Parcel parcelA = a();
        AbstractC6486c.zac(parcelA, c5687t);
        c(1, parcelA);
    }
}
