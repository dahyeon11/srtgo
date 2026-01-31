package u2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6415c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f37104a = AbstractC6415c.class.getClassLoader();

    public static <T extends Parcelable> T zza(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
