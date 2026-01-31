package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum V9 implements InterfaceC2650dz0 {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f16786b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.T9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return V9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f16788a;

    V9(int i8) {
        this.f16788a = i8;
    }

    public static V9 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i8 == 1) {
            return BITSLICER;
        }
        if (i8 == 2) {
            return TINK_HYBRID;
        }
        if (i8 == 3) {
            return UNENCRYPTED;
        }
        if (i8 == 4) {
            return DG;
        }
        if (i8 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16788a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f16788a;
    }
}
