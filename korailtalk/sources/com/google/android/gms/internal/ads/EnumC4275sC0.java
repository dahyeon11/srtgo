package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4275sC0 implements InterfaceC2650dz0 {
    UNSPECIFIED(0),
    PHISHY_CLICK_EVENT(1),
    PHISHY_KEY_EVENT(2),
    PHISHY_PASTE_EVENT(3);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f22599b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.qC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4275sC0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f22601a;

    EnumC4275sC0(int i8) {
        this.f22601a = i8;
    }

    public static EnumC4275sC0 zzb(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 == 1) {
            return PHISHY_CLICK_EVENT;
        }
        if (i8 == 2) {
            return PHISHY_KEY_EVENT;
        }
        if (i8 != 3) {
            return null;
        }
        return PHISHY_PASTE_EVENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22601a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f22601a;
    }
}
