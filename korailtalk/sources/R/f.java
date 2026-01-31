package R;

import R.e;
import S.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: f0 */
    S.b f4215f0;

    /* renamed from: g0 */
    protected b.InterfaceC0072b f4216g0;

    /* renamed from: h0 */
    private boolean f4217h0;

    /* renamed from: i0 */
    protected Q.d f4218i0;

    /* renamed from: j0 */
    int f4219j0;

    /* renamed from: k0 */
    int f4220k0;

    /* renamed from: l0 */
    int f4221l0;

    /* renamed from: m0 */
    int f4222m0;
    public S.e mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    public b.a mMeasure;
    public Q.e mMetrics;
    public boolean mSkipSolver;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    /* renamed from: n0 */
    c[] f4223n0;

    /* renamed from: o0 */
    c[] f4224o0;

    /* renamed from: p0 */
    private int f4225p0;

    /* renamed from: q0 */
    private boolean f4226q0;

    /* renamed from: r0 */
    private boolean f4227r0;

    /* renamed from: s0 */
    int f4228s0;

    /* renamed from: t0 */
    private WeakReference f4229t0;

    /* renamed from: u0 */
    private WeakReference f4230u0;

    /* renamed from: v0 */
    private WeakReference f4231v0;

    /* renamed from: w0 */
    private WeakReference f4232w0;

    public f() {
        this.f4215f0 = new S.b(this);
        this.mDependencyGraph = new S.e(this);
        this.f4216g0 = null;
        this.f4217h0 = false;
        this.f4218i0 = new Q.d();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.f4223n0 = new c[4];
        this.f4224o0 = new c[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.f4225p0 = k.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.f4226q0 = false;
        this.f4227r0 = false;
        this.f4228s0 = 0;
        this.f4229t0 = null;
        this.f4230u0 = null;
        this.f4231v0 = null;
        this.f4232w0 = null;
        this.mMeasure = new b.a();
    }

    private void i(e eVar) {
        int i8 = this.mHorizontalChainsSize + 1;
        c[] cVarArr = this.f4224o0;
        if (i8 >= cVarArr.length) {
            this.f4224o0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4224o0[this.mHorizontalChainsSize] = new c(eVar, 0, isRtl());
        this.mHorizontalChainsSize++;
    }

    private void j(d dVar, Q.i iVar) {
        this.f4218i0.addGreaterThan(iVar, this.f4218i0.createObjectVariable(dVar), 0, 5);
    }

    private void k(d dVar, Q.i iVar) {
        this.f4218i0.addGreaterThan(this.f4218i0.createObjectVariable(dVar), iVar, 0, 5);
    }

    private void l(e eVar) {
        int i8 = this.mVerticalChainsSize + 1;
        c[] cVarArr = this.f4223n0;
        if (i8 >= cVarArr.length) {
            this.f4223n0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4223n0[this.mVerticalChainsSize] = new c(eVar, 1, isRtl());
        this.mVerticalChainsSize++;
    }

    private void o() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    public boolean addChildrenToSolver(Q.d dVar) {
        boolean zOptimizeFor = optimizeFor(64);
        addToSolver(dVar, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.mChildren.get(i8);
            eVar.g(0, false);
            eVar.g(1, false);
            if (eVar instanceof a) {
                z8 = true;
            }
        }
        if (z8) {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar2 = this.mChildren.get(i9);
                if (eVar2 instanceof a) {
                    ((a) eVar2).h();
                }
            }
        }
        for (int i10 = 0; i10 < size; i10++) {
            e eVar3 = this.mChildren.get(i10);
            if (eVar3.b()) {
                eVar3.addToSolver(dVar, zOptimizeFor);
            }
        }
        if (Q.d.USE_DEPENDENCY_ORDERING) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar4 = this.mChildren.get(i11);
                if (!eVar4.b()) {
                    hashSet.add(eVar4);
                }
            }
            addChildrenToSolverByDependency(this, dVar, hashSet, getHorizontalDimensionBehaviour() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                e next = it.next();
                k.a(this, dVar, next);
                next.addToSolver(dVar, zOptimizeFor);
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar5 = this.mChildren.get(i12);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.mListDimensionBehaviors;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.setHorizontalDimensionBehaviour(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.setVerticalDimensionBehaviour(e.b.FIXED);
                    }
                    eVar5.addToSolver(dVar, zOptimizeFor);
                    if (bVar == bVar3) {
                        eVar5.setHorizontalDimensionBehaviour(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.setVerticalDimensionBehaviour(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar5);
                    if (!eVar5.b()) {
                        eVar5.addToSolver(dVar, zOptimizeFor);
                    }
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            b.applyChainConstraints(this, dVar, null, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            b.applyChainConstraints(this, dVar, null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(d dVar) {
        WeakReference weakReference = this.f4232w0;
        if (weakReference == null || weakReference.get() == null || dVar.getFinalValue() > ((d) this.f4232w0.get()).getFinalValue()) {
            this.f4232w0 = new WeakReference(dVar);
        }
    }

    public void addHorizontalWrapMinVariable(d dVar) {
        WeakReference weakReference = this.f4230u0;
        if (weakReference == null || weakReference.get() == null || dVar.getFinalValue() > ((d) this.f4230u0.get()).getFinalValue()) {
            this.f4230u0 = new WeakReference(dVar);
        }
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z8) {
        return this.mDependencyGraph.directMeasure(z8);
    }

    public boolean directMeasureSetup(boolean z8) {
        return this.mDependencyGraph.directMeasureSetup(z8);
    }

    public boolean directMeasureWithOrientation(boolean z8, int i8) {
        return this.mDependencyGraph.directMeasureWithOrientation(z8, i8);
    }

    public void fillMetrics(Q.e eVar) {
        this.mMetrics = eVar;
        this.f4218i0.fillMetrics(eVar);
    }

    public ArrayList<h> getHorizontalGuidelines() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.mChildren.get(i8);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.getOrientation() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0072b getMeasurer() {
        return this.f4216g0;
    }

    public int getOptimizationLevel() {
        return this.f4225p0;
    }

    public Q.d getSystem() {
        return this.f4218i0;
    }

    @Override // R.e
    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList<h> getVerticalGuidelines() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.mChildren.get(i8);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.getOrientation() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    void h(e eVar, int i8) {
        if (i8 == 0) {
            i(eVar);
        } else if (i8 == 1) {
            l(eVar);
        }
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.f4227r0;
    }

    public boolean isRtl() {
        return this.f4217h0;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.f4226q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:330:0x02ff A[PHI: r0 r2
  0x02ff: PHI (r0v20 boolean) = (r0v19 boolean), (r0v22 boolean), (r0v22 boolean), (r0v22 boolean) binds: [B:317:0x02c3, B:325:0x02e7, B:326:0x02e9, B:328:0x02ef] A[DONT_GENERATE, DONT_INLINE]
  0x02ff: PHI (r2v14 boolean) = (r2v13 boolean), (r2v16 boolean), (r2v16 boolean), (r2v16 boolean) binds: [B:317:0x02c3, B:325:0x02e7, B:326:0x02e9, B:328:0x02ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // R.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layout() {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R.f.layout():void");
    }

    void m(d dVar) {
        WeakReference weakReference = this.f4231v0;
        if (weakReference == null || weakReference.get() == null || dVar.getFinalValue() > ((d) this.f4231v0.get()).getFinalValue()) {
            this.f4231v0 = new WeakReference(dVar);
        }
    }

    public long measure(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f4219j0 = i15;
        this.f4220k0 = i16;
        return this.f4215f0.solverMeasure(this, i8, i15, i16, i9, i10, i11, i12, i13, i14);
    }

    void n(d dVar) {
        WeakReference weakReference = this.f4229t0;
        if (weakReference == null || weakReference.get() == null || dVar.getFinalValue() > ((d) this.f4229t0.get()).getFinalValue()) {
            this.f4229t0 = new WeakReference(dVar);
        }
    }

    public boolean optimizeFor(int i8) {
        return (this.f4225p0 & i8) == i8;
    }

    @Override // R.m, R.e
    public void reset() {
        this.f4218i0.reset();
        this.f4219j0 = 0;
        this.f4221l0 = 0;
        this.f4220k0 = 0;
        this.f4222m0 = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public void setMeasurer(b.InterfaceC0072b interfaceC0072b) {
        this.f4216g0 = interfaceC0072b;
        this.mDependencyGraph.setMeasurer(interfaceC0072b);
    }

    public void setOptimizationLevel(int i8) {
        this.f4225p0 = i8;
        Q.d.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f4219j0 = i8;
        this.f4220k0 = i9;
        this.f4221l0 = i10;
        this.f4222m0 = i11;
    }

    public void setRtl(boolean z8) {
        this.f4217h0 = z8;
    }

    public void updateChildrenFromSolver(Q.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zOptimizeFor = optimizeFor(64);
        updateFromSolver(dVar, zOptimizeFor);
        int size = this.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mChildren.get(i8).updateFromSolver(dVar, zOptimizeFor);
        }
    }

    @Override // R.e
    public void updateFromRuns(boolean z8, boolean z9) {
        super.updateFromRuns(z8, z9);
        int size = this.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mChildren.get(i8).updateFromRuns(z8, z9);
        }
    }

    public void updateHierarchy() {
        this.f4215f0.updateHierarchy(this);
    }

    public static boolean measure(e eVar, b.InterfaceC0072b interfaceC0072b, b.a aVar, int i8) {
        int i9;
        int i10;
        if (interfaceC0072b == null) {
            return false;
        }
        aVar.horizontalBehavior = eVar.getHorizontalDimensionBehaviour();
        aVar.verticalBehavior = eVar.getVerticalDimensionBehaviour();
        aVar.horizontalDimension = eVar.getWidth();
        aVar.verticalDimension = eVar.getHeight();
        aVar.measuredNeedsSolverPass = false;
        aVar.measureStrategy = i8;
        e.b bVar = aVar.horizontalBehavior;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z8 = bVar == bVar2;
        boolean z9 = aVar.verticalBehavior == bVar2;
        boolean z10 = z8 && eVar.mDimensionRatio > 0.0f;
        boolean z11 = z9 && eVar.mDimensionRatio > 0.0f;
        if (z8 && eVar.hasDanglingDimension(0) && eVar.mMatchConstraintDefaultWidth == 0 && !z10) {
            aVar.horizontalBehavior = e.b.WRAP_CONTENT;
            if (z9 && eVar.mMatchConstraintDefaultHeight == 0) {
                aVar.horizontalBehavior = e.b.FIXED;
            }
            z8 = false;
        }
        if (z9 && eVar.hasDanglingDimension(1) && eVar.mMatchConstraintDefaultHeight == 0 && !z11) {
            aVar.verticalBehavior = e.b.WRAP_CONTENT;
            if (z8 && eVar.mMatchConstraintDefaultWidth == 0) {
                aVar.verticalBehavior = e.b.FIXED;
            }
            z9 = false;
        }
        if (eVar.isResolvedHorizontally()) {
            aVar.horizontalBehavior = e.b.FIXED;
            z8 = false;
        }
        if (eVar.isResolvedVertically()) {
            aVar.verticalBehavior = e.b.FIXED;
            z9 = false;
        }
        if (z10) {
            if (eVar.mResolvedMatchConstraintDefault[0] == 4) {
                aVar.horizontalBehavior = e.b.FIXED;
            } else if (!z9) {
                e.b bVar3 = aVar.verticalBehavior;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i10 = aVar.verticalDimension;
                } else {
                    aVar.horizontalBehavior = e.b.WRAP_CONTENT;
                    interfaceC0072b.measure(eVar, aVar);
                    i10 = aVar.measuredHeight;
                }
                aVar.horizontalBehavior = bVar4;
                int i11 = eVar.f4207v;
                if (i11 != 0 && i11 != -1) {
                    aVar.horizontalDimension = (int) (eVar.getDimensionRatio() / i10);
                } else {
                    aVar.horizontalDimension = (int) (eVar.getDimensionRatio() * i10);
                }
            }
        }
        if (z11) {
            if (eVar.mResolvedMatchConstraintDefault[1] == 4) {
                aVar.verticalBehavior = e.b.FIXED;
            } else if (!z8) {
                e.b bVar5 = aVar.horizontalBehavior;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i9 = aVar.horizontalDimension;
                } else {
                    aVar.verticalBehavior = e.b.WRAP_CONTENT;
                    interfaceC0072b.measure(eVar, aVar);
                    i9 = aVar.measuredWidth;
                }
                aVar.verticalBehavior = bVar6;
                int i12 = eVar.f4207v;
                if (i12 != 0 && i12 != -1) {
                    aVar.verticalDimension = (int) (i9 * eVar.getDimensionRatio());
                } else {
                    aVar.verticalDimension = (int) (i9 / eVar.getDimensionRatio());
                }
            }
        }
        interfaceC0072b.measure(eVar, aVar);
        eVar.setWidth(aVar.measuredWidth);
        eVar.setHeight(aVar.measuredHeight);
        eVar.setHasBaseline(aVar.measuredHasBaseline);
        eVar.setBaselineDistance(aVar.measuredBaseline);
        aVar.measureStrategy = b.a.SELF_DIMENSIONS;
        return aVar.measuredNeedsSolverPass;
    }

    public f(int i8, int i9, int i10, int i11) {
        super(i8, i9, i10, i11);
        this.f4215f0 = new S.b(this);
        this.mDependencyGraph = new S.e(this);
        this.f4216g0 = null;
        this.f4217h0 = false;
        this.f4218i0 = new Q.d();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.f4223n0 = new c[4];
        this.f4224o0 = new c[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.f4225p0 = k.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.f4226q0 = false;
        this.f4227r0 = false;
        this.f4228s0 = 0;
        this.f4229t0 = null;
        this.f4230u0 = null;
        this.f4231v0 = null;
        this.f4232w0 = null;
        this.mMeasure = new b.a();
    }

    public f(int i8, int i9) {
        super(i8, i9);
        this.f4215f0 = new S.b(this);
        this.mDependencyGraph = new S.e(this);
        this.f4216g0 = null;
        this.f4217h0 = false;
        this.f4218i0 = new Q.d();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.f4223n0 = new c[4];
        this.f4224o0 = new c[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.f4225p0 = k.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.f4226q0 = false;
        this.f4227r0 = false;
        this.f4228s0 = 0;
        this.f4229t0 = null;
        this.f4230u0 = null;
        this.f4231v0 = null;
        this.f4232w0 = null;
        this.mMeasure = new b.a();
    }

    public f(String str, int i8, int i9) {
        super(i8, i9);
        this.f4215f0 = new S.b(this);
        this.mDependencyGraph = new S.e(this);
        this.f4216g0 = null;
        this.f4217h0 = false;
        this.f4218i0 = new Q.d();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.f4223n0 = new c[4];
        this.f4224o0 = new c[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.f4225p0 = k.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.f4226q0 = false;
        this.f4227r0 = false;
        this.f4228s0 = 0;
        this.f4229t0 = null;
        this.f4230u0 = null;
        this.f4231v0 = null;
        this.f4232w0 = null;
        this.mMeasure = new b.a();
        setDebugName(str);
    }
}
