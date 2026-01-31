package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Qe */
/* loaded from: classes2.dex */
public final class C1791Qe extends Zy0 implements InterfaceC1955Ue {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1791Qe zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C1791Qe c1791Qe = new C1791Qe();
        zzc = c1791Qe;
        Zy0.P(C1791Qe.class, c1791Qe);
    }

    private C1791Qe() {
    }

    public void Z() {
        this.zze &= -3;
        this.zzg = 0;
    }

    public void a0() {
        this.zze &= -2;
        this.zzf = 0;
    }

    public void b0(EnumC1627Me enumC1627Me) {
        this.zzg = enumC1627Me.zza();
        this.zze |= 2;
    }

    public void c0(EnumC1709Oe enumC1709Oe) {
        this.zzf = enumC1709Oe.zza();
        this.zze |= 1;
    }

    public static C1587Le zza() {
        return (C1587Le) zzc.i();
    }

    public static C1587Le zzc(C1791Qe c1791Qe) {
        return (C1587Le) zzc.y(c1791Qe);
    }

    public static C1791Qe zzi() {
        return zzc;
    }

    public static C1791Qe zzj(InputStream inputStream) {
        return (C1791Qe) Zy0.B(zzc, inputStream);
    }

    public static C1791Qe zzk(InputStream inputStream, Iy0 iy0) {
        return (C1791Qe) Zy0.C(zzc, inputStream, iy0);
    }

    public static C1791Qe zzl(AbstractC3677my0 abstractC3677my0) {
        return (C1791Qe) Zy0.D(zzc, abstractC3677my0);
    }

    public static C1791Qe zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C1791Qe) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C1791Qe zzn(InputStream inputStream) {
        return (C1791Qe) Zy0.F(zzc, inputStream);
    }

    public static C1791Qe zzo(ByteBuffer byteBuffer) {
        return (C1791Qe) Zy0.G(zzc, byteBuffer);
    }

    public static C1791Qe zzp(byte[] bArr) {
        return (C1791Qe) Zy0.H(zzc, bArr);
    }

    public static C1791Qe zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1791Qe) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C1791Qe zzr(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1791Qe) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C1791Qe zzs(InputStream inputStream, Iy0 iy0) {
        return (C1791Qe) Zy0.K(zzc, inputStream, iy0);
    }

    public static C1791Qe zzt(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1791Qe) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C1791Qe zzu(byte[] bArr, Iy0 iy0) {
        return (C1791Qe) Zy0.M(zzc, bArr, iy0);
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", EnumC1709Oe.zze(), "zzg", EnumC1627Me.zze()});
            case NEW_MUTABLE_INSTANCE:
                return new C1791Qe();
            case NEW_BUILDER:
                return new C1587Le();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C1791Qe.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1955Ue
    public EnumC1627Me zze() {
        EnumC1627Me enumC1627MeZzb = EnumC1627Me.zzb(this.zzg);
        return enumC1627MeZzb == null ? EnumC1627Me.CELLULAR_NETWORK_TYPE_UNSPECIFIED : enumC1627MeZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1955Ue
    public EnumC1709Oe zzf() {
        EnumC1709Oe enumC1709OeZzb = EnumC1709Oe.zzb(this.zzf);
        return enumC1709OeZzb == null ? EnumC1709Oe.NETWORKTYPE_UNSPECIFIED : enumC1709OeZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1955Ue
    public boolean zzg() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1955Ue
    public boolean zzh() {
        return (this.zze & 1) != 0;
    }
}
