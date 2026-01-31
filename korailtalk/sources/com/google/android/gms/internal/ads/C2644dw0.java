package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dw0 */
/* loaded from: classes2.dex */
public final class C2644dw0 extends Zy0 implements Qz0 {
    private static final C2644dw0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C3104hw0 zzd;
    private int zze;
    private int zzf;

    static {
        C2644dw0 c2644dw0 = new C2644dw0();
        zza = c2644dw0;
        Zy0.P(C2644dw0.class, c2644dw0);
    }

    private C2644dw0() {
    }

    static /* synthetic */ void a0(C2644dw0 c2644dw0, C3104hw0 c3104hw0) {
        c3104hw0.getClass();
        c2644dw0.zzd = c3104hw0;
        c2644dw0.zzc |= 1;
    }

    public static C2530cw0 zzd() {
        return (C2530cw0) zza.i();
    }

    public static C2644dw0 zzf() {
        return zza;
    }

    public static C2644dw0 zzg(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2644dw0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C2644dw0();
            case NEW_BUILDER:
                return new C2530cw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2644dw0.class) {
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
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final C3104hw0 zzh() {
        C3104hw0 c3104hw0 = this.zzd;
        return c3104hw0 == null ? C3104hw0.zzf() : c3104hw0;
    }
}
