package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ld0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1586Ld0 implements InterfaceC2650dz0 {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f14332b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Kd0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC1586Ld0 enumC1586Ld0 = EnumC1586Ld0.SCAR_REQUEST_TYPE_ADMOB;
            switch (i8) {
                case -1:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                case 0:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_ADMOB;
                case 1:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                case 2:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_GBID;
                case 3:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_GOLDENEYE;
                case 4:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_YAVIN;
                case 5:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_UNITY;
                case 6:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_PAW;
                case 7:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_GUILDER;
                case 8:
                    return EnumC1586Ld0.SCAR_REQUEST_TYPE_GAM_S2S;
                default:
                    return null;
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f14334a;

    EnumC1586Ld0(int i8) {
        this.f14334a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f14334a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
