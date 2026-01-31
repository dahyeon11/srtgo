package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1667Nd0 implements InterfaceC2650dz0 {
    TAG_UNKNOWN(0),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f14929b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Md0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC1667Nd0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f14931a;

    EnumC1667Nd0(int i8) {
        this.f14931a = i8;
    }

    public static EnumC1667Nd0 zzb(int i8) {
        if (i8 != 0) {
            return null;
        }
        return TAG_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f14931a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
