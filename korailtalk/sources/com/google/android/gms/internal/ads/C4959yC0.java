package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yC0 */
/* loaded from: classes2.dex */
public final class C4959yC0 extends Zy0 implements Qz0 {
    private static final C4959yC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private AbstractC3677my0 zzf;
    private AbstractC3677my0 zzg;

    static {
        C4959yC0 c4959yC0 = new C4959yC0();
        zza = c4959yC0;
        Zy0.P(C4959yC0.class, c4959yC0);
    }

    private C4959yC0() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zzf = abstractC3677my0;
        this.zzg = abstractC3677my0;
    }

    static /* synthetic */ void a0(C4959yC0 c4959yC0, EnumC4845xC0 enumC4845xC0) {
        c4959yC0.zzd = enumC4845xC0.zza();
        c4959yC0.zzc |= 1;
    }

    static /* synthetic */ void b0(C4959yC0 c4959yC0, String str) {
        c4959yC0.zzc |= 2;
        c4959yC0.zze = "image/png";
    }

    static /* synthetic */ void c0(C4959yC0 c4959yC0, AbstractC3677my0 abstractC3677my0) {
        abstractC3677my0.getClass();
        c4959yC0.zzc |= 4;
        c4959yC0.zzf = abstractC3677my0;
    }

    public static C4503uC0 zzc() {
        return (C4503uC0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return Zy0.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", C4731wC0.f23437a, "zze", "zzf", "zzg"});
            case 3:
                return new C4959yC0();
            case 4:
                return new C4503uC0(null);
            case 5:
                return zza;
            case 6:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C4959yC0.class) {
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
