package X3;

import F3.m;
import W3.r;

/* loaded from: classes2.dex */
public abstract class a extends r {

    /* renamed from: b, reason: collision with root package name */
    private final int[] f5434b;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f5437e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f5438f;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f5433a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f5435c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f5436d = new float[4];

    protected a() {
        int[] iArr = new int[8];
        this.f5434b = iArr;
        this.f5437e = new int[iArr.length / 2];
        this.f5438f = new int[iArr.length / 2];
    }

    protected static void e(int[] iArr, float[] fArr) {
        int i8 = 0;
        float f8 = fArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 < f8) {
                i8 = i9;
                f8 = f9;
            }
        }
        iArr[i8] = iArr[i8] - 1;
    }

    protected static void l(int[] iArr, float[] fArr) {
        int i8 = 0;
        float f8 = fArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 > f8) {
                i8 = i9;
                f8 = f9;
            }
        }
        iArr[i8] = iArr[i8] + 1;
    }

    protected static boolean m(int[] iArr) {
        float f8 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f8 >= 0.7916667f && f8 <= 0.89285713f) {
            int i8 = Integer.MAX_VALUE;
            int i9 = Integer.MIN_VALUE;
            for (int i10 : iArr) {
                if (i10 > i9) {
                    i9 = i10;
                }
                if (i10 < i8) {
                    i8 = i10;
                }
            }
            if (i9 < i8 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int n(int[] iArr, int[][] iArr2) throws m {
        for (int i8 = 0; i8 < iArr2.length; i8++) {
            if (r.b(iArr, iArr2[i8], 0.45f) < 0.2f) {
                return i8;
            }
        }
        throw m.getNotFoundInstance();
    }

    protected final int[] f() {
        return this.f5434b;
    }

    protected final int[] g() {
        return this.f5433a;
    }

    protected final int[] h() {
        return this.f5438f;
    }

    protected final float[] i() {
        return this.f5436d;
    }

    protected final int[] j() {
        return this.f5437e;
    }

    protected final float[] k() {
        return this.f5435c;
    }
}
