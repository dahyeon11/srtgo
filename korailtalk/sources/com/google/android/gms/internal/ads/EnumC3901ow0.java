package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ow0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3901ow0 implements InterfaceC2650dz0 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f21579b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.nw0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC3901ow0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f21581a;

    EnumC3901ow0(int i8) {
        this.f21581a = i8;
    }

    public static EnumC3901ow0 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i8 == 1) {
            return ENABLED;
        }
        if (i8 == 2) {
            return DISABLED;
        }
        if (i8 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f21581a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
