package W3;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class r implements F3.o {
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private F3.q a(F3.c r22, java.util.Map r23) throws F3.m {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.r.a(F3.c, java.util.Map):F3.q");
    }

    protected static float b(int[] iArr, int[] iArr2, float f8) {
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            i8 += iArr[i10];
            i9 += iArr2[i10];
        }
        if (i8 < i9) {
            return Float.POSITIVE_INFINITY;
        }
        float f9 = i8;
        float f10 = f9 / i9;
        float f11 = f8 * f10;
        float f12 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            float f13 = iArr2[i11] * f10;
            float f14 = iArr[i11];
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f9;
    }

    protected static void c(M3.a aVar, int i8, int[] iArr) throws F3.m {
        int length = iArr.length;
        int i9 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = aVar.getSize();
        if (i8 >= size) {
            throw F3.m.getNotFoundInstance();
        }
        boolean z8 = !aVar.get(i8);
        while (i8 < size) {
            if (!(aVar.get(i8) ^ z8)) {
                i9++;
                if (i9 == length) {
                    break;
                }
                iArr[i9] = 1;
                z8 = !z8;
            } else {
                iArr[i9] = iArr[i9] + 1;
            }
            i8++;
        }
        if (i9 != length) {
            if (i9 != length - 1 || i8 != size) {
                throw F3.m.getNotFoundInstance();
            }
        }
    }

    protected static void d(M3.a aVar, int i8, int[] iArr) throws F3.m {
        int length = iArr.length;
        boolean z8 = aVar.get(i8);
        while (i8 > 0 && length >= 0) {
            i8--;
            if (aVar.get(i8) != z8) {
                length--;
                z8 = !z8;
            }
        }
        if (length >= 0) {
            throw F3.m.getNotFoundInstance();
        }
        c(aVar, i8 + 1, iArr);
    }

    @Override // F3.o
    public F3.q decode(F3.c cVar) {
        return decode(cVar, null);
    }

    public abstract F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map);

    @Override // F3.o
    public F3.q decode(F3.c cVar, Map<F3.e, ?> map) throws F3.m {
        try {
            return a(cVar, map);
        } catch (F3.m e8) {
            if (map == null || !map.containsKey(F3.e.TRY_HARDER) || !cVar.isRotateSupported()) {
                throw e8;
            }
            F3.c cVarRotateCounterClockwise = cVar.rotateCounterClockwise();
            F3.q qVarA = a(cVarRotateCounterClockwise, map);
            Map<F3.r, Object> resultMetadata = qVarA.getResultMetadata();
            int iIntValue = 270;
            if (resultMetadata != null) {
                F3.r rVar = F3.r.ORIENTATION;
                if (resultMetadata.containsKey(rVar)) {
                    iIntValue = (((Integer) resultMetadata.get(rVar)).intValue() + 270) % 360;
                }
            }
            qVarA.putMetadata(F3.r.ORIENTATION, Integer.valueOf(iIntValue));
            F3.s[] resultPoints = qVarA.getResultPoints();
            if (resultPoints != null) {
                int height = cVarRotateCounterClockwise.getHeight();
                for (int i8 = 0; i8 < resultPoints.length; i8++) {
                    resultPoints[i8] = new F3.s((height - resultPoints[i8].getY()) - 1.0f, resultPoints[i8].getX());
                }
            }
            return qVarA;
        }
    }

    @Override // F3.o
    public void reset() {
    }
}
