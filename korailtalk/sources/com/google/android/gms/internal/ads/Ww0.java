package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ww0 extends Zy0 implements Qz0 {
    private static final Ww0 zza;
    private static volatile Xz0 zzb;
    private String zzc = "";
    private InterfaceC3679mz0 zzd = Zy0.n();

    static {
        Ww0 ww0 = new Ww0();
        zza = ww0;
        Zy0.P(Ww0.class, ww0);
    }

    private Ww0() {
    }

    public static Ww0 zzc() {
        return zza;
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzc", "zzd", C4584uw0.class});
            case NEW_MUTABLE_INSTANCE:
                return new Ww0();
            case NEW_BUILDER:
                return new Vw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Ww0.class) {
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
