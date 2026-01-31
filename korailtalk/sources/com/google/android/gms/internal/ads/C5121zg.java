package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zg */
/* loaded from: classes2.dex */
public final class C5121zg extends Zy0 implements InterfaceC1140Ag {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C5121zg zzf;
    private static volatile Xz0 zzg;
    private int zzh;
    private String zzi = "";
    private InterfaceC3679mz0 zzj = Zy0.n();
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C5121zg c5121zg = new C5121zg();
        zzf = c5121zg;
        Zy0.P(C5121zg.class, c5121zg);
    }

    private C5121zg() {
    }

    public void A0(AbstractC3677my0 abstractC3677my0) {
        this.zzi = abstractC3677my0.zzy();
        this.zzh |= 1;
    }

    public void B0(EnumC1631Mg enumC1631Mg) {
        this.zzl = enumC1631Mg.zza();
        this.zzh |= 4;
    }

    public void C0(EnumC1631Mg enumC1631Mg) {
        this.zzk = enumC1631Mg.zza();
        this.zzh |= 2;
    }

    public void D0(int i8, C4323sg c4323sg) {
        c4323sg.getClass();
        w0();
        this.zzj.set(i8, c4323sg);
    }

    public void o0(Iterable iterable) {
        w0();
        Qx0.d(iterable, this.zzj);
    }

    public void p0(C4323sg c4323sg) {
        c4323sg.getClass();
        w0();
        this.zzj.add(c4323sg);
    }

    public void q0(int i8, C4323sg c4323sg) {
        c4323sg.getClass();
        w0();
        this.zzj.add(i8, c4323sg);
    }

    public void r0() {
        this.zzh &= -9;
        this.zzm = 1000;
    }

    public void s0() {
        this.zzh &= -2;
        this.zzi = zzg().zzy();
    }

    public void t0() {
        this.zzh &= -5;
        this.zzl = 1000;
    }

    public void u0() {
        this.zzh &= -3;
        this.zzk = 1000;
    }

    public void v0() {
        this.zzj = Zy0.n();
    }

    private void w0() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzj;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzj = Zy0.o(interfaceC3679mz0);
    }

    public void x0(int i8) {
        w0();
        this.zzj.remove(i8);
    }

    public void y0(EnumC1631Mg enumC1631Mg) {
        this.zzm = enumC1631Mg.zza();
        this.zzh |= 8;
    }

    public void z0(String str) {
        str.getClass();
        this.zzh |= 1;
        this.zzi = str;
    }

    public static C5007yg zzd() {
        return (C5007yg) zzf.i();
    }

    public static C5007yg zze(C5121zg c5121zg) {
        return (C5007yg) zzf.y(c5121zg);
    }

    public static C5121zg zzg() {
        return zzf;
    }

    public static C5121zg zzh(InputStream inputStream) {
        return (C5121zg) Zy0.B(zzf, inputStream);
    }

    public static C5121zg zzi(InputStream inputStream, Iy0 iy0) {
        return (C5121zg) Zy0.C(zzf, inputStream, iy0);
    }

    public static C5121zg zzj(AbstractC3677my0 abstractC3677my0) {
        return (C5121zg) Zy0.D(zzf, abstractC3677my0);
    }

    public static C5121zg zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C5121zg) Zy0.E(zzf, abstractC4816wy0);
    }

    public static C5121zg zzl(InputStream inputStream) {
        return (C5121zg) Zy0.F(zzf, inputStream);
    }

    public static C5121zg zzm(ByteBuffer byteBuffer) {
        return (C5121zg) Zy0.G(zzf, byteBuffer);
    }

    public static C5121zg zzn(byte[] bArr) {
        return (C5121zg) Zy0.H(zzf, bArr);
    }

    public static C5121zg zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C5121zg) Zy0.I(zzf, abstractC3677my0, iy0);
    }

    public static C5121zg zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C5121zg) Zy0.J(zzf, abstractC4816wy0, iy0);
    }

    public static C5121zg zzq(InputStream inputStream, Iy0 iy0) {
        return (C5121zg) Zy0.K(zzf, inputStream, iy0);
    }

    public static C5121zg zzr(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C5121zg) Zy0.L(zzf, byteBuffer, iy0);
    }

    public static C5121zg zzs(byte[] bArr, Iy0 iy0) {
        return (C5121zg) Zy0.M(zzf, bArr, iy0);
    }

    public static Xz0 zzt() {
        return zzf.zzbM();
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
                return Zy0.t(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", C4323sg.class, "zzk", EnumC1631Mg.zze(), "zzl", EnumC1631Mg.zze(), "zzm", EnumC1631Mg.zze()});
            case NEW_MUTABLE_INSTANCE:
                return new C5121zg();
            case NEW_BUILDER:
                return new C5007yg();
            case GET_DEFAULT_INSTANCE:
                return zzf;
            case GET_PARSER:
                Xz0 uy0 = zzg;
                if (uy0 == null) {
                    synchronized (C5121zg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public boolean zzA() {
        return (this.zzh & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public boolean zzB() {
        return (this.zzh & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public boolean zzC() {
        return (this.zzh & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public boolean zzD() {
        return (this.zzh & 2) != 0;
    }

    public List<? extends InterfaceC4437tg> zzE() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public int zza() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public C4323sg zzb(int i8) {
        return (C4323sg) this.zzj.get(i8);
    }

    public InterfaceC4437tg zzc(int i8) {
        return (InterfaceC4437tg) this.zzj.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public EnumC1631Mg zzu() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzm);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public EnumC1631Mg zzv() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzl);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public EnumC1631Mg zzw() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzk);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public AbstractC3677my0 zzx() {
        return AbstractC3677my0.zzw(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public String zzy() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1140Ag
    public List<C4323sg> zzz() {
        return this.zzj;
    }
}
