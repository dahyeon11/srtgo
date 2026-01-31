package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wg */
/* loaded from: classes2.dex */
public final class C4779wg extends Zy0 implements InterfaceC4893xg {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C4779wg zzd;
    private static volatile Xz0 zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC3679mz0 zzh = Zy0.n();
    private int zzi;

    static {
        C4779wg c4779wg = new C4779wg();
        zzd = c4779wg;
        Zy0.P(C4779wg.class, c4779wg);
    }

    private C4779wg() {
    }

    public void k0(Iterable iterable) {
        q0();
        Qx0.d(iterable, this.zzh);
    }

    public void l0(C4323sg c4323sg) {
        c4323sg.getClass();
        q0();
        this.zzh.add(c4323sg);
    }

    public void m0(int i8, C4323sg c4323sg) {
        c4323sg.getClass();
        q0();
        this.zzh.add(i8, c4323sg);
    }

    public void n0() {
        this.zzf &= -2;
        this.zzg = zzg().zzs();
    }

    public void o0() {
        this.zzf &= -3;
        this.zzi = 0;
    }

    public void p0() {
        this.zzh = Zy0.n();
    }

    private void q0() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzh;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzh = Zy0.o(interfaceC3679mz0);
    }

    public void r0(int i8) {
        q0();
        this.zzh.remove(i8);
    }

    public void s0(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    public void t0(AbstractC3677my0 abstractC3677my0) {
        this.zzg = abstractC3677my0.zzy();
        this.zzf |= 1;
    }

    public void u0(EnumC1631Mg enumC1631Mg) {
        this.zzi = enumC1631Mg.zza();
        this.zzf |= 2;
    }

    public void v0(int i8, C4323sg c4323sg) {
        c4323sg.getClass();
        q0();
        this.zzh.set(i8, c4323sg);
    }

    public static C4665vg zzd() {
        return (C4665vg) zzd.i();
    }

    public static C4665vg zze(C4779wg c4779wg) {
        return (C4665vg) zzd.y(c4779wg);
    }

    public static C4779wg zzg() {
        return zzd;
    }

    public static C4779wg zzh(InputStream inputStream) {
        return (C4779wg) Zy0.B(zzd, inputStream);
    }

    public static C4779wg zzi(InputStream inputStream, Iy0 iy0) {
        return (C4779wg) Zy0.C(zzd, inputStream, iy0);
    }

    public static C4779wg zzj(AbstractC3677my0 abstractC3677my0) {
        return (C4779wg) Zy0.D(zzd, abstractC3677my0);
    }

    public static C4779wg zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C4779wg) Zy0.E(zzd, abstractC4816wy0);
    }

    public static C4779wg zzl(InputStream inputStream) {
        return (C4779wg) Zy0.F(zzd, inputStream);
    }

    public static C4779wg zzm(ByteBuffer byteBuffer) {
        return (C4779wg) Zy0.G(zzd, byteBuffer);
    }

    public static C4779wg zzn(byte[] bArr) {
        return (C4779wg) Zy0.H(zzd, bArr);
    }

    public static C4779wg zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C4779wg) Zy0.I(zzd, abstractC3677my0, iy0);
    }

    public static C4779wg zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C4779wg) Zy0.J(zzd, abstractC4816wy0, iy0);
    }

    public static C4779wg zzw(InputStream inputStream, Iy0 iy0) {
        return (C4779wg) Zy0.K(zzd, inputStream, iy0);
    }

    public static C4779wg zzx(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C4779wg) Zy0.L(zzd, byteBuffer, iy0);
    }

    public static C4779wg zzy(byte[] bArr, Iy0 iy0) {
        return (C4779wg) Zy0.M(zzd, bArr, iy0);
    }

    public static Xz0 zzz() {
        return zzd.zzbM();
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
                return Zy0.t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", C4323sg.class, "zzi", EnumC1631Mg.zze()});
            case NEW_MUTABLE_INSTANCE:
                return new C4779wg();
            case NEW_BUILDER:
                return new C4665vg();
            case GET_DEFAULT_INSTANCE:
                return zzd;
            case GET_PARSER:
                Xz0 uy0 = zze;
                if (uy0 == null) {
                    synchronized (C4779wg.class) {
                        try {
                            uy0 = zze;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzd);
                                zze = uy0;
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

    public List<? extends InterfaceC4437tg> zzA() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public int zza() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public C4323sg zzb(int i8) {
        return (C4323sg) this.zzh.get(i8);
    }

    public InterfaceC4437tg zzc(int i8) {
        return (InterfaceC4437tg) this.zzh.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public EnumC1631Mg zzq() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzi);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public AbstractC3677my0 zzr() {
        return AbstractC3677my0.zzw(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public String zzs() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public List<C4323sg> zzt() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public boolean zzu() {
        return (this.zzf & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893xg
    public boolean zzv() {
        return (this.zzf & 2) != 0;
    }
}
