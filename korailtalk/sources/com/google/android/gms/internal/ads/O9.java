package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AbstractC0927b;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;

/* loaded from: classes2.dex */
public final class O9 extends Zy0 implements Qz0 {
    private static final O9 zza;
    private static volatile Xz0 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private Q9 zzP;
    private J9 zzaF;
    private long zzaL;
    private C4952y9 zzaO;
    private A9 zzaP;
    private int zzaS;
    private long zzaT;
    private boolean zzaW;
    private long zzaY;
    private C2714ea zzaZ;
    private L9 zzah;
    private N9 zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private C2944ga zzax;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = "";
    private String zzg = "";
    private String zzv = "";
    private String zzF = "";
    private String zzG = HelpSrvCustDao.HelpSrvCustRequest.f27549D;
    private String zzH = "";
    private String zzL = "";
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = HelpSrvCustDao.HelpSrvCustRequest.f27549D;
    private String zzX = HelpSrvCustDao.HelpSrvCustRequest.f27549D;
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;
    private InterfaceC3679mz0 zzai = Zy0.n();
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private long zzar = -1;
    private String zzas = HelpSrvCustDao.HelpSrvCustRequest.f27549D;
    private long zzat = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = HelpSrvCustDao.HelpSrvCustRequest.f27549D;
    private InterfaceC3679mz0 zzaC = Zy0.n();
    private int zzaD = 1000;
    private InterfaceC3679mz0 zzaE = Zy0.n();
    private String zzaG = "";
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaM = -1;
    private String zzaN = "";
    private long zzaQ = -1;
    private long zzaR = -1;
    private String zzaU = "";
    private int zzaV = 2;
    private String zzaX = "";
    private long zzba = -1;
    private String zzbb = "";

    static {
        O9 o9 = new O9();
        zza = o9;
        Zy0.P(O9.class, o9);
    }

    private O9() {
    }

    static /* synthetic */ void A0(O9 o9, long j8) {
        o9.zzd |= AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL;
        o9.zzaq = j8;
    }

    static /* synthetic */ void B0(O9 o9, long j8) {
        o9.zzd |= 134217728;
        o9.zzar = j8;
    }

    static /* synthetic */ void C0(O9 o9, String str) {
        str.getClass();
        o9.zzd |= 268435456;
        o9.zzas = str;
    }

    static /* synthetic */ void D0(O9 o9, Z9 z9) {
        o9.zzaz = z9.zza();
        o9.zze |= 8;
    }

    static /* synthetic */ void E0(O9 o9, Z9 z9) {
        o9.zzaA = z9.zza();
        o9.zze |= 16;
    }

    static /* synthetic */ void F0(O9 o9, long j8) {
        o9.zze |= 512;
        o9.zzaH = j8;
    }

    static /* synthetic */ void G0(O9 o9, long j8) {
        o9.zze |= 1024;
        o9.zzaI = j8;
    }

    static /* synthetic */ void H0(O9 o9, long j8) {
        o9.zze |= 2048;
        o9.zzaJ = j8;
    }

    static /* synthetic */ void I0(O9 o9, long j8) {
        o9.zze |= 4096;
        o9.zzaK = j8;
    }

    static /* synthetic */ void J0(O9 o9, String str) {
        str.getClass();
        o9.zze |= 32768;
        o9.zzaN = str;
    }

    static /* synthetic */ void K0(O9 o9, D9 d9) {
        o9.zzaS = d9.zza();
        o9.zze |= 1048576;
    }

    static /* synthetic */ void L0(O9 o9, String str) {
        str.getClass();
        o9.zze |= 4194304;
        o9.zzaU = str;
    }

    static /* synthetic */ void M0(O9 o9, EnumC4268s9 enumC4268s9) {
        o9.zzaV = enumC4268s9.zza();
        o9.zze |= 8388608;
    }

    static /* synthetic */ void N0(O9 o9, boolean z8) {
        o9.zze |= 16777216;
        o9.zzaW = z8;
    }

    static /* synthetic */ void O0(O9 o9, long j8) {
        o9.zze |= AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL;
        o9.zzaY = j8;
    }

    static /* synthetic */ void Q0(O9 o9, String str) {
        str.getClass();
        o9.zzc |= 1;
        o9.zzf = str;
    }

    static /* synthetic */ void R0(O9 o9, String str) {
        str.getClass();
        o9.zzc |= 2;
        o9.zzg = str;
    }

    static /* synthetic */ void S0(O9 o9, long j8) {
        o9.zzc |= 4;
        o9.zzh = j8;
    }

    static /* synthetic */ void T0(O9 o9, long j8) {
        o9.zzc |= 16;
        o9.zzj = j8;
    }

    static /* synthetic */ void U0(O9 o9, long j8) {
        o9.zzc |= 32;
        o9.zzk = j8;
    }

    static /* synthetic */ void V0(O9 o9, long j8) {
        o9.zzc |= 1024;
        o9.zzp = j8;
    }

    static /* synthetic */ void W0(O9 o9, long j8) {
        o9.zzc |= 2048;
        o9.zzu = j8;
    }

    static /* synthetic */ void X0(O9 o9, long j8) {
        o9.zzc |= 8192;
        o9.zzw = j8;
    }

    static /* synthetic */ void Y0(O9 o9, long j8) {
        o9.zzc |= 16384;
        o9.zzx = j8;
    }

    static /* synthetic */ void Z(O9 o9, long j8) {
        o9.zzc |= AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL;
        o9.zzJ = j8;
    }

    static /* synthetic */ void Z0(O9 o9, long j8) {
        o9.zzc |= 32768;
        o9.zzy = j8;
    }

    static /* synthetic */ void a0(O9 o9, long j8) {
        o9.zzc |= 134217728;
        o9.zzK = j8;
    }

    static /* synthetic */ void a1(O9 o9, long j8) {
        o9.zzc |= 65536;
        o9.zzz = j8;
    }

    static /* synthetic */ void b0(O9 o9, String str) {
        str.getClass();
        o9.zzc |= 268435456;
        o9.zzL = str;
    }

    static /* synthetic */ void b1(O9 o9, long j8) {
        o9.zzc |= 524288;
        o9.zzC = j8;
    }

    static /* synthetic */ void c0(O9 o9, long j8) {
        o9.zzc |= 536870912;
        o9.zzM = j8;
    }

    static /* synthetic */ void c1(O9 o9, long j8) {
        o9.zzc |= 1048576;
        o9.zzD = j8;
    }

    static /* synthetic */ void d0(O9 o9, long j8) {
        o9.zzc |= 1073741824;
        o9.zzN = j8;
    }

    static /* synthetic */ void d1(O9 o9, long j8) {
        o9.zzc |= 2097152;
        o9.zzE = j8;
    }

    static /* synthetic */ void e0(O9 o9, long j8) {
        o9.zzc |= Integer.MIN_VALUE;
        o9.zzO = j8;
    }

    static /* synthetic */ void e1(O9 o9, String str) {
        str.getClass();
        o9.zzc |= 4194304;
        o9.zzF = str;
    }

    static /* synthetic */ void f0(O9 o9, long j8) {
        o9.zzd |= 2;
        o9.zzQ = j8;
    }

    static /* synthetic */ void f1(O9 o9, String str) {
        str.getClass();
        o9.zzc |= 16777216;
        o9.zzH = str;
    }

    static /* synthetic */ void g0(O9 o9, long j8) {
        o9.zzd |= 4;
        o9.zzR = j8;
    }

    static /* synthetic */ void g1(O9 o9, long j8) {
        o9.zzc |= 33554432;
        o9.zzI = j8;
    }

    static /* synthetic */ void h0(O9 o9, long j8) {
        o9.zzd |= 8;
        o9.zzS = j8;
    }

    static /* synthetic */ void i0(O9 o9, long j8) {
        o9.zzd |= 16;
        o9.zzT = j8;
    }

    static /* synthetic */ void j0(O9 o9, long j8) {
        o9.zzd |= 32;
        o9.zzU = j8;
    }

    static /* synthetic */ void k0(O9 o9, long j8) {
        o9.zzd |= 64;
        o9.zzV = j8;
    }

    static /* synthetic */ void l0(O9 o9, String str) {
        str.getClass();
        o9.zzd |= 128;
        o9.zzW = str;
    }

    static /* synthetic */ void m0(O9 o9, String str) {
        str.getClass();
        o9.zzd |= 256;
        o9.zzX = str;
    }

    static /* synthetic */ void n0(O9 o9, Z9 z9) {
        o9.zzZ = z9.zza();
        o9.zzd |= 1024;
    }

    static /* synthetic */ void o0(O9 o9, Z9 z9) {
        o9.zzaa = z9.zza();
        o9.zzd |= 2048;
    }

    static /* synthetic */ void p0(O9 o9, long j8) {
        o9.zzd |= 4096;
        o9.zzab = j8;
    }

    static /* synthetic */ void q0(O9 o9, long j8) {
        o9.zzd |= 8192;
        o9.zzac = j8;
    }

    static /* synthetic */ void r0(O9 o9, long j8) {
        o9.zzd |= 16384;
        o9.zzad = j8;
    }

    static /* synthetic */ void s0(O9 o9, Z9 z9) {
        o9.zzag = z9.zza();
        o9.zzd |= 131072;
    }

    static /* synthetic */ void t0(O9 o9, L9 l9) {
        l9.getClass();
        o9.zzah = l9;
        o9.zzd |= 262144;
    }

    static /* synthetic */ void u0(O9 o9, L9 l9) {
        l9.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = o9.zzai;
        if (!interfaceC3679mz0.zzc()) {
            o9.zzai = Zy0.o(interfaceC3679mz0);
        }
        o9.zzai.add(l9);
    }

    static /* synthetic */ void w0(O9 o9, N9 n9) {
        n9.getClass();
        o9.zzaj = n9;
        o9.zzd |= 524288;
    }

    static /* synthetic */ void x0(O9 o9, long j8) {
        o9.zzd |= 2097152;
        o9.zzal = j8;
    }

    static /* synthetic */ void y0(O9 o9, long j8) {
        o9.zzd |= 4194304;
        o9.zzam = j8;
    }

    static /* synthetic */ void z0(O9 o9, long j8) {
        o9.zzd |= 8388608;
        o9.zzan = j8;
    }

    public static C3357k9 zza() {
        return (C3357k9) zza.i();
    }

    public static O9 zze() {
        return zza;
    }

    public static O9 zzf(byte[] bArr, Iy0 iy0) {
        return (O9) Zy0.M(zza, bArr, iy0);
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
                InterfaceC2880fz0 interfaceC2880fz0 = C4154r9.f22386a;
                InterfaceC2880fz0 interfaceC2880fz02 = Y9.f17340a;
                return Zy0.t(zza, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaT", "zzD", "zzE", "zzaU", "zzaY", "zzaV", interfaceC2880fz0, "zzF", "zzaW", "zzH", "zzaX", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", L9.class, "zzU", "zzV", "zzW", "zzX", "zzZ", interfaceC2880fz02, "zzaa", interfaceC2880fz02, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", interfaceC2880fz02, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", U9.f16594a, "zzav", C2371ba.f18153a, "zzas", "zzaw", C3585m9.f20852a, "zzax", "zzay", "zzao", "zzap", "zzaz", interfaceC2880fz02, "zzY", "zzG", "zzaA", interfaceC2880fz02, "zzaB", "zzaC", H9.class, "zzaD", interfaceC2880fz02, "zzaE", C3927p9.class, "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", C9.f12492a, "zzaZ", "zzba", "zzbb"});
            case NEW_MUTABLE_INSTANCE:
                return new O9();
            case NEW_BUILDER:
                return new C3357k9(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (O9.class) {
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

    public final boolean zzaq() {
        return this.zzaW;
    }

    public final boolean zzar() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean zzas() {
        return (this.zze & 134217728) != 0;
    }

    public final EnumC4268s9 zzc() {
        EnumC4268s9 enumC4268s9Zzb = EnumC4268s9.zzb(this.zzaV);
        return enumC4268s9Zzb == null ? EnumC4268s9.DEVICE_IDENTIFIER_GLOBAL_ID : enumC4268s9Zzb;
    }

    public final C2714ea zzg() {
        C2714ea c2714ea = this.zzaZ;
        return c2714ea == null ? C2714ea.zzd() : c2714ea;
    }

    public final String zzh() {
        return this.zzaU;
    }

    public final String zzi() {
        return this.zzF;
    }
}
