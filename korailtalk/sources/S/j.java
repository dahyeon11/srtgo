package S;

/* loaded from: classes.dex */
class j extends p {
    public j(R.e eVar) {
        super(eVar);
        eVar.horizontalRun.d();
        eVar.verticalRun.d();
        this.orientation = ((R.h) eVar).getOrientation();
    }

    private void m(f fVar) {
        this.start.f4563f.add(fVar);
        fVar.f4564g.add(this.start);
    }

    @Override // S.p
    public void applyToWidget() {
        if (((R.h) this.f4591a).getOrientation() == 1) {
            this.f4591a.setX(this.start.value);
        } else {
            this.f4591a.setY(this.start.value);
        }
    }

    @Override // S.p
    void c() {
        R.h hVar = (R.h) this.f4591a;
        int relativeBegin = hVar.getRelativeBegin();
        int relativeEnd = hVar.getRelativeEnd();
        hVar.getRelativePercent();
        if (hVar.getOrientation() == 1) {
            if (relativeBegin != -1) {
                this.start.f4564g.add(this.f4591a.mParent.horizontalRun.start);
                this.f4591a.mParent.horizontalRun.start.f4563f.add(this.start);
                this.start.f4560c = relativeBegin;
            } else if (relativeEnd != -1) {
                this.start.f4564g.add(this.f4591a.mParent.horizontalRun.end);
                this.f4591a.mParent.horizontalRun.end.f4563f.add(this.start);
                this.start.f4560c = -relativeEnd;
            } else {
                f fVar = this.start;
                fVar.delegateToWidgetRun = true;
                fVar.f4564g.add(this.f4591a.mParent.horizontalRun.end);
                this.f4591a.mParent.horizontalRun.end.f4563f.add(this.start);
            }
            m(this.f4591a.horizontalRun.start);
            m(this.f4591a.horizontalRun.end);
            return;
        }
        if (relativeBegin != -1) {
            this.start.f4564g.add(this.f4591a.mParent.verticalRun.start);
            this.f4591a.mParent.verticalRun.start.f4563f.add(this.start);
            this.start.f4560c = relativeBegin;
        } else if (relativeEnd != -1) {
            this.start.f4564g.add(this.f4591a.mParent.verticalRun.end);
            this.f4591a.mParent.verticalRun.end.f4563f.add(this.start);
            this.start.f4560c = -relativeEnd;
        } else {
            f fVar2 = this.start;
            fVar2.delegateToWidgetRun = true;
            fVar2.f4564g.add(this.f4591a.mParent.verticalRun.end);
            this.f4591a.mParent.verticalRun.end.f4563f.add(this.start);
        }
        m(this.f4591a.verticalRun.start);
        m(this.f4591a.verticalRun.end);
    }

    @Override // S.p
    void d() {
        this.start.clear();
    }

    @Override // S.p
    boolean i() {
        return false;
    }

    @Override // S.p, S.d
    public void update(d dVar) {
        f fVar = this.start;
        if (fVar.readyToSolve && !fVar.resolved) {
            this.start.resolve((int) ((((f) fVar.f4564g.get(0)).value * ((R.h) this.f4591a).getRelativePercent()) + 0.5f));
        }
    }
}
