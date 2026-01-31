package w2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class d implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f37378a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37379b;

    protected d(IBinder iBinder, String str) {
        this.f37378a = iBinder;
        this.f37379b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f37379b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f37378a;
    }

    protected final void b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f37378a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
