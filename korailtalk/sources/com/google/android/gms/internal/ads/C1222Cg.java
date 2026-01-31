package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Cg */
/* loaded from: classes2.dex */
public final class C1222Cg extends Zy0 implements InterfaceC1263Dg {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C1222Cg zzg;
    private static volatile Xz0 zzh;
    private int zzi;
    private int zzj;
    private C4094qf zzk;
    private C4094qf zzl;
    private C4094qf zzm;
    private InterfaceC3679mz0 zzn = Zy0.n();
    private int zzo;

    static {
        C1222Cg c1222Cg = new C1222Cg();
        zzg = c1222Cg;
        Zy0.P(C1222Cg.class, c1222Cg);
    }

    private C1222Cg() {
    }

    public void A0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzm;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzm = c4094qf;
        this.zzi |= 8;
    }

    public void B0(int i8) {
        x0();
        this.zzn.remove(i8);
    }

    public void C0(int i8) {
        this.zzi |= 1;
        this.zzj = i8;
    }

    public void D0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzl = c4094qf;
        this.zzi |= 4;
    }

    public void E0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzk = c4094qf;
        this.zzi |= 2;
    }

    public void F0(int i8, C4094qf c4094qf) {
        c4094qf.getClass();
        x0();
        this.zzn.set(i8, c4094qf);
    }

    public void G0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzm = c4094qf;
        this.zzi |= 8;
    }

    public void H0(int i8) {
        this.zzi |= 16;
        this.zzo = i8;
    }

    public void o0(C4094qf c4094qf) {
        c4094qf.getClass();
        x0();
        this.zzn.add(c4094qf);
    }

    public void p0(int i8, C4094qf c4094qf) {
        c4094qf.getClass();
        x0();
        this.zzn.add(i8, c4094qf);
    }

    public void q0(Iterable iterable) {
        x0();
        Qx0.d(iterable, this.zzn);
    }

    public void r0() {
        this.zzi &= -2;
        this.zzj = 0;
    }

    public void s0() {
        this.zzl = null;
        this.zzi &= -5;
    }

    public void t0() {
        this.zzk = null;
        this.zzi &= -3;
    }

    public void u0() {
        this.zzn = Zy0.n();
    }

    public void v0() {
        this.zzm = null;
        this.zzi &= -9;
    }

    public void w0() {
        this.zzi &= -17;
        this.zzo = 0;
    }

    private void x0() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzn;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzn = Zy0.o(interfaceC3679mz0);
    }

    public void y0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzl;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzl = c4094qf;
        this.zzi |= 4;
    }

    public void z0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzk;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzk = c4094qf;
        this.zzi |= 2;
    }

    public static C1181Bg zzd() {
        return (C1181Bg) zzg.i();
    }

    public static C1181Bg zze(C1222Cg c1222Cg) {
        return (C1181Bg) zzg.y(c1222Cg);
    }

    public static C1222Cg zzg() {
        return zzg;
    }

    public static C1222Cg zzh(InputStream inputStream) {
        return (C1222Cg) Zy0.B(zzg, inputStream);
    }

    public static C1222Cg zzi(InputStream inputStream, Iy0 iy0) {
        return (C1222Cg) Zy0.C(zzg, inputStream, iy0);
    }

    public static C1222Cg zzj(AbstractC3677my0 abstractC3677my0) {
        return (C1222Cg) Zy0.D(zzg, abstractC3677my0);
    }

    public static C1222Cg zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C1222Cg) Zy0.E(zzg, abstractC4816wy0);
    }

    public static C1222Cg zzl(InputStream inputStream) {
        return (C1222Cg) Zy0.F(zzg, inputStream);
    }

    public static C1222Cg zzm(ByteBuffer byteBuffer) {
        return (C1222Cg) Zy0.G(zzg, byteBuffer);
    }

    public static C1222Cg zzn(byte[] bArr) {
        return (C1222Cg) Zy0.H(zzg, bArr);
    }

    public static C1222Cg zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1222Cg) Zy0.I(zzg, abstractC3677my0, iy0);
    }

    public static C1222Cg zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1222Cg) Zy0.J(zzg, abstractC4816wy0, iy0);
    }

    public static C1222Cg zzq(InputStream inputStream, Iy0 iy0) {
        return (C1222Cg) Zy0.K(zzg, inputStream, iy0);
    }

    public static C1222Cg zzr(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1222Cg) Zy0.L(zzg, byteBuffer, iy0);
    }

    public static C1222Cg zzs(byte[] bArr, Iy0 iy0) {
        return (C1222Cg) Zy0.M(zzg, bArr, iy0);
    }

    public static Xz0 zzu() {
        return zzg.zzbM();
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
                return Zy0.t(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", C4094qf.class, "zzo"});
            case NEW_MUTABLE_INSTANCE:
                return new C1222Cg();
            case NEW_BUILDER:
                return new C1181Bg();
            case GET_DEFAULT_INSTANCE:
                return zzg;
            case GET_PARSER:
                Xz0 uy0 = zzh;
                if (uy0 == null) {
                    synchronized (C1222Cg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public C4094qf zzC() {
        C4094qf c4094qf = this.zzl;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public C4094qf zzD() {
        C4094qf c4094qf = this.zzk;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public C4094qf zzE(int i8) {
        return (C4094qf) this.zzn.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public C4094qf zzF() {
        C4094qf c4094qf = this.zzm;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public List<C4094qf> zzG() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public boolean zzH() {
        return (this.zzi & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public boolean zzI() {
        return (this.zzi & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public boolean zzJ() {
        return (this.zzi & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public boolean zzK() {
        return (this.zzi & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public boolean zzL() {
        return (this.zzi & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public int zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public int zzb() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263Dg
    public int zzc() {
        return this.zzo;
    }

    public InterfaceC4207rf zzt(int i8) {
        return (InterfaceC4207rf) this.zzn.get(i8);
    }

    public List<? extends InterfaceC4207rf> zzv() {
        return this.zzn;
    }
}
