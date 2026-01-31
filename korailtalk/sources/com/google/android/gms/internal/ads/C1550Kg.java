package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Kg */
/* loaded from: classes2.dex */
public final class C1550Kg extends Zy0 implements InterfaceC1591Lg {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final C1550Kg zze;
    private static volatile Xz0 zzf;
    private int zzg;
    private int zzh;
    private C4435tf zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        C1550Kg c1550Kg = new C1550Kg();
        zze = c1550Kg;
        Zy0.P(C1550Kg.class, c1550Kg);
    }

    private C1550Kg() {
    }

    public void k0() {
        this.zzg &= -5;
        this.zzj = zze().zzq();
    }

    public void l0() {
        this.zzi = null;
        this.zzg &= -3;
    }

    public void m0() {
        this.zzg &= -2;
        this.zzh = 0;
    }

    public void n0() {
        this.zzg &= -9;
        this.zzk = zze().zzr();
    }

    public void o0(C4435tf c4435tf) {
        c4435tf.getClass();
        C4435tf c4435tf2 = this.zzi;
        if (c4435tf2 != null && c4435tf2 != C4435tf.zzg()) {
            C4321sf c4321sfZze = C4435tf.zze(c4435tf2);
            c4321sfZze.zzbj(c4435tf);
            c4435tf = (C4435tf) c4321sfZze.zzbs();
        }
        this.zzi = c4435tf;
        this.zzg |= 2;
    }

    public void p0(String str) {
        str.getClass();
        this.zzg |= 4;
        this.zzj = str;
    }

    public void q0(AbstractC3677my0 abstractC3677my0) {
        this.zzj = abstractC3677my0.zzy();
        this.zzg |= 4;
    }

    public void r0(C4435tf c4435tf) {
        c4435tf.getClass();
        this.zzi = c4435tf;
        this.zzg |= 2;
    }

    public void s0(EnumC1468Ig enumC1468Ig) {
        this.zzh = enumC1468Ig.zza();
        this.zzg |= 1;
    }

    public void t0(String str) {
        str.getClass();
        this.zzg |= 8;
        this.zzk = str;
    }

    public void u0(AbstractC3677my0 abstractC3677my0) {
        this.zzk = abstractC3677my0.zzy();
        this.zzg |= 8;
    }

    public static C1550Kg zzA(byte[] bArr, Iy0 iy0) {
        return (C1550Kg) Zy0.M(zze, bArr, iy0);
    }

    public static Xz0 zzB() {
        return zze.zzbM();
    }

    public static C1427Hg zza() {
        return (C1427Hg) zze.i();
    }

    public static C1427Hg zzc(C1550Kg c1550Kg) {
        return (C1427Hg) zze.y(c1550Kg);
    }

    public static C1550Kg zze() {
        return zze;
    }

    public static C1550Kg zzf(InputStream inputStream) {
        return (C1550Kg) Zy0.B(zze, inputStream);
    }

    public static C1550Kg zzg(InputStream inputStream, Iy0 iy0) {
        return (C1550Kg) Zy0.C(zze, inputStream, iy0);
    }

    public static C1550Kg zzh(AbstractC3677my0 abstractC3677my0) {
        return (C1550Kg) Zy0.D(zze, abstractC3677my0);
    }

    public static C1550Kg zzi(AbstractC4816wy0 abstractC4816wy0) {
        return (C1550Kg) Zy0.E(zze, abstractC4816wy0);
    }

    public static C1550Kg zzj(InputStream inputStream) {
        return (C1550Kg) Zy0.F(zze, inputStream);
    }

    public static C1550Kg zzk(ByteBuffer byteBuffer) {
        return (C1550Kg) Zy0.G(zze, byteBuffer);
    }

    public static C1550Kg zzl(byte[] bArr) {
        return (C1550Kg) Zy0.H(zze, bArr);
    }

    public static C1550Kg zzw(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1550Kg) Zy0.I(zze, abstractC3677my0, iy0);
    }

    public static C1550Kg zzx(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1550Kg) Zy0.J(zze, abstractC4816wy0, iy0);
    }

    public static C1550Kg zzy(InputStream inputStream, Iy0 iy0) {
        return (C1550Kg) Zy0.K(zze, inputStream, iy0);
    }

    public static C1550Kg zzz(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1550Kg) Zy0.L(zze, byteBuffer, iy0);
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
                return Zy0.t(zze, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", EnumC1468Ig.zze(), "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new C1550Kg();
            case NEW_BUILDER:
                return new C1427Hg();
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                Xz0 uy0 = zzf;
                if (uy0 == null) {
                    synchronized (C1550Kg.class) {
                        try {
                            uy0 = zzf;
                            if (uy0 == null) {
                                uy0 = new Uy0(zze);
                                zzf = uy0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public EnumC1468Ig zzm() {
        EnumC1468Ig enumC1468IgZzb = EnumC1468Ig.zzb(this.zzh);
        return enumC1468IgZzb == null ? EnumC1468Ig.PLATFORM_UNSPECIFIED : enumC1468IgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public C4435tf zzn() {
        C4435tf c4435tf = this.zzi;
        return c4435tf == null ? C4435tf.zzg() : c4435tf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public AbstractC3677my0 zzo() {
        return AbstractC3677my0.zzw(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public AbstractC3677my0 zzp() {
        return AbstractC3677my0.zzw(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public String zzq() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public String zzr() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public boolean zzs() {
        return (this.zzg & 4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public boolean zzt() {
        return (this.zzg & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public boolean zzu() {
        return (this.zzg & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1591Lg
    public boolean zzv() {
        return (this.zzg & 8) != 0;
    }
}
