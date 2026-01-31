package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Mv0 extends Zy0 implements Qz0 {
    private static final Mv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private AbstractC3677my0 zzd = AbstractC3677my0.zzb;

    static {
        Mv0 mv0 = new Mv0();
        zza = mv0;
        Zy0.P(Mv0.class, mv0);
    }

    private Mv0() {
    }

    public static Lv0 zzc() {
        return (Lv0) zza.i();
    }

    public static Mv0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Mv0) Zy0.I(zza, abstractC3677my0, iy0);
    }

    public static Xz0 zzg() {
        return zza.zzbM();
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new Mv0();
            case NEW_BUILDER:
                return new Lv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Mv0.class) {
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

    public final AbstractC3677my0 zzf() {
        return this.zzd;
    }
}
