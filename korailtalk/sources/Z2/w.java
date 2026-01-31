package z2;

/* loaded from: classes2.dex */
public abstract class w {
    private static String a(int i8, int i9, String str) {
        if (i8 < 0) {
            return x.zza("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return x.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }

    public static int zza(int i8, int i9, String str) {
        String strZza;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            strZza = x.zza("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            strZza = x.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(a(i8, i9, "index"));
        }
        return i8;
    }

    public static void zzc(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? a(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? a(i9, i10, "end index") : x.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }
}
