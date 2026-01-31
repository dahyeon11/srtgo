package com.google.android.material.floatingactionbutton;

import K2.h;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* loaded from: classes2.dex */
interface f {
    void addAnimationListener(Animator.AnimatorListener animatorListener);

    AnimatorSet createAnimator();

    h getCurrentMotionSpec();

    int getDefaultMotionSpecResource();

    List<Animator.AnimatorListener> getListeners();

    h getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);

    void onChange(ExtendedFloatingActionButton.j jVar);

    void performNow();

    void removeAnimationListener(Animator.AnimatorListener animatorListener);

    void setMotionSpec(h hVar);

    boolean shouldCancel();
}
