package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class XC0 extends Zy0 implements Qz0 {
    private static final XC0 zza;
    private static volatile Xz0 zzb;
    private RC0 zzC;
    private GB0 zzE;
    private C4729wB0 zzG;
    private C2907gC0 zzI;
    private int zzJ;
    private long zzM;
    private WC0 zzN;
    private C3706nC0 zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private CB0 zzi;
    private C4959yC0 zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private IC0 zzx;
    private boolean zzy;
    private byte zzP = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private InterfaceC3679mz0 zzj = Zy0.n();
    private InterfaceC3679mz0 zzk = Zy0.n();
    private String zzl = "";
    private InterfaceC3679mz0 zzo = Zy0.n();
    private String zzp = "";
    private AbstractC3677my0 zzw = AbstractC3677my0.zzb;
    private String zzz = "";
    private InterfaceC3679mz0 zzA = Zy0.n();
    private InterfaceC3679mz0 zzB = Zy0.n();
    private InterfaceC3679mz0 zzD = Zy0.n();
    private String zzF = "";
    private InterfaceC3679mz0 zzH = Zy0.n();
    private InterfaceC3679mz0 zzK = Zy0.n();
    private InterfaceC3679mz0 zzL = Zy0.n();

    static {
        XC0 xc0 = new XC0();
        zza = xc0;
        Zy0.P(XC0.class, xc0);
    }

    private XC0() {
    }

    static /* synthetic */ void a0(XC0 xc0, BC0 bc0) {
        xc0.zzd = bc0.zza();
        xc0.zzc |= 1;
    }

    static /* synthetic */ void b0(XC0 xc0, String str) {
        str.getClass();
        xc0.zzc |= 4;
        xc0.zzf = str;
    }

    static /* synthetic */ void c0(XC0 xc0, String str) {
        str.getClass();
        xc0.zzc |= 8;
        xc0.zzg = str;
    }

    static /* synthetic */ void d0(XC0 xc0, CB0 cb0) {
        cb0.getClass();
        xc0.zzi = cb0;
        xc0.zzc |= 32;
    }

    static /* synthetic */ void e0(XC0 xc0, GC0 gc0) {
        gc0.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = xc0.zzj;
        if (!interfaceC3679mz0.zzc()) {
            xc0.zzj = Zy0.o(interfaceC3679mz0);
        }
        xc0.zzj.add(gc0);
    }

    static /* synthetic */ void f0(XC0 xc0, String str) {
        xc0.zzc |= 64;
        xc0.zzl = str;
    }

    static /* synthetic */ void g0(XC0 xc0) {
        xc0.zzc &= -65;
        xc0.zzl = zza.zzl;
    }

    static /* synthetic */ void h0(XC0 xc0, C4959yC0 c4959yC0) {
        c4959yC0.getClass();
        xc0.zzm = c4959yC0;
        xc0.zzc |= 128;
    }

    static /* synthetic */ void i0(XC0 xc0, IC0 ic0) {
        ic0.getClass();
        xc0.zzx = ic0;
        xc0.zzc |= 8192;
    }

    static /* synthetic */ void j0(XC0 xc0, Iterable iterable) {
        InterfaceC3679mz0 interfaceC3679mz0 = xc0.zzA;
        if (!interfaceC3679mz0.zzc()) {
            xc0.zzA = Zy0.o(interfaceC3679mz0);
        }
        Qx0.d(iterable, xc0.zzA);
    }

    static /* synthetic */ void k0(XC0 xc0, Iterable iterable) {
        InterfaceC3679mz0 interfaceC3679mz0 = xc0.zzB;
        if (!interfaceC3679mz0.zzc()) {
            xc0.zzB = Zy0.o(interfaceC3679mz0);
        }
        Qx0.d(iterable, xc0.zzB);
    }

    public static AB0 zzc() {
        return (AB0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return Zy0.t(zza, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", GC0.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", AC0.f12153a, "zze", C4957yB0.f23857a, "zzi", "zzl", "zzm", "zzw", "zzk", C2336bD0.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", C3480lD0.class, "zzE", "zzF", "zzG", "zzH", PB0.class, "zzI", "zzJ", NC0.f14809a, "zzK", C3478lC0.class, "zzL", C4389tC0.class, "zzM", "zzN", "zzO"});
            case 3:
                return new XC0();
            case 4:
                return new AB0(null);
            case 5:
                return zza;
            case 6:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (XC0.class) {
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

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
