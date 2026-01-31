package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3982pg implements InterfaceC2650dz0 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f21794b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.pg.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC3982pg zza(int i8) {
            return EnumC3982pg.zzb(i8);
        }
    };
    public static final int zzl = 0;
    public static final int zzm = 1;
    public static final int zzn = 2;
    public static final int zzo = 3;
    public static final int zzp = 4;
    public static final int zzq = 5;
    public static final int zzr = 6;
    public static final int zzs = 7;
    public static final int zzt = 8;
    public static final int zzu = 9;
    public static final int zzv = 10;

    /* renamed from: a, reason: collision with root package name */
    private final int f21796a;

    EnumC3982pg(int i8) {
        this.f21796a = i8;
    }

    public static EnumC3982pg zzb(int i8) {
        switch (i8) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static InterfaceC2765ez0 zzd() {
        return f21794b;
    }

    public static InterfaceC2880fz0 zze() {
        return C4096qg.f21970a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f21796a;
    }
}
