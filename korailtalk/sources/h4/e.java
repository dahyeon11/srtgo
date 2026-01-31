package h4;

import F3.m;
import F3.s;
import F3.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f31563a;

    /* renamed from: b, reason: collision with root package name */
    private final List f31564b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31565c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f31566d;

    /* renamed from: e, reason: collision with root package name */
    private final t f31567e;

    private static final class b implements Serializable, Comparator {

        /* renamed from: a, reason: collision with root package name */
        private final float f31568a;

        private b(float f8) {
            this.f31568a = f8;
        }

        @Override // java.util.Comparator
        public int compare(d dVar, d dVar2) {
            if (dVar2.d() != dVar.d()) {
                return dVar2.d() - dVar.d();
            }
            float fAbs = Math.abs(dVar2.getEstimatedModuleSize() - this.f31568a);
            float fAbs2 = Math.abs(dVar.getEstimatedModuleSize() - this.f31568a);
            if (fAbs < fAbs2) {
                return 1;
            }
            return fAbs == fAbs2 ? 0 : -1;
        }
    }

    private static final class c implements Serializable, Comparator {

        /* renamed from: a, reason: collision with root package name */
        private final float f31569a;

        private c(float f8) {
            this.f31569a = f8;
        }

        @Override // java.util.Comparator
        public int compare(d dVar, d dVar2) {
            float fAbs = Math.abs(dVar2.getEstimatedModuleSize() - this.f31569a);
            float fAbs2 = Math.abs(dVar.getEstimatedModuleSize() - this.f31569a);
            if (fAbs < fAbs2) {
                return -1;
            }
            return fAbs == fAbs2 ? 0 : 1;
        }
    }

    public e(M3.b bVar) {
        this(bVar, null);
    }

    private static float a(int[] iArr, int i8) {
        return ((i8 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean b(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArrH = h();
        int i19 = 0;
        while (i8 >= i19 && i9 >= i19 && this.f31563a.get(i9 - i19, i8 - i19)) {
            iArrH[2] = iArrH[2] + 1;
            i19++;
        }
        if (i8 >= i19 && i9 >= i19) {
            while (i8 >= i19 && i9 >= i19 && !this.f31563a.get(i9 - i19, i8 - i19)) {
                int i20 = iArrH[1];
                if (i20 > i10) {
                    break;
                }
                iArrH[1] = i20 + 1;
                i19++;
            }
            if (i8 >= i19 && i9 >= i19 && iArrH[1] <= i10) {
                while (i8 >= i19 && i9 >= i19 && this.f31563a.get(i9 - i19, i8 - i19)) {
                    int i21 = iArrH[0];
                    if (i21 > i10) {
                        break;
                    }
                    iArrH[0] = i21 + 1;
                    i19++;
                }
                if (iArrH[0] > i10) {
                    return false;
                }
                int height = this.f31563a.getHeight();
                int width = this.f31563a.getWidth();
                int i22 = 1;
                while (true) {
                    i12 = i8 + i22;
                    if (i12 >= height || (i18 = i9 + i22) >= width || !this.f31563a.get(i18, i12)) {
                        break;
                    }
                    iArrH[2] = iArrH[2] + 1;
                    i22++;
                }
                if (i12 < height && i9 + i22 < width) {
                    while (true) {
                        i13 = i8 + i22;
                        if (i13 >= height || (i16 = i9 + i22) >= width || this.f31563a.get(i16, i13) || (i17 = iArrH[3]) >= i10) {
                            break;
                        }
                        iArrH[3] = i17 + 1;
                        i22++;
                    }
                    if (i13 < height && i9 + i22 < width && iArrH[3] < i10) {
                        while (true) {
                            int i23 = i8 + i22;
                            if (i23 >= height || (i14 = i9 + i22) >= width || !this.f31563a.get(i14, i23) || (i15 = iArrH[4]) >= i10) {
                                break;
                            }
                            iArrH[4] = i15 + 1;
                            i22++;
                        }
                        int i24 = iArrH[4];
                        if (i24 < i10 && Math.abs(((((iArrH[0] + iArrH[1]) + iArrH[2]) + iArrH[3]) + i24) - i11) < i11 * 2 && g(iArrH)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private float c(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        M3.b bVar = this.f31563a;
        int width = bVar.getWidth();
        int[] iArrH = h();
        int i15 = i8;
        while (i15 >= 0 && bVar.get(i15, i9)) {
            iArrH[2] = iArrH[2] + 1;
            i15--;
        }
        if (i15 < 0) {
            return Float.NaN;
        }
        while (i15 >= 0 && !bVar.get(i15, i9)) {
            int i16 = iArrH[1];
            if (i16 > i10) {
                break;
            }
            iArrH[1] = i16 + 1;
            i15--;
        }
        if (i15 >= 0 && iArrH[1] <= i10) {
            while (i15 >= 0 && bVar.get(i15, i9) && (i14 = iArrH[0]) <= i10) {
                iArrH[0] = i14 + 1;
                i15--;
            }
            if (iArrH[0] > i10) {
                return Float.NaN;
            }
            int i17 = i8 + 1;
            while (i17 < width && bVar.get(i17, i9)) {
                iArrH[2] = iArrH[2] + 1;
                i17++;
            }
            if (i17 == width) {
                return Float.NaN;
            }
            while (i17 < width && !bVar.get(i17, i9) && (i13 = iArrH[3]) < i10) {
                iArrH[3] = i13 + 1;
                i17++;
            }
            if (i17 != width && iArrH[3] < i10) {
                while (i17 < width && bVar.get(i17, i9) && (i12 = iArrH[4]) < i10) {
                    iArrH[4] = i12 + 1;
                    i17++;
                }
                int i18 = iArrH[4];
                if (i18 < i10 && Math.abs(((((iArrH[0] + iArrH[1]) + iArrH[2]) + iArrH[3]) + i18) - i11) * 5 < i11 && g(iArrH)) {
                    return a(iArrH, i17);
                }
            }
        }
        return Float.NaN;
    }

    private float d(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        M3.b bVar = this.f31563a;
        int height = bVar.getHeight();
        int[] iArrH = h();
        int i15 = i8;
        while (i15 >= 0 && bVar.get(i9, i15)) {
            iArrH[2] = iArrH[2] + 1;
            i15--;
        }
        if (i15 < 0) {
            return Float.NaN;
        }
        while (i15 >= 0 && !bVar.get(i9, i15)) {
            int i16 = iArrH[1];
            if (i16 > i10) {
                break;
            }
            iArrH[1] = i16 + 1;
            i15--;
        }
        if (i15 >= 0 && iArrH[1] <= i10) {
            while (i15 >= 0 && bVar.get(i9, i15) && (i14 = iArrH[0]) <= i10) {
                iArrH[0] = i14 + 1;
                i15--;
            }
            if (iArrH[0] > i10) {
                return Float.NaN;
            }
            int i17 = i8 + 1;
            while (i17 < height && bVar.get(i9, i17)) {
                iArrH[2] = iArrH[2] + 1;
                i17++;
            }
            if (i17 == height) {
                return Float.NaN;
            }
            while (i17 < height && !bVar.get(i9, i17) && (i13 = iArrH[3]) < i10) {
                iArrH[3] = i13 + 1;
                i17++;
            }
            if (i17 != height && iArrH[3] < i10) {
                while (i17 < height && bVar.get(i9, i17) && (i12 = iArrH[4]) < i10) {
                    iArrH[4] = i12 + 1;
                    i17++;
                }
                int i18 = iArrH[4];
                if (i18 < i10 && Math.abs(((((iArrH[0] + iArrH[1]) + iArrH[2]) + iArrH[3]) + i18) - i11) * 5 < i11 * 2 && g(iArrH)) {
                    return a(iArrH, i17);
                }
            }
        }
        return Float.NaN;
    }

    private int f() {
        if (this.f31564b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f31564b) {
            if (dVar2.d() >= 2) {
                if (dVar != null) {
                    this.f31565c = true;
                    return ((int) (Math.abs(dVar.getX() - dVar2.getX()) - Math.abs(dVar.getY() - dVar2.getY()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    protected static boolean g(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 5; i9++) {
            int i10 = iArr[i9];
            if (i10 == 0) {
                return false;
            }
            i8 += i10;
        }
        if (i8 < 7) {
            return false;
        }
        float f8 = i8 / 7.0f;
        float f9 = f8 / 2.0f;
        return Math.abs(f8 - ((float) iArr[0])) < f9 && Math.abs(f8 - ((float) iArr[1])) < f9 && Math.abs((f8 * 3.0f) - ((float) iArr[2])) < 3.0f * f9 && Math.abs(f8 - ((float) iArr[3])) < f9 && Math.abs(f8 - ((float) iArr[4])) < f9;
    }

    private int[] h() {
        int[] iArr = this.f31566d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    private boolean j() {
        int size = this.f31564b.size();
        float fAbs = 0.0f;
        int i8 = 0;
        float estimatedModuleSize = 0.0f;
        for (d dVar : this.f31564b) {
            if (dVar.d() >= 2) {
                i8++;
                estimatedModuleSize += dVar.getEstimatedModuleSize();
            }
        }
        if (i8 < 3) {
            return false;
        }
        float f8 = estimatedModuleSize / size;
        Iterator it = this.f31564b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(((d) it.next()).getEstimatedModuleSize() - f8);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    private d[] k() throws m {
        int size = this.f31564b.size();
        if (size < 3) {
            throw m.getNotFoundInstance();
        }
        float estimatedModuleSize = 0.0f;
        if (size > 3) {
            Iterator it = this.f31564b.iterator();
            float f8 = 0.0f;
            float f9 = 0.0f;
            while (it.hasNext()) {
                float estimatedModuleSize2 = ((d) it.next()).getEstimatedModuleSize();
                f8 += estimatedModuleSize2;
                f9 += estimatedModuleSize2 * estimatedModuleSize2;
            }
            float f10 = f8 / size;
            float fSqrt = (float) Math.sqrt((f9 / r0) - (f10 * f10));
            Collections.sort(this.f31564b, new c(f10));
            float fMax = Math.max(0.2f * f10, fSqrt);
            int i8 = 0;
            while (i8 < this.f31564b.size() && this.f31564b.size() > 3) {
                if (Math.abs(((d) this.f31564b.get(i8)).getEstimatedModuleSize() - f10) > fMax) {
                    this.f31564b.remove(i8);
                    i8--;
                }
                i8++;
            }
        }
        if (this.f31564b.size() > 3) {
            Iterator it2 = this.f31564b.iterator();
            while (it2.hasNext()) {
                estimatedModuleSize += ((d) it2.next()).getEstimatedModuleSize();
            }
            Collections.sort(this.f31564b, new b(estimatedModuleSize / this.f31564b.size()));
            List list = this.f31564b;
            list.subList(3, list.size()).clear();
        }
        return new d[]{(d) this.f31564b.get(0), (d) this.f31564b.get(1), (d) this.f31564b.get(2)};
    }

    final f e(Map map) throws m {
        boolean z8 = map != null && map.containsKey(F3.e.TRY_HARDER);
        boolean z9 = map != null && map.containsKey(F3.e.PURE_BARCODE);
        int height = this.f31563a.getHeight();
        int width = this.f31563a.getWidth();
        int i8 = (height * 3) / 228;
        if (i8 < 3 || z8) {
            i8 = 3;
        }
        int[] iArr = new int[5];
        int i9 = i8 - 1;
        boolean zJ = false;
        while (i9 < height && !zJ) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i10 = 0;
            int i11 = 0;
            while (i10 < width) {
                if (this.f31563a.get(i10, i9)) {
                    if ((i11 & 1) == 1) {
                        i11++;
                    }
                    iArr[i11] = iArr[i11] + 1;
                } else if ((i11 & 1) != 0) {
                    iArr[i11] = iArr[i11] + 1;
                } else if (i11 != 4) {
                    i11++;
                    iArr[i11] = iArr[i11] + 1;
                } else if (g(iArr) && i(iArr, i9, i10, z9)) {
                    if (this.f31565c) {
                        zJ = j();
                    } else {
                        int iF = f();
                        int i12 = iArr[2];
                        if (iF > i12) {
                            i9 += (iF - i12) - 2;
                            i10 = width - 1;
                        }
                    }
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    i11 = 0;
                    i8 = 2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i11 = 3;
                }
                i10++;
            }
            if (g(iArr) && i(iArr, i9, width, z9)) {
                i8 = iArr[0];
                if (this.f31565c) {
                    zJ = j();
                }
            }
            i9 += i8;
        }
        d[] dVarArrK = k();
        s.orderBestPatterns(dVarArrK);
        return new f(dVarArrK);
    }

    protected final boolean i(int[] iArr, int i8, int i9, boolean z8) {
        int i10 = 0;
        int i11 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i9);
        float fD = d(i8, iA, iArr[2], i11);
        if (!Float.isNaN(fD)) {
            int i12 = (int) fD;
            float fC = c(iA, i12, iArr[2], i11);
            if (!Float.isNaN(fC) && (!z8 || b(i12, (int) fC, iArr[2], i11))) {
                float f8 = i11 / 7.0f;
                while (true) {
                    if (i10 < this.f31564b.size()) {
                        d dVar = (d) this.f31564b.get(i10);
                        if (dVar.b(f8, fD, fC)) {
                            this.f31564b.set(i10, dVar.c(fD, fC, f8));
                            break;
                        }
                        i10++;
                    } else {
                        d dVar2 = new d(fC, fD, f8);
                        this.f31564b.add(dVar2);
                        t tVar = this.f31567e;
                        if (tVar != null) {
                            tVar.foundPossibleResultPoint(dVar2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public e(M3.b bVar, t tVar) {
        this.f31563a = bVar;
        this.f31564b = new ArrayList();
        this.f31566d = new int[5];
        this.f31567e = tVar;
    }
}
