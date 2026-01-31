package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3362kB0 implements InterfaceC2650dz0 {
    SOURCE_UNSPECIFIED(0),
    CLIENT_GENERATION(1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f20368b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.iB0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return EnumC3362kB0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f20370a;

    EnumC3362kB0(int i8) {
        this.f20370a = i8;
    }

    public static EnumC3362kB0 zzb(int i8) {
        if (i8 == 0) {
            return SOURCE_UNSPECIFIED;
        }
        if (i8 != 1) {
            return null;
        }
        return CLIENT_GENERATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f20370a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f20370a;
    }
}
