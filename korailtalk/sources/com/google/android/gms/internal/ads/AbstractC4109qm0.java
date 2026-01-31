package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4109qm0 {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zza(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.AbstractC4222rm0.a(r8)
            if (r0 == 0) goto Lbc
            int[] r0 = com.google.android.gms.internal.ads.AbstractC3995pm0.f21804a
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L77;
                case 2: goto L68;
                case 3: goto L57;
                case 4: goto L7e;
                case 5: goto L44;
                case 6: goto L3f;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1c:
            double r2 = java.lang.Math.rint(r8)
            double r6 = r8 - r2
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            goto L7e
        L2b:
            double r2 = java.lang.Math.rint(r8)
            double r6 = r8 - r2
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            double r2 = java.lang.Math.copySign(r4, r8)
            double r2 = r2 + r8
            goto L7f
        L3f:
            double r2 = java.lang.Math.rint(r8)
            goto L7f
        L44:
            boolean r0 = zzb(r8)
            if (r0 == 0) goto L4b
            goto L7e
        L4b:
            long r4 = (long) r8
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L52
            r0 = r1
            goto L53
        L52:
            r0 = -1
        L53:
            long r2 = (long) r0
            long r4 = r4 + r2
            double r2 = (double) r4
            goto L7f
        L57:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7e
            boolean r0 = zzb(r8)
            if (r0 == 0) goto L62
            goto L7e
        L62:
            long r2 = (long) r8
            r4 = 1
        L65:
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L7f
        L68:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7e
            boolean r0 = zzb(r8)
            if (r0 == 0) goto L73
            goto L7e
        L73:
            long r2 = (long) r8
            r4 = -1
            goto L65
        L77:
            boolean r0 = zzb(r8)
            com.google.android.gms.internal.ads.AbstractC4792wm0.b(r0)
        L7e:
            r2 = r8
        L7f:
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = r4 - r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            if (r0 >= 0) goto L8b
            r0 = r1
            goto L8c
        L8b:
            r0 = r4
        L8c:
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L93
            goto L94
        L93:
            r1 = r4
        L94:
            r0 = r0 & r1
            if (r0 == 0) goto L99
            long r8 = (long) r2
            return r8
        L99:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rounded value is out of range for input "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " and rounding mode "
            r1.append(r8)
            r1.append(r10)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lbc:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4109qm0.zza(double, java.math.RoundingMode):long");
    }

    public static boolean zzb(double d9) {
        if (!AbstractC4222rm0.a(d9)) {
            return false;
        }
        if (d9 == 0.0d) {
            return true;
        }
        AbstractC1188Bj0.zzf(AbstractC4222rm0.a(d9), "not a normal value");
        int exponent = Math.getExponent(d9);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d9) & 4503599627370495L;
        return 52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d9);
    }
}
