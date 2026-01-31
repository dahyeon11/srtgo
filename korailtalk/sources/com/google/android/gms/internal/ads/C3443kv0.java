package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kv0 */
/* loaded from: classes2.dex */
public final class C3443kv0 extends Zy0 implements Qz0 {
    private static final C3443kv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C4127qv0 zzd;
    private C2644dw0 zze;

    static {
        C3443kv0 c3443kv0 = new C3443kv0();
        zza = c3443kv0;
        Zy0.P(C3443kv0.class, c3443kv0);
    }

    private C3443kv0() {
    }

    static /* synthetic */ void a0(C3443kv0 c3443kv0, C4127qv0 c4127qv0) {
        c4127qv0.getClass();
        c3443kv0.zzd = c4127qv0;
        c3443kv0.zzc |= 1;
    }

    static /* synthetic */ void b0(C3443kv0 c3443kv0, C2644dw0 c2644dw0) {
        c2644dw0.getClass();
        c3443kv0.zze = c2644dw0;
        c3443kv0.zzc |= 2;
    }

    public static C3329jv0 zza() {
        return (C3329jv0) zza.i();
    }

    public static C3443kv0 zzd(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C3443kv0) Zy0.I(zza, abstractC3677my0, iy0);
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C3443kv0();
            case NEW_BUILDER:
                return new C3329jv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3443kv0.class) {
                        try {
                            uy0 = zzb;
                            if (uy0 == null) {
                                uy0 = new Uy0(zza);
                                zzb = uy0;
                            }
                        } finally {
                        }
                    }
                }
                return uy0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C4127qv0 zze() {
        C4127qv0 c4127qv0 = this.zzd;
        return c4127qv0 == null ? C4127qv0.zze() : c4127qv0;
    }

    public final C2644dw0 zzf() {
        C2644dw0 c2644dw0 = this.zze;
        return c2644dw0 == null ? C2644dw0.zzf() : c2644dw0;
    }
}
