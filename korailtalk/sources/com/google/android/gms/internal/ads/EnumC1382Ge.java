package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ge, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1382Ge implements InterfaceC2650dz0 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f13182b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Ge.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1382Ge zza(int i8) {
            return EnumC1382Ge.zzb(i8);
        }
    };
    public static final int zzm = 0;
    public static final int zzn = 1;
    public static final int zzo = 2;
    public static final int zzp = 3;
    public static final int zzq = 4;
    public static final int zzr = 5;
    public static final int zzs = 6;
    public static final int zzt = 7;
    public static final int zzu = 8;
    public static final int zzv = 9;
    public static final int zzw = 10;
    public static final int zzx = 11;

    /* renamed from: a, reason: collision with root package name */
    private final int f13184a;

    EnumC1382Ge(int i8) {
        this.f13184a = i8;
    }

    public static EnumC1382Ge zzb(int i8) {
        switch (i8) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    public static InterfaceC2765ez0 zzd() {
        return f13182b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1423He.f13341a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f13184a;
    }
}
