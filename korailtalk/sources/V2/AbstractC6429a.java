package v2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6429a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f37213a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37214b;

    protected AbstractC6429a(IBinder iBinder, String str) {
        this.f37213a = iBinder;
        this.f37214b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f37214b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f37213a;
    }

    protected final void b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f37213a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
