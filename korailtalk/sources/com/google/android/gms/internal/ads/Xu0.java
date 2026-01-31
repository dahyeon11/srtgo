package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Xu0 extends Zy0 implements Qz0 {
    private static final Xu0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private AbstractC3677my0 zze = AbstractC3677my0.zzb;
    private C2757ev0 zzf;

    static {
        Xu0 xu0 = new Xu0();
        zza = xu0;
        Zy0.P(Xu0.class, xu0);
    }

    private Xu0() {
    }

    static /* synthetic */ void b0(Xu0 xu0, C2757ev0 c2757ev0) {
        c2757ev0.getClass();
        xu0.zzf = c2757ev0;
        xu0.zzc |= 1;
    }

    public static Wu0 zzc() {
        return (Wu0) zza.i();
    }

    public static Xu0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Xu0) Zy0.I(zza, abstractC3677my0, iy0);
    }

    public static Xz0 zzh() {
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
                return Zy0.t(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new Xu0();
            case NEW_BUILDER:
                return new Wu0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Xu0.class) {
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
        return this.zzd;
    }

    public final C2757ev0 zzf() {
        C2757ev0 c2757ev0 = this.zzf;
        return c2757ev0 == null ? C2757ev0.zze() : c2757ev0;
    }

    public final AbstractC3677my0 zzg() {
        return this.zze;
    }
}
