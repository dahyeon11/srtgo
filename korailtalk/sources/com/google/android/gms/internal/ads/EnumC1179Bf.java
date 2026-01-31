package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1179Bf implements InterfaceC2650dz0 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f12297b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Bf.a
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public EnumC1179Bf zza(int i8) {
            return EnumC1179Bf.zzb(i8);
        }
    };
    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 3;

    /* renamed from: a, reason: collision with root package name */
    private final int f12299a;

    EnumC1179Bf(int i8) {
        this.f12299a = i8;
    }

    public static EnumC1179Bf zzb(int i8) {
        if (i8 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i8 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i8 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static InterfaceC2765ez0 zzd() {
        return f12297b;
    }

    public static InterfaceC2880fz0 zze() {
        return C1220Cf.f12567a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f12299a;
    }
}
