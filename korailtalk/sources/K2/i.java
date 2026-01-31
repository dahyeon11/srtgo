package K2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f2871a;

    /* renamed from: b, reason: collision with root package name */
    private long f2872b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f2873c;

    /* renamed from: d, reason: collision with root package name */
    private int f2874d;

    /* renamed from: e, reason: collision with root package name */
    private int f2875e;

    public i(long j8, long j9) {
        this.f2873c = null;
        this.f2874d = 0;
        this.f2875e = 1;
        this.f2871a = j8;
        this.f2872b = j9;
    }

    static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.f2874d = valueAnimator.getRepeatCount();
        iVar.f2875e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.FAST_OUT_SLOW_IN_INTERPOLATOR : interpolator instanceof AccelerateInterpolator ? a.FAST_OUT_LINEAR_IN_INTERPOLATOR : interpolator instanceof DecelerateInterpolator ? a.LINEAR_OUT_SLOW_IN_INTERPOLATOR : interpolator;
    }

    public void apply(Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (getDelay() == iVar.getDelay() && getDuration() == iVar.getDuration() && getRepeatCount() == iVar.getRepeatCount() && getRepeatMode() == iVar.getRepeatMode()) {
            return getInterpolator().getClass().equals(iVar.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.f2871a;
    }

    public long getDuration() {
        return this.f2872b;
    }

    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f2873c;
        return timeInterpolator != null ? timeInterpolator : a.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.f2874d;
    }

    public int getRepeatMode() {
        return this.f2875e;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public i(long j8, long j9, TimeInterpolator timeInterpolator) {
        this.f2874d = 0;
        this.f2875e = 1;
        this.f2871a = j8;
        this.f2872b = j9;
        this.f2873c = timeInterpolator;
    }
}
