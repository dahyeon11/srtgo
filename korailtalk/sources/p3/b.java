package P3;

import F3.f;
import F3.g;
import F3.u;
import S3.e;
import S3.i;
import S3.j;
import S3.k;
import S3.l;
import i4.C5696b;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements u {
    private static M3.b a(C5696b c5696b) {
        int width = c5696b.getWidth();
        int height = c5696b.getHeight();
        M3.b bVar = new M3.b(width, height);
        bVar.clear();
        for (int i8 = 0; i8 < width; i8++) {
            for (int i9 = 0; i9 < height; i9++) {
                if (c5696b.get(i8, i9) == 1) {
                    bVar.set(i8, i9);
                }
            }
        }
        return bVar;
    }

    private static M3.b b(e eVar, k kVar) {
        int symbolDataWidth = kVar.getSymbolDataWidth();
        int symbolDataHeight = kVar.getSymbolDataHeight();
        C5696b c5696b = new C5696b(kVar.getSymbolWidth(), kVar.getSymbolHeight());
        int i8 = 0;
        for (int i9 = 0; i9 < symbolDataHeight; i9++) {
            if (i9 % kVar.matrixHeight == 0) {
                int i10 = 0;
                for (int i11 = 0; i11 < kVar.getSymbolWidth(); i11++) {
                    c5696b.set(i10, i8, i11 % 2 == 0);
                    i10++;
                }
                i8++;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < symbolDataWidth; i13++) {
                if (i13 % kVar.matrixWidth == 0) {
                    c5696b.set(i12, i8, true);
                    i12++;
                }
                c5696b.set(i12, i8, eVar.getBit(i13, i9));
                int i14 = i12 + 1;
                int i15 = kVar.matrixWidth;
                if (i13 % i15 == i15 - 1) {
                    c5696b.set(i14, i8, i9 % 2 == 0);
                    i12 += 2;
                } else {
                    i12 = i14;
                }
            }
            int i16 = i8 + 1;
            int i17 = kVar.matrixHeight;
            if (i9 % i17 == i17 - 1) {
                int i18 = 0;
                for (int i19 = 0; i19 < kVar.getSymbolWidth(); i19++) {
                    c5696b.set(i18, i16, true);
                    i18++;
                }
                i8 += 2;
            } else {
                i8 = i16;
            }
        }
        return a(c5696b);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<g, ?> map) {
        f fVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != F3.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + aVar);
        }
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i8 + 'x' + i9);
        }
        l lVar = l.FORCE_NONE;
        f fVar2 = null;
        if (map != null) {
            l lVar2 = (l) map.get(g.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            f fVar3 = (f) map.get(g.MIN_SIZE);
            if (fVar3 == null) {
                fVar3 = null;
            }
            fVar = (f) map.get(g.MAX_SIZE);
            if (fVar == null) {
                fVar = null;
            }
            fVar2 = fVar3;
        } else {
            fVar = null;
        }
        String strEncodeHighLevel = j.encodeHighLevel(str, lVar, fVar2, fVar);
        k kVarLookup = k.lookup(strEncodeHighLevel.length(), lVar, fVar2, fVar, true);
        e eVar = new e(i.encodeECC200(strEncodeHighLevel, kVarLookup), kVarLookup.getSymbolDataWidth(), kVarLookup.getSymbolDataHeight());
        eVar.place();
        return b(eVar, kVarLookup);
    }
}
