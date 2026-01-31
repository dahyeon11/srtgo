package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2036Wd0 extends Zy0 implements Qz0 {
    private static final C2036Wd0 zza;
    private static volatile Xz0 zzb;
    private String zzc = "";

    static {
        C2036Wd0 c2036Wd0 = new C2036Wd0();
        zza = c2036Wd0;
        Zy0.P(C2036Wd0.class, c2036Wd0);
    }

    private C2036Wd0() {
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC1954Ud0 abstractC1954Ud0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new C2036Wd0();
            case NEW_BUILDER:
                return new C1995Vd0(abstractC1954Ud0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2036Wd0.class) {
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
