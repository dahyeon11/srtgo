package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.fg */
/* loaded from: classes2.dex */
public final class C2841fg extends Zy0 implements InterfaceC2956gg {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C2841fg zzd;
    private static volatile Xz0 zze;
    private int zzf;
    private int zzg = 1000;
    private C1261Df zzh;
    private C4094qf zzi;

    static {
        C2841fg c2841fg = new C2841fg();
        zzd = c2841fg;
        Zy0.P(C2841fg.class, c2841fg);
    }

    private C2841fg() {
    }

    public void e0() {
        this.zzh = null;
        this.zzf &= -3;
    }

    public void f0() {
        this.zzi = null;
        this.zzf &= -5;
    }

    public void g0() {
        this.zzf &= -2;
        this.zzg = 1000;
    }

    public void h0(C1261Df c1261Df) {
        c1261Df.getClass();
        C1261Df c1261Df2 = this.zzh;
        if (c1261Df2 != null && c1261Df2 != C1261Df.zzg()) {
            C1138Af c1138AfZze = C1261Df.zze(c1261Df2);
            c1138AfZze.zzbj(c1261Df);
            c1261Df = (C1261Df) c1138AfZze.zzbs();
        }
        this.zzh = c1261Df;
        this.zzf |= 2;
    }

    public void i0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzi;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzi = c4094qf;
        this.zzf |= 4;
    }

    public void j0(C1261Df c1261Df) {
        c1261Df.getClass();
        this.zzh = c1261Df;
        this.zzf |= 2;
    }

    public void k0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzi = c4094qf;
        this.zzf |= 4;
    }

    public void l0(EnumC1631Mg enumC1631Mg) {
        this.zzg = enumC1631Mg.zza();
        this.zzf |= 1;
    }

    public static C2726eg zzd() {
        return (C2726eg) zzd.i();
    }

    public static C2726eg zze(C2841fg c2841fg) {
        return (C2726eg) zzd.y(c2841fg);
    }

    public static C2841fg zzg() {
        return zzd;
    }

    public static C2841fg zzh(InputStream inputStream) {
        return (C2841fg) Zy0.B(zzd, inputStream);
    }

    public static C2841fg zzi(InputStream inputStream, Iy0 iy0) {
        return (C2841fg) Zy0.C(zzd, inputStream, iy0);
    }

    public static C2841fg zzj(AbstractC3677my0 abstractC3677my0) {
        return (C2841fg) Zy0.D(zzd, abstractC3677my0);
    }

    public static C2841fg zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C2841fg) Zy0.E(zzd, abstractC4816wy0);
    }

    public static C2841fg zzl(InputStream inputStream) {
        return (C2841fg) Zy0.F(zzd, inputStream);
    }

    public static C2841fg zzm(ByteBuffer byteBuffer) {
        return (C2841fg) Zy0.G(zzd, byteBuffer);
    }

    public static C2841fg zzq(byte[] bArr) {
        return (C2841fg) Zy0.H(zzd, bArr);
    }

    public static C2841fg zzr(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2841fg) Zy0.I(zzd, abstractC3677my0, iy0);
    }

    public static C2841fg zzs(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2841fg) Zy0.J(zzd, abstractC4816wy0, iy0);
    }

    public static C2841fg zzt(InputStream inputStream, Iy0 iy0) {
        return (C2841fg) Zy0.K(zzd, inputStream, iy0);
    }

    public static C2841fg zzu(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2841fg) Zy0.L(zzd, byteBuffer, iy0);
    }

    public static C2841fg zzv(byte[] bArr, Iy0 iy0) {
        return (C2841fg) Zy0.M(zzd, bArr, iy0);
    }

    public static Xz0 zzw() {
        return zzd.zzbM();
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
                return Zy0.t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC1631Mg.zze(), "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new C2841fg();
            case NEW_BUILDER:
                return new C2726eg();
            case GET_DEFAULT_INSTANCE:
                return zzd;
            case GET_PARSER:
                Xz0 uy0 = zze;
                if (uy0 == null) {
                    synchronized (C2841fg.class) {
                        try {
                            uy0 = zze;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzd);
                                zze = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2956gg
    public EnumC1631Mg zza() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzg);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2956gg
    public C4094qf zzb() {
        C4094qf c4094qf = this.zzi;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2956gg
    public C1261Df zzc() {
        C1261Df c1261Df = this.zzh;
        return c1261Df == null ? C1261Df.zzg() : c1261Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2956gg
    public boolean zzn() {
        return (this.zzf & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2956gg
    public boolean zzo() {
        return (this.zzf & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2956gg
    public boolean zzp() {
        return (this.zzf & 1) != 0;
    }
}
