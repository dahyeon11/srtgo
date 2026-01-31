package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class RB0 extends Zy0 implements Qz0 {
    private static final RB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private AbstractC3677my0 zzd;
    private AbstractC3677my0 zze;
    private byte zzf = 2;

    static {
        RB0 rb0 = new RB0();
        zza = rb0;
        Zy0.P(RB0.class, rb0);
    }

    private RB0() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zzd = abstractC3677my0;
        this.zze = abstractC3677my0;
    }

    static /* synthetic */ void a0(RB0 rb0, AbstractC3677my0 abstractC3677my0) {
        rb0.zzc |= 1;
        rb0.zzd = abstractC3677my0;
    }

    static /* synthetic */ void b0(RB0 rb0, AbstractC3677my0 abstractC3677my0) {
        rb0.zzc |= 2;
        rb0.zze = abstractC3677my0;
    }

    public static QB0 zzc() {
        return (QB0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new RB0();
            case NEW_BUILDER:
                return new QB0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (RB0.class) {
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
