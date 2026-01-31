package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1957Uf extends Zy0 implements InterfaceC3868og {
    public static final int zza = 1;
    private static final C1957Uf zzb;
    private static volatile Xz0 zzc;
    private InterfaceC3679mz0 zzd = Zy0.n();

    static {
        C1957Uf c1957Uf = new C1957Uf();
        zzb = c1957Uf;
        Zy0.P(C1957Uf.class, c1957Uf);
    }

    private C1957Uf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(Iterable iterable) {
        f0();
        Qx0.d(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(C1507Jf c1507Jf) {
        c1507Jf.getClass();
        f0();
        this.zzd.add(c1507Jf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i8, C1507Jf c1507Jf) {
        c1507Jf.getClass();
        f0();
        this.zzd.add(i8, c1507Jf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        this.zzd = Zy0.n();
    }

    private void f0() {
        InterfaceC3679mz0 interfaceC3679mz0 = this.zzd;
        if (interfaceC3679mz0.zzc()) {
            return;
        }
        this.zzd = Zy0.o(interfaceC3679mz0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i8) {
        f0();
        this.zzd.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i8, C1507Jf c1507Jf) {
        c1507Jf.getClass();
        f0();
        this.zzd.set(i8, c1507Jf);
    }

    public static C1589Lf zzd() {
        return (C1589Lf) zzb.i();
    }

    public static C1589Lf zze(C1957Uf c1957Uf) {
        return (C1589Lf) zzb.y(c1957Uf);
    }

    public static C1957Uf zzg() {
        return zzb;
    }

    public static C1957Uf zzh(InputStream inputStream) {
        return (C1957Uf) Zy0.B(zzb, inputStream);
    }

    public static C1957Uf zzi(InputStream inputStream, Iy0 iy0) {
        return (C1957Uf) Zy0.C(zzb, inputStream, iy0);
    }

    public static C1957Uf zzj(AbstractC3677my0 abstractC3677my0) {
        return (C1957Uf) Zy0.D(zzb, abstractC3677my0);
    }

    public static C1957Uf zzk(AbstractC4816wy0 abstractC4816wy0) {
        return (C1957Uf) Zy0.E(zzb, abstractC4816wy0);
    }

    public static C1957Uf zzm(InputStream inputStream) {
        return (C1957Uf) Zy0.F(zzb, inputStream);
    }

    public static C1957Uf zzn(ByteBuffer byteBuffer) {
        return (C1957Uf) Zy0.G(zzb, byteBuffer);
    }

    public static C1957Uf zzo(byte[] bArr) {
        return (C1957Uf) Zy0.H(zzb, bArr);
    }

    public static C1957Uf zzp(AbstractC3677my0 abstractC3677my0, Iy0 iy0) {
        return (C1957Uf) Zy0.I(zzb, abstractC3677my0, iy0);
    }

    public static C1957Uf zzq(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) {
        return (C1957Uf) Zy0.J(zzb, abstractC4816wy0, iy0);
    }

    public static C1957Uf zzr(InputStream inputStream, Iy0 iy0) {
        return (C1957Uf) Zy0.K(zzb, inputStream, iy0);
    }

    public static C1957Uf zzs(ByteBuffer byteBuffer, Iy0 iy0) {
        return (C1957Uf) Zy0.L(zzb, byteBuffer, iy0);
    }

    public static C1957Uf zzt(byte[] bArr, Iy0 iy0) {
        return (C1957Uf) Zy0.M(zzb, bArr, iy0);
    }

    public static Xz0 zzu() {
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
                return Zy0.t(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C1507Jf.class});
            case NEW_MUTABLE_INSTANCE:
                return new C1957Uf();
            case NEW_BUILDER:
                return new C1589Lf();
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                Xz0 uy0 = zzc;
                if (uy0 == null) {
                    synchronized (C1957Uf.class) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3868og
    public int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3868og
    public C1507Jf zzb(int i8) {
        return (C1507Jf) this.zzd.get(i8);
    }

    public InterfaceC1548Kf zzc(int i8) {
        return (InterfaceC1548Kf) this.zzd.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3868og
    public List<C1507Jf> zzl() {
        return this.zzd;
    }

    public List<? extends InterfaceC1548Kf> zzv() {
        return this.zzd;
    }
}
