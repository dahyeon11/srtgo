package k2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x2.AbstractC6484a;
import x2.AbstractC6486c;

/* loaded from: classes.dex */
public final class m extends AbstractC6484a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(l lVar) {
        Parcel parcelA = a();
        AbstractC6486c.zad(parcelA, lVar);
        c(1, parcelA);
    }
}
