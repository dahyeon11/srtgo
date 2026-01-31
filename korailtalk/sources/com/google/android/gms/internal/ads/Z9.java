package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum Z9 implements InterfaceC2650dz0 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f17522b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.X9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return Z9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f17524a;

    Z9(int i8) {
        this.f17524a = i8;
    }

    public static Z9 zzb(int i8) {
        if (i8 == 0) {
            return ENUM_FALSE;
        }
        if (i8 == 1) {
            return ENUM_TRUE;
        }
        if (i8 == 2) {
            return ENUM_FAILURE;
        }
        if (i8 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17524a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f17524a;
    }
}
