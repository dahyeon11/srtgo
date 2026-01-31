package W0;

import android.graphics.PointF;
import g1.C5534a;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f5272i;

    public k(List<C5534a> list) {
        super(list);
        this.f5272i = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W0.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public PointF f(C5534a c5534a, float f8, float f9, float f10) {
        Object obj;
        PointF pointF;
        Object obj2 = c5534a.startValue;
        if (obj2 == null || (obj = c5534a.endValue) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        C5536c c5536c = this.f5243e;
        if (c5536c != null && (pointF = (PointF) c5536c.getValueInternal(c5534a.startFrame, c5534a.endFrame.floatValue(), pointF2, pointF3, f8, d(), getProgress())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f5272i;
        float f11 = pointF2.x;
        float f12 = f11 + (f9 * (pointF3.x - f11));
        float f13 = pointF2.y;
        pointF4.set(f12, f13 + (f10 * (pointF3.y - f13)));
        return this.f5272i;
    }

    @Override // W0.a
    public PointF getValue(C5534a c5534a, float f8) {
        return f(c5534a, f8, f8, f8);
    }
}
