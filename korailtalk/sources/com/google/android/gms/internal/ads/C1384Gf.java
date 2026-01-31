package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Gf */
/* loaded from: classes2.dex */
public final class C1384Gf extends Zy0 implements InterfaceC1425Hf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1384Gf zze;
    private static volatile Xz0 zzf;
    private int zzg;
    private C4435tf zzh;
    private int zzi = 1000;
    private C1261Df zzj;
    private C4094qf zzk;

    static {
        C1384Gf c1384Gf = new C1384Gf();
        zze = c1384Gf;
        Zy0.P(C1384Gf.class, c1384Gf);
    }

    private C1384Gf() {
    }

    public void j0() {
        this.zzj = null;
        this.zzg &= -5;
    }

    public void k0() {
        this.zzk = null;
        this.zzg &= -9;
    }

    public void l0() {
        this.zzg &= -3;
        this.zzi = 1000;
    }

    public void m0() {
        this.zzh = null;
        this.zzg &= -2;
    }

    public void n0(C1261Df c1261Df) {
        c1261Df.getClass();
        C1261Df c1261Df2 = this.zzj;
        if (c1261Df2 != null && c1261Df2 != C1261Df.zzg()) {
            C1138Af c1138AfZze = C1261Df.zze(c1261Df2);
            c1138AfZze.zzbj(c1261Df);
            c1261Df = (C1261Df) c1138AfZze.zzbs();
        }
        this.zzj = c1261Df;
        this.zzg |= 4;
    }

    public void o0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzk;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzk = c4094qf;
        this.zzg |= 8;
    }

    public void p0(C4435tf c4435tf) {
        c4435tf.getClass();
        C4435tf c4435tf2 = this.zzh;
        if (c4435tf2 != null && c4435tf2 != C4435tf.zzg()) {
            C4321sf c4321sfZze = C4435tf.zze(c4435tf2);
            c4321sfZze.zzbj(c4435tf);
            c4435tf = (C4435tf) c4321sfZze.zzbs();
        }
        this.zzh = c4435tf;
        this.zzg |= 1;
    }

    public void q0(C1261Df c1261Df) {
        c1261Df.getClass();
        this.zzj = c1261Df;
        this.zzg |= 4;
    }

    public void r0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzk = c4094qf;
        this.zzg |= 8;
    }

    public void s0(EnumC1631Mg enumC1631Mg) {
        this.zzi = enumC1631Mg.zza();
        this.zzg |= 2;
    }

    public void t0(C4435tf c4435tf) {
        c4435tf.getClass();
        this.zzh = c4435tf;
        this.zzg |= 1;
    }

    public static C1343Ff zze() {
        return (C1343Ff) zze.i();
    }

    public static C1343Ff zzf(C1384Gf c1384Gf) {
        return (C1343Ff) zze.y(c1384Gf);
    }

    public static C1384Gf zzh() {
        return zze;
    }

    public static C1384Gf zzi(InputStream inputStream) {
        return (C1384Gf) Zy0.B(zze, inputStream);
    }

    public static C1384Gf zzj(InputStream inputStream, Iy0 iy0) {
        return (C1384Gf) Zy0.C(zze, inputStream, iy0);
    }

    public static C1384Gf zzk(AbstractC3677my0 abstractC3677my0) {
        return (C1384Gf) Zy0.D(zze, abstractC3677my0);
    }

    public static C1384Gf zzl(AbstractC4816wy0 abstractC4816wy0) {
        return (C1384Gf) Zy0.E(zze, abstractC4816wy0);
    }

    public static C1384Gf zzm(InputStream inputStream) {
        return (C1384Gf) Zy0.F(zze, inputStream);
    }

    public static C1384Gf zzn(ByteBuffer byteBuffer) {
        return (C1384Gf) Zy0.G(zze, byteBuffer);
    }

    public static C1384Gf zzo(byte[] bArr) {
        return (C1384Gf) Zy0.H(zze, bArr);
    }

    public static C1384Gf zzp(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1384Gf) Zy0.I(zze, abstractC3677my0, iy0);
    }

    public static C1384Gf zzq(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1384Gf) Zy0.J(zze, abstractC4816wy0, iy0);
    }

    public static C1384Gf zzr(InputStream inputStream, Iy0 iy0) {
        return (C1384Gf) Zy0.K(zze, inputStream, iy0);
    }

    public static C1384Gf zzw(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1384Gf) Zy0.L(zze, byteBuffer, iy0);
    }

    public static C1384Gf zzx(byte[] bArr, Iy0 iy0) {
        return (C1384Gf) Zy0.M(zze, bArr, iy0);
    }

    public static Xz0 zzy() {
        return zze.zzbM();
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
                return Zy0.t(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", EnumC1631Mg.zze(), "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new C1384Gf();
            case NEW_BUILDER:
                return new C1343Ff();
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                Xz0 uy0 = zzf;
                if (uy0 == null) {
                    synchronized (C1384Gf.class) {
                        try {
                            uy0 = zzf;
                            if (uy0 == null) {
                                uy0 = new Uy0(zze);
                                zzf = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public EnumC1631Mg zza() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzi);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public C4094qf zzb() {
        C4094qf c4094qf = this.zzk;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public C4435tf zzc() {
        C4435tf c4435tf = this.zzh;
        return c4435tf == null ? C4435tf.zzg() : c4435tf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public C1261Df zzd() {
        C1261Df c1261Df = this.zzj;
        return c1261Df == null ? C1261Df.zzg() : c1261Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public boolean zzs() {
        return (this.zzg & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public boolean zzt() {
        return (this.zzg & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public boolean zzu() {
        return (this.zzg & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1425Hf
    public boolean zzv() {
        return (this.zzg & 1) != 0;
    }
}
