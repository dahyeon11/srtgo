package P;

import java.util.Arrays;

/* loaded from: classes.dex */
class a extends b {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;

    /* renamed from: a, reason: collision with root package name */
    private final double[] f3553a;

    /* renamed from: b, reason: collision with root package name */
    C0063a[] f3554b;

    /* renamed from: P.a$a, reason: collision with other inner class name */
    private static class C0063a {

        /* renamed from: s, reason: collision with root package name */
        private static double[] f3555s = new double[91];

        /* renamed from: a, reason: collision with root package name */
        double[] f3556a;

        /* renamed from: b, reason: collision with root package name */
        double f3557b;

        /* renamed from: c, reason: collision with root package name */
        double f3558c;

        /* renamed from: d, reason: collision with root package name */
        double f3559d;

        /* renamed from: e, reason: collision with root package name */
        double f3560e;

        /* renamed from: f, reason: collision with root package name */
        double f3561f;

        /* renamed from: g, reason: collision with root package name */
        double f3562g;

        /* renamed from: h, reason: collision with root package name */
        double f3563h;

        /* renamed from: i, reason: collision with root package name */
        double f3564i;

        /* renamed from: j, reason: collision with root package name */
        double f3565j;

        /* renamed from: k, reason: collision with root package name */
        double f3566k;

        /* renamed from: l, reason: collision with root package name */
        double f3567l;

        /* renamed from: m, reason: collision with root package name */
        double f3568m;

        /* renamed from: n, reason: collision with root package name */
        double f3569n;

        /* renamed from: o, reason: collision with root package name */
        double f3570o;

        /* renamed from: p, reason: collision with root package name */
        double f3571p;

        /* renamed from: q, reason: collision with root package name */
        boolean f3572q;

        /* renamed from: r, reason: collision with root package name */
        boolean f3573r;

        C0063a(int i8, double d9, double d10, double d11, double d12, double d13, double d14) {
            this.f3573r = false;
            this.f3572q = i8 == 1;
            this.f3558c = d9;
            this.f3559d = d10;
            this.f3564i = 1.0d / (d10 - d9);
            if (3 == i8) {
                this.f3573r = true;
            }
            double d15 = d13 - d11;
            double d16 = d14 - d12;
            if (!this.f3573r && Math.abs(d15) >= 0.001d && Math.abs(d16) >= 0.001d) {
                this.f3556a = new double[101];
                boolean z8 = this.f3572q;
                this.f3565j = d15 * (z8 ? -1 : 1);
                this.f3566k = d16 * (z8 ? 1 : -1);
                this.f3567l = z8 ? d13 : d11;
                this.f3568m = z8 ? d12 : d14;
                a(d11, d12, d13, d14);
                this.f3569n = this.f3557b * this.f3564i;
                return;
            }
            this.f3573r = true;
            this.f3560e = d11;
            this.f3561f = d13;
            this.f3562g = d12;
            this.f3563h = d14;
            double dHypot = Math.hypot(d16, d15);
            this.f3557b = dHypot;
            this.f3569n = dHypot * this.f3564i;
            double d17 = this.f3559d;
            double d18 = this.f3558c;
            this.f3567l = d15 / (d17 - d18);
            this.f3568m = d16 / (d17 - d18);
        }

        private void a(double d9, double d10, double d11, double d12) {
            double dHypot;
            double d13 = d11 - d9;
            double d14 = d10 - d12;
            int i8 = 0;
            double d15 = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                if (i8 >= f3555s.length) {
                    break;
                }
                double d18 = d15;
                double radians = Math.toRadians((i8 * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d13;
                double dCos = Math.cos(radians) * d14;
                if (i8 > 0) {
                    dHypot = Math.hypot(dSin - d16, dCos - d17) + d18;
                    f3555s[i8] = dHypot;
                } else {
                    dHypot = d18;
                }
                i8++;
                d17 = dCos;
                d15 = dHypot;
                d16 = dSin;
            }
            double d19 = d15;
            this.f3557b = d19;
            int i9 = 0;
            while (true) {
                double[] dArr = f3555s;
                if (i9 >= dArr.length) {
                    break;
                }
                dArr[i9] = dArr[i9] / d19;
                i9++;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.f3556a.length) {
                    return;
                }
                double length = i10 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(f3555s, length);
                if (iBinarySearch >= 0) {
                    this.f3556a[i10] = iBinarySearch / (f3555s.length - 1);
                } else if (iBinarySearch == -1) {
                    this.f3556a[i10] = 0.0d;
                } else {
                    int i11 = -iBinarySearch;
                    int i12 = i11 - 2;
                    double[] dArr2 = f3555s;
                    double d20 = dArr2[i12];
                    this.f3556a[i10] = (i12 + ((length - d20) / (dArr2[i11 - 1] - d20))) / (dArr2.length - 1);
                }
                i10++;
            }
        }

        double b() {
            double d9 = this.f3565j * this.f3571p;
            double dHypot = this.f3569n / Math.hypot(d9, (-this.f3566k) * this.f3570o);
            if (this.f3572q) {
                d9 = -d9;
            }
            return d9 * dHypot;
        }

        double c() {
            double d9 = this.f3565j * this.f3571p;
            double d10 = (-this.f3566k) * this.f3570o;
            double dHypot = this.f3569n / Math.hypot(d9, d10);
            return this.f3572q ? (-d10) * dHypot : d10 * dHypot;
        }

        double d() {
            return this.f3567l + (this.f3565j * this.f3570o);
        }

        double e() {
            return this.f3568m + (this.f3566k * this.f3571p);
        }

        double f(double d9) {
            if (d9 <= 0.0d) {
                return 0.0d;
            }
            if (d9 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f3556a;
            double length = d9 * (dArr.length - 1);
            int i8 = (int) length;
            double d10 = length - i8;
            double d11 = dArr[i8];
            return d11 + (d10 * (dArr[i8 + 1] - d11));
        }

        void g(double d9) {
            double dF = f((this.f3572q ? this.f3559d - d9 : d9 - this.f3558c) * this.f3564i) * 1.5707963267948966d;
            this.f3570o = Math.sin(dF);
            this.f3571p = Math.cos(dF);
        }

        public double getLinearDX(double d9) {
            return this.f3567l;
        }

        public double getLinearDY(double d9) {
            return this.f3568m;
        }

        public double getLinearX(double d9) {
            double d10 = (d9 - this.f3558c) * this.f3564i;
            double d11 = this.f3560e;
            return d11 + (d10 * (this.f3561f - d11));
        }

        public double getLinearY(double d9) {
            double d10 = (d9 - this.f3558c) * this.f3564i;
            double d11 = this.f3562g;
            return d11 + (d10 * (this.f3563h - d11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f3553a = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            P.a$a[] r2 = new P.a.C0063a[r2]
            r0.f3554b = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            P.a$a[] r7 = r0.f3554b
            int r8 = r7.length
            if (r4 >= r8) goto L4f
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2f
            if (r8 == r3) goto L2d
            r10 = 2
            if (r8 == r10) goto L2b
            if (r8 == r9) goto L26
            goto L30
        L26:
            if (r5 != r3) goto L2d
            goto L2b
        L29:
            r6 = r5
            goto L30
        L2b:
            r5 = r10
            goto L29
        L2d:
            r5 = r3
            goto L29
        L2f:
            r6 = r9
        L30:
            P.a$a r22 = new P.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L14
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.a.<init>(int[], double[], double[][]):void");
    }

    @Override // P.b
    public void getPos(double d9, double[] dArr) {
        C0063a[] c0063aArr = this.f3554b;
        double d10 = c0063aArr[0].f3558c;
        if (d9 < d10) {
            d9 = d10;
        }
        if (d9 > c0063aArr[c0063aArr.length - 1].f3559d) {
            d9 = c0063aArr[c0063aArr.length - 1].f3559d;
        }
        int i8 = 0;
        while (true) {
            C0063a[] c0063aArr2 = this.f3554b;
            if (i8 >= c0063aArr2.length) {
                return;
            }
            C0063a c0063a = c0063aArr2[i8];
            if (d9 <= c0063a.f3559d) {
                if (c0063a.f3573r) {
                    dArr[0] = c0063a.getLinearX(d9);
                    dArr[1] = this.f3554b[i8].getLinearY(d9);
                    return;
                } else {
                    c0063a.g(d9);
                    dArr[0] = this.f3554b[i8].d();
                    dArr[1] = this.f3554b[i8].e();
                    return;
                }
            }
            i8++;
        }
    }

    @Override // P.b
    public void getSlope(double d9, double[] dArr) {
        C0063a[] c0063aArr = this.f3554b;
        double d10 = c0063aArr[0].f3558c;
        if (d9 < d10) {
            d9 = d10;
        } else if (d9 > c0063aArr[c0063aArr.length - 1].f3559d) {
            d9 = c0063aArr[c0063aArr.length - 1].f3559d;
        }
        int i8 = 0;
        while (true) {
            C0063a[] c0063aArr2 = this.f3554b;
            if (i8 >= c0063aArr2.length) {
                return;
            }
            C0063a c0063a = c0063aArr2[i8];
            if (d9 <= c0063a.f3559d) {
                if (c0063a.f3573r) {
                    dArr[0] = c0063a.getLinearDX(d9);
                    dArr[1] = this.f3554b[i8].getLinearDY(d9);
                    return;
                } else {
                    c0063a.g(d9);
                    dArr[0] = this.f3554b[i8].b();
                    dArr[1] = this.f3554b[i8].c();
                    return;
                }
            }
            i8++;
        }
    }

    @Override // P.b
    public double[] getTimePoints() {
        return this.f3553a;
    }

    @Override // P.b
    public void getPos(double d9, float[] fArr) {
        C0063a[] c0063aArr = this.f3554b;
        double d10 = c0063aArr[0].f3558c;
        if (d9 < d10) {
            d9 = d10;
        } else if (d9 > c0063aArr[c0063aArr.length - 1].f3559d) {
            d9 = c0063aArr[c0063aArr.length - 1].f3559d;
        }
        int i8 = 0;
        while (true) {
            C0063a[] c0063aArr2 = this.f3554b;
            if (i8 >= c0063aArr2.length) {
                return;
            }
            C0063a c0063a = c0063aArr2[i8];
            if (d9 <= c0063a.f3559d) {
                if (c0063a.f3573r) {
                    fArr[0] = (float) c0063a.getLinearX(d9);
                    fArr[1] = (float) this.f3554b[i8].getLinearY(d9);
                    return;
                } else {
                    c0063a.g(d9);
                    fArr[0] = (float) this.f3554b[i8].d();
                    fArr[1] = (float) this.f3554b[i8].e();
                    return;
                }
            }
            i8++;
        }
    }

    @Override // P.b
    public double getSlope(double d9, int i8) {
        C0063a[] c0063aArr = this.f3554b;
        int i9 = 0;
        double d10 = c0063aArr[0].f3558c;
        if (d9 < d10) {
            d9 = d10;
        }
        if (d9 > c0063aArr[c0063aArr.length - 1].f3559d) {
            d9 = c0063aArr[c0063aArr.length - 1].f3559d;
        }
        while (true) {
            C0063a[] c0063aArr2 = this.f3554b;
            if (i9 >= c0063aArr2.length) {
                return Double.NaN;
            }
            C0063a c0063a = c0063aArr2[i9];
            if (d9 <= c0063a.f3559d) {
                if (c0063a.f3573r) {
                    if (i8 == 0) {
                        return c0063a.getLinearDX(d9);
                    }
                    return c0063a.getLinearDY(d9);
                }
                c0063a.g(d9);
                if (i8 == 0) {
                    return this.f3554b[i9].b();
                }
                return this.f3554b[i9].c();
            }
            i9++;
        }
    }

    @Override // P.b
    public double getPos(double d9, int i8) {
        C0063a[] c0063aArr = this.f3554b;
        int i9 = 0;
        double d10 = c0063aArr[0].f3558c;
        if (d9 < d10) {
            d9 = d10;
        } else if (d9 > c0063aArr[c0063aArr.length - 1].f3559d) {
            d9 = c0063aArr[c0063aArr.length - 1].f3559d;
        }
        while (true) {
            C0063a[] c0063aArr2 = this.f3554b;
            if (i9 >= c0063aArr2.length) {
                return Double.NaN;
            }
            C0063a c0063a = c0063aArr2[i9];
            if (d9 <= c0063a.f3559d) {
                if (c0063a.f3573r) {
                    if (i8 == 0) {
                        return c0063a.getLinearX(d9);
                    }
                    return c0063a.getLinearY(d9);
                }
                c0063a.g(d9);
                if (i8 == 0) {
                    return this.f3554b[i9].d();
                }
                return this.f3554b[i9].e();
            }
            i9++;
        }
    }
}
