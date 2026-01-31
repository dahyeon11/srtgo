package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Jf */
/* loaded from: classes2.dex */
public final class C1507Jf extends Zy0 implements InterfaceC1548Kf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1507Jf zzd;
    private static volatile Xz0 zze;
    private int zzf;
    private int zzg;
    private C1752Pf zzh;
    private C1875Sf zzi;

    static {
        C1507Jf c1507Jf = new C1507Jf();
        zzd = c1507Jf;
        Zy0.P(C1507Jf.class, c1507Jf);
    }

    private C1507Jf() {
    }

    public void f0() {
        this.zzf &= -2;
        this.zzg = 0;
    }

    public void g0() {
        this.zzh = null;
        this.zzf &= -3;
    }

    public void h0() {
        this.zzi = null;
        this.zzf &= -5;
    }

    public void i0(C1752Pf c1752Pf) {
        c1752Pf.getClass();
        C1752Pf c1752Pf2 = this.zzh;
        if (c1752Pf2 != null && c1752Pf2 != C1752Pf.zzi()) {
            C1711Of c1711OfZzd = C1752Pf.zzd(c1752Pf2);
            c1711OfZzd.zzbj(c1752Pf);
            c1752Pf = (C1752Pf) c1711OfZzd.zzbs();
        }
        this.zzh = c1752Pf;
        this.zzf |= 2;
    }

    public void j0(C1875Sf c1875Sf) {
        c1875Sf.getClass();
        C1875Sf c1875Sf2 = this.zzi;
        if (c1875Sf2 != null && c1875Sf2 != C1875Sf.zzf()) {
            C1834Rf c1834RfZzd = C1875Sf.zzd(c1875Sf2);
            c1834RfZzd.zzbj(c1875Sf);
            c1875Sf = (C1875Sf) c1834RfZzd.zzbs();
        }
        this.zzi = c1875Sf;
        this.zzf |= 4;
    }

    public void k0(EnumC1629Mf enumC1629Mf) {
        this.zzg = enumC1629Mf.zza();
        this.zzf |= 1;
    }

    public void l0(C1752Pf c1752Pf) {
        c1752Pf.getClass();
        this.zzh = c1752Pf;
        this.zzf |= 2;
    }

    public void m0(C1875Sf c1875Sf) {
        c1875Sf.getClass();
        this.zzi = c1875Sf;
        this.zzf |= 4;
    }

    public static C1466If zza() {
        return (C1466If) zzd.i();
    }

    public static C1466If zzc(C1507Jf c1507Jf) {
        return (C1466If) zzd.y(c1507Jf);
    }

    public static C1507Jf zze() {
        return zzd;
    }

    public static C1507Jf zzf(InputStream inputStream) {
        return (C1507Jf) Zy0.B(zzd, inputStream);
    }

    public static C1507Jf zzg(InputStream inputStream, Iy0 iy0) {
        return (C1507Jf) Zy0.C(zzd, inputStream, iy0);
    }

    public static C1507Jf zzh(AbstractC3677my0 abstractC3677my0) {
        return (C1507Jf) Zy0.D(zzd, abstractC3677my0);
    }

    public static C1507Jf zzi(AbstractC4816wy0 abstractC4816wy0) {
        return (C1507Jf) Zy0.E(zzd, abstractC4816wy0);
    }

    public static C1507Jf zzj(InputStream inputStream) {
        return (C1507Jf) Zy0.F(zzd, inputStream);
    }

    public static C1507Jf zzq(ByteBuffer byteBuffer) {
        return (C1507Jf) Zy0.G(zzd, byteBuffer);
    }

    public static C1507Jf zzr(byte[] bArr) {
        return (C1507Jf) Zy0.H(zzd, bArr);
    }

    public static C1507Jf zzs(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1507Jf) Zy0.I(zzd, abstractC3677my0, iy0);
    }

    public static C1507Jf zzt(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1507Jf) Zy0.J(zzd, abstractC4816wy0, iy0);
    }

    public static C1507Jf zzu(InputStream inputStream, Iy0 iy0) {
        return (C1507Jf) Zy0.K(zzd, inputStream, iy0);
    }

    public static C1507Jf zzv(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1507Jf) Zy0.L(zzd, byteBuffer, iy0);
    }

    public static C1507Jf zzw(byte[] bArr, Iy0 iy0) {
        return (C1507Jf) Zy0.M(zzd, bArr, iy0);
    }

    public static Xz0 zzx() {
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
                return Zy0.t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC1629Mf.zze(), "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new C1507Jf();
            case NEW_BUILDER:
                return new C1466If();
            case GET_DEFAULT_INSTANCE:
                return zzd;
            case GET_PARSER:
                Xz0 uy0 = zze;
                if (uy0 == null) {
                    synchronized (C1507Jf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1548Kf
    public EnumC1629Mf zzk() {
        EnumC1629Mf enumC1629MfZzb = EnumC1629Mf.zzb(this.zzg);
        return enumC1629MfZzb == null ? EnumC1629Mf.UNSPECIFIED : enumC1629MfZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1548Kf
    public C1752Pf zzl() {
        C1752Pf c1752Pf = this.zzh;
        return c1752Pf == null ? C1752Pf.zzi() : c1752Pf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1548Kf
    public C1875Sf zzm() {
        C1875Sf c1875Sf = this.zzi;
        return c1875Sf == null ? C1875Sf.zzf() : c1875Sf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1548Kf
    public boolean zzn() {
        return (this.zzf & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1548Kf
    public boolean zzo() {
        return (this.zzf & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1548Kf
    public boolean zzp() {
        return (this.zzf & 4) != 0;
    }
}
