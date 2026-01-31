package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum EC0 implements InterfaceC2650dz0 {
    AD_RESOURCE_UNKNOWN(0),
    AD_RESOURCE_CREATIVE(1),
    AD_RESOURCE_POST_CLICK(2),
    AD_RESOURCE_AUTO_CLICK_DESTINATION(3);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f12792b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.CC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EC0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f12794a;

    EC0(int i8) {
        this.f12794a = i8;
    }

    public static EC0 zzb(int i8) {
        if (i8 == 0) {
            return AD_RESOURCE_UNKNOWN;
        }
        if (i8 == 1) {
            return AD_RESOURCE_CREATIVE;
        }
        if (i8 == 2) {
            return AD_RESOURCE_POST_CLICK;
        }
        if (i8 != 3) {
            return null;
        }
        return AD_RESOURCE_AUTO_CLICK_DESTINATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12794a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f12794a;
    }
}
