package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class VB0 extends Zy0 implements Qz0 {
    private static final VB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private UB0 zzd;
    private AbstractC3677my0 zzf;
    private AbstractC3677my0 zzg;
    private int zzh;
    private byte zzi = 2;
    private InterfaceC3679mz0 zze = Zy0.n();

    static {
        VB0 vb0 = new VB0();
        zza = vb0;
        Zy0.P(VB0.class, vb0);
    }

    private VB0() {
        AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
        this.zzf = abstractC3677my0;
        this.zzg = abstractC3677my0;
    }

    static /* synthetic */ void a0(VB0 vb0, RB0 rb0) {
        rb0.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = vb0.zze;
        if (!interfaceC3679mz0.zzc()) {
            vb0.zze = Zy0.o(interfaceC3679mz0);
        }
        vb0.zze.add(rb0);
    }

    public static SB0 zzc() {
        return (SB0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", RB0.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new VB0();
            case NEW_BUILDER:
                return new SB0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (VB0.class) {
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
