package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4268s9 implements InterfaceC2650dz0 {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7),
    DEVICE_IDENTIFIER_PER_APP_ID_V2(8),
    DEVICE_IDENTIFIER_CONNECTED_TV_IFA(9);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f22582b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.q9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4268s9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f22584a;

    EnumC4268s9(int i8) {
        this.f22584a = i8;
    }

    public static EnumC4268s9 zzb(int i8) {
        switch (i8) {
            case 0:
                return DEVICE_IDENTIFIER_NO_ID;
            case 1:
                return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
            case 2:
                return DEVICE_IDENTIFIER_GLOBAL_ID;
            case 3:
                return DEVICE_IDENTIFIER_ADVERTISER_ID;
            case 4:
                return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
            case 5:
                return DEVICE_IDENTIFIER_ANDROID_AD_ID;
            case 6:
                return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
            case 7:
                return DEVICE_IDENTIFIER_PER_APP_ID;
            case 8:
                return DEVICE_IDENTIFIER_PER_APP_ID_V2;
            case 9:
                return DEVICE_IDENTIFIER_CONNECTED_TV_IFA;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22584a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f22584a;
    }
}
