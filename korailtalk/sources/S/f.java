package S;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    p f4558a;

    /* renamed from: c, reason: collision with root package name */
    int f4560c;
    public int value;
    public d updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;

    /* renamed from: b, reason: collision with root package name */
    a f4559b = a.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    int f4561d = 1;

    /* renamed from: e, reason: collision with root package name */
    g f4562e = null;
    public boolean resolved = false;

    /* renamed from: f, reason: collision with root package name */
    List f4563f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    List f4564g = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f4558a = pVar;
    }

    public void addDependency(d dVar) {
        this.f4563f.add(dVar);
        if (this.resolved) {
            dVar.update(dVar);
        }
    }

    public void clear() {
        this.f4564g.clear();
        this.f4563f.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String str;
        String debugName = this.f4558a.f4591a.getDebugName();
        a aVar = this.f4559b;
        if (aVar == a.LEFT || aVar == a.RIGHT) {
            str = debugName + "_HORIZONTAL";
        } else {
            str = debugName + "_VERTICAL";
        }
        return str + ":" + this.f4559b.name();
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4558a.f4591a.getDebugName());
        sb.append(":");
        sb.append(this.f4559b);
        sb.append("(");
        sb.append(this.resolved ? Integer.valueOf(this.value) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4564g.size());
        sb.append(":d=");
        sb.append(this.f4563f.size());
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }

    @Override // S.d
    public void update(d dVar) {
        Iterator it = this.f4564g.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        d dVar2 = this.updateDelegate;
        if (dVar2 != null) {
            dVar2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.f4558a.update(this);
            return;
        }
        f fVar = null;
        int i8 = 0;
        for (f fVar2 : this.f4564g) {
            if (!(fVar2 instanceof g)) {
                i8++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i8 == 1 && fVar.resolved) {
            g gVar = this.f4562e;
            if (gVar != null) {
                if (!gVar.resolved) {
                    return;
                } else {
                    this.f4560c = this.f4561d * gVar.value;
                }
            }
            resolve(fVar.value + this.f4560c);
        }
        d dVar3 = this.updateDelegate;
        if (dVar3 != null) {
            dVar3.update(this);
        }
    }
}
