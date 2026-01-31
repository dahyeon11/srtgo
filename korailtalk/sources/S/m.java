package S;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class m {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;

    /* renamed from: a */
    p f4569a;

    /* renamed from: b */
    p f4570b;

    /* renamed from: d */
    int f4572d;

    /* renamed from: e */
    int f4573e;
    public int position = 0;
    public boolean dual = false;

    /* renamed from: c */
    ArrayList f4571c = new ArrayList();

    public m(p pVar, int i8) {
        this.f4569a = null;
        this.f4570b = null;
        int i9 = index;
        this.f4572d = i9;
        index = i9 + 1;
        this.f4569a = pVar;
        this.f4570b = pVar;
        this.f4573e = i8;
    }

    private boolean a(p pVar, int i8) {
        f fVar;
        p pVar2;
        f fVar2;
        p pVar3;
        if (!pVar.f4591a.isTerminalWidget[i8]) {
            return false;
        }
        for (d dVar : pVar.start.f4563f) {
            if ((dVar instanceof f) && (pVar3 = (fVar2 = (f) dVar).f4558a) != pVar && fVar2 == pVar3.start) {
                if (pVar instanceof c) {
                    Iterator it = ((c) pVar).f4547g.iterator();
                    while (it.hasNext()) {
                        a((p) it.next(), i8);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f4591a.isTerminalWidget[i8] = false;
                }
                a(fVar2.f4558a, i8);
            }
        }
        for (d dVar2 : pVar.end.f4563f) {
            if ((dVar2 instanceof f) && (pVar2 = (fVar = (f) dVar2).f4558a) != pVar && fVar == pVar2.start) {
                if (pVar instanceof c) {
                    Iterator it2 = ((c) pVar).f4547g.iterator();
                    while (it2.hasNext()) {
                        a((p) it2.next(), i8);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f4591a.isTerminalWidget[i8] = false;
                }
                a(fVar.f4558a, i8);
            }
        }
        return false;
    }

    private long b(f fVar, long j8) {
        p pVar = fVar.f4558a;
        if (pVar instanceof k) {
            return j8;
        }
        int size = fVar.f4563f.size();
        long jMin = j8;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) fVar.f4563f.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4558a != pVar) {
                    jMin = Math.min(jMin, b(fVar2, fVar2.f4560c + j8));
                }
            }
        }
        if (fVar != pVar.end) {
            return jMin;
        }
        long wrapDimension = j8 - pVar.getWrapDimension();
        return Math.min(Math.min(jMin, b(pVar.start, wrapDimension)), wrapDimension - pVar.start.f4560c);
    }

    private long c(f fVar, long j8) {
        p pVar = fVar.f4558a;
        if (pVar instanceof k) {
            return j8;
        }
        int size = fVar.f4563f.size();
        long jMax = j8;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) fVar.f4563f.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4558a != pVar) {
                    jMax = Math.max(jMax, c(fVar2, fVar2.f4560c + j8));
                }
            }
        }
        if (fVar != pVar.start) {
            return jMax;
        }
        long wrapDimension = j8 + pVar.getWrapDimension();
        return Math.max(Math.max(jMax, c(pVar.end, wrapDimension)), wrapDimension - pVar.end.f4560c);
    }

    public void add(p pVar) {
        this.f4571c.add(pVar);
        this.f4570b = pVar;
    }

    public long computeWrapSize(R.f fVar, int i8) {
        long wrapDimension;
        int i9;
        p pVar = this.f4569a;
        if (pVar instanceof c) {
            if (((c) pVar).orientation != i8) {
                return 0L;
            }
        } else if (i8 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i8 == 0 ? fVar.horizontalRun : fVar.verticalRun).start;
        f fVar3 = (i8 == 0 ? fVar.horizontalRun : fVar.verticalRun).end;
        boolean zContains = pVar.start.f4564g.contains(fVar2);
        boolean zContains2 = this.f4569a.end.f4564g.contains(fVar3);
        long wrapDimension2 = this.f4569a.getWrapDimension();
        if (zContains && zContains2) {
            long jC = c(this.f4569a.start, 0L);
            long jB = b(this.f4569a.end, 0L);
            long j8 = jC - wrapDimension2;
            p pVar2 = this.f4569a;
            int i10 = pVar2.end.f4560c;
            if (j8 >= (-i10)) {
                j8 += i10;
            }
            int i11 = pVar2.start.f4560c;
            long j9 = ((-jB) - wrapDimension2) - i11;
            if (j9 >= i11) {
                j9 -= i11;
            }
            float biasPercent = pVar2.f4591a.getBiasPercent(i8);
            float f8 = biasPercent > 0.0f ? (long) ((j9 / biasPercent) + (j8 / (1.0f - biasPercent))) : 0L;
            long j10 = ((long) ((f8 * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f8 * (1.0f - biasPercent)) + 0.5f));
            wrapDimension = r12.start.f4560c + j10;
            i9 = this.f4569a.end.f4560c;
        } else {
            if (zContains) {
                return Math.max(c(this.f4569a.start, r12.f4560c), this.f4569a.start.f4560c + wrapDimension2);
            }
            if (zContains2) {
                return Math.max(-b(this.f4569a.end, r12.f4560c), (-this.f4569a.end.f4560c) + wrapDimension2);
            }
            wrapDimension = r12.start.f4560c + this.f4569a.getWrapDimension();
            i9 = this.f4569a.end.f4560c;
        }
        return wrapDimension - i9;
    }

    public void defineTerminalWidgets(boolean z8, boolean z9) {
        if (z8) {
            p pVar = this.f4569a;
            if (pVar instanceof l) {
                a(pVar, 0);
            }
        }
        if (z9) {
            p pVar2 = this.f4569a;
            if (pVar2 instanceof n) {
                a(pVar2, 1);
            }
        }
    }
}
