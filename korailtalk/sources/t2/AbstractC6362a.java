package t2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6362a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f36937a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36938b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected AbstractC6362a(IBinder iBinder, String str) {
        this.f36937a = iBinder;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f36938b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36937a;
    }

    protected final Parcel b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f36937a.transact(i8, parcel, parcelObtain, 0);
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
}
