package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.C0950d1;
import androidx.core.view.W;
import androidx.core.view.accessibility.H;
import c3.AbstractC1090a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* renamed from: a */
    private final ViewGroup f25039a;

    /* renamed from: b */
    private final Context f25040b;

    /* renamed from: c */
    protected final w f25041c;

    /* renamed from: d */
    private final com.google.android.material.snackbar.a f25042d;

    /* renamed from: e */
    private int f25043e;

    /* renamed from: f */
    private boolean f25044f;

    /* renamed from: g */
    private View f25045g;

    /* renamed from: k */
    private Rect f25049k;

    /* renamed from: l */
    private int f25050l;

    /* renamed from: m */
    private int f25051m;

    /* renamed from: n */
    private int f25052n;

    /* renamed from: o */
    private int f25053o;

    /* renamed from: p */
    private int f25054p;

    /* renamed from: q */
    private List f25055q;

    /* renamed from: r */
    private Behavior f25056r;

    /* renamed from: s */
    private final AccessibilityManager f25057s;

    /* renamed from: v */
    private static final boolean f25036v = false;

    /* renamed from: w */
    private static final int[] f25037w = {J2.b.snackbarStyle};

    /* renamed from: x */
    private static final String f25038x = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: u */
    static final Handler f25035u = new Handler(Looper.getMainLooper(), new j());

    /* renamed from: h */
    private boolean f25046h = false;

    /* renamed from: i */
    private final ViewTreeObserver.OnGlobalLayoutListener f25047i = new k();

    /* renamed from: j */
    private final Runnable f25048j = new l();

    /* renamed from: t */
    c.b f25058t = new o();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final t f25059k = new t(this);

        public void g(BaseTransientBottomBar baseTransientBottomBar) {
            this.f25059k.setBaseTransientBottomBar(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return this.f25059k.canSwipeDismissView(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f25059k.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = BaseTransientBottomBar.this.f25041c;
            if (wVar == null) {
                return;
            }
            if (wVar.getParent() != null) {
                BaseTransientBottomBar.this.f25041c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f25041c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.N();
            } else {
                BaseTransientBottomBar.this.P();
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.H();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f25062a;

        c(int i8) {
            this.f25062a = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.G(this.f25062a);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f25041c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f25041c.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f25041c.setScaleY(fFloatValue);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.H();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f25042d.animateContentIn(70, 180);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f25067a;

        /* renamed from: b */
        final /* synthetic */ int f25068b;

        g(int i8) {
            this.f25068b = i8;
            this.f25067a = i8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f25036v) {
                AbstractC0985p0.offsetTopAndBottom(BaseTransientBottomBar.this.f25041c, iIntValue - this.f25067a);
            } else {
                BaseTransientBottomBar.this.f25041c.setTranslationY(iIntValue);
            }
            this.f25067a = iIntValue;
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f25070a;

        h(int i8) {
            this.f25070a = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.G(this.f25070a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f25042d.animateContentOut(0, 180);
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f25072a = 0;

        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f25036v) {
                AbstractC0985p0.offsetTopAndBottom(BaseTransientBottomBar.this.f25041c, iIntValue - this.f25072a);
            } else {
                BaseTransientBottomBar.this.f25041c.setTranslationY(iIntValue);
            }
            this.f25072a = iIntValue;
        }
    }

    static class j implements Handler.Callback {
        j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                ((BaseTransientBottomBar) message.obj).L();
                return true;
            }
            if (i8 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).E(message.arg1);
            return true;
        }
    }

    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f25046h) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.f25054p = baseTransientBottomBar.u();
                BaseTransientBottomBar.this.R();
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iZ;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f25041c == null || baseTransientBottomBar.f25040b == null || (iZ = (BaseTransientBottomBar.this.z() - BaseTransientBottomBar.this.C()) + ((int) BaseTransientBottomBar.this.f25041c.getTranslationY())) >= BaseTransientBottomBar.this.f25053o) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f25041c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f25038x, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f25053o - iZ;
            BaseTransientBottomBar.this.f25041c.requestLayout();
        }
    }

    class m implements W {
        m() {
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
            BaseTransientBottomBar.this.f25050l = c0950d1.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f25051m = c0950d1.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f25052n = c0950d1.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.R();
            return c0950d1;
        }
    }

    class n extends C0923a {
        n() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.addAction(1048576);
            h8.setDismissable(true);
        }

        @Override // androidx.core.view.C0923a
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            if (i8 != 1048576) {
                return super.performAccessibilityAction(view, i8, bundle);
            }
            BaseTransientBottomBar.this.dismiss();
            return true;
        }
    }

    class o implements c.b {
        o() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void dismiss(int i8) {
            Handler handler = BaseTransientBottomBar.f25035u;
            handler.sendMessage(handler.obtainMessage(1, i8, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void show() {
            Handler handler = BaseTransientBottomBar.f25035u;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class p implements u {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.G(3);
            }
        }

        p() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.u
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f25041c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.f25053o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.R();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.u
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.isShownOrQueued()) {
                BaseTransientBottomBar.f25035u.post(new a());
            }
        }
    }

    class q implements v {
        q() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11) {
            BaseTransientBottomBar.this.f25041c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.M();
        }
    }

    class r implements SwipeDismissBehavior.c {
        r() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void onDismiss(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.v(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void onDragStateChanged(int i8) {
            if (i8 == 0) {
                com.google.android.material.snackbar.c.b().restoreTimeoutIfPaused(BaseTransientBottomBar.this.f25058t);
            } else if (i8 == 1 || i8 == 2) {
                com.google.android.material.snackbar.c.b().pauseTimeout(BaseTransientBottomBar.this.f25058t);
            }
        }
    }

    public static abstract class s {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(Object obj, int i8) {
        }

        public void onShown(Object obj) {
        }
    }

    public static class t {

        /* renamed from: a */
        private c.b f25083a;

        public t(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior.setSwipeDirection(0);
        }

        public boolean canSwipeDismissView(View view) {
            return view instanceof w;
        }

        public void onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.b().pauseTimeout(this.f25083a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.b().restoreTimeoutIfPaused(this.f25083a);
            }
        }

        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f25083a = baseTransientBottomBar.f25058t;
        }
    }

    protected interface u {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface v {
        void onLayoutChange(View view, int i8, int i9, int i10, int i11);
    }

    protected static class w extends FrameLayout {

        /* renamed from: h */
        private static final View.OnTouchListener f25084h = new a();

        /* renamed from: a */
        private v f25085a;

        /* renamed from: b */
        private u f25086b;

        /* renamed from: c */
        private int f25087c;

        /* renamed from: d */
        private final float f25088d;

        /* renamed from: e */
        private final float f25089e;

        /* renamed from: f */
        private ColorStateList f25090f;

        /* renamed from: g */
        private PorterDuff.Mode f25091g;

        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected w(Context context) {
            this(context, null);
        }

        private Drawable a() throws Resources.NotFoundException {
            float dimension = getResources().getDimension(J2.d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(Q2.a.layer(this, J2.b.colorSurface, J2.b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f25090f == null) {
                return androidx.core.graphics.drawable.a.wrap(gradientDrawable);
            }
            Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(gradientDrawable);
            androidx.core.graphics.drawable.a.setTintList(drawableWrap, this.f25090f);
            return drawableWrap;
        }

        float getActionTextColorAlpha() {
            return this.f25089e;
        }

        int getAnimationMode() {
            return this.f25087c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f25088d;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            u uVar = this.f25086b;
            if (uVar != null) {
                uVar.onViewAttachedToWindow(this);
            }
            AbstractC0985p0.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            u uVar = this.f25086b;
            if (uVar != null) {
                uVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
            super.onLayout(z8, i8, i9, i10, i11);
            v vVar = this.f25085a;
            if (vVar != null) {
                vVar.onLayoutChange(this, i8, i9, i10, i11);
            }
        }

        void setAnimationMode(int i8) {
            this.f25087c = i8;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f25090f != null) {
                drawable = androidx.core.graphics.drawable.a.wrap(drawable.mutate());
                androidx.core.graphics.drawable.a.setTintList(drawable, this.f25090f);
                androidx.core.graphics.drawable.a.setTintMode(drawable, this.f25091g);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f25090f = colorStateList;
            if (getBackground() != null) {
                Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(getBackground().mutate());
                androidx.core.graphics.drawable.a.setTintList(drawableWrap, colorStateList);
                androidx.core.graphics.drawable.a.setTintMode(drawableWrap, this.f25091g);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f25091g = mode;
            if (getBackground() != null) {
                Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(getBackground().mutate());
                androidx.core.graphics.drawable.a.setTintMode(drawableWrap, mode);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        void setOnAttachStateChangeListener(u uVar) {
            this.f25086b = uVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f25084h);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(v vVar) {
            this.f25085a = vVar;
        }

        protected w(Context context, AttributeSet attributeSet) {
            super(AbstractC1090a.wrap(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, J2.l.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(J2.l.SnackbarLayout_elevation)) {
                AbstractC0985p0.setElevation(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.SnackbarLayout_elevation, 0));
            }
            this.f25087c = typedArrayObtainStyledAttributes.getInt(J2.l.SnackbarLayout_animationMode, 0);
            this.f25088d = typedArrayObtainStyledAttributes.getFloat(J2.l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, J2.l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(com.google.android.material.internal.o.parseTintMode(typedArrayObtainStyledAttributes.getInt(J2.l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f25089e = typedArrayObtainStyledAttributes.getFloat(J2.l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f25084h);
            setFocusable(true);
            if (getBackground() == null) {
                AbstractC0985p0.setBackground(this, a());
            }
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f25039a = viewGroup;
        this.f25042d = aVar;
        this.f25040b = context;
        com.google.android.material.internal.k.checkAppCompatTheme(context);
        w wVar = (w) LayoutInflater.from(context).inflate(A(), viewGroup, false);
        this.f25041c = wVar;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).a(wVar.getActionTextColorAlpha());
        }
        wVar.addView(view);
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f25049k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        AbstractC0985p0.setAccessibilityLiveRegion(wVar, 1);
        AbstractC0985p0.setImportantForAccessibility(wVar, 1);
        AbstractC0985p0.setFitsSystemWindows(wVar, true);
        AbstractC0985p0.setOnApplyWindowInsetsListener(wVar, new m());
        AbstractC0985p0.setAccessibilityDelegate(wVar, new n());
        this.f25057s = (AccessibilityManager) context.getSystemService("accessibility");
    }

    private int B() {
        int height = this.f25041c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f25041c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public int C() {
        int[] iArr = new int[2];
        this.f25041c.getLocationOnScreen(iArr);
        return iArr[1] + this.f25041c.getHeight();
    }

    private boolean F() {
        ViewGroup.LayoutParams layoutParams = this.f25041c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).getBehavior() instanceof SwipeDismissBehavior);
    }

    private void I(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehaviorX = this.f25056r;
        if (swipeDismissBehaviorX == null) {
            swipeDismissBehaviorX = x();
        }
        if (swipeDismissBehaviorX instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorX).g(this);
        }
        swipeDismissBehaviorX.setListener(new r());
        fVar.setBehavior(swipeDismissBehaviorX);
        if (this.f25045g == null) {
            fVar.insetEdge = 80;
        }
    }

    private boolean K() {
        return this.f25053o > 0 && !this.f25044f && F();
    }

    public void M() {
        if (J()) {
            s();
            return;
        }
        if (this.f25041c.getParent() != null) {
            this.f25041c.setVisibility(0);
        }
        H();
    }

    public void N() {
        ValueAnimator valueAnimatorW = w(0.0f, 1.0f);
        ValueAnimator valueAnimatorY = y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorW, valueAnimatorY);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    private void O(int i8) {
        ValueAnimator valueAnimatorW = w(1.0f, 0.0f);
        valueAnimatorW.setDuration(75L);
        valueAnimatorW.addListener(new c(i8));
        valueAnimatorW.start();
    }

    public void P() {
        int iB = B();
        if (f25036v) {
            AbstractC0985p0.offsetTopAndBottom(this.f25041c, iB);
        } else {
            this.f25041c.setTranslationY(iB);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iB, 0);
        valueAnimator.setInterpolator(K2.a.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(iB));
        valueAnimator.start();
    }

    private void Q(int i8) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, B());
        valueAnimator.setInterpolator(K2.a.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new h(i8));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    public void R() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f25041c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f25049k) == null) {
            Log.w(f25038x, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f25045g != null ? this.f25054p : this.f25050l);
        marginLayoutParams.leftMargin = rect.left + this.f25051m;
        marginLayoutParams.rightMargin = rect.right + this.f25052n;
        this.f25041c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !K()) {
            return;
        }
        this.f25041c.removeCallbacks(this.f25048j);
        this.f25041c.post(this.f25048j);
    }

    private void t(int i8) {
        if (this.f25041c.getAnimationMode() == 1) {
            O(i8);
        } else {
            Q(i8);
        }
    }

    public int u() {
        View view = this.f25045g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i8 = iArr[1];
        int[] iArr2 = new int[2];
        this.f25039a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f25039a.getHeight()) - i8;
    }

    private ValueAnimator w(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(K2.a.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator y(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(K2.a.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new e());
        return valueAnimatorOfFloat;
    }

    public int z() {
        WindowManager windowManager = (WindowManager) this.f25040b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    protected int A() {
        return D() ? J2.h.mtrl_layout_snackbar : J2.h.design_layout_snackbar;
    }

    protected boolean D() {
        TypedArray typedArrayObtainStyledAttributes = this.f25040b.obtainStyledAttributes(f25037w);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void E(int i8) {
        if (J() && this.f25041c.getVisibility() == 0) {
            t(i8);
        } else {
            G(i8);
        }
    }

    void G(int i8) {
        com.google.android.material.snackbar.c.b().onDismissed(this.f25058t);
        List list = this.f25055q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f25055q.get(size)).onDismissed(this, i8);
            }
        }
        ViewParent parent = this.f25041c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25041c);
        }
    }

    void H() {
        com.google.android.material.snackbar.c.b().onShown(this.f25058t);
        List list = this.f25055q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f25055q.get(size)).onShown(this);
            }
        }
    }

    boolean J() {
        AccessibilityManager accessibilityManager = this.f25057s;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    final void L() {
        this.f25041c.setOnAttachStateChangeListener(new p());
        if (this.f25041c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f25041c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                I((CoordinatorLayout.f) layoutParams);
            }
            this.f25054p = u();
            R();
            this.f25041c.setVisibility(4);
            this.f25039a.addView(this.f25041c);
        }
        if (AbstractC0985p0.isLaidOut(this.f25041c)) {
            M();
        } else {
            this.f25041c.setOnLayoutChangeListener(new q());
        }
    }

    public BaseTransientBottomBar addCallback(s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f25055q == null) {
            this.f25055q = new ArrayList();
        }
        this.f25055q.add(sVar);
        return this;
    }

    public void dismiss() {
        v(3);
    }

    public View getAnchorView() {
        return this.f25045g;
    }

    public int getAnimationMode() {
        return this.f25041c.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.f25056r;
    }

    public Context getContext() {
        return this.f25040b;
    }

    public int getDuration() {
        return this.f25043e;
    }

    public View getView() {
        return this.f25041c;
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.f25046h;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f25044f;
    }

    public boolean isShown() {
        return com.google.android.material.snackbar.c.b().isCurrent(this.f25058t);
    }

    public boolean isShownOrQueued() {
        return com.google.android.material.snackbar.c.b().isCurrentOrNext(this.f25058t);
    }

    public BaseTransientBottomBar removeCallback(s sVar) {
        List list;
        if (sVar == null || (list = this.f25055q) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    void s() {
        this.f25041c.post(new a());
    }

    public BaseTransientBottomBar setAnchorView(View view) {
        com.google.android.material.internal.o.removeOnGlobalLayoutListener(this.f25045g, this.f25047i);
        this.f25045g = view;
        com.google.android.material.internal.o.addOnGlobalLayoutListener(view, this.f25047i);
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z8) {
        this.f25046h = z8;
    }

    public BaseTransientBottomBar setAnimationMode(int i8) {
        this.f25041c.setAnimationMode(i8);
        return this;
    }

    public BaseTransientBottomBar setBehavior(Behavior behavior) {
        this.f25056r = behavior;
        return this;
    }

    public BaseTransientBottomBar setDuration(int i8) {
        this.f25043e = i8;
        return this;
    }

    public BaseTransientBottomBar setGestureInsetBottomIgnored(boolean z8) {
        this.f25044f = z8;
        return this;
    }

    public void show() {
        com.google.android.material.snackbar.c.b().show(getDuration(), this.f25058t);
    }

    protected void v(int i8) {
        com.google.android.material.snackbar.c.b().dismiss(this.f25058t, i8);
    }

    protected SwipeDismissBehavior x() {
        return new Behavior();
    }

    public BaseTransientBottomBar setAnchorView(int i8) {
        View viewFindViewById = this.f25039a.findViewById(i8);
        if (viewFindViewById != null) {
            return setAnchorView(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i8);
    }
}
