package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2556d9 extends Zy0 implements Qz0 {
    private static final C2556d9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd = 2;

    static {
        C2556d9 c2556d9 = new C2556d9();
        zza = c2556d9;
        Zy0.P(C2556d9.class, c2556d9);
    }

    private C2556d9() {
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        Z8 z8 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", C2785f9.f19131a});
            case NEW_MUTABLE_INSTANCE:
                return new C2556d9();
            case NEW_BUILDER:
                return new C2441c9(z8);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2556d9.class) {
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
