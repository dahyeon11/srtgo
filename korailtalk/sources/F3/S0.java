package f3;

import java.util.Arrays;

/* loaded from: classes2.dex */
class S0 extends R0 {

    /* renamed from: i, reason: collision with root package name */
    transient long[] f30834i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f30835j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f30836k;

    S0(R0 r02) {
        l(r02.v(), 1.0f);
        int iD = r02.d();
        while (iD != -1) {
            put(r02.g(iD), r02.i(iD));
            iD = r02.q(iD);
        }
    }

    private void A(int i8, int i9) {
        if (i8 == -2) {
            this.f30835j = i9;
        } else {
            B(i8, i9);
        }
        if (i9 == -2) {
            this.f30836k = i8;
        } else {
            z(i9, i8);
        }
    }

    private void B(int i8, int i9) {
        long[] jArr = this.f30834i;
        jArr[i8] = (jArr[i8] & (-4294967296L)) | (i9 & 4294967295L);
    }

    private int x(int i8) {
        return (int) (this.f30834i[i8] >>> 32);
    }

    private int y(int i8) {
        return (int) this.f30834i[i8];
    }

    private void z(int i8, int i9) {
        long[] jArr = this.f30834i;
        jArr[i8] = (jArr[i8] & 4294967295L) | (i9 << 32);
    }

    @Override // f3.R0
    public void clear() {
        super.clear();
        this.f30835j = -2;
        this.f30836k = -2;
    }

    @Override // f3.R0
    int d() {
        int i8 = this.f30835j;
        if (i8 == -2) {
            return -1;
        }
        return i8;
    }

    @Override // f3.R0
    void l(int i8, float f8) {
        super.l(i8, f8);
        this.f30835j = -2;
        this.f30836k = -2;
        long[] jArr = new long[i8];
        this.f30834i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // f3.R0
    void m(int i8, Object obj, int i9, int i10) {
        super.m(i8, obj, i9, i10);
        A(this.f30836k, i8);
        A(i8, -2);
    }

    @Override // f3.R0
    void n(int i8) {
        int iV = v() - 1;
        A(x(i8), y(i8));
        if (i8 < iV) {
            A(x(iV), i8);
            A(i8, y(iV));
        }
        super.n(i8);
    }

    @Override // f3.R0
    int q(int i8) {
        int iY = y(i8);
        if (iY == -2) {
            return -1;
        }
        return iY;
    }

    @Override // f3.R0
    void s(int i8) {
        super.s(i8);
        long[] jArr = this.f30834i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i8);
        this.f30834i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i8, -1L);
    }
}
