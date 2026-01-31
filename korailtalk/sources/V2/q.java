package v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class q extends Binder implements IInterface {
    protected q(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean a(int i8, Parcel parcel, Parcel parcel2, int i9);

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
        boolean zOnTransact;
        if (i8 > 16777215) {
            zOnTransact = super.onTransact(i8, parcel, parcel2, i9);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return a(i8, parcel, parcel2, i9);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
