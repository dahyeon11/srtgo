package P;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private double[] f3584a;

    /* renamed from: b, reason: collision with root package name */
    private double[][] f3585b;

    /* renamed from: c, reason: collision with root package name */
    private double f3586c;

    public d(double[] dArr, double[][] dArr2) {
        this.f3586c = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f3584a = dArr;
        this.f3585b = dArr2;
        if (length2 <= 2) {
            return;
        }
        int i8 = 0;
        double d9 = 0.0d;
        while (true) {
            double d10 = d9;
            if (i8 >= dArr.length) {
                this.f3586c = 0.0d;
                return;
            }
            double d11 = dArr2[i8][0];
            if (i8 > 0) {
                Math.hypot(d11 - d9, d11 - d10);
            }
            i8++;
            d9 = d11;
        }
    }

    @Override // P.b
    public void getPos(double d9, double[] dArr) {
        double[] dArr2 = this.f3584a;
        int length = dArr2.length;
        int i8 = 0;
        int length2 = this.f3585b[0].length;
        if (d9 <= dArr2[0]) {
            for (int i9 = 0; i9 < length2; i9++) {
                dArr[i9] = this.f3585b[0][i9];
            }
            return;
        }
        int i10 = length - 1;
        if (d9 >= dArr2[i10]) {
            while (i8 < length2) {
                dArr[i8] = this.f3585b[i10][i8];
                i8++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            if (d9 == this.f3584a[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f3585b[i11][i12];
                }
            }
            double[] dArr3 = this.f3584a;
            int i13 = i11 + 1;
            double d10 = dArr3[i13];
            if (d9 < d10) {
                double d11 = dArr3[i11];
                double d12 = (d9 - d11) / (d10 - d11);
                while (i8 < length2) {
                    double[][] dArr4 = this.f3585b;
                    dArr[i8] = (dArr4[i11][i8] * (1.0d - d12)) + (dArr4[i13][i8] * d12);
                    i8++;
                }
                return;
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
  0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // P.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getSlope(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f3584a
            int r1 = r0.length
            double[][] r2 = r12.f3585b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f3584a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f3585b
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.d.getSlope(double, double[]):void");
    }

    @Override // P.b
    public double[] getTimePoints() {
        return this.f3584a;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
  0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // P.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getSlope(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f3584a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f3584a
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f3585b
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P.d.getSlope(double, int):double");
    }

    @Override // P.b
    public void getPos(double d9, float[] fArr) {
        double[] dArr = this.f3584a;
        int length = dArr.length;
        int i8 = 0;
        int length2 = this.f3585b[0].length;
        if (d9 <= dArr[0]) {
            for (int i9 = 0; i9 < length2; i9++) {
                fArr[i9] = (float) this.f3585b[0][i9];
            }
            return;
        }
        int i10 = length - 1;
        if (d9 >= dArr[i10]) {
            while (i8 < length2) {
                fArr[i8] = (float) this.f3585b[i10][i8];
                i8++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            if (d9 == this.f3584a[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f3585b[i11][i12];
                }
            }
            double[] dArr2 = this.f3584a;
            int i13 = i11 + 1;
            double d10 = dArr2[i13];
            if (d9 < d10) {
                double d11 = dArr2[i11];
                double d12 = (d9 - d11) / (d10 - d11);
                while (i8 < length2) {
                    double[][] dArr3 = this.f3585b;
                    fArr[i8] = (float) ((dArr3[i11][i8] * (1.0d - d12)) + (dArr3[i13][i8] * d12));
                    i8++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // P.b
    public double getPos(double d9, int i8) {
        double[] dArr = this.f3584a;
        int length = dArr.length;
        int i9 = 0;
        if (d9 <= dArr[0]) {
            return this.f3585b[0][i8];
        }
        int i10 = length - 1;
        if (d9 >= dArr[i10]) {
            return this.f3585b[i10][i8];
        }
        while (i9 < i10) {
            double[] dArr2 = this.f3584a;
            double d10 = dArr2[i9];
            if (d9 == d10) {
                return this.f3585b[i9][i8];
            }
            int i11 = i9 + 1;
            double d11 = dArr2[i11];
            if (d9 < d11) {
                double d12 = (d9 - d10) / (d11 - d10);
                double[][] dArr3 = this.f3585b;
                return (dArr3[i9][i8] * (1.0d - d12)) + (dArr3[i11][i8] * d12);
            }
            i9 = i11;
        }
        return 0.0d;
    }
}
