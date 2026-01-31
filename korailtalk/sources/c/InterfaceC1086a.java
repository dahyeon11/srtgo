package c;

import Q7.C;
import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1086a extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace(C.INNER_CLASS_SEPARATOR_CHAR, C.PACKAGE_SEPARATOR_CHAR);

    /* renamed from: c.a$b */
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

    void cancel(String str, int i8, String str2);

    void cancelAll(String str);

    void notify(String str, int i8, String str2, Notification notification);

    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0190a extends Binder implements InterfaceC1086a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C0191a implements InterfaceC1086a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11438a;

            C0191a(IBinder iBinder) {
                this.f11438a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11438a;
            }

            @Override // c.InterfaceC1086a
            public void cancel(String str, int i8, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1086a.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i8);
                    parcelObtain.writeString(str2);
                    this.f11438a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.InterfaceC1086a
            public void cancelAll(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1086a.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f11438a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return InterfaceC1086a.DESCRIPTOR;
            }

            @Override // c.InterfaceC1086a
            public void notify(String str, int i8, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1086a.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i8);
                    parcelObtain.writeString(str2);
                    b.d(parcelObtain, notification, 0);
                    this.f11438a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0190a() {
            attachInterface(this, InterfaceC1086a.DESCRIPTOR);
        }

        public static InterfaceC1086a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1086a.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1086a)) ? new C0191a(iBinder) : (InterfaceC1086a) iInterfaceQueryLocalInterface;
        }

        @Override // c.InterfaceC1086a
        public abstract /* synthetic */ void cancel(String str, int i8, String str2);

        @Override // c.InterfaceC1086a
        public abstract /* synthetic */ void cancelAll(String str);

        @Override // c.InterfaceC1086a
        public abstract /* synthetic */ void notify(String str, int i8, String str2, Notification notification);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            String str = InterfaceC1086a.DESCRIPTOR;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i8 == 1) {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) b.c(parcel, Notification.CREATOR));
            } else if (i8 == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i8 != 3) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                cancelAll(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
