package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;

/* loaded from: classes2.dex */
abstract class NA0 {
    static /* bridge */ /* synthetic */ void a(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i8) throws C4021pz0 {
        if (g(b10) || (((b9 << AbstractC5358c.FS) + (b10 + 112)) >> 30) != 0 || g(b11) || g(b12)) {
            throw C4021pz0.d();
        }
        int i9 = ((b9 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
        cArr[i8] = (char) ((i9 >>> 10) + 55232);
        cArr[i8 + 1] = (char) ((i9 & 1023) + 56320);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void b(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.ads.C4021pz0 {
        /*
            boolean r0 = g(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = g(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.ads.pz0 r2 = com.google.android.gms.internal.ads.C4021pz0.d()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.NA0.b(byte, byte, byte, char[], int):void");
    }

    static /* bridge */ /* synthetic */ void c(byte b9, byte b10, char[] cArr, int i8) throws C4021pz0 {
        if (b9 < -62 || g(b10)) {
            throw C4021pz0.d();
        }
        cArr[i8] = (char) (((b9 & AbstractC5358c.US) << 6) | (b10 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b9) {
        return b9 >= 0;
    }

    static /* bridge */ /* synthetic */ boolean e(byte b9) {
        return b9 < -16;
    }

    static /* bridge */ /* synthetic */ boolean f(byte b9) {
        return b9 < -32;
    }

    private static boolean g(byte b9) {
        return b9 > -65;
    }
}
