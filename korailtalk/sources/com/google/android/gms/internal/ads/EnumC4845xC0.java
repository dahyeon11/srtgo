package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4845xC0 implements InterfaceC2650dz0 {
    TYPE_UNKNOWN(0),
    TYPE_CREATIVE(1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f23666b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.vC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC4845xC0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f23668a;

    EnumC4845xC0(int i8) {
        this.f23668a = i8;
    }

    public static EnumC4845xC0 zzb(int i8) {
        if (i8 == 0) {
            return TYPE_UNKNOWN;
        }
        if (i8 != 1) {
            return null;
        }
        return TYPE_CREATIVE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23668a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f23668a;
    }
}
