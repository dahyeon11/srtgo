package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4615vB0 implements InterfaceC2650dz0 {
    UNKNOWN_USER_POPULATION(0),
    SAFE_BROWSING(1),
    EXTENDED_REPORTING(2),
    ENHANCED_PROTECTION(3);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f23181b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.tB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4615vB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f23183a;

    EnumC4615vB0(int i8) {
        this.f23183a = i8;
    }

    public static EnumC4615vB0 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_USER_POPULATION;
        }
        if (i8 == 1) {
            return SAFE_BROWSING;
        }
        if (i8 == 2) {
            return EXTENDED_REPORTING;
        }
        if (i8 != 3) {
            return null;
        }
        return ENHANCED_PROTECTION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23183a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f23183a;
    }
}
