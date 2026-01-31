package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tv0 */
/* loaded from: classes2.dex */
public final class C4468tv0 extends Zy0 implements Qz0 {
    private static final C4468tv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;

    static {
        C4468tv0 c4468tv0 = new C4468tv0();
        zza = c4468tv0;
        Zy0.P(C4468tv0.class, c4468tv0);
    }

    private C4468tv0() {
    }

    public static C4354sv0 zzc() {
        return (C4354sv0) zza.i();
    }

    public static C4468tv0 zze() {
        return zza;
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
                return Zy0.t(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new C4468tv0();
            case NEW_BUILDER:
                return new C4354sv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C4468tv0.class) {
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
        return this.zzc;
    }
}
