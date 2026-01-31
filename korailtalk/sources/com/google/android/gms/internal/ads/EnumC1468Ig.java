package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1468Ig implements InterfaceC2650dz0 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f13483b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Ig.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1468Ig zza(int i8) {
            return EnumC1468Ig.zzb(i8);
        }
    };
    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f13485a;

    EnumC1468Ig(int i8) {
        this.f13485a = i8;
    }

    public static EnumC1468Ig zzb(int i8) {
        if (i8 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i8 == 1) {
            return IOS;
        }
        if (i8 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static InterfaceC2765ez0 zzd() {
        return f13483b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1509Jg.f13677a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f13485a;
    }
}
