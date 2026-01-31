package com.google.android.material.bottomappbar;

import J2.k;
import J2.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import c0.AbstractC1087a;
import c3.AbstractC1090a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f24352n0 = k.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: P, reason: collision with root package name */
    private final int f24353P;

    /* renamed from: Q, reason: collision with root package name */
    private final a3.g f24354Q;

    /* renamed from: R, reason: collision with root package name */
    private Animator f24355R;

    /* renamed from: S, reason: collision with root package name */
    private Animator f24356S;

    /* renamed from: T, reason: collision with root package name */
    private int f24357T;

    /* renamed from: U, reason: collision with root package name */
    private int f24358U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f24359V;

    /* renamed from: W, reason: collision with root package name */
    private final boolean f24360W;

    /* renamed from: a0, reason: collision with root package name */
    private final boolean f24361a0;

    /* renamed from: b0, reason: collision with root package name */
    private final boolean f24362b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f24363c0;

    /* renamed from: d0, reason: collision with root package name */
    private ArrayList f24364d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f24365e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f24366f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f24367g0;

    /* renamed from: h0, reason: collision with root package name */
    private Behavior f24368h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f24369i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f24370j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f24371k0;

    /* renamed from: l0, reason: collision with root package name */
    AnimatorListenerAdapter f24372l0;

    /* renamed from: m0, reason: collision with root package name */
    K2.k f24373m0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f24374e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f24375f;

        /* renamed from: g, reason: collision with root package name */
        private int f24376g;

        /* renamed from: h, reason: collision with root package name */
        private final View.OnLayoutChangeListener f24377h;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f24375f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.getMeasuredContentRect(Behavior.this.f24374e);
                int iHeight = Behavior.this.f24374e.height();
                bottomAppBar.x0(iHeight);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f24376g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(J2.d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (o.isLayoutRtl(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f24353P;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f24353P;
                    }
                }
            }
        }

        public Behavior() {
            this.f24377h = new a();
            this.f24374e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i8) {
            this.f24375f = new WeakReference(bottomAppBar);
            View viewP0 = bottomAppBar.p0();
            if (viewP0 != null && !AbstractC0985p0.isLaidOut(viewP0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewP0.getLayoutParams();
                fVar.anchorGravity = 49;
                this.f24376g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (viewP0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewP0;
                    floatingActionButton.addOnLayoutChangeListener(this.f24377h);
                    bottomAppBar.h0(floatingActionButton);
                }
                bottomAppBar.w0();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i8);
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i8);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i8, int i9) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) bottomAppBar, view, view2, i8, i9);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24377h = new a();
            this.f24374e = new Rect();
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f24366f0) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.t0(bottomAppBar.f24357T, BottomAppBar.this.f24367g0);
        }
    }

    class b implements K2.k {
        b() {
        }

        @Override // K2.k
        public void onScaleChanged(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f24354Q.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // K2.k
        public void onTranslationChanged(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().h(translationX);
                BottomAppBar.this.f24354Q.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().b() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().e(fMax);
                BottomAppBar.this.f24354Q.invalidateSelf();
            }
            BottomAppBar.this.f24354Q.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    class c implements o.e {
        c() {
        }

        @Override // com.google.android.material.internal.o.e
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1, o.f fVar) {
            boolean z8;
            if (BottomAppBar.this.f24360W) {
                BottomAppBar.this.f24369i0 = c0950d1.getSystemWindowInsetBottom();
            }
            boolean z9 = false;
            if (BottomAppBar.this.f24361a0) {
                z8 = BottomAppBar.this.f24371k0 != c0950d1.getSystemWindowInsetLeft();
                BottomAppBar.this.f24371k0 = c0950d1.getSystemWindowInsetLeft();
            } else {
                z8 = false;
            }
            if (BottomAppBar.this.f24362b0) {
                boolean z10 = BottomAppBar.this.f24370j0 != c0950d1.getSystemWindowInsetRight();
                BottomAppBar.this.f24370j0 = c0950d1.getSystemWindowInsetRight();
                z9 = z10;
            }
            if (z8 || z9) {
                BottomAppBar.this.i0();
                BottomAppBar.this.w0();
                BottomAppBar.this.v0();
            }
            return c0950d1;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m0();
            BottomAppBar.this.f24355R = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n0();
        }
    }

    class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f24383a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void onShown(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m0();
            }
        }

        e(int i8) {
            this.f24383a = i8;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void onHidden(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.r0(this.f24383a));
            floatingActionButton.show(new a());
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m0();
            BottomAppBar.this.f24366f0 = false;
            BottomAppBar.this.f24356S = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n0();
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f24387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24389c;
        public boolean cancelled;

        g(ActionMenuView actionMenuView, int i8, boolean z8) {
            this.f24387a = actionMenuView;
            this.f24388b = i8;
            this.f24389c = z8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.cancelled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.cancelled) {
                return;
            }
            boolean z8 = BottomAppBar.this.f24365e0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.replaceMenu(bottomAppBar.f24365e0);
            BottomAppBar.this.z0(this.f24387a, this.f24388b, this.f24389c, z8);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f24391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24392b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24393c;

        h(ActionMenuView actionMenuView, int i8, boolean z8) {
            this.f24391a = actionMenuView;
            this.f24392b = i8;
            this.f24393c = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24391a.setTranslationX(BottomAppBar.this.q0(r0, this.f24392b, this.f24393c));
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f24372l0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonO0 = BottomAppBar.this.o0();
            if (floatingActionButtonO0 != null) {
                floatingActionButtonO0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    static class j extends AbstractC1087a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f24396b;

        /* renamed from: c, reason: collision with root package name */
        boolean f24397c;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public j[] newArray(int i8) {
                return new j[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public j createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f24396b);
            parcel.writeInt(this.f24397c ? 1 : 0);
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24396b = parcel.readInt();
            this.f24397c = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    private ActionMenuView getActionMenuView() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f24369i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return r0(this.f24357T);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f24371k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f24370j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.f24354Q.getShapeAppearanceModel().getTopEdge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.f24372l0);
        floatingActionButton.addOnShowAnimationListener(new i());
        floatingActionButton.addTransformationCallback(this.f24373m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        Animator animator = this.f24356S;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f24355R;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void k0(int i8, List list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(o0(), "translationX", r0(i8));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    private void l0(int i8, boolean z8, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - q0(actionMenuView, i8, z8)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(objectAnimatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat2.addListener(new g(actionMenuView, i8, z8));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        ArrayList arrayList;
        int i8 = this.f24363c0 - 1;
        this.f24363c0 = i8;
        if (i8 != 0 || (arrayList = this.f24364d0) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        ArrayList arrayList;
        int i8 = this.f24363c0;
        this.f24363c0 = i8 + 1;
        if (i8 != 0 || (arrayList = this.f24364d0) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton o0() {
        View viewP0 = p0();
        if (viewP0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewP0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View p0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float r0(int i8) {
        boolean zIsLayoutRtl = o.isLayoutRtl(this);
        if (i8 == 1) {
            return ((getMeasuredWidth() / 2) - (this.f24353P + (zIsLayoutRtl ? this.f24371k0 : this.f24370j0))) * (zIsLayoutRtl ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean s0() {
        FloatingActionButton floatingActionButtonO0 = o0();
        return floatingActionButtonO0 != null && floatingActionButtonO0.isOrWillBeShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(int i8, boolean z8) {
        if (!AbstractC0985p0.isLaidOut(this)) {
            this.f24366f0 = false;
            replaceMenu(this.f24365e0);
            return;
        }
        Animator animator = this.f24356S;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!s0()) {
            i8 = 0;
            z8 = false;
        }
        l0(i8, z8, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f24356S = animatorSet;
        animatorSet.addListener(new f());
        this.f24356S.start();
    }

    private void u0(int i8) {
        if (this.f24357T == i8 || !AbstractC0985p0.isLaidOut(this)) {
            return;
        }
        Animator animator = this.f24355R;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f24358U == 1) {
            k0(i8, arrayList);
        } else {
            j0(i8, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f24355R = animatorSet;
        animatorSet.addListener(new d());
        this.f24355R.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f24356S != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (s0()) {
            y0(actionMenuView, this.f24357T, this.f24367g0);
        } else {
            y0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        getTopEdgeTreatment().h(getFabTranslationX());
        View viewP0 = p0();
        this.f24354Q.setInterpolation((this.f24367g0 && s0()) ? 1.0f : 0.0f);
        if (viewP0 != null) {
            viewP0.setTranslationY(getFabTranslationY());
            viewP0.setTranslationX(getFabTranslationX());
        }
    }

    private void y0(ActionMenuView actionMenuView, int i8, boolean z8) {
        z0(actionMenuView, i8, z8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(ActionMenuView actionMenuView, int i8, boolean z8, boolean z9) {
        h hVar = new h(actionMenuView, i8, z8);
        if (z9) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f24354Q.getTintList();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().b();
    }

    public int getFabAlignmentMode() {
        return this.f24357T;
    }

    public int getFabAnimationMode() {
        return this.f24358U;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().d();
    }

    public boolean getHideOnScroll() {
        return this.f24359V;
    }

    protected void j0(int i8, List list) {
        FloatingActionButton floatingActionButtonO0 = o0();
        if (floatingActionButtonO0 == null || floatingActionButtonO0.isOrWillBeHidden()) {
            return;
        }
        n0();
        floatingActionButtonO0.hide(new e(i8));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3.h.setParentAbsoluteElevation(this, this.f24354Q);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        if (z8) {
            i0();
            w0();
        }
        v0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f24357T = jVar.f24396b;
        this.f24367g0 = jVar.f24397c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f24396b = this.f24357T;
        jVar.f24397c = this.f24367g0;
        return jVar;
    }

    public void performHide() {
        getBehavior().slideDown(this);
    }

    public void performShow() {
        getBehavior().slideUp(this);
    }

    protected int q0(ActionMenuView actionMenuView, int i8, boolean z8) {
        if (i8 != 1 || !z8) {
            return 0;
        }
        boolean zIsLayoutRtl = o.isLayoutRtl(this);
        int measuredWidth = zIsLayoutRtl ? getMeasuredWidth() : 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).gravity & A.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = zIsLayoutRtl ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zIsLayoutRtl ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zIsLayoutRtl ? this.f24370j0 : -this.f24371k0));
    }

    public void replaceMenu(int i8) {
        if (i8 != 0) {
            this.f24365e0 = 0;
            getMenu().clear();
            inflateMenu(i8);
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.setTintList(this.f24354Q, colorStateList);
    }

    public void setCradleVerticalOffset(float f8) {
        if (f8 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().e(f8);
            this.f24354Q.invalidateSelf();
            w0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        this.f24354Q.setElevation(f8);
        getBehavior().setAdditionalHiddenOffsetY(this, this.f24354Q.getShadowRadius() - this.f24354Q.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int i8) {
        setFabAlignmentModeAndReplaceMenu(i8, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i8, int i9) {
        this.f24365e0 = i9;
        this.f24366f0 = true;
        t0(i8, this.f24367g0);
        u0(i8);
        this.f24357T = i8;
    }

    public void setFabAnimationMode(int i8) {
        this.f24358U = i8;
    }

    public void setFabCradleMargin(float f8) {
        if (f8 != getFabCradleMargin()) {
            getTopEdgeTreatment().f(f8);
            this.f24354Q.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f8) {
        if (f8 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().g(f8);
            this.f24354Q.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z8) {
        this.f24359V = z8;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    boolean x0(int i8) {
        float f8 = i8;
        if (f8 == getTopEdgeTreatment().getFabDiameter()) {
            return false;
        }
        getTopEdgeTreatment().setFabDiameter(f8);
        this.f24354Q.invalidateSelf();
        return true;
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f24368h0 == null) {
            this.f24368h0 = new Behavior();
        }
        return this.f24368h0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24352n0;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        a3.g gVar = new a3.g();
        this.f24354Q = gVar;
        this.f24363c0 = 0;
        this.f24365e0 = 0;
        this.f24366f0 = false;
        this.f24367g0 = true;
        this.f24372l0 = new a();
        this.f24373m0 = new b();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.BottomAppBar, i8, i9, new int[0]);
        ColorStateList colorStateList = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, l.BottomAppBar_backgroundTint);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f24357T = typedArrayObtainStyledAttributes.getInt(l.BottomAppBar_fabAlignmentMode, 0);
        this.f24358U = typedArrayObtainStyledAttributes.getInt(l.BottomAppBar_fabAnimationMode, 0);
        this.f24359V = typedArrayObtainStyledAttributes.getBoolean(l.BottomAppBar_hideOnScroll, false);
        this.f24360W = typedArrayObtainStyledAttributes.getBoolean(l.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f24361a0 = typedArrayObtainStyledAttributes.getBoolean(l.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f24362b0 = typedArrayObtainStyledAttributes.getBoolean(l.BottomAppBar_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f24353P = getResources().getDimensionPixelOffset(J2.d.mtrl_bottomappbar_fabOffsetEndMode);
        gVar.setShapeAppearanceModel(a3.k.builder().setTopEdge(new com.google.android.material.bottomappbar.a(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        gVar.setShadowCompatibilityMode(2);
        gVar.setPaintStyle(Paint.Style.FILL);
        gVar.initializeElevationOverlay(context2);
        setElevation(dimensionPixelSize);
        androidx.core.graphics.drawable.a.setTintList(gVar, colorStateList);
        AbstractC0985p0.setBackground(this, gVar);
        o.doOnApplyWindowInsets(this, attributeSet, i8, i9, new c());
    }
}
