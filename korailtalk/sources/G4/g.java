package g4;

/* loaded from: classes2.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f31343c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    private final f f31344a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f31345b;

    private g(int i8) {
        this.f31344a = f.forBits((i8 >> 3) & 3);
        this.f31345b = (byte) (i8 & 7);
    }

    static g a(int i8, int i9) {
        g gVarB = b(i8, i9);
        return gVarB != null ? gVarB : b(i8 ^ 21522, i9 ^ 21522);
    }

    private static g b(int i8, int i9) {
        int iE;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int[] iArr : f31343c) {
            int i12 = iArr[0];
            if (i12 == i8 || i12 == i9) {
                return new g(iArr[1]);
            }
            int iE2 = e(i8, i12);
            if (iE2 < i10) {
                i11 = iArr[1];
                i10 = iE2;
            }
            if (i8 != i9 && (iE = e(i9, i12)) < i10) {
                i11 = iArr[1];
                i10 = iE;
            }
        }
        if (i10 <= 3) {
            return new g(i11);
        }
        return null;
    }

    static int e(int i8, int i9) {
        return Integer.bitCount(i8 ^ i9);
    }

    byte c() {
        return this.f31345b;
    }

    f d() {
        return this.f31344a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f31344a == gVar.f31344a && this.f31345b == gVar.f31345b;
    }

    public int hashCode() {
        return (this.f31344a.ordinal() << 3) | this.f31345b;
    }
}
