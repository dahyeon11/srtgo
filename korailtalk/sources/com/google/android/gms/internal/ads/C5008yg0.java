package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yg0 */
/* loaded from: classes2.dex */
public final class C5008yg0 extends Zy0 implements Qz0 {
    private static final C5008yg0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C4324sg0 zzg;

    static {
        C5008yg0 c5008yg0 = new C5008yg0();
        zza = c5008yg0;
        Zy0.P(C5008yg0.class, c5008yg0);
    }

    private C5008yg0() {
    }

    static /* synthetic */ void a0(C5008yg0 c5008yg0, EnumC4894xg0 enumC4894xg0) {
        c5008yg0.zzd = enumC4894xg0.zza();
        c5008yg0.zzc |= 1;
    }

    static /* synthetic */ void b0(C5008yg0 c5008yg0, String str) {
        str.getClass();
        c5008yg0.zzc |= 2;
        c5008yg0.zze = str;
    }

    static /* synthetic */ void c0(C5008yg0 c5008yg0, C4324sg0 c4324sg0) {
        c4324sg0.getClass();
        c5008yg0.zzg = c4324sg0;
        c5008yg0.zzc |= 8;
    }

    public static C4552ug0 zza() {
        return (C4552ug0) zza.i();
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
                return Zy0.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", C4780wg0.f23534a, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C5008yg0();
            case NEW_BUILDER:
                return new C4552ug0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C5008yg0.class) {
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
