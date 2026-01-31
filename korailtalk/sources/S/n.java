package S;

import R.d;
import R.e;
import S.f;
import S.p;

/* loaded from: classes.dex */
public class n extends p {
    public f baseline;

    /* renamed from: g */
    g f4574g;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4575a;

        static {
            int[] iArr = new int[p.b.values().length];
            f4575a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4575a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4575a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(R.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.baseline = fVar;
        this.f4574g = null;
        this.start.f4559b = f.a.TOP;
        this.end.f4559b = f.a.BOTTOM;
        fVar.f4559b = f.a.BASELINE;
        this.orientation = 1;
    }

    @Override // S.p
    public void applyToWidget() {
        f fVar = this.start;
        if (fVar.resolved) {
            this.f4591a.setY(fVar.value);
        }
    }

    @Override // S.p
    void c() {
        R.e parent;
        R.e parent2;
        R.e eVar = this.f4591a;
        if (eVar.measured) {
            this.f4594d.resolve(eVar.getHeight());
        }
        if (!this.f4594d.resolved) {
            this.f4593c = this.f4591a.getVerticalDimensionBehaviour();
            if (this.f4591a.hasBaseline()) {
                this.f4574g = new S.a(this);
            }
            e.b bVar = this.f4593c;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (parent2 = this.f4591a.getParent()) != null && parent2.getVerticalDimensionBehaviour() == e.b.FIXED) {
                    int height = (parent2.getHeight() - this.f4591a.mTop.getMargin()) - this.f4591a.mBottom.getMargin();
                    a(this.start, parent2.verticalRun.start, this.f4591a.mTop.getMargin());
                    a(this.end, parent2.verticalRun.end, -this.f4591a.mBottom.getMargin());
                    this.f4594d.resolve(height);
                    return;
                }
                if (this.f4593c == e.b.FIXED) {
                    this.f4594d.resolve(this.f4591a.getHeight());
                }
            }
        } else if (this.f4593c == e.b.MATCH_PARENT && (parent = this.f4591a.getParent()) != null && parent.getVerticalDimensionBehaviour() == e.b.FIXED) {
            a(this.start, parent.verticalRun.start, this.f4591a.mTop.getMargin());
            a(this.end, parent.verticalRun.end, -this.f4591a.mBottom.getMargin());
            return;
        }
        g gVar = this.f4594d;
        boolean z8 = gVar.resolved;
        if (z8) {
            R.e eVar2 = this.f4591a;
            if (eVar2.measured) {
                R.d[] dVarArr = eVar2.mListAnchors;
                R.d dVar = dVarArr[2];
                R.d dVar2 = dVar.mTarget;
                if (dVar2 != null && dVarArr[3].mTarget != null) {
                    if (eVar2.isInVerticalChain()) {
                        this.start.f4560c = this.f4591a.mListAnchors[2].getMargin();
                        this.end.f4560c = -this.f4591a.mListAnchors[3].getMargin();
                    } else {
                        f fVarF = f(this.f4591a.mListAnchors[2]);
                        if (fVarF != null) {
                            a(this.start, fVarF, this.f4591a.mListAnchors[2].getMargin());
                        }
                        f fVarF2 = f(this.f4591a.mListAnchors[3]);
                        if (fVarF2 != null) {
                            a(this.end, fVarF2, -this.f4591a.mListAnchors[3].getMargin());
                        }
                        this.start.delegateToWidgetRun = true;
                        this.end.delegateToWidgetRun = true;
                    }
                    if (this.f4591a.hasBaseline()) {
                        a(this.baseline, this.start, this.f4591a.getBaselineDistance());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarF3 = f(dVar);
                    if (fVarF3 != null) {
                        a(this.start, fVarF3, this.f4591a.mListAnchors[2].getMargin());
                        a(this.end, this.start, this.f4594d.value);
                        if (this.f4591a.hasBaseline()) {
                            a(this.baseline, this.start, this.f4591a.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    return;
                }
                R.d dVar3 = dVarArr[3];
                if (dVar3.mTarget != null) {
                    f fVarF4 = f(dVar3);
                    if (fVarF4 != null) {
                        a(this.end, fVarF4, -this.f4591a.mListAnchors[3].getMargin());
                        a(this.start, this.end, -this.f4594d.value);
                    }
                    if (this.f4591a.hasBaseline()) {
                        a(this.baseline, this.start, this.f4591a.getBaselineDistance());
                        return;
                    }
                    return;
                }
                R.d dVar4 = dVarArr[4];
                if (dVar4.mTarget != null) {
                    f fVarF5 = f(dVar4);
                    if (fVarF5 != null) {
                        a(this.baseline, fVarF5, 0);
                        a(this.start, this.baseline, -this.f4591a.getBaselineDistance());
                        a(this.end, this.start, this.f4594d.value);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof R.i) || eVar2.getParent() == null || this.f4591a.getAnchor(d.b.CENTER).mTarget != null) {
                    return;
                }
                a(this.start, this.f4591a.getParent().verticalRun.start, this.f4591a.getY());
                a(this.end, this.start, this.f4594d.value);
                if (this.f4591a.hasBaseline()) {
                    a(this.baseline, this.start, this.f4591a.getBaselineDistance());
                    return;
                }
                return;
            }
        }
        if (z8 || this.f4593c != e.b.MATCH_CONSTRAINT) {
            gVar.addDependency(this);
        } else {
            R.e eVar3 = this.f4591a;
            int i8 = eVar3.mMatchConstraintDefaultHeight;
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
            } else if (i8 == 3 && !eVar3.isInVerticalChain()) {
                R.e eVar4 = this.f4591a;
                if (eVar4.mMatchConstraintDefaultWidth != 3) {
                    g gVar4 = eVar4.horizontalRun.f4594d;
                    this.f4594d.f4564g.add(gVar4);
                    gVar4.f4563f.add(this.f4594d);
                    g gVar5 = this.f4594d;
                    gVar5.delegateToWidgetRun = true;
                    gVar5.f4563f.add(this.start);
                    this.f4594d.f4563f.add(this.end);
                }
            }
        }
        R.e eVar5 = this.f4591a;
        R.d[] dVarArr2 = eVar5.mListAnchors;
        R.d dVar5 = dVarArr2[2];
        R.d dVar6 = dVar5.mTarget;
        if (dVar6 != null && dVarArr2[3].mTarget != null) {
            if (eVar5.isInVerticalChain()) {
                this.start.f4560c = this.f4591a.mListAnchors[2].getMargin();
                this.end.f4560c = -this.f4591a.mListAnchors[3].getMargin();
            } else {
                f fVarF6 = f(this.f4591a.mListAnchors[2]);
                f fVarF7 = f(this.f4591a.mListAnchors[3]);
                fVarF6.addDependency(this);
                fVarF7.addDependency(this);
                this.f4596f = p.b.CENTER;
            }
            if (this.f4591a.hasBaseline()) {
                b(this.baseline, this.start, 1, this.f4574g);
            }
        } else if (dVar6 != null) {
            f fVarF8 = f(dVar5);
            if (fVarF8 != null) {
                a(this.start, fVarF8, this.f4591a.mListAnchors[2].getMargin());
                b(this.end, this.start, 1, this.f4594d);
                if (this.f4591a.hasBaseline()) {
                    b(this.baseline, this.start, 1, this.f4574g);
                }
                e.b bVar2 = this.f4593c;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f4591a.getDimensionRatio() > 0.0f) {
                    l lVar = this.f4591a.horizontalRun;
                    if (lVar.f4593c == bVar3) {
                        lVar.f4594d.f4563f.add(this.f4594d);
                        this.f4594d.f4564g.add(this.f4591a.horizontalRun.f4594d);
                        this.f4594d.updateDelegate = this;
                    }
                }
            }
        } else {
            R.d dVar7 = dVarArr2[3];
            if (dVar7.mTarget != null) {
                f fVarF9 = f(dVar7);
                if (fVarF9 != null) {
                    a(this.end, fVarF9, -this.f4591a.mListAnchors[3].getMargin());
                    b(this.start, this.end, -1, this.f4594d);
                    if (this.f4591a.hasBaseline()) {
                        b(this.baseline, this.start, 1, this.f4574g);
                    }
                }
            } else {
                R.d dVar8 = dVarArr2[4];
                if (dVar8.mTarget != null) {
                    f fVarF10 = f(dVar8);
                    if (fVarF10 != null) {
                        a(this.baseline, fVarF10, 0);
                        b(this.start, this.baseline, -1, this.f4574g);
                        b(this.end, this.start, 1, this.f4594d);
                    }
                } else if (!(eVar5 instanceof R.i) && eVar5.getParent() != null) {
                    a(this.start, this.f4591a.getParent().verticalRun.start, this.f4591a.getY());
                    b(this.end, this.start, 1, this.f4594d);
                    if (this.f4591a.hasBaseline()) {
                        b(this.baseline, this.start, 1, this.f4574g);
                    }
                    e.b bVar4 = this.f4593c;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f4591a.getDimensionRatio() > 0.0f) {
                        l lVar2 = this.f4591a.horizontalRun;
                        if (lVar2.f4593c == bVar5) {
                            lVar2.f4594d.f4563f.add(this.f4594d);
                            this.f4594d.f4564g.add(this.f4591a.horizontalRun.f4594d);
                            this.f4594d.updateDelegate = this;
                        }
                    }
                }
            }
        }
        if (this.f4594d.f4564g.size() == 0) {
            this.f4594d.readyToSolve = true;
        }
    }

    @Override // S.p
    void d() {
        this.f4592b = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.f4594d.clear();
        this.f4595e = false;
    }

    @Override // S.p
    boolean i() {
        return this.f4593c != e.b.MATCH_CONSTRAINT || this.f4591a.mMatchConstraintDefaultHeight == 0;
    }

    void m() {
        this.f4595e = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.f4594d.resolved = false;
    }

    public String toString() {
        return "VerticalRun " + this.f4591a.getDebugName();
    }

    @Override // S.p, S.d
    public void update(d dVar) {
        float f8;
        float dimensionRatio;
        float dimensionRatio2;
        int i8;
        int i9 = a.f4575a[this.f4596f.ordinal()];
        if (i9 == 1) {
            l(dVar);
        } else if (i9 == 2) {
            k(dVar);
        } else if (i9 == 3) {
            R.e eVar = this.f4591a;
            j(dVar, eVar.mTop, eVar.mBottom, 1);
            return;
        }
        g gVar = this.f4594d;
        if (gVar.readyToSolve && !gVar.resolved && this.f4593c == e.b.MATCH_CONSTRAINT) {
            R.e eVar2 = this.f4591a;
            int i10 = eVar2.mMatchConstraintDefaultHeight;
            if (i10 == 2) {
                R.e parent = eVar2.getParent();
                if (parent != null) {
                    if (parent.verticalRun.f4594d.resolved) {
                        this.f4594d.resolve((int) ((r7.value * this.f4591a.mMatchConstraintPercentHeight) + 0.5f));
                    }
                }
            } else if (i10 == 3 && eVar2.horizontalRun.f4594d.resolved) {
                int dimensionRatioSide = eVar2.getDimensionRatioSide();
                if (dimensionRatioSide == -1) {
                    R.e eVar3 = this.f4591a;
                    f8 = eVar3.horizontalRun.f4594d.value;
                    dimensionRatio = eVar3.getDimensionRatio();
                } else if (dimensionRatioSide == 0) {
                    dimensionRatio2 = r7.horizontalRun.f4594d.value * this.f4591a.getDimensionRatio();
                    i8 = (int) (dimensionRatio2 + 0.5f);
                    this.f4594d.resolve(i8);
                } else if (dimensionRatioSide != 1) {
                    i8 = 0;
                    this.f4594d.resolve(i8);
                } else {
                    R.e eVar4 = this.f4591a;
                    f8 = eVar4.horizontalRun.f4594d.value;
                    dimensionRatio = eVar4.getDimensionRatio();
                }
                dimensionRatio2 = f8 / dimensionRatio;
                i8 = (int) (dimensionRatio2 + 0.5f);
                this.f4594d.resolve(i8);
            }
        }
        f fVar = this.start;
        if (fVar.readyToSolve) {
            f fVar2 = this.end;
            if (fVar2.readyToSolve) {
                if (fVar.resolved && fVar2.resolved && this.f4594d.resolved) {
                    return;
                }
                if (!this.f4594d.resolved && this.f4593c == e.b.MATCH_CONSTRAINT) {
                    R.e eVar5 = this.f4591a;
                    if (eVar5.mMatchConstraintDefaultWidth == 0 && !eVar5.isInVerticalChain()) {
                        f fVar3 = (f) this.start.f4564g.get(0);
                        f fVar4 = (f) this.end.f4564g.get(0);
                        int i11 = fVar3.value;
                        f fVar5 = this.start;
                        int i12 = i11 + fVar5.f4560c;
                        int i13 = fVar4.value + this.end.f4560c;
                        fVar5.resolve(i12);
                        this.end.resolve(i13);
                        this.f4594d.resolve(i13 - i12);
                        return;
                    }
                }
                if (!this.f4594d.resolved && this.f4593c == e.b.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.f4564g.size() > 0 && this.end.f4564g.size() > 0) {
                    f fVar6 = (f) this.start.f4564g.get(0);
                    int i14 = (((f) this.end.f4564g.get(0)).value + this.end.f4560c) - (fVar6.value + this.start.f4560c);
                    g gVar2 = this.f4594d;
                    int i15 = gVar2.wrapValue;
                    if (i14 < i15) {
                        gVar2.resolve(i14);
                    } else {
                        gVar2.resolve(i15);
                    }
                }
                if (this.f4594d.resolved && this.start.f4564g.size() > 0 && this.end.f4564g.size() > 0) {
                    f fVar7 = (f) this.start.f4564g.get(0);
                    f fVar8 = (f) this.end.f4564g.get(0);
                    int i16 = fVar7.value + this.start.f4560c;
                    int i17 = fVar8.value + this.end.f4560c;
                    float verticalBiasPercent = this.f4591a.getVerticalBiasPercent();
                    if (fVar7 == fVar8) {
                        i16 = fVar7.value;
                        i17 = fVar8.value;
                        verticalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) (i16 + 0.5f + (((i17 - i16) - this.f4594d.value) * verticalBiasPercent)));
                    this.end.resolve(this.start.value + this.f4594d.value);
                }
            }
        }
    }
}
