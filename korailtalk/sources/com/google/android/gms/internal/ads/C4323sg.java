package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4323sg extends Zy0 implements InterfaceC4437tg {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C4323sg zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf;
    private C3410kf zzg;

    static {
        C4323sg c4323sg = new C4323sg();
        zzc = c4323sg;
        Zy0.P(C4323sg.class, c4323sg);
    }

    private C4323sg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        this.zzg = null;
        this.zze &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.zze &= -2;
        this.zzf = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(C3410kf c3410kf) {
        c3410kf.getClass();
        C3410kf c3410kf2 = this.zzg;
        if (c3410kf2 != null && c3410kf2 != C3410kf.zzf()) {
            C3296jf c3296jfZzd = C3410kf.zzd(c3410kf2);
            c3296jfZzd.zzbj(c3410kf);
            c3410kf = (C3410kf) c3296jfZzd.zzbs();
        }
        this.zzg = c3410kf;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(C3410kf c3410kf) {
        c3410kf.getClass();
        this.zzg = c3410kf;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC3982pg enumC3982pg) {
        this.zzf = enumC3982pg.zza();
        this.zze |= 1;
    }

    public static C4209rg zzc() {
        return (C4209rg) zzc.i();
    }

    public static C4209rg zzd(C4323sg c4323sg) {
        return (C4209rg) zzc.y(c4323sg);
    }

    public static C4323sg zzf() {
        return zzc;
    }

    public static C4323sg zzg(InputStream inputStream) {
        return (C4323sg) Zy0.B(zzc, inputStream);
    }

    public static C4323sg zzk(InputStream inputStream, Iy0 iy0) {
        return (C4323sg) Zy0.C(zzc, inputStream, iy0);
    }

    public static C4323sg zzl(AbstractC3677my0 abstractC3677my0) {
        return (C4323sg) Zy0.D(zzc, abstractC3677my0);
    }

    public static C4323sg zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C4323sg) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C4323sg zzn(InputStream inputStream) {
        return (C4323sg) Zy0.F(zzc, inputStream);
    }

    public static C4323sg zzo(ByteBuffer byteBuffer) {
        return (C4323sg) Zy0.G(zzc, byteBuffer);
    }

    public static C4323sg zzp(byte[] bArr) {
        return (C4323sg) Zy0.H(zzc, bArr);
    }

    public static C4323sg zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C4323sg) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C4323sg zzr(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C4323sg) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C4323sg zzs(InputStream inputStream, Iy0 iy0) {
        return (C4323sg) Zy0.K(zzc, inputStream, iy0);
    }

    public static C4323sg zzt(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C4323sg) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C4323sg zzu(byte[] bArr, Iy0 iy0) {
        return (C4323sg) Zy0.M(zzc, bArr, iy0);
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", EnumC3982pg.zze(), "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C4323sg();
            case NEW_BUILDER:
                return new C4209rg();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C4323sg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4437tg
    public EnumC3982pg zza() {
        EnumC3982pg enumC3982pgZzb = EnumC3982pg.zzb(this.zzf);
        return enumC3982pgZzb == null ? EnumC3982pg.AD_FORMAT_TYPE_UNSPECIFIED : enumC3982pgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4437tg
    public C3410kf zzh() {
        C3410kf c3410kf = this.zzg;
        return c3410kf == null ? C3410kf.zzf() : c3410kf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4437tg
    public boolean zzi() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4437tg
    public boolean zzj() {
        return (this.zze & 1) != 0;
    }
}
