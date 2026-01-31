package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3478lC0 extends Zy0 implements Qz0 {
    private static final C3478lC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        C3478lC0 c3478lC0 = new C3478lC0();
        zza = c3478lC0;
        Zy0.P(C3478lC0.class, c3478lC0);
    }

    private C3478lC0() {
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
                return Zy0.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", C3250jC0.f20212a, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C3478lC0();
            case NEW_BUILDER:
                return new C3022hC0(abstractC2561dB0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3478lC0.class) {
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
