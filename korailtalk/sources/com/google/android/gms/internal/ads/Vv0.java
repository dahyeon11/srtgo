package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Vv0 extends Zy0 implements Qz0 {
    private static final Vv0 zza;
    private static volatile Xz0 zzb;

    static {
        Vv0 vv0 = new Vv0();
        zza = vv0;
        Zy0.P(Vv0.class, vv0);
    }

    private Vv0() {
    }

    public static Vv0 zzc() {
        return zza;
    }

    public static Vv0 zzd(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Vv0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new Vv0();
            case NEW_BUILDER:
                return new Uv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Vv0.class) {
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
