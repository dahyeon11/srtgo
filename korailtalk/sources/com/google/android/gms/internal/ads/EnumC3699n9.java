package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3699n9 implements InterfaceC2650dz0 {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f21208b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.l9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC3699n9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f21210a;

    EnumC3699n9(int i8) {
        this.f21210a = i8;
    }

    public static EnumC3699n9 zzb(int i8) {
        switch (i8) {
            case 0:
                return DEBUGGER_STATE_UNSPECIFIED;
            case 1:
                return DEBUGGER_STATE_NOT_INSTALLED;
            case 2:
                return DEBUGGER_STATE_INSTALLED;
            case 3:
                return DEBUGGER_STATE_ACTIVE;
            case 4:
                return DEBUGGER_STATE_ENVVAR;
            case 5:
                return DEBUGGER_STATE_MACHPORT;
            case 6:
                return DEBUGGER_STATE_ENVVAR_MACHPORT;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21210a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f21210a;
    }
}
