package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1381Gd0 implements InterfaceC2650dz0 {
    ORIENTATION_UNKNOWN(0),
    ORIENTATION_PORTRAIT(1),
    ORIENTATION_LANDSCAPE(2),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f13179b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Fd0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC1381Gd0 enumC1381Gd0 = EnumC1381Gd0.ORIENTATION_UNKNOWN;
            if (i8 == 0) {
                return EnumC1381Gd0.ORIENTATION_UNKNOWN;
            }
            if (i8 == 1) {
                return EnumC1381Gd0.ORIENTATION_PORTRAIT;
            }
            if (i8 != 2) {
                return null;
            }
            return EnumC1381Gd0.ORIENTATION_LANDSCAPE;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f13181a;

    EnumC1381Gd0(int i8) {
        this.f13181a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f13181a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
