package com.google.android.material.floatingactionbutton;

import a3.o;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC0985p0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class d {

    /* renamed from: F */
    static final TimeInterpolator f24855F = K2.a.FAST_OUT_LINEAR_IN_INTERPOLATOR;

    /* renamed from: G */
    static final int[] f24856G = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: H */
    static final int[] f24857H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: I */
    static final int[] f24858I = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: J */
    static final int[] f24859J = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: K */
    static final int[] f24860K = {R.attr.state_enabled};

    /* renamed from: L */
    static final int[] f24861L = new int[0];

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f24866E;

    /* renamed from: a */
    a3.k f24867a;

    /* renamed from: b */
    a3.g f24868b;

    /* renamed from: c */
    Drawable f24869c;

    /* renamed from: d */
    com.google.android.material.floatingactionbutton.c f24870d;

    /* renamed from: e */
    Drawable f24871e;

    /* renamed from: f */
    boolean f24872f;

    /* renamed from: h */
    float f24874h;

    /* renamed from: i */
    float f24875i;

    /* renamed from: j */
    float f24876j;

    /* renamed from: k */
    int f24877k;

    /* renamed from: l */
    private final com.google.android.material.internal.g f24878l;

    /* renamed from: m */
    private K2.h f24879m;

    /* renamed from: n */
    private K2.h f24880n;

    /* renamed from: o */
    private Animator f24881o;

    /* renamed from: p */
    private K2.h f24882p;

    /* renamed from: q */
    private K2.h f24883q;

    /* renamed from: r */
    private float f24884r;

    /* renamed from: t */
    private int f24886t;

    /* renamed from: v */
    private ArrayList f24888v;

    /* renamed from: w */
    private ArrayList f24889w;

    /* renamed from: x */
    private ArrayList f24890x;

    /* renamed from: y */
    final FloatingActionButton f24891y;

    /* renamed from: z */
    final Z2.b f24892z;

    /* renamed from: g */
    boolean f24873g = true;

    /* renamed from: s */
    private float f24885s = 1.0f;

    /* renamed from: u */
    private int f24887u = 0;

    /* renamed from: A */
    private final Rect f24862A = new Rect();

    /* renamed from: B */
    private final RectF f24863B = new RectF();

    /* renamed from: C */
    private final RectF f24864C = new RectF();

    /* renamed from: D */
    private final Matrix f24865D = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f24893a;

        /* renamed from: b */
        final /* synthetic */ boolean f24894b;

        /* renamed from: c */
        final /* synthetic */ j f24895c;

        a(boolean z8, j jVar) {
            this.f24894b = z8;
            this.f24895c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24893a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f24887u = 0;
            d.this.f24881o = null;
            if (this.f24893a) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f24891y;
            boolean z8 = this.f24894b;
            floatingActionButton.internalSetVisibility(z8 ? 8 : 4, z8);
            j jVar = this.f24895c;
            if (jVar != null) {
                jVar.onHidden();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f24891y.internalSetVisibility(0, this.f24894b);
            d.this.f24887u = 1;
            d.this.f24881o = animator;
            this.f24893a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24897a;

        /* renamed from: b */
        final /* synthetic */ j f24898b;

        b(boolean z8, j jVar) {
            this.f24897a = z8;
            this.f24898b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f24887u = 0;
            d.this.f24881o = null;
            j jVar = this.f24898b;
            if (jVar != null) {
                jVar.onShown();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f24891y.internalSetVisibility(0, this.f24897a);
            d.this.f24887u = 2;
            d.this.f24881o = animator;
        }
    }

    class c extends K2.g {
        c() {
        }

        @Override // K2.g, android.animation.TypeEvaluator
        public Matrix evaluate(float f8, Matrix matrix, Matrix matrix2) {
            d.this.f24885s = f8;
            return super.evaluate(f8, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    class C0200d implements TypeEvaluator {

        /* renamed from: a */
        FloatEvaluator f24901a = new FloatEvaluator();

        C0200d() {
        }

        @Override // android.animation.TypeEvaluator
        public Float evaluate(float f8, Float f9, Float f10) {
            float fFloatValue = this.f24901a.evaluate(f8, (Number) f9, (Number) f10).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.E();
            return true;
        }
    }

    private class f extends l {
        f() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return 0.0f;
        }
    }

    private class g extends l {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.f24874h + dVar.f24875i;
        }
    }

    private class h extends l {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.f24874h + dVar.f24876j;
        }
    }

    interface i {
        void onScaleChanged();

        void onTranslationChanged();
    }

    interface j {
        void onHidden();

        void onShown();
    }

    private class k extends l {
        k() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return d.this.f24874h;
        }
    }

    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f24908a;

        /* renamed from: b */
        private float f24909b;

        /* renamed from: c */
        private float f24910c;

        private l() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f0((int) this.f24910c);
            this.f24908a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f24908a) {
                a3.g gVar = d.this.f24868b;
                this.f24909b = gVar == null ? 0.0f : gVar.getElevation();
                this.f24910c = a();
                this.f24908a = true;
            }
            d dVar = d.this;
            float f8 = this.f24909b;
            dVar.f0((int) (f8 + ((this.f24910c - f8) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(d dVar, a aVar) {
            this();
        }
    }

    d(FloatingActionButton floatingActionButton, Z2.b bVar) {
        this.f24891y = floatingActionButton;
        this.f24892z = bVar;
        com.google.android.material.internal.g gVar = new com.google.android.material.internal.g();
        this.f24878l = gVar;
        gVar.addState(f24856G, h(new h()));
        gVar.addState(f24857H, h(new g()));
        gVar.addState(f24858I, h(new g()));
        gVar.addState(f24859J, h(new g()));
        gVar.addState(f24860K, h(new k()));
        gVar.addState(f24861L, h(new f()));
        this.f24884r = floatingActionButton.getRotation();
    }

    private boolean Z() {
        return AbstractC0985p0.isLaidOut(this.f24891y) && !this.f24891y.isInEditMode();
    }

    private void f(float f8, Matrix matrix) {
        matrix.reset();
        if (this.f24891y.getDrawable() == null || this.f24886t == 0) {
            return;
        }
        RectF rectF = this.f24863B;
        RectF rectF2 = this.f24864C;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i8 = this.f24886t;
        rectF2.set(0.0f, 0.0f, i8, i8);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i9 = this.f24886t;
        matrix.postScale(f8, f8, i9 / 2.0f, i9 / 2.0f);
    }

    private AnimatorSet g(K2.h hVar, float f8, float f9, float f10) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24891y, (Property<FloatingActionButton, Float>) View.ALPHA, f8);
        hVar.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f24891y, (Property<FloatingActionButton, Float>) View.SCALE_X, f9);
        hVar.getTiming("scale").apply(objectAnimatorOfFloat2);
        g0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f24891y, (Property<FloatingActionButton, Float>) View.SCALE_Y, f9);
        hVar.getTiming("scale").apply(objectAnimatorOfFloat3);
        g0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        f(f10, this.f24865D);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f24891y, new K2.f(), new c(), new Matrix(this.f24865D));
        hVar.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        K2.b.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void g0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C0200d());
    }

    private ValueAnimator h(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f24855F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private K2.h j() {
        if (this.f24880n == null) {
            this.f24880n = K2.h.createFromResource(this.f24891y.getContext(), J2.a.design_fab_hide_motion_spec);
        }
        return (K2.h) Z.h.checkNotNull(this.f24880n);
    }

    private K2.h k() {
        if (this.f24879m == null) {
            this.f24879m = K2.h.createFromResource(this.f24891y.getContext(), J2.a.design_fab_show_motion_spec);
        }
        return (K2.h) Z.h.checkNotNull(this.f24879m);
    }

    private ViewTreeObserver.OnPreDrawListener o() {
        if (this.f24866E == null) {
            this.f24866E = new e();
        }
        return this.f24866E;
    }

    void A() {
        ViewTreeObserver viewTreeObserver = this.f24891y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f24866E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f24866E = null;
        }
    }

    abstract void B(int[] iArr);

    abstract void C(float f8, float f9, float f10);

    void D(Rect rect) {
        Z.h.checkNotNull(this.f24871e, "Didn't initialize content background");
        if (!Y()) {
            this.f24892z.setBackgroundDrawable(this.f24871e);
        } else {
            this.f24892z.setBackgroundDrawable(new InsetDrawable(this.f24871e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void E() {
        float rotation = this.f24891y.getRotation();
        if (this.f24884r != rotation) {
            this.f24884r = rotation;
            c0();
        }
    }

    void F() {
        ArrayList arrayList = this.f24890x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).onScaleChanged();
            }
        }
    }

    void G() {
        ArrayList arrayList = this.f24890x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).onTranslationChanged();
            }
        }
    }

    void H(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f24888v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void I(i iVar) {
        ArrayList arrayList = this.f24890x;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(iVar);
    }

    abstract boolean J();

    void K(ColorStateList colorStateList) {
        a3.g gVar = this.f24868b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f24870d;
        if (cVar != null) {
            cVar.c(colorStateList);
        }
    }

    void L(PorterDuff.Mode mode) {
        a3.g gVar = this.f24868b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void M(float f8) {
        if (this.f24874h != f8) {
            this.f24874h = f8;
            C(f8, this.f24875i, this.f24876j);
        }
    }

    void N(boolean z8) {
        this.f24872f = z8;
    }

    final void O(K2.h hVar) {
        this.f24883q = hVar;
    }

    final void P(float f8) {
        if (this.f24875i != f8) {
            this.f24875i = f8;
            C(this.f24874h, f8, this.f24876j);
        }
    }

    final void Q(float f8) {
        this.f24885s = f8;
        Matrix matrix = this.f24865D;
        f(f8, matrix);
        this.f24891y.setImageMatrix(matrix);
    }

    final void R(int i8) {
        if (this.f24886t != i8) {
            this.f24886t = i8;
            d0();
        }
    }

    void S(int i8) {
        this.f24877k = i8;
    }

    final void T(float f8) {
        if (this.f24876j != f8) {
            this.f24876j = f8;
            C(this.f24874h, this.f24875i, f8);
        }
    }

    void U(ColorStateList colorStateList) {
        Drawable drawable = this.f24869c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.setTintList(drawable, Y2.b.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    void V(boolean z8) {
        this.f24873g = z8;
        e0();
    }

    final void W(a3.k kVar) {
        this.f24867a = kVar;
        a3.g gVar = this.f24868b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f24869c;
        if (obj instanceof o) {
            ((o) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f24870d;
        if (cVar != null) {
            cVar.setShapeAppearanceModel(kVar);
        }
    }

    final void X(K2.h hVar) {
        this.f24882p = hVar;
    }

    abstract boolean Y();

    final boolean a0() {
        return !this.f24872f || this.f24891y.getSizeDimension() >= this.f24877k;
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        if (this.f24889w == null) {
            this.f24889w = new ArrayList();
        }
        this.f24889w.add(animatorListener);
    }

    void b0(j jVar, boolean z8) {
        if (w()) {
            return;
        }
        Animator animator = this.f24881o;
        if (animator != null) {
            animator.cancel();
        }
        if (!Z()) {
            this.f24891y.internalSetVisibility(0, z8);
            this.f24891y.setAlpha(1.0f);
            this.f24891y.setScaleY(1.0f);
            this.f24891y.setScaleX(1.0f);
            Q(1.0f);
            if (jVar != null) {
                jVar.onShown();
                return;
            }
            return;
        }
        if (this.f24891y.getVisibility() != 0) {
            this.f24891y.setAlpha(0.0f);
            this.f24891y.setScaleY(0.0f);
            this.f24891y.setScaleX(0.0f);
            Q(0.0f);
        }
        K2.h hVarK = this.f24882p;
        if (hVarK == null) {
            hVarK = k();
        }
        AnimatorSet animatorSetG = g(hVarK, 1.0f, 1.0f, 1.0f);
        animatorSetG.addListener(new b(z8, jVar));
        ArrayList arrayList = this.f24888v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetG.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetG.start();
    }

    abstract void c0();

    void d(Animator.AnimatorListener animatorListener) {
        if (this.f24888v == null) {
            this.f24888v = new ArrayList();
        }
        this.f24888v.add(animatorListener);
    }

    final void d0() {
        Q(this.f24885s);
    }

    void e(i iVar) {
        if (this.f24890x == null) {
            this.f24890x = new ArrayList();
        }
        this.f24890x.add(iVar);
    }

    final void e0() {
        Rect rect = this.f24862A;
        p(rect);
        D(rect);
        this.f24892z.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    void f0(float f8) {
        a3.g gVar = this.f24868b;
        if (gVar != null) {
            gVar.setElevation(f8);
        }
    }

    abstract float getElevation();

    final Drawable i() {
        return this.f24871e;
    }

    boolean l() {
        return this.f24872f;
    }

    final K2.h m() {
        return this.f24883q;
    }

    float n() {
        return this.f24875i;
    }

    void p(Rect rect) {
        int sizeDimension = this.f24872f ? (this.f24877k - this.f24891y.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f24873g ? getElevation() + this.f24876j : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float q() {
        return this.f24876j;
    }

    final a3.k r() {
        return this.f24867a;
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f24889w;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    final K2.h s() {
        return this.f24882p;
    }

    void t(j jVar, boolean z8) {
        if (v()) {
            return;
        }
        Animator animator = this.f24881o;
        if (animator != null) {
            animator.cancel();
        }
        if (!Z()) {
            this.f24891y.internalSetVisibility(z8 ? 8 : 4, z8);
            if (jVar != null) {
                jVar.onHidden();
                return;
            }
            return;
        }
        K2.h hVarJ = this.f24883q;
        if (hVarJ == null) {
            hVarJ = j();
        }
        AnimatorSet animatorSetG = g(hVarJ, 0.0f, 0.0f, 0.0f);
        animatorSetG.addListener(new a(z8, jVar));
        ArrayList arrayList = this.f24889w;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetG.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetG.start();
    }

    abstract void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i8);

    boolean v() {
        return this.f24891y.getVisibility() == 0 ? this.f24887u == 1 : this.f24887u != 2;
    }

    boolean w() {
        return this.f24891y.getVisibility() != 0 ? this.f24887u == 2 : this.f24887u != 1;
    }

    abstract void x();

    void y() {
        a3.g gVar = this.f24868b;
        if (gVar != null) {
            a3.h.setParentAbsoluteElevation(this.f24891y, gVar);
        }
        if (J()) {
            this.f24891y.getViewTreeObserver().addOnPreDrawListener(o());
        }
    }

    abstract void z();
}
