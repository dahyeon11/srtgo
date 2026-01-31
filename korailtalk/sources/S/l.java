package S;

import R.d;
import R.e;
import S.f;
import S.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: g, reason: collision with root package name */
    private static int[] f4567g = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4568a;

        static {
            int[] iArr = new int[p.b.values().length];
            f4568a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4568a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4568a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(R.e eVar) {
        super(eVar);
        this.start.f4559b = f.a.LEFT;
        this.end.f4559b = f.a.RIGHT;
        this.orientation = 0;
    }

    private void m(int[] iArr, int i8, int i9, int i10, int i11, float f8, int i12) {
        int i13 = i9 - i8;
        int i14 = i11 - i10;
        if (i12 != -1) {
            if (i12 == 0) {
                iArr[0] = (int) ((i14 * f8) + 0.5f);
                iArr[1] = i14;
                return;
            } else {
                if (i12 != 1) {
                    return;
                }
                iArr[0] = i13;
                iArr[1] = (int) ((i13 * f8) + 0.5f);
                return;
            }
        }
        int i15 = (int) ((i14 * f8) + 0.5f);
        int i16 = (int) ((i13 / f8) + 0.5f);
        if (i15 <= i13) {
            iArr[0] = i15;
            iArr[1] = i14;
        } else if (i16 <= i14) {
            iArr[0] = i13;
            iArr[1] = i16;
        }
    }

    @Override // S.p
    public void applyToWidget() {
        f fVar = this.start;
        if (fVar.resolved) {
            this.f4591a.setX(fVar.value);
        }
    }

    @Override // S.p
    void c() {
        R.e parent;
        R.e parent2;
        R.e eVar = this.f4591a;
        if (eVar.measured) {
            this.f4594d.resolve(eVar.getWidth());
        }
        if (this.f4594d.resolved) {
            e.b bVar = this.f4593c;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((parent = this.f4591a.getParent()) != null && parent.getHorizontalDimensionBehaviour() == e.b.FIXED) || parent.getHorizontalDimensionBehaviour() == bVar2)) {
                a(this.start, parent.horizontalRun.start, this.f4591a.mLeft.getMargin());
                a(this.end, parent.horizontalRun.end, -this.f4591a.mRight.getMargin());
                return;
            }
        } else {
            e.b horizontalDimensionBehaviour = this.f4591a.getHorizontalDimensionBehaviour();
            this.f4593c = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (horizontalDimensionBehaviour == bVar3 && (((parent2 = this.f4591a.getParent()) != null && parent2.getHorizontalDimensionBehaviour() == e.b.FIXED) || parent2.getHorizontalDimensionBehaviour() == bVar3)) {
                    int width = (parent2.getWidth() - this.f4591a.mLeft.getMargin()) - this.f4591a.mRight.getMargin();
                    a(this.start, parent2.horizontalRun.start, this.f4591a.mLeft.getMargin());
                    a(this.end, parent2.horizontalRun.end, -this.f4591a.mRight.getMargin());
                    this.f4594d.resolve(width);
                    return;
                }
                if (this.f4593c == e.b.FIXED) {
                    this.f4594d.resolve(this.f4591a.getWidth());
                }
            }
        }
        g gVar = this.f4594d;
        if (gVar.resolved) {
            R.e eVar2 = this.f4591a;
            if (eVar2.measured) {
                R.d[] dVarArr = eVar2.mListAnchors;
                R.d dVar = dVarArr[0];
                R.d dVar2 = dVar.mTarget;
                if (dVar2 != null && dVarArr[1].mTarget != null) {
                    if (eVar2.isInHorizontalChain()) {
                        this.start.f4560c = this.f4591a.mListAnchors[0].getMargin();
                        this.end.f4560c = -this.f4591a.mListAnchors[1].getMargin();
                        return;
                    }
                    f fVarF = f(this.f4591a.mListAnchors[0]);
                    if (fVarF != null) {
                        a(this.start, fVarF, this.f4591a.mListAnchors[0].getMargin());
                    }
                    f fVarF2 = f(this.f4591a.mListAnchors[1]);
                    if (fVarF2 != null) {
                        a(this.end, fVarF2, -this.f4591a.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarF3 = f(dVar);
                    if (fVarF3 != null) {
                        a(this.start, fVarF3, this.f4591a.mListAnchors[0].getMargin());
                        a(this.end, this.start, this.f4594d.value);
                        return;
                    }
                    return;
                }
                R.d dVar3 = dVarArr[1];
                if (dVar3.mTarget != null) {
                    f fVarF4 = f(dVar3);
                    if (fVarF4 != null) {
                        a(this.end, fVarF4, -this.f4591a.mListAnchors[1].getMargin());
                        a(this.start, this.end, -this.f4594d.value);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof R.i) || eVar2.getParent() == null || this.f4591a.getAnchor(d.b.CENTER).mTarget != null) {
                    return;
                }
                a(this.start, this.f4591a.getParent().horizontalRun.start, this.f4591a.getX());
                a(this.end, this.start, this.f4594d.value);
                return;
            }
        }
        if (this.f4593c == e.b.MATCH_CONSTRAINT) {
            R.e eVar3 = this.f4591a;
            int i8 = eVar3.mMatchConstraintDefaultWidth;
            if (i8 == 2) {
                R.e parent3 = eVar3.getParent();
                if (parent3 != null) {
                    g gVar2 = parent3.verticalRun.f4594d;
                    this.f4594d.f4564g.add(gVar2);
                    gVar2.f4563f.add(this.f4594d);
                    g gVar3 = this.f4594d;
                    gVar3.delegateToWidgetRun = true;
                    gVar3.f4563f.add(this.start);
                    this.f4594d.f4563f.add(this.end);
                }
            } else if (i8 == 3) {
                if (eVar3.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    n nVar = eVar3.verticalRun;
                    nVar.start.updateDelegate = this;
                    nVar.end.updateDelegate = this;
                    gVar.updateDelegate = this;
                    if (eVar3.isInVerticalChain()) {
                        this.f4594d.f4564g.add(this.f4591a.verticalRun.f4594d);
                        this.f4591a.verticalRun.f4594d.f4563f.add(this.f4594d);
                        n nVar2 = this.f4591a.verticalRun;
                        nVar2.f4594d.updateDelegate = this;
                        this.f4594d.f4564g.add(nVar2.start);
                        this.f4594d.f4564g.add(this.f4591a.verticalRun.end);
                        this.f4591a.verticalRun.start.f4563f.add(this.f4594d);
                        this.f4591a.verticalRun.end.f4563f.add(this.f4594d);
                    } else if (this.f4591a.isInHorizontalChain()) {
                        this.f4591a.verticalRun.f4594d.f4564g.add(this.f4594d);
                        this.f4594d.f4563f.add(this.f4591a.verticalRun.f4594d);
                    } else {
                        this.f4591a.verticalRun.f4594d.f4564g.add(this.f4594d);
                    }
                } else {
                    g gVar4 = eVar3.verticalRun.f4594d;
                    gVar.f4564g.add(gVar4);
                    gVar4.f4563f.add(this.f4594d);
                    this.f4591a.verticalRun.start.f4563f.add(this.f4594d);
                    this.f4591a.verticalRun.end.f4563f.add(this.f4594d);
                    g gVar5 = this.f4594d;
                    gVar5.delegateToWidgetRun = true;
                    gVar5.f4563f.add(this.start);
                    this.f4594d.f4563f.add(this.end);
                    this.start.f4564g.add(this.f4594d);
                    this.end.f4564g.add(this.f4594d);
                }
            }
        }
        R.e eVar4 = this.f4591a;
        R.d[] dVarArr2 = eVar4.mListAnchors;
        R.d dVar4 = dVarArr2[0];
        R.d dVar5 = dVar4.mTarget;
        if (dVar5 != null && dVarArr2[1].mTarget != null) {
            if (eVar4.isInHorizontalChain()) {
                this.start.f4560c = this.f4591a.mListAnchors[0].getMargin();
                this.end.f4560c = -this.f4591a.mListAnchors[1].getMargin();
                return;
            }
            f fVarF5 = f(this.f4591a.mListAnchors[0]);
            f fVarF6 = f(this.f4591a.mListAnchors[1]);
            fVarF5.addDependency(this);
            fVarF6.addDependency(this);
            this.f4596f = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarF7 = f(dVar4);
            if (fVarF7 != null) {
                a(this.start, fVarF7, this.f4591a.mListAnchors[0].getMargin());
                b(this.end, this.start, 1, this.f4594d);
                return;
            }
            return;
        }
        R.d dVar6 = dVarArr2[1];
        if (dVar6.mTarget != null) {
            f fVarF8 = f(dVar6);
            if (fVarF8 != null) {
                a(this.end, fVarF8, -this.f4591a.mListAnchors[1].getMargin());
                b(this.start, this.end, -1, this.f4594d);
                return;
            }
            return;
        }
        if ((eVar4 instanceof R.i) || eVar4.getParent() == null) {
            return;
        }
        a(this.start, this.f4591a.getParent().horizontalRun.start, this.f4591a.getX());
        b(this.end, this.start, 1, this.f4594d);
    }

    @Override // S.p
    void d() {
        this.f4592b = null;
        this.start.clear();
        this.end.clear();
        this.f4594d.clear();
        this.f4595e = false;
    }

    @Override // S.p
    boolean i() {
        return this.f4593c != e.b.MATCH_CONSTRAINT || this.f4591a.mMatchConstraintDefaultWidth == 0;
    }

    void n() {
        this.f4595e = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.f4594d.resolved = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f4591a.getDebugName();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // S.p, S.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(S.d r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.l.update(S.d):void");
    }
}
