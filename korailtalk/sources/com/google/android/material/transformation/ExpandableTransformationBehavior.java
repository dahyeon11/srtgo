package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f25448b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f25448b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean d(View view, View view2, boolean z8, boolean z9) {
        AnimatorSet animatorSet = this.f25448b;
        boolean z10 = animatorSet != null;
        if (z10) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetF = f(view, view2, z8, z10);
        this.f25448b = animatorSetF;
        animatorSetF.addListener(new a());
        this.f25448b.start();
        if (!z9) {
            this.f25448b.end();
        }
        return true;
    }

    protected abstract AnimatorSet f(View view, View view2, boolean z8, boolean z9);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
