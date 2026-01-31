package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4242rw0 extends Zy0 implements Qz0 {
    private static final C4242rw0 zza;
    private static volatile Xz0 zzb;
    private String zzc = "";
    private AbstractC3677my0 zzd = AbstractC3677my0.zzb;
    private int zze;

    static {
        C4242rw0 c4242rw0 = new C4242rw0();
        zza = c4242rw0;
        Zy0.P(C4242rw0.class, c4242rw0);
    }

    private C4242rw0() {
    }

    static /* synthetic */ void a0(C4242rw0 c4242rw0, String str) {
        str.getClass();
        c4242rw0.zzc = str;
    }

    static /* synthetic */ void b0(C4242rw0 c4242rw0, AbstractC3677my0 abstractC3677my0) {
        abstractC3677my0.getClass();
        c4242rw0.zzd = abstractC3677my0;
    }

    public static C4129qw0 zza() {
        return (C4129qw0) zza.i();
    }

    public static C4129qw0 zzc(C4242rw0 c4242rw0) {
        return (C4129qw0) zza.y(c4242rw0);
    }

    public static C4242rw0 zze() {
        return zza;
    }

    public static C4242rw0 zzf(byte[] bArr, Iy0 iy0) {
        return (C4242rw0) Zy0.M(zza, bArr, iy0);
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC4015pw0 abstractC4015pw0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new C4242rw0();
            case NEW_BUILDER:
                return new C4129qw0(abstractC4015pw0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C4242rw0.class) {
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

    public final Tw0 zzg() {
        Tw0 tw0Zzb = Tw0.zzb(this.zze);
        return tw0Zzb == null ? Tw0.UNRECOGNIZED : tw0Zzb;
    }

    public final AbstractC3677my0 zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
