package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Se */
/* loaded from: classes2.dex */
public final class C1873Se extends Zy0 implements InterfaceC1914Te {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1873Se zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf;
    private C4094qf zzg;

    static {
        C1873Se c1873Se = new C1873Se();
        zzc = c1873Se;
        Zy0.P(C1873Se.class, c1873Se);
    }

    private C1873Se() {
    }

    public void a0() {
        this.zzg = null;
        this.zze &= -3;
    }

    public void b0() {
        this.zze &= -2;
        this.zzf = 0;
    }

    public void c0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzg;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzg = c4094qf;
        this.zze |= 2;
    }

    public void d0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzg = c4094qf;
        this.zze |= 2;
    }

    public void e0(EnumC1631Mg enumC1631Mg) {
        this.zzf = enumC1631Mg.zza();
        this.zze |= 1;
    }

    public static C1832Re zzc() {
        return (C1832Re) zzc.i();
    }

    public static C1832Re zzd(C1873Se c1873Se) {
        return (C1832Re) zzc.y(c1873Se);
    }

    public static C1873Se zzf() {
        return zzc;
    }

    public static C1873Se zzg(InputStream inputStream) {
        return (C1873Se) Zy0.B(zzc, inputStream);
    }

    public static C1873Se zzk(InputStream inputStream, Iy0 iy0) {
        return (C1873Se) Zy0.C(zzc, inputStream, iy0);
    }

    public static C1873Se zzl(AbstractC3677my0 abstractC3677my0) {
        return (C1873Se) Zy0.D(zzc, abstractC3677my0);
    }

    public static C1873Se zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C1873Se) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C1873Se zzn(InputStream inputStream) {
        return (C1873Se) Zy0.F(zzc, inputStream);
    }

    public static C1873Se zzo(ByteBuffer byteBuffer) {
        return (C1873Se) Zy0.G(zzc, byteBuffer);
    }

    public static C1873Se zzp(byte[] bArr) {
        return (C1873Se) Zy0.H(zzc, bArr);
    }

    public static C1873Se zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1873Se) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C1873Se zzr(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1873Se) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C1873Se zzs(InputStream inputStream, Iy0 iy0) {
        return (C1873Se) Zy0.K(zzc, inputStream, iy0);
    }

    public static C1873Se zzt(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1873Se) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C1873Se zzu(byte[] bArr, Iy0 iy0) {
        return (C1873Se) Zy0.M(zzc, bArr, iy0);
    }

    public static Xz0 zzv() {
        return zzc.zzbM();
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", EnumC1631Mg.zze(), "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C1873Se();
            case NEW_BUILDER:
                return new C1832Re();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C1873Se.class) {
                        try {
                            uy0 = zzd;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzc);
                                zzd = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1914Te
    public EnumC1631Mg zza() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzf);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1914Te
    public C4094qf zzh() {
        C4094qf c4094qf = this.zzg;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1914Te
    public boolean zzi() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1914Te
    public boolean zzj() {
        return (this.zze & 1) != 0;
    }
}
