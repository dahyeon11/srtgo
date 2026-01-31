package P;

/* loaded from: classes.dex */
public abstract class b {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        double f3574a;

        /* renamed from: b, reason: collision with root package name */
        double[] f3575b;

        a(double d9, double[] dArr) {
            this.f3574a = d9;
            this.f3575b = dArr;
        }

        @Override // P.b
        public void getPos(double d9, double[] dArr) {
            double[] dArr2 = this.f3575b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // P.b
        public void getSlope(double d9, double[] dArr) {
            for (int i8 = 0; i8 < this.f3575b.length; i8++) {
                dArr[i8] = 0.0d;
            }
        }

        @Override // P.b
        public double[] getTimePoints() {
            return new double[]{this.f3574a};
        }

        @Override // P.b
        public void getPos(double d9, float[] fArr) {
            int i8 = 0;
            while (true) {
                double[] dArr = this.f3575b;
                if (i8 >= dArr.length) {
                    return;
                }
                fArr[i8] = (float) dArr[i8];
                i8++;
            }
        }

        @Override // P.b
        public double getSlope(double d9, int i8) {
            return 0.0d;
        }

        @Override // P.b
        public double getPos(double d9, int i8) {
            return this.f3575b[i8];
        }
    }

    public static b get(int i8, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i8 = 2;
        }
        return i8 != 0 ? i8 != 2 ? new d(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new e(dArr, dArr2);
    }

    public static b getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new P.a(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d9, int i8);

    public abstract void getPos(double d9, double[] dArr);

    public abstract void getPos(double d9, float[] fArr);

    public abstract double getSlope(double d9, int i8);

    public abstract void getSlope(double d9, double[] dArr);

    public abstract double[] getTimePoints();
}
