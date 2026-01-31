package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4360sy0 extends AbstractC4816wy0 {

    /* renamed from: e, reason: collision with root package name */
    private final InputStream f22755e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f22756f;

    /* renamed from: g, reason: collision with root package name */
    private int f22757g;

    /* renamed from: h, reason: collision with root package name */
    private int f22758h;

    /* renamed from: i, reason: collision with root package name */
    private int f22759i;

    /* renamed from: j, reason: collision with root package name */
    private int f22760j;

    /* renamed from: k, reason: collision with root package name */
    private int f22761k;

    /* renamed from: l, reason: collision with root package name */
    private int f22762l;

    /* synthetic */ C4360sy0(InputStream inputStream, int i8, AbstractC4246ry0 abstractC4246ry0) {
        super(null);
        this.f22762l = Integer.MAX_VALUE;
        byte[] bArr = AbstractC3793nz0.zzd;
        this.f22755e = inputStream;
        this.f22756f = new byte[4096];
        this.f22757g = 0;
        this.f22759i = 0;
        this.f22761k = 0;
    }

    private final List b(int i8) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i8 > 0) {
            int iMin = Math.min(i8, 4096);
            byte[] bArr = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = this.f22755e.read(bArr, i9, iMin - i9);
                if (i10 == -1) {
                    throw C4021pz0.i();
                }
                this.f22761k += i10;
                i9 += i10;
            }
            i8 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void c() {
        int i8 = this.f22757g + this.f22758h;
        this.f22757g = i8;
        int i9 = this.f22761k + i8;
        int i10 = this.f22762l;
        if (i9 <= i10) {
            this.f22758h = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f22758h = i11;
        this.f22757g = i8 - i11;
    }

    private final void d(int i8) throws C4021pz0 {
        if (e(i8)) {
            return;
        }
        if (i8 <= (Integer.MAX_VALUE - this.f22761k) - this.f22759i) {
            throw C4021pz0.i();
        }
        throw C4021pz0.h();
    }

    private final boolean e(int i8) throws IOException {
        int i9 = this.f22759i;
        int i10 = i9 + i8;
        int i11 = this.f22757g;
        if (i10 <= i11) {
            throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
        }
        int i12 = this.f22761k;
        if (i8 > (Integer.MAX_VALUE - i12) - i9 || i12 + i9 + i8 > this.f22762l) {
            return false;
        }
        if (i9 > 0) {
            if (i11 > i9) {
                byte[] bArr = this.f22756f;
                System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
            }
            i12 = this.f22761k + i9;
            this.f22761k = i12;
            i11 = this.f22757g - i9;
            this.f22757g = i11;
            this.f22759i = 0;
        }
        try {
            int i13 = this.f22755e.read(this.f22756f, i11, Math.min(4096 - i11, (Integer.MAX_VALUE - i12) - i11));
            if (i13 == 0 || i13 < -1 || i13 > 4096) {
                throw new IllegalStateException(String.valueOf(this.f22755e.getClass()) + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
            }
            if (i13 <= 0) {
                return false;
            }
            this.f22757g += i13;
            c();
            if (this.f22757g >= i8) {
                return true;
            }
            return e(i8);
        } catch (C4021pz0 e8) {
            e8.j();
            throw e8;
        }
    }

    private final byte[] f(int i8, boolean z8) throws IOException {
        byte[] bArrG = g(i8);
        if (bArrG != null) {
            return bArrG;
        }
        int i9 = this.f22759i;
        int i10 = this.f22757g;
        int i11 = i10 - i9;
        this.f22761k += i10;
        this.f22759i = 0;
        this.f22757g = 0;
        List<byte[]> listB = b(i8 - i11);
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f22756f, i9, bArr, 0, i11);
        for (byte[] bArr2 : listB) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        return bArr;
    }

    private final byte[] g(int i8) throws IOException {
        if (i8 == 0) {
            return AbstractC3793nz0.zzd;
        }
        int i9 = this.f22761k;
        int i10 = this.f22759i;
        int i11 = i9 + i10 + i8;
        if ((-2147483647) + i11 > 0) {
            throw C4021pz0.h();
        }
        int i12 = this.f22762l;
        if (i11 > i12) {
            zzB((i12 - i9) - i10);
            throw C4021pz0.i();
        }
        int i13 = this.f22757g - i10;
        int i14 = i8 - i13;
        if (i14 >= 4096) {
            try {
                if (i14 > this.f22755e.available()) {
                    return null;
                }
            } catch (C4021pz0 e8) {
                e8.j();
                throw e8;
            }
        }
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f22756f, this.f22759i, bArr, 0, i13);
        this.f22761k += this.f22757g;
        this.f22759i = 0;
        this.f22757g = 0;
        while (i13 < i8) {
            try {
                int i15 = this.f22755e.read(bArr, i13, i8 - i13);
                if (i15 == -1) {
                    throw C4021pz0.i();
                }
                this.f22761k += i15;
                i13 += i15;
            } catch (C4021pz0 e9) {
                e9.j();
                throw e9;
            }
        }
        return bArr;
    }

    final long h() throws C4021pz0 {
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
        this.f22762l = i8;
        c();
    }

    public final void zzB(int i8) throws C4021pz0 {
        int i9 = this.f22757g;
        int i10 = this.f22759i;
        int i11 = i9 - i10;
        if (i8 <= i11 && i8 >= 0) {
            this.f22759i = i10 + i8;
            return;
        }
        if (i8 < 0) {
            throw C4021pz0.f();
        }
        int i12 = this.f22761k;
        int i13 = i12 + i10;
        int i14 = this.f22762l;
        if (i13 + i8 > i14) {
            zzB((i14 - i12) - i10);
            throw C4021pz0.i();
        }
        this.f22761k = i13;
        this.f22757g = 0;
        this.f22759i = 0;
        while (i11 < i8) {
            try {
                long j8 = i8 - i11;
                try {
                    long jSkip = this.f22755e.skip(j8);
                    if (jSkip < 0 || jSkip > j8) {
                        throw new IllegalStateException(String.valueOf(this.f22755e.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i11 += (int) jSkip;
                    }
                } catch (C4021pz0 e8) {
                    e8.j();
                    throw e8;
                }
            } catch (Throwable th) {
                this.f22761k += i11;
                c();
                throw th;
            }
        }
        this.f22761k += i11;
        c();
        if (i11 >= i8) {
            return;
        }
        int i15 = this.f22757g;
        int i16 = i15 - this.f22759i;
        this.f22759i = i15;
        d(1);
        while (true) {
            int i17 = i8 - i16;
            int i18 = this.f22757g;
            if (i17 <= i18) {
                this.f22759i = i17;
                return;
            } else {
                i16 += i18;
                this.f22759i = i18;
                d(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final boolean zzC() {
        return this.f22759i == this.f22757g && !e(1);
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
            if (this.f22757g - this.f22759i < 10) {
                while (i10 < 10) {
                    if (zza() < 0) {
                        i10++;
                    }
                }
                throw C4021pz0.e();
            }
            while (i10 < 10) {
                byte[] bArr = this.f22756f;
                int i11 = this.f22759i;
                this.f22759i = i11 + 1;
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
        if (this.f22759i == this.f22757g) {
            d(1);
        }
        byte[] bArr = this.f22756f;
        int i8 = this.f22759i;
        this.f22759i = i8 + 1;
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
        return this.f22761k + this.f22759i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final int zze(int i8) throws C4021pz0 {
        if (i8 < 0) {
            throw C4021pz0.f();
        }
        int i9 = this.f22761k + this.f22759i;
        int i10 = this.f22762l;
        int i11 = i8 + i9;
        if (i11 > i10) {
            throw C4021pz0.i();
        }
        this.f22762l = i11;
        c();
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
        int i8 = this.f22759i;
        if (this.f22757g - i8 < 4) {
            d(4);
            i8 = this.f22759i;
        }
        byte[] bArr = this.f22756f;
        this.f22759i = i8 + 4;
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public final int zzj() {
        int i8;
        int i9 = this.f22759i;
        int i10 = this.f22757g;
        if (i10 != i9) {
            byte[] bArr = this.f22756f;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f22759i = i11;
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
                this.f22759i = i12;
                return i8;
            }
        }
        return (int) h();
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
            this.f22760j = 0;
            return 0;
        }
        int iZzj = zzj();
        this.f22760j = iZzj;
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
        int i8 = this.f22759i;
        if (this.f22757g - i8 < 8) {
            d(8);
            i8 = this.f22759i;
        }
        byte[] bArr = this.f22756f;
        this.f22759i = i8 + 8;
        long j8 = bArr[i8];
        long j9 = bArr[i8 + 2];
        long j10 = bArr[i8 + 3];
        return ((bArr[i8 + 7] & 255) << 56) | (j8 & 255) | ((bArr[i8 + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j8;
        long j9;
        int i8 = this.f22759i;
        int i9 = this.f22757g;
        if (i9 != i8) {
            byte[] bArr = this.f22756f;
            int i10 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                this.f22759i = i10;
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
                this.f22759i = i11;
                return j8;
            }
        }
        return h();
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
    public final AbstractC3677my0 zzw() throws IOException {
        int iZzj = zzj();
        int i8 = this.f22757g;
        int i9 = this.f22759i;
        if (iZzj <= i8 - i9 && iZzj > 0) {
            AbstractC3677my0 abstractC3677my0Zzv = AbstractC3677my0.zzv(this.f22756f, i9, iZzj);
            this.f22759i += iZzj;
            return abstractC3677my0Zzv;
        }
        if (iZzj == 0) {
            return AbstractC3677my0.zzb;
        }
        if (iZzj < 0) {
            throw C4021pz0.f();
        }
        byte[] bArrG = g(iZzj);
        if (bArrG != null) {
            return AbstractC3677my0.zzv(bArrG, 0, bArrG.length);
        }
        int i10 = this.f22759i;
        int i11 = this.f22757g;
        int i12 = i11 - i10;
        this.f22761k += i11;
        this.f22759i = 0;
        this.f22757g = 0;
        List<byte[]> listB = b(iZzj - i12);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.f22756f, i10, bArr, 0, i12);
        for (byte[] bArr2 : listB) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return new C2993gy0(bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzx() throws C4021pz0 {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i8 = this.f22757g;
            int i9 = this.f22759i;
            if (iZzj <= i8 - i9) {
                String str = new String(this.f22756f, i9, iZzj, AbstractC3793nz0.f21377b);
                this.f22759i += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw C4021pz0.f();
        }
        if (iZzj > this.f22757g) {
            return new String(f(iZzj, false), AbstractC3793nz0.f21377b);
        }
        d(iZzj);
        String str2 = new String(this.f22756f, this.f22759i, iZzj, AbstractC3793nz0.f21377b);
        this.f22759i += iZzj;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final String zzy() throws IOException {
        byte[] bArrF;
        int iZzj = zzj();
        int i8 = this.f22759i;
        int i9 = this.f22757g;
        if (iZzj <= i9 - i8 && iZzj > 0) {
            bArrF = this.f22756f;
            this.f22759i = i8 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw C4021pz0.f();
            }
            i8 = 0;
            if (iZzj <= i9) {
                d(iZzj);
                bArrF = this.f22756f;
                this.f22759i = iZzj;
            } else {
                bArrF = f(iZzj, false);
            }
        }
        return RA0.h(bArrF, i8, iZzj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4816wy0
    public final void zzz(int i8) throws C4021pz0 {
        if (this.f22760j != i8) {
            throw C4021pz0.b();
        }
    }
}
