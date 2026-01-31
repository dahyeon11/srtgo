package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Rw0 extends Zy0 implements Qz0 {
    private static final Rw0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private String zzd = "";
    private C4242rw0 zze;

    static {
        Rw0 rw0 = new Rw0();
        zza = rw0;
        Zy0.P(Rw0.class, rw0);
    }

    private Rw0() {
    }

    static /* synthetic */ void a0(Rw0 rw0, String str) {
        str.getClass();
        rw0.zzd = str;
    }

    static /* synthetic */ void b0(Rw0 rw0, C4242rw0 c4242rw0) {
        c4242rw0.getClass();
        rw0.zze = c4242rw0;
        rw0.zzc |= 1;
    }

    public static Qw0 zzc() {
        return (Qw0) zza.i();
    }

    public static Rw0 zze() {
        return zza;
    }

    public static Rw0 zzf(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (Rw0) Zy0.I(zza, abstractC3677my0, iy0);
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        Pw0 pw0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new Rw0();
            case NEW_BUILDER:
                return new Qw0(pw0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Rw0.class) {
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

    public final C4242rw0 zza() {
        C4242rw0 c4242rw0 = this.zze;
        return c4242rw0 == null ? C4242rw0.zze() : c4242rw0;
    }

    public final String zzg() {
        return this.zzd;
    }
}
