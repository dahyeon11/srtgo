package f3;

import f3.K0;
import f3.L0;
import java.util.Arrays;

/* loaded from: classes2.dex */
class R0 {

    /* renamed from: a, reason: collision with root package name */
    transient Object[] f30823a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f30824b;

    /* renamed from: c, reason: collision with root package name */
    transient int f30825c;

    /* renamed from: d, reason: collision with root package name */
    transient int f30826d;

    /* renamed from: e, reason: collision with root package name */
    private transient int[] f30827e;

    /* renamed from: f, reason: collision with root package name */
    transient long[] f30828f;

    /* renamed from: g, reason: collision with root package name */
    private transient float f30829g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f30830h;

    class a extends L0.e {

        /* renamed from: a, reason: collision with root package name */
        final Object f30831a;

        /* renamed from: b, reason: collision with root package name */
        int f30832b;

        a(int i8) {
            this.f30831a = R0.this.f30823a[i8];
            this.f30832b = i8;
        }

        void a() {
            int i8 = this.f30832b;
            if (i8 == -1 || i8 >= R0.this.v() || !e3.r.equal(this.f30831a, R0.this.f30823a[this.f30832b])) {
                this.f30832b = R0.this.k(this.f30831a);
            }
        }

        @Override // f3.L0.e, f3.K0.a
        public int getCount() {
            a();
            int i8 = this.f30832b;
            if (i8 == -1) {
                return 0;
            }
            return R0.this.f30824b[i8];
        }

        @Override // f3.L0.e, f3.K0.a
        public Object getElement() {
            return this.f30831a;
        }

        public int setCount(int i8) {
            a();
            int i9 = this.f30832b;
            if (i9 == -1) {
                R0.this.put(this.f30831a, i8);
                return 0;
            }
            int[] iArr = R0.this.f30824b;
            int i10 = iArr[i9];
            iArr[i9] = i8;
            return i10;
        }
    }

    R0() {
        l(3, 1.0f);
    }

    static R0 a() {
        return new R0();
    }

    static R0 b(int i8) {
        return new R0(i8);
    }

    private static int f(long j8) {
        return (int) (j8 >>> 32);
    }

    private static int h(long j8) {
        return (int) j8;
    }

    private int j() {
        return this.f30827e.length - 1;
    }

    private static long[] o(int i8) {
        long[] jArr = new long[i8];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] p(int i8) {
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int r(Object obj, int i8) {
        int iJ = j() & i8;
        int i9 = this.f30827e[iJ];
        if (i9 == -1) {
            return 0;
        }
        int i10 = -1;
        while (true) {
            if (f(this.f30828f[i9]) == i8 && e3.r.equal(obj, this.f30823a[i9])) {
                int i11 = this.f30824b[i9];
                if (i10 == -1) {
                    this.f30827e[iJ] = h(this.f30828f[i9]);
                } else {
                    long[] jArr = this.f30828f;
                    jArr[i10] = w(jArr[i10], h(jArr[i9]));
                }
                n(i9);
                this.f30825c--;
                this.f30826d++;
                return i11;
            }
            int iH = h(this.f30828f[i9]);
            if (iH == -1) {
                return 0;
            }
            i10 = i9;
            i9 = iH;
        }
    }

    private void t(int i8) {
        int length = this.f30828f.length;
        if (i8 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                s(iMax);
            }
        }
    }

    private void u(int i8) {
        if (this.f30827e.length >= 1073741824) {
            this.f30830h = Integer.MAX_VALUE;
            return;
        }
        int i9 = ((int) (i8 * this.f30829g)) + 1;
        int[] iArrP = p(i8);
        long[] jArr = this.f30828f;
        int length = iArrP.length - 1;
        for (int i10 = 0; i10 < this.f30825c; i10++) {
            int iF = f(jArr[i10]);
            int i11 = iF & length;
            int i12 = iArrP[i11];
            iArrP[i11] = i10;
            jArr[i10] = (iF << 32) | (i12 & 4294967295L);
        }
        this.f30830h = i9;
        this.f30827e = iArrP;
    }

    private static long w(long j8, int i8) {
        return (j8 & (-4294967296L)) | (4294967295L & i8);
    }

    void c(int i8) {
        if (i8 > this.f30828f.length) {
            s(i8);
        }
        if (i8 >= this.f30830h) {
            u(Math.max(2, Integer.highestOneBit(i8 - 1) << 1));
        }
    }

    public void clear() {
        this.f30826d++;
        Arrays.fill(this.f30823a, 0, this.f30825c, (Object) null);
        Arrays.fill(this.f30824b, 0, this.f30825c, 0);
        Arrays.fill(this.f30827e, -1);
        Arrays.fill(this.f30828f, -1L);
        this.f30825c = 0;
    }

    public boolean containsKey(Object obj) {
        return k(obj) != -1;
    }

    int d() {
        return this.f30825c == 0 ? -1 : 0;
    }

    K0.a e(int i8) {
        e3.w.checkElementIndex(i8, this.f30825c);
        return new a(i8);
    }

    Object g(int i8) {
        e3.w.checkElementIndex(i8, this.f30825c);
        return this.f30823a[i8];
    }

    public int get(Object obj) {
        int iK = k(obj);
        if (iK == -1) {
            return 0;
        }
        return this.f30824b[iK];
    }

    int i(int i8) {
        e3.w.checkElementIndex(i8, this.f30825c);
        return this.f30824b[i8];
    }

    int k(Object obj) {
        int iC = AbstractC5453b0.c(obj);
        int iH = this.f30827e[j() & iC];
        while (iH != -1) {
            long j8 = this.f30828f[iH];
            if (f(j8) == iC && e3.r.equal(obj, this.f30823a[iH])) {
                return iH;
            }
            iH = h(j8);
        }
        return -1;
    }

    void l(int i8, float f8) {
        e3.w.checkArgument(i8 >= 0, "Initial capacity must be non-negative");
        e3.w.checkArgument(f8 > 0.0f, "Illegal load factor");
        int iA = AbstractC5453b0.a(i8, f8);
        this.f30827e = p(iA);
        this.f30829g = f8;
        this.f30823a = new Object[i8];
        this.f30824b = new int[i8];
        this.f30828f = o(i8);
        this.f30830h = Math.max(1, (int) (iA * f8));
    }

    void m(int i8, Object obj, int i9, int i10) {
        this.f30828f[i8] = (i10 << 32) | 4294967295L;
        this.f30823a[i8] = obj;
        this.f30824b[i8] = i9;
    }

    void n(int i8) {
        int iV = v() - 1;
        if (i8 >= iV) {
            this.f30823a[i8] = null;
            this.f30824b[i8] = 0;
            this.f30828f[i8] = -1;
            return;
        }
        Object[] objArr = this.f30823a;
        objArr[i8] = objArr[iV];
        int[] iArr = this.f30824b;
        iArr[i8] = iArr[iV];
        objArr[iV] = null;
        iArr[iV] = 0;
        long[] jArr = this.f30828f;
        long j8 = jArr[iV];
        jArr[i8] = j8;
        jArr[iV] = -1;
        int iF = f(j8) & j();
        int[] iArr2 = this.f30827e;
        int i9 = iArr2[iF];
        if (i9 == iV) {
            iArr2[iF] = i8;
            return;
        }
        while (true) {
            long j9 = this.f30828f[i9];
            int iH = h(j9);
            if (iH == iV) {
                this.f30828f[i9] = w(j9, i8);
                return;
            }
            i9 = iH;
        }
    }

    public int put(Object obj, int i8) {
        AbstractC5484r.c(i8, "count");
        long[] jArr = this.f30828f;
        Object[] objArr = this.f30823a;
        int[] iArr = this.f30824b;
        int iC = AbstractC5453b0.c(obj);
        int iJ = j() & iC;
        int i9 = this.f30825c;
        int[] iArr2 = this.f30827e;
        int i10 = iArr2[iJ];
        if (i10 == -1) {
            iArr2[iJ] = i9;
        } else {
            while (true) {
                long j8 = jArr[i10];
                if (f(j8) == iC && e3.r.equal(obj, objArr[i10])) {
                    int i11 = iArr[i10];
                    iArr[i10] = i8;
                    return i11;
                }
                int iH = h(j8);
                if (iH == -1) {
                    jArr[i10] = w(j8, i9);
                    break;
                }
                i10 = iH;
            }
        }
        if (i9 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i12 = i9 + 1;
        t(i12);
        m(i9, obj, i8, iC);
        this.f30825c = i12;
        if (i9 >= this.f30830h) {
            u(this.f30827e.length * 2);
        }
        this.f30826d++;
        return 0;
    }

    int q(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f30825c) {
            return i9;
        }
        return -1;
    }

    public int remove(Object obj) {
        return r(obj, AbstractC5453b0.c(obj));
    }

    void s(int i8) {
        this.f30823a = Arrays.copyOf(this.f30823a, i8);
        this.f30824b = Arrays.copyOf(this.f30824b, i8);
        long[] jArr = this.f30828f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i8);
        if (i8 > length) {
            Arrays.fill(jArrCopyOf, length, i8, -1L);
        }
        this.f30828f = jArrCopyOf;
    }

    int v() {
        return this.f30825c;
    }

    R0(R0 r02) {
        l(r02.v(), 1.0f);
        int iD = r02.d();
        while (iD != -1) {
            put(r02.g(iD), r02.i(iD));
            iD = r02.q(iD);
        }
    }

    R0(int i8) {
        this(i8, 1.0f);
    }

    R0(int i8, float f8) {
        l(i8, f8);
    }
}
