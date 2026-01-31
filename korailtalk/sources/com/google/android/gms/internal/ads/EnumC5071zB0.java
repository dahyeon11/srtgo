package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5071zB0 implements InterfaceC2650dz0 {
    SAFE(0),
    DANGEROUS(1),
    UNCOMMON(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4),
    UNKNOWN(5),
    PLAY_POLICY_VIOLATION_SEVERE(6),
    PLAY_POLICY_VIOLATION_OTHER(7),
    DANGEROUS_ACCOUNT_COMPROMISE(8),
    PENDING(9),
    PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE(10),
    HIGH_RISK_BLOCK(11),
    HIGH_RISK_WARN(12);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f24129b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.xB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC5071zB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f24131a;

    EnumC5071zB0(int i8) {
        this.f24131a = i8;
    }

    public static EnumC5071zB0 zzb(int i8) {
        switch (i8) {
            case 0:
                return SAFE;
            case 1:
                return DANGEROUS;
            case 2:
                return UNCOMMON;
            case 3:
                return POTENTIALLY_UNWANTED;
            case 4:
                return DANGEROUS_HOST;
            case 5:
                return UNKNOWN;
            case 6:
                return PLAY_POLICY_VIOLATION_SEVERE;
            case 7:
                return PLAY_POLICY_VIOLATION_OTHER;
            case 8:
                return DANGEROUS_ACCOUNT_COMPROMISE;
            case 9:
                return PENDING;
            case 10:
                return PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE;
            case 11:
                return HIGH_RISK_BLOCK;
            case 12:
                return HIGH_RISK_WARN;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f24131a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f24131a;
    }
}
