package com.google.android.material.transformation;

import K2.b;
import K2.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public static final long COLLAPSE_DELAY = 0;
    public static final long COLLAPSE_DURATION = 150;
    public static final long EXPAND_DELAY = 75;
    public static final long EXPAND_DURATION = 150;

    /* renamed from: c, reason: collision with root package name */
    private final i f25467c;

    /* renamed from: d, reason: collision with root package name */
    private final i f25468d;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25469a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f25470b;

        a(boolean z8, View view) {
            this.f25469a = z8;
            this.f25470b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25469a) {
                return;
            }
            this.f25470b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f25469a) {
                this.f25470b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f25467c = new i(75L, 150L);
        this.f25468d = new i(0L, 150L);
    }

    private void g(View view, boolean z8, boolean z9, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        i iVar = z8 ? this.f25467c : this.f25468d;
        if (z8) {
            if (!z9) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        iVar.apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet f(View view, View view2, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        g(view2, z8, z9, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new a(z8, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25467c = new i(75L, 150L);
        this.f25468d = new i(0L, 150L);
    }
}
