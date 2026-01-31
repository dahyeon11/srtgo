package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Lw0 extends Zy0 implements Qz0 {
    private static final Lw0 zza;
    private static volatile Xz0 zzb;
    private String zzc = "";

    static {
        Lw0 lw0 = new Lw0();
        zza = lw0;
        Zy0.P(Lw0.class, lw0);
    }

    private Lw0() {
    }

    static /* synthetic */ void a0(Lw0 lw0, String str) {
        str.getClass();
        lw0.zzc = str;
    }

    public static Kw0 zza() {
        return (Kw0) zza.i();
    }

    public static Lw0 zzd() {
        return zza;
    }

    public static Lw0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Lw0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new Lw0();
            case NEW_BUILDER:
                return new Kw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Lw0.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
