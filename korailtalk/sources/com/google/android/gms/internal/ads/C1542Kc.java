package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1542Kc extends Zy0 implements Qz0 {
    private static final C1542Kc zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        C1542Kc c1542Kc = new C1542Kc();
        zza = c1542Kc;
        Zy0.P(C1542Kc.class, c1542Kc);
    }

    private C1542Kc() {
    }

    static /* synthetic */ void a0(C1542Kc c1542Kc, String str) {
        str.getClass();
        c1542Kc.zzc |= 1;
        c1542Kc.zzd = str;
    }

    static /* synthetic */ void b0(C1542Kc c1542Kc, long j8) {
        c1542Kc.zzc |= 16;
        c1542Kc.zzh = j8;
    }

    static /* synthetic */ void c0(C1542Kc c1542Kc, String str) {
        str.getClass();
        c1542Kc.zzc |= 2;
        c1542Kc.zze = str;
    }

    static /* synthetic */ void d0(C1542Kc c1542Kc, long j8) {
        c1542Kc.zzc |= 4;
        c1542Kc.zzf = j8;
    }

    static /* synthetic */ void e0(C1542Kc c1542Kc, long j8) {
        c1542Kc.zzc |= 8;
        c1542Kc.zzg = j8;
    }

    public static C1501Jc zze() {
        return (C1501Jc) zza.i();
    }

    public static C1542Kc zzg() {
        return zza;
    }

    public static C1542Kc zzh(AbstractC3677my0 abstractC3677my0) {
        return (C1542Kc) Zy0.D(zza, abstractC3677my0);
    }

    public static C1542Kc zzi(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1542Kc) Zy0.I(zza, abstractC3677my0, iy0);
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC1460Ic abstractC1460Ic = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new C1542Kc();
            case NEW_BUILDER:
                return new C1501Jc(abstractC1460Ic);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C1542Kc.class) {
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

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
