package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.qy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4133qy0 extends AbstractC4816wy0 {

    /* renamed from: e, reason: collision with root package name */
    private final Iterable f22310e;

    /* renamed from: f, reason: collision with root package name */
    private final Iterator f22311f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f22312g;

    /* renamed from: h, reason: collision with root package name */
    private int f22313h;

    /* renamed from: i, reason: collision with root package name */
    private int f22314i;

    /* renamed from: j, reason: collision with root package name */
    private int f22315j;

    /* renamed from: k, reason: collision with root package name */
    private int f22316k;

    /* renamed from: l, reason: collision with root package name */
    private int f22317l;

    /* renamed from: m, reason: collision with root package name */
    private long f22318m;

    /* renamed from: n, reason: collision with root package name */
    private long f22319n;

    /* renamed from: o, reason: collision with root package name */
    private long f22320o;

    /* synthetic */ C4133qy0(Iterable iterable, int i8, boolean z8, AbstractC4019py0 abstractC4019py0) {
        super(null);
        this.f22315j = Integer.MAX_VALUE;
        this.f22313h = i8;
        this.f22310e = iterable;
        this.f22311f = iterable.iterator();
        this.f22317l = 0;
        if (i8 != 0) {
            f();
            return;
        }
        this.f22312g = AbstractC3793nz0.zze;
        this.f22318m = 0L;
        this.f22319n = 0L;
        this.f22320o = 0L;
    }

    private final int b() {
        return (int) (((this.f22313h - this.f22317l) - this.f22318m) + this.f22319n);
    }

    private final void c() throws C4021pz0 {
        if (!this.f22311f.hasNext()) {
            throw C4021pz0.i();
        }
        f();
    }

    private final void d(byte[] bArr, int i8, int i9) throws C4021pz0 {
        if (i9 > b()) {
            if (i9 > 0) {
                throw C4021pz0.i();
            }
            return;
        }
        int i10 = i9;
        while (i10 > 0) {
            if (this.f22320o - this.f22318m == 0) {
                c();
            }
            int iMin = Math.min(i10, (int) (this.f22320o - this.f22318m));
            long j8 = iMin;
            MA0.w(this.f22318m, bArr, i9 - i10, j8);
            i10 -= iMin;
            this.f22318m += j8;
        }
    }

    private final void e() {
        int i8 = this.f22313h + this.f22314i;
        this.f22313h = i8;
        int i9 = this.f22315j;
        if (i8 <= i9) {
            this.f22314i = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f22314i = i10;
        this.f22313h = i8 - i10;
    }

    private final void f() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f22311f.next();
        this.f22312g = byteBuffer;
        this.f22317l += (int) (this.f22318m - this.f22319n);
        long jPosition = byteBuffer.position();
        this.f22318m = jPosition;
        this.f22319n = jPosition;
        this.f22320o = this.f22312g.limit();
        long jM = MA0.m(this.f22312g);
        this.f22318m += jM;
        this.f22319n += jM;
        this.f22320o += jM;
    }

    final long g() throws C4021pz0 {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            j8 |= (r3 & 127) << i8;
            if ((zza() & 128) == 0) {
                return j8;
            }
        }
        throw C4021pz0.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final void zzA(int i8) {
        this.f22315j = i8;
        e();
    }

    public final void zzB(int i8) throws C4021pz0 {
        if (i8 >= 0) {
            if (i8 <= ((this.f22313h - this.f22317l) - this.f22318m) + this.f22319n) {
                while (i8 > 0) {
                    if (this.f22320o - this.f22318m == 0) {
                        c();
                    }
                    int iMin = Math.min(i8, (int) (this.f22320o - this.f22318m));
                    i8 -= iMin;
                    this.f22318m += iMin;
                }
                return;
            }
        }
        if (i8 >= 0) {
            throw C4021pz0.i();
        }
        throw C4021pz0.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzC() {
        return (((long) this.f22317l) + this.f22318m) - this.f22319n == ((long) this.f22313h);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzE(int i8) throws C4021pz0 {
        int iZzm;
        int i9 = i8 & 7;
        if (i9 == 0) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw C4021pz0.e();
        }
        if (i9 == 1) {
            zzB(8);
            return true;
        }
        if (i9 == 2) {
            zzB(zzj());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw C4021pz0.a();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i8 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws C4021pz0 {
        if (this.f22320o - this.f22318m == 0) {
            c();
        }
        long j8 = this.f22318m;
        this.f22318m = 1 + j8;
        return MA0.i(j8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzd() {
        return (int) ((this.f22317l + this.f22318m) - this.f22319n);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zze(int i8) throws C4021pz0 {
        if (i8 < 0) {
            throw C4021pz0.f();
        }
        int iZzd = i8 + zzd();
        int i9 = this.f22315j;
        if (iZzd > i9) {
            throw C4021pz0.i();
        }
        this.f22315j = iZzd;
        e();
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        long j8 = this.f22320o;
        long j9 = this.f22318m;
        if (j8 - j9 < 4) {
            int iZza = zza() & 255;
            int iZza2 = (zza() & 255) << 8;
            return iZza | iZza2 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
        }
        this.f22318m = 4 + j9;
        int i8 = MA0.i(j9) & 255;
        int i9 = (MA0.i(1 + j9) & 255) << 8;
        return i8 | i9 | ((MA0.i(2 + j9) & 255) << 16) | ((MA0.i(j9 + 3) & 255) << 24);
    }

    public final int zzj() {
        int i8;
        long j8 = this.f22318m;
        if (this.f22320o != j8) {
            long j9 = j8 + 1;
            byte bI = MA0.i(j8);
            if (bI >= 0) {
                this.f22318m++;
                return bI;
            }
            if (this.f22320o - this.f22318m >= 10) {
                long j10 = 2 + j8;
                int i9 = (MA0.i(j9) << 7) ^ bI;
                if (i9 < 0) {
                    i8 = i9 ^ (-128);
                } else {
                    long j11 = 3 + j8;
                    int i10 = (MA0.i(j10) << AbstractC5358c.SO) ^ i9;
                    if (i10 >= 0) {
                        i8 = i10 ^ 16256;
                    } else {
                        long j12 = 4 + j8;
                        int i11 = i10 ^ (MA0.i(j11) << AbstractC5358c.NAK);
                        if (i11 < 0) {
                            i8 = (-2080896) ^ i11;
                        } else {
                            j11 = 5 + j8;
                            byte bI2 = MA0.i(j12);
                            int i12 = (i11 ^ (bI2 << AbstractC5358c.FS)) ^ 266354560;
                            if (bI2 < 0) {
                                j12 = 6 + j8;
                                if (MA0.i(j11) < 0) {
                                    j11 = 7 + j8;
                                    if (MA0.i(j12) < 0) {
                                        j12 = 8 + j8;
                                        if (MA0.i(j11) < 0) {
                                            j11 = 9 + j8;
                                            if (MA0.i(j12) < 0) {
                                                long j13 = j8 + 10;
                                                if (MA0.i(j11) >= 0) {
                                                    i8 = i12;
                                                    j10 = j13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i8 = i12;
                            }
                            i8 = i12;
                        }
                        j10 = j12;
                    }
                    j10 = j11;
                }
                this.f22318m = j10;
                return i8;
            }
        }
        return (int) g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzl() {
        return AbstractC4816wy0.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzm() throws C4021pz0 {
        if (zzC()) {
            this.f22316k = 0;
            return 0;
        }
        int iZzj = zzj();
        this.f22316k = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw C4021pz0.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        long j8 = this.f22320o;
        long j9 = this.f22318m;
        if (j8 - j9 < 8) {
            return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48) | ((zza() & 255) << 56);
        }
        this.f22318m = 8 + j9;
        long jI = MA0.i(j9) & 255;
        long jI2 = (MA0.i(1 + j9) & 255) << 8;
        long jI3 = (MA0.i(j9 + 2) & 255) << 16;
        long jI4 = (MA0.i(3 + j9) & 255) << 24;
        long jI5 = (MA0.i(j9 + 4) & 255) << 32;
        return jI5 | jI | jI2 | jI3 | jI4 | ((MA0.i(j9 + 5) & 255) << 40) | ((MA0.i(j9 + 6) & 255) << 48) | ((MA0.i(j9 + 7) & 255) << 56);
    }

    public final long zzr() {
        long j8;
        long j9;
        long j10 = this.f22318m;
        if (this.f22320o != j10) {
            long j11 = j10 + 1;
            byte bI = MA0.i(j10);
            if (bI >= 0) {
                this.f22318m++;
                return bI;
            }
            if (this.f22320o - this.f22318m >= 10) {
                long j12 = 2 + j10;
                int i8 = (MA0.i(j11) << 7) ^ bI;
                if (i8 < 0) {
                    j8 = i8 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int i9 = (MA0.i(j12) << AbstractC5358c.SO) ^ i8;
                    if (i9 >= 0) {
                        j8 = i9 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int i10 = i9 ^ (MA0.i(j13) << AbstractC5358c.NAK);
                        if (i10 < 0) {
                            j8 = (-2080896) ^ i10;
                            j12 = j14;
                        } else {
                            j13 = 5 + j10;
                            long jI = (MA0.i(j14) << 28) ^ i10;
                            if (jI >= 0) {
                                j8 = 266354560 ^ jI;
                            } else {
                                long j15 = 6 + j10;
                                long jI2 = jI ^ (MA0.i(j13) << 35);
                                if (jI2 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    long j16 = 7 + j10;
                                    long jI3 = jI2 ^ (MA0.i(j15) << 42);
                                    if (jI3 >= 0) {
                                        j8 = 4363953127296L ^ jI3;
                                    } else {
                                        j15 = 8 + j10;
                                        jI2 = jI3 ^ (MA0.i(j16) << 49);
                                        if (jI2 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            j16 = 9 + j10;
                                            long jI4 = (jI2 ^ (MA0.i(j15) << 56)) ^ 71499008037633920L;
                                            if (jI4 < 0) {
                                                long j17 = j10 + 10;
                                                if (MA0.i(j16) >= 0) {
                                                    j8 = jI4;
                                                    j12 = j17;
                                                }
                                            } else {
                                                j8 = jI4;
                                            }
                                        }
                                    }
                                    j12 = j16;
                                }
                                j8 = j9 ^ jI2;
                                j12 = j15;
                            }
                        }
                    }
                    j12 = j13;
                }
                this.f22318m = j12;
                return j8;
            }
        }
        return g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final long zzu() {
        return AbstractC4816wy0.zzH(zzr());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final AbstractC3677my0 zzw() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j8 = this.f22320o;
            long j9 = this.f22318m;
            long j10 = iZzj;
            if (j10 <= j8 - j9) {
                byte[] bArr = new byte[iZzj];
                MA0.w(j9, bArr, 0L, j10);
                this.f22318m += j10;
                return new C2993gy0(bArr);
            }
        }
        if (iZzj > 0 && iZzj <= b()) {
            byte[] bArr2 = new byte[iZzj];
            d(bArr2, 0, iZzj);
            return new C2993gy0(bArr2);
        }
        if (iZzj == 0) {
            return AbstractC3677my0.zzb;
        }
        if (iZzj < 0) {
            throw C4021pz0.f();
        }
        throw C4021pz0.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzx() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j8 = this.f22320o;
            long j9 = this.f22318m;
            long j10 = iZzj;
            if (j10 <= j8 - j9) {
                byte[] bArr = new byte[iZzj];
                MA0.w(j9, bArr, 0L, j10);
                String str = new String(bArr, AbstractC3793nz0.f21377b);
                this.f22318m += j10;
                return str;
            }
        }
        if (iZzj > 0 && iZzj <= b()) {
            byte[] bArr2 = new byte[iZzj];
            d(bArr2, 0, iZzj);
            return new String(bArr2, AbstractC3793nz0.f21377b);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw C4021pz0.f();
        }
        throw C4021pz0.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzy() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j8 = this.f22320o;
            long j9 = this.f22318m;
            long j10 = iZzj;
            if (j10 <= j8 - j9) {
                String strG = RA0.g(this.f22312g, (int) (j9 - this.f22319n), iZzj);
                this.f22318m += j10;
                return strG;
            }
        }
        if (iZzj >= 0 && iZzj <= b()) {
            byte[] bArr = new byte[iZzj];
            d(bArr, 0, iZzj);
            return RA0.h(bArr, 0, iZzj);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw C4021pz0.f();
        }
        throw C4021pz0.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final void zzz(int i8) throws C4021pz0 {
        if (this.f22316k != i8) {
            throw C4021pz0.b();
        }
    }
}
