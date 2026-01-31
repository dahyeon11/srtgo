package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Pg */
/* loaded from: classes2.dex */
public final class C1754Pg extends Zy0 implements InterfaceC1795Qg {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final C1754Pg zzn;
    private static volatile Xz0 zzo;
    private C1345Fg zzA;
    private C1550Kg zzB;
    private C1791Qe zzC;
    private C1505Je zzD;
    private C2381bf zzE;
    private C3640mg zzF;
    private C1957Uf zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private C4435tf zzy;
    private String zzv = "";
    private int zzx = 1000;
    private InterfaceC3451kz0 zzz = Zy0.l();

    static {
        C1754Pg c1754Pg = new C1754Pg();
        zzn = c1754Pg;
        Zy0.P(C1754Pg.class, c1754Pg);
    }

    private C1754Pg() {
    }

    public void D0(Iterable iterable) {
        k1();
        Qx0.d(iterable, this.zzz);
    }

    public void E0(long j8) {
        k1();
        this.zzz.zzg(j8);
    }

    public void F0() {
        this.zzD = null;
        this.zzp &= -257;
    }

    public void G0() {
        this.zzG = null;
        this.zzp &= -2049;
    }

    public void H0() {
        this.zzA = null;
        this.zzp &= -33;
    }

    public void I0() {
        this.zzB = null;
        this.zzp &= -65;
    }

    public void J0() {
        this.zzp &= -3;
        this.zzv = zzm().zzah();
    }

    public void R0(C1550Kg c1550Kg) {
        c1550Kg.getClass();
        this.zzB = c1550Kg;
        this.zzp |= 64;
    }

    public void S0(String str) {
        str.getClass();
        this.zzp |= 2;
        this.zzv = str;
    }

    public void T0(AbstractC3677my0 abstractC3677my0) {
        this.zzv = abstractC3677my0.zzy();
        this.zzp |= 2;
    }

    public void U0(int i8, long j8) {
        k1();
        this.zzz.zzd(i8, j8);
    }

    public void V0(EnumC1631Mg enumC1631Mg) {
        this.zzx = enumC1631Mg.zza();
        this.zzp |= 8;
    }

    public void W0(int i8) {
        this.zzp |= 1;
        this.zzu = i8;
    }

    public void X0(C1791Qe c1791Qe) {
        c1791Qe.getClass();
        this.zzC = c1791Qe;
        this.zzp |= 128;
    }

    public void Y0(C2381bf c2381bf) {
        c2381bf.getClass();
        this.zzE = c2381bf;
        this.zzp |= 512;
    }

    public void Z0(C4435tf c4435tf) {
        c4435tf.getClass();
        this.zzy = c4435tf;
        this.zzp |= 16;
    }

    public void a1(int i8) {
        this.zzp |= 4;
        this.zzw = i8;
    }

    public void b1(C3640mg c3640mg) {
        c3640mg.getClass();
        this.zzF = c3640mg;
        this.zzp |= 1024;
    }

    public void c1() {
        this.zzz = Zy0.l();
    }

    public void d1() {
        this.zzp &= -9;
        this.zzx = 1000;
    }

    public void e1() {
        this.zzp &= -2;
        this.zzu = 0;
    }

    public void f1() {
        this.zzC = null;
        this.zzp &= -129;
    }

    public void g1() {
        this.zzE = null;
        this.zzp &= -513;
    }

    public void h1() {
        this.zzy = null;
        this.zzp &= -17;
    }

    public void i1() {
        this.zzp &= -5;
        this.zzw = 0;
    }

    public void j1() {
        this.zzF = null;
        this.zzp &= -1025;
    }

    private void k1() {
        InterfaceC3451kz0 interfaceC3451kz0 = this.zzz;
        if (interfaceC3451kz0.zzc()) {
            return;
        }
        this.zzz = Zy0.m(interfaceC3451kz0);
    }

    public void l1(C1505Je c1505Je) {
        c1505Je.getClass();
        C1505Je c1505Je2 = this.zzD;
        if (c1505Je2 != null && c1505Je2 != C1505Je.zzg()) {
            C1464Ie c1464IeZze = C1505Je.zze(c1505Je2);
            c1464IeZze.zzbj(c1505Je);
            c1505Je = (C1505Je) c1464IeZze.zzbs();
        }
        this.zzD = c1505Je;
        this.zzp |= 256;
    }

    public void m1(C1957Uf c1957Uf) {
        c1957Uf.getClass();
        C1957Uf c1957Uf2 = this.zzG;
        if (c1957Uf2 != null && c1957Uf2 != C1957Uf.zzg()) {
            C1589Lf c1589LfZze = C1957Uf.zze(c1957Uf2);
            c1589LfZze.zzbj(c1957Uf);
            c1957Uf = (C1957Uf) c1589LfZze.zzbs();
        }
        this.zzG = c1957Uf;
        this.zzp |= 2048;
    }

    public void n1(C1345Fg c1345Fg) {
        c1345Fg.getClass();
        C1345Fg c1345Fg2 = this.zzA;
        if (c1345Fg2 != null && c1345Fg2 != C1345Fg.zzf()) {
            C1304Eg c1304EgZzd = C1345Fg.zzd(c1345Fg2);
            c1304EgZzd.zzbj(c1345Fg);
            c1345Fg = (C1345Fg) c1304EgZzd.zzbs();
        }
        this.zzA = c1345Fg;
        this.zzp |= 32;
    }

    public void o1(C1550Kg c1550Kg) {
        c1550Kg.getClass();
        C1550Kg c1550Kg2 = this.zzB;
        if (c1550Kg2 != null && c1550Kg2 != C1550Kg.zze()) {
            C1427Hg c1427HgZzc = C1550Kg.zzc(c1550Kg2);
            c1427HgZzc.zzbj(c1550Kg);
            c1550Kg = (C1550Kg) c1427HgZzc.zzbs();
        }
        this.zzB = c1550Kg;
        this.zzp |= 64;
    }

    public void p1(C1791Qe c1791Qe) {
        c1791Qe.getClass();
        C1791Qe c1791Qe2 = this.zzC;
        if (c1791Qe2 != null && c1791Qe2 != C1791Qe.zzi()) {
            C1587Le c1587LeZzc = C1791Qe.zzc(c1791Qe2);
            c1587LeZzc.zzbj(c1791Qe);
            c1791Qe = (C1791Qe) c1587LeZzc.zzbs();
        }
        this.zzC = c1791Qe;
        this.zzp |= 128;
    }

    public void q1(C2381bf c2381bf) {
        c2381bf.getClass();
        C2381bf c2381bf2 = this.zzE;
        if (c2381bf2 != null && c2381bf2 != C2381bf.zzl()) {
            C2119Ye c2119YeZzj = C2381bf.zzj(c2381bf2);
            c2119YeZzj.zzbj(c2381bf);
            c2381bf = (C2381bf) c2119YeZzj.zzbs();
        }
        this.zzE = c2381bf;
        this.zzp |= 512;
    }

    public void r1(C4435tf c4435tf) {
        c4435tf.getClass();
        C4435tf c4435tf2 = this.zzy;
        if (c4435tf2 != null && c4435tf2 != C4435tf.zzg()) {
            C4321sf c4321sfZze = C4435tf.zze(c4435tf2);
            c4321sfZze.zzbj(c4435tf);
            c4435tf = (C4435tf) c4321sfZze.zzbs();
        }
        this.zzy = c4435tf;
        this.zzp |= 16;
    }

    public void s1(C3640mg c3640mg) {
        c3640mg.getClass();
        C3640mg c3640mg2 = this.zzF;
        if (c3640mg2 != null && c3640mg2 != C3640mg.zzi()) {
            C3526lg c3526lgZzd = C3640mg.zzd(c3640mg2);
            c3526lgZzd.zzbj(c3640mg);
            c3640mg = (C3640mg) c3526lgZzd.zzbs();
        }
        this.zzF = c3640mg;
        this.zzp |= 1024;
    }

    public void t1(C1505Je c1505Je) {
        c1505Je.getClass();
        this.zzD = c1505Je;
        this.zzp |= 256;
    }

    public void u1(C1957Uf c1957Uf) {
        c1957Uf.getClass();
        this.zzG = c1957Uf;
        this.zzp |= 2048;
    }

    public void v1(C1345Fg c1345Fg) {
        c1345Fg.getClass();
        this.zzA = c1345Fg;
        this.zzp |= 32;
    }

    public static C1713Og zzj() {
        return (C1713Og) zzn.i();
    }

    public static C1713Og zzk(C1754Pg c1754Pg) {
        return (C1713Og) zzn.y(c1754Pg);
    }

    public static C1754Pg zzm() {
        return zzn;
    }

    public static C1754Pg zzn(InputStream inputStream) {
        return (C1754Pg) Zy0.B(zzn, inputStream);
    }

    public static C1754Pg zzo(InputStream inputStream, Iy0 iy0) {
        return (C1754Pg) Zy0.C(zzn, inputStream, iy0);
    }

    public static C1754Pg zzp(AbstractC3677my0 abstractC3677my0) {
        return (C1754Pg) Zy0.D(zzn, abstractC3677my0);
    }

    public static C1754Pg zzq(AbstractC4816wy0 abstractC4816wy0) {
        return (C1754Pg) Zy0.E(zzn, abstractC4816wy0);
    }

    public static C1754Pg zzr(InputStream inputStream) {
        return (C1754Pg) Zy0.F(zzn, inputStream);
    }

    public static C1754Pg zzs(ByteBuffer byteBuffer) {
        return (C1754Pg) Zy0.G(zzn, byteBuffer);
    }

    public static C1754Pg zzt(byte[] bArr) {
        return (C1754Pg) Zy0.H(zzn, bArr);
    }

    public static C1754Pg zzu(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1754Pg) Zy0.I(zzn, abstractC3677my0, iy0);
    }

    public static C1754Pg zzv(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1754Pg) Zy0.J(zzn, abstractC4816wy0, iy0);
    }

    public static C1754Pg zzw(InputStream inputStream, Iy0 iy0) {
        return (C1754Pg) Zy0.K(zzn, inputStream, iy0);
    }

    public static C1754Pg zzx(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1754Pg) Zy0.L(zzn, byteBuffer, iy0);
    }

    public static C1754Pg zzy(byte[] bArr, Iy0 iy0) {
        return (C1754Pg) Zy0.M(zzn, bArr, iy0);
    }

    public static Xz0 zzz() {
        return zzn.zzbM();
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
                return Zy0.t(zzn, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", EnumC1631Mg.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
            case NEW_MUTABLE_INSTANCE:
                return new C1754Pg();
            case NEW_BUILDER:
                return new C1713Og();
            case GET_DEFAULT_INSTANCE:
                return zzn;
            case GET_PARSER:
                Xz0 uy0 = zzo;
                if (uy0 == null) {
                    synchronized (C1754Pg.class) {
                        try {
                            uy0 = zzo;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzn);
                                zzo = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public int zza() {
        return this.zzz.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C1791Qe zzac() {
        C1791Qe c1791Qe = this.zzC;
        return c1791Qe == null ? C1791Qe.zzi() : c1791Qe;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C2381bf zzad() {
        C2381bf c2381bf = this.zzE;
        return c2381bf == null ? C2381bf.zzl() : c2381bf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C4435tf zzae() {
        C4435tf c4435tf = this.zzy;
        return c4435tf == null ? C4435tf.zzg() : c4435tf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C3640mg zzaf() {
        C3640mg c3640mg = this.zzF;
        return c3640mg == null ? C3640mg.zzi() : c3640mg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public AbstractC3677my0 zzag() {
        return AbstractC3677my0.zzw(this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public String zzah() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public List<Long> zzai() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzaj() {
        return (this.zzp & 256) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzak() {
        return (this.zzp & 2048) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzal() {
        return (this.zzp & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzam() {
        return (this.zzp & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzan() {
        return (this.zzp & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzao() {
        return (this.zzp & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzap() {
        return (this.zzp & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzaq() {
        return (this.zzp & 128) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzar() {
        return (this.zzp & 512) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzas() {
        return (this.zzp & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzat() {
        return (this.zzp & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public boolean zzau() {
        return (this.zzp & 1024) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public int zzb() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public int zzc() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public long zzd(int i8) {
        return this.zzz.zza(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C1505Je zze() {
        C1505Je c1505Je = this.zzD;
        return c1505Je == null ? C1505Je.zzg() : c1505Je;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C1957Uf zzf() {
        C1957Uf c1957Uf = this.zzG;
        return c1957Uf == null ? C1957Uf.zzg() : c1957Uf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C1345Fg zzg() {
        C1345Fg c1345Fg = this.zzA;
        return c1345Fg == null ? C1345Fg.zzf() : c1345Fg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public C1550Kg zzh() {
        C1550Kg c1550Kg = this.zzB;
        return c1550Kg == null ? C1550Kg.zze() : c1550Kg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1795Qg
    public EnumC1631Mg zzi() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzx);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }
}
