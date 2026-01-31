package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.jg */
/* loaded from: classes2.dex */
public final class C3298jg extends Zy0 implements InterfaceC3412kg {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3298jg zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf = 1000;
    private C1261Df zzg;

    static {
        C3298jg c3298jg = new C3298jg();
        zzc = c3298jg;
        Zy0.P(C3298jg.class, c3298jg);
    }

    private C3298jg() {
    }

    public void Z() {
        this.zzg = null;
        this.zze &= -3;
    }

    public void a0() {
        this.zze &= -2;
        this.zzf = 1000;
    }

    public void b0(C1261Df c1261Df) {
        c1261Df.getClass();
        C1261Df c1261Df2 = this.zzg;
        if (c1261Df2 != null && c1261Df2 != C1261Df.zzg()) {
            C1138Af c1138AfZze = C1261Df.zze(c1261Df2);
            c1138AfZze.zzbj(c1261Df);
            c1261Df = (C1261Df) c1138AfZze.zzbs();
        }
        this.zzg = c1261Df;
        this.zze |= 2;
    }

    public void c0(C1261Df c1261Df) {
        c1261Df.getClass();
        this.zzg = c1261Df;
        this.zze |= 2;
    }

    public void d0(EnumC1631Mg enumC1631Mg) {
        this.zzf = enumC1631Mg.zza();
        this.zze |= 1;
    }

    public static C3185ig zzc() {
        return (C3185ig) zzc.i();
    }

    public static C3185ig zzd(C3298jg c3298jg) {
        return (C3185ig) zzc.y(c3298jg);
    }

    public static C3298jg zzf() {
        return zzc;
    }

    public static C3298jg zzg(InputStream inputStream) {
        return (C3298jg) Zy0.B(zzc, inputStream);
    }

    public static C3298jg zzh(InputStream inputStream, Iy0 iy0) {
        return (C3298jg) Zy0.C(zzc, inputStream, iy0);
    }

    public static C3298jg zzk(AbstractC3677my0 abstractC3677my0) {
        return (C3298jg) Zy0.D(zzc, abstractC3677my0);
    }

    public static C3298jg zzl(AbstractC4816wy0 abstractC4816wy0) {
        return (C3298jg) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C3298jg zzm(InputStream inputStream) {
        return (C3298jg) Zy0.F(zzc, inputStream);
    }

    public static C3298jg zzn(ByteBuffer byteBuffer) {
        return (C3298jg) Zy0.G(zzc, byteBuffer);
    }

    public static C3298jg zzo(byte[] bArr) {
        return (C3298jg) Zy0.H(zzc, bArr);
    }

    public static C3298jg zzp(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C3298jg) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C3298jg zzq(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C3298jg) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C3298jg zzr(InputStream inputStream, Iy0 iy0) {
        return (C3298jg) Zy0.K(zzc, inputStream, iy0);
    }

    public static C3298jg zzs(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C3298jg) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C3298jg zzt(byte[] bArr, Iy0 iy0) {
        return (C3298jg) Zy0.M(zzc, bArr, iy0);
    }

    public static Xz0 zzu() {
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
                return new C3298jg();
            case NEW_BUILDER:
                return new C3185ig();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C3298jg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3412kg
    public EnumC1631Mg zza() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzf);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_UNKNOWN : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412kg
    public C1261Df zzb() {
        C1261Df c1261Df = this.zzg;
        return c1261Df == null ? C1261Df.zzg() : c1261Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412kg
    public boolean zzi() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412kg
    public boolean zzj() {
        return (this.zze & 1) != 0;
    }
}
