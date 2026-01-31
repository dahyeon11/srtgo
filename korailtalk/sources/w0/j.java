package W0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import g1.C5534a;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f5268i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f5269j;

    /* renamed from: k, reason: collision with root package name */
    private final PathMeasure f5270k;

    /* renamed from: l, reason: collision with root package name */
    private i f5271l;

    public j(List<? extends C5534a> list) {
        super(list);
        this.f5268i = new PointF();
        this.f5269j = new float[2];
        this.f5270k = new PathMeasure();
    }

    @Override // W0.a
    public PointF getValue(C5534a c5534a, float f8) {
        PointF pointF;
        i iVar = (i) c5534a;
        Path pathA = iVar.a();
        if (pathA == null) {
            return (PointF) c5534a.startValue;
        }
        C5536c c5536c = this.f5243e;
        if (c5536c != null && (pointF = (PointF) c5536c.getValueInternal(iVar.startFrame, iVar.endFrame.floatValue(), (PointF) iVar.startValue, (PointF) iVar.endValue, d(), f8, getProgress())) != null) {
            return pointF;
        }
        if (this.f5271l != iVar) {
            this.f5270k.setPath(pathA, false);
            this.f5271l = iVar;
        }
        PathMeasure pathMeasure = this.f5270k;
        pathMeasure.getPosTan(f8 * pathMeasure.getLength(), this.f5269j, null);
        PointF pointF2 = this.f5268i;
        float[] fArr = this.f5269j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f5268i;
    }
}
