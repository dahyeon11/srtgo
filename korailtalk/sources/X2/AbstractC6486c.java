package x2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6486c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f37506a = AbstractC6486c.class.getClassLoader();

    public static <T extends Parcelable> T zaa(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zab(Parcel parcel, boolean z8) {
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void zac(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zad(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
