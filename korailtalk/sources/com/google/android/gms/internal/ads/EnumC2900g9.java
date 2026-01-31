package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2900g9 implements InterfaceC2650dz0 {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f19303b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.e9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC2900g9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f19305a;

    EnumC2900g9(int i8) {
        this.f19305a = i8;
    }

    public static EnumC2900g9 zzb(int i8) {
        if (i8 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i8 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i8 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i8 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i8 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19305a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f19305a;
    }
}
