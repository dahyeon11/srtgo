package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.av0 */
/* loaded from: classes2.dex */
public final class C2299av0 extends Zy0 implements Qz0 {
    private static final C2299av0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private C2757ev0 zze;

    static {
        C2299av0 c2299av0 = new C2299av0();
        zza = c2299av0;
        Zy0.P(C2299av0.class, c2299av0);
    }

    private C2299av0() {
    }

    static /* synthetic */ void b0(C2299av0 c2299av0, C2757ev0 c2757ev0) {
        c2757ev0.getClass();
        c2299av0.zze = c2757ev0;
        c2299av0.zzc |= 1;
    }

    public static Zu0 zzc() {
        return (Zu0) zza.i();
    }

    public static C2299av0 zze(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2299av0) Zy0.I(zza, abstractC3677my0, iy0);
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
                return Zy0.t(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C2299av0();
            case NEW_BUILDER:
                return new Zu0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2299av0.class) {
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

    public final C2757ev0 zzf() {
        C2757ev0 c2757ev0 = this.zze;
        return c2757ev0 == null ? C2757ev0.zze() : c2757ev0;
    }
}
