package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sd0 */
/* loaded from: classes2.dex */
public final class C1872Sd0 extends Zy0 implements Qz0 {
    private static final C1872Sd0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C1708Od0 zzd;

    static {
        C1872Sd0 c1872Sd0 = new C1872Sd0();
        zza = c1872Sd0;
        Zy0.P(C1872Sd0.class, c1872Sd0);
    }

    private C1872Sd0() {
    }

    static /* synthetic */ void a0(C1872Sd0 c1872Sd0, C1708Od0 c1708Od0) {
        c1708Od0.getClass();
        c1872Sd0.zzd = c1708Od0;
        c1872Sd0.zzc |= 1;
    }

    public static C1831Rd0 zza() {
        return (C1831Rd0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new C1872Sd0();
            case NEW_BUILDER:
                return new C1831Rd0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C1872Sd0.class) {
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
