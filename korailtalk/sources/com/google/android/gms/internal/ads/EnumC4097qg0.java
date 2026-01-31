package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4097qg0 implements InterfaceC2650dz0 {
    BLOCKED_REASON_UNKNOWN(1),
    BLOCKED_REASON_BACKGROUND(2);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f21971b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.ng0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4097qg0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f21973a;

    EnumC4097qg0(int i8) {
        this.f21973a = i8;
    }

    public static EnumC4097qg0 zzb(int i8) {
        if (i8 == 1) {
            return BLOCKED_REASON_UNKNOWN;
        }
        if (i8 != 2) {
            return null;
        }
        return BLOCKED_REASON_BACKGROUND;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21973a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f21973a;
    }
}
