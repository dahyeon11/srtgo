package z2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6618a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f37857a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37858b;

    protected AbstractC6618a(IBinder iBinder, String str) {
        this.f37857a = iBinder;
        this.f37858b = str;
    }

    protected final Parcel a(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f37857a.transact(i8, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37857a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f37858b);
        return parcelObtain;
    }
}
