package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv0 */
/* loaded from: classes2.dex */
public final class C3102hv0 extends Zy0 implements Qz0 {
    private static final C3102hv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private C3785nv0 zze;
    private C2301aw0 zzf;

    static {
        C3102hv0 c3102hv0 = new C3102hv0();
        zza = c3102hv0;
        Zy0.P(C3102hv0.class, c3102hv0);
    }

    private C3102hv0() {
    }

    static /* synthetic */ void a0(C3102hv0 c3102hv0, C3785nv0 c3785nv0) {
        c3785nv0.getClass();
        c3102hv0.zze = c3785nv0;
        c3102hv0.zzc |= 1;
    }

    static /* synthetic */ void b0(C3102hv0 c3102hv0, C2301aw0 c2301aw0) {
        c2301aw0.getClass();
        c3102hv0.zzf = c2301aw0;
        c3102hv0.zzc |= 2;
    }

    public static C2987gv0 zzc() {
        return (C2987gv0) zza.i();
    }

    public static C3102hv0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C3102hv0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C3102hv0();
            case NEW_BUILDER:
                return new C2987gv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3102hv0.class) {
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

    public final C3785nv0 zzf() {
        C3785nv0 c3785nv0 = this.zze;
        return c3785nv0 == null ? C3785nv0.zze() : c3785nv0;
    }

    public final C2301aw0 zzg() {
        C2301aw0 c2301aw0 = this.zzf;
        return c2301aw0 == null ? C2301aw0.zze() : c2301aw0;
    }
}
