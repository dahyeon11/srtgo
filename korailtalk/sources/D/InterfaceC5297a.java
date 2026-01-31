package d;

import Q7.C;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5297a extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver".replace(C.INNER_CLASS_SEPARATOR_CHAR, C.PACKAGE_SEPARATOR_CHAR);

    /* renamed from: d.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i8) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i8);
            }
        }
    }

    void send(int i8, Bundle bundle);

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0267a extends Binder implements InterfaceC5297a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        private static class C0268a implements InterfaceC5297a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f29927a;

            C0268a(IBinder iBinder) {
                this.f29927a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29927a;
            }

            public String getInterfaceDescriptor() {
                return InterfaceC5297a.DESCRIPTOR;
            }

            @Override // d.InterfaceC5297a
            public void send(int i8, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5297a.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    b.d(parcelObtain, bundle, 0);
                    this.f29927a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0267a() {
            attachInterface(this, InterfaceC5297a.DESCRIPTOR);
        }

        public static InterfaceC5297a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC5297a.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5297a)) ? new C0268a(iBinder) : (InterfaceC5297a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            String str = InterfaceC5297a.DESCRIPTOR;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            send(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // d.InterfaceC5297a
        public abstract /* synthetic */ void send(int i8, Bundle bundle);

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
