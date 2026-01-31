package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ia */
/* loaded from: classes2.dex */
public final class C3174ia extends Zy0 implements Qz0 {
    private static final C3174ia zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private InterfaceC3679mz0 zzd = Zy0.n();
    private AbstractC3677my0 zze = AbstractC3677my0.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        C3174ia c3174ia = new C3174ia();
        zza = c3174ia;
        Zy0.P(C3174ia.class, c3174ia);
    }

    private C3174ia() {
    }

    static /* synthetic */ void a0(C3174ia c3174ia, AbstractC3677my0 abstractC3677my0) {
        InterfaceC3679mz0 interfaceC3679mz0 = c3174ia.zzd;
        if (!interfaceC3679mz0.zzc()) {
            c3174ia.zzd = Zy0.o(interfaceC3679mz0);
        }
        c3174ia.zzd.add(abstractC3677my0);
    }

    static /* synthetic */ void b0(C3174ia c3174ia, AbstractC3677my0 abstractC3677my0) {
        c3174ia.zzc |= 1;
        c3174ia.zze = abstractC3677my0;
    }

    static /* synthetic */ void c0(C3174ia c3174ia, V9 v9) {
        c3174ia.zzg = v9.zza();
        c3174ia.zzc |= 4;
    }

    public static C3059ha zza() {
        return (C3059ha) zza.i();
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
                return Zy0.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", C2371ba.f18153a, "zzg", U9.f16594a});
            case NEW_MUTABLE_INSTANCE:
                return new C3174ia();
            case NEW_BUILDER:
                return new C3059ha(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3174ia.class) {
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
