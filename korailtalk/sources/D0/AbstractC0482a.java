package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: D0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0482a {

    /* renamed from: D0.a$a, reason: collision with other inner class name */
    interface InterfaceC0014a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void b(Animator animator) {
        animator.pause();
    }

    static void c(Animator animator) {
        animator.resume();
    }
}
