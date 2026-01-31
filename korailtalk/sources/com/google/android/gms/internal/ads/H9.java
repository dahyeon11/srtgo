package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class H9 extends Zy0 implements Qz0 {
    private static final H9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        H9 h9 = new H9();
        zza = h9;
        Zy0.P(H9.class, h9);
    }

    private H9() {
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
                return Zy0.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", C4154r9.f22386a, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new H9();
            case NEW_BUILDER:
                return new G9(abstractC3243j9);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (H9.class) {
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
