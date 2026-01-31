package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lB0 */
/* loaded from: classes2.dex */
public final class C3476lB0 extends Zy0 implements Qz0 {
    private static final C3476lB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private AbstractC3677my0 zzf = AbstractC3677my0.zzb;

    static {
        C3476lB0 c3476lB0 = new C3476lB0();
        zza = c3476lB0;
        Zy0.P(C3476lB0.class, c3476lB0);
    }

    private C3476lB0() {
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
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", C3248jB0.f20210a, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C3476lB0();
            case NEW_BUILDER:
                return new C3020hB0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3476lB0.class) {
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
