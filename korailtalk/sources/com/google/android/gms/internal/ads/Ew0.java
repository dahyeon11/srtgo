package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ew0 extends Zy0 implements Qz0 {
    private static final Ew0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private InterfaceC3679mz0 zzd = Zy0.n();

    static {
        Ew0 ew0 = new Ew0();
        zza = ew0;
        Zy0.P(Ew0.class, ew0);
    }

    private Ew0() {
    }

    static /* synthetic */ void b0(Ew0 ew0, Dw0 dw0) {
        dw0.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = ew0.zzd;
        if (!interfaceC3679mz0.zzc()) {
            ew0.zzd = Zy0.o(interfaceC3679mz0);
        }
        ew0.zzd.add(dw0);
    }

    public static Bw0 zza() {
        return (Bw0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", Dw0.class});
            case NEW_MUTABLE_INSTANCE:
                return new Ew0();
            case NEW_BUILDER:
                return new Bw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Ew0.class) {
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
