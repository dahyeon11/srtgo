package i2;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: i2.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5666Z implements InterfaceC5679l {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f31728a;

    C5666Z(IBinder iBinder) {
        this.f31728a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31728a;
    }

    @Override // i2.InterfaceC5679l
    public final void getService(InterfaceC5678k interfaceC5678k, C5673f c5673f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC5678k != null ? interfaceC5678k.asBinder() : null);
            if (c5673f != null) {
                parcelObtain.writeInt(1);
                p0.a(c5673f, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f31728a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
