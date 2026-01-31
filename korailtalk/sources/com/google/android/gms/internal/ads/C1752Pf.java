package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1752Pf extends Zy0 implements InterfaceC1793Qf {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1752Pf zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C1752Pf c1752Pf = new C1752Pf();
        zzc = c1752Pf;
        Zy0.P(C1752Pf.class, c1752Pf);
    }

    private C1752Pf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.zze &= -2;
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        this.zze &= -3;
        this.zzg = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z8) {
        this.zze |= 1;
        this.zzf = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i8) {
        this.zze |= 2;
        this.zzg = i8;
    }

    public static C1711Of zzc() {
        return (C1711Of) zzc.i();
    }

    public static C1711Of zzd(C1752Pf c1752Pf) {
        return (C1711Of) zzc.y(c1752Pf);
    }

    public static C1752Pf zzi() {
        return zzc;
    }

    public static C1752Pf zzj(InputStream inputStream) {
        return (C1752Pf) Zy0.B(zzc, inputStream);
    }

    public static C1752Pf zzk(InputStream inputStream, Iy0 iy0) {
        return (C1752Pf) Zy0.C(zzc, inputStream, iy0);
    }

    public static C1752Pf zzl(AbstractC3677my0 abstractC3677my0) {
        return (C1752Pf) Zy0.D(zzc, abstractC3677my0);
    }

    public static C1752Pf zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C1752Pf) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C1752Pf zzn(InputStream inputStream) {
        return (C1752Pf) Zy0.F(zzc, inputStream);
    }

    public static C1752Pf zzo(ByteBuffer byteBuffer) {
        return (C1752Pf) Zy0.G(zzc, byteBuffer);
    }

    public static C1752Pf zzp(byte[] bArr) {
        return (C1752Pf) Zy0.H(zzc, bArr);
    }

    public static C1752Pf zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1752Pf) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C1752Pf zzr(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1752Pf) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C1752Pf zzs(InputStream inputStream, Iy0 iy0) {
        return (C1752Pf) Zy0.K(zzc, inputStream, iy0);
    }

    public static C1752Pf zzt(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1752Pf) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C1752Pf zzu(byte[] bArr, Iy0 iy0) {
        return (C1752Pf) Zy0.M(zzc, bArr, iy0);
    }

    public static Xz0 zzv() {
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C1752Pf();
            case NEW_BUILDER:
                return new C1711Of();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C1752Pf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1793Qf
    public int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1793Qf
    public boolean zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1793Qf
    public boolean zzg() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1793Qf
    public boolean zzh() {
        return (this.zze & 2) != 0;
    }
}
