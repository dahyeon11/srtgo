package W0;

import g1.C5534a;
import g1.C5535b;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class o extends g {

    class a extends C5536c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5535b f5283d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5536c f5284e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y0.b f5285f;

        a(C5535b c5535b, C5536c c5536c, Y0.b bVar) {
            this.f5283d = c5535b;
            this.f5284e = c5536c;
            this.f5285f = bVar;
        }

        @Override // g1.C5536c
        public Y0.b getValue(C5535b c5535b) {
            this.f5283d.set(c5535b.getStartFrame(), c5535b.getEndFrame(), ((Y0.b) c5535b.getStartValue()).text, ((Y0.b) c5535b.getEndValue()).text, c5535b.getLinearKeyframeProgress(), c5535b.getInterpolatedKeyframeProgress(), c5535b.getOverallProgress());
            String str = (String) this.f5284e.getValue(this.f5283d);
            Y0.b bVar = (Y0.b) (c5535b.getInterpolatedKeyframeProgress() == 1.0f ? c5535b.getEndValue() : c5535b.getStartValue());
            this.f5285f.set(str, bVar.fontName, bVar.size, bVar.justification, bVar.tracking, bVar.lineHeight, bVar.baselineShift, bVar.color, bVar.strokeColor, bVar.strokeWidth, bVar.strokeOverFill);
            return this.f5285f;
        }
    }

    public o(List<C5534a> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W0.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Y0.b getValue(C5534a c5534a, float f8) {
        Object obj;
        C5536c c5536c = this.f5243e;
        if (c5536c == null) {
            return (f8 != 1.0f || (obj = c5534a.endValue) == null) ? (Y0.b) c5534a.startValue : (Y0.b) obj;
        }
        float f9 = c5534a.startFrame;
        Float f10 = c5534a.endFrame;
        float fFloatValue = f10 == null ? Float.MAX_VALUE : f10.floatValue();
        Object obj2 = c5534a.startValue;
        Y0.b bVar = (Y0.b) obj2;
        Object obj3 = c5534a.endValue;
        return (Y0.b) c5536c.getValueInternal(f9, fFloatValue, bVar, obj3 == null ? (Y0.b) obj2 : (Y0.b) obj3, f8, c(), getProgress());
    }

    public void setStringValueCallback(C5536c c5536c) {
        super.setValueCallback(new a(new C5535b(), c5536c, new Y0.b()));
    }
}
