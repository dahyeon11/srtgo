package B2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: B2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0442a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f269a;

    /* renamed from: b, reason: collision with root package name */
    private final String f270b;

    protected AbstractC0442a(IBinder iBinder, String str) {
        this.f269a = iBinder;
        this.f270b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f270b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f269a;
    }

    protected final Parcel b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f269a.transact(i8, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void c(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f269a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
