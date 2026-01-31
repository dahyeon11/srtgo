package i4;

/* renamed from: i4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5698d {
    static int a(C5696b c5696b) {
        return b(c5696b, true) + b(c5696b, false);
    }

    private static int b(C5696b c5696b, boolean z8) {
        int height = z8 ? c5696b.getHeight() : c5696b.getWidth();
        int width = z8 ? c5696b.getWidth() : c5696b.getHeight();
        byte[][] array = c5696b.getArray();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            byte b9 = -1;
            int i10 = 0;
            for (int i11 = 0; i11 < width; i11++) {
                byte b10 = z8 ? array[i9][i11] : array[i11][i9];
                if (b10 == b9) {
                    i10++;
                } else {
                    if (i10 >= 5) {
                        i8 += i10 - 2;
                    }
                    i10 = 1;
                    b9 = b10;
                }
            }
            if (i10 >= 5) {
                i8 += i10 - 2;
            }
        }
        return i8;
    }

    static int c(C5696b c5696b) {
        byte[][] array = c5696b.getArray();
        int width = c5696b.getWidth();
        int height = c5696b.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height - 1; i9++) {
            int i10 = 0;
            while (i10 < width - 1) {
                byte[] bArr = array[i9];
                byte b9 = bArr[i10];
                int i11 = i10 + 1;
                if (b9 == bArr[i11]) {
                    byte[] bArr2 = array[i9 + 1];
                    if (b9 == bArr2[i10] && b9 == bArr2[i11]) {
                        i8++;
                    }
                }
                i10 = i11;
            }
        }
        return i8 * 3;
    }

    static int d(C5696b c5696b) {
        byte[][] array = c5696b.getArray();
        int width = c5696b.getWidth();
        int height = c5696b.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            for (int i10 = 0; i10 < width; i10++) {
                byte[] bArr = array[i9];
                int i11 = i10 + 6;
                if (i11 < width && bArr[i10] == 1 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 1 && bArr[i10 + 3] == 1 && bArr[i10 + 4] == 1 && bArr[i10 + 5] == 0 && bArr[i11] == 1 && (g(bArr, i10 - 4, i10) || g(bArr, i10 + 7, i10 + 11))) {
                    i8++;
                }
                int i12 = i9 + 6;
                if (i12 < height && array[i9][i10] == 1 && array[i9 + 1][i10] == 0 && array[i9 + 2][i10] == 1 && array[i9 + 3][i10] == 1 && array[i9 + 4][i10] == 1 && array[i9 + 5][i10] == 0 && array[i12][i10] == 1 && (h(array, i10, i9 - 4, i9) || h(array, i10, i9 + 7, i9 + 11))) {
                    i8++;
                }
            }
        }
        return i8 * 40;
    }

    static int e(C5696b c5696b) {
        byte[][] array = c5696b.getArray();
        int width = c5696b.getWidth();
        int height = c5696b.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            byte[] bArr = array[i9];
            for (int i10 = 0; i10 < width; i10++) {
                if (bArr[i10] == 1) {
                    i8++;
                }
            }
        }
        int height2 = c5696b.getHeight() * c5696b.getWidth();
        return ((Math.abs((i8 << 1) - height2) * 10) / height2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L34;
                case 1: goto L35;
                case 2: goto L3c;
                case 3: goto L38;
                case 4: goto L30;
                case 5: goto L29;
                case 6: goto L22;
                case 7: goto L18;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid mask pattern: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L18:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L20:
            r1 = r1 & r0
            goto L3e
        L22:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L20
        L29:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L3e
        L30:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L34:
            int r3 = r3 + r2
        L35:
            r1 = r3 & 1
            goto L3e
        L38:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L3e
        L3c:
            int r1 = r2 % 3
        L3e:
            if (r1 != 0) goto L41
            return r0
        L41:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC5698d.f(int, int, int):boolean");
    }

    private static boolean g(byte[] bArr, int i8, int i9) {
        int iMin = Math.min(i9, bArr.length);
        for (int iMax = Math.max(i8, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i8, int i9, int i10) {
        int iMin = Math.min(i10, bArr.length);
        for (int iMax = Math.max(i9, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i8] == 1) {
                return false;
            }
        }
        return true;
    }
}
