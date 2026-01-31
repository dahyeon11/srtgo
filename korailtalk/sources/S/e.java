package S;

import R.e;
import S.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private R.f f4549a;

    /* renamed from: d, reason: collision with root package name */
    private R.f f4552d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4550b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4551c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f4553e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f4554f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0072b f4555g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f4556h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f4557i = new ArrayList();

    public e(R.f fVar) {
        this.f4549a = fVar;
        this.f4552d = fVar;
    }

    private void a(f fVar, int i8, int i9, f fVar2, ArrayList arrayList, m mVar) {
        p pVar = fVar.f4558a;
        if (pVar.f4592b == null) {
            R.f fVar3 = this.f4549a;
            if (pVar == fVar3.horizontalRun || pVar == fVar3.verticalRun) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i9);
                arrayList.add(mVar);
            }
            pVar.f4592b = mVar;
            mVar.add(pVar);
            for (d dVar : pVar.start.f4563f) {
                if (dVar instanceof f) {
                    a((f) dVar, i8, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.end.f4563f) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i8, 1, fVar2, arrayList, mVar);
                }
            }
            if (i8 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).baseline.f4563f) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i8, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.start.f4564g) {
                if (fVar4 == fVar2) {
                    mVar.dual = true;
                }
                a(fVar4, i8, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.end.f4564g) {
                if (fVar5 == fVar2) {
                    mVar.dual = true;
                }
                a(fVar5, i8, 1, fVar2, arrayList, mVar);
            }
            if (i8 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).baseline.f4564g.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i8, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(R.f fVar) {
        int width;
        e.b bVar;
        int height;
        e.b bVar2;
        e.b[] bVarArr;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        e.b bVar6;
        Iterator<R.e> it = fVar.mChildren.iterator();
        while (it.hasNext()) {
            R.e next = it.next();
            e.b[] bVarArr2 = next.mListDimensionBehaviors;
            e.b bVar7 = bVarArr2[0];
            e.b bVar8 = bVarArr2[1];
            if (next.getVisibility() == 8) {
                next.measured = true;
            } else {
                if (next.mMatchConstraintPercentWidth < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultWidth = 2;
                }
                if (next.mMatchConstraintPercentHeight < 1.0f && bVar8 == e.b.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultHeight = 2;
                }
                if (next.getDimensionRatio() > 0.0f) {
                    e.b bVar9 = e.b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == e.b.WRAP_CONTENT || bVar8 == e.b.FIXED)) {
                        next.mMatchConstraintDefaultWidth = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        next.mMatchConstraintDefaultHeight = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (next.mMatchConstraintDefaultWidth == 0) {
                            next.mMatchConstraintDefaultWidth = 3;
                        }
                        if (next.mMatchConstraintDefaultHeight == 0) {
                            next.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                e.b bVar10 = e.b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && next.mMatchConstraintDefaultWidth == 1 && (next.mLeft.mTarget == null || next.mRight.mTarget == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                if (bVar8 == bVar10 && next.mMatchConstraintDefaultHeight == 1 && (next.mTop.mTarget == null || next.mBottom.mTarget == null)) {
                    bVar8 = e.b.WRAP_CONTENT;
                }
                e.b bVar12 = bVar8;
                l lVar = next.horizontalRun;
                lVar.f4593c = bVar11;
                int i8 = next.mMatchConstraintDefaultWidth;
                lVar.matchConstraintsType = i8;
                n nVar = next.verticalRun;
                nVar.f4593c = bVar12;
                int i9 = next.mMatchConstraintDefaultHeight;
                nVar.matchConstraintsType = i9;
                e.b bVar13 = e.b.MATCH_PARENT;
                if ((bVar11 == bVar13 || bVar11 == e.b.FIXED || bVar11 == e.b.WRAP_CONTENT) && (bVar12 == bVar13 || bVar12 == e.b.FIXED || bVar12 == e.b.WRAP_CONTENT)) {
                    int width2 = next.getWidth();
                    if (bVar11 == bVar13) {
                        width = (fVar.getWidth() - next.mLeft.mMargin) - next.mRight.mMargin;
                        bVar = e.b.FIXED;
                    } else {
                        width = width2;
                        bVar = bVar11;
                    }
                    int height2 = next.getHeight();
                    if (bVar12 == bVar13) {
                        height = (fVar.getHeight() - next.mTop.mMargin) - next.mBottom.mMargin;
                        bVar2 = e.b.FIXED;
                    } else {
                        height = height2;
                        bVar2 = bVar12;
                    }
                    e(next, bVar, width, bVar2, height);
                    next.horizontalRun.f4594d.resolve(next.getWidth());
                    next.verticalRun.f4594d.resolve(next.getHeight());
                    next.measured = true;
                } else {
                    if (bVar11 == bVar10 && (bVar12 == (bVar6 = e.b.WRAP_CONTENT) || bVar12 == e.b.FIXED)) {
                        if (i8 == 3) {
                            if (bVar12 == bVar6) {
                                e(next, bVar6, 0, bVar6, 0);
                            }
                            int height3 = next.getHeight();
                            int i10 = (int) ((height3 * next.mDimensionRatio) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            e(next, bVar14, i10, bVar14, height3);
                            next.horizontalRun.f4594d.resolve(next.getWidth());
                            next.verticalRun.f4594d.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i8 == 1) {
                            e(next, bVar6, 0, bVar12, 0);
                            next.horizontalRun.f4594d.wrapValue = next.getWidth();
                        } else if (i8 == 2) {
                            e.b bVar15 = fVar.mListDimensionBehaviors[0];
                            e.b bVar16 = e.b.FIXED;
                            if (bVar15 == bVar16 || bVar15 == bVar13) {
                                e(next, bVar16, (int) ((next.mMatchConstraintPercentWidth * fVar.getWidth()) + 0.5f), bVar12, next.getHeight());
                                next.horizontalRun.f4594d.resolve(next.getWidth());
                                next.verticalRun.f4594d.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            R.d[] dVarArr = next.mListAnchors;
                            if (dVarArr[0].mTarget == null || dVarArr[1].mTarget == null) {
                                e(next, bVar6, 0, bVar12, 0);
                                next.horizontalRun.f4594d.resolve(next.getWidth());
                                next.verticalRun.f4594d.resolve(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (bVar12 == bVar10 && (bVar11 == (bVar5 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                        if (i9 == 3) {
                            if (bVar11 == bVar5) {
                                e(next, bVar5, 0, bVar5, 0);
                            }
                            int width3 = next.getWidth();
                            float f8 = next.mDimensionRatio;
                            if (next.getDimensionRatioSide() == -1) {
                                f8 = 1.0f / f8;
                            }
                            e.b bVar17 = e.b.FIXED;
                            e(next, bVar17, width3, bVar17, (int) ((width3 * f8) + 0.5f));
                            next.horizontalRun.f4594d.resolve(next.getWidth());
                            next.verticalRun.f4594d.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i9 == 1) {
                            e(next, bVar11, 0, bVar5, 0);
                            next.verticalRun.f4594d.wrapValue = next.getHeight();
                        } else if (i9 == 2) {
                            e.b bVar18 = fVar.mListDimensionBehaviors[1];
                            e.b bVar19 = e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar13) {
                                e(next, bVar11, next.getWidth(), bVar19, (int) ((next.mMatchConstraintPercentHeight * fVar.getHeight()) + 0.5f));
                                next.horizontalRun.f4594d.resolve(next.getWidth());
                                next.verticalRun.f4594d.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            R.d[] dVarArr2 = next.mListAnchors;
                            if (dVarArr2[2].mTarget == null || dVarArr2[3].mTarget == null) {
                                e(next, bVar5, 0, bVar12, 0);
                                next.horizontalRun.f4594d.resolve(next.getWidth());
                                next.verticalRun.f4594d.resolve(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (bVar11 == bVar10 && bVar12 == bVar10) {
                        if (i8 == 1 || i9 == 1) {
                            e.b bVar20 = e.b.WRAP_CONTENT;
                            e(next, bVar20, 0, bVar20, 0);
                            next.horizontalRun.f4594d.wrapValue = next.getWidth();
                            next.verticalRun.f4594d.wrapValue = next.getHeight();
                        } else if (i9 == 2 && i8 == 2 && ((bVar3 = (bVarArr = fVar.mListDimensionBehaviors)[0]) == (bVar4 = e.b.FIXED) || bVar3 == bVar4)) {
                            e.b bVar21 = bVarArr[1];
                            if (bVar21 == bVar4 || bVar21 == bVar4) {
                                e(next, bVar4, (int) ((next.mMatchConstraintPercentWidth * fVar.getWidth()) + 0.5f), bVar4, (int) ((next.mMatchConstraintPercentHeight * fVar.getHeight()) + 0.5f));
                                next.horizontalRun.f4594d.resolve(next.getWidth());
                                next.verticalRun.f4594d.resolve(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int c(R.f fVar, int i8) {
        int size = this.f4557i.size();
        long jMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            jMax = Math.max(jMax, ((m) this.f4557i.get(i9)).computeWrapSize(fVar, i8));
        }
        return (int) jMax;
    }

    private void d(p pVar, int i8, ArrayList arrayList) {
        for (d dVar : pVar.start.f4563f) {
            if (dVar instanceof f) {
                a((f) dVar, i8, 0, pVar.end, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).start, i8, 0, pVar.end, arrayList, null);
            }
        }
        for (d dVar2 : pVar.end.f4563f) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i8, 1, pVar.start, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).end, i8, 1, pVar.start, arrayList, null);
            }
        }
        if (i8 == 1) {
            for (d dVar3 : ((n) pVar).baseline.f4563f) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i8, 2, null, arrayList, null);
                }
            }
        }
    }

    private void e(R.e eVar, e.b bVar, int i8, e.b bVar2, int i9) {
        b.a aVar = this.f4556h;
        aVar.horizontalBehavior = bVar;
        aVar.verticalBehavior = bVar2;
        aVar.horizontalDimension = i8;
        aVar.verticalDimension = i9;
        this.f4555g.measure(eVar, aVar);
        eVar.setWidth(this.f4556h.measuredWidth);
        eVar.setHeight(this.f4556h.measuredHeight);
        eVar.setHasBaseline(this.f4556h.measuredHasBaseline);
        eVar.setBaselineDistance(this.f4556h.measuredBaseline);
    }

    public void buildGraph() {
        buildGraph(this.f4553e);
        this.f4557i.clear();
        m.index = 0;
        d(this.f4549a.horizontalRun, 0, this.f4557i);
        d(this.f4549a.verticalRun, 1, this.f4557i);
        this.f4550b = false;
    }

    public void defineTerminalWidgets(e.b bVar, e.b bVar2) {
        if (this.f4550b) {
            buildGraph();
            Iterator<R.e> it = this.f4549a.mChildren.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                R.e next = it.next();
                boolean[] zArr = next.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof R.a) {
                    z8 = true;
                }
            }
            if (z8) {
                return;
            }
            Iterator it2 = this.f4557i.iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                e.b bVar3 = e.b.WRAP_CONTENT;
                mVar.defineTerminalWidgets(bVar == bVar3, bVar2 == bVar3);
            }
        }
    }

    public boolean directMeasure(boolean z8) {
        boolean z9;
        boolean z10 = false;
        if (this.f4550b || this.f4551c) {
            Iterator<R.e> it = this.f4549a.mChildren.iterator();
            while (it.hasNext()) {
                R.e next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.horizontalRun.n();
                next.verticalRun.m();
            }
            this.f4549a.ensureWidgetRuns();
            R.f fVar = this.f4549a;
            fVar.measured = false;
            fVar.horizontalRun.n();
            this.f4549a.verticalRun.m();
            this.f4551c = false;
        }
        if (b(this.f4552d)) {
            return false;
        }
        this.f4549a.setX(0);
        this.f4549a.setY(0);
        e.b dimensionBehaviour = this.f4549a.getDimensionBehaviour(0);
        e.b dimensionBehaviour2 = this.f4549a.getDimensionBehaviour(1);
        if (this.f4550b) {
            buildGraph();
        }
        int x8 = this.f4549a.getX();
        int y8 = this.f4549a.getY();
        this.f4549a.horizontalRun.start.resolve(x8);
        this.f4549a.verticalRun.start.resolve(y8);
        measureWidgets();
        e.b bVar = e.b.WRAP_CONTENT;
        if (dimensionBehaviour == bVar || dimensionBehaviour2 == bVar) {
            if (z8) {
                Iterator it2 = this.f4553e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((p) it2.next()).i()) {
                        z8 = false;
                        break;
                    }
                }
            }
            if (z8 && dimensionBehaviour == e.b.WRAP_CONTENT) {
                this.f4549a.setHorizontalDimensionBehaviour(e.b.FIXED);
                R.f fVar2 = this.f4549a;
                fVar2.setWidth(c(fVar2, 0));
                R.f fVar3 = this.f4549a;
                fVar3.horizontalRun.f4594d.resolve(fVar3.getWidth());
            }
            if (z8 && dimensionBehaviour2 == e.b.WRAP_CONTENT) {
                this.f4549a.setVerticalDimensionBehaviour(e.b.FIXED);
                R.f fVar4 = this.f4549a;
                fVar4.setHeight(c(fVar4, 1));
                R.f fVar5 = this.f4549a;
                fVar5.verticalRun.f4594d.resolve(fVar5.getHeight());
            }
        }
        R.f fVar6 = this.f4549a;
        e.b bVar2 = fVar6.mListDimensionBehaviors[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int width = fVar6.getWidth() + x8;
            this.f4549a.horizontalRun.end.resolve(width);
            this.f4549a.horizontalRun.f4594d.resolve(width - x8);
            measureWidgets();
            R.f fVar7 = this.f4549a;
            e.b bVar4 = fVar7.mListDimensionBehaviors[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int height = fVar7.getHeight() + y8;
                this.f4549a.verticalRun.end.resolve(height);
                this.f4549a.verticalRun.f4594d.resolve(height - y8);
            }
            measureWidgets();
            z9 = true;
        } else {
            z9 = false;
        }
        Iterator it3 = this.f4553e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f4591a != this.f4549a || pVar.f4595e) {
                pVar.applyToWidget();
            }
        }
        Iterator it4 = this.f4553e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z10 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if (z9 || pVar2.f4591a != this.f4549a) {
                if (!pVar2.start.resolved || ((!pVar2.end.resolved && !(pVar2 instanceof j)) || (!pVar2.f4594d.resolved && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    break;
                }
            }
        }
        this.f4549a.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.f4549a.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z10;
    }

    public boolean directMeasureSetup(boolean z8) {
        if (this.f4550b) {
            Iterator<R.e> it = this.f4549a.mChildren.iterator();
            while (it.hasNext()) {
                R.e next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                l lVar = next.horizontalRun;
                lVar.f4594d.resolved = false;
                lVar.f4595e = false;
                lVar.n();
                n nVar = next.verticalRun;
                nVar.f4594d.resolved = false;
                nVar.f4595e = false;
                nVar.m();
            }
            this.f4549a.ensureWidgetRuns();
            R.f fVar = this.f4549a;
            fVar.measured = false;
            l lVar2 = fVar.horizontalRun;
            lVar2.f4594d.resolved = false;
            lVar2.f4595e = false;
            lVar2.n();
            n nVar2 = this.f4549a.verticalRun;
            nVar2.f4594d.resolved = false;
            nVar2.f4595e = false;
            nVar2.m();
            buildGraph();
        }
        if (b(this.f4552d)) {
            return false;
        }
        this.f4549a.setX(0);
        this.f4549a.setY(0);
        this.f4549a.horizontalRun.start.resolve(0);
        this.f4549a.verticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z8, int i8) {
        boolean z9;
        e.b bVar;
        boolean z10 = false;
        e.b dimensionBehaviour = this.f4549a.getDimensionBehaviour(0);
        e.b dimensionBehaviour2 = this.f4549a.getDimensionBehaviour(1);
        int x8 = this.f4549a.getX();
        int y8 = this.f4549a.getY();
        if (z8 && (dimensionBehaviour == (bVar = e.b.WRAP_CONTENT) || dimensionBehaviour2 == bVar)) {
            Iterator it = this.f4553e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.orientation == i8 && !pVar.i()) {
                    z8 = false;
                    break;
                }
            }
            if (i8 == 0) {
                if (z8 && dimensionBehaviour == e.b.WRAP_CONTENT) {
                    this.f4549a.setHorizontalDimensionBehaviour(e.b.FIXED);
                    R.f fVar = this.f4549a;
                    fVar.setWidth(c(fVar, 0));
                    R.f fVar2 = this.f4549a;
                    fVar2.horizontalRun.f4594d.resolve(fVar2.getWidth());
                }
            } else if (z8 && dimensionBehaviour2 == e.b.WRAP_CONTENT) {
                this.f4549a.setVerticalDimensionBehaviour(e.b.FIXED);
                R.f fVar3 = this.f4549a;
                fVar3.setHeight(c(fVar3, 1));
                R.f fVar4 = this.f4549a;
                fVar4.verticalRun.f4594d.resolve(fVar4.getHeight());
            }
        }
        if (i8 == 0) {
            R.f fVar5 = this.f4549a;
            e.b bVar2 = fVar5.mListDimensionBehaviors[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int width = fVar5.getWidth() + x8;
                this.f4549a.horizontalRun.end.resolve(width);
                this.f4549a.horizontalRun.f4594d.resolve(width - x8);
                z9 = true;
            }
            z9 = false;
        } else {
            R.f fVar6 = this.f4549a;
            e.b bVar3 = fVar6.mListDimensionBehaviors[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int height = fVar6.getHeight() + y8;
                this.f4549a.verticalRun.end.resolve(height);
                this.f4549a.verticalRun.f4594d.resolve(height - y8);
                z9 = true;
            }
            z9 = false;
        }
        measureWidgets();
        Iterator it2 = this.f4553e.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.orientation == i8 && (pVar2.f4591a != this.f4549a || pVar2.f4595e)) {
                pVar2.applyToWidget();
            }
        }
        Iterator it3 = this.f4553e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z10 = true;
                break;
            }
            p pVar3 = (p) it3.next();
            if (pVar3.orientation == i8 && (z9 || pVar3.f4591a != this.f4549a)) {
                if (!pVar3.start.resolved || !pVar3.end.resolved || (!(pVar3 instanceof c) && !pVar3.f4594d.resolved)) {
                    break;
                }
            }
        }
        this.f4549a.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.f4549a.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z10;
    }

    public void invalidateGraph() {
        this.f4550b = true;
    }

    public void invalidateMeasures() {
        this.f4551c = true;
    }

    public void measureWidgets() {
        g gVar;
        Iterator<R.e> it = this.f4549a.mChildren.iterator();
        while (it.hasNext()) {
            R.e next = it.next();
            if (!next.measured) {
                e.b[] bVarArr = next.mListDimensionBehaviors;
                boolean z8 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i8 = next.mMatchConstraintDefaultWidth;
                int i9 = next.mMatchConstraintDefaultHeight;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z9 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i8 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i9 == 1)) {
                    z8 = true;
                }
                g gVar2 = next.horizontalRun.f4594d;
                boolean z10 = gVar2.resolved;
                g gVar3 = next.verticalRun.f4594d;
                boolean z11 = gVar3.resolved;
                if (z10 && z11) {
                    e.b bVar4 = e.b.FIXED;
                    e(next, bVar4, gVar2.value, bVar4, gVar3.value);
                    next.measured = true;
                } else if (z10 && z8) {
                    e(next, e.b.FIXED, gVar2.value, bVar3, gVar3.value);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.verticalRun.f4594d.wrapValue = next.getHeight();
                    } else {
                        next.verticalRun.f4594d.resolve(next.getHeight());
                        next.measured = true;
                    }
                } else if (z11 && z9) {
                    e(next, bVar3, gVar2.value, e.b.FIXED, gVar3.value);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.horizontalRun.f4594d.wrapValue = next.getWidth();
                    } else {
                        next.horizontalRun.f4594d.resolve(next.getWidth());
                        next.measured = true;
                    }
                }
                if (next.measured && (gVar = next.verticalRun.f4574g) != null) {
                    gVar.resolve(next.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(b.InterfaceC0072b interfaceC0072b) {
        this.f4555g = interfaceC0072b;
    }

    public void buildGraph(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f4552d.horizontalRun.d();
        this.f4552d.verticalRun.d();
        arrayList.add(this.f4552d.horizontalRun);
        arrayList.add(this.f4552d.verticalRun);
        Iterator<R.e> it = this.f4552d.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            R.e next = it.next();
            if (next instanceof R.h) {
                arrayList.add(new j(next));
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.horizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.verticalRun);
                }
                if (next instanceof R.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f4591a != this.f4552d) {
                next2.c();
            }
        }
    }
}
