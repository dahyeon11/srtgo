package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qv0 */
/* loaded from: classes2.dex */
public final class C4127qv0 extends Zy0 implements Qz0 {
    private static final C4127qv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C4468tv0 zzd;
    private int zze;

    static {
        C4127qv0 c4127qv0 = new C4127qv0();
        zza = c4127qv0;
        Zy0.P(C4127qv0.class, c4127qv0);
    }

    private C4127qv0() {
    }

    static /* synthetic */ void a0(C4127qv0 c4127qv0, C4468tv0 c4468tv0) {
        c4468tv0.getClass();
        c4127qv0.zzd = c4468tv0;
        c4127qv0.zzc |= 1;
    }

    public static C4013pv0 zzc() {
        return (C4013pv0) zza.i();
    }

    public static C4127qv0 zze() {
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C4127qv0();
            case NEW_BUILDER:
                return new C4013pv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C4127qv0.class) {
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
        return this.zze;
    }

    public final C4468tv0 zzf() {
        C4468tv0 c4468tv0 = this.zzd;
        return c4468tv0 == null ? C4468tv0.zze() : c4468tv0;
    }
}
