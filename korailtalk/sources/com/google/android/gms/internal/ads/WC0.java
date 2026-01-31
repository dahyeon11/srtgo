package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WC0 extends Zy0 implements Qz0 {
    private static final WC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        WC0 wc0 = new WC0();
        zza = wc0;
        Zy0.P(WC0.class, wc0);
    }

    private WC0() {
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC2561dB0 abstractC2561dB0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", UC0.f16615a, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new WC0();
            case NEW_BUILDER:
                return new SC0(abstractC2561dB0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (WC0.class) {
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
