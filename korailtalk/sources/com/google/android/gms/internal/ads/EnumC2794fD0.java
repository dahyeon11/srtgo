package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2794fD0 implements InterfaceC2650dz0 {
    UNDEFINED(0),
    BROWSER_INITIATED(1),
    RENDERER_INITIATED_WITHOUT_USER_GESTURE(2),
    RENDERER_INITIATED_WITH_USER_GESTURE(3),
    COPY_PASTE_USER_INITIATED(4),
    NOTIFICATION_INITIATED(5);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f19136b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.dD0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC2794fD0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f19138a;

    EnumC2794fD0(int i8) {
        this.f19138a = i8;
    }

    public static EnumC2794fD0 zzb(int i8) {
        if (i8 == 0) {
            return UNDEFINED;
        }
        if (i8 == 1) {
            return BROWSER_INITIATED;
        }
        if (i8 == 2) {
            return RENDERER_INITIATED_WITHOUT_USER_GESTURE;
        }
        if (i8 == 3) {
            return RENDERER_INITIATED_WITH_USER_GESTURE;
        }
        if (i8 == 4) {
            return COPY_PASTE_USER_INITIATED;
        }
        if (i8 != 5) {
            return null;
        }
        return NOTIFICATION_INITIATED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19138a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f19138a;
    }
}
