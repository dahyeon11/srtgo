package R;

import R.e;
import S.b;

/* loaded from: classes.dex */
public class l extends j {

    /* renamed from: f0 */
    private int f4285f0 = 0;

    /* renamed from: g0 */
    private int f4286g0 = 0;

    /* renamed from: h0 */
    private int f4287h0 = 0;

    /* renamed from: i0 */
    private int f4288i0 = 0;

    /* renamed from: j0 */
    private int f4289j0 = 0;

    /* renamed from: k0 */
    private int f4290k0 = 0;

    /* renamed from: l0 */
    private int f4291l0 = 0;

    /* renamed from: m0 */
    private int f4292m0 = 0;

    /* renamed from: n0 */
    private boolean f4293n0 = false;

    /* renamed from: o0 */
    private int f4294o0 = 0;

    /* renamed from: p0 */
    private int f4295p0 = 0;

    /* renamed from: q0 */
    protected b.a f4296q0 = new b.a();

    /* renamed from: r0 */
    b.InterfaceC0072b f4297r0 = null;

    public void applyRtl(boolean z8) {
        int i8 = this.f4289j0;
        if (i8 > 0 || this.f4290k0 > 0) {
            if (z8) {
                this.f4291l0 = this.f4290k0;
                this.f4292m0 = i8;
            } else {
                this.f4291l0 = i8;
                this.f4292m0 = this.f4290k0;
            }
        }
    }

    public void captureWidgets() {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            e eVar = this.mWidgets[i8];
            if (eVar != null) {
                eVar.setInVirtualLayout(true);
            }
        }
    }

    public int getMeasuredHeight() {
        return this.f4295p0;
    }

    public int getMeasuredWidth() {
        return this.f4294o0;
    }

    public int getPaddingBottom() {
        return this.f4286g0;
    }

    public int getPaddingLeft() {
        return this.f4291l0;
    }

    public int getPaddingRight() {
        return this.f4292m0;
    }

    public int getPaddingTop() {
        return this.f4285f0;
    }

    protected void h(e eVar, e.b bVar, int i8, e.b bVar2, int i9) {
        while (this.f4297r0 == null && getParent() != null) {
            this.f4297r0 = ((f) getParent()).getMeasurer();
        }
        b.a aVar = this.f4296q0;
        aVar.horizontalBehavior = bVar;
        aVar.verticalBehavior = bVar2;
        aVar.horizontalDimension = i8;
        aVar.verticalDimension = i9;
        this.f4297r0.measure(eVar, aVar);
        eVar.setWidth(this.f4296q0.measuredWidth);
        eVar.setHeight(this.f4296q0.measuredHeight);
        eVar.setHasBaseline(this.f4296q0.measuredHasBaseline);
        eVar.setBaselineDistance(this.f4296q0.measuredBaseline);
    }

    protected boolean i() {
        e eVar = this.mParent;
        b.InterfaceC0072b measurer = eVar != null ? ((f) eVar).getMeasurer() : null;
        if (measurer == null) {
            return false;
        }
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            e eVar2 = this.mWidgets[i8];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b dimensionBehaviour = eVar2.getDimensionBehaviour(0);
                e.b dimensionBehaviour2 = eVar2.getDimensionBehaviour(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (dimensionBehaviour != bVar || eVar2.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour2 != bVar || eVar2.mMatchConstraintDefaultHeight == 1) {
                    if (dimensionBehaviour == bVar) {
                        dimensionBehaviour = e.b.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == bVar) {
                        dimensionBehaviour2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f4296q0;
                    aVar.horizontalBehavior = dimensionBehaviour;
                    aVar.verticalBehavior = dimensionBehaviour2;
                    aVar.horizontalDimension = eVar2.getWidth();
                    this.f4296q0.verticalDimension = eVar2.getHeight();
                    measurer.measure(eVar2, this.f4296q0);
                    eVar2.setWidth(this.f4296q0.measuredWidth);
                    eVar2.setHeight(this.f4296q0.measuredHeight);
                    eVar2.setBaselineDistance(this.f4296q0.measuredBaseline);
                }
            }
        }
        return true;
    }

    protected void j(boolean z8) {
        this.f4293n0 = z8;
    }

    public boolean needSolverPass() {
        return this.f4293n0;
    }

    public void setMeasure(int i8, int i9) {
        this.f4294o0 = i8;
        this.f4295p0 = i9;
    }

    public void setPadding(int i8) {
        this.f4287h0 = i8;
        this.f4285f0 = i8;
        this.f4288i0 = i8;
        this.f4286g0 = i8;
        this.f4289j0 = i8;
        this.f4290k0 = i8;
    }

    public void setPaddingBottom(int i8) {
        this.f4286g0 = i8;
    }

    public void setPaddingEnd(int i8) {
        this.f4290k0 = i8;
    }

    public void setPaddingLeft(int i8) {
        this.f4287h0 = i8;
        this.f4291l0 = i8;
    }

    public void setPaddingRight(int i8) {
        this.f4288i0 = i8;
        this.f4292m0 = i8;
    }

    public void setPaddingStart(int i8) {
        this.f4289j0 = i8;
        this.f4291l0 = i8;
        this.f4292m0 = i8;
    }

    public void setPaddingTop(int i8) {
        this.f4285f0 = i8;
    }

    @Override // R.j, R.i
    public void updateConstraints(f fVar) {
        captureWidgets();
    }

    public void measure(int i8, int i9, int i10, int i11) {
    }
}
