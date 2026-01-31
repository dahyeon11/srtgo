package g1;

import T0.h;
import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5534a {

    /* renamed from: a, reason: collision with root package name */
    private final h f31258a;

    /* renamed from: b, reason: collision with root package name */
    private float f31259b;

    /* renamed from: c, reason: collision with root package name */
    private float f31260c;

    /* renamed from: d, reason: collision with root package name */
    private int f31261d;

    /* renamed from: e, reason: collision with root package name */
    private int f31262e;
    public Float endFrame;
    public Object endValue;

    /* renamed from: f, reason: collision with root package name */
    private float f31263f;

    /* renamed from: g, reason: collision with root package name */
    private float f31264g;
    public final Interpolator interpolator;
    public PointF pathCp1;
    public PointF pathCp2;
    public final float startFrame;
    public final Object startValue;
    public final Interpolator xInterpolator;
    public final Interpolator yInterpolator;

    public C5534a(h hVar, Object obj, Object obj2, Interpolator interpolator, float f8, Float f9) {
        this.f31259b = -3987645.8f;
        this.f31260c = -3987645.8f;
        this.f31261d = 784923401;
        this.f31262e = 784923401;
        this.f31263f = Float.MIN_VALUE;
        this.f31264g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f31258a = hVar;
        this.startValue = obj;
        this.endValue = obj2;
        this.interpolator = interpolator;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = f8;
        this.endFrame = f9;
    }

    public boolean containsProgress(float f8) {
        return f8 >= getStartProgress() && f8 < getEndProgress();
    }

    public float getEndProgress() {
        if (this.f31258a == null) {
            return 1.0f;
        }
        if (this.f31264g == Float.MIN_VALUE) {
            if (this.endFrame == null) {
                this.f31264g = 1.0f;
            } else {
                this.f31264g = getStartProgress() + ((this.endFrame.floatValue() - this.startFrame) / this.f31258a.getDurationFrames());
            }
        }
        return this.f31264g;
    }

    public float getEndValueFloat() {
        if (this.f31260c == -3987645.8f) {
            this.f31260c = ((Float) this.endValue).floatValue();
        }
        return this.f31260c;
    }

    public int getEndValueInt() {
        if (this.f31262e == 784923401) {
            this.f31262e = ((Integer) this.endValue).intValue();
        }
        return this.f31262e;
    }

    public float getStartProgress() {
        h hVar = this.f31258a;
        if (hVar == null) {
            return 0.0f;
        }
        if (this.f31263f == Float.MIN_VALUE) {
            this.f31263f = (this.startFrame - hVar.getStartFrame()) / this.f31258a.getDurationFrames();
        }
        return this.f31263f;
    }

    public float getStartValueFloat() {
        if (this.f31259b == -3987645.8f) {
            this.f31259b = ((Float) this.startValue).floatValue();
        }
        return this.f31259b;
    }

    public int getStartValueInt() {
        if (this.f31261d == 784923401) {
            this.f31261d = ((Integer) this.startValue).intValue();
        }
        return this.f31261d;
    }

    public boolean isStatic() {
        return this.interpolator == null && this.xInterpolator == null && this.yInterpolator == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.startValue + ", endValue=" + this.endValue + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", interpolator=" + this.interpolator + '}';
    }

    public C5534a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f8, Float f9) {
        this.f31259b = -3987645.8f;
        this.f31260c = -3987645.8f;
        this.f31261d = 784923401;
        this.f31262e = 784923401;
        this.f31263f = Float.MIN_VALUE;
        this.f31264g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f31258a = hVar;
        this.startValue = obj;
        this.endValue = obj2;
        this.interpolator = null;
        this.xInterpolator = interpolator;
        this.yInterpolator = interpolator2;
        this.startFrame = f8;
        this.endFrame = f9;
    }

    protected C5534a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f8, Float f9) {
        this.f31259b = -3987645.8f;
        this.f31260c = -3987645.8f;
        this.f31261d = 784923401;
        this.f31262e = 784923401;
        this.f31263f = Float.MIN_VALUE;
        this.f31264g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f31258a = hVar;
        this.startValue = obj;
        this.endValue = obj2;
        this.interpolator = interpolator;
        this.xInterpolator = interpolator2;
        this.yInterpolator = interpolator3;
        this.startFrame = f8;
        this.endFrame = f9;
    }

    public C5534a(Object obj) {
        this.f31259b = -3987645.8f;
        this.f31260c = -3987645.8f;
        this.f31261d = 784923401;
        this.f31262e = 784923401;
        this.f31263f = Float.MIN_VALUE;
        this.f31264g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f31258a = null;
        this.startValue = obj;
        this.endValue = obj;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = Float.valueOf(Float.MAX_VALUE);
    }
}
