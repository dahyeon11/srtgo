package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1631Mg implements InterfaceC2650dz0 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f14677b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Mg.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1631Mg zza(int i8) {
            return EnumC1631Mg.zzb(i8);
        }
    };
    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final int f14679a;

    EnumC1631Mg(int i8) {
        this.f14679a = i8;
    }

    public static EnumC1631Mg zzb(int i8) {
        if (i8 == 0) {
            return ENUM_FALSE;
        }
        if (i8 == 1) {
            return ENUM_TRUE;
        }
        if (i8 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static InterfaceC2765ez0 zzd() {
        return f14677b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1672Ng.f14941a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f14679a;
    }
}
