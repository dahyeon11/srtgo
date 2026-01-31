package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.qf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4094qf extends Zy0 implements InterfaceC4207rf {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C4094qf zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C4094qf c4094qf = new C4094qf();
        zzc = c4094qf;
        Zy0.P(C4094qf.class, c4094qf);
    }

    private C4094qf() {
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

    public static C3980pf zzc() {
        return (C3980pf) zzc.i();
    }

    public static C3980pf zzd(C4094qf c4094qf) {
        return (C3980pf) zzc.y(c4094qf);
    }

    public static C4094qf zzf() {
        return zzc;
    }

    public static C4094qf zzi(InputStream inputStream) {
        return (C4094qf) Zy0.B(zzc, inputStream);
    }

    public static C4094qf zzj(InputStream inputStream, Iy0 iy0) {
        return (C4094qf) Zy0.C(zzc, inputStream, iy0);
    }

    public static C4094qf zzk(AbstractC3677my0 abstractC3677my0) {
        return (C4094qf) Zy0.D(zzc, abstractC3677my0);
    }

    public static C4094qf zzl(AbstractC4816wy0 abstractC4816wy0) {
        return (C4094qf) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C4094qf zzm(InputStream inputStream) {
        return (C4094qf) Zy0.F(zzc, inputStream);
    }

    public static C4094qf zzn(ByteBuffer byteBuffer) {
        return (C4094qf) Zy0.G(zzc, byteBuffer);
    }

    public static C4094qf zzo(byte[] bArr) {
        return (C4094qf) Zy0.H(zzc, bArr);
    }

    public static C4094qf zzp(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C4094qf) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C4094qf zzq(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C4094qf) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C4094qf zzr(InputStream inputStream, Iy0 iy0) {
        return (C4094qf) Zy0.K(zzc, inputStream, iy0);
    }

    public static C4094qf zzs(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C4094qf) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C4094qf zzt(byte[] bArr, Iy0 iy0) {
        return (C4094qf) Zy0.M(zzc, bArr, iy0);
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
                return new C4094qf();
            case NEW_BUILDER:
                return new C3980pf();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C4094qf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4207rf
    public int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207rf
    public int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207rf
    public boolean zzg() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207rf
    public boolean zzh() {
        return (this.zze & 1) != 0;
    }
}
