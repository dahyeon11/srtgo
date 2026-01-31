package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Je */
/* loaded from: classes2.dex */
public final class C1505Je extends Zy0 implements InterfaceC4551ug {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final C1505Je zzl;
    private static volatile Xz0 zzm;
    private C2000Vg zzA;
    private C2123Yg zzB;
    private int zzn;
    private int zzo;
    private C4779wg zzu;
    private C5121zg zzv;
    private C1222Cg zzx;
    private C2724ef zzy;
    private C1873Se zzz;
    private int zzp = 1000;
    private InterfaceC3679mz0 zzw = Zy0.n();
    private InterfaceC3679mz0 zzC = Zy0.n();

    static {
        C1505Je c1505Je = new C1505Je();
        zzl = c1505Je;
        Zy0.P(C1505Je.class, c1505Je);
    }

    private C1505Je() {
    }

    public void D0(Iterable iterable) {
        l1();
        Qx0.d(iterable, this.zzw);
    }

    public void E0(Iterable iterable) {
        m1();
        Qx0.d(iterable, this.zzC);
    }

    public void F0(C4323sg c4323sg) {
        c4323sg.getClass();
        l1();
        this.zzw.add(c4323sg);
    }

    public void G0(int i8, C4323sg c4323sg) {
        c4323sg.getClass();
        l1();
        this.zzw.add(i8, c4323sg);
    }

    public void H0(C4777wf c4777wf) {
        c4777wf.getClass();
        m1();
        this.zzC.add(c4777wf);
    }

    public void I0(int i8, C4777wf c4777wf) {
        c4777wf.getClass();
        m1();
        this.zzC.add(i8, c4777wf);
    }

    public void J0() {
        this.zzn &= -2;
        this.zzo = 0;
    }

    public void P0(int i8) {
        m1();
        this.zzC.remove(i8);
    }

    public void Q0(EnumC1382Ge enumC1382Ge) {
        this.zzo = enumC1382Ge.zza();
        this.zzn |= 1;
    }

    public void R0(C2000Vg c2000Vg) {
        c2000Vg.getClass();
        this.zzA = c2000Vg;
        this.zzn |= 128;
    }

    public void S0(EnumC1631Mg enumC1631Mg) {
        this.zzp = enumC1631Mg.zza();
        this.zzn |= 2;
    }

    public void T0(C2123Yg c2123Yg) {
        c2123Yg.getClass();
        this.zzB = c2123Yg;
        this.zzn |= 256;
    }

    public void U0(C1873Se c1873Se) {
        c1873Se.getClass();
        this.zzz = c1873Se;
        this.zzn |= 64;
    }

    public void V0(int i8, C4323sg c4323sg) {
        c4323sg.getClass();
        l1();
        this.zzw.set(i8, c4323sg);
    }

    public void W0(C4779wg c4779wg) {
        c4779wg.getClass();
        this.zzu = c4779wg;
        this.zzn |= 4;
    }

    public void X0(C5121zg c5121zg) {
        c5121zg.getClass();
        this.zzv = c5121zg;
        this.zzn |= 8;
    }

    public void Y0(C2724ef c2724ef) {
        c2724ef.getClass();
        this.zzy = c2724ef;
        this.zzn |= 32;
    }

    public void Z0(C1222Cg c1222Cg) {
        c1222Cg.getClass();
        this.zzx = c1222Cg;
        this.zzn |= 16;
    }

    public void a1(int i8, C4777wf c4777wf) {
        c4777wf.getClass();
        m1();
        this.zzC.set(i8, c4777wf);
    }

    public void b1() {
        this.zzA = null;
        this.zzn &= -129;
    }

    public void c1() {
        this.zzn &= -3;
        this.zzp = 1000;
    }

    public void d1() {
        this.zzB = null;
        this.zzn &= -257;
    }

    public void e1() {
        this.zzz = null;
        this.zzn &= -65;
    }

    public void f1() {
        this.zzw = Zy0.n();
    }

    public void g1() {
        this.zzu = null;
        this.zzn &= -5;
    }

    public void h1() {
        this.zzv = null;
        this.zzn &= -9;
    }

    public void i1() {
        this.zzy = null;
        this.zzn &= -33;
    }

    public void j1() {
        this.zzx = null;
        this.zzn &= -17;
    }

    public void k1() {
        this.zzC = Zy0.n();
    }

    private void l1() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzw;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzw = Zy0.o(interfaceC3679mz0);
    }

    private void m1() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzC;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzC = Zy0.o(interfaceC3679mz0);
    }

    public void n1(C2000Vg c2000Vg) {
        c2000Vg.getClass();
        C2000Vg c2000Vg2 = this.zzA;
        if (c2000Vg2 != null && c2000Vg2 != C2000Vg.zzg()) {
            C1959Ug c1959UgZze = C2000Vg.zze(c2000Vg2);
            c1959UgZze.zzbj(c2000Vg);
            c2000Vg = (C2000Vg) c1959UgZze.zzbs();
        }
        this.zzA = c2000Vg;
        this.zzn |= 128;
    }

    public void o1(C2123Yg c2123Yg) {
        c2123Yg.getClass();
        C2123Yg c2123Yg2 = this.zzB;
        if (c2123Yg2 != null && c2123Yg2 != C2123Yg.zzg()) {
            C2082Xg c2082XgZze = C2123Yg.zze(c2123Yg2);
            c2082XgZze.zzbj(c2123Yg);
            c2123Yg = (C2123Yg) c2082XgZze.zzbs();
        }
        this.zzB = c2123Yg;
        this.zzn |= 256;
    }

    public void p1(C1873Se c1873Se) {
        c1873Se.getClass();
        C1873Se c1873Se2 = this.zzz;
        if (c1873Se2 != null && c1873Se2 != C1873Se.zzf()) {
            C1832Re c1832ReZzd = C1873Se.zzd(c1873Se2);
            c1832ReZzd.zzbj(c1873Se);
            c1873Se = (C1873Se) c1832ReZzd.zzbs();
        }
        this.zzz = c1873Se;
        this.zzn |= 64;
    }

    public void q1(C4779wg c4779wg) {
        c4779wg.getClass();
        C4779wg c4779wg2 = this.zzu;
        if (c4779wg2 != null && c4779wg2 != C4779wg.zzg()) {
            C4665vg c4665vgZze = C4779wg.zze(c4779wg2);
            c4665vgZze.zzbj(c4779wg);
            c4779wg = (C4779wg) c4665vgZze.zzbs();
        }
        this.zzu = c4779wg;
        this.zzn |= 4;
    }

    public void r1(C5121zg c5121zg) {
        c5121zg.getClass();
        C5121zg c5121zg2 = this.zzv;
        if (c5121zg2 != null && c5121zg2 != C5121zg.zzg()) {
            C5007yg c5007ygZze = C5121zg.zze(c5121zg2);
            c5007ygZze.zzbj(c5121zg);
            c5121zg = (C5121zg) c5007ygZze.zzbs();
        }
        this.zzv = c5121zg;
        this.zzn |= 8;
    }

    public void s1(C2724ef c2724ef) {
        c2724ef.getClass();
        C2724ef c2724ef2 = this.zzy;
        if (c2724ef2 != null && c2724ef2 != C2724ef.zzn()) {
            C2610df c2610dfZzl = C2724ef.zzl(c2724ef2);
            c2610dfZzl.zzbj(c2724ef);
            c2724ef = (C2724ef) c2610dfZzl.zzbs();
        }
        this.zzy = c2724ef;
        this.zzn |= 32;
    }

    public void t1(C1222Cg c1222Cg) {
        c1222Cg.getClass();
        C1222Cg c1222Cg2 = this.zzx;
        if (c1222Cg2 != null && c1222Cg2 != C1222Cg.zzg()) {
            C1181Bg c1181BgZze = C1222Cg.zze(c1222Cg2);
            c1181BgZze.zzbj(c1222Cg);
            c1222Cg = (C1222Cg) c1181BgZze.zzbs();
        }
        this.zzx = c1222Cg;
        this.zzn |= 16;
    }

    public void u1(int i8) {
        l1();
        this.zzw.remove(i8);
    }

    public static C1464Ie zzd() {
        return (C1464Ie) zzl.i();
    }

    public static C1464Ie zze(C1505Je c1505Je) {
        return (C1464Ie) zzl.y(c1505Je);
    }

    public static C1505Je zzg() {
        return zzl;
    }

    public static C1505Je zzh(InputStream inputStream) {
        return (C1505Je) Zy0.B(zzl, inputStream);
    }

    public static C1505Je zzi(InputStream inputStream, Iy0 iy0) {
        return (C1505Je) Zy0.C(zzl, inputStream, iy0);
    }

    public static C1505Je zzj(AbstractC3677my0 abstractC3677my0) {
        return (C1505Je) Zy0.D(zzl, abstractC3677my0);
    }

    public static C1505Je zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C1505Je) Zy0.E(zzl, abstractC4816wy0);
    }

    public static C1505Je zzl(InputStream inputStream) {
        return (C1505Je) Zy0.F(zzl, inputStream);
    }

    public static C1505Je zzm(ByteBuffer byteBuffer) {
        return (C1505Je) Zy0.G(zzl, byteBuffer);
    }

    public static C1505Je zzn(byte[] bArr) {
        return (C1505Je) Zy0.H(zzl, bArr);
    }

    public static C1505Je zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1505Je) Zy0.I(zzl, abstractC3677my0, iy0);
    }

    public static C1505Je zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1505Je) Zy0.J(zzl, abstractC4816wy0, iy0);
    }

    public static C1505Je zzq(InputStream inputStream, Iy0 iy0) {
        return (C1505Je) Zy0.K(zzl, inputStream, iy0);
    }

    public static C1505Je zzr(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1505Je) Zy0.L(zzl, byteBuffer, iy0);
    }

    public static C1505Je zzs(byte[] bArr, Iy0 iy0) {
        return (C1505Je) Zy0.M(zzl, bArr, iy0);
    }

    public static Xz0 zzv() {
        return zzl.zzbM();
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
                return Zy0.t(zzl, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC1382Ge.zze(), "zzp", EnumC1631Mg.zze(), "zzu", "zzv", "zzw", C4323sg.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", C4777wf.class});
            case NEW_MUTABLE_INSTANCE:
                return new C1505Je();
            case NEW_BUILDER:
                return new C1464Ie();
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                Xz0 uy0 = zzm;
                if (uy0 == null) {
                    synchronized (C1505Je.class) {
                        try {
                            uy0 = zzm;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzl);
                                zzm = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public int zza() {
        return this.zzw.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C4323sg zzab(int i8) {
        return (C4323sg) this.zzw.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C4779wg zzac() {
        C4779wg c4779wg = this.zzu;
        return c4779wg == null ? C4779wg.zzg() : c4779wg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C5121zg zzad() {
        C5121zg c5121zg = this.zzv;
        return c5121zg == null ? C5121zg.zzg() : c5121zg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C1222Cg zzae() {
        C1222Cg c1222Cg = this.zzx;
        return c1222Cg == null ? C1222Cg.zzg() : c1222Cg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public EnumC1631Mg zzaf() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzp);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C2000Vg zzag() {
        C2000Vg c2000Vg = this.zzA;
        return c2000Vg == null ? C2000Vg.zzg() : c2000Vg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C2123Yg zzah() {
        C2123Yg c2123Yg = this.zzB;
        return c2123Yg == null ? C2123Yg.zzg() : c2123Yg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C1873Se zzai() {
        C1873Se c1873Se = this.zzz;
        return c1873Se == null ? C1873Se.zzf() : c1873Se;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C2724ef zzaj() {
        C2724ef c2724ef = this.zzy;
        return c2724ef == null ? C2724ef.zzn() : c2724ef;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public C4777wf zzak(int i8) {
        return (C4777wf) this.zzC.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public List<C4323sg> zzal() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public List<C4777wf> zzam() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzan() {
        return (this.zzn & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzao() {
        return (this.zzn & 128) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzap() {
        return (this.zzn & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzaq() {
        return (this.zzn & 256) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzar() {
        return (this.zzn & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzas() {
        return (this.zzn & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzat() {
        return (this.zzn & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzau() {
        return (this.zzn & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public boolean zzav() {
        return (this.zzn & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public int zzb() {
        return this.zzC.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4551ug
    public EnumC1382Ge zzc() {
        EnumC1382Ge enumC1382GeZzb = EnumC1382Ge.zzb(this.zzo);
        return enumC1382GeZzb == null ? EnumC1382Ge.AD_INITIATER_UNSPECIFIED : enumC1382GeZzb;
    }

    public InterfaceC4437tg zzt(int i8) {
        return (InterfaceC4437tg) this.zzw.get(i8);
    }

    public InterfaceC3071hg zzu(int i8) {
        return (InterfaceC3071hg) this.zzC.get(i8);
    }

    public List<? extends InterfaceC4437tg> zzw() {
        return this.zzw;
    }

    public List<? extends InterfaceC3071hg> zzx() {
        return this.zzC;
    }
}
