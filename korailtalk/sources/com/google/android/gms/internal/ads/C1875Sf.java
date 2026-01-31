package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1875Sf extends Zy0 implements InterfaceC1916Tf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1875Sf zzd;
    private static volatile Xz0 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C1875Sf c1875Sf = new C1875Sf();
        zzd = c1875Sf;
        Zy0.P(C1875Sf.class, c1875Sf);
    }

    private C1875Sf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        this.zzf &= -2;
        this.zzg = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        this.zzf &= -3;
        this.zzh = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        this.zzf &= -5;
        this.zzi = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(boolean z8) {
        this.zzf |= 1;
        this.zzg = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(boolean z8) {
        this.zzf |= 2;
        this.zzh = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i8) {
        this.zzf |= 4;
        this.zzi = i8;
    }

    public static C1834Rf zzc() {
        return (C1834Rf) zzd.i();
    }

    public static C1834Rf zzd(C1875Sf c1875Sf) {
        return (C1834Rf) zzd.y(c1875Sf);
    }

    public static C1875Sf zzf() {
        return zzd;
    }

    public static C1875Sf zzg(InputStream inputStream) {
        return (C1875Sf) Zy0.B(zzd, inputStream);
    }

    public static C1875Sf zzm(InputStream inputStream, Iy0 iy0) {
        return (C1875Sf) Zy0.C(zzd, inputStream, iy0);
    }

    public static C1875Sf zzn(AbstractC3677my0 abstractC3677my0) {
        return (C1875Sf) Zy0.D(zzd, abstractC3677my0);
    }

    public static C1875Sf zzo(AbstractC4816wy0 abstractC4816wy0) {
        return (C1875Sf) Zy0.E(zzd, abstractC4816wy0);
    }

    public static C1875Sf zzp(InputStream inputStream) {
        return (C1875Sf) Zy0.F(zzd, inputStream);
    }

    public static C1875Sf zzq(ByteBuffer byteBuffer) {
        return (C1875Sf) Zy0.G(zzd, byteBuffer);
    }

    public static C1875Sf zzr(byte[] bArr) {
        return (C1875Sf) Zy0.H(zzd, bArr);
    }

    public static C1875Sf zzs(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1875Sf) Zy0.I(zzd, abstractC3677my0, iy0);
    }

    public static C1875Sf zzt(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1875Sf) Zy0.J(zzd, abstractC4816wy0, iy0);
    }

    public static C1875Sf zzu(InputStream inputStream, Iy0 iy0) {
        return (C1875Sf) Zy0.K(zzd, inputStream, iy0);
    }

    public static C1875Sf zzv(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1875Sf) Zy0.L(zzd, byteBuffer, iy0);
    }

    public static C1875Sf zzw(byte[] bArr, Iy0 iy0) {
        return (C1875Sf) Zy0.M(zzd, bArr, iy0);
    }

    public static Xz0 zzx() {
        return zzd.zzbM();
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
                return Zy0.t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new C1875Sf();
            case NEW_BUILDER:
                return new C1834Rf();
            case GET_DEFAULT_INSTANCE:
                return zzd;
            case GET_PARSER:
                Xz0 uy0 = zze;
                if (uy0 == null) {
                    synchronized (C1875Sf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1916Tf
    public int zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1916Tf
    public boolean zzh() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1916Tf
    public boolean zzi() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1916Tf
    public boolean zzj() {
        return (this.zzf & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1916Tf
    public boolean zzk() {
        return (this.zzf & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1916Tf
    public boolean zzl() {
        return (this.zzf & 4) != 0;
    }
}
