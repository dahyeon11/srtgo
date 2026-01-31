package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class L9 extends Zy0 implements Qz0 {
    private static final L9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        L9 l9 = new L9();
        zza = l9;
        Zy0.P(L9.class, l9);
    }

    private L9() {
    }

    static /* synthetic */ void a0(L9 l9, long j8) {
        l9.zzc |= 1;
        l9.zzd = j8;
    }

    static /* synthetic */ void b0(L9 l9, long j8) {
        l9.zzc |= 2;
        l9.zze = j8;
    }

    static /* synthetic */ void c0(L9 l9, long j8) {
        l9.zzc |= 4;
        l9.zzf = j8;
    }

    static /* synthetic */ void d0(L9 l9, long j8) {
        l9.zzc |= 8;
        l9.zzg = j8;
    }

    static /* synthetic */ void e0(L9 l9) {
        l9.zzc &= -9;
        l9.zzg = -1L;
    }

    static /* synthetic */ void f0(L9 l9, long j8) {
        l9.zzc |= 16;
        l9.zzh = j8;
    }

    static /* synthetic */ void g0(L9 l9, long j8) {
        l9.zzc |= 32;
        l9.zzi = j8;
    }

    static /* synthetic */ void h0(L9 l9, Z9 z9) {
        l9.zzj = z9.zza();
        l9.zzc |= 64;
    }

    static /* synthetic */ void i0(L9 l9, long j8) {
        l9.zzc |= 128;
        l9.zzk = j8;
    }

    static /* synthetic */ void j0(L9 l9, long j8) {
        l9.zzc |= 256;
        l9.zzl = j8;
    }

    static /* synthetic */ void k0(L9 l9, long j8) {
        l9.zzc |= 512;
        l9.zzm = j8;
    }

    static /* synthetic */ void l0(L9 l9, Z9 z9) {
        l9.zzn = z9.zza();
        l9.zzc |= 1024;
    }

    static /* synthetic */ void m0(L9 l9, long j8) {
        l9.zzc |= 2048;
        l9.zzo = j8;
    }

    static /* synthetic */ void n0(L9 l9, long j8) {
        l9.zzc |= 4096;
        l9.zzp = j8;
    }

    static /* synthetic */ void o0(L9 l9, long j8) {
        l9.zzc |= 8192;
        l9.zzu = j8;
    }

    static /* synthetic */ void p0(L9 l9, long j8) {
        l9.zzc |= 16384;
        l9.zzv = j8;
    }

    static /* synthetic */ void q0(L9 l9, long j8) {
        l9.zzc |= 32768;
        l9.zzw = j8;
    }

    static /* synthetic */ void r0(L9 l9, long j8) {
        l9.zzc |= 65536;
        l9.zzx = j8;
    }

    static /* synthetic */ void s0(L9 l9, long j8) {
        l9.zzc |= 131072;
        l9.zzy = j8;
    }

    static /* synthetic */ void t0(L9 l9, long j8) {
        l9.zzc |= 262144;
        l9.zzz = j8;
    }

    public static K9 zza() {
        return (K9) zza.i();
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
                InterfaceC2880fz0 interfaceC2880fz0 = Y9.f17340a;
                return Zy0.t(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", interfaceC2880fz0, "zzk", "zzl", "zzm", "zzn", interfaceC2880fz0, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case NEW_MUTABLE_INSTANCE:
                return new L9();
            case NEW_BUILDER:
                return new K9(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (L9.class) {
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
