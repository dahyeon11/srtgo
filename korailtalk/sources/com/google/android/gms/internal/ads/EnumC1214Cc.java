package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1214Cc implements InterfaceC2650dz0 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f12557b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Bc
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC1214Cc enumC1214Cc = EnumC1214Cc.UNSUPPORTED;
            if (i8 == 0) {
                return EnumC1214Cc.UNSUPPORTED;
            }
            if (i8 == 2) {
                return EnumC1214Cc.ARM7;
            }
            if (i8 == 999) {
                return EnumC1214Cc.UNKNOWN;
            }
            if (i8 == 4) {
                return EnumC1214Cc.X86;
            }
            if (i8 == 5) {
                return EnumC1214Cc.ARM64;
            }
            if (i8 == 6) {
                return EnumC1214Cc.X86_64;
            }
            if (i8 != 7) {
                return null;
            }
            return EnumC1214Cc.RISCV64;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f12559a;

    EnumC1214Cc(int i8) {
        this.f12559a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12559a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f12559a;
    }
}
