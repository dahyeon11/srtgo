package W3;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class y extends r {

    /* renamed from: d, reason: collision with root package name */
    static final int[] f5358d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f5359e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f5360f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g, reason: collision with root package name */
    static final int[][] f5361g;

    /* renamed from: h, reason: collision with root package name */
    static final int[][] f5362h;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f5363a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final x f5364b = new x();

    /* renamed from: c, reason: collision with root package name */
    private final m f5365c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f5361g = iArr;
        int[][] iArr2 = new int[20][];
        f5362h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i8 = 10; i8 < 20; i8++) {
            int[] iArr3 = f5361g[i8 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i9 = 0; i9 < iArr3.length; i9++) {
                iArr4[i9] = iArr3[(iArr3.length - i9) - 1];
            }
            f5362h[i8] = iArr4;
        }
    }

    protected y() {
    }

    static boolean f(CharSequence charSequence) throws F3.h {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i8 = 0;
        for (int i9 = length - 2; i9 >= 0; i9 -= 2) {
            int iCharAt = charSequence.charAt(i9) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw F3.h.getFormatInstance();
            }
            i8 += iCharAt;
        }
        int i10 = i8 * 3;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt2 = charSequence.charAt(i11) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw F3.h.getFormatInstance();
            }
            i10 += iCharAt2;
        }
        return i10 % 10 == 0;
    }

    static int g(M3.a aVar, int[] iArr, int i8, int[][] iArr2) {
        r.c(aVar, i8, iArr);
        int length = iArr2.length;
        float f8 = 0.48f;
        int i9 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            float fB = r.b(iArr, iArr2[i10], 0.7f);
            if (fB < f8) {
                i9 = i10;
                f8 = fB;
            }
        }
        if (i9 >= 0) {
            return i9;
        }
        throw F3.m.getNotFoundInstance();
    }

    static int[] j(M3.a aVar, int i8, boolean z8, int[] iArr) {
        return k(aVar, i8, z8, iArr, new int[iArr.length]);
    }

    private static int[] k(M3.a aVar, int i8, boolean z8, int[] iArr, int[] iArr2) {
        int size = aVar.getSize();
        int nextUnset = z8 ? aVar.getNextUnset(i8) : aVar.getNextSet(i8);
        int length = iArr.length;
        boolean z9 = z8;
        int i9 = 0;
        int i10 = nextUnset;
        while (nextUnset < size) {
            if (aVar.get(nextUnset) ^ z9) {
                iArr2[i9] = iArr2[i9] + 1;
            } else {
                int i11 = length - 1;
                if (i9 != i11) {
                    i9++;
                } else {
                    if (r.b(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i10, nextUnset};
                    }
                    i10 += iArr2[0] + iArr2[1];
                    int i12 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i11] = 0;
                    i9--;
                }
                iArr2[i9] = 1;
                z9 = !z9;
            }
            nextUnset++;
        }
        throw F3.m.getNotFoundInstance();
    }

    static int[] l(M3.a aVar) {
        int[] iArr = new int[f5358d.length];
        int[] iArrK = null;
        boolean zIsRange = false;
        int i8 = 0;
        while (!zIsRange) {
            int[] iArr2 = f5358d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrK = k(aVar, i8, false, iArr2, iArr);
            int i9 = iArrK[0];
            int i10 = iArrK[1];
            int i11 = i9 - (i10 - i9);
            if (i11 >= 0) {
                zIsRange = aVar.isRange(i11, i9, false);
            }
            i8 = i10;
        }
        return iArrK;
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) {
        return decodeRow(i8, aVar, l(aVar), map);
    }

    boolean e(String str) {
        return f(str);
    }

    int[] h(M3.a aVar, int i8) {
        return j(aVar, i8, false, f5358d);
    }

    protected abstract int i(M3.a aVar, int[] iArr, StringBuilder sb);

    abstract F3.a m();

    public F3.q decodeRow(int i8, M3.a aVar, int[] iArr, Map<F3.e, ?> map) throws F3.d, F3.h, F3.m {
        int length;
        String strC;
        F3.t tVar = map == null ? null : (F3.t) map.get(F3.e.NEED_RESULT_POINT_CALLBACK);
        if (tVar != null) {
            tVar.foundPossibleResultPoint(new F3.s((iArr[0] + iArr[1]) / 2.0f, i8));
        }
        StringBuilder sb = this.f5363a;
        sb.setLength(0);
        int i9 = i(aVar, iArr, sb);
        if (tVar != null) {
            tVar.foundPossibleResultPoint(new F3.s(i9, i8));
        }
        int[] iArrH = h(aVar, i9);
        if (tVar != null) {
            tVar.foundPossibleResultPoint(new F3.s((iArrH[0] + iArrH[1]) / 2.0f, i8));
        }
        int i10 = iArrH[1];
        int i11 = (i10 - iArrH[0]) + i10;
        if (i11 >= aVar.getSize() || !aVar.isRange(i10, i11, false)) {
            throw F3.m.getNotFoundInstance();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw F3.h.getFormatInstance();
        }
        if (!e(string)) {
            throw F3.d.getChecksumInstance();
        }
        F3.a aVarM = m();
        float f8 = i8;
        F3.q qVar = new F3.q(string, null, new F3.s[]{new F3.s((iArr[1] + iArr[0]) / 2.0f, f8), new F3.s((iArrH[1] + iArrH[0]) / 2.0f, f8)}, aVarM);
        try {
            F3.q qVarA = this.f5364b.a(i8, aVar, iArrH[1]);
            qVar.putMetadata(F3.r.UPC_EAN_EXTENSION, qVarA.getText());
            qVar.putAllMetadata(qVarA.getResultMetadata());
            qVar.addResultPoints(qVarA.getResultPoints());
            length = qVarA.getText().length();
        } catch (F3.p unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(F3.e.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                if (length != i12) {
                }
            }
            throw F3.m.getNotFoundInstance();
        }
        if ((aVarM == F3.a.EAN_13 || aVarM == F3.a.UPC_A) && (strC = this.f5365c.c(string)) != null) {
            qVar.putMetadata(F3.r.POSSIBLE_COUNTRY, strC);
        }
        return qVar;
    }
}
