package O2;

import O2.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: O2.a$a, reason: collision with other inner class name */
    static class C0058a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f3399a;

        C0058a(d dVar) {
            this.f3399a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3399a.destroyCircularRevealCache();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3399a.buildCircularRevealCache();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator createCircularReveal(d dVar, float f8, float f9, float f10) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dVar, (Property<d, V>) d.c.CIRCULAR_REVEAL, (TypeEvaluator) d.b.CIRCULAR_REVEAL, (Object[]) new d.e[]{new d.e(f8, f9, f10)});
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f8, (int) f9, revealInfo.radius, f10);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener createCircularRevealListener(d dVar) {
        return new C0058a(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator createCircularReveal(d dVar, float f8, float f9, float f10, float f11) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dVar, (Property<d, V>) d.c.CIRCULAR_REVEAL, (TypeEvaluator) d.b.CIRCULAR_REVEAL, (Object[]) new d.e[]{new d.e(f8, f9, f10), new d.e(f8, f9, f11)});
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f8, (int) f9, f10, f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
