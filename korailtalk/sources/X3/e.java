package X3;

import F3.m;
import F3.q;
import F3.s;
import F3.t;
import W3.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f5446i = {1, 10, 34, 70, 126};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f5447j = {4, 20, 48, 81};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f5448k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f5449l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f5450m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f5451n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f5452o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g, reason: collision with root package name */
    private final List f5453g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f5454h = new ArrayList();

    private static void o(Collection collection, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.getValue() == dVar.getValue()) {
                dVar2.c();
                return;
            }
        }
        collection.add(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r6 r7
  0x002a: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r6 r7
  0x002d: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p(boolean r10, int r11) throws F3.m {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.e.p(boolean, int):void");
    }

    private static boolean q(d dVar, d dVar2) {
        int checksumPortion = (dVar.getChecksumPortion() + (dVar2.getChecksumPortion() * 16)) % 79;
        int value = (dVar.b().getValue() * 9) + dVar2.b().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return checksumPortion == value;
    }

    private static q r(d dVar, d dVar2) {
        String strValueOf = String.valueOf((dVar.getValue() * 4537077) + dVar2.getValue());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(strValueOf);
        int i8 = 0;
        for (int i9 = 0; i9 < 13; i9++) {
            int iCharAt = sb.charAt(i9) - '0';
            if ((i9 & 1) == 0) {
                iCharAt *= 3;
            }
            i8 += iCharAt;
        }
        int i10 = 10 - (i8 % 10);
        if (i10 == 10) {
            i10 = 0;
        }
        sb.append(i10);
        s[] resultPoints = dVar.b().getResultPoints();
        s[] resultPoints2 = dVar2.b().getResultPoints();
        return new q(String.valueOf(sb.toString()), null, new s[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, F3.a.RSS_14);
    }

    private b s(M3.a aVar, c cVar, boolean z8) throws m {
        int[] iArrF = f();
        iArrF[0] = 0;
        iArrF[1] = 0;
        iArrF[2] = 0;
        iArrF[3] = 0;
        iArrF[4] = 0;
        iArrF[5] = 0;
        iArrF[6] = 0;
        iArrF[7] = 0;
        if (z8) {
            r.d(aVar, cVar.getStartEnd()[0], iArrF);
        } else {
            r.c(aVar, cVar.getStartEnd()[1] + 1, iArrF);
            int i8 = 0;
            for (int length = iArrF.length - 1; i8 < length; length--) {
                int i9 = iArrF[i8];
                iArrF[i8] = iArrF[length];
                iArrF[length] = i9;
                i8++;
            }
        }
        int i10 = z8 ? 16 : 15;
        float fSum = N3.a.sum(iArrF) / i10;
        int[] iArrJ = j();
        int[] iArrH = h();
        float[] fArrK = k();
        float[] fArrI = i();
        for (int i11 = 0; i11 < iArrF.length; i11++) {
            float f8 = iArrF[i11] / fSum;
            int i12 = (int) (0.5f + f8);
            if (i12 <= 0) {
                i12 = 1;
            } else if (i12 > 8) {
                i12 = 8;
            }
            int i13 = i11 / 2;
            if ((i11 & 1) == 0) {
                iArrJ[i13] = i12;
                fArrK[i13] = f8 - i12;
            } else {
                iArrH[i13] = i12;
                fArrI[i13] = f8 - i12;
            }
        }
        p(z8, i10);
        int i14 = 0;
        int i15 = 0;
        for (int length2 = iArrJ.length - 1; length2 >= 0; length2--) {
            int i16 = iArrJ[length2];
            i14 = (i14 * 9) + i16;
            i15 += i16;
        }
        int i17 = 0;
        int i18 = 0;
        for (int length3 = iArrH.length - 1; length3 >= 0; length3--) {
            int i19 = iArrH[length3];
            i17 = (i17 * 9) + i19;
            i18 += i19;
        }
        int i20 = i14 + (i17 * 3);
        if (!z8) {
            if ((i18 & 1) != 0 || i18 > 10 || i18 < 4) {
                throw m.getNotFoundInstance();
            }
            int i21 = (10 - i18) / 2;
            int i22 = f5451n[i21];
            return new b((f.getRSSvalue(iArrH, 9 - i22, false) * f5447j[i21]) + f.getRSSvalue(iArrJ, i22, true) + f5449l[i21], i20);
        }
        if ((i15 & 1) != 0 || i15 > 12 || i15 < 4) {
            throw m.getNotFoundInstance();
        }
        int i23 = (12 - i15) / 2;
        int i24 = f5450m[i23];
        return new b((f.getRSSvalue(iArrJ, i24, false) * f5446i[i23]) + f.getRSSvalue(iArrH, 9 - i24, true) + f5448k[i23], i20);
    }

    private d t(M3.a aVar, boolean z8, int i8, Map map) {
        try {
            c cVarV = v(aVar, i8, z8, u(aVar, 0, z8));
            t tVar = map == null ? null : (t) map.get(F3.e.NEED_RESULT_POINT_CALLBACK);
            if (tVar != null) {
                float size = (r2[0] + r2[1]) / 2.0f;
                if (z8) {
                    size = (aVar.getSize() - 1) - size;
                }
                tVar.foundPossibleResultPoint(new s(size, i8));
            }
            b bVarS = s(aVar, cVarV, true);
            b bVarS2 = s(aVar, cVarV, false);
            return new d((bVarS.getValue() * 1597) + bVarS2.getValue(), bVarS.getChecksumPortion() + (bVarS2.getChecksumPortion() * 4), cVarV);
        } catch (m unused) {
            return null;
        }
    }

    private int[] u(M3.a aVar, int i8, boolean z8) throws m {
        int[] iArrG = g();
        iArrG[0] = 0;
        iArrG[1] = 0;
        iArrG[2] = 0;
        iArrG[3] = 0;
        int size = aVar.getSize();
        boolean z9 = false;
        while (i8 < size) {
            z9 = !aVar.get(i8);
            if (z8 == z9) {
                break;
            }
            i8++;
        }
        int i9 = i8;
        int i10 = 0;
        while (i8 < size) {
            if (aVar.get(i8) ^ z9) {
                iArrG[i10] = iArrG[i10] + 1;
            } else {
                if (i10 != 3) {
                    i10++;
                } else {
                    if (a.m(iArrG)) {
                        return new int[]{i9, i8};
                    }
                    i9 += iArrG[0] + iArrG[1];
                    iArrG[0] = iArrG[2];
                    iArrG[1] = iArrG[3];
                    iArrG[2] = 0;
                    iArrG[3] = 0;
                    i10--;
                }
                iArrG[i10] = 1;
                z9 = !z9;
            }
            i8++;
        }
        throw m.getNotFoundInstance();
    }

    private c v(M3.a aVar, int i8, boolean z8, int[] iArr) throws m {
        int size;
        int i9;
        boolean z9 = aVar.get(iArr[0]);
        int i10 = iArr[0] - 1;
        while (i10 >= 0 && (aVar.get(i10) ^ z9)) {
            i10--;
        }
        int i11 = i10 + 1;
        int i12 = iArr[0] - i11;
        int[] iArrG = g();
        System.arraycopy(iArrG, 0, iArrG, 1, iArrG.length - 1);
        iArrG[0] = i12;
        int iN = a.n(iArrG, f5452o);
        int i13 = iArr[1];
        if (z8) {
            int size2 = (aVar.getSize() - 1) - i11;
            size = (aVar.getSize() - 1) - i13;
            i9 = size2;
        } else {
            size = i13;
            i9 = i11;
        }
        return new c(iN, new int[]{i11, iArr[1]}, i9, size, i8);
    }

    @Override // W3.r
    public q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) throws m {
        o(this.f5453g, t(aVar, false, i8, map));
        aVar.reverse();
        o(this.f5454h, t(aVar, true, i8, map));
        aVar.reverse();
        for (d dVar : this.f5453g) {
            if (dVar.a() > 1) {
                for (d dVar2 : this.f5454h) {
                    if (dVar2.a() > 1 && q(dVar, dVar2)) {
                        return r(dVar, dVar2);
                    }
                }
            }
        }
        throw m.getNotFoundInstance();
    }

    @Override // W3.r, F3.o
    public void reset() {
        this.f5453g.clear();
        this.f5454h.clear();
    }
}
