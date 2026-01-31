package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hw0 */
/* loaded from: classes2.dex */
public final class C3104hw0 extends Zy0 implements Qz0 {
    private static final C3104hw0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;

    static {
        C3104hw0 c3104hw0 = new C3104hw0();
        zza = c3104hw0;
        Zy0.P(C3104hw0.class, c3104hw0);
    }

    private C3104hw0() {
    }

    public static C2989gw0 zzd() {
        return (C2989gw0) zza.i();
    }

    public static C3104hw0 zzf() {
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new C3104hw0();
            case NEW_BUILDER:
                return new C2989gw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3104hw0.class) {
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
        return this.zzd;
    }

    public final Xv0 zzc() {
        Xv0 xv0Zzb = Xv0.zzb(this.zzc);
        return xv0Zzb == null ? Xv0.UNRECOGNIZED : xv0Zzb;
    }
}
