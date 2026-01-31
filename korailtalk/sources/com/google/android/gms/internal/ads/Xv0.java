package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum Xv0 implements InterfaceC2650dz0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f17302b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.Wv0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return Xv0.zzb(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f17304a;

    Xv0(int i8) {
        this.f17304a = i8;
    }

    public static Xv0 zzb(int i8) {
        if (i8 == 0) {
            return UNKNOWN_HASH;
        }
        if (i8 == 1) {
            return SHA1;
        }
        if (i8 == 2) {
            return SHA384;
        }
        if (i8 == 3) {
            return SHA256;
        }
        if (i8 == 4) {
            return SHA512;
        }
        if (i8 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f17304a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
