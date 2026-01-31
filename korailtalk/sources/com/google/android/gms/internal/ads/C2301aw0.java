package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2301aw0 extends Zy0 implements Qz0 {
    private static final C2301aw0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private C3104hw0 zze;
    private AbstractC3677my0 zzf = AbstractC3677my0.zzb;

    static {
        C2301aw0 c2301aw0 = new C2301aw0();
        zza = c2301aw0;
        Zy0.P(C2301aw0.class, c2301aw0);
    }

    private C2301aw0() {
    }

    static /* synthetic */ void a0(C2301aw0 c2301aw0, C3104hw0 c3104hw0) {
        c3104hw0.getClass();
        c2301aw0.zze = c3104hw0;
        c2301aw0.zzc |= 1;
    }

    public static Zv0 zzc() {
        return (Zv0) zza.i();
    }

    public static C2301aw0 zze() {
        return zza;
    }

    public static C2301aw0 zzf(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2301aw0) Zy0.I(zza, abstractC3677my0, iy0);
    }

    public static Xz0 zzi() {
        return zza.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        Yv0 yv0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C2301aw0();
            case NEW_BUILDER:
                return new Zv0(yv0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2301aw0.class) {
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

    public final C3104hw0 zzg() {
        C3104hw0 c3104hw0 = this.zze;
        return c3104hw0 == null ? C3104hw0.zzf() : c3104hw0;
    }

    public final AbstractC3677my0 zzh() {
        return this.zzf;
    }
}
