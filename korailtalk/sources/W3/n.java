package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5339b = {6, 8, 10, 12, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5340c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f5341d = {1, 1, 3};

    /* renamed from: e, reason: collision with root package name */
    static final int[][] f5342e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    private int f5343a = -1;

    private static int e(int[] iArr) throws F3.m {
        int length = f5342e.length;
        float f8 = 0.38f;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            float fB = r.b(iArr, f5342e[i9], 0.78f);
            if (fB < f8) {
                i8 = i9;
                f8 = fB;
            }
        }
        if (i8 >= 0) {
            return i8;
        }
        throw F3.m.getNotFoundInstance();
    }

    private int[] f(M3.a aVar) {
        aVar.reverse();
        try {
            int[] iArrI = i(aVar, j(aVar), f5341d);
            k(aVar, iArrI[0]);
            int i8 = iArrI[0];
            iArrI[0] = aVar.getSize() - iArrI[1];
            iArrI[1] = aVar.getSize() - i8;
            return iArrI;
        } finally {
            aVar.reverse();
        }
    }

    private static void g(M3.a aVar, int i8, int i9, StringBuilder sb) throws F3.m {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i8 < i9) {
            r.c(aVar, i8, iArr);
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = i10 * 2;
                iArr2[i10] = iArr[i11];
                iArr3[i10] = iArr[i11 + 1];
            }
            sb.append((char) (e(iArr2) + 48));
            sb.append((char) (e(iArr3) + 48));
            for (int i12 = 0; i12 < 10; i12++) {
                i8 += iArr[i12];
            }
        }
    }

    private int[] h(M3.a aVar) throws F3.m {
        int[] iArrI = i(aVar, j(aVar), f5340c);
        int i8 = iArrI[1];
        int i9 = iArrI[0];
        this.f5343a = (i8 - i9) / 4;
        k(aVar, i9);
        return iArrI;
    }

    private static int[] i(M3.a aVar, int i8, int[] iArr) throws F3.m {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = aVar.getSize();
        int i9 = i8;
        boolean z8 = false;
        int i10 = 0;
        while (i8 < size) {
            if (aVar.get(i8) ^ z8) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                int i11 = length - 1;
                if (i10 != i11) {
                    i10++;
                } else {
                    if (r.b(iArr2, iArr, 0.78f) < 0.38f) {
                        return new int[]{i9, i8};
                    }
                    i9 += iArr2[0] + iArr2[1];
                    int i12 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i11] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z8 = !z8;
            }
            i8++;
        }
        throw F3.m.getNotFoundInstance();
    }

    private static int j(M3.a aVar) throws F3.m {
        int size = aVar.getSize();
        int nextSet = aVar.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw F3.m.getNotFoundInstance();
    }

    private void k(M3.a aVar, int i8) throws F3.m {
        int i9 = this.f5343a * 10;
        if (i9 >= i8) {
            i9 = i8;
        }
        for (int i10 = i8 - 1; i9 > 0 && i10 >= 0 && !aVar.get(i10); i10--) {
            i9--;
        }
        if (i9 != 0) {
            throw F3.m.getNotFoundInstance();
        }
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) throws F3.h, F3.m {
        boolean z8;
        int[] iArrH = h(aVar);
        int[] iArrF = f(aVar);
        StringBuilder sb = new StringBuilder(20);
        g(aVar, iArrH[1], iArrF[0], sb);
        String string = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(F3.e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f5339b;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= length2) {
                z8 = false;
                break;
            }
            int i11 = iArr[i9];
            if (length == i11) {
                z8 = true;
                break;
            }
            if (i11 > i10) {
                i10 = i11;
            }
            i9++;
        }
        if (!z8 && length > i10) {
            z8 = true;
        }
        if (!z8) {
            throw F3.h.getFormatInstance();
        }
        float f8 = i8;
        return new F3.q(string, null, new F3.s[]{new F3.s(iArrH[1], f8), new F3.s(iArrF[0], f8)}, F3.a.ITF);
    }
}
