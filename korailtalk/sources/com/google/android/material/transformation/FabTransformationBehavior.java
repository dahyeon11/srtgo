package com.google.android.material.transformation;

import J2.f;
import K2.h;
import K2.i;
import K2.j;
import O2.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d3.C5321a;
import d3.C5322b;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f25450c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f25451d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f25452e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f25453f;

    /* renamed from: g, reason: collision with root package name */
    private float f25454g;

    /* renamed from: h, reason: collision with root package name */
    private float f25455h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f25457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f25458c;

        a(boolean z8, View view, View view2) {
            this.f25456a = z8;
            this.f25457b = view;
            this.f25458c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25456a) {
                return;
            }
            this.f25457b.setVisibility(4);
            this.f25458c.setAlpha(1.0f);
            this.f25458c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f25456a) {
                this.f25457b.setVisibility(0);
                this.f25458c.setAlpha(0.0f);
                this.f25458c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25460a;

        b(View view) {
            this.f25460a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25460a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O2.d f25462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f25463b;

        c(O2.d dVar, Drawable drawable) {
            this.f25462a = dVar;
            this.f25463b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25462a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25462a.setCircularRevealOverlayDrawable(this.f25463b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O2.d f25465a;

        d(O2.d dVar) {
            this.f25465a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f25465a.getRevealInfo();
            revealInfo.radius = Float.MAX_VALUE;
            this.f25465a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {
        public j positioning;
        public h timings;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f25450c = new Rect();
        this.f25451d = new RectF();
        this.f25452e = new RectF();
        this.f25453f = new int[2];
    }

    private ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private ViewGroup g(View view) {
        View viewFindViewById = view.findViewById(f.mtrl_child_content_container);
        return viewFindViewById != null ? B(viewFindViewById) : ((view instanceof C5322b) || (view instanceof C5321a)) ? B(((ViewGroup) view).getChildAt(0)) : B(view);
    }

    private void h(View view, e eVar, i iVar, i iVar2, float f8, float f9, float f10, float f11, RectF rectF) {
        float fO = o(eVar, iVar, f8, f10);
        float fO2 = o(eVar, iVar2, f9, f11);
        Rect rect = this.f25450c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f25451d;
        rectF2.set(rect);
        RectF rectF3 = this.f25452e;
        p(view, rectF3);
        rectF3.offset(fO, fO2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void i(View view, RectF rectF) {
        p(view, rectF);
        rectF.offset(this.f25454g, this.f25455h);
    }

    private Pair j(float f8, float f9, boolean z8, e eVar) {
        i timing;
        i timing2;
        if (f8 == 0.0f || f9 == 0.0f) {
            timing = eVar.timings.getTiming("translationXLinear");
            timing2 = eVar.timings.getTiming("translationYLinear");
        } else if ((!z8 || f9 >= 0.0f) && (z8 || f9 <= 0.0f)) {
            timing = eVar.timings.getTiming("translationXCurveDownwards");
            timing2 = eVar.timings.getTiming("translationYCurveDownwards");
        } else {
            timing = eVar.timings.getTiming("translationXCurveUpwards");
            timing2 = eVar.timings.getTiming("translationYCurveUpwards");
        }
        return new Pair(timing, timing2);
    }

    private float k(View view, View view2, j jVar) {
        RectF rectF = this.f25451d;
        RectF rectF2 = this.f25452e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(-m(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float l(View view, View view2, j jVar) {
        RectF rectF = this.f25451d;
        RectF rectF2 = this.f25452e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(0.0f, -n(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float m(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f8;
        RectF rectF = this.f25451d;
        RectF rectF2 = this.f25452e;
        i(view, rectF);
        p(view2, rectF2);
        int i8 = jVar.gravity & 7;
        if (i8 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i8 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i8 != 5) {
                f8 = 0.0f;
                return f8 + jVar.xAdjustment;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f8 = fCenterX - fCenterX2;
        return f8 + jVar.xAdjustment;
    }

    private float n(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f8;
        RectF rectF = this.f25451d;
        RectF rectF2 = this.f25452e;
        i(view, rectF);
        p(view2, rectF2);
        int i8 = jVar.gravity & 112;
        if (i8 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i8 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i8 != 80) {
                f8 = 0.0f;
                return f8 + jVar.yAdjustment;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f8 = fCenterY - fCenterY2;
        return f8 + jVar.yAdjustment;
    }

    private float o(e eVar, i iVar, float f8, float f9) {
        long delay = iVar.getDelay();
        long duration = iVar.getDuration();
        i timing = eVar.timings.getTiming("expansion");
        return K2.a.lerp(f8, f9, iVar.getInterpolator().getInterpolation((((timing.getDelay() + timing.getDuration()) + 17) - delay) / duration));
    }

    private void p(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f25453f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void q(View view, View view2, boolean z8, boolean z9, e eVar, List list, List list2) {
        ViewGroup viewGroupG;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof O2.d) && O2.c.STRATEGY == 0) || (viewGroupG = g(view2)) == null) {
                return;
            }
            if (z8) {
                if (!z9) {
                    K2.d.CHILDREN_ALPHA.set(viewGroupG, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupG, K2.d.CHILDREN_ALPHA, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupG, K2.d.CHILDREN_ALPHA, 0.0f);
            }
            eVar.timings.getTiming("contentFade").apply(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(View view, View view2, boolean z8, boolean z9, e eVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof O2.d) {
            O2.d dVar = (O2.d) view2;
            int iZ = z(view);
            int i8 = 16777215 & iZ;
            if (z8) {
                if (!z9) {
                    dVar.setCircularRevealScrimColor(iZ);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0059d.CIRCULAR_REVEAL_SCRIM_COLOR, i8);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0059d.CIRCULAR_REVEAL_SCRIM_COLOR, iZ);
            }
            objectAnimatorOfInt.setEvaluator(K2.c.getInstance());
            eVar.timings.getTiming("color").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void s(View view, View view2, boolean z8, e eVar, List list) {
        float fM = m(view, view2, eVar.positioning);
        float fN = n(view, view2, eVar.positioning);
        Pair pairJ = j(fM, fN, z8, eVar);
        i iVar = (i) pairJ.first;
        i iVar2 = (i) pairJ.second;
        Property property = View.TRANSLATION_X;
        if (!z8) {
            fM = this.f25454g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fM);
        Property property2 = View.TRANSLATION_Y;
        if (!z8) {
            fN = this.f25455h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fN);
        iVar.apply(objectAnimatorOfFloat);
        iVar2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void t(View view, View view2, boolean z8, boolean z9, e eVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = AbstractC0985p0.getElevation(view2) - AbstractC0985p0.getElevation(view);
        if (z8) {
            if (!z9) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        eVar.timings.getTiming("elevation").apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(View view, View view2, boolean z8, boolean z9, e eVar, float f8, float f9, List list, List list2) {
        Animator animatorCreateCircularReveal;
        if (view2 instanceof O2.d) {
            O2.d dVar = (O2.d) view2;
            float fK = k(view, view2, eVar.positioning);
            float fL = l(view, view2, eVar.positioning);
            ((FloatingActionButton) view).getContentRect(this.f25450c);
            float fWidth = this.f25450c.width() / 2.0f;
            i timing = eVar.timings.getTiming("expansion");
            if (z8) {
                if (!z9) {
                    dVar.setRevealInfo(new d.e(fK, fL, fWidth));
                }
                if (z9) {
                    fWidth = dVar.getRevealInfo().radius;
                }
                animatorCreateCircularReveal = O2.a.createCircularReveal(dVar, fK, fL, V2.a.distanceToFurthestCorner(fK, fL, 0.0f, 0.0f, f8, f9));
                animatorCreateCircularReveal.addListener(new d(dVar));
                x(view2, timing.getDelay(), (int) fK, (int) fL, fWidth, list);
            } else {
                float f10 = dVar.getRevealInfo().radius;
                Animator animatorCreateCircularReveal2 = O2.a.createCircularReveal(dVar, fK, fL, fWidth);
                int i8 = (int) fK;
                int i9 = (int) fL;
                x(view2, timing.getDelay(), i8, i9, f10, list);
                w(view2, timing.getDelay(), timing.getDuration(), eVar.timings.getTotalDuration(), i8, i9, fWidth, list);
                animatorCreateCircularReveal = animatorCreateCircularReveal2;
            }
            timing.apply(animatorCreateCircularReveal);
            list.add(animatorCreateCircularReveal);
            list2.add(O2.a.createCircularRevealListener(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(View view, View view2, boolean z8, boolean z9, e eVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof O2.d) && (view instanceof ImageView)) {
            O2.d dVar = (O2.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z8) {
                if (!z9) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, K2.e.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, K2.e.DRAWABLE_ALPHA_COMPAT, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.timings.getTiming("iconFade").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    private void w(View view, long j8, long j9, long j10, int i8, int i9, float f8, List list) {
        long j11 = j8 + j9;
        if (j11 < j10) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i8, i9, f8, f8);
            animatorCreateCircularReveal.setStartDelay(j11);
            animatorCreateCircularReveal.setDuration(j10 - j11);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void x(View view, long j8, int i8, int i9, float f8, List list) {
        if (j8 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i8, i9, f8, f8);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j8);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void y(View view, View view2, boolean z8, boolean z9, e eVar, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM = m(view, view2, eVar.positioning);
        float fN = n(view, view2, eVar.positioning);
        Pair pairJ = j(fM, fN, z8, eVar);
        i iVar = (i) pairJ.first;
        i iVar2 = (i) pairJ.second;
        if (z8) {
            if (!z9) {
                view2.setTranslationX(-fM);
                view2.setTranslationY(-fN);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            h(view2, eVar, iVar, iVar2, -fM, -fN, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fN);
        }
        iVar.apply(objectAnimatorOfFloat);
        iVar2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int z(View view) {
        ColorStateList backgroundTintList = AbstractC0985p0.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    protected abstract e A(Context context, boolean z8);

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet f(View view, View view2, boolean z8, boolean z9) {
        e eVarA = A(view2.getContext(), z8);
        if (z8) {
            this.f25454g = view.getTranslationX();
            this.f25455h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t(view, view2, z8, z9, eVarA, arrayList, arrayList2);
        RectF rectF = this.f25451d;
        y(view, view2, z8, z9, eVarA, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        s(view, view2, z8, eVarA, arrayList);
        v(view, view2, z8, z9, eVarA, arrayList, arrayList2);
        u(view, view2, z8, z9, eVarA, fWidth, fHeight, arrayList, arrayList2);
        r(view, view2, z8, z9, eVarA, arrayList, arrayList2);
        q(view, view2, z8, z9, eVarA, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        K2.b.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new a(z8, view2, view));
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i8));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        if (fVar.dodgeInsetEdges == 0) {
            fVar.dodgeInsetEdges = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25450c = new Rect();
        this.f25451d = new RectF();
        this.f25452e = new RectF();
        this.f25453f = new int[2];
    }
}
