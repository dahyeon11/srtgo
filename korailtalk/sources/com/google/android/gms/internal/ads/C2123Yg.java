package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Yg */
/* loaded from: classes2.dex */
public final class C2123Yg extends Zy0 implements InterfaceC1546Ke {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C2123Yg zze;
    private static volatile Xz0 zzf;
    private int zzg;
    private C1877Sg zzh;
    private InterfaceC3679mz0 zzi = Zy0.n();
    private int zzj;
    private C4094qf zzk;

    static {
        C2123Yg c2123Yg = new C2123Yg();
        zze = c2123Yg;
        Zy0.P(C2123Yg.class, c2123Yg);
    }

    private C2123Yg() {
    }

    public void A0(EnumC1631Mg enumC1631Mg) {
        this.zzj = enumC1631Mg.zza();
        this.zzg |= 2;
    }

    public void B0(int i8, C3752nf c3752nf) {
        c3752nf.getClass();
        u0();
        this.zzi.set(i8, c3752nf);
    }

    public void n0(Iterable iterable) {
        u0();
        Qx0.d(iterable, this.zzi);
    }

    public void o0(C3752nf c3752nf) {
        c3752nf.getClass();
        u0();
        this.zzi.add(c3752nf);
    }

    public void p0(int i8, C3752nf c3752nf) {
        c3752nf.getClass();
        u0();
        this.zzi.add(i8, c3752nf);
    }

    public void q0() {
        this.zzh = null;
        this.zzg &= -2;
    }

    public void r0() {
        this.zzk = null;
        this.zzg &= -5;
    }

    public void s0() {
        this.zzg &= -3;
        this.zzj = 0;
    }

    public void t0() {
        this.zzi = Zy0.n();
    }

    private void u0() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzi;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzi = Zy0.o(interfaceC3679mz0);
    }

    public void v0(C1877Sg c1877Sg) {
        c1877Sg.getClass();
        C1877Sg c1877Sg2 = this.zzh;
        if (c1877Sg2 != null && c1877Sg2 != C1877Sg.zzg()) {
            C1836Rg c1836RgZze = C1877Sg.zze(c1877Sg2);
            c1836RgZze.zzbj(c1877Sg);
            c1877Sg = (C1877Sg) c1836RgZze.zzbs();
        }
        this.zzh = c1877Sg;
        this.zzg |= 1;
    }

    public void w0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzk;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzk = c4094qf;
        this.zzg |= 4;
    }

    public void x0(int i8) {
        u0();
        this.zzi.remove(i8);
    }

    public void y0(C1877Sg c1877Sg) {
        c1877Sg.getClass();
        this.zzh = c1877Sg;
        this.zzg |= 1;
    }

    public void z0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzk = c4094qf;
        this.zzg |= 4;
    }

    public static C2082Xg zzd() {
        return (C2082Xg) zze.i();
    }

    public static C2082Xg zze(C2123Yg c2123Yg) {
        return (C2082Xg) zze.y(c2123Yg);
    }

    public static C2123Yg zzg() {
        return zze;
    }

    public static C2123Yg zzh(InputStream inputStream) {
        return (C2123Yg) Zy0.B(zze, inputStream);
    }

    public static C2123Yg zzi(InputStream inputStream, Iy0 iy0) {
        return (C2123Yg) Zy0.C(zze, inputStream, iy0);
    }

    public static C2123Yg zzj(AbstractC3677my0 abstractC3677my0) {
        return (C2123Yg) Zy0.D(zze, abstractC3677my0);
    }

    public static C2123Yg zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C2123Yg) Zy0.E(zze, abstractC4816wy0);
    }

    public static C2123Yg zzl(InputStream inputStream) {
        return (C2123Yg) Zy0.F(zze, inputStream);
    }

    public static C2123Yg zzm(ByteBuffer byteBuffer) {
        return (C2123Yg) Zy0.G(zze, byteBuffer);
    }

    public static C2123Yg zzn(byte[] bArr) {
        return (C2123Yg) Zy0.H(zze, bArr);
    }

    public static C2123Yg zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2123Yg) Zy0.I(zze, abstractC3677my0, iy0);
    }

    public static C2123Yg zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2123Yg) Zy0.J(zze, abstractC4816wy0, iy0);
    }

    public static C2123Yg zzq(InputStream inputStream, Iy0 iy0) {
        return (C2123Yg) Zy0.K(zze, inputStream, iy0);
    }

    public static C2123Yg zzr(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2123Yg) Zy0.L(zze, byteBuffer, iy0);
    }

    public static C2123Yg zzs(byte[] bArr, Iy0 iy0) {
        return (C2123Yg) Zy0.M(zze, bArr, iy0);
    }

    public static Xz0 zzu() {
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
                return Zy0.t(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", C3752nf.class, "zzj", EnumC1631Mg.zze(), "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new C2123Yg();
            case NEW_BUILDER:
                return new C2082Xg();
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                Xz0 uy0 = zzf;
                if (uy0 == null) {
                    synchronized (C2123Yg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public boolean zzA() {
        return (this.zzg & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public boolean zzB() {
        return (this.zzg & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public EnumC1631Mg zzb() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzj);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public C1877Sg zzc() {
        C1877Sg c1877Sg = this.zzh;
        return c1877Sg == null ? C1877Sg.zzg() : c1877Sg;
    }

    public InterfaceC3866of zzt(int i8) {
        return (InterfaceC3866of) this.zzi.get(i8);
    }

    public List<? extends InterfaceC3866of> zzv() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public C3752nf zzw(int i8) {
        return (C3752nf) this.zzi.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public C4094qf zzx() {
        C4094qf c4094qf = this.zzk;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public List<C3752nf> zzy() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546Ke
    public boolean zzz() {
        return (this.zzg & 1) != 0;
    }
}
