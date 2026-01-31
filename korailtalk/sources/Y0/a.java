package Y0;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f5562a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f5563b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f5564c;

    public a() {
        this.f5562a = new PointF();
        this.f5563b = new PointF();
        this.f5564c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.f5562a;
    }

    public PointF getControlPoint2() {
        return this.f5563b;
    }

    public PointF getVertex() {
        return this.f5564c;
    }

    public void setControlPoint1(float f8, float f9) {
        this.f5562a.set(f8, f9);
    }

    public void setControlPoint2(float f8, float f9) {
        this.f5563b.set(f8, f9);
    }

    public void setFrom(a aVar) {
        PointF pointF = aVar.f5564c;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = aVar.f5562a;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f5563b;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f8, float f9) {
        this.f5564c.set(f8, f9);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f5564c.x), Float.valueOf(this.f5564c.y), Float.valueOf(this.f5562a.x), Float.valueOf(this.f5562a.y), Float.valueOf(this.f5563b.x), Float.valueOf(this.f5563b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f5562a = pointF;
        this.f5563b = pointF2;
        this.f5564c = pointF3;
    }
}
