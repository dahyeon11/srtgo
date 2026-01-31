package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum OB0 implements InterfaceC2650dz0 {
    SURFACE_UNSPECIFIED(0),
    BUBBLE_MAINPAGE(1),
    BUBBLE_SUBPAGE(2),
    DOWNLOADS_PAGE(3),
    DOWNLOAD_PROMPT(4),
    DOWNLOAD_NOTIFICATION(5);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f15060b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.LB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return OB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f15062a;

    OB0(int i8) {
        this.f15062a = i8;
    }

    public static OB0 zzb(int i8) {
        if (i8 == 0) {
            return SURFACE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return BUBBLE_MAINPAGE;
        }
        if (i8 == 2) {
            return BUBBLE_SUBPAGE;
        }
        if (i8 == 3) {
            return DOWNLOADS_PAGE;
        }
        if (i8 == 4) {
            return DOWNLOAD_PROMPT;
        }
        if (i8 != 5) {
            return null;
        }
        return DOWNLOAD_NOTIFICATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15062a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f15062a;
    }
}
