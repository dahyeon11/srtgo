package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3024hD0 extends Zy0 implements Qz0 {
    private static final C3024hD0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private String zzd = "";

    static {
        C3024hD0 c3024hD0 = new C3024hD0();
        zza = c3024hD0;
        Zy0.P(C3024hD0.class, c3024hD0);
    }

    private C3024hD0() {
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
                return Zy0.t(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new C3024hD0();
            case NEW_BUILDER:
                return new C2909gD0(abstractC2561dB0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3024hD0.class) {
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
