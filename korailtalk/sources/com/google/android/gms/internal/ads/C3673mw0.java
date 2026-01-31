package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3673mw0 extends Zy0 implements Qz0 {
    private static final C3673mw0 zza;
    private static volatile Xz0 zzb;
    private String zzc = "";
    private AbstractC3677my0 zzd = AbstractC3677my0.zzb;
    private int zze;

    static {
        C3673mw0 c3673mw0 = new C3673mw0();
        zza = c3673mw0;
        Zy0.P(C3673mw0.class, c3673mw0);
    }

    private C3673mw0() {
    }

    static /* synthetic */ void a0(C3673mw0 c3673mw0, String str) {
        str.getClass();
        c3673mw0.zzc = str;
    }

    static /* synthetic */ void b0(C3673mw0 c3673mw0, AbstractC3677my0 abstractC3677my0) {
        abstractC3677my0.getClass();
        c3673mw0.zzd = abstractC3677my0;
    }

    public static C3331jw0 zza() {
        return (C3331jw0) zza.i();
    }

    public static C3673mw0 zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC3217iw0 abstractC3217iw0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C3673mw0();
            case NEW_BUILDER:
                return new C3331jw0(abstractC3217iw0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3673mw0.class) {
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

    public final EnumC3559lw0 zzc() {
        EnumC3559lw0 enumC3559lw0Zzb = EnumC3559lw0.zzb(this.zze);
        return enumC3559lw0Zzb == null ? EnumC3559lw0.UNRECOGNIZED : enumC3559lw0Zzb;
    }

    public final AbstractC3677my0 zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
