package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fc */
/* loaded from: classes2.dex */
public final class C1337Fc extends Zy0 implements Qz0 {
    private static final C1337Fc zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C1542Kc zzd;
    private AbstractC3677my0 zze;
    private AbstractC3677my0 zzf;

    static {
        C1337Fc c1337Fc = new C1337Fc();
        zza = c1337Fc;
        Zy0.P(C1337Fc.class, c1337Fc);
    }

    private C1337Fc() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zze = abstractC3677my0;
        this.zzf = abstractC3677my0;
    }

    public static C1337Fc zzc(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1337Fc) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C1337Fc();
            case NEW_BUILDER:
                return new C1296Ec(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C1337Fc.class) {
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

    public final C1542Kc zzd() {
        C1542Kc c1542Kc = this.zzd;
        return c1542Kc == null ? C1542Kc.zzg() : c1542Kc;
    }

    public final AbstractC3677my0 zze() {
        return this.zzf;
    }

    public final AbstractC3677my0 zzf() {
        return this.zze;
    }
}
