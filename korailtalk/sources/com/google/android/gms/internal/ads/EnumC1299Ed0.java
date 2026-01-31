package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ed0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1299Ed0 implements InterfaceC2650dz0 {
    FORMAT_UNKNOWN(0),
    FORMAT_BANNER(1),
    FORMAT_INTERSTITIAL(2),
    FORMAT_REWARDED(3),
    FORMAT_REWARDED_INTERSTITIAL(4),
    FORMAT_APP_OPEN(5),
    FORMAT_NATIVE(6),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f12833b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Dd0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC1299Ed0 enumC1299Ed0 = EnumC1299Ed0.FORMAT_UNKNOWN;
            switch (i8) {
                case 0:
                    return EnumC1299Ed0.FORMAT_UNKNOWN;
                case 1:
                    return EnumC1299Ed0.FORMAT_BANNER;
                case 2:
                    return EnumC1299Ed0.FORMAT_INTERSTITIAL;
                case 3:
                    return EnumC1299Ed0.FORMAT_REWARDED;
                case 4:
                    return EnumC1299Ed0.FORMAT_REWARDED_INTERSTITIAL;
                case 5:
                    return EnumC1299Ed0.FORMAT_APP_OPEN;
                case 6:
                    return EnumC1299Ed0.FORMAT_NATIVE;
                default:
                    return null;
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f12835a;

    EnumC1299Ed0(int i8) {
        this.f12835a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f12835a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
