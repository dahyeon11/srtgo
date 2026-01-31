package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zv0 */
/* loaded from: classes2.dex */
public final class C5152zv0 extends Zy0 implements Qz0 {
    private static final C5152zv0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private Cv0 zzd;
    private int zze;

    static {
        C5152zv0 c5152zv0 = new C5152zv0();
        zza = c5152zv0;
        Zy0.P(C5152zv0.class, c5152zv0);
    }

    private C5152zv0() {
    }

    static /* synthetic */ void a0(C5152zv0 c5152zv0, Cv0 cv0) {
        cv0.getClass();
        c5152zv0.zzd = cv0;
        c5152zv0.zzc |= 1;
    }

    public static C5038yv0 zzc() {
        return (C5038yv0) zza.i();
    }

    public static C5152zv0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C5152zv0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C5152zv0();
            case NEW_BUILDER:
                return new C5038yv0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C5152zv0.class) {
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
        return this.zze;
    }

    public final Cv0 zzf() {
        Cv0 cv0 = this.zzd;
        return cv0 == null ? Cv0.zze() : cv0;
    }
}
