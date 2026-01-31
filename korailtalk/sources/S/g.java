package S;

import S.f;

/* loaded from: classes.dex */
class g extends f {
    public int wrapValue;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f4559b = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f4559b = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // S.f
    public void resolve(int i8) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i8;
        for (d dVar : this.f4563f) {
            dVar.update(dVar);
        }
    }
}
