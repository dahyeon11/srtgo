package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Pv0 extends Zy0 implements Qz0 {
    private static final Pv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;

    static {
        Pv0 pv0 = new Pv0();
        zza = pv0;
        Zy0.P(Pv0.class, pv0);
    }

    private Pv0() {
    }

    public static Ov0 zzd() {
        return (Ov0) zza.i();
    }

    public static Pv0 zzf(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Pv0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new Pv0();
            case NEW_BUILDER:
                return new Ov0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Pv0.class) {
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
