package W0;

import g1.C5534a;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class b extends g {
    public b(List<C5534a> list) {
        super(list);
    }

    public int getIntValue(C5534a c5534a, float f8) {
        Integer num;
        if (c5534a.startValue == null || c5534a.endValue == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5536c c5536c = this.f5243e;
        return (c5536c == null || (num = (Integer) c5536c.getValueInternal(c5534a.startFrame, c5534a.endFrame.floatValue(), (Integer) c5534a.startValue, (Integer) c5534a.endValue, f8, d(), getProgress())) == null) ? f1.d.evaluate(f1.i.clamp(f8, 0.0f, 1.0f), ((Integer) c5534a.startValue).intValue(), ((Integer) c5534a.endValue).intValue()) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W0.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getValue(C5534a c5534a, float f8) {
        return Integer.valueOf(getIntValue(c5534a, f8));
    }

    public int getIntValue() {
        return getIntValue(a(), c());
    }
}
