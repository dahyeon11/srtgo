package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3410kf extends Zy0 implements InterfaceC3524lf {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3410kf zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C3410kf c3410kf = new C3410kf();
        zzc = c3410kf;
        Zy0.P(C3410kf.class, c3410kf);
    }

    private C3410kf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.zze &= -2;
        this.zzf = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i8) {
        this.zze |= 2;
        this.zzg = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i8) {
        this.zze |= 1;
        this.zzf = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        this.zze &= -3;
        this.zzg = 0;
    }

    public static C3296jf zzc() {
        return (C3296jf) zzc.i();
    }

    public static C3296jf zzd(C3410kf c3410kf) {
        return (C3296jf) zzc.y(c3410kf);
    }

    public static C3410kf zzf() {
        return zzc;
    }

    public static C3410kf zzi(InputStream inputStream) {
        return (C3410kf) Zy0.B(zzc, inputStream);
    }

    public static C3410kf zzj(InputStream inputStream, Iy0 iy0) {
        return (C3410kf) Zy0.C(zzc, inputStream, iy0);
    }

    public static C3410kf zzk(AbstractC3677my0 abstractC3677my0) {
        return (C3410kf) Zy0.D(zzc, abstractC3677my0);
    }

    public static C3410kf zzl(AbstractC4816wy0 abstractC4816wy0) {
        return (C3410kf) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C3410kf zzm(InputStream inputStream) {
        return (C3410kf) Zy0.F(zzc, inputStream);
    }

    public static C3410kf zzn(ByteBuffer byteBuffer) {
        return (C3410kf) Zy0.G(zzc, byteBuffer);
    }

    public static C3410kf zzo(byte[] bArr) {
        return (C3410kf) Zy0.H(zzc, bArr);
    }

    public static C3410kf zzp(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C3410kf) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C3410kf zzq(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C3410kf) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C3410kf zzr(InputStream inputStream, Iy0 iy0) {
        return (C3410kf) Zy0.K(zzc, inputStream, iy0);
    }

    public static C3410kf zzs(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C3410kf) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C3410kf zzt(byte[] bArr, Iy0 iy0) {
        return (C3410kf) Zy0.M(zzc, bArr, iy0);
    }

    public static Xz0 zzu() {
        return zzc.zzbM();
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C3410kf();
            case NEW_BUILDER:
                return new C3296jf();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C3410kf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3524lf
    public int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3524lf
    public int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3524lf
    public boolean zzg() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3524lf
    public boolean zzh() {
        return (this.zze & 1) != 0;
    }
}
