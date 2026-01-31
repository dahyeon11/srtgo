package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b9 */
/* loaded from: classes2.dex */
public final class C2327b9 extends Zy0 implements Qz0 {
    private static final C2327b9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C2556d9 zzd;
    private C3130i9 zze;

    static {
        C2327b9 c2327b9 = new C2327b9();
        zza = c2327b9;
        Zy0.P(C2327b9.class, c2327b9);
    }

    private C2327b9() {
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
                return Zy0.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C2327b9();
            case NEW_BUILDER:
                return new C2212a9(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2327b9.class) {
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
