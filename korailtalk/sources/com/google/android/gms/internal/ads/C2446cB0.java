package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cB0 */
/* loaded from: classes2.dex */
public final class C2446cB0 extends Zy0 implements Qz0 {
    private static final C2446cB0 zza;
    private static volatile Xz0 zzb;
    private InterfaceC3679mz0 zzc = Zy0.n();

    static {
        C2446cB0 c2446cB0 = new C2446cB0();
        zza = c2446cB0;
        Zy0.P(C2446cB0.class, c2446cB0);
    }

    private C2446cB0() {
    }

    static /* synthetic */ void a0(C2446cB0 c2446cB0, C2217aB0 c2217aB0) {
        c2217aB0.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = c2446cB0.zzc;
        if (!interfaceC3679mz0.zzc()) {
            c2446cB0.zzc = Zy0.o(interfaceC3679mz0);
        }
        c2446cB0.zzc.add(c2217aB0);
    }

    public static C2332bB0 zzc() {
        return (C2332bB0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C2217aB0.class});
            case NEW_MUTABLE_INSTANCE:
                return new C2446cB0();
            case NEW_BUILDER:
                return new C2332bB0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2446cB0.class) {
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
