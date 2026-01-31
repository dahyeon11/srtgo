package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum VC0 implements InterfaceC2650dz0 {
    UNKNOWN(0),
    PHISHING_INTERSTITIAL(1),
    CLIENT_SIDE_PHISHING_INTERSTITIAL(2),
    MALWARE_INTERSTITIAL(3),
    UWS_INTERSTITIAL(4),
    BILLING_INTERSTITIAL(5),
    BINARY_MALWARE_DOWNLOAD_WARNING(6);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f16806b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.TC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return VC0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f16808a;

    VC0(int i8) {
        this.f16808a = i8;
    }

    public static VC0 zzb(int i8) {
        switch (i8) {
            case 0:
                return UNKNOWN;
            case 1:
                return PHISHING_INTERSTITIAL;
            case 2:
                return CLIENT_SIDE_PHISHING_INTERSTITIAL;
            case 3:
                return MALWARE_INTERSTITIAL;
            case 4:
                return UWS_INTERSTITIAL;
            case 5:
                return BILLING_INTERSTITIAL;
            case 6:
                return BINARY_MALWARE_DOWNLOAD_WARNING;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16808a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f16808a;
    }
}
