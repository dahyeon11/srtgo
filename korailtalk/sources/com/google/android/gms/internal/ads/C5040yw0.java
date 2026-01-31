package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yw0 */
/* loaded from: classes2.dex */
public final class C5040yw0 extends Zy0 implements Qz0 {
    private static final C5040yw0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private C3673mw0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5040yw0 c5040yw0 = new C5040yw0();
        zza = c5040yw0;
        Zy0.P(C5040yw0.class, c5040yw0);
    }

    private C5040yw0() {
    }

    static /* synthetic */ void a0(C5040yw0 c5040yw0, C3673mw0 c3673mw0) {
        c3673mw0.getClass();
        c5040yw0.zzd = c3673mw0;
        c5040yw0.zzc |= 1;
    }

    public static C4926xw0 zze() {
        return (C4926xw0) zza.i();
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
                return Zy0.t(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C5040yw0();
            case NEW_BUILDER:
                return new C4926xw0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C5040yw0.class) {
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
        return this.zzf;
    }

    public final C3673mw0 zzc() {
        C3673mw0 c3673mw0 = this.zzd;
        return c3673mw0 == null ? C3673mw0.zze() : c3673mw0;
    }

    public final EnumC3901ow0 zzd() {
        EnumC3901ow0 enumC3901ow0Zzb = EnumC3901ow0.zzb(this.zze);
        return enumC3901ow0Zzb == null ? EnumC3901ow0.UNRECOGNIZED : enumC3901ow0Zzb;
    }

    public final Tw0 zzg() {
        Tw0 tw0Zzb = Tw0.zzb(this.zzg);
        return tw0Zzb == null ? Tw0.UNRECOGNIZED : tw0Zzb;
    }

    public final boolean zzl() {
        return (this.zzc & 1) != 0;
    }
}
