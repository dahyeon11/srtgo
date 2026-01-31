package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class J9 extends Zy0 implements Qz0 {
    private static final J9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;

    static {
        J9 j9 = new J9();
        zza = j9;
        Zy0.P(J9.class, j9);
    }

    private J9() {
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC3243j9 abstractC3243j9 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", Y9.f17340a});
            case NEW_MUTABLE_INSTANCE:
                return new J9();
            case NEW_BUILDER:
                return new I9(abstractC3243j9);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (J9.class) {
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
