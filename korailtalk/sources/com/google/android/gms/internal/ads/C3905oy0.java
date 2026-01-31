package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.oy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3905oy0 extends AbstractC4816wy0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f21595e;

    /* renamed from: f, reason: collision with root package name */
    private int f21596f;

    /* renamed from: g, reason: collision with root package name */
    private int f21597g;

    /* renamed from: h, reason: collision with root package name */
    private int f21598h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21599i;

    /* renamed from: j, reason: collision with root package name */
    private int f21600j;

    /* renamed from: k, reason: collision with root package name */
    private int f21601k;

    /* synthetic */ C3905oy0(byte[] bArr, int i8, int i9, boolean z8, AbstractC3791ny0 abstractC3791ny0) {
        super(null);
        this.f21601k = Integer.MAX_VALUE;
        this.f21595e = bArr;
        this.f21596f = i9 + i8;
        this.f21598h = i8;
        this.f21599i = i8;
    }

    private final void b() {
        int i8 = this.f21596f + this.f21597g;
        this.f21596f = i8;
        int i9 = i8 - this.f21599i;
        int i10 = this.f21601k;
        if (i9 <= i10) {
            this.f21597g = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f21597g = i11;
        this.f21596f = i8 - i11;
    }

    final long c() throws C4021pz0 {
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
        this.f21601k = i8;
        b();
    }

    public final void zzB(int i8) throws C4021pz0 {
        if (i8 >= 0) {
            int i9 = this.f21596f;
            int i10 = this.f21598h;
            if (i8 <= i9 - i10) {
                this.f21598h = i10 + i8;
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
        return this.f21598h == this.f21596f;
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
            if (this.f21596f - this.f21598h < 10) {
                while (i10 < 10) {
                    if (zza() < 0) {
                        i10++;
                    }
                }
                throw C4021pz0.e();
            }
            while (i10 < 10) {
                byte[] bArr = this.f21595e;
                int i11 = this.f21598h;
                this.f21598h = i11 + 1;
                if (bArr[i11] < 0) {
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
        int i8 = this.f21598h;
        if (i8 == this.f21596f) {
            throw C4021pz0.i();
        }
        byte[] bArr = this.f21595e;
        this.f21598h = i8 + 1;
        return bArr[i8];
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
        return this.f21598h - this.f21599i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zze(int i8) {
        if (i8 < 0) {
            throw C4021pz0.f();
        }
        int i9 = i8 + (this.f21598h - this.f21599i);
        if (i9 < 0) {
            throw C4021pz0.g();
        }
        int i10 = this.f21601k;
        if (i9 > i10) {
            throw C4021pz0.i();
        }
        this.f21601k = i9;
        b();
        return i10;
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
        int i8 = this.f21598h;
        if (this.f21596f - i8 < 4) {
            throw C4021pz0.i();
        }
        byte[] bArr = this.f21595e;
        this.f21598h = i8 + 4;
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public final int zzj() {
        int i8;
        int i9 = this.f21598h;
        int i10 = this.f21596f;
        if (i10 != i9) {
            byte[] bArr = this.f21595e;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f21598h = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    i8 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << AbstractC5358c.SO) ^ i13;
                    if (i15 >= 0) {
                        i8 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << AbstractC5358c.NAK);
                        if (i17 < 0) {
                            i8 = (-2080896) ^ i17;
                        } else {
                            i14 = i9 + 5;
                            byte b10 = bArr[i16];
                            int i18 = (i17 ^ (b10 << AbstractC5358c.FS)) ^ 266354560;
                            if (b10 < 0) {
                                i16 = i9 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i9 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i9 + 9;
                                            if (bArr[i16] < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i19;
                                                    i8 = i18;
                                                }
                                            }
                                        }
                                    }
                                }
                                i8 = i18;
                            }
                            i8 = i18;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.f21598h = i12;
                return i8;
            }
        }
        return (int) c();
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
            this.f21600j = 0;
            return 0;
        }
        int iZzj = zzj();
        this.f21600j = iZzj;
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
        int i8 = this.f21598h;
        if (this.f21596f - i8 < 8) {
            throw C4021pz0.i();
        }
        byte[] bArr = this.f21595e;
        this.f21598h = i8 + 8;
        long j8 = bArr[i8];
        long j9 = bArr[i8 + 2];
        long j10 = bArr[i8 + 3];
        return ((bArr[i8 + 7] & 255) << 56) | (j8 & 255) | ((bArr[i8 + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j8;
        long j9;
        int i8 = this.f21598h;
        int i9 = this.f21596f;
        if (i9 != i8) {
            byte[] bArr = this.f21595e;
            int i10 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                this.f21598h = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    j8 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << AbstractC5358c.SO) ^ i12;
                    if (i14 >= 0) {
                        j8 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << AbstractC5358c.NAK);
                        if (i16 < 0) {
                            long j10 = (-2080896) ^ i16;
                            i11 = i15;
                            j8 = j10;
                        } else {
                            i13 = i8 + 5;
                            long j11 = (bArr[i15] << 28) ^ i16;
                            if (j11 >= 0) {
                                j8 = j11 ^ 266354560;
                            } else {
                                i11 = i8 + 6;
                                long j12 = (bArr[i13] << 35) ^ j11;
                                if (j12 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    int i17 = i8 + 7;
                                    long j13 = j12 ^ (bArr[i11] << 42);
                                    if (j13 >= 0) {
                                        j8 = j13 ^ 4363953127296L;
                                    } else {
                                        i11 = i8 + 8;
                                        j12 = j13 ^ (bArr[i17] << 49);
                                        if (j12 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i17 = i8 + 9;
                                            long j14 = (j12 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                i11 = i8 + 10;
                                                if (bArr[i17] >= 0) {
                                                    j8 = j14;
                                                }
                                            } else {
                                                j8 = j14;
                                            }
                                        }
                                    }
                                    i11 = i17;
                                }
                                j8 = j12 ^ j9;
                            }
                        }
                    }
                    i11 = i13;
                }
                this.f21598h = i11;
                return j8;
            }
        }
        return c();
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
            int i8 = this.f21596f;
            int i9 = this.f21598h;
            if (iZzj <= i8 - i9) {
                AbstractC3677my0 abstractC3677my0Zzv = AbstractC3677my0.zzv(this.f21595e, i9, iZzj);
                this.f21598h += iZzj;
                return abstractC3677my0Zzv;
            }
        }
        if (iZzj == 0) {
            return AbstractC3677my0.zzb;
        }
        if (iZzj > 0) {
            int i10 = this.f21596f;
            int i11 = this.f21598h;
            if (iZzj <= i10 - i11) {
                int i12 = iZzj + i11;
                this.f21598h = i12;
                return new C2993gy0(Arrays.copyOfRange(this.f21595e, i11, i12));
            }
        }
        if (iZzj <= 0) {
            throw C4021pz0.f();
        }
        throw C4021pz0.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzx() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i8 = this.f21596f;
            int i9 = this.f21598h;
            if (iZzj <= i8 - i9) {
                String str = new String(this.f21595e, i9, iZzj, AbstractC3793nz0.f21377b);
                this.f21598h += iZzj;
                return str;
            }
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
            int i8 = this.f21596f;
            int i9 = this.f21598h;
            if (iZzj <= i8 - i9) {
                String strH = RA0.h(this.f21595e, i9, iZzj);
                this.f21598h += iZzj;
                return strH;
            }
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
        if (this.f21600j != i8) {
            throw C4021pz0.b();
        }
    }
}
