package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Fg */
/* loaded from: classes2.dex */
public final class C1345Fg extends Zy0 implements InterfaceC1386Gg {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C1345Fg zzi;
    private static volatile Xz0 zzj;
    private int zzk;
    private C4094qf zzm;
    private int zzn;
    private C4435tf zzo;
    private int zzp;
    private String zzl = "";
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    static {
        C1345Fg c1345Fg = new C1345Fg();
        zzi = c1345Fg;
        Zy0.P(C1345Fg.class, c1345Fg);
    }

    private C1345Fg() {
    }

    public void A0(EnumC1631Mg enumC1631Mg) {
        this.zzu = enumC1631Mg.zza();
        this.zzk |= 32;
    }

    public void B0(EnumC1631Mg enumC1631Mg) {
        this.zzv = enumC1631Mg.zza();
        this.zzk |= 64;
    }

    public void C0(EnumC1631Mg enumC1631Mg) {
        this.zzw = enumC1631Mg.zza();
        this.zzk |= 128;
    }

    public void D0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzm = c4094qf;
        this.zzk |= 2;
    }

    public void E0(int i8) {
        this.zzk |= 16;
        this.zzp = i8;
    }

    public void F0(int i8) {
        this.zzk |= 4;
        this.zzn = i8;
    }

    public void G0(C4435tf c4435tf) {
        c4435tf.getClass();
        this.zzo = c4435tf;
        this.zzk |= 8;
    }

    public void o0() {
        this.zzk &= -2;
        this.zzl = zzf().zzD();
    }

    public void p0() {
        this.zzk &= -33;
        this.zzu = 1000;
    }

    public void q0() {
        this.zzk &= -65;
        this.zzv = 1000;
    }

    public void r0() {
        this.zzk &= -129;
        this.zzw = 1000;
    }

    public void s0() {
        this.zzm = null;
        this.zzk &= -3;
    }

    public void t0() {
        this.zzk &= -17;
        this.zzp = 0;
    }

    public void u0() {
        this.zzk &= -5;
        this.zzn = 0;
    }

    public void v0() {
        this.zzo = null;
        this.zzk &= -9;
    }

    public void w0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzm;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzm = c4094qf;
        this.zzk |= 2;
    }

    public void x0(C4435tf c4435tf) {
        c4435tf.getClass();
        C4435tf c4435tf2 = this.zzo;
        if (c4435tf2 != null && c4435tf2 != C4435tf.zzg()) {
            C4321sf c4321sfZze = C4435tf.zze(c4435tf2);
            c4321sfZze.zzbj(c4435tf);
            c4435tf = (C4435tf) c4321sfZze.zzbs();
        }
        this.zzo = c4435tf;
        this.zzk |= 8;
    }

    public void y0(String str) {
        str.getClass();
        this.zzk |= 1;
        this.zzl = str;
    }

    public void z0(AbstractC3677my0 abstractC3677my0) {
        this.zzl = abstractC3677my0.zzy();
        this.zzk |= 1;
    }

    public static C1304Eg zzc() {
        return (C1304Eg) zzi.i();
    }

    public static C1304Eg zzd(C1345Fg c1345Fg) {
        return (C1304Eg) zzi.y(c1345Fg);
    }

    public static C1345Fg zzf() {
        return zzi;
    }

    public static C1345Fg zzg(InputStream inputStream) {
        return (C1345Fg) Zy0.B(zzi, inputStream);
    }

    public static C1345Fg zzh(InputStream inputStream, Iy0 iy0) {
        return (C1345Fg) Zy0.C(zzi, inputStream, iy0);
    }

    public static C1345Fg zzi(AbstractC3677my0 abstractC3677my0) {
        return (C1345Fg) Zy0.D(zzi, abstractC3677my0);
    }

    public static C1345Fg zzj(AbstractC4816wy0 abstractC4816wy0) {
        return (C1345Fg) Zy0.E(zzi, abstractC4816wy0);
    }

    public static C1345Fg zzk(InputStream inputStream) {
        return (C1345Fg) Zy0.F(zzi, inputStream);
    }

    public static C1345Fg zzl(ByteBuffer byteBuffer) {
        return (C1345Fg) Zy0.G(zzi, byteBuffer);
    }

    public static C1345Fg zzm(byte[] bArr) {
        return (C1345Fg) Zy0.H(zzi, bArr);
    }

    public static C1345Fg zzn(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1345Fg) Zy0.I(zzi, abstractC3677my0, iy0);
    }

    public static C1345Fg zzo(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1345Fg) Zy0.J(zzi, abstractC4816wy0, iy0);
    }

    public static C1345Fg zzp(InputStream inputStream, Iy0 iy0) {
        return (C1345Fg) Zy0.K(zzi, inputStream, iy0);
    }

    public static C1345Fg zzq(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1345Fg) Zy0.L(zzi, byteBuffer, iy0);
    }

    public static C1345Fg zzr(byte[] bArr, Iy0 iy0) {
        return (C1345Fg) Zy0.M(zzi, bArr, iy0);
    }

    public static Xz0 zzs() {
        return zzi.zzbM();
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
                return Zy0.t(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", EnumC1631Mg.zze(), "zzv", EnumC1631Mg.zze(), "zzw", EnumC1631Mg.zze()});
            case NEW_MUTABLE_INSTANCE:
                return new C1345Fg();
            case NEW_BUILDER:
                return new C1304Eg();
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                Xz0 uy0 = zzj;
                if (uy0 == null) {
                    synchronized (C1345Fg.class) {
                        try {
                            uy0 = zzj;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzi);
                                zzj = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public C4094qf zzA() {
        C4094qf c4094qf = this.zzm;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public C4435tf zzB() {
        C4435tf c4435tf = this.zzo;
        return c4435tf == null ? C4435tf.zzg() : c4435tf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public AbstractC3677my0 zzC() {
        return AbstractC3677my0.zzw(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public String zzD() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzE() {
        return (this.zzk & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzF() {
        return (this.zzk & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzG() {
        return (this.zzk & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzH() {
        return (this.zzk & 128) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzI() {
        return (this.zzk & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzJ() {
        return (this.zzk & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzK() {
        return (this.zzk & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public boolean zzL() {
        return (this.zzk & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public int zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public EnumC1631Mg zzx() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzu);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public EnumC1631Mg zzy() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzv);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386Gg
    public EnumC1631Mg zzz() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzw);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }
}
