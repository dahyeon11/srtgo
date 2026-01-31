package com.google.android.gms.internal.ads;

import com.korail.talk.network.dao.research.CmtrInfoDao;

/* renamed from: com.google.android.gms.internal.ads.vm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4678vm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long[][] f23307a = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zza(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L55
        L10:
            long r8 = r8 ^ r10
            int[] r6 = com.google.android.gms.internal.ads.AbstractC4564um0.f23102a
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            switch(r6) {
                case 1: goto L51;
                case 2: goto L55;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L55
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L55
            goto L4e
        L46:
            if (r9 <= 0) goto L55
            goto L4e
        L49:
            if (r8 <= 0) goto L55
            goto L4e
        L4c:
            if (r8 >= 0) goto L55
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            r8 = 0
            com.google.android.gms.internal.ads.AbstractC4792wm0.b(r8)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4678vm0.zza(long, long, java.math.RoundingMode):long");
    }

    public static long zzb(long j8, long j9) {
        AbstractC4792wm0.a(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A, j8);
        AbstractC4792wm0.a(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B, j9);
        if (j8 == 0) {
            return j9;
        }
        if (j9 == 0) {
            return j8;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long jNumberOfTrailingZeros = j8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j9);
        long j10 = j9 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j10) {
            long j11 = jNumberOfTrailingZeros - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            jNumberOfTrailingZeros = j13 >> Long.numberOfTrailingZeros(j13);
            j10 += j12;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzc(long j8, long j9) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        long j10 = ((j8 ^ j9) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j9 == Long.MIN_VALUE) & (j8 < 0))) {
            return j10;
        }
        long j11 = j8 * j9;
        return (j8 == 0 || j11 / j8 == j9) ? j11 : j10;
    }
}
