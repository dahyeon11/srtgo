package B2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: B2.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0443b extends Binder implements IInterface {
    protected AbstractBinderC0443b(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean a(int i8, Parcel parcel, Parcel parcel2, int i9);

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i9)) {
            return true;
        }
        return a(i8, parcel, parcel2, i9);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
