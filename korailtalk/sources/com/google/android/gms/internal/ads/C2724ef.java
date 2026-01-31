package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ef */
/* loaded from: classes2.dex */
public final class C2724ef extends Zy0 implements Cif {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final C2724ef zzl;
    private static volatile Xz0 zzm;
    private int zzA;
    private int zzB;
    private C2954gf zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C2724ef c2724ef = new C2724ef();
        zzl = c2724ef;
        Zy0.P(C2724ef.class, c2724ef);
    }

    private C2724ef() {
    }

    public void D0() {
        this.zzn &= -3;
        this.zzp = 1000;
    }

    public void E0() {
        this.zzn &= -2;
        this.zzo = 1000;
    }

    public void F0() {
        this.zzn &= -65;
        this.zzy = 0;
    }

    public void G0() {
        this.zzn &= -129;
        this.zzz = 0;
    }

    public void H0() {
        this.zzn &= -9;
        this.zzv = 0;
    }

    public void I0() {
        this.zzn &= -513;
        this.zzB = 0;
    }

    public void J0() {
        this.zzn &= -257;
        this.zzA = 0;
    }

    public void K0() {
        this.zzC = null;
        this.zzn &= -1025;
    }

    public void L0() {
        this.zzn &= -5;
        this.zzu = 0;
    }

    public void M0() {
        this.zzn &= -33;
        this.zzx = 0;
    }

    public void N0() {
        this.zzn &= -17;
        this.zzw = 0;
    }

    public void O0(C2954gf c2954gf) {
        c2954gf.getClass();
        C2954gf c2954gf2 = this.zzC;
        if (c2954gf2 != null && c2954gf2 != C2954gf.zzf()) {
            C2839ff c2839ffZzd = C2954gf.zzd(c2954gf2);
            c2839ffZzd.zzbj(c2954gf);
            c2954gf = (C2954gf) c2839ffZzd.zzbs();
        }
        this.zzC = c2954gf;
        this.zzn |= 1024;
    }

    public void P0(EnumC1631Mg enumC1631Mg) {
        this.zzp = enumC1631Mg.zza();
        this.zzn |= 2;
    }

    public void Q0(EnumC1631Mg enumC1631Mg) {
        this.zzo = enumC1631Mg.zza();
        this.zzn |= 1;
    }

    public void R0(int i8) {
        this.zzn |= 64;
        this.zzy = i8;
    }

    public void S0(int i8) {
        this.zzn |= 128;
        this.zzz = i8;
    }

    public void m0(int i8) {
        this.zzn |= 8;
        this.zzv = i8;
    }

    public void n0(int i8) {
        this.zzn |= 512;
        this.zzB = i8;
    }

    public void o0(int i8) {
        this.zzn |= 256;
        this.zzA = i8;
    }

    public void p0(C2954gf c2954gf) {
        c2954gf.getClass();
        this.zzC = c2954gf;
        this.zzn |= 1024;
    }

    public void q0(int i8) {
        this.zzn |= 4;
        this.zzu = i8;
    }

    public void r0(int i8) {
        this.zzn |= 32;
        this.zzx = i8;
    }

    public void s0(int i8) {
        this.zzn |= 16;
        this.zzw = i8;
    }

    public static Xz0 zzA() {
        return zzl.zzbM();
    }

    public static C2610df zzk() {
        return (C2610df) zzl.i();
    }

    public static C2610df zzl(C2724ef c2724ef) {
        return (C2610df) zzl.y(c2724ef);
    }

    public static C2724ef zzn() {
        return zzl;
    }

    public static C2724ef zzo(InputStream inputStream) {
        return (C2724ef) Zy0.B(zzl, inputStream);
    }

    public static C2724ef zzp(InputStream inputStream, Iy0 iy0) {
        return (C2724ef) Zy0.C(zzl, inputStream, iy0);
    }

    public static C2724ef zzq(AbstractC3677my0 abstractC3677my0) {
        return (C2724ef) Zy0.D(zzl, abstractC3677my0);
    }

    public static C2724ef zzr(AbstractC4816wy0 abstractC4816wy0) {
        return (C2724ef) Zy0.E(zzl, abstractC4816wy0);
    }

    public static C2724ef zzs(InputStream inputStream) {
        return (C2724ef) Zy0.F(zzl, inputStream);
    }

    public static C2724ef zzt(ByteBuffer byteBuffer) {
        return (C2724ef) Zy0.G(zzl, byteBuffer);
    }

    public static C2724ef zzu(byte[] bArr) {
        return (C2724ef) Zy0.H(zzl, bArr);
    }

    public static C2724ef zzv(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2724ef) Zy0.I(zzl, abstractC3677my0, iy0);
    }

    public static C2724ef zzw(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2724ef) Zy0.J(zzl, abstractC4816wy0, iy0);
    }

    public static C2724ef zzx(InputStream inputStream, Iy0 iy0) {
        return (C2724ef) Zy0.K(zzl, inputStream, iy0);
    }

    public static C2724ef zzy(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2724ef) Zy0.L(zzl, byteBuffer, iy0);
    }

    public static C2724ef zzz(byte[] bArr, Iy0 iy0) {
        return (C2724ef) Zy0.M(zzl, bArr, iy0);
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
                return Zy0.t(zzl, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", EnumC1631Mg.zze(), "zzp", EnumC1631Mg.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
            case NEW_MUTABLE_INSTANCE:
                return new C2724ef();
            case NEW_BUILDER:
                return new C2610df();
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                Xz0 uy0 = zzm;
                if (uy0 == null) {
                    synchronized (C2724ef.class) {
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

    @Override // com.google.android.gms.internal.ads.Cif
    public C2954gf zzI() {
        C2954gf c2954gf = this.zzC;
        return c2954gf == null ? C2954gf.zzf() : c2954gf;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzJ() {
        return (this.zzn & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzK() {
        return (this.zzn & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzL() {
        return (this.zzn & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzM() {
        return (this.zzn & 128) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzN() {
        return (this.zzn & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzO() {
        return (this.zzn & 512) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzP() {
        return (this.zzn & 256) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzQ() {
        return (this.zzn & 1024) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzR() {
        return (this.zzn & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzS() {
        return (this.zzn & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public boolean zzT() {
        return (this.zzn & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zza() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zzb() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zzc() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zzd() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zze() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zzf() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zzg() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public int zzh() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public EnumC1631Mg zzi() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzp);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public EnumC1631Mg zzj() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzo);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }
}
