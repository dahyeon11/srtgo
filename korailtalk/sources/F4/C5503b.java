package f4;

import F3.g;
import F3.u;
import g4.f;
import i4.AbstractC5697c;
import i4.C5696b;
import i4.C5700f;
import java.util.Map;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5503b implements u {
    private static M3.b a(C5700f c5700f, int i8, int i9, int i10) {
        C5696b matrix = c5700f.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int i11 = i10 << 1;
        int i12 = width + i11;
        int i13 = i11 + height;
        int iMax = Math.max(i8, i12);
        int iMax2 = Math.max(i9, i13);
        int iMin = Math.min(iMax / i12, iMax2 / i13);
        int i14 = (iMax - (width * iMin)) / 2;
        int i15 = (iMax2 - (height * iMin)) / 2;
        M3.b bVar = new M3.b(iMax, iMax2);
        int i16 = 0;
        while (i16 < height) {
            int i17 = 0;
            int i18 = i14;
            while (i17 < width) {
                if (matrix.get(i17, i16) == 1) {
                    bVar.setRegion(i18, i15, iMin, iMin);
                }
                i17++;
                i18 += iMin;
            }
            i16++;
            i15 += iMin;
        }
        return bVar;
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<g, ?> map) throws NumberFormatException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != F3.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i8 + 'x' + i9);
        }
        f fVarValueOf = f.L;
        int i10 = 4;
        if (map != null) {
            g gVar = g.ERROR_CORRECTION;
            if (map.containsKey(gVar)) {
                fVarValueOf = f.valueOf(map.get(gVar).toString());
            }
            g gVar2 = g.MARGIN;
            if (map.containsKey(gVar2)) {
                i10 = Integer.parseInt(map.get(gVar2).toString());
            }
        }
        return a(AbstractC5697c.encode(str, fVarValueOf, map), i8, i9, i10);
    }
}
