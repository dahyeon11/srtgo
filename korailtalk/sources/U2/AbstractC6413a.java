package u2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6413a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f37102a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37103b = "com.google.android.gms.appset.internal.IAppSetService";

    protected AbstractC6413a(IBinder iBinder, String str) {
        this.f37102a = iBinder;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f37103b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37102a;
    }

    protected final void b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f37102a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
