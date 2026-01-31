package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.tf */
/* loaded from: classes2.dex */
public final class C4435tf extends Zy0 implements InterfaceC4549uf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C4435tf zzd;
    private static volatile Xz0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C4435tf c4435tf = new C4435tf();
        zzd = c4435tf;
        Zy0.P(C4435tf.class, c4435tf);
    }

    private C4435tf() {
    }

    public void c0() {
        this.zzf &= -2;
        this.zzg = 0;
    }

    public void d0() {
        this.zzf &= -5;
        this.zzi = 0;
    }

    public void e0() {
        this.zzf &= -3;
        this.zzh = 0;
    }

    public void f0(int i8) {
        this.zzf |= 1;
        this.zzg = i8;
    }

    public void g0(int i8) {
        this.zzf |= 4;
        this.zzi = i8;
    }

    public void h0(int i8) {
        this.zzf |= 2;
        this.zzh = i8;
    }

    public static C4321sf zzd() {
        return (C4321sf) zzd.i();
    }

    public static C4321sf zze(C4435tf c4435tf) {
        return (C4321sf) zzd.y(c4435tf);
    }

    public static C4435tf zzg() {
        return zzd;
    }

    public static C4435tf zzh(InputStream inputStream) {
        return (C4435tf) Zy0.B(zzd, inputStream);
    }

    public static C4435tf zzi(InputStream inputStream, Iy0 iy0) {
        return (C4435tf) Zy0.C(zzd, inputStream, iy0);
    }

    public static C4435tf zzm(AbstractC3677my0 abstractC3677my0) {
        return (C4435tf) Zy0.D(zzd, abstractC3677my0);
    }

    public static C4435tf zzn(AbstractC4816wy0 abstractC4816wy0) {
        return (C4435tf) Zy0.E(zzd, abstractC4816wy0);
    }

    public static C4435tf zzo(InputStream inputStream) {
        return (C4435tf) Zy0.F(zzd, inputStream);
    }

    public static C4435tf zzp(ByteBuffer byteBuffer) {
        return (C4435tf) Zy0.G(zzd, byteBuffer);
    }

    public static C4435tf zzq(byte[] bArr) {
        return (C4435tf) Zy0.H(zzd, bArr);
    }

    public static C4435tf zzr(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C4435tf) Zy0.I(zzd, abstractC3677my0, iy0);
    }

    public static C4435tf zzs(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C4435tf) Zy0.J(zzd, abstractC4816wy0, iy0);
    }

    public static C4435tf zzt(InputStream inputStream, Iy0 iy0) {
        return (C4435tf) Zy0.K(zzd, inputStream, iy0);
    }

    public static C4435tf zzu(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C4435tf) Zy0.L(zzd, byteBuffer, iy0);
    }

    public static C4435tf zzv(byte[] bArr, Iy0 iy0) {
        return (C4435tf) Zy0.M(zzd, bArr, iy0);
    }

    public static Xz0 zzw() {
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
                return Zy0.t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new C4435tf();
            case NEW_BUILDER:
                return new C4321sf();
            case GET_DEFAULT_INSTANCE:
                return zzd;
            case GET_PARSER:
                Xz0 uy0 = zze;
                if (uy0 == null) {
                    synchronized (C4435tf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4549uf
    public int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4549uf
    public int zzb() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4549uf
    public int zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4549uf
    public boolean zzj() {
        return (this.zzf & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4549uf
    public boolean zzk() {
        return (this.zzf & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4549uf
    public boolean zzl() {
        return (this.zzf & 2) != 0;
    }
}
