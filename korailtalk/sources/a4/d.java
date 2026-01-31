package a4;

import F3.g;
import F3.u;
import F3.v;
import e4.e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d implements u {
    private static M3.b a(e eVar, String str, int i8, int i9, int i10, int i11) throws v {
        boolean z8;
        eVar.generateBarcodeLogic(str, i8);
        byte[][] scaledMatrix = eVar.getBarcodeMatrix().getScaledMatrix(1, 4);
        if ((i10 > i9) ^ (scaledMatrix[0].length < scaledMatrix.length)) {
            scaledMatrix = c(scaledMatrix);
            z8 = true;
        } else {
            z8 = false;
        }
        int length = i9 / scaledMatrix[0].length;
        int length2 = i10 / scaledMatrix.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(scaledMatrix, i11);
        }
        byte[][] scaledMatrix2 = eVar.getBarcodeMatrix().getScaledMatrix(length, length << 2);
        if (z8) {
            scaledMatrix2 = c(scaledMatrix2);
        }
        return b(scaledMatrix2, i11);
    }

    private static M3.b b(byte[][] bArr, int i8) {
        int i9 = i8 * 2;
        M3.b bVar = new M3.b(bArr[0].length + i9, bArr.length + i9);
        bVar.clear();
        int height = (bVar.getHeight() - i8) - 1;
        int i10 = 0;
        while (i10 < bArr.length) {
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                if (bArr[i10][i11] == 1) {
                    bVar.set(i11 + i8, height);
                }
            }
            i10++;
            height--;
        }
        return bVar;
    }

    private static byte[][] c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            int length = (bArr.length - i8) - 1;
            for (int i9 = 0; i9 < bArr[0].length; i9++) {
                bArr2[i9][length] = bArr[i8][i9];
            }
        }
        return bArr2;
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<g, ?> map) {
        if (aVar != F3.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
        }
        e eVar = new e();
        if (map != null) {
            g gVar = g.PDF417_COMPACT;
            if (map.containsKey(gVar)) {
                eVar.setCompact(Boolean.valueOf(map.get(gVar).toString()).booleanValue());
            }
            g gVar2 = g.PDF417_COMPACTION;
            if (map.containsKey(gVar2)) {
                eVar.setCompaction(e4.c.valueOf(map.get(gVar2).toString()));
            }
            g gVar3 = g.PDF417_DIMENSIONS;
            if (map.containsKey(gVar3)) {
                e4.d dVar = (e4.d) map.get(gVar3);
                eVar.setDimensions(dVar.getMaxCols(), dVar.getMinCols(), dVar.getMaxRows(), dVar.getMinRows());
            }
            g gVar4 = g.MARGIN;
            i = map.containsKey(gVar4) ? Integer.parseInt(map.get(gVar4).toString()) : 30;
            g gVar5 = g.ERROR_CORRECTION;
            i = map.containsKey(gVar5) ? Integer.parseInt(map.get(gVar5).toString()) : 2;
            g gVar6 = g.CHARACTER_SET;
            if (map.containsKey(gVar6)) {
                eVar.setEncoding(Charset.forName(map.get(gVar6).toString()));
            }
        }
        return a(eVar, str, i, i8, i9, i);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }
}
