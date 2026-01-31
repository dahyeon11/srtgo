package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ea */
/* loaded from: classes2.dex */
public final class C2714ea extends Zy0 implements Qz0 {
    private static final C2714ea zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private AbstractC3677my0 zzf = AbstractC3677my0.zzb;

    static {
        C2714ea c2714ea = new C2714ea();
        zza = c2714ea;
        Zy0.P(C2714ea.class, c2714ea);
    }

    private C2714ea() {
    }

    public static C2714ea zzd() {
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
                return Zy0.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C2714ea();
            case NEW_BUILDER:
                return new C2600da(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2714ea.class) {
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
        return this.zzd;
    }

    public final boolean zze() {
        return (this.zzc & 1) != 0;
    }
}
