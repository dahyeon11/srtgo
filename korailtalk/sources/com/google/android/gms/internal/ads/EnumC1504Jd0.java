package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1504Jd0 implements InterfaceC2650dz0 {
    OS_UNKNOWN(0),
    OS_ANDROID(1),
    OS_IOS(2),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f13671b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Hd0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC1504Jd0 enumC1504Jd0 = EnumC1504Jd0.OS_UNKNOWN;
            if (i8 == 0) {
                return EnumC1504Jd0.OS_UNKNOWN;
            }
            if (i8 == 1) {
                return EnumC1504Jd0.OS_ANDROID;
            }
            if (i8 != 2) {
                return null;
            }
            return EnumC1504Jd0.OS_IOS;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f13673a;

    EnumC1504Jd0(int i8) {
        this.f13673a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f13673a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
