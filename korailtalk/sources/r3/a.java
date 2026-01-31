package R3;

import F3.m;
import F3.s;
import M3.g;
import M3.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f4431a;

    /* renamed from: b, reason: collision with root package name */
    private final N3.b f4432b;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final s f4433a;

        /* renamed from: b, reason: collision with root package name */
        private final s f4434b;

        /* renamed from: c, reason: collision with root package name */
        private final int f4435c;

        s a() {
            return this.f4433a;
        }

        s b() {
            return this.f4434b;
        }

        int c() {
            return this.f4435c;
        }

        public String toString() {
            return this.f4433a + "/" + this.f4434b + '/' + this.f4435c;
        }

        private b(s sVar, s sVar2, int i8) {
            this.f4433a = sVar;
            this.f4434b = sVar2;
            this.f4435c = i8;
        }
    }

    private static final class c implements Serializable, Comparator {
        private c() {
        }

        @Override // java.util.Comparator
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public a(M3.b bVar) {
        this.f4431a = bVar;
        this.f4432b = new N3.b(bVar);
    }

    private s a(s sVar, s sVar2, s sVar3, s sVar4, int i8) {
        float f8 = i8;
        float fC = c(sVar, sVar2) / f8;
        float fC2 = c(sVar3, sVar4);
        s sVar5 = new s(sVar4.getX() + (((sVar4.getX() - sVar3.getX()) / fC2) * fC), sVar4.getY() + (fC * ((sVar4.getY() - sVar3.getY()) / fC2)));
        float fC3 = c(sVar, sVar3) / f8;
        float fC4 = c(sVar2, sVar4);
        s sVar6 = new s(sVar4.getX() + (((sVar4.getX() - sVar2.getX()) / fC4) * fC3), sVar4.getY() + (fC3 * ((sVar4.getY() - sVar2.getY()) / fC4)));
        if (e(sVar5)) {
            return (e(sVar6) && Math.abs(g(sVar3, sVar5).c() - g(sVar2, sVar5).c()) > Math.abs(g(sVar3, sVar6).c() - g(sVar2, sVar6).c())) ? sVar6 : sVar5;
        }
        if (e(sVar6)) {
            return sVar6;
        }
        return null;
    }

    private s b(s sVar, s sVar2, s sVar3, s sVar4, int i8, int i9) {
        float fC = c(sVar, sVar2) / i8;
        float fC2 = c(sVar3, sVar4);
        s sVar5 = new s(sVar4.getX() + (((sVar4.getX() - sVar3.getX()) / fC2) * fC), sVar4.getY() + (fC * ((sVar4.getY() - sVar3.getY()) / fC2)));
        float fC3 = c(sVar, sVar3) / i9;
        float fC4 = c(sVar2, sVar4);
        s sVar6 = new s(sVar4.getX() + (((sVar4.getX() - sVar2.getX()) / fC4) * fC3), sVar4.getY() + (fC3 * ((sVar4.getY() - sVar2.getY()) / fC4)));
        if (e(sVar5)) {
            return (e(sVar6) && Math.abs(i8 - g(sVar3, sVar5).c()) + Math.abs(i9 - g(sVar2, sVar5).c()) > Math.abs(i8 - g(sVar3, sVar6).c()) + Math.abs(i9 - g(sVar2, sVar6).c())) ? sVar6 : sVar5;
        }
        if (e(sVar6)) {
            return sVar6;
        }
        return null;
    }

    private static int c(s sVar, s sVar2) {
        return N3.a.round(s.distance(sVar, sVar2));
    }

    private static void d(Map map, s sVar) {
        Integer num = (Integer) map.get(sVar);
        map.put(sVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private boolean e(s sVar) {
        return sVar.getX() >= 0.0f && sVar.getX() < ((float) this.f4431a.getWidth()) && sVar.getY() > 0.0f && sVar.getY() < ((float) this.f4431a.getHeight());
    }

    private static M3.b f(M3.b bVar, s sVar, s sVar2, s sVar3, s sVar4, int i8, int i9) {
        float f8 = i8 - 0.5f;
        float f9 = i9 - 0.5f;
        return i.getInstance().sampleGrid(bVar, i8, i9, 0.5f, 0.5f, f8, 0.5f, f8, f9, 0.5f, f9, sVar.getX(), sVar.getY(), sVar4.getX(), sVar4.getY(), sVar3.getX(), sVar3.getY(), sVar2.getX(), sVar2.getY());
    }

    private b g(s sVar, s sVar2) {
        int x8 = (int) sVar.getX();
        int y8 = (int) sVar.getY();
        int x9 = (int) sVar2.getX();
        int y9 = (int) sVar2.getY();
        int i8 = 0;
        boolean z8 = Math.abs(y9 - y8) > Math.abs(x9 - x8);
        if (z8) {
            y8 = x8;
            x8 = y8;
            y9 = x9;
            x9 = y9;
        }
        int iAbs = Math.abs(x9 - x8);
        int iAbs2 = Math.abs(y9 - y8);
        int i9 = (-iAbs) / 2;
        int i10 = y8 < y9 ? 1 : -1;
        int i11 = x8 >= x9 ? -1 : 1;
        boolean z9 = this.f4431a.get(z8 ? y8 : x8, z8 ? x8 : y8);
        while (x8 != x9) {
            boolean z10 = this.f4431a.get(z8 ? y8 : x8, z8 ? x8 : y8);
            if (z10 != z9) {
                i8++;
                z9 = z10;
            }
            i9 += iAbs2;
            if (i9 > 0) {
                if (y8 == y9) {
                    break;
                }
                y8 += i10;
                i9 -= iAbs;
            }
            x8 += i11;
        }
        return new b(sVar, sVar2, i8);
    }

    public g detect() throws m {
        s sVar;
        M3.b bVarF;
        s[] sVarArrDetect = this.f4432b.detect();
        s sVar2 = sVarArrDetect[0];
        s sVar3 = sVarArrDetect[1];
        s sVar4 = sVarArrDetect[2];
        s sVar5 = sVarArrDetect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(g(sVar2, sVar3));
        arrayList.add(g(sVar2, sVar4));
        arrayList.add(g(sVar3, sVar5));
        arrayList.add(g(sVar4, sVar5));
        s sVar6 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap map = new HashMap();
        d(map, bVar.a());
        d(map, bVar.b());
        d(map, bVar2.a());
        d(map, bVar2.b());
        s sVar7 = null;
        s sVar8 = null;
        for (Map.Entry entry : map.entrySet()) {
            s sVar9 = (s) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                sVar7 = sVar9;
            } else if (sVar6 == null) {
                sVar6 = sVar9;
            } else {
                sVar8 = sVar9;
            }
        }
        if (sVar6 == null || sVar7 == null || sVar8 == null) {
            throw m.getNotFoundInstance();
        }
        s[] sVarArr = {sVar6, sVar7, sVar8};
        s.orderBestPatterns(sVarArr);
        s sVar10 = sVarArr[0];
        s sVar11 = sVarArr[1];
        s sVar12 = sVarArr[2];
        s sVar13 = !map.containsKey(sVar2) ? sVar2 : !map.containsKey(sVar3) ? sVar3 : !map.containsKey(sVar4) ? sVar4 : sVar5;
        int iC = g(sVar12, sVar13).c();
        int iC2 = g(sVar10, sVar13).c();
        if ((iC & 1) == 1) {
            iC++;
        }
        int i8 = iC + 2;
        if ((iC2 & 1) == 1) {
            iC2++;
        }
        int i9 = iC2 + 2;
        if (i8 * 4 >= i9 * 7 || i9 * 4 >= i8 * 7) {
            s sVarB = b(sVar11, sVar10, sVar12, sVar13, i8, i9);
            if (sVarB != null) {
                sVar13 = sVarB;
            }
            int iC3 = g(sVar12, sVar13).c();
            int iC4 = g(sVar10, sVar13).c();
            if ((iC3 & 1) == 1) {
                iC3++;
            }
            int i10 = iC3;
            if ((iC4 & 1) == 1) {
                iC4++;
            }
            sVar = sVar12;
            bVarF = f(this.f4431a, sVar12, sVar11, sVar10, sVar13, i10, iC4);
        } else {
            s sVarA = a(sVar11, sVar10, sVar12, sVar13, Math.min(i9, i8));
            if (sVarA != null) {
                sVar13 = sVarA;
            }
            int iMax = Math.max(g(sVar12, sVar13).c(), g(sVar10, sVar13).c());
            int i11 = iMax + 1;
            int i12 = (i11 & 1) == 1 ? iMax + 2 : i11;
            bVarF = f(this.f4431a, sVar12, sVar11, sVar10, sVar13, i12, i12);
            sVar = sVar12;
        }
        return new g(bVarF, new s[]{sVar, sVar11, sVar10, sVar13});
    }
}
