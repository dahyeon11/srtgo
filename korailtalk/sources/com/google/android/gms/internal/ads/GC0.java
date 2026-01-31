package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class GC0 extends Zy0 implements Qz0 {
    private static final GC0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private int zzd;
    private VB0 zzf;
    private ZB0 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private InterfaceC3110hz0 zzi = Zy0.j();
    private String zzj = "";
    private InterfaceC3679mz0 zzl = Zy0.n();

    static {
        GC0 gc0 = new GC0();
        zza = gc0;
        Zy0.P(GC0.class, gc0);
    }

    private GC0() {
    }

    static /* synthetic */ void a0(GC0 gc0, int i8) {
        gc0.zzc |= 1;
        gc0.zzd = i8;
    }

    static /* synthetic */ void b0(GC0 gc0, String str) {
        str.getClass();
        gc0.zzc |= 2;
        gc0.zze = str;
    }

    static /* synthetic */ void c0(GC0 gc0, VB0 vb0) {
        vb0.getClass();
        gc0.zzf = vb0;
        gc0.zzc |= 4;
    }

    static /* synthetic */ void d0(GC0 gc0, EC0 ec0) {
        gc0.zzk = ec0.zza();
        gc0.zzc |= 64;
    }

    static /* synthetic */ void e0(GC0 gc0, String str) {
        str.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = gc0.zzl;
        if (!interfaceC3679mz0.zzc()) {
            gc0.zzl = Zy0.o(interfaceC3679mz0);
        }
        gc0.zzl.add(str);
    }

    public static FC0 zze() {
        return (FC0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return Zy0.t(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", DC0.f12651a, "zzl"});
            case 3:
                return new GC0();
            case 4:
                return new FC0(null);
            case 5:
                return zza;
            case 6:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (GC0.class) {
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

    public final int zzc() {
        return this.zzl.size();
    }

    public final String zzg() {
        return this.zze;
    }
}
