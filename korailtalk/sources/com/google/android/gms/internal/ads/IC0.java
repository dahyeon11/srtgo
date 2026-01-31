package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class IC0 extends Zy0 implements Qz0 {
    private static final IC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        IC0 ic0 = new IC0();
        zza = ic0;
        Zy0.P(IC0.class, ic0);
    }

    private IC0() {
    }

    static /* synthetic */ void a0(IC0 ic0, String str) {
        ic0.zzc |= 1;
        ic0.zzd = str;
    }

    static /* synthetic */ void b0(IC0 ic0, long j8) {
        ic0.zzc |= 2;
        ic0.zze = j8;
    }

    static /* synthetic */ void c0(IC0 ic0, boolean z8) {
        ic0.zzc |= 4;
        ic0.zzf = z8;
    }

    public static HC0 zzc() {
        return (HC0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return Zy0.t(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", KC0.f13762a, "zzh", "zzi", "zzj"});
            case 3:
                return new IC0();
            case 4:
                return new HC0(null);
            case 5:
                return zza;
            case 6:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (IC0.class) {
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
