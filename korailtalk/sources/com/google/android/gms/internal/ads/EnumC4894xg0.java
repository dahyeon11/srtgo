package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4894xg0 implements InterfaceC2650dz0 {
    EVENT_TYPE_UNKNOWN(0),
    BLOCKED_IMPRESSION(1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f23777b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.vg0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4894xg0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f23779a;

    EnumC4894xg0(int i8) {
        this.f23779a = i8;
    }

    public static EnumC4894xg0 zzb(int i8) {
        if (i8 == 0) {
            return EVENT_TYPE_UNKNOWN;
        }
        if (i8 != 1) {
            return null;
        }
        return BLOCKED_IMPRESSION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23779a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f23779a;
    }
}
