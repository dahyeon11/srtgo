package J3;

/* loaded from: classes2.dex */
public abstract class c {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f2581a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(M3.a aVar, int i8, int i9) {
        int[] iArr = new int[i9];
        int size = aVar.getSize() / i8;
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 |= aVar.get((i10 * i8) + i12) ? 1 << ((i8 - i12) - 1) : 0;
            }
            iArr[i10] = i11;
        }
        return iArr;
    }

    private static void b(M3.b bVar, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10 += 2) {
            int i11 = i8 - i10;
            int i12 = i11;
            while (true) {
                int i13 = i8 + i10;
                if (i12 <= i13) {
                    bVar.set(i12, i11);
                    bVar.set(i12, i13);
                    bVar.set(i11, i12);
                    bVar.set(i13, i12);
                    i12++;
                }
            }
        }
        int i14 = i8 - i9;
        bVar.set(i14, i14);
        int i15 = i14 + 1;
        bVar.set(i15, i14);
        bVar.set(i14, i15);
        int i16 = i8 + i9;
        bVar.set(i16, i14);
        bVar.set(i16, i15);
        bVar.set(i16, i16 - 1);
    }

    private static void c(M3.b bVar, boolean z8, int i8, M3.a aVar) {
        int i9 = i8 / 2;
        int i10 = 0;
        if (z8) {
            while (i10 < 7) {
                int i11 = (i9 - 3) + i10;
                if (aVar.get(i10)) {
                    bVar.set(i11, i9 - 5);
                }
                if (aVar.get(i10 + 7)) {
                    bVar.set(i9 + 5, i11);
                }
                if (aVar.get(20 - i10)) {
                    bVar.set(i11, i9 + 5);
                }
                if (aVar.get(27 - i10)) {
                    bVar.set(i9 - 5, i11);
                }
                i10++;
            }
            return;
        }
        while (i10 < 10) {
            int i12 = (i9 - 5) + i10 + (i10 / 5);
            if (aVar.get(i10)) {
                bVar.set(i12, i9 - 7);
            }
            if (aVar.get(i10 + 10)) {
                bVar.set(i9 + 7, i12);
            }
            if (aVar.get(29 - i10)) {
                bVar.set(i12, i9 + 7);
            }
            if (aVar.get(39 - i10)) {
                bVar.set(i9 - 7, i12);
            }
            i10++;
        }
    }

    private static M3.a d(M3.a aVar, int i8, int i9) {
        int size = aVar.getSize() / i9;
        O3.d dVar = new O3.d(f(i9));
        int i10 = i8 / i9;
        int[] iArrA = a(aVar, i9, i10);
        dVar.encode(iArrA, i10 - size);
        M3.a aVar2 = new M3.a();
        aVar2.appendBits(0, i8 % i9);
        for (int i11 : iArrA) {
            aVar2.appendBits(i11, i9);
        }
        return aVar2;
    }

    static M3.a e(boolean z8, int i8, int i9) {
        M3.a aVar = new M3.a();
        if (z8) {
            aVar.appendBits(i8 - 1, 2);
            aVar.appendBits(i9 - 1, 6);
            return d(aVar, 28, 4);
        }
        aVar.appendBits(i8 - 1, 5);
        aVar.appendBits(i9 - 1, 11);
        return d(aVar, 40, 4);
    }

    public static a encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    private static O3.a f(int i8) {
        if (i8 == 4) {
            return O3.a.AZTEC_PARAM;
        }
        if (i8 == 6) {
            return O3.a.AZTEC_DATA_6;
        }
        if (i8 == 8) {
            return O3.a.AZTEC_DATA_8;
        }
        if (i8 == 10) {
            return O3.a.AZTEC_DATA_10;
        }
        if (i8 == 12) {
            return O3.a.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size " + i8);
    }

    static M3.a g(M3.a aVar, int i8) {
        M3.a aVar2 = new M3.a();
        int size = aVar.getSize();
        int i9 = (1 << i8) - 2;
        int i10 = 0;
        while (i10 < size) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = i10 + i12;
                if (i13 >= size || aVar.get(i13)) {
                    i11 |= 1 << ((i8 - 1) - i12);
                }
            }
            int i14 = i11 & i9;
            if (i14 == i9) {
                aVar2.appendBits(i14, i8);
            } else if (i14 == 0) {
                aVar2.appendBits(i11 | 1, i8);
            } else {
                aVar2.appendBits(i11, i8);
                i10 += i8;
            }
            i10--;
            i10 += i8;
        }
        return aVar2;
    }

    private static int h(int i8, boolean z8) {
        return ((z8 ? 88 : 112) + (i8 << 4)) * i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a encode(byte[] bArr, int i8, int i9) {
        int i10;
        M3.a aVarG;
        boolean z8;
        int iAbs;
        int iH;
        int i11;
        int i12;
        M3.a aVarEncode = new d(bArr).encode();
        int size = ((aVarEncode.getSize() * i8) / 100) + 11;
        int size2 = aVarEncode.getSize() + size;
        int i13 = 1;
        if (i9 == 0) {
            M3.a aVarG2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 <= 32) {
                boolean z9 = i14 <= 3 ? i13 : 0;
                int i16 = z9 != 0 ? i14 + 1 : i14;
                int iH2 = h(i16, z9);
                if (size2 <= iH2) {
                    int i17 = f2581a[i16];
                    if (i15 != i17) {
                        aVarG2 = g(aVarEncode, i17);
                    } else {
                        i17 = i15;
                    }
                    int i18 = iH2 - (iH2 % i17);
                    if ((z9 == 0 || aVarG2.getSize() <= (i17 << 6)) && aVarG2.getSize() + size <= i18) {
                        aVarG = aVarG2;
                        z8 = z9;
                        iAbs = i16;
                        iH = iH2;
                        i11 = i17;
                    } else {
                        i10 = i13;
                        i15 = i17;
                    }
                } else {
                    i10 = i13;
                }
                i14++;
                i13 = i10;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z8 = i9 < 0;
        iAbs = Math.abs(i9);
        if (iAbs > (z8 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i9)));
        }
        iH = h(iAbs, z8);
        i11 = f2581a[iAbs];
        int i19 = iH - (iH % i11);
        aVarG = g(aVarEncode, i11);
        if (aVarG.getSize() + size > i19) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z8 && aVarG.getSize() > (i11 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        M3.a aVarD = d(aVarG, iH, i11);
        int size3 = aVarG.getSize() / i11;
        M3.a aVarE = e(z8, iAbs, size3);
        int i20 = (z8 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i20];
        int i21 = 2;
        if (z8) {
            for (int i22 = 0; i22 < i20; i22++) {
                iArr[i22] = i22;
            }
            i12 = i20;
        } else {
            int i23 = i20 / 2;
            i12 = i20 + 1 + (((i23 - 1) / 15) * 2);
            int i24 = i12 / 2;
            for (int i25 = 0; i25 < i23; i25++) {
                iArr[(i23 - i25) - i13] = (i24 - r14) - 1;
                iArr[i23 + i25] = (i25 / 15) + i25 + i24 + i13;
            }
        }
        M3.b bVar = new M3.b(i12);
        int i26 = 0;
        int i27 = 0;
        while (i26 < iAbs) {
            int i28 = ((iAbs - i26) << i21) + (z8 ? 9 : 12);
            int i29 = 0;
            while (i29 < i28) {
                int i30 = i29 << 1;
                int i31 = 0;
                while (i31 < i21) {
                    if (aVarD.get(i27 + i30 + i31)) {
                        int i32 = i26 << 1;
                        bVar.set(iArr[i32 + i31], iArr[i32 + i29]);
                    }
                    if (aVarD.get((i28 << 1) + i27 + i30 + i31)) {
                        int i33 = i26 << 1;
                        bVar.set(iArr[i33 + i29], iArr[((i20 - 1) - i33) - i31]);
                    }
                    if (aVarD.get((i28 << 2) + i27 + i30 + i31)) {
                        int i34 = (i20 - 1) - (i26 << 1);
                        bVar.set(iArr[i34 - i31], iArr[i34 - i29]);
                    }
                    if (aVarD.get((i28 * 6) + i27 + i30 + i31)) {
                        int i35 = i26 << 1;
                        bVar.set(iArr[((i20 - 1) - i35) - i29], iArr[i35 + i31]);
                    }
                    i31++;
                    i21 = 2;
                }
                i29++;
                i21 = 2;
            }
            i27 += i28 << 3;
            i26++;
            i21 = 2;
        }
        c(bVar, z8, i12, aVarE);
        if (z8) {
            b(bVar, i12 / 2, 5);
        } else {
            int i36 = i12 / 2;
            b(bVar, i36, 7);
            int i37 = 0;
            int i38 = 0;
            while (i38 < (i20 / 2) - 1) {
                for (int i39 = i36 & 1; i39 < i12; i39 += 2) {
                    int i40 = i36 - i37;
                    bVar.set(i40, i39);
                    int i41 = i36 + i37;
                    bVar.set(i41, i39);
                    bVar.set(i39, i40);
                    bVar.set(i39, i41);
                }
                i38 += 15;
                i37 += 16;
            }
        }
        a aVar = new a();
        aVar.setCompact(z8);
        aVar.setSize(i12);
        aVar.setLayers(iAbs);
        aVar.setCodeWords(size3);
        aVar.setMatrix(bVar);
        return aVar;
    }
}
