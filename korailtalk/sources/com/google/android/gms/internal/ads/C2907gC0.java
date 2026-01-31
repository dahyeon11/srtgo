package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gC0 */
/* loaded from: classes2.dex */
public final class C2907gC0 extends Zy0 implements Qz0 {
    private static final C2907gC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private C2792fC0 zze;
    private C2792fC0 zzf;

    static {
        C2907gC0 c2907gC0 = new C2907gC0();
        zza = c2907gC0;
        Zy0.P(C2907gC0.class, c2907gC0);
    }

    private C2907gC0() {
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
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", C2448cC0.f18260a, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C2907gC0();
            case NEW_BUILDER:
                return new C2219aC0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2907gC0.class) {
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
