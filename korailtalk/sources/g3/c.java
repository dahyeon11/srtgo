package G3;

import F3.g;
import F3.u;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f1479a = Charset.forName("ISO-8859-1");

    private static M3.b a(String str, F3.a aVar, int i8, int i9, Charset charset, int i10, int i11) {
        if (aVar == F3.a.AZTEC) {
            return b(J3.c.encode(str.getBytes(charset), i10, i11), i8, i9);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
    }

    private static M3.b b(J3.a aVar, int i8, int i9) {
        M3.b matrix = aVar.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int iMax = Math.max(i8, width);
        int iMax2 = Math.max(i9, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i10 = (iMax - (width * iMin)) / 2;
        int i11 = (iMax2 - (height * iMin)) / 2;
        M3.b bVar = new M3.b(iMax, iMax2);
        int i12 = 0;
        while (i12 < height) {
            int i13 = 0;
            int i14 = i10;
            while (i13 < width) {
                if (matrix.get(i13, i12)) {
                    bVar.setRegion(i14, i11, iMin, iMin);
                }
                i13++;
                i14 += iMin;
            }
            i12++;
            i11 += iMin;
        }
        return bVar;
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<g, ?> map) throws NumberFormatException {
        Charset charsetForName = f1479a;
        int i10 = 0;
        if (map != null) {
            g gVar = g.CHARACTER_SET;
            if (map.containsKey(gVar)) {
                charsetForName = Charset.forName(map.get(gVar).toString());
            }
            g gVar2 = g.ERROR_CORRECTION;
            i = map.containsKey(gVar2) ? Integer.parseInt(map.get(gVar2).toString()) : 33;
            g gVar3 = g.AZTEC_LAYERS;
            if (map.containsKey(gVar3)) {
                i10 = Integer.parseInt(map.get(gVar3).toString());
            }
        }
        return a(str, aVar, i8, i9, charsetForName, i, i10);
    }
}
