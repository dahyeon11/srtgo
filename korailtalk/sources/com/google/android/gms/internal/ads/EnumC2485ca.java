package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2485ca implements InterfaceC2650dz0 {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f18324b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.aa
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC2485ca.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f18326a;

    EnumC2485ca(int i8) {
        this.f18326a = i8;
    }

    public static EnumC2485ca zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_PROTO;
        }
        if (i8 == 1) {
            return AFMA_SIGNALS;
        }
        if (i8 == 2) {
            return UNITY_SIGNALS;
        }
        if (i8 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18326a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f18326a;
    }
}
