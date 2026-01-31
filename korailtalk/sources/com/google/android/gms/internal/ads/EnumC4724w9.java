package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4724w9 implements InterfaceC2650dz0 {
    FUNCTION_UNSPECIFIED(0),
    FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS(1),
    FUNCTION_METHOD_SETIMPLEMENTATIONS(2),
    FUNCTION_CLASS_ADDMETHOD(3),
    FUNCTION_CLASS_REPLACEMETHOD(4);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f23422b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.t9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4724w9.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f23424a;

    EnumC4724w9(int i8) {
        this.f23424a = i8;
    }

    public static EnumC4724w9 zzb(int i8) {
        if (i8 == 0) {
            return FUNCTION_UNSPECIFIED;
        }
        if (i8 == 1) {
            return FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS;
        }
        if (i8 == 2) {
            return FUNCTION_METHOD_SETIMPLEMENTATIONS;
        }
        if (i8 == 3) {
            return FUNCTION_CLASS_ADDMETHOD;
        }
        if (i8 != 4) {
            return null;
        }
        return FUNCTION_CLASS_REPLACEMETHOD;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23424a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f23424a;
    }
}
