package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ge0 */
/* loaded from: classes2.dex */
public final class C2953ge0 extends Zy0 implements Qz0 {
    private static final C2953ge0 zza;
    private static volatile Xz0 zzb;
    private InterfaceC3679mz0 zzc = Zy0.n();

    static {
        C2953ge0 c2953ge0 = new C2953ge0();
        zza = c2953ge0;
        Zy0.P(C2953ge0.class, c2953ge0);
    }

    private C2953ge0() {
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
                return Zy0.t(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C2609de0.class});
            case NEW_MUTABLE_INSTANCE:
                return new C2953ge0();
            case NEW_BUILDER:
                return new C2838fe0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2953ge0.class) {
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
