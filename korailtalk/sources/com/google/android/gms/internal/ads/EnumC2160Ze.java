package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2160Ze implements InterfaceC2650dz0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f17615b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Ze.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC2160Ze zza(int i8) {
            return EnumC2160Ze.zzb(i8);
        }
    };
    public static final int zzg = 0;
    public static final int zzh = 1;
    public static final int zzi = 2;
    public static final int zzj = 3;
    public static final int zzk = 4;
    public static final int zzl = 5;

    /* renamed from: a, reason: collision with root package name */
    private final int f17617a;

    EnumC2160Ze(int i8) {
        this.f17617a = i8;
    }

    public static EnumC2160Ze zzb(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 == 1) {
            return CONNECTING;
        }
        if (i8 == 2) {
            return CONNECTED;
        }
        if (i8 == 3) {
            return DISCONNECTING;
        }
        if (i8 == 4) {
            return DISCONNECTED;
        }
        if (i8 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static InterfaceC2765ez0 zzd() {
        return f17615b;
    }

    public static InterfaceC2880fz0 zze() {
        return C2266af.f17997a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f17617a;
    }
}
