package P;

import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    String f3577a = "identity";

    /* renamed from: b, reason: collision with root package name */
    static c f3576b = new c();
    public static String[] NAMED_EASING = {g5.e.KEY_SEAT_STANDARD, "accelerate", "decelerate", "linear"};

    public static c getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return f3576b;
        }
    }

    public double getDiff(double d9) {
        return 1.0d;
    }

    public String toString() {
        return this.f3577a;
    }

    static class a extends c {

        /* renamed from: g, reason: collision with root package name */
        private static double f3578g = 0.01d;

        /* renamed from: h, reason: collision with root package name */
        private static double f3579h = 1.0E-4d;

        /* renamed from: c, reason: collision with root package name */
        double f3580c;

        /* renamed from: d, reason: collision with root package name */
        double f3581d;

        /* renamed from: e, reason: collision with root package name */
        double f3582e;

        /* renamed from: f, reason: collision with root package name */
        double f3583f;

        a(String str) {
            this.f3577a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f3580c = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i8 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i8);
            this.f3581d = Double.parseDouble(str.substring(i8, iIndexOf3).trim());
            int i9 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i9);
            this.f3582e = Double.parseDouble(str.substring(i9, iIndexOf4).trim());
            int i10 = iIndexOf4 + 1;
            this.f3583f = Double.parseDouble(str.substring(i10, str.indexOf(41, i10)).trim());
        }

        private double a(double d9) {
            double d10 = 1.0d - d9;
            double d11 = 3.0d * d10;
            return (this.f3580c * d10 * d11 * d9) + (this.f3582e * d11 * d9 * d9) + (d9 * d9 * d9);
        }

        private double b(double d9) {
            double d10 = 1.0d - d9;
            double d11 = 3.0d * d10;
            return (this.f3581d * d10 * d11 * d9) + (this.f3583f * d11 * d9 * d9) + (d9 * d9 * d9);
        }

        void c(double d9, double d10, double d11, double d12) {
            this.f3580c = d9;
            this.f3581d = d10;
            this.f3582e = d11;
            this.f3583f = d12;
        }

        @Override // P.c
        public double get(double d9) {
            if (d9 <= 0.0d) {
                return 0.0d;
            }
            if (d9 >= 1.0d) {
                return 1.0d;
            }
            double d10 = 0.5d;
            double d11 = 0.5d;
            while (d10 > f3578g) {
                d10 *= 0.5d;
                d11 = a(d11) < d9 ? d11 + d10 : d11 - d10;
            }
            double d12 = d11 - d10;
            double dA = a(d12);
            double d13 = d11 + d10;
            double dA2 = a(d13);
            double dB = b(d12);
            return (((b(d13) - dB) * (d9 - dA)) / (dA2 - dA)) + dB;
        }

        @Override // P.c
        public double getDiff(double d9) {
            double d10 = 0.5d;
            double d11 = 0.5d;
            while (d10 > f3579h) {
                d10 *= 0.5d;
                d11 = a(d11) < d9 ? d11 + d10 : d11 - d10;
            }
            double d12 = d11 - d10;
            double d13 = d11 + d10;
            return (b(d13) - b(d12)) / (a(d13) - a(d12));
        }

        public a(double d9, double d10, double d11, double d12) {
            c(d9, d10, d11, d12);
        }
    }

    public double get(double d9) {
        return d9;
    }
}
