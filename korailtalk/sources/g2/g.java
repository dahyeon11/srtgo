package G2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i2.InterfaceC5677j;
import x2.AbstractC6484a;
import x2.AbstractC6486c;

/* loaded from: classes2.dex */
public final class g extends AbstractC6484a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        b(7, parcelA);
    }

    public final void zaf(InterfaceC5677j interfaceC5677j, int i8, boolean z8) {
        Parcel parcelA = a();
        AbstractC6486c.zad(parcelA, interfaceC5677j);
        parcelA.writeInt(i8);
        AbstractC6486c.zab(parcelA, z8);
        b(9, parcelA);
    }

    public final void zag(j jVar, f fVar) {
        Parcel parcelA = a();
        AbstractC6486c.zac(parcelA, jVar);
        AbstractC6486c.zad(parcelA, fVar);
        b(12, parcelA);
    }
}
