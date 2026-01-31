package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4952y9 extends Zy0 implements Qz0 {
    private static final C4952y9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        C4952y9 c4952y9 = new C4952y9();
        zza = c4952y9;
        Zy0.P(C4952y9.class, c4952y9);
    }

    private C4952y9() {
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
                InterfaceC2880fz0 interfaceC2880fz0 = Y9.f17340a;
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", interfaceC2880fz0, "zzf", interfaceC2880fz0});
            case NEW_MUTABLE_INSTANCE:
                return new C4952y9();
            case NEW_BUILDER:
                return new C4838x9(abstractC3243j9);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C4952y9.class) {
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
