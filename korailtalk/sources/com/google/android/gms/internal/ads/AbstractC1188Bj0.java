package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1188Bj0 {
    private static String a(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC1802Qj0.zzb("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC1802Qj0.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }

    public static int zza(int i8, int i9, String str) {
        String strZzb;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            strZzb = AbstractC1802Qj0.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            strZzb = AbstractC1802Qj0.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(a(i8, i9, "index"));
        }
        return i8;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC1802Qj0.zzb(str, obj2));
    }

    public static void zze(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z8, String str, long j8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC1802Qj0.zzb(str, Long.valueOf(j8)));
        }
    }

    public static void zzh(boolean z8, String str, int i8, int i9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC1802Qj0.zzb(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static void zzi(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? a(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? a(i9, i10, "end index") : AbstractC1802Qj0.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    public static void zzj(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void zzk(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException((String) obj);
        }
    }
}
