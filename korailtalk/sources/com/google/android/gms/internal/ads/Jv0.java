package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Jv0 extends Zy0 implements Qz0 {
    private static final Jv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;

    static {
        Jv0 jv0 = new Jv0();
        zza = jv0;
        Zy0.P(Jv0.class, jv0);
    }

    private Jv0() {
    }

    public static Iv0 zzd() {
        return (Iv0) zza.i();
    }

    public static Jv0 zzf(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Jv0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new Jv0();
            case NEW_BUILDER:
                return new Iv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Jv0.class) {
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

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }
}
