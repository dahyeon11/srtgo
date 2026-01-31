package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private Animator f24830a;

    a() {
    }

    public void cancelCurrent() {
        Animator animator = this.f24830a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.f24830a = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.f24830a = animator;
    }
}
