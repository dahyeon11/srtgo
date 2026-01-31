package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bf */
/* loaded from: classes2.dex */
public final class C2381bf extends Zy0 implements InterfaceC2495cf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C2381bf zzi;
    private static volatile Xz0 zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private InterfaceC3679mz0 zzl = Zy0.n();
    private String zzp = "";
    private String zzu = "";

    static {
        C2381bf c2381bf = new C2381bf();
        zzi = c2381bf;
        Zy0.P(C2381bf.class, c2381bf);
    }

    private C2381bf() {
    }

    public void A0(Iterable iterable) {
        L0();
        Qx0.d(iterable, this.zzl);
    }

    public void B0(C1996Ve c1996Ve) {
        c1996Ve.getClass();
        L0();
        this.zzl.add(c1996Ve);
    }

    public void C0(int i8, C1996Ve c1996Ve) {
        c1996Ve.getClass();
        L0();
        this.zzl.add(i8, c1996Ve);
    }

    public void D0() {
        this.zzk &= -9;
        this.zzp = zzl().zzI();
    }

    public void E0() {
        this.zzk &= -65;
        this.zzw = 0;
    }

    public void F0() {
        this.zzk &= -17;
        this.zzu = zzl().zzJ();
    }

    public void G0() {
        this.zzk &= -2;
        this.zzm = 0;
    }

    public void H0() {
        this.zzk &= -33;
        this.zzv = 0L;
    }

    public void I0() {
        this.zzl = Zy0.n();
    }

    public void J0() {
        this.zzk &= -3;
        this.zzn = 0;
    }

    public void K0() {
        this.zzk &= -5;
        this.zzo = 0L;
    }

    private void L0() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzl;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzl = Zy0.o(interfaceC3679mz0);
    }

    public void M0(int i8) {
        L0();
        this.zzl.remove(i8);
    }

    public void N0(String str) {
        str.getClass();
        this.zzk |= 8;
        this.zzp = str;
    }

    public void O0(AbstractC3677my0 abstractC3677my0) {
        this.zzp = abstractC3677my0.zzy();
        this.zzk |= 8;
    }

    public void P0(int i8) {
        this.zzk |= 64;
        this.zzw = i8;
    }

    public void Q0(String str) {
        str.getClass();
        this.zzk |= 16;
        this.zzu = str;
    }

    public void R0(AbstractC3677my0 abstractC3677my0) {
        this.zzu = abstractC3677my0.zzy();
        this.zzk |= 16;
    }

    public void n0(int i8) {
        this.zzk |= 1;
        this.zzm = i8;
    }

    public void o0(long j8) {
        this.zzk |= 32;
        this.zzv = j8;
    }

    public void p0(int i8, C1996Ve c1996Ve) {
        c1996Ve.getClass();
        L0();
        this.zzl.set(i8, c1996Ve);
    }

    public void q0(int i8) {
        this.zzk |= 2;
        this.zzn = i8;
    }

    public void r0(long j8) {
        this.zzk |= 4;
        this.zzo = j8;
    }

    public static C2119Ye zzi() {
        return (C2119Ye) zzi.i();
    }

    public static C2119Ye zzj(C2381bf c2381bf) {
        return (C2119Ye) zzi.y(c2381bf);
    }

    public static C2381bf zzl() {
        return zzi;
    }

    public static C2381bf zzm(InputStream inputStream) {
        return (C2381bf) Zy0.B(zzi, inputStream);
    }

    public static C2381bf zzn(InputStream inputStream, Iy0 iy0) {
        return (C2381bf) Zy0.C(zzi, inputStream, iy0);
    }

    public static C2381bf zzo(AbstractC3677my0 abstractC3677my0) {
        return (C2381bf) Zy0.D(zzi, abstractC3677my0);
    }

    public static C2381bf zzp(AbstractC4816wy0 abstractC4816wy0) {
        return (C2381bf) Zy0.E(zzi, abstractC4816wy0);
    }

    public static C2381bf zzq(InputStream inputStream) {
        return (C2381bf) Zy0.F(zzi, inputStream);
    }

    public static C2381bf zzr(ByteBuffer byteBuffer) {
        return (C2381bf) Zy0.G(zzi, byteBuffer);
    }

    public static C2381bf zzs(byte[] bArr) {
        return (C2381bf) Zy0.H(zzi, bArr);
    }

    public static C2381bf zzt(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2381bf) Zy0.I(zzi, abstractC3677my0, iy0);
    }

    public static C2381bf zzu(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2381bf) Zy0.J(zzi, abstractC4816wy0, iy0);
    }

    public static C2381bf zzv(InputStream inputStream, Iy0 iy0) {
        return (C2381bf) Zy0.K(zzi, inputStream, iy0);
    }

    public static C2381bf zzw(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2381bf) Zy0.L(zzi, byteBuffer, iy0);
    }

    public static C2381bf zzx(byte[] bArr, Iy0 iy0) {
        return (C2381bf) Zy0.M(zzi, bArr, iy0);
    }

    public static Xz0 zzy() {
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
                return Zy0.t(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", C1996Ve.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
            case NEW_MUTABLE_INSTANCE:
                return new C2381bf();
            case NEW_BUILDER:
                return new C2119Ye();
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                Xz0 uy0 = zzj;
                if (uy0 == null) {
                    synchronized (C2381bf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public AbstractC3677my0 zzG() {
        return AbstractC3677my0.zzw(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public AbstractC3677my0 zzH() {
        return AbstractC3677my0.zzw(this.zzu);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public String zzI() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public String zzJ() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public List<C1996Ve> zzK() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzL() {
        return (this.zzk & 8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzM() {
        return (this.zzk & 64) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzN() {
        return (this.zzk & 16) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzO() {
        return (this.zzk & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzP() {
        return (this.zzk & 32) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzQ() {
        return (this.zzk & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public boolean zzR() {
        return (this.zzk & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public int zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public int zzb() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public int zzd() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public long zzf() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2495cf
    public C1996Ve zzg(int i8) {
        return (C1996Ve) this.zzl.get(i8);
    }

    public InterfaceC2078Xe zzh(int i8) {
        return (InterfaceC2078Xe) this.zzl.get(i8);
    }

    public List<? extends InterfaceC2078Xe> zzz() {
        return this.zzl;
    }
}
