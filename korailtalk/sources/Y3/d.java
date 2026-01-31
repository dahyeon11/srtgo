package Y3;

import F3.e;
import F3.m;
import F3.q;
import F3.s;
import W3.r;
import X3.f;
import Z3.j;
import ai.maum.m2u.cdk.utils.G711;
import androidx.appcompat.app.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public final class d extends X3.a {

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f5615k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f5616l = {4, 20, 52, 104, 204};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f5617m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    private static final int[][] f5618n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f5619o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, G711.BIAS}, new int[]{185, 133, 188, 142, 4, 12, 36, g.FEATURE_SUPPORT_ACTION_BAR}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    private static final int[][] f5620p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g, reason: collision with root package name */
    private final List f5621g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    private final List f5622h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final int[] f5623i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private boolean f5624j;

    private X3.c A(M3.a aVar, int i8, boolean z8) {
        int i9;
        int i10;
        int i11;
        if (z8) {
            int i12 = this.f5623i[0] - 1;
            while (i12 >= 0 && !aVar.get(i12)) {
                i12--;
            }
            int i13 = i12 + 1;
            int[] iArr = this.f5623i;
            i11 = iArr[0] - i13;
            i9 = iArr[1];
            i10 = i13;
        } else {
            int[] iArr2 = this.f5623i;
            int i14 = iArr2[0];
            int nextUnset = aVar.getNextUnset(iArr2[1] + 1);
            i9 = nextUnset;
            i10 = i14;
            i11 = nextUnset - this.f5623i[1];
        }
        int[] iArrG = g();
        System.arraycopy(iArrG, 0, iArrG, 1, iArrG.length - 1);
        iArrG[0] = i11;
        try {
            return new X3.c(X3.a.n(iArrG, f5618n), new int[]{i10, i9}, i10, i9, i8);
        } catch (m unused) {
            return null;
        }
    }

    private static void B(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a().size() != list.size()) {
                Iterator it2 = cVar.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    b bVar = (b) it2.next();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (bVar.equals((b) it3.next())) {
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void D(int[] iArr) {
        int length = iArr.length;
        for (int i8 = 0; i8 < length / 2; i8++) {
            int i9 = iArr[i8];
            int i10 = (length - i8) - 1;
            iArr[i8] = iArr[i10];
            iArr[i10] = i9;
        }
    }

    private void E(int i8, boolean z8) {
        boolean zC = false;
        int i9 = 0;
        boolean zC2 = false;
        while (true) {
            if (i9 >= this.f5622h.size()) {
                break;
            }
            c cVar = (c) this.f5622h.get(i9);
            if (cVar.b() > i8) {
                zC = cVar.c(this.f5621g);
                break;
            } else {
                zC2 = cVar.c(this.f5621g);
                i9++;
            }
        }
        if (zC || zC2 || y(this.f5621g, this.f5622h)) {
            return;
        }
        this.f5622h.add(i9, new c(this.f5621g, i8, z8));
        B(this.f5621g, this.f5622h);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void o(int r11) throws F3.m {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.d.o(int):void");
    }

    private boolean p() {
        b bVar = (b) this.f5621g.get(0);
        X3.b bVarC = bVar.c();
        X3.b bVarD = bVar.d();
        if (bVarD == null) {
            return false;
        }
        int checksumPortion = bVarD.getChecksumPortion();
        int i8 = 2;
        for (int i9 = 1; i9 < this.f5621g.size(); i9++) {
            b bVar2 = (b) this.f5621g.get(i9);
            checksumPortion += bVar2.c().getChecksumPortion();
            int i10 = i8 + 1;
            X3.b bVarD2 = bVar2.d();
            if (bVarD2 != null) {
                checksumPortion += bVarD2.getChecksumPortion();
                i8 += 2;
            } else {
                i8 = i10;
            }
        }
        return ((i8 + (-4)) * 211) + (checksumPortion % 211) == bVarC.getValue();
    }

    private List q(List list, int i8) throws m {
        while (i8 < this.f5622h.size()) {
            c cVar = (c) this.f5622h.get(i8);
            this.f5621g.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f5621g.addAll(((c) it.next()).a());
            }
            this.f5621g.addAll(cVar.a());
            if (z(this.f5621g)) {
                if (p()) {
                    return this.f5621g;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return q(arrayList, i8 + 1);
                } catch (m unused) {
                    continue;
                }
            }
            i8++;
        }
        throw m.getNotFoundInstance();
    }

    private List r(boolean z8) {
        List listQ = null;
        if (this.f5622h.size() > 25) {
            this.f5622h.clear();
            return null;
        }
        this.f5621g.clear();
        if (z8) {
            Collections.reverse(this.f5622h);
        }
        try {
            listQ = q(new ArrayList(), 0);
        } catch (m unused) {
        }
        if (z8) {
            Collections.reverse(this.f5622h);
        }
        return listQ;
    }

    static q s(List list) {
        String information = j.createDecoder(a.a(list)).parseInformation();
        s[] resultPoints = ((b) list.get(0)).b().getResultPoints();
        s[] resultPoints2 = ((b) list.get(list.size() - 1)).b().getResultPoints();
        return new q(information, null, new s[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, F3.a.RSS_EXPANDED);
    }

    private void v(M3.a aVar, List list, int i8) throws m {
        int[] iArrG = g();
        iArrG[0] = 0;
        iArrG[1] = 0;
        iArrG[2] = 0;
        iArrG[3] = 0;
        int size = aVar.getSize();
        if (i8 < 0) {
            i8 = list.isEmpty() ? 0 : ((b) list.get(list.size() - 1)).b().getStartEnd()[1];
        }
        boolean z8 = list.size() % 2 != 0;
        if (this.f5624j) {
            z8 = !z8;
        }
        boolean z9 = false;
        while (true) {
            if (i8 >= size) {
                break;
            }
            boolean z10 = aVar.get(i8);
            boolean z11 = !z10;
            if (z10) {
                z9 = z11;
                break;
            } else {
                i8++;
                z9 = z11;
            }
        }
        int i9 = 0;
        boolean z12 = z9;
        int i10 = i8;
        while (i8 < size) {
            if (aVar.get(i8) ^ z12) {
                iArrG[i9] = iArrG[i9] + 1;
            } else {
                if (i9 == 3) {
                    if (z8) {
                        D(iArrG);
                    }
                    if (X3.a.m(iArrG)) {
                        int[] iArr = this.f5623i;
                        iArr[0] = i10;
                        iArr[1] = i8;
                        return;
                    }
                    if (z8) {
                        D(iArrG);
                    }
                    i10 += iArrG[0] + iArrG[1];
                    iArrG[0] = iArrG[2];
                    iArrG[1] = iArrG[3];
                    iArrG[2] = 0;
                    iArrG[3] = 0;
                    i9--;
                } else {
                    i9++;
                }
                iArrG[i9] = 1;
                z12 = !z12;
            }
            i8++;
        }
        throw m.getNotFoundInstance();
    }

    private static int w(M3.a aVar, int i8) {
        return aVar.get(i8) ? aVar.getNextSet(aVar.getNextUnset(i8)) : aVar.getNextUnset(aVar.getNextSet(i8));
    }

    private static boolean x(X3.c cVar, boolean z8, boolean z9) {
        return (cVar.getValue() == 0 && z8 && z9) ? false : true;
    }

    private static boolean y(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                Iterator it3 = cVar.a().iterator();
                while (it3.hasNext()) {
                    if (bVar.equals((b) it3.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean z(List list) {
        for (int[] iArr : f5620p) {
            if (list.size() <= iArr.length) {
                for (int i8 = 0; i8 < list.size(); i8++) {
                    if (((b) list.get(i8)).b().getValue() != iArr[i8]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    b C(M3.a aVar, List list, int i8) throws m {
        X3.c cVarA;
        X3.b bVarT;
        boolean z8 = list.size() % 2 == 0;
        if (this.f5624j) {
            z8 = !z8;
        }
        int iW = -1;
        boolean z9 = true;
        do {
            v(aVar, list, iW);
            cVarA = A(aVar, i8, z8);
            if (cVarA == null) {
                iW = w(aVar, this.f5623i[0]);
            } else {
                z9 = false;
            }
        } while (z9);
        X3.b bVarT2 = t(aVar, cVarA, z8, true);
        if (!list.isEmpty() && ((b) list.get(list.size() - 1)).mustBeLast()) {
            throw m.getNotFoundInstance();
        }
        try {
            bVarT = t(aVar, cVarA, z8, false);
        } catch (m unused) {
            bVarT = null;
        }
        return new b(bVarT2, bVarT, cVarA, true);
    }

    @Override // W3.r
    public q decodeRow(int i8, M3.a aVar, java.util.Map<e, ?> map) {
        this.f5621g.clear();
        this.f5624j = false;
        try {
            return s(u(i8, aVar));
        } catch (m unused) {
            this.f5621g.clear();
            this.f5624j = true;
            return s(u(i8, aVar));
        }
    }

    @Override // W3.r, F3.o
    public void reset() {
        this.f5621g.clear();
        this.f5622h.clear();
    }

    X3.b t(M3.a aVar, X3.c cVar, boolean z8, boolean z9) throws m {
        int[] iArrF = f();
        iArrF[0] = 0;
        iArrF[1] = 0;
        iArrF[2] = 0;
        iArrF[3] = 0;
        iArrF[4] = 0;
        iArrF[5] = 0;
        iArrF[6] = 0;
        iArrF[7] = 0;
        if (z9) {
            r.d(aVar, cVar.getStartEnd()[0], iArrF);
        } else {
            r.c(aVar, cVar.getStartEnd()[1], iArrF);
            int i8 = 0;
            for (int length = iArrF.length - 1; i8 < length; length--) {
                int i9 = iArrF[i8];
                iArrF[i8] = iArrF[length];
                iArrF[length] = i9;
                i8++;
            }
        }
        float fSum = N3.a.sum(iArrF) / 17.0f;
        float f8 = (cVar.getStartEnd()[1] - cVar.getStartEnd()[0]) / 15.0f;
        if (Math.abs(fSum - f8) / f8 > 0.3f) {
            throw m.getNotFoundInstance();
        }
        int[] iArrJ = j();
        int[] iArrH = h();
        float[] fArrK = k();
        float[] fArrI = i();
        for (int i10 = 0; i10 < iArrF.length; i10++) {
            float f9 = (iArrF[i10] * 1.0f) / fSum;
            int i11 = (int) (0.5f + f9);
            if (i11 <= 0) {
                if (f9 < 0.3f) {
                    throw m.getNotFoundInstance();
                }
                i11 = 1;
            } else if (i11 > 8) {
                if (f9 > 8.7f) {
                    throw m.getNotFoundInstance();
                }
                i11 = 8;
            }
            int i12 = i10 / 2;
            if ((i10 & 1) == 0) {
                iArrJ[i12] = i11;
                fArrK[i12] = f9 - i11;
            } else {
                iArrH[i12] = i11;
                fArrI[i12] = f9 - i11;
            }
        }
        o(17);
        int value = (((cVar.getValue() * 4) + (z8 ? 0 : 2)) + (!z9 ? 1 : 0)) - 1;
        int i13 = 0;
        int i14 = 0;
        for (int length2 = iArrJ.length - 1; length2 >= 0; length2--) {
            if (x(cVar, z8, z9)) {
                i13 += iArrJ[length2] * f5619o[value][length2 * 2];
            }
            i14 += iArrJ[length2];
        }
        int i15 = 0;
        for (int length3 = iArrH.length - 1; length3 >= 0; length3--) {
            if (x(cVar, z8, z9)) {
                i15 += iArrH[length3] * f5619o[value][(length3 * 2) + 1];
            }
        }
        int i16 = i13 + i15;
        if ((i14 & 1) != 0 || i14 > 13 || i14 < 4) {
            throw m.getNotFoundInstance();
        }
        int i17 = (13 - i14) / 2;
        int i18 = f5615k[i17];
        return new X3.b((f.getRSSvalue(iArrJ, i18, true) * f5616l[i17]) + f.getRSSvalue(iArrH, 9 - i18, false) + f5617m[i17], i16);
    }

    List u(int i8, M3.a aVar) throws m {
        while (true) {
            try {
                this.f5621g.add(C(aVar, this.f5621g, i8));
            } catch (m e8) {
                if (this.f5621g.isEmpty()) {
                    throw e8;
                }
                if (p()) {
                    return this.f5621g;
                }
                boolean zIsEmpty = this.f5622h.isEmpty();
                E(i8, false);
                if (!zIsEmpty) {
                    List listR = r(false);
                    if (listR != null) {
                        return listR;
                    }
                    List listR2 = r(true);
                    if (listR2 != null) {
                        return listR2;
                    }
                }
                throw m.getNotFoundInstance();
            }
        }
    }
}
