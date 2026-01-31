package f1;

import T0.AbstractC0786c;
import android.view.Choreographer;

/* loaded from: classes.dex */
public class g extends AbstractC5384c implements Choreographer.FrameCallback {

    /* renamed from: j, reason: collision with root package name */
    private T0.h f30515j;

    /* renamed from: c, reason: collision with root package name */
    private float f30508c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30509d = false;

    /* renamed from: e, reason: collision with root package name */
    private long f30510e = 0;

    /* renamed from: f, reason: collision with root package name */
    private float f30511f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private int f30512g = 0;

    /* renamed from: h, reason: collision with root package name */
    private float f30513h = -2.1474836E9f;

    /* renamed from: i, reason: collision with root package name */
    private float f30514i = 2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f30516k = false;

    private float f() {
        T0.h hVar = this.f30515j;
        if (hVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / hVar.getFrameRate()) / Math.abs(this.f30508c);
    }

    private boolean g() {
        return getSpeed() < 0.0f;
    }

    private void k() {
        if (this.f30515j == null) {
            return;
        }
        float f8 = this.f30511f;
        if (f8 < this.f30513h || f8 > this.f30514i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f30513h), Float.valueOf(this.f30514i), Float.valueOf(this.f30511f)));
        }
    }

    @Override // f1.AbstractC5384c
    void a() {
        super.a();
        b(g());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        i();
    }

    public void clearComposition() {
        this.f30515j = null;
        this.f30513h = -2.1474836E9f;
        this.f30514i = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        h();
        if (this.f30515j == null || !isRunning()) {
            return;
        }
        AbstractC0786c.beginSection("LottieValueAnimator#doFrame");
        float f8 = (this.f30510e != 0 ? j8 - r1 : 0L) / f();
        float f9 = this.f30511f;
        if (g()) {
            f8 = -f8;
        }
        float f10 = f9 + f8;
        this.f30511f = f10;
        boolean zContains = i.contains(f10, getMinFrame(), getMaxFrame());
        this.f30511f = i.clamp(this.f30511f, getMinFrame(), getMaxFrame());
        this.f30510e = j8;
        e();
        if (!zContains) {
            if (getRepeatCount() == -1 || this.f30512g < getRepeatCount()) {
                c();
                this.f30512g++;
                if (getRepeatMode() == 2) {
                    this.f30509d = !this.f30509d;
                    reverseAnimationSpeed();
                } else {
                    this.f30511f = g() ? getMaxFrame() : getMinFrame();
                }
                this.f30510e = j8;
            } else {
                this.f30511f = this.f30508c < 0.0f ? getMinFrame() : getMaxFrame();
                i();
                b(g());
            }
        }
        k();
        AbstractC0786c.endSection("LottieValueAnimator#doFrame");
    }

    public void endAnimation() {
        i();
        b(g());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.f30515j == null) {
            return 0.0f;
        }
        if (g()) {
            minFrame = getMaxFrame() - this.f30511f;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f30511f - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        T0.h hVar = this.f30515j;
        if (hVar == null) {
            return 0.0f;
        }
        return (this.f30511f - hVar.getStartFrame()) / (this.f30515j.getEndFrame() - this.f30515j.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        T0.h hVar = this.f30515j;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.getDuration();
    }

    public float getFrame() {
        return this.f30511f;
    }

    public float getMaxFrame() {
        T0.h hVar = this.f30515j;
        if (hVar == null) {
            return 0.0f;
        }
        float f8 = this.f30514i;
        return f8 == 2.1474836E9f ? hVar.getEndFrame() : f8;
    }

    public float getMinFrame() {
        T0.h hVar = this.f30515j;
        if (hVar == null) {
            return 0.0f;
        }
        float f8 = this.f30513h;
        return f8 == -2.1474836E9f ? hVar.getStartFrame() : f8;
    }

    public float getSpeed() {
        return this.f30508c;
    }

    protected void h() {
        if (isRunning()) {
            j(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void i() {
        j(true);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f30516k;
    }

    protected void j(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.f30516k = false;
        }
    }

    public void pauseAnimation() {
        i();
    }

    public void playAnimation() {
        this.f30516k = true;
        d(g());
        setFrame((int) (g() ? getMaxFrame() : getMinFrame()));
        this.f30510e = 0L;
        this.f30512g = 0;
        h();
    }

    public void resumeAnimation() {
        this.f30516k = true;
        h();
        this.f30510e = 0L;
        if (g() && getFrame() == getMinFrame()) {
            this.f30511f = getMaxFrame();
        } else {
            if (g() || getFrame() != getMaxFrame()) {
                return;
            }
            this.f30511f = getMinFrame();
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(T0.h hVar) {
        boolean z8 = this.f30515j == null;
        this.f30515j = hVar;
        if (z8) {
            setMinAndMaxFrames(Math.max(this.f30513h, hVar.getStartFrame()), Math.min(this.f30514i, hVar.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) hVar.getStartFrame(), (int) hVar.getEndFrame());
        }
        float f8 = this.f30511f;
        this.f30511f = 0.0f;
        setFrame((int) f8);
        e();
    }

    public void setFrame(float f8) {
        if (this.f30511f == f8) {
            return;
        }
        this.f30511f = i.clamp(f8, getMinFrame(), getMaxFrame());
        this.f30510e = 0L;
        e();
    }

    public void setMaxFrame(float f8) {
        setMinAndMaxFrames(this.f30513h, f8);
    }

    public void setMinAndMaxFrames(float f8, float f9) {
        if (f8 > f9) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f8), Float.valueOf(f9)));
        }
        T0.h hVar = this.f30515j;
        float startFrame = hVar == null ? -3.4028235E38f : hVar.getStartFrame();
        T0.h hVar2 = this.f30515j;
        float endFrame = hVar2 == null ? Float.MAX_VALUE : hVar2.getEndFrame();
        float fClamp = i.clamp(f8, startFrame, endFrame);
        float fClamp2 = i.clamp(f9, startFrame, endFrame);
        if (fClamp == this.f30513h && fClamp2 == this.f30514i) {
            return;
        }
        this.f30513h = fClamp;
        this.f30514i = fClamp2;
        setFrame((int) i.clamp(this.f30511f, fClamp, fClamp2));
    }

    public void setMinFrame(int i8) {
        setMinAndMaxFrames(i8, (int) this.f30514i);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i8) {
        super.setRepeatMode(i8);
        if (i8 == 2 || !this.f30509d) {
            return;
        }
        this.f30509d = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f8) {
        this.f30508c = f8;
    }
}
