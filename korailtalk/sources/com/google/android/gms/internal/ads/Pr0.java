package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class Pr0 {
    private static long a(byte[] bArr, int i8, int i9) {
        return (b(bArr, i8) >> i9) & 67108863;
    }

    private static long b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return (((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16)) & 4294967295L;
    }

    private static void c(byte[] bArr, long j8, int i8) {
        for (int i9 = 0; i9 < 4; i9++) {
            bArr[i8 + i9] = (byte) (255 & j8);
            j8 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jA = a(bArr, 0, 0);
        long jA2 = a(bArr, 3, 2) & 67108611;
        long jA3 = a(bArr, 6, 4) & 67092735;
        long jA4 = a(bArr, 9, 6) & 66076671;
        long jA5 = a(bArr, 12, 8) & 1048575;
        int i8 = 17;
        byte[] bArr3 = new byte[17];
        long j8 = 0;
        int i9 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            int length = bArr2.length;
            if (i9 >= length) {
                long j13 = j8 + (j9 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j10 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j11 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j12 + ((j17 >> 26) * 5);
                long j20 = j19 & 67108863;
                long j21 = j20 + 5;
                long j22 = (j9 & 67108863) + (j19 >> 26);
                long j23 = j22 + (j21 >> 26);
                long j24 = (j23 >> 26) + j14;
                long j25 = j16 + (j24 >> 26);
                long j26 = (j18 + (j25 >> 26)) - 67108864;
                long j27 = j26 >> 63;
                long j28 = ~j27;
                long j29 = (j22 & j27) | (j23 & 67108863 & j28);
                long j30 = (j14 & j27) | (j24 & 67108863 & j28);
                long j31 = (j16 & j27) | (j25 & 67108863 & j28);
                long j32 = (j18 & j27) | (j26 & j28);
                long jB = (((j27 & j20) | (j21 & 67108863 & j28) | (j29 << 26)) & 4294967295L) + b(bArr, 16);
                long jB2 = (((j29 >> 6) | (j30 << 20)) & 4294967295L) + b(bArr, 20);
                long jB3 = (((j30 >> 12) | (j31 << 14)) & 4294967295L) + b(bArr, 24);
                long jB4 = (((j31 >> 18) | (j32 << 8)) & 4294967295L) + b(bArr, 28);
                byte[] bArr4 = new byte[16];
                c(bArr4, jB & 4294967295L, 0);
                long j33 = jB2 + (jB >> 32);
                c(bArr4, j33 & 4294967295L, 4);
                long j34 = jB3 + (j33 >> 32);
                c(bArr4, j34 & 4294967295L, 8);
                c(bArr4, (jB4 + (j34 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i9);
            System.arraycopy(bArr2, i9, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i8, (byte) 0);
            }
            long j35 = jA5 * 5;
            long j36 = jA4 * 5;
            long j37 = jA3 * 5;
            long jA6 = j12 + a(bArr3, 0, 0);
            long jA7 = j9 + a(bArr3, 3, 2);
            long jA8 = j8 + a(bArr3, 6, 4);
            long jA9 = j10 + a(bArr3, 9, 6);
            long jA10 = j11 + (a(bArr3, 12, 8) | (bArr3[16] << AbstractC5358c.CAN));
            long j38 = jA7 * jA;
            long j39 = jA7 * jA2;
            long j40 = jA7 * jA3;
            long j41 = jA9 * jA;
            long j42 = jA7 * jA4;
            long j43 = jA10 * jA;
            long j44 = (jA6 * jA) + (jA7 * j35) + (jA8 * j36) + (jA9 * j37) + (jA2 * 5 * jA10);
            long j45 = (jA6 * jA2) + j38 + (jA8 * j35) + (jA9 * j36) + (j37 * jA10) + (j44 >> 26);
            long j46 = (jA6 * jA3) + j39 + (jA8 * jA) + (jA9 * j35) + (j36 * jA10) + (j45 >> 26);
            long j47 = (jA6 * jA4) + j40 + (jA8 * jA2) + j41 + (jA10 * j35) + (j46 >> 26);
            long j48 = (jA6 * jA5) + j42 + (jA8 * jA3) + (jA9 * jA2) + j43 + (j47 >> 26);
            long j49 = (j44 & 67108863) + ((j48 >> 26) * 5);
            j9 = (j45 & 67108863) + (j49 >> 26);
            i9 += 16;
            j8 = j46 & 67108863;
            j10 = j47 & 67108863;
            j11 = j48 & 67108863;
            i8 = 17;
            j12 = j49 & 67108863;
        }
    }
}
