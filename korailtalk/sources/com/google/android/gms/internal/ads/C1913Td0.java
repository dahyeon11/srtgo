package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Td0 */
/* loaded from: classes2.dex */
public final class C1913Td0 extends Zy0 implements Qz0 {
    private static final C1913Td0 zza;
    private static volatile Xz0 zzb;
    private InterfaceC3679mz0 zzc = Zy0.n();

    static {
        C1913Td0 c1913Td0 = new C1913Td0();
        zza = c1913Td0;
        Zy0.P(C1913Td0.class, c1913Td0);
    }

    private C1913Td0() {
    }

    static /* synthetic */ void b0(C1913Td0 c1913Td0, C1872Sd0 c1872Sd0) {
        c1872Sd0.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = c1913Td0.zzc;
        if (!interfaceC3679mz0.zzc()) {
            c1913Td0.zzc = Zy0.o(interfaceC3679mz0);
        }
        c1913Td0.zzc.add(c1872Sd0);
    }

    public static C1790Qd0 zzc() {
        return (C1790Qd0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C1872Sd0.class});
            case NEW_MUTABLE_INSTANCE:
                return new C1913Td0();
            case NEW_BUILDER:
                return new C1790Qd0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C1913Td0.class) {
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
        return this.zzc.size();
    }
}
