package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1261Df extends Zy0 implements InterfaceC1302Ef {
    public static final int zza = 1;
    private static final C1261Df zzb;
    private static volatile Xz0 zzc;
    private int zzd;
    private int zze;

    static {
        C1261Df c1261Df = new C1261Df();
        zzb = c1261Df;
        Zy0.P(C1261Df.class, c1261Df);
    }

    private C1261Df() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.zzd &= -2;
        this.zze = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(EnumC1179Bf enumC1179Bf) {
        this.zze = enumC1179Bf.zza();
        this.zzd |= 1;
    }

    public static C1138Af zza() {
        return (C1138Af) zzb.i();
    }

    public static C1138Af zze(C1261Df c1261Df) {
        return (C1138Af) zzb.y(c1261Df);
    }

    public static C1261Df zzg() {
        return zzb;
    }

    public static C1261Df zzh(InputStream inputStream) {
        return (C1261Df) Zy0.B(zzb, inputStream);
    }

    public static C1261Df zzi(InputStream inputStream, Iy0 iy0) {
        return (C1261Df) Zy0.C(zzb, inputStream, iy0);
    }

    public static C1261Df zzj(AbstractC3677my0 abstractC3677my0) {
        return (C1261Df) Zy0.D(zzb, abstractC3677my0);
    }

    public static C1261Df zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C1261Df) Zy0.E(zzb, abstractC4816wy0);
    }

    public static C1261Df zzl(InputStream inputStream) {
        return (C1261Df) Zy0.F(zzb, inputStream);
    }

    public static C1261Df zzm(ByteBuffer byteBuffer) {
        return (C1261Df) Zy0.G(zzb, byteBuffer);
    }

    public static C1261Df zzn(byte[] bArr) {
        return (C1261Df) Zy0.H(zzb, bArr);
    }

    public static C1261Df zzo(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1261Df) Zy0.I(zzb, abstractC3677my0, iy0);
    }

    public static C1261Df zzp(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1261Df) Zy0.J(zzb, abstractC4816wy0, iy0);
    }

    public static C1261Df zzq(InputStream inputStream, Iy0 iy0) {
        return (C1261Df) Zy0.K(zzb, inputStream, iy0);
    }

    public static C1261Df zzr(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1261Df) Zy0.L(zzb, byteBuffer, iy0);
    }

    public static C1261Df zzs(byte[] bArr, Iy0 iy0) {
        return (C1261Df) Zy0.M(zzb, bArr, iy0);
    }

    public static Xz0 zzt() {
        return zzb.zzbM();
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
                return Zy0.t(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", EnumC1179Bf.zze()});
            case NEW_MUTABLE_INSTANCE:
                return new C1261Df();
            case NEW_BUILDER:
                return new C1138Af();
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                Xz0 uy0 = zzc;
                if (uy0 == null) {
                    synchronized (C1261Df.class) {
                        try {
                            uy0 = zzc;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzb);
                                zzc = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1302Ef
    public EnumC1179Bf zzc() {
        EnumC1179Bf enumC1179BfZzb = EnumC1179Bf.zzb(this.zze);
        return enumC1179BfZzb == null ? EnumC1179Bf.VIDEO_ERROR_CODE_UNSPECIFIED : enumC1179BfZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1302Ef
    public boolean zzd() {
        return (this.zzd & 1) != 0;
    }
}
