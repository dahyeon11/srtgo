package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4777wf extends Zy0 implements InterfaceC3071hg {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final C4777wf zzu;
    private static volatile Xz0 zzv;
    private C3298jg zzA;
    private C5005yf zzB;
    private C2162Zf zzC;
    private C1384Gf zzD;
    private int zzE;
    private int zzF;
    private C4094qf zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private C2039Wf zzx;
    private C2497cg zzy;
    private C2841fg zzz;

    static {
        C4777wf c4777wf = new C4777wf();
        zzu = c4777wf;
        Zy0.P(C4777wf.class, c4777wf);
    }

    private C4777wf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A1(C2162Zf c2162Zf) {
        c2162Zf.getClass();
        C2162Zf c2162Zf2 = this.zzC;
        if (c2162Zf2 != null && c2162Zf2 != C2162Zf.zzg()) {
            C2121Yf c2121YfZze = C2162Zf.zze(c2162Zf2);
            c2121YfZze.zzbj(c2162Zf);
            c2162Zf = (C2162Zf) c2121YfZze.zzbs();
        }
        this.zzC = c2162Zf;
        this.zzw |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(C2497cg c2497cg) {
        c2497cg.getClass();
        C2497cg c2497cg2 = this.zzy;
        if (c2497cg2 != null && c2497cg2 != C2497cg.zzj()) {
            C2383bg c2383bgZzh = C2497cg.zzh(c2497cg2);
            c2383bgZzh.zzbj(c2497cg);
            c2497cg = (C2497cg) c2383bgZzh.zzbs();
        }
        this.zzy = c2497cg;
        this.zzw |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(C2841fg c2841fg) {
        c2841fg.getClass();
        C2841fg c2841fg2 = this.zzz;
        if (c2841fg2 != null && c2841fg2 != C2841fg.zzg()) {
            C2726eg c2726egZze = C2841fg.zze(c2841fg2);
            c2726egZze.zzbj(c2841fg);
            c2841fg = (C2841fg) c2726egZze.zzbs();
        }
        this.zzz = c2841fg;
        this.zzw |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzG;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzG = c4094qf;
        this.zzw |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(C3298jg c3298jg) {
        c3298jg.getClass();
        C3298jg c3298jg2 = this.zzA;
        if (c3298jg2 != null && c3298jg2 != C3298jg.zzf()) {
            C3185ig c3185igZzd = C3298jg.zzd(c3298jg2);
            c3185igZzd.zzbj(c3298jg);
            c3298jg = (C3298jg) c3185igZzd.zzbs();
        }
        this.zzA = c3298jg;
        this.zzw |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(C5005yf c5005yf) {
        c5005yf.getClass();
        this.zzB = c5005yf;
        this.zzw |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(C1384Gf c1384Gf) {
        c1384Gf.getClass();
        this.zzD = c1384Gf;
        this.zzw |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(C2039Wf c2039Wf) {
        c2039Wf.getClass();
        this.zzx = c2039Wf;
        this.zzw |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(C2162Zf c2162Zf) {
        c2162Zf.getClass();
        this.zzC = c2162Zf;
        this.zzw |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(C2497cg c2497cg) {
        c2497cg.getClass();
        this.zzy = c2497cg;
        this.zzw |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(C2841fg c2841fg) {
        c2841fg.getClass();
        this.zzz = c2841fg;
        this.zzw |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(int i8) {
        this.zzw |= 8192;
        this.zzK = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(int i8) {
        this.zzw |= 16384;
        this.zzL = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0(int i8) {
        this.zzw |= 1024;
        this.zzH = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(int i8) {
        this.zzw |= 128;
        this.zzE = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(int i8) {
        this.zzw |= 256;
        this.zzF = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(int i8) {
        this.zzw |= 2048;
        this.zzI = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(int i8) {
        this.zzw |= 4096;
        this.zzJ = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzG = c4094qf;
        this.zzw |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(long j8) {
        this.zzw |= 32768;
        this.zzM = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(C3298jg c3298jg) {
        c3298jg.getClass();
        this.zzA = c3298jg;
        this.zzw |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1() {
        this.zzB = null;
        this.zzw &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1() {
        this.zzD = null;
        this.zzw &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1() {
        this.zzx = null;
        this.zzw &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1() {
        this.zzC = null;
        this.zzw &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l1() {
        this.zzy = null;
        this.zzw &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1() {
        this.zzz = null;
        this.zzw &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        this.zzw &= -8193;
        this.zzK = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        this.zzw &= -16385;
        this.zzL = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1() {
        this.zzw &= -1025;
        this.zzH = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1() {
        this.zzw &= -129;
        this.zzE = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        this.zzw &= -257;
        this.zzF = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1() {
        this.zzw &= -2049;
        this.zzI = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1() {
        this.zzw &= -4097;
        this.zzJ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1() {
        this.zzG = null;
        this.zzw &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1() {
        this.zzw &= -32769;
        this.zzM = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1() {
        this.zzA = null;
        this.zzw &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1(C5005yf c5005yf) {
        c5005yf.getClass();
        C5005yf c5005yf2 = this.zzB;
        if (c5005yf2 != null && c5005yf2 != C5005yf.zzf()) {
            C4891xf c4891xfZzd = C5005yf.zzd(c5005yf2);
            c4891xfZzd.zzbj(c5005yf);
            c5005yf = (C5005yf) c4891xfZzd.zzbs();
        }
        this.zzB = c5005yf;
        this.zzw |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(C1384Gf c1384Gf) {
        c1384Gf.getClass();
        C1384Gf c1384Gf2 = this.zzD;
        if (c1384Gf2 != null && c1384Gf2 != C1384Gf.zzh()) {
            C1343Ff c1343FfZzf = C1384Gf.zzf(c1384Gf2);
            c1343FfZzf.zzbj(c1384Gf);
            c1384Gf = (C1384Gf) c1343FfZzf.zzbs();
        }
        this.zzD = c1384Gf;
        this.zzw |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1(C2039Wf c2039Wf) {
        c2039Wf.getClass();
        C2039Wf c2039Wf2 = this.zzx;
        if (c2039Wf2 != null && c2039Wf2 != C2039Wf.zzi()) {
            C1998Vf c1998VfZzg = C2039Wf.zzg(c2039Wf2);
            c1998VfZzg.zzbj(c2039Wf);
            c2039Wf = (C2039Wf) c1998VfZzg.zzbs();
        }
        this.zzx = c2039Wf;
        this.zzw |= 1;
    }

    public static C4663vf zzj() {
        return (C4663vf) zzu.i();
    }

    public static C4663vf zzk(C4777wf c4777wf) {
        return (C4663vf) zzu.y(c4777wf);
    }

    public static C4777wf zzm() {
        return zzu;
    }

    public static C4777wf zzn(InputStream inputStream) {
        return (C4777wf) Zy0.B(zzu, inputStream);
    }

    public static C4777wf zzo(InputStream inputStream, Iy0 iy0) {
        return (C4777wf) Zy0.C(zzu, inputStream, iy0);
    }

    public static C4777wf zzp(AbstractC3677my0 abstractC3677my0) {
        return (C4777wf) Zy0.D(zzu, abstractC3677my0);
    }

    public static C4777wf zzq(AbstractC4816wy0 abstractC4816wy0) {
        return (C4777wf) Zy0.E(zzu, abstractC4816wy0);
    }

    public static C4777wf zzr(InputStream inputStream) {
        return (C4777wf) Zy0.F(zzu, inputStream);
    }

    public static C4777wf zzs(ByteBuffer byteBuffer) {
        return (C4777wf) Zy0.G(zzu, byteBuffer);
    }

    public static C4777wf zzt(byte[] bArr) {
        return (C4777wf) Zy0.H(zzu, bArr);
    }

    public static C4777wf zzu(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C4777wf) Zy0.I(zzu, abstractC3677my0, iy0);
    }

    public static C4777wf zzv(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C4777wf) Zy0.J(zzu, abstractC4816wy0, iy0);
    }

    public static C4777wf zzw(InputStream inputStream, Iy0 iy0) {
        return (C4777wf) Zy0.K(zzu, inputStream, iy0);
    }

    public static C4777wf zzx(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C4777wf) Zy0.L(zzu, byteBuffer, iy0);
    }

    public static C4777wf zzy(byte[] bArr, Iy0 iy0) {
        return (C4777wf) Zy0.M(zzu, bArr, iy0);
    }

    public static Xz0 zzz() {
        return zzu.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC1341Fe abstractC1341Fe = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zzu, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
            case NEW_MUTABLE_INSTANCE:
                return new C4777wf();
            case NEW_BUILDER:
                return new C4663vf();
            case GET_DEFAULT_INSTANCE:
                return zzu;
            case GET_PARSER:
                Xz0 uy0 = zzv;
                if (uy0 == null) {
                    synchronized (C4777wf.class) {
                        try {
                            uy0 = zzv;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzu);
                                zzv = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zza() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzaA() {
        return (this.zzw & 32768) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzaB() {
        return (this.zzw & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C5005yf zzaf() {
        C5005yf c5005yf = this.zzB;
        return c5005yf == null ? C5005yf.zzf() : c5005yf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C1384Gf zzag() {
        C1384Gf c1384Gf = this.zzD;
        return c1384Gf == null ? C1384Gf.zzh() : c1384Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C2039Wf zzah() {
        C2039Wf c2039Wf = this.zzx;
        return c2039Wf == null ? C2039Wf.zzi() : c2039Wf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C2162Zf zzai() {
        C2162Zf c2162Zf = this.zzC;
        return c2162Zf == null ? C2162Zf.zzg() : c2162Zf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C2497cg zzaj() {
        C2497cg c2497cg = this.zzy;
        return c2497cg == null ? C2497cg.zzj() : c2497cg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C2841fg zzak() {
        C2841fg c2841fg = this.zzz;
        return c2841fg == null ? C2841fg.zzg() : c2841fg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C3298jg zzal() {
        C3298jg c3298jg = this.zzA;
        return c3298jg == null ? C3298jg.zzf() : c3298jg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzam() {
        return (this.zzw & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzan() {
        return (this.zzw & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzao() {
        return (this.zzw & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzap() {
        return (this.zzw & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzaq() {
        return (this.zzw & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzar() {
        return (this.zzw & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzas() {
        return (this.zzw & 8192) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzat() {
        return (this.zzw & 16384) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzau() {
        return (this.zzw & 1024) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzav() {
        return (this.zzw & 128) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzaw() {
        return (this.zzw & 256) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzax() {
        return (this.zzw & 2048) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzay() {
        return (this.zzw & 4096) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public boolean zzaz() {
        return (this.zzw & 512) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zzb() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zzc() {
        return this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zzd() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zze() {
        return this.zzF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zzf() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public int zzg() {
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public long zzh() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3071hg
    public C4094qf zzi() {
        C4094qf c4094qf = this.zzG;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }
}
