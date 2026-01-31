package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2563dC0 implements InterfaceC2650dz0 {
    SAFE_OR_OTHER(0),
    MALWARE(1),
    PHISHING(2),
    UNWANTED(3),
    BILLING(4);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f18543b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.bC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC2563dC0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f18545a;

    EnumC2563dC0(int i8) {
        this.f18545a = i8;
    }

    public static EnumC2563dC0 zzb(int i8) {
        if (i8 == 0) {
            return SAFE_OR_OTHER;
        }
        if (i8 == 1) {
            return MALWARE;
        }
        if (i8 == 2) {
            return PHISHING;
        }
        if (i8 == 3) {
            return UNWANTED;
        }
        if (i8 != 4) {
            return null;
        }
        return BILLING;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18545a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f18545a;
    }
}
