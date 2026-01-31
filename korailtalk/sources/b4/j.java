package b4;

import F3.m;
import F3.s;
import a4.AbstractC0834a;
import c4.C1091a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final C1091a f11430a = new C1091a();

    private static c a(h hVar) {
        int[] iArrJ;
        if (hVar == null || (iArrJ = hVar.j()) == null) {
            return null;
        }
        int iO = o(iArrJ);
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArrJ) {
            i9 += iO - i10;
            if (i10 > 0) {
                break;
            }
        }
        d[] dVarArrD = hVar.d();
        for (int i11 = 0; i9 > 0 && dVarArrD[i11] == null; i11++) {
            i9--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            int i12 = iArrJ[length];
            i8 += iO - i12;
            if (i12 > 0) {
                break;
            }
        }
        for (int length2 = dVarArrD.length - 1; i8 > 0 && dVarArrD[length2] == null; length2--) {
            i8--;
        }
        return hVar.a().a(i9, i8, hVar.k());
    }

    private static void b(f fVar, C1079b[][] c1079bArr) throws m {
        int[] iArrA = c1079bArr[0][1].a();
        int iJ = (fVar.j() * fVar.l()) - q(fVar.k());
        if (iArrA.length != 0) {
            if (iArrA[0] != iJ) {
                c1079bArr[0][1].b(iJ);
            }
        } else {
            if (iJ <= 0 || iJ > 928) {
                throw m.getNotFoundInstance();
            }
            c1079bArr[0][1].b(iJ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r0 = -r0;
        r8 = !r8;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(M3.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.get(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.c(M3.b, int, int, boolean, int, int):int");
    }

    private static boolean d(int i8, int i9, int i10) {
        return i9 + (-2) <= i8 && i8 <= i10 + 2;
    }

    public static M3.e decode(M3.b bVar, s sVar, s sVar2, s sVar3, s sVar4, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        h hVarR = null;
        h hVarR2 = null;
        f fVarU = null;
        c cVar = new c(bVar, sVar, sVar2, sVar3, sVar4);
        for (int i14 = 0; i14 < 2; i14++) {
            if (sVar != null) {
                hVarR = r(bVar, cVar, sVar, true, i8, i9);
            }
            if (sVar3 != null) {
                hVarR2 = r(bVar, cVar, sVar3, false, i8, i9);
            }
            fVarU = u(hVarR, hVarR2);
            if (fVarU == null) {
                throw m.getNotFoundInstance();
            }
            if (i14 != 0 || fVarU.m() == null || (fVarU.m().h() >= cVar.h() && fVarU.m().f() <= cVar.f())) {
                fVarU.setBoundingBox(cVar);
                break;
            }
            cVar = fVarU.m();
        }
        int iJ = fVarU.j() + 1;
        fVarU.p(0, hVarR);
        fVarU.p(iJ, hVarR2);
        boolean z8 = hVarR != null;
        int iMin = i8;
        int iMax = i9;
        for (int i15 = 1; i15 <= iJ; i15++) {
            int i16 = z8 ? i15 : iJ - i15;
            if (fVarU.n(i16) == null) {
                g hVar = (i16 == 0 || i16 == iJ) ? new h(cVar, i16 == 0) : new g(cVar);
                fVarU.p(i16, hVar);
                int i17 = -1;
                int iH = cVar.h();
                int i18 = -1;
                while (iH <= cVar.f()) {
                    int iS = s(fVarU, i16, iH, z8);
                    if (iS >= 0 && iS <= cVar.e()) {
                        i13 = iS;
                    } else if (i18 != i17) {
                        i13 = i18;
                    } else {
                        i10 = i18;
                        i11 = iH;
                        i12 = i17;
                        i18 = i10;
                        iH = i11 + 1;
                        i17 = i12;
                    }
                    i10 = i18;
                    int i19 = iH;
                    i12 = i17;
                    d dVarJ = j(bVar, cVar.g(), cVar.e(), z8, i13, i19, iMin, iMax);
                    i11 = i19;
                    if (dVarJ != null) {
                        hVar.f(i11, dVarJ);
                        iMin = Math.min(iMin, dVarJ.f());
                        iMax = Math.max(iMax, dVarJ.f());
                        i18 = i13;
                    } else {
                        i18 = i10;
                    }
                    iH = i11 + 1;
                    i17 = i12;
                }
            }
        }
        return g(fVarU);
    }

    private static int e(int[] iArr, int[] iArr2, int i8) throws F3.d {
        if ((iArr2 == null || iArr2.length <= (i8 / 2) + 3) && i8 >= 0 && i8 <= 512) {
            return f11430a.decode(iArr, i8, iArr2);
        }
        throw F3.d.getChecksumInstance();
    }

    private static C1079b[][] f(f fVar) {
        int iC;
        C1079b[][] c1079bArr = (C1079b[][]) Array.newInstance((Class<?>) C1079b.class, fVar.l(), fVar.j() + 2);
        for (C1079b[] c1079bArr2 : c1079bArr) {
            int i8 = 0;
            while (true) {
                if (i8 < c1079bArr2.length) {
                    c1079bArr2[i8] = new C1079b();
                    i8++;
                }
            }
        }
        int i9 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < c1079bArr.length) {
                        c1079bArr[iC][i9].b(dVar.e());
                    }
                }
            }
            i9++;
        }
        return c1079bArr;
    }

    private static M3.e g(f fVar) throws m {
        C1079b[][] c1079bArrF = f(fVar);
        b(fVar, c1079bArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 0; i8 < fVar.l(); i8++) {
            int i9 = 0;
            while (i9 < fVar.j()) {
                int i10 = i9 + 1;
                int[] iArrA = c1079bArrF[i8][i10].a();
                int iJ = (fVar.j() * i8) + i9;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrA.length == 1) {
                    iArr[iJ] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrA);
                }
                i9 = i10;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = (int[]) arrayList2.get(i11);
        }
        return h(fVar.k(), iArr, AbstractC0834a.toIntArray(arrayList), AbstractC0834a.toIntArray(arrayList3), iArr2);
    }

    private static M3.e h(int i8, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws F3.d {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i9 = 100;
        while (true) {
            int i10 = i9 - 1;
            if (i9 <= 0) {
                throw F3.d.getChecksumInstance();
            }
            for (int i11 = 0; i11 < length; i11++) {
                iArr[iArr3[i11]] = iArr4[i11][iArr5[i11]];
            }
            try {
                return i(iArr, i8, iArr2);
            } catch (F3.d unused) {
                if (length == 0) {
                    throw F3.d.getChecksumInstance();
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    int i13 = iArr5[i12];
                    if (i13 < iArr4[i12].length - 1) {
                        iArr5[i12] = i13 + 1;
                        break;
                    }
                    iArr5[i12] = 0;
                    if (i12 == length - 1) {
                        throw F3.d.getChecksumInstance();
                    }
                    i12++;
                }
                i9 = i10;
            }
        }
    }

    private static M3.e i(int[] iArr, int i8, int[] iArr2) throws F3.d, F3.h {
        if (iArr.length == 0) {
            throw F3.h.getFormatInstance();
        }
        int i9 = 1 << (i8 + 1);
        int iE = e(iArr, iArr2, i9);
        v(iArr, i9);
        M3.e eVarB = e.b(iArr, String.valueOf(i8));
        eVarB.setErrorsCorrected(Integer.valueOf(iE));
        eVarB.setErasures(Integer.valueOf(iArr2.length));
        return eVarB;
    }

    private static d j(M3.b bVar, int i8, int i9, boolean z8, int i10, int i11, int i12, int i13) {
        int i14;
        int iD;
        int codeword;
        int iC = c(bVar, i8, i9, z8, i10, i11);
        int[] iArrP = p(bVar, i8, i9, z8, iC, i11);
        if (iArrP == null) {
            return null;
        }
        int iSum = N3.a.sum(iArrP);
        if (z8) {
            i14 = iC + iSum;
        } else {
            for (int i15 = 0; i15 < iArrP.length / 2; i15++) {
                int i16 = iArrP[i15];
                iArrP[i15] = iArrP[(iArrP.length - 1) - i15];
                iArrP[(iArrP.length - 1) - i15] = i16;
            }
            iC -= iSum;
            i14 = iC;
        }
        if (d(iSum, i12, i13) && (codeword = AbstractC0834a.getCodeword((iD = i.d(iArrP)))) != -1) {
            return new d(iC, i14, m(iD), codeword);
        }
        return null;
    }

    private static C1078a k(h hVar, h hVar2) {
        C1078a c1078aI;
        C1078a c1078aI2;
        if (hVar == null || (c1078aI = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (c1078aI2 = hVar2.i()) == null || c1078aI.a() == c1078aI2.a() || c1078aI.b() == c1078aI2.b() || c1078aI.c() == c1078aI2.c()) {
            return c1078aI;
        }
        return null;
    }

    private static int[] l(int i8) {
        int[] iArr = new int[8];
        int i9 = 0;
        int i10 = 7;
        while (true) {
            int i11 = i8 & 1;
            if (i11 != i9) {
                i10--;
                if (i10 < 0) {
                    return iArr;
                }
                i9 = i11;
            }
            iArr[i10] = iArr[i10] + 1;
            i8 >>= 1;
        }
    }

    private static int m(int i8) {
        return n(l(i8));
    }

    private static int n(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int o(int[] iArr) {
        int iMax = -1;
        for (int i8 : iArr) {
            iMax = Math.max(iMax, i8);
        }
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] p(M3.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.get(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.p(M3.b, int, int, boolean, int, int):int[]");
    }

    private static int q(int i8) {
        return 2 << i8;
    }

    private static h r(M3.b bVar, c cVar, s sVar, boolean z8, int i8, int i9) {
        h hVar = new h(cVar, z8);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = i10 == 0 ? 1 : -1;
            int x8 = (int) sVar.getX();
            for (int y8 = (int) sVar.getY(); y8 <= cVar.f() && y8 >= cVar.h(); y8 += i11) {
                d dVarJ = j(bVar, 0, bVar.getWidth(), z8, x8, y8, i8, i9);
                if (dVarJ != null) {
                    hVar.f(y8, dVarJ);
                    x8 = z8 ? dVarJ.d() : dVarJ.b();
                }
            }
            i10++;
        }
        return hVar;
    }

    private static int s(f fVar, int i8, int i9, boolean z8) {
        int i10 = z8 ? 1 : -1;
        int i11 = i8 - i10;
        d dVarB = t(fVar, i11) ? fVar.n(i11).b(i9) : null;
        if (dVarB != null) {
            return z8 ? dVarB.b() : dVarB.d();
        }
        d dVarC = fVar.n(i8).c(i9);
        if (dVarC != null) {
            return z8 ? dVarC.d() : dVarC.b();
        }
        if (t(fVar, i11)) {
            dVarC = fVar.n(i11).c(i9);
        }
        if (dVarC != null) {
            return z8 ? dVarC.b() : dVarC.d();
        }
        int i12 = 0;
        while (true) {
            i8 -= i10;
            if (!t(fVar, i8)) {
                c cVarM = fVar.m();
                return z8 ? cVarM.g() : cVarM.e();
            }
            for (d dVar : fVar.n(i8).d()) {
                if (dVar != null) {
                    return (z8 ? dVar.b() : dVar.d()) + (i10 * i12 * (dVar.b() - dVar.d()));
                }
            }
            i12++;
        }
    }

    private static boolean t(f fVar, int i8) {
        return i8 >= 0 && i8 <= fVar.j() + 1;
    }

    public static String toString(C1079b[][] c1079bArr) {
        Formatter formatter = new Formatter();
        for (int i8 = 0; i8 < c1079bArr.length; i8++) {
            formatter.format("Row %2d: ", Integer.valueOf(i8));
            int i9 = 0;
            while (true) {
                C1079b[] c1079bArr2 = c1079bArr[i8];
                if (i9 < c1079bArr2.length) {
                    C1079b c1079b = c1079bArr2[i9];
                    if (c1079b.a().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", Integer.valueOf(c1079b.a()[0]), c1079b.getConfidence(c1079b.a()[0]));
                    }
                    i9++;
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private static f u(h hVar, h hVar2) {
        C1078a c1078aK;
        if ((hVar == null && hVar2 == null) || (c1078aK = k(hVar, hVar2)) == null) {
            return null;
        }
        return new f(c1078aK, c.l(a(hVar), a(hVar2)));
    }

    private static void v(int[] iArr, int i8) throws F3.h {
        if (iArr.length < 4) {
            throw F3.h.getFormatInstance();
        }
        int i9 = iArr[0];
        if (i9 > iArr.length) {
            throw F3.h.getFormatInstance();
        }
        if (i9 == 0) {
            if (i8 >= iArr.length) {
                throw F3.h.getFormatInstance();
            }
            iArr[0] = iArr.length - i8;
        }
    }
}
