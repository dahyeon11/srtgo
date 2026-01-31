package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aB0 */
/* loaded from: classes2.dex */
public final class C2217aB0 extends Zy0 implements Qz0 {
    private static final C2217aB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        C2217aB0 c2217aB0 = new C2217aB0();
        zza = c2217aB0;
        Zy0.P(C2217aB0.class, c2217aB0);
    }

    private C2217aB0() {
    }

    public static ZA0 zzc() {
        return (ZA0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C2217aB0();
            case NEW_BUILDER:
                return new ZA0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2217aB0.class) {
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
}
