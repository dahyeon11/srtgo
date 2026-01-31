package d4;

import F3.c;
import F3.e;
import F3.s;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5323a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f30035a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f30036b = {6, 2, 7, 3};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f30037c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f30038d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(s[] sVarArr, s[] sVarArr2, int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            sVarArr[iArr[i8]] = sVarArr2[i8];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = (F3.s[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.getY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.getY());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List b(boolean r8, M3.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.getHeight()
            if (r2 >= r5) goto L77
            F3.s[] r3 = e(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4f
            if (r4 == 0) goto L77
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            F3.s[] r4 = (F3.s[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3d
            float r2 = (float) r2
            float r7 = r7.getY()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3d:
            r4 = r4[r5]
            if (r4 == 0) goto L23
            float r4 = r4.getY()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L23
        L4b:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L4f:
            r0.add(r3)
            if (r8 == 0) goto L77
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L68
            float r4 = r4.getX()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.getY()
        L64:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L68:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.getX()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.getY()
            goto L64
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.AbstractC5323a.b(boolean, M3.b):java.util.List");
    }

    private static int[] c(M3.b bVar, int i8, int i9, int i10, boolean z8, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i11 = 0;
        while (bVar.get(i8, i9) && i8 > 0) {
            int i12 = i11 + 1;
            if (i11 >= 3) {
                break;
            }
            i8--;
            i11 = i12;
        }
        int length = iArr.length;
        boolean z9 = z8;
        int i13 = 0;
        int i14 = i8;
        while (i8 < i10) {
            if (bVar.get(i8, i9) ^ z9) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                int i15 = length - 1;
                if (i13 != i15) {
                    i13++;
                } else {
                    if (f(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i14, i8};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z9 = !z9;
            }
            i8++;
        }
        if (i13 != length - 1 || f(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i14, i8 - 1};
    }

    private static s[] d(M3.b bVar, int i8, int i9, int i10, int i11, int[] iArr) {
        int i12;
        boolean z8;
        int i13;
        int i14;
        s[] sVarArr = new s[4];
        int[] iArr2 = new int[iArr.length];
        int i15 = i10;
        while (true) {
            if (i15 >= i8) {
                z8 = false;
                break;
            }
            int[] iArrC = c(bVar, i11, i15, i9, false, iArr, iArr2);
            if (iArrC != null) {
                int i16 = i15;
                int[] iArr3 = iArrC;
                while (i16 > 0) {
                    int i17 = i16 - 1;
                    int[] iArrC2 = c(bVar, i11, i17, i9, false, iArr, iArr2);
                    if (iArrC2 == null) {
                        break;
                    }
                    iArr3 = iArrC2;
                    i16 = i17;
                }
                float f8 = i16;
                sVarArr[0] = new s(iArr3[0], f8);
                sVarArr[1] = new s(iArr3[1], f8);
                z8 = true;
                i15 = i16;
            } else {
                i15 += 5;
            }
        }
        int i18 = i15 + 1;
        if (z8) {
            int[] iArr4 = {(int) sVarArr[0].getX(), (int) sVarArr[1].getX()};
            int i19 = i18;
            int i20 = 0;
            while (true) {
                if (i19 >= i8) {
                    i13 = i20;
                    i14 = i19;
                    break;
                }
                i13 = i20;
                i14 = i19;
                int[] iArrC3 = c(bVar, iArr4[0], i19, i9, false, iArr, iArr2);
                if (iArrC3 != null && Math.abs(iArr4[0] - iArrC3[0]) < 5 && Math.abs(iArr4[1] - iArrC3[1]) < 5) {
                    iArr4 = iArrC3;
                    i20 = 0;
                } else {
                    if (i13 > 25) {
                        break;
                    }
                    i20 = i13 + 1;
                }
                i19 = i14 + 1;
            }
            i18 = i14 - (i13 + 1);
            float f9 = i18;
            sVarArr[2] = new s(iArr4[0], f9);
            sVarArr[3] = new s(iArr4[1], f9);
        }
        if (i18 - i15 < 10) {
            for (i12 = 0; i12 < 4; i12++) {
                sVarArr[i12] = null;
            }
        }
        return sVarArr;
    }

    public static C5324b detect(c cVar, Map<e, ?> map, boolean z8) {
        M3.b blackMatrix = cVar.getBlackMatrix();
        List listB = b(z8, blackMatrix);
        if (listB.isEmpty()) {
            blackMatrix = blackMatrix.m8clone();
            blackMatrix.rotate180();
            listB = b(z8, blackMatrix);
        }
        return new C5324b(blackMatrix, listB);
    }

    private static s[] e(M3.b bVar, int i8, int i9) {
        int height = bVar.getHeight();
        int width = bVar.getWidth();
        s[] sVarArr = new s[8];
        a(sVarArr, d(bVar, height, width, i8, i9, f30037c), f30035a);
        s sVar = sVarArr[4];
        if (sVar != null) {
            i9 = (int) sVar.getX();
            i8 = (int) sVarArr[4].getY();
        }
        a(sVarArr, d(bVar, height, width, i8, i9, f30038d), f30036b);
        return sVarArr;
    }

    private static float f(int[] iArr, int[] iArr2, float f8) {
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
}
