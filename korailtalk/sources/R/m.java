package R;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends e {
    public ArrayList<e> mChildren;

    public m() {
        this.mChildren = new ArrayList<>();
    }

    public void add(e eVar) {
        this.mChildren.add(eVar);
        if (eVar.getParent() != null) {
            ((m) eVar.getParent()).remove(eVar);
        }
        eVar.setParent(this);
    }

    public ArrayList<e> getChildren() {
        return this.mChildren;
    }

    public f getRootConstraintContainer() {
        e parent = getParent();
        f fVar = this instanceof f ? (f) this : null;
        while (parent != null) {
            e parent2 = parent.getParent();
            if (parent instanceof f) {
                fVar = (f) parent;
            }
            parent = parent2;
        }
        return fVar;
    }

    public void layout() {
        ArrayList<e> arrayList = this.mChildren;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.mChildren.get(i8);
            if (eVar instanceof m) {
                ((m) eVar).layout();
            }
        }
    }

    public void remove(e eVar) {
        this.mChildren.remove(eVar);
        eVar.reset();
    }

    public void removeAllChildren() {
        this.mChildren.clear();
    }

    @Override // R.e
    public void reset() {
        this.mChildren.clear();
        super.reset();
    }

    @Override // R.e
    public void resetSolverVariables(Q.c cVar) {
        super.resetSolverVariables(cVar);
        int size = this.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mChildren.get(i8).resetSolverVariables(cVar);
        }
    }

    @Override // R.e
    public void setOffset(int i8, int i9) {
        super.setOffset(i8, i9);
        int size = this.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mChildren.get(i10).setOffset(d(), e());
        }
    }

    public m(int i8, int i9, int i10, int i11) {
        super(i8, i9, i10, i11);
        this.mChildren = new ArrayList<>();
    }

    public m(int i8, int i9) {
        super(i8, i9);
        this.mChildren = new ArrayList<>();
    }

    public void add(e... eVarArr) {
        for (e eVar : eVarArr) {
            add(eVar);
        }
    }
}
