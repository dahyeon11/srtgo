package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ZB0 extends Zy0 implements Qz0 {
    private static final ZB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private YB0 zzd;
    private AbstractC3677my0 zzf;
    private AbstractC3677my0 zzg;
    private int zzh;
    private AbstractC3677my0 zzi;
    private byte zzj = 2;
    private InterfaceC3679mz0 zze = Zy0.n();

    static {
        ZB0 zb0 = new ZB0();
        zza = zb0;
        Zy0.P(ZB0.class, zb0);
    }

    private ZB0() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zzf = abstractC3677my0;
        this.zzg = abstractC3677my0;
        this.zzi = abstractC3677my0;
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", RB0.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new ZB0();
            case NEW_BUILDER:
                return new WB0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (ZB0.class) {
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
