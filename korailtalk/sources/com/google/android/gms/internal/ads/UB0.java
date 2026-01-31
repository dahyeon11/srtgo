package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class UB0 extends Zy0 implements Qz0 {
    private static final UB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private AbstractC3677my0 zzd;
    private AbstractC3677my0 zze;
    private AbstractC3677my0 zzf;

    static {
        UB0 ub0 = new UB0();
        zza = ub0;
        Zy0.P(UB0.class, ub0);
    }

    private UB0() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zzd = abstractC3677my0;
        this.zze = abstractC3677my0;
        this.zzf = abstractC3677my0;
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
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new UB0();
            case NEW_BUILDER:
                return new TB0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (UB0.class) {
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
