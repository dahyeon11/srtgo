package a1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final List f5822a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f5823b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5824c;

    public n(PointF pointF, boolean z8, List<Y0.a> list) {
        this.f5823b = pointF;
        this.f5824c = z8;
        this.f5822a = new ArrayList(list);
    }

    public List<Y0.a> getCurves() {
        return this.f5822a;
    }

    public PointF getInitialPoint() {
        return this.f5823b;
    }

    public void interpolateBetween(n nVar, n nVar2, float f8) {
        if (this.f5823b == null) {
            this.f5823b = new PointF();
        }
        this.f5824c = nVar.isClosed() || nVar2.isClosed();
        if (nVar.getCurves().size() != nVar2.getCurves().size()) {
            f1.f.warning("Curves must have the same number of control points. Shape 1: " + nVar.getCurves().size() + "\tShape 2: " + nVar2.getCurves().size());
        }
        int iMin = Math.min(nVar.getCurves().size(), nVar2.getCurves().size());
        if (this.f5822a.size() < iMin) {
            for (int size = this.f5822a.size(); size < iMin; size++) {
                this.f5822a.add(new Y0.a());
            }
        } else if (this.f5822a.size() > iMin) {
            for (int size2 = this.f5822a.size() - 1; size2 >= iMin; size2--) {
                List list = this.f5822a;
                list.remove(list.size() - 1);
            }
        }
        PointF initialPoint = nVar.getInitialPoint();
        PointF initialPoint2 = nVar2.getInitialPoint();
        setInitialPoint(f1.i.lerp(initialPoint.x, initialPoint2.x, f8), f1.i.lerp(initialPoint.y, initialPoint2.y, f8));
        for (int size3 = this.f5822a.size() - 1; size3 >= 0; size3--) {
            Y0.a aVar = nVar.getCurves().get(size3);
            Y0.a aVar2 = nVar2.getCurves().get(size3);
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF controlPoint2 = aVar.getControlPoint2();
            PointF vertex = aVar.getVertex();
            PointF controlPoint12 = aVar2.getControlPoint1();
            PointF controlPoint22 = aVar2.getControlPoint2();
            PointF vertex2 = aVar2.getVertex();
            ((Y0.a) this.f5822a.get(size3)).setControlPoint1(f1.i.lerp(controlPoint1.x, controlPoint12.x, f8), f1.i.lerp(controlPoint1.y, controlPoint12.y, f8));
            ((Y0.a) this.f5822a.get(size3)).setControlPoint2(f1.i.lerp(controlPoint2.x, controlPoint22.x, f8), f1.i.lerp(controlPoint2.y, controlPoint22.y, f8));
            ((Y0.a) this.f5822a.get(size3)).setVertex(f1.i.lerp(vertex.x, vertex2.x, f8), f1.i.lerp(vertex.y, vertex2.y, f8));
        }
    }

    public boolean isClosed() {
        return this.f5824c;
    }

    public void setClosed(boolean z8) {
        this.f5824c = z8;
    }

    public void setInitialPoint(float f8, float f9) {
        if (this.f5823b == null) {
            this.f5823b = new PointF();
        }
        this.f5823b.set(f8, f9);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f5822a.size() + "closed=" + this.f5824c + '}';
    }

    public n() {
        this.f5822a = new ArrayList();
    }
}
