package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class S9 extends Zy0 implements Qz0 {
    private static final S9 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private AbstractC3677my0 zzd;
    private AbstractC3677my0 zze;
    private AbstractC3677my0 zzf;
    private AbstractC3677my0 zzg;

    static {
        S9 s9 = new S9();
        zza = s9;
        Zy0.P(S9.class, s9);
    }

    private S9() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zzd = abstractC3677my0;
        this.zze = abstractC3677my0;
        this.zzf = abstractC3677my0;
        this.zzg = abstractC3677my0;
    }

    static /* synthetic */ void a0(S9 s9, AbstractC3677my0 abstractC3677my0) {
        s9.zzc |= 1;
        s9.zzd = abstractC3677my0;
    }

    static /* synthetic */ void b0(S9 s9, AbstractC3677my0 abstractC3677my0) {
        s9.zzc |= 2;
        s9.zze = abstractC3677my0;
    }

    static /* synthetic */ void c0(S9 s9, AbstractC3677my0 abstractC3677my0) {
        s9.zzc |= 4;
        s9.zzf = abstractC3677my0;
    }

    static /* synthetic */ void d0(S9 s9, AbstractC3677my0 abstractC3677my0) {
        s9.zzc |= 8;
        s9.zzg = abstractC3677my0;
    }

    public static R9 zza() {
        return (R9) zza.i();
    }

    public static S9 zzd(byte[] bArr, Iy0 iy0) {
        return (S9) Zy0.M(zza, bArr, iy0);
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
                return Zy0.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new S9();
            case NEW_BUILDER:
                return new R9(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (S9.class) {
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

    public final AbstractC3677my0 zze() {
        return this.zzd;
    }

    public final AbstractC3677my0 zzf() {
        return this.zze;
    }

    public final AbstractC3677my0 zzg() {
        return this.zzg;
    }

    public final AbstractC3677my0 zzh() {
        return this.zzf;
    }
}
