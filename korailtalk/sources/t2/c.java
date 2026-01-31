package t2;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f36939a = c.class.getClassLoader();

    public static void zza(Parcel parcel, boolean z8) {
        parcel.writeInt(1);
    }

    public static boolean zzb(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
