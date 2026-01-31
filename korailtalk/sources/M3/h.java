package M3;

import F3.m;

/* loaded from: classes2.dex */
public class h extends F3.b {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f3120d = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private byte[] f3121b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f3122c;

    public h(F3.j jVar) {
        super(jVar);
        this.f3121b = f3120d;
        this.f3122c = new int[32];
    }

    private static int a(int[] iArr) throws m {
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i8) {
                i10 = i11;
                i8 = i12;
            }
            if (i12 > i9) {
                i9 = i12;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 - i10;
            int i17 = iArr[i15] * i16 * i16;
            if (i17 > i14) {
                i13 = i15;
                i14 = i17;
            }
        }
        if (i10 <= i13) {
            int i18 = i10;
            i10 = i13;
            i13 = i18;
        }
        if (i10 - i13 <= length / 16) {
            throw m.getNotFoundInstance();
        }
        int i19 = i10 - 1;
        int i20 = -1;
        int i21 = i19;
        while (i19 > i13) {
            int i22 = i19 - i13;
            int i23 = i22 * i22 * (i10 - i19) * (i9 - iArr[i19]);
            if (i23 > i20) {
                i21 = i19;
                i20 = i23;
            }
            i19--;
        }
        return i21 << 3;
    }

    private void b(int i8) {
        if (this.f3121b.length < i8) {
            this.f3121b = new byte[i8];
        }
        for (int i9 = 0; i9 < 32; i9++) {
            this.f3122c[i9] = 0;
        }
    }

    @Override // F3.b
    public F3.b createBinarizer(F3.j jVar) {
        return new h(jVar);
    }

    @Override // F3.b
    public b getBlackMatrix() throws m {
        F3.j luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        b bVar = new b(width, height);
        b(width);
        int[] iArr = this.f3122c;
        for (int i8 = 1; i8 < 5; i8++) {
            byte[] row = luminanceSource.getRow((height * i8) / 5, this.f3121b);
            int i9 = (width << 2) / 5;
            for (int i10 = width / 5; i10 < i9; i10++) {
                int i11 = (row[i10] & 255) >> 3;
                iArr[i11] = iArr[i11] + 1;
            }
        }
        int iA = a(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = i12 * width;
            for (int i14 = 0; i14 < width; i14++) {
                if ((matrix[i13 + i14] & 255) < iA) {
                    bVar.set(i14, i12);
                }
            }
        }
        return bVar;
    }

    @Override // F3.b
    public a getBlackRow(int i8, a aVar) throws m {
        F3.j luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (aVar == null || aVar.getSize() < width) {
            aVar = new a(width);
        } else {
            aVar.clear();
        }
        b(width);
        byte[] row = luminanceSource.getRow(i8, this.f3121b);
        int[] iArr = this.f3122c;
        for (int i9 = 0; i9 < width; i9++) {
            int i10 = (row[i9] & 255) >> 3;
            iArr[i10] = iArr[i10] + 1;
        }
        int iA = a(iArr);
        if (width < 3) {
            for (int i11 = 0; i11 < width; i11++) {
                if ((row[i11] & 255) < iA) {
                    aVar.set(i11);
                }
            }
        } else {
            int i12 = 1;
            int i13 = row[0] & 255;
            int i14 = row[1] & 255;
            while (i12 < width - 1) {
                int i15 = i12 + 1;
                int i16 = row[i15] & 255;
                if ((((i14 << 2) - i13) - i16) / 2 < iA) {
                    aVar.set(i12);
                }
                i13 = i14;
                i12 = i15;
                i14 = i16;
            }
        }
        return aVar;
    }
}
