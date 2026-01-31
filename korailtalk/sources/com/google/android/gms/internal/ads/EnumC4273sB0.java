package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4273sB0 implements InterfaceC2650dz0 {
    UNSPECIFIED(0),
    TAILORED_WARNING_CT_BASE(1),
    TAILORED_WARNING_CT(2),
    TAILORED_WARNING_CT_ACCOUNT_INFO(3),
    TAILORED_WARNING_SUSPICIOUS_BASE(4),
    TAILORED_WARNING_SUSPICIOUS(5);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f22596b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.qB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4273sB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f22598a;

    EnumC4273sB0(int i8) {
        this.f22598a = i8;
    }

    public static EnumC4273sB0 zzb(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 == 1) {
            return TAILORED_WARNING_CT_BASE;
        }
        if (i8 == 2) {
            return TAILORED_WARNING_CT;
        }
        if (i8 == 3) {
            return TAILORED_WARNING_CT_ACCOUNT_INFO;
        }
        if (i8 == 4) {
            return TAILORED_WARNING_SUSPICIOUS_BASE;
        }
        if (i8 != 5) {
            return null;
        }
        return TAILORED_WARNING_SUSPICIOUS;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22598a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f22598a;
    }
}
