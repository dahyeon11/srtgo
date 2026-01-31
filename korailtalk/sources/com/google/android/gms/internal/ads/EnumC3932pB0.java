package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3932pB0 implements InterfaceC2650dz0 {
    UNKNOWN(0),
    UNAVAILABLE(1),
    NOT_MANAGED(2),
    ENTERPRISE_MANAGED(3);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f21683b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.nB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC3932pB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f21685a;

    EnumC3932pB0(int i8) {
        this.f21685a = i8;
    }

    public static EnumC3932pB0 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN;
        }
        if (i8 == 1) {
            return UNAVAILABLE;
        }
        if (i8 == 2) {
            return NOT_MANAGED;
        }
        if (i8 != 3) {
            return null;
        }
        return ENTERPRISE_MANAGED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21685a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f21685a;
    }
}
