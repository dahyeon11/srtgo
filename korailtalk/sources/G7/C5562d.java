package g7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5562d extends C5561c {
    public static final double acosh(double d9) {
        if (d9 < 1.0d) {
            return Double.NaN;
        }
        if (d9 > C5559a.upper_taylor_2_bound) {
            return Math.log(d9) + C5559a.LN2;
        }
        double d10 = 1;
        double d11 = d9 - d10;
        if (d11 >= C5559a.taylor_n_bound) {
            return Math.log(d9 + Math.sqrt((d9 * d9) - d10));
        }
        double dSqrt = Math.sqrt(d11);
        if (dSqrt >= C5559a.taylor_2_bound) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / 12;
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    public static final double asinh(double d9) {
        double d10 = C5559a.taylor_n_bound;
        if (d9 < d10) {
            return d9 <= (-d10) ? -asinh(-d9) : Math.abs(d9) >= C5559a.taylor_2_bound ? d9 - (((d9 * d9) * d9) / 6) : d9;
        }
        if (d9 <= C5559a.upper_taylor_n_bound) {
            return Math.log(d9 + Math.sqrt((d9 * d9) + 1));
        }
        if (d9 > C5559a.upper_taylor_2_bound) {
            return Math.log(d9) + C5559a.LN2;
        }
        double d11 = d9 * 2;
        return Math.log(d11 + (1 / d11));
    }

    public static final double atanh(double d9) {
        if (Math.abs(d9) < C5559a.taylor_n_bound) {
            return Math.abs(d9) > C5559a.taylor_2_bound ? d9 + (((d9 * d9) * d9) / 3) : d9;
        }
        double d10 = 1;
        return Math.log((d10 + d9) / (d10 - d9)) / 2;
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(double d9) {
    }

    public static int getSign(int i8) {
        if (i8 < 0) {
            return -1;
        }
        return i8 > 0 ? 1 : 0;
    }

    public static /* synthetic */ void getSign$annotations(double d9) {
    }

    public static /* synthetic */ void getUlp$annotations(double d9) {
    }

    public static final double log(double d9, double d10) {
        if (d10 <= 0.0d || d10 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d9) / Math.log(d10);
    }

    public static final double log2(double d9) {
        return Math.log(d9) / C5559a.LN2;
    }

    public static int roundToInt(double d9) {
        if (Double.isNaN(d9)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d9 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d9 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d9);
    }

    public static long roundToLong(double d9) {
        if (Double.isNaN(d9)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d9);
    }

    public static final double truncate(double d9) {
        return (Double.isNaN(d9) || Double.isInfinite(d9)) ? d9 : d9 > 0.0d ? Math.floor(d9) : Math.ceil(d9);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f8) {
    }

    public static int getSign(long j8) {
        if (j8 < 0) {
            return -1;
        }
        return j8 > 0 ? 1 : 0;
    }

    public static /* synthetic */ void getSign$annotations(float f8) {
    }

    public static /* synthetic */ void getUlp$annotations(float f8) {
    }

    public static final float log(float f8, float f9) {
        if (f9 <= 0.0f || f9 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f8) / Math.log(f9));
    }

    public static final float log2(float f8) {
        return (float) (Math.log(f8) / C5559a.LN2);
    }

    public static final long roundToLong(float f8) {
        return AbstractC5560b.roundToLong(f8);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i8) {
    }

    public static /* synthetic */ void getSign$annotations(int i8) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j8) {
    }

    public static /* synthetic */ void getSign$annotations(long j8) {
    }

    public static final int roundToInt(float f8) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f8);
    }

    public static final float truncate(float f8) {
        double dCeil;
        if (Float.isNaN(f8) || Float.isInfinite(f8)) {
            return f8;
        }
        if (f8 > 0.0f) {
            dCeil = Math.floor(f8);
        } else {
            dCeil = Math.ceil(f8);
        }
        return (float) dCeil;
    }
}
