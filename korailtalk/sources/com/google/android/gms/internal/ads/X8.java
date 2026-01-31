package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum X8 implements InterfaceC2650dz0 {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f17134b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.V8
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return X8.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f17136a;

    X8(int i8) {
        this.f17136a = i8;
    }

    public static X8 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN;
        }
        if (i8 == 1) {
            return ENABLED;
        }
        if (i8 != 2) {
            return null;
        }
        return DISABLED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17136a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f17136a;
    }
}
