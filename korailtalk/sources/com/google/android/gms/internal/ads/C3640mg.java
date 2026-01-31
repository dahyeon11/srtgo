package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mg */
/* loaded from: classes2.dex */
public final class C3640mg extends Zy0 implements InterfaceC3754ng {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3640mg zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C3640mg c3640mg = new C3640mg();
        zzc = c3640mg;
        Zy0.P(C3640mg.class, c3640mg);
    }

    private C3640mg() {
    }

    public void Z() {
        this.zze &= -2;
        this.zzf = false;
    }

    public void a0() {
        this.zze &= -3;
        this.zzg = 0;
    }

    public void b0(boolean z8) {
        this.zze |= 1;
        this.zzf = z8;
    }

    public void c0(int i8) {
        this.zze |= 2;
        this.zzg = i8;
    }

    public static C3526lg zzc() {
        return (C3526lg) zzc.i();
    }

    public static C3526lg zzd(C3640mg c3640mg) {
        return (C3526lg) zzc.y(c3640mg);
    }

    public static C3640mg zzi() {
        return zzc;
    }

    public static C3640mg zzj(InputStream inputStream) {
        return (C3640mg) Zy0.B(zzc, inputStream);
    }

    public static C3640mg zzk(InputStream inputStream, Iy0 iy0) {
        return (C3640mg) Zy0.C(zzc, inputStream, iy0);
    }

    public static C3640mg zzl(AbstractC3677my0 abstractC3677my0) {
        return (C3640mg) Zy0.D(zzc, abstractC3677my0);
    }

    public static C3640mg zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C3640mg) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C3640mg zzn(InputStream inputStream) {
        return (C3640mg) Zy0.F(zzc, inputStream);
    }

    public static C3640mg zzo(ByteBuffer byteBuffer) {
        return (C3640mg) Zy0.G(zzc, byteBuffer);
    }

    public static C3640mg zzp(byte[] bArr) {
        return (C3640mg) Zy0.H(zzc, bArr);
    }

    public static C3640mg zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C3640mg) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C3640mg zzr(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C3640mg) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C3640mg zzs(InputStream inputStream, Iy0 iy0) {
        return (C3640mg) Zy0.K(zzc, inputStream, iy0);
    }

    public static C3640mg zzt(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C3640mg) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C3640mg zzu(byte[] bArr, Iy0 iy0) {
        return (C3640mg) Zy0.M(zzc, bArr, iy0);
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C3640mg();
            case NEW_BUILDER:
                return new C3526lg();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C3640mg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3754ng
    public int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3754ng
    public boolean zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3754ng
    public boolean zzg() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3754ng
    public boolean zzh() {
        return (this.zze & 2) != 0;
    }
}
