package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1709Oe implements InterfaceC2650dz0 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f15141b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Oe.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1709Oe zza(int i8) {
            return EnumC1709Oe.zzb(i8);
        }
    };
    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f15143a;

    EnumC1709Oe(int i8) {
        this.f15143a = i8;
    }

    public static EnumC1709Oe zzb(int i8) {
        if (i8 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return CELL;
        }
        if (i8 != 2) {
            return null;
        }
        return WIFI;
    }

    public static InterfaceC2765ez0 zzd() {
        return f15141b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1750Pe.f15385a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f15143a;
    }
}
