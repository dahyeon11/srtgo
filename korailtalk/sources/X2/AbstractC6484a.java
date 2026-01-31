package x2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6484a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f37504a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37505b;

    protected AbstractC6484a(IBinder iBinder, String str) {
        this.f37504a = iBinder;
        this.f37505b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f37505b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37504a;
    }

    protected final void b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f37504a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void c(int i8, Parcel parcel) {
        try {
            this.f37504a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
