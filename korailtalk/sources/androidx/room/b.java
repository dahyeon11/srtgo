package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C0165a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f10647a;

            C0165a(IBinder iBinder) {
                this.f10647a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10647a;
            }

            public String getInterfaceDescriptor() {
                return "androidx.room.IMultiInstanceInvalidationCallback";
            }

            @Override // androidx.room.b
            public void onInvalidation(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f10647a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0165a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // androidx.room.b
        public abstract /* synthetic */ void onInvalidation(String[] strArr);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                onInvalidation(parcel.createStringArray());
                return true;
            }
            if (i8 != 1598968902) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    void onInvalidation(String[] strArr);
}
