package W0;

import g1.C5534a;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class d extends g {
    public d(List<C5534a> list) {
        super(list);
    }

    public float getFloatValue() {
        return h(a(), c());
    }

    float h(C5534a c5534a, float f8) {
        Float f9;
        if (c5534a.startValue == null || c5534a.endValue == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5536c c5536c = this.f5243e;
        return (c5536c == null || (f9 = (Float) c5536c.getValueInternal(c5534a.startFrame, c5534a.endFrame.floatValue(), (Float) c5534a.startValue, (Float) c5534a.endValue, f8, d(), getProgress())) == null) ? f1.i.lerp(c5534a.getStartValueFloat(), c5534a.getEndValueFloat(), f8) : f9.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W0.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Float getValue(C5534a c5534a, float f8) {
        return Float.valueOf(h(c5534a, f8));
    }
}
