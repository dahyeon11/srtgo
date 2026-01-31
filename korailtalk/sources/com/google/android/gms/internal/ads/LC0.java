package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum LC0 implements InterfaceC2650dz0 {
    SAFE_BROWSING_URL_API_TYPE_UNSPECIFIED(0),
    PVER3_NATIVE(1),
    PVER4_NATIVE(2),
    ANDROID_SAFETYNET(3),
    FLYWHEEL(4),
    REAL_TIME(5),
    PVER5_NATIVE_REAL_TIME(6),
    ANDROID_SAFEBROWSING_REAL_TIME(7),
    ANDROID_SAFEBROWSING(8);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f14261b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.JC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return LC0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f14263a;

    LC0(int i8) {
        this.f14263a = i8;
    }

    public static LC0 zzb(int i8) {
        switch (i8) {
            case 0:
                return SAFE_BROWSING_URL_API_TYPE_UNSPECIFIED;
            case 1:
                return PVER3_NATIVE;
            case 2:
                return PVER4_NATIVE;
            case 3:
                return ANDROID_SAFETYNET;
            case 4:
                return FLYWHEEL;
            case 5:
                return REAL_TIME;
            case 6:
                return PVER5_NATIVE_REAL_TIME;
            case 7:
                return ANDROID_SAFEBROWSING_REAL_TIME;
            case 8:
                return ANDROID_SAFEBROWSING;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14263a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f14263a;
    }
}
