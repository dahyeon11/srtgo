package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Me, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1627Me implements InterfaceC2650dz0 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f14671b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Me.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1627Me zza(int i8) {
            return EnumC1627Me.zzb(i8);
        }
    };
    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 4;

    /* renamed from: a, reason: collision with root package name */
    private final int f14673a;

    EnumC1627Me(int i8) {
        this.f14673a = i8;
    }

    public static EnumC1627Me zzb(int i8) {
        if (i8 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return TWO_G;
        }
        if (i8 == 2) {
            return THREE_G;
        }
        if (i8 != 4) {
            return null;
        }
        return LTE;
    }

    public static InterfaceC2765ez0 zzd() {
        return f14671b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1668Ne.f14932a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f14673a;
    }
}
