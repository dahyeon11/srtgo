package g4;

import ai.maum.m2u.cdk.utils.G711;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f31350e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f, reason: collision with root package name */
    private static final j[] f31351f = b();

    /* renamed from: a, reason: collision with root package name */
    private final int f31352a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f31353b;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f31354c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31355d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f31356a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31357b;

        a(int i8, int i9) {
            this.f31356a = i8;
            this.f31357b = i9;
        }

        public int getCount() {
            return this.f31356a;
        }

        public int getDataCodewords() {
            return this.f31357b;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f31358a;

        /* renamed from: b, reason: collision with root package name */
        private final a[] f31359b;

        b(int i8, a... aVarArr) {
            this.f31358a = i8;
            this.f31359b = aVarArr;
        }

        public a[] getECBlocks() {
            return this.f31359b;
        }

        public int getECCodewordsPerBlock() {
            return this.f31358a;
        }

        public int getNumBlocks() {
            int count = 0;
            for (a aVar : this.f31359b) {
                count += aVar.getCount();
            }
            return count;
        }

        public int getTotalECCodewords() {
            return this.f31358a * getNumBlocks();
        }
    }

    private j(int i8, int[] iArr, b... bVarArr) {
        this.f31352a = i8;
        this.f31353b = iArr;
        this.f31354c = bVarArr;
        int eCCodewordsPerBlock = bVarArr[0].getECCodewordsPerBlock();
        int count = 0;
        for (a aVar : bVarArr[0].getECBlocks()) {
            count += aVar.getCount() * (aVar.getDataCodewords() + eCCodewordsPerBlock);
        }
        this.f31355d = count;
    }

    private static j[] b() {
        return new j[]{new j(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new j(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new j(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new j(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new j(5, new int[]{6, 30}, new b(26, new a(1, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new j(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new j(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new j(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new j(9, new int[]{6, 26, 46}, new b(30, new a(2, 116)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new j(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new j(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new j(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new j(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new j(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, 116)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new j(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new j(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new j(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new j(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new j(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new j(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new j(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, 116), new a(4, 117)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new j(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, 111), new a(7, 112)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new j(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new j(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, 117), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new j(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new j(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new j(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new j(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, 117), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new j(29, new int[]{6, 30, 54, 78, 102, 126}, new b(30, new a(7, 116), new a(7, 117)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new j(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, 116)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new j(31, new int[]{6, 30, 56, 82, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, 134}, new b(30, new a(13, 115), new a(3, 116)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new j(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new j(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new a(17, 115), new a(1, 116)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new j(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, 115), new a(6, 116)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new j(37, new int[]{6, 28, 54, 80, 106, G711.BIAS, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, 117), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    static j c(int i8) {
        int i9 = Integer.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = f31350e;
            if (i10 >= iArr.length) {
                if (i9 <= 3) {
                    return getVersionForNumber(i11);
                }
                return null;
            }
            int i12 = iArr[i10];
            if (i12 == i8) {
                return getVersionForNumber(i10 + 7);
            }
            int iE = g.e(i8, i12);
            if (iE < i9) {
                i11 = i10 + 7;
                i9 = iE;
            }
            i10++;
        }
    }

    public static j getProvisionalVersionForDimension(int i8) throws F3.h {
        if (i8 % 4 != 1) {
            throw F3.h.getFormatInstance();
        }
        try {
            return getVersionForNumber((i8 - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw F3.h.getFormatInstance();
        }
    }

    public static j getVersionForNumber(int i8) {
        if (i8 <= 0 || i8 > 40) {
            throw new IllegalArgumentException();
        }
        return f31351f[i8 - 1];
    }

    M3.b a() {
        int dimensionForVersion = getDimensionForVersion();
        M3.b bVar = new M3.b(dimensionForVersion);
        bVar.setRegion(0, 0, 9, 9);
        int i8 = dimensionForVersion - 8;
        bVar.setRegion(i8, 0, 8, 9);
        bVar.setRegion(0, i8, 9, 8);
        int length = this.f31353b.length;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = this.f31353b[i9] - 2;
            for (int i11 = 0; i11 < length; i11++) {
                if ((i9 != 0 || (i11 != 0 && i11 != length - 1)) && (i9 != length - 1 || i11 != 0)) {
                    bVar.setRegion(this.f31353b[i11] - 2, i10, 5, 5);
                }
            }
        }
        int i12 = dimensionForVersion - 17;
        bVar.setRegion(6, 9, 1, i12);
        bVar.setRegion(9, 6, i12, 1);
        if (this.f31352a > 6) {
            int i13 = dimensionForVersion - 11;
            bVar.setRegion(i13, 0, 3, 6);
            bVar.setRegion(0, i13, 6, 3);
        }
        return bVar;
    }

    public int[] getAlignmentPatternCenters() {
        return this.f31353b;
    }

    public int getDimensionForVersion() {
        return (this.f31352a * 4) + 17;
    }

    public b getECBlocksForLevel(f fVar) {
        return this.f31354c[fVar.ordinal()];
    }

    public int getTotalCodewords() {
        return this.f31355d;
    }

    public int getVersionNumber() {
        return this.f31352a;
    }

    public String toString() {
        return String.valueOf(this.f31352a);
    }
}
