package M3;

/* loaded from: classes2.dex */
public final class j extends h {

    /* renamed from: e, reason: collision with root package name */
    private b f3124e;

    public j(F3.j jVar) {
        super(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[PHI: r4
  0x008c: PHI (r4v5 int) = (r4v4 int), (r4v8 int), (r4v8 int) binds: [B:32:0x006c, B:34:0x0070, B:35:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[][] c(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.j.c(byte[], int, int, int, int):int[][]");
    }

    private static void d(byte[] bArr, int i8, int i9, int i10, int i11, int[][] iArr, b bVar) {
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = i12 << 3;
            int i14 = i11 - 8;
            if (i13 > i14) {
                i13 = i14;
            }
            for (int i15 = 0; i15 < i8; i15++) {
                int i16 = i15 << 3;
                int i17 = i10 - 8;
                if (i16 <= i17) {
                    i17 = i16;
                }
                int iE = e(i15, 2, i8 - 3);
                int iE2 = e(i12, 2, i9 - 3);
                int i18 = 0;
                for (int i19 = -2; i19 <= 2; i19++) {
                    int[] iArr2 = iArr[iE2 + i19];
                    i18 += iArr2[iE - 2] + iArr2[iE - 1] + iArr2[iE] + iArr2[iE + 1] + iArr2[iE + 2];
                }
                f(bArr, i17, i13, i18 / 25, i10, bVar);
            }
        }
    }

    private static int e(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
    }

    private static void f(byte[] bArr, int i8, int i9, int i10, int i11, b bVar) {
        int i12 = (i9 * i11) + i8;
        int i13 = 0;
        while (i13 < 8) {
            for (int i14 = 0; i14 < 8; i14++) {
                if ((bArr[i12 + i14] & 255) <= i10) {
                    bVar.set(i8 + i14, i9 + i13);
                }
            }
            i13++;
            i12 += i11;
        }
    }

    @Override // M3.h, F3.b
    public F3.b createBinarizer(F3.j jVar) {
        return new j(jVar);
    }

    @Override // M3.h, F3.b
    public b getBlackMatrix() {
        b bVar = this.f3124e;
        if (bVar != null) {
            return bVar;
        }
        F3.j luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            this.f3124e = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i8 = width >> 3;
            if ((width & 7) != 0) {
                i8++;
            }
            int i9 = i8;
            int i10 = height >> 3;
            if ((height & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int[][] iArrC = c(matrix, i9, i11, width, height);
            b bVar2 = new b(width, height);
            d(matrix, i9, i11, width, height, iArrC, bVar2);
            this.f3124e = bVar2;
        }
        return this.f3124e;
    }
}
