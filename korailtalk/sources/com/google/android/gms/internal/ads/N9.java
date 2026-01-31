package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class N9 extends Zy0 implements Qz0 {
    private static final N9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        N9 n9 = new N9();
        zza = n9;
        Zy0.P(N9.class, n9);
    }

    private N9() {
    }

    static /* synthetic */ void a0(N9 n9, long j8) {
        n9.zzc |= 1;
        n9.zzd = j8;
    }

    static /* synthetic */ void b0(N9 n9, long j8) {
        n9.zzc |= 4;
        n9.zzf = j8;
    }

    static /* synthetic */ void c0(N9 n9, long j8) {
        n9.zzc |= 8;
        n9.zzg = j8;
    }

    static /* synthetic */ void d0(N9 n9, long j8) {
        n9.zzc |= 16;
        n9.zzh = j8;
    }

    static /* synthetic */ void e0(N9 n9, long j8) {
        n9.zzc |= 32;
        n9.zzi = j8;
    }

    public static M9 zza() {
        return (M9) zza.i();
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
                return Zy0.t(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new N9();
            case NEW_BUILDER:
                return new M9(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (N9.class) {
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
