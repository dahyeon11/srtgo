package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3366kD0 implements InterfaceC2650dz0 {
    EVENT_URL(1),
    LANDING_PAGE(2),
    LANDING_REFERRER(3),
    CLIENT_REDIRECT(4),
    SERVER_REDIRECT(5),
    RECENT_NAVIGATION(6),
    REFERRER(7);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f20376b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.iD0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC3366kD0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f20378a;

    EnumC3366kD0(int i8) {
        this.f20378a = i8;
    }

    public static EnumC3366kD0 zzb(int i8) {
        switch (i8) {
            case 1:
                return EVENT_URL;
            case 2:
                return LANDING_PAGE;
            case 3:
                return LANDING_REFERRER;
            case 4:
                return CLIENT_REDIRECT;
            case 5:
                return SERVER_REDIRECT;
            case 6:
                return RECENT_NAVIGATION;
            case 7:
                return REFERRER;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f20378a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f20378a;
    }
}
