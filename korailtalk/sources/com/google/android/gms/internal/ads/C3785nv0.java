package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3785nv0 extends Zy0 implements Qz0 {
    private static final C3785nv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private C4468tv0 zze;
    private AbstractC3677my0 zzf = AbstractC3677my0.zzb;

    static {
        C3785nv0 c3785nv0 = new C3785nv0();
        zza = c3785nv0;
        Zy0.P(C3785nv0.class, c3785nv0);
    }

    private C3785nv0() {
    }

    static /* synthetic */ void a0(C3785nv0 c3785nv0, C4468tv0 c4468tv0) {
        c4468tv0.getClass();
        c3785nv0.zze = c4468tv0;
        c3785nv0.zzc |= 1;
    }

    public static C3671mv0 zzc() {
        return (C3671mv0) zza.i();
    }

    public static C3785nv0 zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC3557lv0 abstractC3557lv0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C3785nv0();
            case NEW_BUILDER:
                return new C3671mv0(abstractC3557lv0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3785nv0.class) {
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

    public final C4468tv0 zzf() {
        C4468tv0 c4468tv0 = this.zze;
        return c4468tv0 == null ? C4468tv0.zze() : c4468tv0;
    }

    public final AbstractC3677my0 zzg() {
        return this.zzf;
    }
}
