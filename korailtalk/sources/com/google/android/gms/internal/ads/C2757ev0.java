package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ev0 */
/* loaded from: classes2.dex */
public final class C2757ev0 extends Zy0 implements Qz0 {
    private static final C2757ev0 zza;
    private static volatile Xz0 zzb;
    private int zzc;

    static {
        C2757ev0 c2757ev0 = new C2757ev0();
        zza = c2757ev0;
        Zy0.P(C2757ev0.class, c2757ev0);
    }

    private C2757ev0() {
    }

    public static C2642dv0 zzc() {
        return (C2642dv0) zza.i();
    }

    public static C2757ev0 zze() {
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
                return new C2757ev0();
            case NEW_BUILDER:
                return new C2642dv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2757ev0.class) {
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
