package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bD0 */
/* loaded from: classes2.dex */
public final class C2336bD0 extends Zy0 implements Qz0 {
    private static final C2336bD0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private InterfaceC3110hz0 zzf = Zy0.j();
    private InterfaceC3679mz0 zzh = Zy0.n();
    private AbstractC3677my0 zzi = AbstractC3677my0.zzb;

    static {
        C2336bD0 c2336bD0 = new C2336bD0();
        zza = c2336bD0;
        Zy0.P(C2336bD0.class, c2336bD0);
    }

    private C2336bD0() {
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
                return Zy0.t(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", ZC0.class, "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new C2336bD0();
            case NEW_BUILDER:
                return new C2221aD0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C2336bD0.class) {
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
