package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1877Sg extends Zy0 implements InterfaceC1918Tg {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1877Sg zze;
    private static volatile Xz0 zzf;
    private int zzg;
    private int zzi;
    private C4094qf zzk;
    private String zzh = "";
    private InterfaceC3110hz0 zzj = Zy0.j();

    static {
        C1877Sg c1877Sg = new C1877Sg();
        zze = c1877Sg;
        Zy0.P(C1877Sg.class, c1877Sg);
    }

    private C1877Sg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(Iterable iterable) {
        r0();
        Qx0.d(iterable, this.zzj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i8) {
        r0();
        this.zzj.zzi(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        this.zzg &= -2;
        this.zzh = zzg().zzs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.zzk = null;
        this.zzg &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        this.zzg &= -3;
        this.zzi = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        this.zzj = Zy0.j();
    }

    private void r0() {
        InterfaceC3110hz0 interfaceC3110hz0 = this.zzj;
        if (interfaceC3110hz0.zzc()) {
            return;
        }
        this.zzj = Zy0.k(interfaceC3110hz0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(C4094qf c4094qf) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(String str) {
        str.getClass();
        this.zzg |= 1;
        this.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(AbstractC3677my0 abstractC3677my0) {
        this.zzh = abstractC3677my0.zzy();
        this.zzg |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzk = c4094qf;
        this.zzg |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(EnumC1631Mg enumC1631Mg) {
        this.zzi = enumC1631Mg.zza();
        this.zzg |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(int i8, int i9) {
        r0();
        this.zzj.zze(i8, i9);
    }

    public static Xz0 zzA() {
        return zze.zzbM();
    }

    public static C1836Rg zzd() {
        return (C1836Rg) zze.i();
    }

    public static C1836Rg zze(C1877Sg c1877Sg) {
        return (C1836Rg) zze.y(c1877Sg);
    }

    public static C1877Sg zzg() {
        return zze;
    }

    public static C1877Sg zzh(InputStream inputStream) {
        return (C1877Sg) Zy0.B(zze, inputStream);
    }

    public static C1877Sg zzi(InputStream inputStream, Iy0 iy0) {
        return (C1877Sg) Zy0.C(zze, inputStream, iy0);
    }

    public static C1877Sg zzj(AbstractC3677my0 abstractC3677my0) {
        return (C1877Sg) Zy0.D(zze, abstractC3677my0);
    }

    public static C1877Sg zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C1877Sg) Zy0.E(zze, abstractC4816wy0);
    }

    public static C1877Sg zzl(InputStream inputStream) {
        return (C1877Sg) Zy0.F(zze, inputStream);
    }

    public static C1877Sg zzm(ByteBuffer byteBuffer) {
        return (C1877Sg) Zy0.G(zze, byteBuffer);
    }

    public static C1877Sg zzn(byte[] bArr) {
        return (C1877Sg) Zy0.H(zze, bArr);
    }

    public static C1877Sg zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1877Sg) Zy0.I(zze, abstractC3677my0, iy0);
    }

    public static C1877Sg zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1877Sg) Zy0.J(zze, abstractC4816wy0, iy0);
    }

    public static C1877Sg zzx(InputStream inputStream, Iy0 iy0) {
        return (C1877Sg) Zy0.K(zze, inputStream, iy0);
    }

    public static C1877Sg zzy(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1877Sg) Zy0.L(zze, byteBuffer, iy0);
    }

    public static C1877Sg zzz(byte[] bArr, Iy0 iy0) {
        return (C1877Sg) Zy0.M(zze, bArr, iy0);
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
                return Zy0.t(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", EnumC1631Mg.zze(), "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new C1877Sg();
            case NEW_BUILDER:
                return new C1836Rg();
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                Xz0 uy0 = zzf;
                if (uy0 == null) {
                    synchronized (C1877Sg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public int zza(int i8) {
        return this.zzj.zzd(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public int zzb() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public EnumC1631Mg zzc() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzi);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public C4094qf zzq() {
        C4094qf c4094qf = this.zzk;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public AbstractC3677my0 zzr() {
        return AbstractC3677my0.zzw(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public String zzs() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public List<Integer> zzt() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public boolean zzu() {
        return (this.zzg & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public boolean zzv() {
        return (this.zzg & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Tg
    public boolean zzw() {
        return (this.zzg & 2) != 0;
    }
}
