package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2792fC0 extends Zy0 implements Qz0 {
    private static final C2792fC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        C2792fC0 c2792fC0 = new C2792fC0();
        zza = c2792fC0;
        Zy0.P(C2792fC0.class, c2792fC0);
    }

    private C2792fC0() {
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC2561dB0 abstractC2561dB0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                InterfaceC2880fz0 interfaceC2880fz0 = C2448cC0.f18260a;
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", interfaceC2880fz0, "zze", "zzf", interfaceC2880fz0});
            case NEW_MUTABLE_INSTANCE:
                return new C2792fC0();
            case NEW_BUILDER:
                return new C2677eC0(abstractC2561dB0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2792fC0.class) {
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
