package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class s implements F3.u {
    protected static int a(boolean[] zArr, int i8, int[] iArr, boolean z8) {
        int i9 = 0;
        for (int i10 : iArr) {
            int i11 = 0;
            while (i11 < i10) {
                zArr[i8] = z8;
                i11++;
                i8++;
            }
            i9 += i10;
            z8 = !z8;
        }
        return i9;
    }

    private static M3.b b(boolean[] zArr, int i8, int i9, int i10) {
        int length = zArr.length;
        int i11 = i10 + length;
        int iMax = Math.max(i8, i11);
        int iMax2 = Math.max(1, i9);
        int i12 = iMax / i11;
        int i13 = (iMax - (length * i12)) / 2;
        M3.b bVar = new M3.b(iMax, iMax2);
        int i14 = 0;
        while (i14 < length) {
            if (zArr[i14]) {
                bVar.setRegion(i13, 0, i12, iMax2);
            }
            i14++;
            i13 += i12;
        }
        return bVar;
    }

    @Override // F3.u
    public final M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        return 10;
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) throws NumberFormatException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i8 + 'x' + i9);
        }
        int defaultMargin = getDefaultMargin();
        if (map != null) {
            F3.g gVar = F3.g.MARGIN;
            if (map.containsKey(gVar)) {
                defaultMargin = Integer.parseInt(map.get(gVar).toString());
            }
        }
        return b(encode(str), i8, i9, defaultMargin);
    }
}
