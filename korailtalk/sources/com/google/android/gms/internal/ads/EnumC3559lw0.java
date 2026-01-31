package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3559lw0 implements InterfaceC2650dz0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f20789b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.kw0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC3559lw0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f20791a;

    EnumC3559lw0(int i8) {
        this.f20791a = i8;
    }

    public static EnumC3559lw0 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i8 == 1) {
            return SYMMETRIC;
        }
        if (i8 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i8 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i8 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f20791a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
