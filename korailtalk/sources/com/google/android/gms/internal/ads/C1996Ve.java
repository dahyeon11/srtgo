package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1996Ve extends Zy0 implements InterfaceC2078Xe {
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
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final InterfaceC3223iz0 zzn = new a();
    private static final C1996Ve zzo;
    private static volatile Xz0 zzp;
    private C1791Qe zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private InterfaceC3110hz0 zzz = Zy0.j();

    /* renamed from: com.google.android.gms.internal.ads.Ve$a */
    class a implements InterfaceC3223iz0 {
        a() {
        }

        @Override // com.google.android.gms.internal.ads.InterfaceC3223iz0
        /* renamed from: zza, reason: merged with bridge method [inline-methods] */
        public EnumC3982pg zzb(Integer num) {
            EnumC3982pg enumC3982pgZzb = EnumC3982pg.zzb(num.intValue());
            return enumC3982pgZzb == null ? EnumC3982pg.AD_FORMAT_TYPE_UNSPECIFIED : enumC3982pgZzb;
        }
    }

    static {
        C1996Ve c1996Ve = new C1996Ve();
        zzo = c1996Ve;
        Zy0.P(C1996Ve.class, c1996Ve);
    }

    private C1996Ve() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(Iterable iterable) {
        w0();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzz.zzi(((EnumC3982pg) it.next()).zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(EnumC3982pg enumC3982pg) {
        enumC3982pg.getClass();
        w0();
        this.zzz.zzi(enumC3982pg.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        this.zzu &= -65;
        this.zzC = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        this.zzu &= -129;
        this.zzD = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        this.zzz = Zy0.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(C1791Qe c1791Qe) {
        c1791Qe.getClass();
        C1791Qe c1791Qe2 = this.zzA;
        if (c1791Qe2 != null && c1791Qe2 != C1791Qe.zzi()) {
            C1587Le c1587LeZzc = C1791Qe.zzc(c1791Qe2);
            c1587LeZzc.zzbj(c1791Qe);
            c1791Qe = (C1791Qe) c1587LeZzc.zzbs();
        }
        this.zzA = c1791Qe;
        this.zzu |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(EnumC1631Mg enumC1631Mg) {
        this.zzC = enumC1631Mg.zza();
        this.zzu |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(EnumC1631Mg enumC1631Mg) {
        this.zzD = enumC1631Mg.zza();
        this.zzu |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(int i8, EnumC3982pg enumC3982pg) {
        enumC3982pg.getClass();
        w0();
        this.zzz.zze(i8, enumC3982pg.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(int i8) {
        this.zzu |= 256;
        this.zzE = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(EnumC2160Ze enumC2160Ze) {
        this.zzG = enumC2160Ze.zza();
        this.zzu |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(C1791Qe c1791Qe) {
        c1791Qe.getClass();
        this.zzA = c1791Qe;
        this.zzu |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0(EnumC1631Mg enumC1631Mg) {
        this.zzF = enumC1631Mg.zza();
        this.zzu |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(long j8) {
        this.zzu |= 8;
        this.zzy = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(long j8) {
        this.zzu |= 4;
        this.zzx = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(EnumC1631Mg enumC1631Mg) {
        this.zzw = enumC1631Mg.zza();
        this.zzu |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(long j8) {
        this.zzu |= 1;
        this.zzv = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(long j8) {
        this.zzu |= 2048;
        this.zzH = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(EnumC1631Mg enumC1631Mg) {
        this.zzB = enumC1631Mg.zza();
        this.zzu |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        this.zzu &= -257;
        this.zzE = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        this.zzu &= -1025;
        this.zzG = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.zzA = null;
        this.zzu &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        this.zzu &= -513;
        this.zzF = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        this.zzu &= -9;
        this.zzy = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        this.zzu &= -5;
        this.zzx = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        this.zzu &= -3;
        this.zzw = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        this.zzu &= -2;
        this.zzv = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        this.zzu &= -2049;
        this.zzH = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        this.zzu &= -33;
        this.zzB = 0;
    }

    private void w0() {
        InterfaceC3110hz0 interfaceC3110hz0 = this.zzz;
        if (interfaceC3110hz0.zzc()) {
            return;
        }
        this.zzz = Zy0.k(interfaceC3110hz0);
    }

    public static C1996Ve zzA(InputStream inputStream, Iy0 iy0) {
        return (C1996Ve) Zy0.K(zzo, inputStream, iy0);
    }

    public static C1996Ve zzB(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1996Ve) Zy0.L(zzo, byteBuffer, iy0);
    }

    public static C1996Ve zzC(byte[] bArr, Iy0 iy0) {
        return (C1996Ve) Zy0.M(zzo, bArr, iy0);
    }

    public static Xz0 zzD() {
        return zzo.zzbM();
    }

    public static C2037We zzn() {
        return (C2037We) zzo.i();
    }

    public static C2037We zzo(C1996Ve c1996Ve) {
        return (C2037We) zzo.y(c1996Ve);
    }

    public static C1996Ve zzq() {
        return zzo;
    }

    public static C1996Ve zzr(InputStream inputStream) {
        return (C1996Ve) Zy0.B(zzo, inputStream);
    }

    public static C1996Ve zzs(InputStream inputStream, Iy0 iy0) {
        return (C1996Ve) Zy0.C(zzo, inputStream, iy0);
    }

    public static C1996Ve zzt(AbstractC3677my0 abstractC3677my0) {
        return (C1996Ve) Zy0.D(zzo, abstractC3677my0);
    }

    public static C1996Ve zzu(AbstractC4816wy0 abstractC4816wy0) {
        return (C1996Ve) Zy0.E(zzo, abstractC4816wy0);
    }

    public static C1996Ve zzv(InputStream inputStream) {
        return (C1996Ve) Zy0.F(zzo, inputStream);
    }

    public static C1996Ve zzw(ByteBuffer byteBuffer) {
        return (C1996Ve) Zy0.G(zzo, byteBuffer);
    }

    public static C1996Ve zzx(byte[] bArr) {
        return (C1996Ve) Zy0.H(zzo, bArr);
    }

    public static C1996Ve zzy(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1996Ve) Zy0.I(zzo, abstractC3677my0, iy0);
    }

    public static C1996Ve zzz(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1996Ve) Zy0.J(zzo, abstractC4816wy0, iy0);
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
                return Zy0.t(zzo, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", EnumC1631Mg.zze(), "zzx", "zzy", "zzz", EnumC3982pg.zze(), "zzA", "zzB", EnumC1631Mg.zze(), "zzC", EnumC1631Mg.zze(), "zzD", EnumC1631Mg.zze(), "zzE", "zzF", EnumC1631Mg.zze(), "zzG", EnumC2160Ze.zze(), "zzH"});
            case NEW_MUTABLE_INSTANCE:
                return new C1996Ve();
            case NEW_BUILDER:
                return new C2037We();
            case GET_DEFAULT_INSTANCE:
                return zzo;
            case GET_PARSER:
                Xz0 uy0 = zzp;
                if (uy0 == null) {
                    synchronized (C1996Ve.class) {
                        try {
                            uy0 = zzp;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzo);
                                zzp = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC2160Ze zzR() {
        EnumC2160Ze enumC2160ZeZzb = EnumC2160Ze.zzb(this.zzG);
        return enumC2160ZeZzb == null ? EnumC2160Ze.UNSPECIFIED : enumC2160ZeZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public List<EnumC3982pg> zzS() {
        return new C3337jz0(this.zzz, zzn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzT() {
        return (this.zzu & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzU() {
        return (this.zzu & 128) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzV() {
        return (this.zzu & 256) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzW() {
        return (this.zzu & 1024) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzX() {
        return (this.zzu & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzY() {
        return (this.zzu & 512) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzZ() {
        return (this.zzu & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public int zza() {
        return this.zzz.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzaa() {
        return (this.zzu & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzab() {
        return (this.zzu & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzac() {
        return (this.zzu & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzad() {
        return (this.zzu & 2048) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public boolean zzae() {
        return (this.zzu & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public int zzb() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public long zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public long zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public long zzf() {
        return this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC3982pg zzg(int i8) {
        EnumC3982pg enumC3982pgZzb = EnumC3982pg.zzb(this.zzz.zzd(i8));
        return enumC3982pgZzb == null ? EnumC3982pg.AD_FORMAT_TYPE_UNSPECIFIED : enumC3982pgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC1631Mg zzh() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzC);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC1631Mg zzi() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzD);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC1631Mg zzj() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzF);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC1631Mg zzk() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzw);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public EnumC1631Mg zzl() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzB);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2078Xe
    public C1791Qe zzm() {
        C1791Qe c1791Qe = this.zzA;
        return c1791Qe == null ? C1791Qe.zzi() : c1791Qe;
    }
}
