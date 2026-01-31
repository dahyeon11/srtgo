package S;

import Q7.X;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g */
    static int f4576g;

    /* renamed from: b */
    int f4578b;

    /* renamed from: d */
    int f4580d;

    /* renamed from: a */
    ArrayList f4577a = new ArrayList();

    /* renamed from: c */
    boolean f4579c = false;

    /* renamed from: e */
    ArrayList f4581e = null;

    /* renamed from: f */
    private int f4582f = -1;

    class a {

        /* renamed from: a */
        WeakReference f4583a;

        /* renamed from: b */
        int f4584b;

        /* renamed from: c */
        int f4585c;

        /* renamed from: d */
        int f4586d;

        /* renamed from: e */
        int f4587e;

        /* renamed from: f */
        int f4588f;

        /* renamed from: g */
        int f4589g;

        public a(R.e eVar, Q.d dVar, int i8) {
            this.f4583a = new WeakReference(eVar);
            this.f4584b = dVar.getObjectVariableValue(eVar.mLeft);
            this.f4585c = dVar.getObjectVariableValue(eVar.mTop);
            this.f4586d = dVar.getObjectVariableValue(eVar.mRight);
            this.f4587e = dVar.getObjectVariableValue(eVar.mBottom);
            this.f4588f = dVar.getObjectVariableValue(eVar.mBaseline);
            this.f4589g = i8;
        }

        public void apply() {
            R.e eVar = (R.e) this.f4583a.get();
            if (eVar != null) {
                eVar.setFinalFrame(this.f4584b, this.f4585c, this.f4586d, this.f4587e, this.f4588f, this.f4589g);
            }
        }
    }

    public o(int i8) {
        int i9 = f4576g;
        f4576g = i9 + 1;
        this.f4578b = i9;
        this.f4580d = i8;
    }

    private boolean a(R.e eVar) {
        return this.f4577a.contains(eVar);
    }

    private String b() {
        int i8 = this.f4580d;
        return i8 == 0 ? "Horizontal" : i8 == 1 ? "Vertical" : i8 == 2 ? "Both" : "Unknown";
    }

    private int c(Q.d dVar, ArrayList arrayList, int i8) {
        int objectVariableValue;
        int objectVariableValue2;
        R.f fVar = (R.f) ((R.e) arrayList.get(0)).getParent();
        dVar.reset();
        fVar.addToSolver(dVar, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((R.e) arrayList.get(i9)).addToSolver(dVar, false);
        }
        if (i8 == 0 && fVar.mHorizontalChainsSize > 0) {
            R.b.applyChainConstraints(fVar, dVar, arrayList, 0);
        }
        if (i8 == 1 && fVar.mVerticalChainsSize > 0) {
            R.b.applyChainConstraints(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.minimize();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f4581e = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f4581e.add(new a((R.e) arrayList.get(i10), dVar, i8));
        }
        if (i8 == 0) {
            objectVariableValue = dVar.getObjectVariableValue(fVar.mLeft);
            objectVariableValue2 = dVar.getObjectVariableValue(fVar.mRight);
            dVar.reset();
        } else {
            objectVariableValue = dVar.getObjectVariableValue(fVar.mTop);
            objectVariableValue2 = dVar.getObjectVariableValue(fVar.mBottom);
            dVar.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(R.e eVar) {
        if (this.f4577a.contains(eVar)) {
            return false;
        }
        this.f4577a.add(eVar);
        return true;
    }

    public void apply() {
        if (this.f4581e != null && this.f4579c) {
            for (int i8 = 0; i8 < this.f4581e.size(); i8++) {
                ((a) this.f4581e.get(i8)).apply();
            }
        }
    }

    public void cleanup(ArrayList<o> arrayList) {
        int size = this.f4577a.size();
        if (this.f4582f != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                o oVar = arrayList.get(i8);
                if (this.f4582f == oVar.f4578b) {
                    moveTo(this.f4580d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.f4577a.clear();
    }

    public int getId() {
        return this.f4578b;
    }

    public int getOrientation() {
        return this.f4580d;
    }

    public boolean intersectWith(o oVar) {
        for (int i8 = 0; i8 < this.f4577a.size(); i8++) {
            if (oVar.a((R.e) this.f4577a.get(i8))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.f4579c;
    }

    public int measureWrap(Q.d dVar, int i8) {
        if (this.f4577a.size() == 0) {
            return 0;
        }
        return c(dVar, this.f4577a, i8);
    }

    public void moveTo(int i8, o oVar) {
        Iterator it = this.f4577a.iterator();
        while (it.hasNext()) {
            R.e eVar = (R.e) it.next();
            oVar.add(eVar);
            if (i8 == 0) {
                eVar.horizontalGroup = oVar.getId();
            } else {
                eVar.verticalGroup = oVar.getId();
            }
        }
        this.f4582f = oVar.f4578b;
    }

    public void setAuthoritative(boolean z8) {
        this.f4579c = z8;
    }

    public void setOrientation(int i8) {
        this.f4580d = i8;
    }

    public int size() {
        return this.f4577a.size();
    }

    public String toString() {
        String str = b() + " [" + this.f4578b + "] <";
        Iterator it = this.f4577a.iterator();
        while (it.hasNext()) {
            str = str + X.SPACE + ((R.e) it.next()).getDebugName();
        }
        return str + " >";
    }
}
