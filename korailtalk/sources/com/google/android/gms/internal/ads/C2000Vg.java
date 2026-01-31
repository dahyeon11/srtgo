package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Vg */
/* loaded from: classes2.dex */
public final class C2000Vg extends Zy0 implements InterfaceC2041Wg {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2000Vg zzc;
    private static volatile Xz0 zzd;
    private int zze;
    private int zzf;
    private InterfaceC3110hz0 zzg = Zy0.j();

    static {
        C2000Vg c2000Vg = new C2000Vg();
        zzc = c2000Vg;
        Zy0.P(C2000Vg.class, c2000Vg);
    }

    private C2000Vg() {
    }

    public void b0(Iterable iterable) {
        f0();
        Qx0.d(iterable, this.zzg);
    }

    public void c0(int i8) {
        f0();
        this.zzg.zzi(i8);
    }

    public void d0() {
        this.zzg = Zy0.j();
    }

    public void e0() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void f0() {
        InterfaceC3110hz0 interfaceC3110hz0 = this.zzg;
        if (interfaceC3110hz0.zzc()) {
            return;
        }
        this.zzg = Zy0.k(interfaceC3110hz0);
    }

    public void g0(int i8, int i9) {
        f0();
        this.zzg.zze(i8, i9);
    }

    public void h0(EnumC1631Mg enumC1631Mg) {
        this.zzf = enumC1631Mg.zza();
        this.zze |= 1;
    }

    public static C1959Ug zzd() {
        return (C1959Ug) zzc.i();
    }

    public static C1959Ug zze(C2000Vg c2000Vg) {
        return (C1959Ug) zzc.y(c2000Vg);
    }

    public static C2000Vg zzg() {
        return zzc;
    }

    public static C2000Vg zzh(InputStream inputStream) {
        return (C2000Vg) Zy0.B(zzc, inputStream);
    }

    public static C2000Vg zzi(InputStream inputStream, Iy0 iy0) {
        return (C2000Vg) Zy0.C(zzc, inputStream, iy0);
    }

    public static C2000Vg zzl(AbstractC3677my0 abstractC3677my0) {
        return (C2000Vg) Zy0.D(zzc, abstractC3677my0);
    }

    public static C2000Vg zzm(AbstractC4816wy0 abstractC4816wy0) {
        return (C2000Vg) Zy0.E(zzc, abstractC4816wy0);
    }

    public static C2000Vg zzn(InputStream inputStream) {
        return (C2000Vg) Zy0.F(zzc, inputStream);
    }

    public static C2000Vg zzo(ByteBuffer byteBuffer) {
        return (C2000Vg) Zy0.G(zzc, byteBuffer);
    }

    public static C2000Vg zzp(byte[] bArr) {
        return (C2000Vg) Zy0.H(zzc, bArr);
    }

    public static C2000Vg zzq(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C2000Vg) Zy0.I(zzc, abstractC3677my0, iy0);
    }

    public static C2000Vg zzr(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C2000Vg) Zy0.J(zzc, abstractC4816wy0, iy0);
    }

    public static C2000Vg zzs(InputStream inputStream, Iy0 iy0) {
        return (C2000Vg) Zy0.K(zzc, inputStream, iy0);
    }

    public static C2000Vg zzt(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C2000Vg) Zy0.L(zzc, byteBuffer, iy0);
    }

    public static C2000Vg zzu(byte[] bArr, Iy0 iy0) {
        return (C2000Vg) Zy0.M(zzc, bArr, iy0);
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
                return Zy0.t(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", EnumC1631Mg.zze(), "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new C2000Vg();
            case NEW_BUILDER:
                return new C1959Ug();
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C2000Vg.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2041Wg
    public int zza(int i8) {
        return this.zzg.zzd(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2041Wg
    public int zzb() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2041Wg
    public EnumC1631Mg zzc() {
        EnumC1631Mg enumC1631MgZzb = EnumC1631Mg.zzb(this.zzf);
        return enumC1631MgZzb == null ? EnumC1631Mg.ENUM_FALSE : enumC1631MgZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2041Wg
    public List<Integer> zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2041Wg
    public boolean zzk() {
        return (this.zze & 1) != 0;
    }
}
