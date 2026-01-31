package n1;

import android.util.SparseArray;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5926b {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray f34144a;
    public static final EnumC5926b zza;
    public static final EnumC5926b zzb;
    public static final EnumC5926b zzc;
    public static final EnumC5926b zzd;
    public static final EnumC5926b zze;
    public static final EnumC5926b zzf;

    static {
        EnumC5926b enumC5926b = new EnumC5926b("DEFAULT", 0, 0);
        zza = enumC5926b;
        EnumC5926b enumC5926b2 = new EnumC5926b("UNMETERED_ONLY", 1, 1);
        zzb = enumC5926b2;
        EnumC5926b enumC5926b3 = new EnumC5926b("UNMETERED_OR_DAILY", 2, 2);
        zzc = enumC5926b3;
        EnumC5926b enumC5926b4 = new EnumC5926b("FAST_IF_RADIO_AWAKE", 3, 3);
        zzd = enumC5926b4;
        EnumC5926b enumC5926b5 = new EnumC5926b("NEVER", 4, 4);
        zze = enumC5926b5;
        EnumC5926b enumC5926b6 = new EnumC5926b("UNRECOGNIZED", 5, -1);
        zzf = enumC5926b6;
        SparseArray sparseArray = new SparseArray();
        f34144a = sparseArray;
        sparseArray.put(0, enumC5926b);
        sparseArray.put(1, enumC5926b2);
        sparseArray.put(2, enumC5926b3);
        sparseArray.put(3, enumC5926b4);
        sparseArray.put(4, enumC5926b5);
        sparseArray.put(-1, enumC5926b6);
    }

    private EnumC5926b(String str, int i8, int i9) {
    }
}
