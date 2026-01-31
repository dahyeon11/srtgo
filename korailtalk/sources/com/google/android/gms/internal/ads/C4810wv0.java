package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wv0 */
/* loaded from: classes2.dex */
public final class C4810wv0 extends Zy0 implements Qz0 {
    private static final C4810wv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private Cv0 zze;
    private AbstractC3677my0 zzf = AbstractC3677my0.zzb;

    static {
        C4810wv0 c4810wv0 = new C4810wv0();
        zza = c4810wv0;
        Zy0.P(C4810wv0.class, c4810wv0);
    }

    private C4810wv0() {
    }

    static /* synthetic */ void a0(C4810wv0 c4810wv0, Cv0 cv0) {
        cv0.getClass();
        c4810wv0.zze = cv0;
        c4810wv0.zzc |= 1;
    }

    public static C4696vv0 zzc() {
        return (C4696vv0) zza.i();
    }

    public static C4810wv0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C4810wv0) Zy0.I(zza, abstractC3677my0, iy0);
    }

    public static Xz0 zzh() {
        return zza.zzbM();
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
                return Zy0.t(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C4810wv0();
            case NEW_BUILDER:
                return new C4696vv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C4810wv0.class) {
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

    public final Cv0 zzf() {
        Cv0 cv0 = this.zze;
        return cv0 == null ? Cv0.zze() : cv0;
    }

    public final AbstractC3677my0 zzg() {
        return this.zzf;
    }
}
