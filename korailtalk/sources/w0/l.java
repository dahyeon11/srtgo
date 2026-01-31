package W0;

import g1.C5534a;
import g1.C5536c;
import g1.C5537d;
import java.util.List;

/* loaded from: classes.dex */
public class l extends g {

    /* renamed from: i, reason: collision with root package name */
    private final C5537d f5273i;

    public l(List<C5534a> list) {
        super(list);
        this.f5273i = new C5537d();
    }

    @Override // W0.a
    public C5537d getValue(C5534a c5534a, float f8) {
        Object obj;
        C5537d c5537d;
        Object obj2 = c5534a.startValue;
        if (obj2 == null || (obj = c5534a.endValue) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5537d c5537d2 = (C5537d) obj2;
        C5537d c5537d3 = (C5537d) obj;
        C5536c c5536c = this.f5243e;
        if (c5536c != null && (c5537d = (C5537d) c5536c.getValueInternal(c5534a.startFrame, c5534a.endFrame.floatValue(), c5537d2, c5537d3, f8, d(), getProgress())) != null) {
            return c5537d;
        }
        this.f5273i.set(f1.i.lerp(c5537d2.getScaleX(), c5537d3.getScaleX(), f8), f1.i.lerp(c5537d2.getScaleY(), c5537d3.getScaleY(), f8));
        return this.f5273i;
    }
}
