package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class Dy0 extends Yx0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f12721b = Logger.getLogger(Dy0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f12722c = MA0.a();
    public static final /* synthetic */ int zzf = 0;

    /* renamed from: a, reason: collision with root package name */
    Ey0 f12723a;

    /* synthetic */ Dy0(Cy0 cy0) {
    }

    static int a(Pz0 pz0, InterfaceC3360kA0 interfaceC3360kA0) {
        int iB = ((Qx0) pz0).b(interfaceC3360kA0);
        return zzD(iB) + iB;
    }

    static int b(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    static int f(int i8, Pz0 pz0, InterfaceC3360kA0 interfaceC3360kA0) {
        int iZzD = zzD(i8 << 3);
        return iZzD + iZzD + ((Qx0) pz0).b(interfaceC3360kA0);
    }

    public static int zzC(String str) {
        int length;
        try {
            length = RA0.e(str);
        } catch (QA0 unused) {
            length = str.getBytes(AbstractC3793nz0.f21377b).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public static int zzE(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static Dy0 zzF(byte[] bArr, int i8, int i9) {
        return new C5158zy0(bArr, 0, i9);
    }

    public static int zzz(Pz0 pz0) {
        int iZzaY = pz0.zzaY();
        return zzD(iZzaY) + iZzaY;
    }

    final void c(String str, QA0 qa0) throws Ay0 {
        f12721b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) qa0);
        byte[] bytes = str.getBytes(AbstractC3793nz0.f21377b);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new Ay0(e8);
        }
    }

    abstract void e(int i8, Pz0 pz0, InterfaceC3360kA0 interfaceC3360kA0);

    public final void zzG() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzL();

    public abstract void zzM(byte b9);

    public abstract void zzN(int i8, boolean z8);

    public abstract void zzO(int i8, AbstractC3677my0 abstractC3677my0);

    @Override // com.google.android.gms.internal.ads.Yx0
    public abstract void zza(byte[] bArr, int i8, int i9);

    public abstract int zzb();

    public abstract void zzh(int i8, int i9);

    public abstract void zzi(int i8);

    public abstract void zzj(int i8, long j8);

    public abstract void zzk(long j8);

    public abstract void zzl(int i8, int i9);

    public abstract void zzm(int i8);

    public abstract void zzo(int i8, Pz0 pz0);

    public abstract void zzp(int i8, AbstractC3677my0 abstractC3677my0);

    public abstract void zzq(int i8, String str);

    public abstract void zzs(int i8, int i9);

    public abstract void zzt(int i8, int i9);

    public abstract void zzu(int i8);

    public abstract void zzv(int i8, long j8);

    public abstract void zzw(long j8);
}
