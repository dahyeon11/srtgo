package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ow0 extends Zy0 implements Qz0 {
    private static final Ow0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private Rw0 zze;

    static {
        Ow0 ow0 = new Ow0();
        zza = ow0;
        Zy0.P(Ow0.class, ow0);
    }

    private Ow0() {
    }

    static /* synthetic */ void a0(Ow0 ow0, Rw0 rw0) {
        rw0.getClass();
        ow0.zze = rw0;
        ow0.zzc |= 1;
    }

    public static Nw0 zzc() {
        return (Nw0) zza.i();
    }

    public static Ow0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Ow0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new Ow0();
            case NEW_BUILDER:
                return new Nw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Ow0.class) {
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

    public final Rw0 zzf() {
        Rw0 rw0 = this.zze;
        return rw0 == null ? Rw0.zze() : rw0;
    }
}
