package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001x0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f9283a;

    /* renamed from: androidx.core.view.x0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1003y0 f9284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9285b;

        a(InterfaceC1003y0 interfaceC1003y0, View view) {
            this.f9284a = interfaceC1003y0;
            this.f9285b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9284a.onAnimationCancel(this.f9285b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9284a.onAnimationEnd(this.f9285b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f9284a.onAnimationStart(this.f9285b);
        }
    }

    /* renamed from: androidx.core.view.x0$b */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.translationZ(f8);
        }

        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.translationZBy(f8);
        }

        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.z(f8);
        }

        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.zBy(f8);
        }
    }

    C1001x0(View view) {
        this.f9283a = new WeakReference(view);
    }

    private void c(View view, InterfaceC1003y0 interfaceC1003y0) {
        if (interfaceC1003y0 != null) {
            view.animate().setListener(new a(interfaceC1003y0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1001x0 alpha(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    public C1001x0 alphaBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().alphaBy(f8);
        }
        return this;
    }

    public void cancel() {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = (View) this.f9283a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator getInterpolator() {
        View view = (View) this.f9283a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = (View) this.f9283a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public C1001x0 rotation(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().rotation(f8);
        }
        return this;
    }

    public C1001x0 rotationBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().rotationBy(f8);
        }
        return this;
    }

    public C1001x0 rotationX(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().rotationX(f8);
        }
        return this;
    }

    public C1001x0 rotationXBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().rotationXBy(f8);
        }
        return this;
    }

    public C1001x0 rotationY(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().rotationY(f8);
        }
        return this;
    }

    public C1001x0 rotationYBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().rotationYBy(f8);
        }
        return this;
    }

    public C1001x0 scaleX(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().scaleX(f8);
        }
        return this;
    }

    public C1001x0 scaleXBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().scaleXBy(f8);
        }
        return this;
    }

    public C1001x0 scaleY(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().scaleY(f8);
        }
        return this;
    }

    public C1001x0 scaleYBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().scaleYBy(f8);
        }
        return this;
    }

    public C1001x0 setDuration(long j8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
        return this;
    }

    public C1001x0 setInterpolator(Interpolator interpolator) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1001x0 setListener(InterfaceC1003y0 interfaceC1003y0) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            c(view, interfaceC1003y0);
        }
        return this;
    }

    public C1001x0 setStartDelay(long j8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().setStartDelay(j8);
        }
        return this;
    }

    public C1001x0 setUpdateListener(final A0 a02) {
        final View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().setUpdateListener(a02 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.w0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a02.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }

    public void start() {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1001x0 translationX(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().translationX(f8);
        }
        return this;
    }

    public C1001x0 translationXBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().translationXBy(f8);
        }
        return this;
    }

    public C1001x0 translationY(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }

    public C1001x0 translationYBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().translationYBy(f8);
        }
        return this;
    }

    public C1001x0 translationZ(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            b.a(view.animate(), f8);
        }
        return this;
    }

    public C1001x0 translationZBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            b.b(view.animate(), f8);
        }
        return this;
    }

    public C1001x0 withEndAction(Runnable runnable) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public C1001x0 withLayer() {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public C1001x0 withStartAction(Runnable runnable) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public C1001x0 x(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().x(f8);
        }
        return this;
    }

    public C1001x0 xBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().xBy(f8);
        }
        return this;
    }

    public C1001x0 y(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().y(f8);
        }
        return this;
    }

    public C1001x0 yBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            view.animate().yBy(f8);
        }
        return this;
    }

    public C1001x0 z(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            b.c(view.animate(), f8);
        }
        return this;
    }

    public C1001x0 zBy(float f8) {
        View view = (View) this.f9283a.get();
        if (view != null) {
            b.d(view.animate(), f8);
        }
        return this;
    }
}
