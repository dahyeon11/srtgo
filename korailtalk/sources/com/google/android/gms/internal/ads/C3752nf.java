package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3752nf extends Zy0 implements InterfaceC3866of {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C3752nf zzd;
    private static volatile Xz0 zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private C4094qf zzi;

    static {
        C3752nf c3752nf = new C3752nf();
        zzd = c3752nf;
        Zy0.P(C3752nf.class, c3752nf);
    }

    private C3752nf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        this.zzf &= -2;
        this.zzg = zzf().zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        this.zzi = null;
        this.zzf &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        this.zzf &= -3;
        this.zzh = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(C4094qf c4094qf) {
        c4094qf.getClass();
        C4094qf c4094qf2 = this.zzi;
        if (c4094qf2 != null && c4094qf2 != C4094qf.zzf()) {
            C3980pf c3980pfZzd = C4094qf.zzd(c4094qf2);
            c3980pfZzd.zzbj(c4094qf);
            c4094qf = (C4094qf) c3980pfZzd.zzbs();
        }
        this.zzi = c4094qf;
        this.zzf |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(AbstractC3677my0 abstractC3677my0) {
        this.zzg = abstractC3677my0.zzy();
        this.zzf |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(C4094qf c4094qf) {
        c4094qf.getClass();
        this.zzi = c4094qf;
        this.zzf |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(EnumC1631Mg enumC1631Mg) {
        this.zzh = enumC1631Mg.zza();
        this.zzf |= 2;
    }

    public static C3638mf zzc() {
        return (C3638mf) zzd.i();
    }

    public static C3638mf zzd(C3752nf c3752nf) {
        return (C3638mf) zzd.y(c3752nf);
    }

    public static C3752nf zzf() {
        return zzd;
    }

    public static C3752nf zzg(InputStream inputStream) {
        return (C3752nf) Zy0.B(zzd, inputStream);
    }

    public static C3752nf zzh(InputStream inputStream, Iy0 iy0) {
        return (C3752nf) Zy0.C(zzd, inputStream, iy0);
    }

    public static C3752nf zzi(AbstractC3677my0 abstractC3677my0) {
        return (C3752nf) Zy0.D(zzd, abstractC3677my0);
    }

    public static C3752nf zzj(AbstractC4816wy0 abstractC4816wy0) {
        return (C3752nf) Zy0.E(zzd, abstractC4816wy0);
    }

    public static C3752nf zzq(InputStream inputStream) {
        return (C3752nf) Zy0.F(zzd, inputStream);
    }

    public static C3752nf zzr(ByteBuffer byteBuffer) {
        return (C3752nf) Zy0.G(zzd, byteBuffer);
    }

    public static C3752nf zzs(byte[] bArr) {
        return (C3752nf) Zy0.H(zzd, bArr);
    }

    public static C3752nf zzt(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C3752nf) Zy0.I(zzd, abstractC3677my0, iy0);
    }

    public static C3752nf zzu(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C3752nf) Zy0.J(zzd, abstractC4816wy0, iy0);
    }

    public static C3752nf zzv(InputStream inputStream, Iy0 iy0) {
        return (C3752nf) Zy0.K(zzd, inputStream, iy0);
    }

    public static C3752nf zzw(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C3752nf) Zy0.L(zzd, byteBuffer, iy0);
    }

    public static C3752nf zzx(byte[] bArr, Iy0 iy0) {
        return (C3752nf) Zy0.M(zzd, bArr, iy0);
    }

    public static Xz0 zzy() {
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
                return Zy0.t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", EnumC1631Mg.zze(), "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new C3752nf();
            case NEW_BUILDER:
                return new C3638mf();
            case GET_DEFAULT_INSTANCE:
                return zzd;
            case GET_PARSER:
                Xz0 uy0 = zze;
                if (uy0 == null) {
                    synchronized (C3752nf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public EnumC1631Mg zza() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzh);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public C4094qf zzk() {
        C4094qf c4094qf = this.zzi;
        return c4094qf == null ? C4094qf.zzf() : c4094qf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public AbstractC3677my0 zzl() {
        return AbstractC3677my0.zzw(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public String zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public boolean zzn() {
        return (this.zzf & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public boolean zzo() {
        return (this.zzf & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3866of
    public boolean zzp() {
        return (this.zzf & 2) != 0;
    }
}
