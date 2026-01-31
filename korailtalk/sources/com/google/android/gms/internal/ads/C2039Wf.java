package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Wf */
/* loaded from: classes2.dex */
public final class C2039Wf extends Zy0 implements InterfaceC2080Xf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C2039Wf zzf;
    private static volatile Xz0 zzg;
    private int zzh;
    private int zzi = 1000;
    private C1261Df zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        C2039Wf c2039Wf = new C2039Wf();
        zzf = c2039Wf;
        Zy0.P(C2039Wf.class, c2039Wf);
    }

    private C2039Wf() {
    }

    public void k0() {
        this.zzj = null;
        this.zzh &= -3;
    }

    public void l0() {
        this.zzh &= -2;
        this.zzi = 1000;
    }

    public void m0() {
        this.zzh &= -17;
        this.zzm = 0;
    }

    public void n0() {
        this.zzh &= -5;
        this.zzk = 0;
    }

    public void o0() {
        this.zzh &= -9;
        this.zzl = 0;
    }

    public void p0(C1261Df c1261Df) {
        c1261Df.getClass();
        C1261Df c1261Df2 = this.zzj;
        if (c1261Df2 != null && c1261Df2 != C1261Df.zzg()) {
            C1138Af c1138AfZze = C1261Df.zze(c1261Df2);
            c1138AfZze.zzbj(c1261Df);
            c1261Df = (C1261Df) c1138AfZze.zzbs();
        }
        this.zzj = c1261Df;
        this.zzh |= 2;
    }

    public void q0(C1261Df c1261Df) {
        c1261Df.getClass();
        this.zzj = c1261Df;
        this.zzh |= 2;
    }

    public void r0(EnumC1631Mg enumC1631Mg) {
        this.zzi = enumC1631Mg.zza();
        this.zzh |= 1;
    }

    public void s0(int i8) {
        this.zzh |= 16;
        this.zzm = i8;
    }

    public void t0(int i8) {
        this.zzh |= 4;
        this.zzk = i8;
    }

    public void u0(int i8) {
        this.zzh |= 8;
        this.zzl = i8;
    }

    public static Xz0 zzA() {
        return zzf.zzbM();
    }

    public static C1998Vf zzf() {
        return (C1998Vf) zzf.i();
    }

    public static C1998Vf zzg(C2039Wf c2039Wf) {
        return (C1998Vf) zzf.y(c2039Wf);
    }

    public static C2039Wf zzi() {
        return zzf;
    }

    public static C2039Wf zzj(InputStream inputStream) {
        return (C2039Wf) Zy0.B(zzf, inputStream);
    }

    public static C2039Wf zzk(InputStream inputStream, Iy0 iy0) {
        return (C2039Wf) Zy0.C(zzf, inputStream, iy0);
    }

    public static C2039Wf zzl(AbstractC3677my0 abstractC3677my0) {
        return (C2039Wf) Zy0.D(zzf, abstractC3677my0);
    }

    public static C2039Wf zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C2039Wf) Zy0.E(zzf, abstractC4816wy0);
    }

    public static C2039Wf zzn(InputStream inputStream) {
        return (C2039Wf) Zy0.F(zzf, inputStream);
    }

    public static C2039Wf zzo(ByteBuffer byteBuffer) {
        return (C2039Wf) Zy0.G(zzf, byteBuffer);
    }

    public static C2039Wf zzp(byte[] bArr) {
        return (C2039Wf) Zy0.H(zzf, bArr);
    }

    public static C2039Wf zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2039Wf) Zy0.I(zzf, abstractC3677my0, iy0);
    }

    public static C2039Wf zzw(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2039Wf) Zy0.J(zzf, abstractC4816wy0, iy0);
    }

    public static C2039Wf zzx(InputStream inputStream, Iy0 iy0) {
        return (C2039Wf) Zy0.K(zzf, inputStream, iy0);
    }

    public static C2039Wf zzy(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2039Wf) Zy0.L(zzf, byteBuffer, iy0);
    }

    public static C2039Wf zzz(byte[] bArr, Iy0 iy0) {
        return (C2039Wf) Zy0.M(zzf, bArr, iy0);
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
                return Zy0.t(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", EnumC1631Mg.zze(), "zzj", "zzk", "zzl", "zzm"});
            case NEW_MUTABLE_INSTANCE:
                return new C2039Wf();
            case NEW_BUILDER:
                return new C1998Vf();
            case GET_DEFAULT_INSTANCE:
                return zzf;
            case GET_PARSER:
                Xz0 uy0 = zzg;
                if (uy0 == null) {
                    synchronized (C2039Wf.class) {
                        try {
                            uy0 = zzg;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzf);
                                zzg = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public int zza() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public int zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public int zzc() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public EnumC1631Mg zzd() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzi);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public C1261Df zze() {
        C1261Df c1261Df = this.zzj;
        return c1261Df == null ? C1261Df.zzg() : c1261Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public boolean zzr() {
        return (this.zzh & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public boolean zzs() {
        return (this.zzh & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public boolean zzt() {
        return (this.zzh & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public boolean zzu() {
        return (this.zzh & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2080Xf
    public boolean zzv() {
        return (this.zzh & 8) != 0;
    }
}
