package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1629Mf implements InterfaceC2650dz0 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f14674b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Mf.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1629Mf zza(int i8) {
            return EnumC1629Mf.zzb(i8);
        }
    };
    public static final int zzc = 0;
    public static final int zzd = 1;

    /* renamed from: a, reason: collision with root package name */
    private final int f14676a;

    EnumC1629Mf(int i8) {
        this.f14676a = i8;
    }

    public static EnumC1629Mf zzb(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static InterfaceC2765ez0 zzd() {
        return f14674b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1670Nf.f14939a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f14676a;
    }
}
