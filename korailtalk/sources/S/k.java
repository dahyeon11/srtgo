package S;

import S.f;
import java.util.Iterator;

/* loaded from: classes.dex */
class k extends p {
    public k(R.e eVar) {
        super(eVar);
    }

    private void m(f fVar) {
        this.start.f4563f.add(fVar);
        fVar.f4564g.add(this.start);
    }

    @Override // S.p
    public void applyToWidget() {
        R.e eVar = this.f4591a;
        if (eVar instanceof R.a) {
            int barrierType = ((R.a) eVar).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.f4591a.setX(this.start.value);
            } else {
                this.f4591a.setY(this.start.value);
            }
        }
    }

    @Override // S.p
    void c() {
        R.e eVar = this.f4591a;
        if (eVar instanceof R.a) {
            this.start.delegateToWidgetRun = true;
            R.a aVar = (R.a) eVar;
            int barrierType = aVar.getBarrierType();
            boolean zAllowsGoneWidget = aVar.allowsGoneWidget();
            int i8 = 0;
            if (barrierType == 0) {
                this.start.f4559b = f.a.LEFT;
                while (i8 < aVar.mWidgetsCount) {
                    R.e eVar2 = aVar.mWidgets[i8];
                    if (zAllowsGoneWidget || eVar2.getVisibility() != 8) {
                        f fVar = eVar2.horizontalRun.start;
                        fVar.f4563f.add(this.start);
                        this.start.f4564g.add(fVar);
                    }
                    i8++;
                }
                m(this.f4591a.horizontalRun.start);
                m(this.f4591a.horizontalRun.end);
                return;
            }
            if (barrierType == 1) {
                this.start.f4559b = f.a.RIGHT;
                while (i8 < aVar.mWidgetsCount) {
                    R.e eVar3 = aVar.mWidgets[i8];
                    if (zAllowsGoneWidget || eVar3.getVisibility() != 8) {
                        f fVar2 = eVar3.horizontalRun.end;
                        fVar2.f4563f.add(this.start);
                        this.start.f4564g.add(fVar2);
                    }
                    i8++;
                }
                m(this.f4591a.horizontalRun.start);
                m(this.f4591a.horizontalRun.end);
                return;
            }
            if (barrierType == 2) {
                this.start.f4559b = f.a.TOP;
                while (i8 < aVar.mWidgetsCount) {
                    R.e eVar4 = aVar.mWidgets[i8];
                    if (zAllowsGoneWidget || eVar4.getVisibility() != 8) {
                        f fVar3 = eVar4.verticalRun.start;
                        fVar3.f4563f.add(this.start);
                        this.start.f4564g.add(fVar3);
                    }
                    i8++;
                }
                m(this.f4591a.verticalRun.start);
                m(this.f4591a.verticalRun.end);
                return;
            }
            if (barrierType != 3) {
                return;
            }
            this.start.f4559b = f.a.BOTTOM;
            while (i8 < aVar.mWidgetsCount) {
                R.e eVar5 = aVar.mWidgets[i8];
                if (zAllowsGoneWidget || eVar5.getVisibility() != 8) {
                    f fVar4 = eVar5.verticalRun.end;
                    fVar4.f4563f.add(this.start);
                    this.start.f4564g.add(fVar4);
                }
                i8++;
            }
            m(this.f4591a.verticalRun.start);
            m(this.f4591a.verticalRun.end);
        }
    }

    @Override // S.p
    void d() {
        this.f4592b = null;
        this.start.clear();
    }

    @Override // S.p
    boolean i() {
        return false;
    }

    @Override // S.p, S.d
    public void update(d dVar) {
        R.a aVar = (R.a) this.f4591a;
        int barrierType = aVar.getBarrierType();
        Iterator it = this.start.f4564g.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((f) it.next()).value;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.start.resolve(i9 + aVar.getMargin());
        } else {
            this.start.resolve(i8 + aVar.getMargin());
        }
    }
}
