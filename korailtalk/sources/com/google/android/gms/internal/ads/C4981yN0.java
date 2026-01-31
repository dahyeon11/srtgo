package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4981yN0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f23919a = new C4099qh0(32);

    /* renamed from: b, reason: collision with root package name */
    private C4867xN0 f23920b;

    /* renamed from: c, reason: collision with root package name */
    private C4867xN0 f23921c;

    /* renamed from: d, reason: collision with root package name */
    private C4867xN0 f23922d;

    /* renamed from: e, reason: collision with root package name */
    private long f23923e;

    /* renamed from: f, reason: collision with root package name */
    private final C2703eP0 f23924f;

    public C4981yN0(C2703eP0 c2703eP0) {
        this.f23924f = c2703eP0;
        C4867xN0 c4867xN0 = new C4867xN0(0L, 65536);
        this.f23920b = c4867xN0;
        this.f23921c = c4867xN0;
        this.f23922d = c4867xN0;
    }

    private final int a(int i8) {
        C4867xN0 c4867xN0 = this.f23922d;
        if (c4867xN0.zzc == null) {
            XO0 xo0Zzb = this.f23924f.zzb();
            C4867xN0 c4867xN02 = new C4867xN0(this.f23922d.zzb, 65536);
            c4867xN0.zzc = xo0Zzb;
            c4867xN0.zzd = c4867xN02;
        }
        return Math.min(i8, (int) (this.f23922d.zzb - this.f23923e));
    }

    private static C4867xN0 b(C4867xN0 c4867xN0, long j8) {
        while (j8 >= c4867xN0.zzb) {
            c4867xN0 = c4867xN0.zzd;
        }
        return c4867xN0;
    }

    private static C4867xN0 c(C4867xN0 c4867xN0, long j8, ByteBuffer byteBuffer, int i8) {
        C4867xN0 c4867xN0B = b(c4867xN0, j8);
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (c4867xN0B.zzb - j8));
            byteBuffer.put(c4867xN0B.zzc.zza, c4867xN0B.zza(j8), iMin);
            i8 -= iMin;
            j8 += iMin;
            if (j8 == c4867xN0B.zzb) {
                c4867xN0B = c4867xN0B.zzd;
            }
        }
        return c4867xN0B;
    }

    private static C4867xN0 d(C4867xN0 c4867xN0, long j8, byte[] bArr, int i8) {
        C4867xN0 c4867xN0B = b(c4867xN0, j8);
        int i9 = i8;
        while (i9 > 0) {
            int iMin = Math.min(i9, (int) (c4867xN0B.zzb - j8));
            System.arraycopy(c4867xN0B.zzc.zza, c4867xN0B.zza(j8), bArr, i8 - i9, iMin);
            i9 -= iMin;
            j8 += iMin;
            if (j8 == c4867xN0B.zzb) {
                c4867xN0B = c4867xN0B.zzd;
            }
        }
        return c4867xN0B;
    }

    private static C4867xN0 e(C4867xN0 c4867xN0, BE0 be0, BN0 bn0, C4099qh0 c4099qh0) {
        C4867xN0 c4867xN0D;
        int iZzq;
        if (be0.zzk()) {
            long j8 = bn0.zzb;
            c4099qh0.zzH(1);
            C4867xN0 c4867xN0D2 = d(c4867xN0, j8, c4099qh0.zzM(), 1);
            long j9 = j8 + 1;
            byte b9 = c4099qh0.zzM()[0];
            int i8 = b9 & 128;
            int i9 = b9 & 127;
            C4963yE0 c4963yE0 = be0.zzb;
            byte[] bArr = c4963yE0.zza;
            if (bArr == null) {
                c4963yE0.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z8 = i8 != 0;
            c4867xN0D = d(c4867xN0D2, j9, c4963yE0.zza, i9);
            long j10 = j9 + i9;
            if (z8) {
                c4099qh0.zzH(2);
                c4867xN0D = d(c4867xN0D, j10, c4099qh0.zzM(), 2);
                j10 += 2;
                iZzq = c4099qh0.zzq();
            } else {
                iZzq = 1;
            }
            int[] iArr = c4963yE0.zzd;
            if (iArr == null || iArr.length < iZzq) {
                iArr = new int[iZzq];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c4963yE0.zze;
            if (iArr3 == null || iArr3.length < iZzq) {
                iArr3 = new int[iZzq];
            }
            int[] iArr4 = iArr3;
            if (z8) {
                int i10 = iZzq * 6;
                c4099qh0.zzH(i10);
                c4867xN0D = d(c4867xN0D, j10, c4099qh0.zzM(), i10);
                j10 += i10;
                c4099qh0.zzK(0);
                for (int i11 = 0; i11 < iZzq; i11++) {
                    iArr2[i11] = c4099qh0.zzq();
                    iArr4[i11] = c4099qh0.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = bn0.zza - ((int) (j10 - bn0.zzb));
            }
            I1 i12 = bn0.zzc;
            int i13 = AbstractC2281am0.zza;
            c4963yE0.zzc(iZzq, iArr2, iArr4, i12.zzb, c4963yE0.zza, i12.zza, i12.zzc, i12.zzd);
            long j11 = bn0.zzb;
            int i14 = (int) (j10 - j11);
            bn0.zzb = j11 + i14;
            bn0.zza -= i14;
        } else {
            c4867xN0D = c4867xN0;
        }
        if (!be0.zze()) {
            be0.zzi(bn0.zza);
            return c(c4867xN0D, bn0.zzb, be0.zzc, bn0.zza);
        }
        c4099qh0.zzH(4);
        C4867xN0 c4867xN0D3 = d(c4867xN0D, bn0.zzb, c4099qh0.zzM(), 4);
        int iZzp = c4099qh0.zzp();
        bn0.zzb += 4;
        bn0.zza -= 4;
        be0.zzi(iZzp);
        C4867xN0 c4867xN0C = c(c4867xN0D3, bn0.zzb, be0.zzc, iZzp);
        bn0.zzb += iZzp;
        int i15 = bn0.zza - iZzp;
        bn0.zza = i15;
        ByteBuffer byteBuffer = be0.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            be0.zzf = ByteBuffer.allocate(i15);
        } else {
            be0.zzf.clear();
        }
        return c(c4867xN0C, bn0.zzb, be0.zzf, bn0.zza);
    }

    private final void f(int i8) {
        long j8 = this.f23923e + i8;
        this.f23923e = j8;
        C4867xN0 c4867xN0 = this.f23922d;
        if (j8 == c4867xN0.zzb) {
            this.f23922d = c4867xN0.zzd;
        }
    }

    public final int zza(UL0 ul0, int i8, boolean z8) throws EOFException {
        int iA = a(i8);
        C4867xN0 c4867xN0 = this.f23922d;
        int iZza = ul0.zza(c4867xN0.zzc.zza, c4867xN0.zza(this.f23923e), iA);
        if (iZza != -1) {
            f(iZza);
            return iZza;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.f23923e;
    }

    public final void zzc(long j8) {
        C4867xN0 c4867xN0;
        if (j8 != -1) {
            while (true) {
                c4867xN0 = this.f23920b;
                if (j8 < c4867xN0.zzb) {
                    break;
                }
                this.f23924f.zzc(c4867xN0.zzc);
                this.f23920b = this.f23920b.zzb();
            }
            if (this.f23921c.zza < c4867xN0.zza) {
                this.f23921c = c4867xN0;
            }
        }
    }

    public final void zzd(BE0 be0, BN0 bn0) {
        e(this.f23921c, be0, bn0, this.f23919a);
    }

    public final void zze(BE0 be0, BN0 bn0) {
        this.f23921c = e(this.f23921c, be0, bn0, this.f23919a);
    }

    public final void zzf() {
        C4867xN0 c4867xN0 = this.f23920b;
        if (c4867xN0.zzc != null) {
            this.f23924f.zzd(c4867xN0);
            c4867xN0.zzb();
        }
        this.f23920b.zze(0L, 65536);
        C4867xN0 c4867xN02 = this.f23920b;
        this.f23921c = c4867xN02;
        this.f23922d = c4867xN02;
        this.f23923e = 0L;
        this.f23924f.zzg();
    }

    public final void zzg() {
        this.f23921c = this.f23920b;
    }

    public final void zzh(C4099qh0 c4099qh0, int i8) {
        while (i8 > 0) {
            int iA = a(i8);
            C4867xN0 c4867xN0 = this.f23922d;
            c4099qh0.zzG(c4867xN0.zzc.zza, c4867xN0.zza(this.f23923e), iA);
            i8 -= iA;
            f(iA);
        }
    }
}
