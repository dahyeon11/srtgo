package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum D9 implements InterfaceC2650dz0 {
    TRIGGER_UNSPECIFIED(0),
    NO_TRIGGER(1),
    ON_BACK_PRESSED(2),
    HANDLE_ON_BACK_PRESSED(3),
    ON_KEY_DOWN(4),
    ON_BACK_INVOKED(5),
    ON_CREATE(6),
    ON_START(7),
    ON_RESUME(8),
    ON_RESTART(9),
    ON_PAUSE(10),
    ON_STOP(11),
    ON_DESTROY(12),
    ERROR_EMPTY_STACK_TRACE(13);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f12645b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.B9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return D9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f12647a;

    D9(int i8) {
        this.f12647a = i8;
    }

    public static D9 zzb(int i8) {
        switch (i8) {
            case 0:
                return TRIGGER_UNSPECIFIED;
            case 1:
                return NO_TRIGGER;
            case 2:
                return ON_BACK_PRESSED;
            case 3:
                return HANDLE_ON_BACK_PRESSED;
            case 4:
                return ON_KEY_DOWN;
            case 5:
                return ON_BACK_INVOKED;
            case 6:
                return ON_CREATE;
            case 7:
                return ON_START;
            case 8:
                return ON_RESUME;
            case 9:
                return ON_RESTART;
            case 10:
                return ON_PAUSE;
            case 11:
                return ON_STOP;
            case 12:
                return ON_DESTROY;
            case 13:
                return ERROR_EMPTY_STACK_TRACE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12647a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f12647a;
    }
}
