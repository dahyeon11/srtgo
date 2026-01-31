package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum Tw0 implements InterfaceC2650dz0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f16547b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Sw0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return Tw0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f16549a;

    Tw0(int i8) {
        this.f16549a = i8;
    }

    public static Tw0 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i8 == 1) {
            return TINK;
        }
        if (i8 == 2) {
            return LEGACY;
        }
        if (i8 == 3) {
            return RAW;
        }
        if (i8 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f16549a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
