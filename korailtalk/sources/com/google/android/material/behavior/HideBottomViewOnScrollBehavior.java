package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f24330a;

    /* renamed from: b, reason: collision with root package name */
    private int f24331b;

    /* renamed from: c, reason: collision with root package name */
    private int f24332c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f24333d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f24333d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f24330a = 0;
        this.f24331b = 2;
        this.f24332c = 0;
    }

    private void b(View view, int i8, long j8, TimeInterpolator timeInterpolator) {
        this.f24333d = view.animate().translationY(i8).setInterpolator(timeInterpolator).setDuration(j8).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        this.f24330a = v8.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v8.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v8, i8);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v8, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (i9 > 0) {
            slideDown(v8);
        } else if (i9 < 0) {
            slideUp(v8);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int i8, int i9) {
        return i8 == 2;
    }

    public void setAdditionalHiddenOffsetY(V v8, int i8) {
        this.f24332c = i8;
        if (this.f24331b == 1) {
            v8.setTranslationY(this.f24330a + i8);
        }
    }

    public void slideDown(V v8) {
        if (this.f24331b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f24333d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v8.clearAnimation();
        }
        this.f24331b = 1;
        b(v8, this.f24330a + this.f24332c, 175L, K2.a.FAST_OUT_LINEAR_IN_INTERPOLATOR);
    }

    public void slideUp(V v8) {
        if (this.f24331b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f24333d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v8.clearAnimation();
        }
        this.f24331b = 2;
        b(v8, 0, 225L, K2.a.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24330a = 0;
        this.f24331b = 2;
        this.f24332c = 0;
    }
}
