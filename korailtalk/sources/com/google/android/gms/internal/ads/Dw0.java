package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Dw0 extends Zy0 implements Qz0 {
    private static final Dw0 zza;
    private static volatile Xz0 zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        Dw0 dw0 = new Dw0();
        zza = dw0;
        Zy0.P(Dw0.class, dw0);
    }

    private Dw0() {
    }

    static /* synthetic */ void a0(Dw0 dw0, String str) {
        str.getClass();
        dw0.zzc = str;
    }

    public static Cw0 zza() {
        return (Cw0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new Dw0();
            case NEW_BUILDER:
                return new Cw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Dw0.class) {
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
