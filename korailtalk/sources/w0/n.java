package W0;

import W0.a;
import android.graphics.PointF;
import g1.C5534a;
import g1.C5536c;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f5277i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f5278j;

    /* renamed from: k, reason: collision with root package name */
    private final a f5279k;

    /* renamed from: l, reason: collision with root package name */
    private final a f5280l;

    /* renamed from: m, reason: collision with root package name */
    protected C5536c f5281m;

    /* renamed from: n, reason: collision with root package name */
    protected C5536c f5282n;

    public n(a aVar, a aVar2) {
        super(Collections.emptyList());
        this.f5277i = new PointF();
        this.f5278j = new PointF();
        this.f5279k = aVar;
        this.f5280l = aVar2;
        setProgress(getProgress());
    }

    @Override // W0.a
    public void setProgress(float f8) {
        this.f5279k.setProgress(f8);
        this.f5280l.setProgress(f8);
        this.f5277i.set(((Float) this.f5279k.getValue()).floatValue(), ((Float) this.f5280l.getValue()).floatValue());
        for (int i8 = 0; i8 < this.f5239a.size(); i8++) {
            ((a.b) this.f5239a.get(i8)).onValueChanged();
        }
    }

    public void setXValueCallback(C5536c c5536c) {
        C5536c c5536c2 = this.f5281m;
        if (c5536c2 != null) {
            c5536c2.setAnimation(null);
        }
        this.f5281m = c5536c;
        if (c5536c != null) {
            c5536c.setAnimation(this);
        }
    }

    public void setYValueCallback(C5536c c5536c) {
        C5536c c5536c2 = this.f5282n;
        if (c5536c2 != null) {
            c5536c2.setAnimation(null);
        }
        this.f5282n = c5536c;
        if (c5536c != null) {
            c5536c.setAnimation(this);
        }
    }

    @Override // W0.a
    public PointF getValue() {
        return getValue((C5534a) null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W0.a
    public PointF getValue(C5534a c5534a, float f8) {
        Float f9;
        C5534a c5534aA;
        C5534a c5534aA2;
        Float f10 = null;
        if (this.f5281m == null || (c5534aA2 = this.f5279k.a()) == null) {
            f9 = null;
        } else {
            float fC = this.f5279k.c();
            Float f11 = c5534aA2.endFrame;
            C5536c c5536c = this.f5281m;
            float f12 = c5534aA2.startFrame;
            f9 = (Float) c5536c.getValueInternal(f12, f11 == null ? f12 : f11.floatValue(), (Float) c5534aA2.startValue, (Float) c5534aA2.endValue, f8, f8, fC);
        }
        if (this.f5282n != null && (c5534aA = this.f5280l.a()) != null) {
            float fC2 = this.f5280l.c();
            Float f13 = c5534aA.endFrame;
            C5536c c5536c2 = this.f5282n;
            float f14 = c5534aA.startFrame;
            f10 = (Float) c5536c2.getValueInternal(f14, f13 == null ? f14 : f13.floatValue(), (Float) c5534aA.startValue, (Float) c5534aA.endValue, f8, f8, fC2);
        }
        if (f9 == null) {
            this.f5278j.set(this.f5277i.x, 0.0f);
        } else {
            this.f5278j.set(f9.floatValue(), 0.0f);
        }
        if (f10 == null) {
            PointF pointF = this.f5278j;
            pointF.set(pointF.x, this.f5277i.y);
        } else {
            PointF pointF2 = this.f5278j;
            pointF2.set(pointF2.x, f10.floatValue());
        }
        return this.f5278j;
    }
}
