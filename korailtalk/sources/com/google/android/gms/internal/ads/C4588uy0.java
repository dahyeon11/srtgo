package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4588uy0 extends AbstractC4816wy0 {

    /* renamed from: e, reason: collision with root package name */
    private final ByteBuffer f23139e;

    /* renamed from: f, reason: collision with root package name */
    private final long f23140f;

    /* renamed from: g, reason: collision with root package name */
    private long f23141g;

    /* renamed from: h, reason: collision with root package name */
    private long f23142h;

    /* renamed from: i, reason: collision with root package name */
    private final long f23143i;

    /* renamed from: j, reason: collision with root package name */
    private int f23144j;

    /* renamed from: k, reason: collision with root package name */
    private int f23145k;

    /* renamed from: l, reason: collision with root package name */
    private int f23146l;

    /* synthetic */ C4588uy0(ByteBuffer byteBuffer, boolean z8, AbstractC4474ty0 abstractC4474ty0) {
        super(null);
        this.f23146l = Integer.MAX_VALUE;
        this.f23139e = byteBuffer;
        long jM = MA0.m(byteBuffer);
        this.f23140f = jM;
        this.f23141g = byteBuffer.limit() + jM;
        long jPosition = jM + byteBuffer.position();
        this.f23142h = jPosition;
        this.f23143i = jPosition;
    }

    private final int b() {
        return (int) (this.f23141g - this.f23142h);
    }

    private final void c() {
        long j8 = this.f23141g + this.f23144j;
        this.f23141g = j8;
        int i8 = (int) (j8 - this.f23143i);
        int i9 = this.f23146l;
        if (i8 <= i9) {
            this.f23144j = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f23144j = i10;
        this.f23141g = j8 - i10;
    }

    final long d() throws C4021pz0 {
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
        this.f23146l = i8;
        c();
    }

    public final void zzB(int i8) throws C4021pz0 {
        if (i8 >= 0 && i8 <= b()) {
            this.f23142h += i8;
        } else {
            if (i8 >= 0) {
                throw C4021pz0.i();
            }
            throw C4021pz0.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzC() {
        return this.f23142h == this.f23141g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzE(int i8) throws C4021pz0 {
        int iZzm;
        int i9 = i8 & 7;
        int i10 = 0;
        if (i9 == 0) {
            if (b() < 10) {
                while (i10 < 10) {
                    if (zza() < 0) {
                        i10++;
                    }
                }
                throw C4021pz0.e();
            }
            while (i10 < 10) {
                long j8 = this.f23142h;
                this.f23142h = 1 + j8;
                if (MA0.i(j8) < 0) {
                    i10++;
                }
            }
            throw C4021pz0.e();
            return true;
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
        long j8 = this.f23142h;
        if (j8 == this.f23141g) {
            throw C4021pz0.i();
        }
        this.f23142h = 1 + j8;
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
        return (int) (this.f23142h - this.f23143i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zze(int i8) throws C4021pz0 {
        if (i8 < 0) {
            throw C4021pz0.f();
        }
        int iZzd = i8 + zzd();
        int i9 = this.f23146l;
        if (iZzd > i9) {
            throw C4021pz0.i();
        }
        this.f23146l = iZzd;
        c();
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

    public final int zzi() throws C4021pz0 {
        long j8 = this.f23142h;
        if (this.f23141g - j8 < 4) {
            throw C4021pz0.i();
        }
        this.f23142h = 4 + j8;
        int i8 = MA0.i(j8) & 255;
        int i9 = MA0.i(1 + j8) & 255;
        int i10 = MA0.i(2 + j8) & 255;
        return ((MA0.i(j8 + 3) & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.MA0.i(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() {
        /*
            r9 = this;
            long r0 = r9.f23142h
            long r2 = r9.f23141g
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.MA0.i(r0)
            if (r4 < 0) goto L16
            r9.f23142h = r2
            return r4
        L16:
            long r5 = r9.f23141g
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.MA0.i(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.MA0.i(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.MA0.i(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.MA0.i(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.MA0.i(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.MA0.i(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.MA0.i(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.MA0.i(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.MA0.i(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.f23142h = r5
            return r0
        L92:
            long r0 = r9.d()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4588uy0.zzj():int");
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
            this.f23145k = 0;
            return 0;
        }
        int iZzj = zzj();
        this.f23145k = iZzj;
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

    public final long zzq() throws C4021pz0 {
        long j8 = this.f23142h;
        if (this.f23141g - j8 < 8) {
            throw C4021pz0.i();
        }
        this.f23142h = 8 + j8;
        long jI = MA0.i(j8);
        long jI2 = MA0.i(1 + j8);
        long jI3 = MA0.i(2 + j8);
        long jI4 = MA0.i(3 + j8);
        long jI5 = MA0.i(4 + j8);
        return ((MA0.i(j8 + 7) & 255) << 56) | (jI & 255) | ((jI2 & 255) << 8) | ((jI3 & 255) << 16) | ((jI4 & 255) << 24) | ((jI5 & 255) << 32) | ((MA0.i(5 + j8) & 255) << 40) | ((MA0.i(6 + j8) & 255) << 48);
    }

    public final long zzr() {
        long j8;
        long j9;
        int i8;
        long j10 = this.f23142h;
        if (this.f23141g != j10) {
            long j11 = 1 + j10;
            byte bI = MA0.i(j10);
            if (bI >= 0) {
                this.f23142h = j11;
                return bI;
            }
            if (this.f23141g - j11 >= 9) {
                long j12 = 2 + j10;
                int i9 = (MA0.i(j11) << 7) ^ bI;
                if (i9 >= 0) {
                    long j13 = 3 + j10;
                    int i10 = i9 ^ (MA0.i(j12) << AbstractC5358c.SO);
                    if (i10 >= 0) {
                        j8 = i10 ^ 16256;
                    } else {
                        j12 = 4 + j10;
                        int i11 = i10 ^ (MA0.i(j13) << AbstractC5358c.NAK);
                        if (i11 < 0) {
                            i8 = (-2080896) ^ i11;
                        } else {
                            j13 = 5 + j10;
                            long jI = (MA0.i(j12) << 28) ^ i11;
                            if (jI < 0) {
                                long j14 = 6 + j10;
                                long jI2 = (MA0.i(j13) << 35) ^ jI;
                                if (jI2 >= 0) {
                                    j12 = j10 + 7;
                                    long jI3 = jI2 ^ (MA0.i(j14) << 42);
                                    if (jI3 >= 0) {
                                        j8 = 4363953127296L ^ jI3;
                                    } else {
                                        j14 = 8 + j10;
                                        jI2 = jI3 ^ (MA0.i(j12) << 49);
                                        if (jI2 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            j12 = j10 + 9;
                                            long jI4 = (jI2 ^ (MA0.i(j14) << 56)) ^ 71499008037633920L;
                                            if (jI4 < 0) {
                                                long j15 = j10 + 10;
                                                if (MA0.i(j12) >= 0) {
                                                    j12 = j15;
                                                }
                                            }
                                            j8 = jI4;
                                        }
                                    }
                                    this.f23142h = j12;
                                    return j8;
                                }
                                j9 = -34093383808L;
                                j8 = j9 ^ jI2;
                                j12 = j14;
                                this.f23142h = j12;
                                return j8;
                            }
                            j8 = 266354560 ^ jI;
                        }
                    }
                    j12 = j13;
                    this.f23142h = j12;
                    return j8;
                }
                i8 = i9 ^ (-128);
                j8 = i8;
                this.f23142h = j12;
                return j8;
            }
        }
        return d();
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
        if (iZzj <= 0 || iZzj > b()) {
            if (iZzj == 0) {
                return AbstractC3677my0.zzb;
            }
            if (iZzj < 0) {
                throw C4021pz0.f();
            }
            throw C4021pz0.i();
        }
        byte[] bArr = new byte[iZzj];
        long j8 = iZzj;
        MA0.w(this.f23142h, bArr, 0L, j8);
        this.f23142h += j8;
        return new C2993gy0(bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzx() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj <= 0 || iZzj > b()) {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw C4021pz0.f();
            }
            throw C4021pz0.i();
        }
        byte[] bArr = new byte[iZzj];
        long j8 = iZzj;
        MA0.w(this.f23142h, bArr, 0L, j8);
        String str = new String(bArr, AbstractC3793nz0.f21377b);
        this.f23142h += j8;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzy() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj > 0 && iZzj <= b()) {
            String strG = RA0.g(this.f23139e, (int) (this.f23142h - this.f23140f), iZzj);
            this.f23142h += iZzj;
            return strG;
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
        if (this.f23145k != i8) {
            throw C4021pz0.b();
        }
    }
}
