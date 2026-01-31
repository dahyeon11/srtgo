package W0;

import T0.AbstractC0786c;
import android.view.animation.Interpolator;
import g1.C5534a;
import g1.C5536c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    private final d f5241c;

    /* renamed from: e, reason: collision with root package name */
    protected C5536c f5243e;

    /* renamed from: a, reason: collision with root package name */
    final List f5239a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f5240b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f5242d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private Object f5244f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f5245g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f5246h = -1.0f;

    public interface b {
        void onValueChanged();
    }

    private static final class c implements d {
        private c() {
        }

        @Override // W0.a.d
        public C5534a getCurrentKeyframe() {
            throw new IllegalStateException("not implemented");
        }

        @Override // W0.a.d
        public float getEndProgress() {
            return 1.0f;
        }

        @Override // W0.a.d
        public float getStartDelayProgress() {
            return 0.0f;
        }

        @Override // W0.a.d
        public boolean isCachedValueEnabled(float f8) {
            throw new IllegalStateException("not implemented");
        }

        @Override // W0.a.d
        public boolean isEmpty() {
            return true;
        }

        @Override // W0.a.d
        public boolean isValueChanged(float f8) {
            return false;
        }
    }

    private interface d {
        C5534a getCurrentKeyframe();

        float getEndProgress();

        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f8);

        boolean isEmpty();

        boolean isValueChanged(float f8);
    }

    private static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        private final List f5247a;

        /* renamed from: c, reason: collision with root package name */
        private C5534a f5249c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f5250d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private C5534a f5248b = a(0.0f);

        e(List list) {
            this.f5247a = list;
        }

        private C5534a a(float f8) {
            List list = this.f5247a;
            C5534a c5534a = (C5534a) list.get(list.size() - 1);
            if (f8 >= c5534a.getStartProgress()) {
                return c5534a;
            }
            for (int size = this.f5247a.size() - 2; size >= 1; size--) {
                C5534a c5534a2 = (C5534a) this.f5247a.get(size);
                if (this.f5248b != c5534a2 && c5534a2.containsProgress(f8)) {
                    return c5534a2;
                }
            }
            return (C5534a) this.f5247a.get(0);
        }

        @Override // W0.a.d
        public C5534a getCurrentKeyframe() {
            return this.f5248b;
        }

        @Override // W0.a.d
        public float getEndProgress() {
            return ((C5534a) this.f5247a.get(r0.size() - 1)).getEndProgress();
        }

        @Override // W0.a.d
        public float getStartDelayProgress() {
            return ((C5534a) this.f5247a.get(0)).getStartProgress();
        }

        @Override // W0.a.d
        public boolean isCachedValueEnabled(float f8) {
            C5534a c5534a = this.f5249c;
            C5534a c5534a2 = this.f5248b;
            if (c5534a == c5534a2 && this.f5250d == f8) {
                return true;
            }
            this.f5249c = c5534a2;
            this.f5250d = f8;
            return false;
        }

        @Override // W0.a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // W0.a.d
        public boolean isValueChanged(float f8) {
            if (this.f5248b.containsProgress(f8)) {
                return !this.f5248b.isStatic();
            }
            this.f5248b = a(f8);
            return true;
        }
    }

    private static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final C5534a f5251a;

        /* renamed from: b, reason: collision with root package name */
        private float f5252b = -1.0f;

        f(List list) {
            this.f5251a = (C5534a) list.get(0);
        }

        @Override // W0.a.d
        public C5534a getCurrentKeyframe() {
            return this.f5251a;
        }

        @Override // W0.a.d
        public float getEndProgress() {
            return this.f5251a.getEndProgress();
        }

        @Override // W0.a.d
        public float getStartDelayProgress() {
            return this.f5251a.getStartProgress();
        }

        @Override // W0.a.d
        public boolean isCachedValueEnabled(float f8) {
            if (this.f5252b == f8) {
                return true;
            }
            this.f5252b = f8;
            return false;
        }

        @Override // W0.a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // W0.a.d
        public boolean isValueChanged(float f8) {
            return !this.f5251a.isStatic();
        }
    }

    a(List list) {
        this.f5241c = g(list);
    }

    private float e() {
        if (this.f5245g == -1.0f) {
            this.f5245g = this.f5241c.getStartDelayProgress();
        }
        return this.f5245g;
    }

    private static d g(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    protected C5534a a() {
        AbstractC0786c.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        C5534a currentKeyframe = this.f5241c.getCurrentKeyframe();
        AbstractC0786c.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return currentKeyframe;
    }

    public void addUpdateListener(b bVar) {
        this.f5239a.add(bVar);
    }

    float b() {
        if (this.f5246h == -1.0f) {
            this.f5246h = this.f5241c.getEndProgress();
        }
        return this.f5246h;
    }

    protected float c() {
        C5534a c5534aA = a();
        if (c5534aA == null || c5534aA.isStatic()) {
            return 0.0f;
        }
        return c5534aA.interpolator.getInterpolation(d());
    }

    float d() {
        if (this.f5240b) {
            return 0.0f;
        }
        C5534a c5534aA = a();
        if (c5534aA.isStatic()) {
            return 0.0f;
        }
        return (this.f5242d - c5534aA.getStartProgress()) / (c5534aA.getEndProgress() - c5534aA.getStartProgress());
    }

    protected Object f(C5534a c5534a, float f8, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public float getProgress() {
        return this.f5242d;
    }

    public Object getValue() {
        float fD = d();
        if (this.f5243e == null && this.f5241c.isCachedValueEnabled(fD)) {
            return this.f5244f;
        }
        C5534a c5534aA = a();
        Interpolator interpolator = c5534aA.xInterpolator;
        Object value = (interpolator == null || c5534aA.yInterpolator == null) ? getValue(c5534aA, c()) : f(c5534aA, fD, interpolator.getInterpolation(fD), c5534aA.yInterpolator.getInterpolation(fD));
        this.f5244f = value;
        return value;
    }

    abstract Object getValue(C5534a c5534a, float f8);

    public void notifyListeners() {
        for (int i8 = 0; i8 < this.f5239a.size(); i8++) {
            ((b) this.f5239a.get(i8)).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.f5240b = true;
    }

    public void setProgress(float f8) {
        if (this.f5241c.isEmpty()) {
            return;
        }
        if (f8 < e()) {
            f8 = e();
        } else if (f8 > b()) {
            f8 = b();
        }
        if (f8 == this.f5242d) {
            return;
        }
        this.f5242d = f8;
        if (this.f5241c.isValueChanged(f8)) {
            notifyListeners();
        }
    }

    public void setValueCallback(C5536c c5536c) {
        C5536c c5536c2 = this.f5243e;
        if (c5536c2 != null) {
            c5536c2.setAnimation(null);
        }
        this.f5243e = c5536c;
        if (c5536c != null) {
            c5536c.setAnimation(this);
        }
    }
}
