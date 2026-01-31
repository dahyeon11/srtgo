package Q3;

import F3.h;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f4017a;

    /* renamed from: b, reason: collision with root package name */
    private final M3.b f4018b;

    /* renamed from: c, reason: collision with root package name */
    private final e f4019c;

    a(M3.b bVar) throws h {
        int height = bVar.getHeight();
        if (height < 8 || height > 144 || (height & 1) != 0) {
            throw h.getFormatInstance();
        }
        this.f4019c = j(bVar);
        M3.b bVarA = a(bVar);
        this.f4017a = bVarA;
        this.f4018b = new M3.b(bVarA.getWidth(), bVarA.getHeight());
    }

    private M3.b a(M3.b bVar) {
        int symbolSizeRows = this.f4019c.getSymbolSizeRows();
        int symbolSizeColumns = this.f4019c.getSymbolSizeColumns();
        if (bVar.getHeight() != symbolSizeRows) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int dataRegionSizeRows = this.f4019c.getDataRegionSizeRows();
        int dataRegionSizeColumns = this.f4019c.getDataRegionSizeColumns();
        int i8 = symbolSizeRows / dataRegionSizeRows;
        int i9 = symbolSizeColumns / dataRegionSizeColumns;
        M3.b bVar2 = new M3.b(i9 * dataRegionSizeColumns, i8 * dataRegionSizeRows);
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i10 * dataRegionSizeRows;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = i12 * dataRegionSizeColumns;
                for (int i14 = 0; i14 < dataRegionSizeRows; i14++) {
                    int i15 = ((dataRegionSizeRows + 2) * i10) + 1 + i14;
                    int i16 = i11 + i14;
                    for (int i17 = 0; i17 < dataRegionSizeColumns; i17++) {
                        if (bVar.get(((dataRegionSizeColumns + 2) * i12) + 1 + i17, i15)) {
                            bVar2.set(i13 + i17, i16);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    private int d(int i8, int i9) {
        int i10 = i8 - 1;
        int i11 = (h(i10, 0, i8, i9) ? 1 : 0) << 1;
        if (h(i10, 1, i8, i9)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i10, 2, i8, i9)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(0, i9 - 2, i8, i9)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        int i15 = i9 - 1;
        if (h(0, i15, i8, i9)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        if (h(1, i15, i8, i9)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (h(2, i15, i8, i9)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        return h(3, i15, i8, i9) ? i18 | 1 : i18;
    }

    private int e(int i8, int i9) {
        int i10 = (h(i8 + (-3), 0, i8, i9) ? 1 : 0) << 1;
        if (h(i8 - 2, 0, i8, i9)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(i8 - 1, 0, i8, i9)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(0, i9 - 4, i8, i9)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(0, i9 - 3, i8, i9)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i9 - 2, i8, i9)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i9 - 1;
        if (h(0, i16, i8, i9)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        return h(1, i16, i8, i9) ? i17 | 1 : i17;
    }

    private int f(int i8, int i9) {
        int i10 = i8 - 1;
        int i11 = (h(i10, 0, i8, i9) ? 1 : 0) << 1;
        int i12 = i9 - 1;
        if (h(i10, i12, i8, i9)) {
            i11 |= 1;
        }
        int i13 = i11 << 1;
        int i14 = i9 - 3;
        if (h(0, i14, i8, i9)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i9 - 2;
        if (h(0, i16, i8, i9)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(0, i12, i8, i9)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(1, i14, i8, i9)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(1, i16, i8, i9)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(1, i12, i8, i9) ? i20 | 1 : i20;
    }

    private int g(int i8, int i9) {
        int i10 = (h(i8 + (-3), 0, i8, i9) ? 1 : 0) << 1;
        if (h(i8 - 2, 0, i8, i9)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(i8 - 1, 0, i8, i9)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(0, i9 - 2, i8, i9)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        int i14 = i9 - 1;
        if (h(0, i14, i8, i9)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        if (h(1, i14, i8, i9)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(2, i14, i8, i9)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        return h(3, i14, i8, i9) ? i17 | 1 : i17;
    }

    private boolean h(int i8, int i9, int i10, int i11) {
        if (i8 < 0) {
            i8 += i10;
            i9 += 4 - ((i10 + 4) & 7);
        }
        if (i9 < 0) {
            i9 += i11;
            i8 += 4 - ((i11 + 4) & 7);
        }
        this.f4018b.set(i9, i8);
        return this.f4017a.get(i9, i8);
    }

    private int i(int i8, int i9, int i10, int i11) {
        int i12 = i8 - 2;
        int i13 = i9 - 2;
        int i14 = (h(i12, i13, i10, i11) ? 1 : 0) << 1;
        int i15 = i9 - 1;
        if (h(i12, i15, i10, i11)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        int i17 = i8 - 1;
        if (h(i17, i13, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(i17, i15, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(i17, i9, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(i8, i13, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i8, i15, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(i8, i9, i10, i11) ? i22 | 1 : i22;
    }

    private static e j(M3.b bVar) {
        return e.getVersionForDimensions(bVar.getHeight(), bVar.getWidth());
    }

    e b() {
        return this.f4019c;
    }

    byte[] c() throws h {
        byte[] bArr = new byte[this.f4019c.getTotalCodewords()];
        int height = this.f4017a.getHeight();
        int width = this.f4017a.getWidth();
        int i8 = 0;
        boolean z8 = false;
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 4;
        while (true) {
            if (i10 == height && i8 == 0 && !z8) {
                bArr[i9] = (byte) d(height, width);
                i10 -= 2;
                i8 += 2;
                i9++;
                z8 = true;
            } else {
                int i11 = height - 2;
                if (i10 == i11 && i8 == 0 && (width & 3) != 0 && !z9) {
                    bArr[i9] = (byte) e(height, width);
                    i10 -= 2;
                    i8 += 2;
                    i9++;
                    z9 = true;
                } else if (i10 == height + 4 && i8 == 2 && (width & 7) == 0 && !z10) {
                    bArr[i9] = (byte) f(height, width);
                    i10 -= 2;
                    i8 += 2;
                    i9++;
                    z10 = true;
                } else if (i10 == i11 && i8 == 0 && (width & 7) == 4 && !z11) {
                    bArr[i9] = (byte) g(height, width);
                    i10 -= 2;
                    i8 += 2;
                    i9++;
                    z11 = true;
                } else {
                    while (true) {
                        if (i10 < height && i8 >= 0 && !this.f4018b.get(i8, i10)) {
                            bArr[i9] = (byte) i(i10, i8, height, width);
                            i9++;
                        }
                        int i12 = i10 - 2;
                        int i13 = i8 + 2;
                        if (i12 < 0 || i13 >= width) {
                            break;
                        }
                        i10 = i12;
                        i8 = i13;
                    }
                    int i14 = i10 - 1;
                    int i15 = i8 + 5;
                    while (true) {
                        if (i14 >= 0 && i15 < width && !this.f4018b.get(i15, i14)) {
                            bArr[i9] = (byte) i(i14, i15, height, width);
                            i9++;
                        }
                        int i16 = i14 + 2;
                        int i17 = i15 - 2;
                        if (i16 >= height || i17 < 0) {
                            break;
                        }
                        i14 = i16;
                        i15 = i17;
                    }
                    i10 = i14 + 5;
                    i8 = i15 - 1;
                }
            }
            if (i10 >= height && i8 >= width) {
                break;
            }
        }
        if (i9 == this.f4019c.getTotalCodewords()) {
            return bArr;
        }
        throw h.getFormatInstance();
    }
}
