package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum JB0 implements InterfaceC2650dz0 {
    ACTION_UNSPECIFIED(0),
    PROCEED(1),
    DISCARD(2),
    KEEP(3),
    CLOSE(4),
    CANCEL(5),
    DISMISS(6),
    BACK(7),
    OPEN_SUBPAGE(8),
    PROCEED_DEEP_SCAN(9),
    OPEN_LEARN_MORE_LINK(10);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f13606b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.HB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return JB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f13608a;

    JB0(int i8) {
        this.f13608a = i8;
    }

    public static JB0 zzb(int i8) {
        switch (i8) {
            case 0:
                return ACTION_UNSPECIFIED;
            case 1:
                return PROCEED;
            case 2:
                return DISCARD;
            case 3:
                return KEEP;
            case 4:
                return CLOSE;
            case 5:
                return CANCEL;
            case 6:
                return DISMISS;
            case 7:
                return BACK;
            case 8:
                return OPEN_SUBPAGE;
            case 9:
                return PROCEED_DEEP_SCAN;
            case 10:
                return OPEN_LEARN_MORE_LINK;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13608a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f13608a;
    }
}
