package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.cg */
/* loaded from: classes2.dex */
public final class C2497cg extends Zy0 implements InterfaceC2612dg {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C2497cg zzg;
    private static volatile Xz0 zzh;
    private int zzi;
    private int zzj = 1000;
    private C1261Df zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        C2497cg c2497cg = new C2497cg();
        zzg = c2497cg;
        Zy0.P(C2497cg.class, c2497cg);
    }

    private C2497cg() {
    }

    public void m0() {
        this.zzi &= -33;
        this.zzo = 0L;
    }

    public void n0() {
        this.zzk = null;
        this.zzi &= -3;
    }

    public void o0() {
        this.zzi &= -2;
        this.zzj = 1000;
    }

    public void p0() {
        this.zzi &= -17;
        this.zzn = 0;
    }

    public void q0() {
        this.zzi &= -5;
        this.zzl = 0;
    }

    public void r0() {
        this.zzi &= -9;
        this.zzm = 0;
    }

    public void s0(C1261Df c1261Df) {
        c1261Df.getClass();
        C1261Df c1261Df2 = this.zzk;
        if (c1261Df2 != null && c1261Df2 != C1261Df.zzg()) {
            C1138Af c1138AfZze = C1261Df.zze(c1261Df2);
            c1138AfZze.zzbj(c1261Df);
            c1261Df = (C1261Df) c1138AfZze.zzbs();
        }
        this.zzk = c1261Df;
        this.zzi |= 2;
    }

    public void t0(long j8) {
        this.zzi |= 32;
        this.zzo = j8;
    }

    public void u0(C1261Df c1261Df) {
        c1261Df.getClass();
        this.zzk = c1261Df;
        this.zzi |= 2;
    }

    public void v0(EnumC1631Mg enumC1631Mg) {
        this.zzj = enumC1631Mg.zza();
        this.zzi |= 1;
    }

    public void w0(int i8) {
        this.zzi |= 16;
        this.zzn = i8;
    }

    public void x0(int i8) {
        this.zzi |= 4;
        this.zzl = i8;
    }

    public void y0(int i8) {
        this.zzi |= 8;
        this.zzm = i8;
    }

    public static C2497cg zzA(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2497cg) Zy0.L(zzg, byteBuffer, iy0);
    }

    public static C2497cg zzB(byte[] bArr, Iy0 iy0) {
        return (C2497cg) Zy0.M(zzg, bArr, iy0);
    }

    public static Xz0 zzC() {
        return zzg.zzbM();
    }

    public static C2383bg zzg() {
        return (C2383bg) zzg.i();
    }

    public static C2383bg zzh(C2497cg c2497cg) {
        return (C2383bg) zzg.y(c2497cg);
    }

    public static C2497cg zzj() {
        return zzg;
    }

    public static C2497cg zzk(InputStream inputStream) {
        return (C2497cg) Zy0.B(zzg, inputStream);
    }

    public static C2497cg zzl(InputStream inputStream, Iy0 iy0) {
        return (C2497cg) Zy0.C(zzg, inputStream, iy0);
    }

    public static C2497cg zzm(AbstractC3677my0 abstractC3677my0) {
        return (C2497cg) Zy0.D(zzg, abstractC3677my0);
    }

    public static C2497cg zzn(AbstractC4816wy0 abstractC4816wy0) {
        return (C2497cg) Zy0.E(zzg, abstractC4816wy0);
    }

    public static C2497cg zzo(InputStream inputStream) {
        return (C2497cg) Zy0.F(zzg, inputStream);
    }

    public static C2497cg zzp(ByteBuffer byteBuffer) {
        return (C2497cg) Zy0.G(zzg, byteBuffer);
    }

    public static C2497cg zzq(byte[] bArr) {
        return (C2497cg) Zy0.H(zzg, bArr);
    }

    public static C2497cg zzr(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2497cg) Zy0.I(zzg, abstractC3677my0, iy0);
    }

    public static C2497cg zzs(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2497cg) Zy0.J(zzg, abstractC4816wy0, iy0);
    }

    public static C2497cg zzt(InputStream inputStream, Iy0 iy0) {
        return (C2497cg) Zy0.K(zzg, inputStream, iy0);
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
                return Zy0.t(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", EnumC1631Mg.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
            case NEW_MUTABLE_INSTANCE:
                return new C2497cg();
            case NEW_BUILDER:
                return new C2383bg();
            case GET_DEFAULT_INSTANCE:
                return zzg;
            case GET_PARSER:
                Xz0 uy0 = zzh;
                if (uy0 == null) {
                    synchronized (C2497cg.class) {
                        try {
                            uy0 = zzh;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzg);
                                zzh = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public int zza() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public int zzb() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public int zzc() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public long zzd() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public EnumC1631Mg zze() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzj);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public C1261Df zzf() {
        C1261Df c1261Df = this.zzk;
        return c1261Df == null ? C1261Df.zzg() : c1261Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public boolean zzu() {
        return (this.zzi & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public boolean zzv() {
        return (this.zzi & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public boolean zzw() {
        return (this.zzi & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public boolean zzx() {
        return (this.zzi & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public boolean zzy() {
        return (this.zzi & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612dg
    public boolean zzz() {
        return (this.zzi & 8) != 0;
    }
}
