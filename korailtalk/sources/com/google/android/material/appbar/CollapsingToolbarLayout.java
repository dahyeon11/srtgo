package com.google.android.material.appbar;

import J2.k;
import J2.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import androidx.core.view.W;
import c3.AbstractC1090a;
import com.google.android.material.appbar.AppBarLayout;
import h.AbstractC5571i;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: x */
    private static final int f24274x = k.Widget_Design_CollapsingToolbar;

    /* renamed from: a */
    private boolean f24275a;

    /* renamed from: b */
    private int f24276b;

    /* renamed from: c */
    private ViewGroup f24277c;

    /* renamed from: d */
    private View f24278d;

    /* renamed from: e */
    private View f24279e;

    /* renamed from: f */
    private int f24280f;

    /* renamed from: g */
    private int f24281g;

    /* renamed from: h */
    private int f24282h;

    /* renamed from: i */
    private int f24283i;

    /* renamed from: j */
    private final Rect f24284j;

    /* renamed from: k */
    final com.google.android.material.internal.a f24285k;

    /* renamed from: l */
    private boolean f24286l;

    /* renamed from: m */
    private boolean f24287m;

    /* renamed from: n */
    private Drawable f24288n;

    /* renamed from: o */
    Drawable f24289o;

    /* renamed from: p */
    private int f24290p;

    /* renamed from: q */
    private boolean f24291q;

    /* renamed from: r */
    private ValueAnimator f24292r;

    /* renamed from: s */
    private long f24293s;

    /* renamed from: t */
    private int f24294t;

    /* renamed from: u */
    private AppBarLayout.e f24295u;

    /* renamed from: v */
    int f24296v;

    /* renamed from: w */
    C0950d1 f24297w;

    class a implements W {
        a() {
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
            return CollapsingToolbarLayout.this.l(c0950d1);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class d implements AppBarLayout.e {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.e, com.google.android.material.appbar.AppBarLayout.c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i8) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f24296v = i8;
            C0950d1 c0950d1 = collapsingToolbarLayout.f24297w;
            int systemWindowInsetTop = c0950d1 != null ? c0950d1.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i9);
                c cVar = (c) childAt.getLayoutParams();
                e eVarI = CollapsingToolbarLayout.i(childAt);
                int i10 = cVar.f24300a;
                if (i10 == 1) {
                    eVarI.setTopAndBottomOffset(X.a.clamp(-i8, 0, CollapsingToolbarLayout.this.g(childAt)));
                } else if (i10 == 2) {
                    eVarI.setTopAndBottomOffset(Math.round((-i8) * cVar.f24301b));
                }
            }
            CollapsingToolbarLayout.this.p();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f24289o != null && systemWindowInsetTop > 0) {
                AbstractC0985p0.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f24285k.setExpansionFraction(Math.abs(i8) / ((CollapsingToolbarLayout.this.getHeight() - AbstractC0985p0.getMinimumHeight(CollapsingToolbarLayout.this)) - systemWindowInsetTop));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    private void a(int i8) {
        b();
        ValueAnimator valueAnimator = this.f24292r;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f24292r = valueAnimator2;
            valueAnimator2.setDuration(this.f24293s);
            this.f24292r.setInterpolator(i8 > this.f24290p ? K2.a.FAST_OUT_LINEAR_IN_INTERPOLATOR : K2.a.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
            this.f24292r.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f24292r.cancel();
        }
        this.f24292r.setIntValues(this.f24290p, i8);
        this.f24292r.start();
    }

    private void b() {
        if (this.f24275a) {
            ViewGroup viewGroup = null;
            this.f24277c = null;
            this.f24278d = null;
            int i8 = this.f24276b;
            if (i8 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i8);
                this.f24277c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f24278d = c(viewGroup2);
                }
            }
            if (this.f24277c == null) {
                int childCount = getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i9);
                    if (j(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i9++;
                }
                this.f24277c = viewGroup;
            }
            o();
            this.f24275a = false;
        }
    }

    private View c(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence h(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static e i(View view) {
        e eVar = (e) view.getTag(J2.f.view_offset_helper);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(view);
        view.setTag(J2.f.view_offset_helper, eVar2);
        return eVar2;
    }

    private static boolean j(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean k(View view) {
        View view2 = this.f24278d;
        if (view2 == null || view2 == this) {
            if (view != this.f24277c) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    private void m(boolean z8) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f24278d;
        if (view == null) {
            view = this.f24277c;
        }
        int iG = g(view);
        com.google.android.material.internal.b.getDescendantRect(this, this.f24279e, this.f24284j);
        ViewGroup viewGroup = this.f24277c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        com.google.android.material.internal.a aVar = this.f24285k;
        Rect rect = this.f24284j;
        int i8 = rect.left + (z8 ? titleMarginEnd : titleMarginStart);
        int i9 = rect.top + iG + titleMarginTop;
        int i10 = rect.right;
        if (!z8) {
            titleMarginStart = titleMarginEnd;
        }
        aVar.setCollapsedBounds(i8, i9, i10 - titleMarginStart, (rect.bottom + iG) - titleMarginBottom);
    }

    private void n() {
        setContentDescription(getTitle());
    }

    private void o() {
        View view;
        if (!this.f24286l && (view = this.f24279e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f24279e);
            }
        }
        if (!this.f24286l || this.f24277c == null) {
            return;
        }
        if (this.f24279e == null) {
            this.f24279e = new View(getContext());
        }
        if (this.f24279e.getParent() == null) {
            this.f24277c.addView(this.f24279e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: d */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f24277c == null && (drawable = this.f24288n) != null && this.f24290p > 0) {
            drawable.mutate().setAlpha(this.f24290p);
            this.f24288n.draw(canvas);
        }
        if (this.f24286l && this.f24287m) {
            this.f24285k.draw(canvas);
        }
        if (this.f24289o == null || this.f24290p <= 0) {
            return;
        }
        C0950d1 c0950d1 = this.f24297w;
        int systemWindowInsetTop = c0950d1 != null ? c0950d1.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f24289o.setBounds(0, -this.f24296v, getWidth(), systemWindowInsetTop - this.f24296v);
            this.f24289o.mutate().setAlpha(this.f24290p);
            this.f24289o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j8) {
        boolean z8;
        if (this.f24288n == null || this.f24290p <= 0 || !k(view)) {
            z8 = false;
        } else {
            this.f24288n.mutate().setAlpha(this.f24290p);
            this.f24288n.draw(canvas);
            z8 = true;
        }
        return super.drawChild(canvas, view, j8) || z8;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f24289o;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f24288n;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f24285k;
        if (aVar != null) {
            state |= aVar.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    final int g(View view) {
        return ((getHeight() - i(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.f24285k.getCollapsedTextGravity();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f24285k.getCollapsedTypeface();
    }

    public Drawable getContentScrim() {
        return this.f24288n;
    }

    public int getExpandedTitleGravity() {
        return this.f24285k.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f24283i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f24282h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f24280f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f24281g;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f24285k.getExpandedTypeface();
    }

    public int getMaxLines() {
        return this.f24285k.getMaxLines();
    }

    int getScrimAlpha() {
        return this.f24290p;
    }

    public long getScrimAnimationDuration() {
        return this.f24293s;
    }

    public int getScrimVisibleHeightTrigger() {
        int i8 = this.f24294t;
        if (i8 >= 0) {
            return i8;
        }
        C0950d1 c0950d1 = this.f24297w;
        int systemWindowInsetTop = c0950d1 != null ? c0950d1.getSystemWindowInsetTop() : 0;
        int minimumHeight = AbstractC0985p0.getMinimumHeight(this);
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f24289o;
    }

    public CharSequence getTitle() {
        if (this.f24286l) {
            return this.f24285k.getText();
        }
        return null;
    }

    public boolean isTitleEnabled() {
        return this.f24286l;
    }

    C0950d1 l(C0950d1 c0950d1) {
        C0950d1 c0950d12 = AbstractC0985p0.getFitsSystemWindows(this) ? c0950d1 : null;
        if (!Z.c.equals(this.f24297w, c0950d12)) {
            this.f24297w = c0950d12;
            requestLayout();
        }
        return c0950d1.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            AbstractC0985p0.setFitsSystemWindows(this, AbstractC0985p0.getFitsSystemWindows((View) parent));
            if (this.f24295u == null) {
                this.f24295u = new d();
            }
            ((AppBarLayout) parent).addOnOffsetChangedListener(this.f24295u);
            AbstractC0985p0.requestApplyInsets(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.e eVar = this.f24295u;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(eVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        View view;
        super.onLayout(z8, i8, i9, i10, i11);
        C0950d1 c0950d1 = this.f24297w;
        if (c0950d1 != null) {
            int systemWindowInsetTop = c0950d1.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!AbstractC0985p0.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    AbstractC0985p0.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            i(getChildAt(i13)).b();
        }
        if (this.f24286l && (view = this.f24279e) != null) {
            boolean z9 = AbstractC0985p0.isAttachedToWindow(view) && this.f24279e.getVisibility() == 0;
            this.f24287m = z9;
            if (z9) {
                boolean z10 = AbstractC0985p0.getLayoutDirection(this) == 1;
                m(z10);
                this.f24285k.setExpandedBounds(z10 ? this.f24282h : this.f24280f, this.f24284j.top + this.f24281g, (i10 - i8) - (z10 ? this.f24280f : this.f24282h), (i11 - i9) - this.f24283i);
                this.f24285k.recalculate();
            }
        }
        if (this.f24277c != null && this.f24286l && TextUtils.isEmpty(this.f24285k.getText())) {
            setTitle(h(this.f24277c));
        }
        p();
        int childCount3 = getChildCount();
        for (int i14 = 0; i14 < childCount3; i14++) {
            i(getChildAt(i14)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        b();
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i9);
        C0950d1 c0950d1 = this.f24297w;
        int systemWindowInsetTop = c0950d1 != null ? c0950d1.getSystemWindowInsetTop() : 0;
        if (mode == 0 && systemWindowInsetTop > 0) {
            super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        ViewGroup viewGroup = this.f24277c;
        if (viewGroup != null) {
            View view = this.f24278d;
            if (view == null || view == this) {
                setMinimumHeight(f(viewGroup));
            } else {
                setMinimumHeight(f(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        Drawable drawable = this.f24288n;
        if (drawable != null) {
            drawable.setBounds(0, 0, i8, i9);
        }
    }

    final void p() {
        if (this.f24288n == null && this.f24289o == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f24296v < getScrimVisibleHeightTrigger());
    }

    public void setCollapsedTitleGravity(int i8) {
        this.f24285k.setCollapsedTextGravity(i8);
    }

    public void setCollapsedTitleTextAppearance(int i8) {
        this.f24285k.setCollapsedTextAppearance(i8);
    }

    public void setCollapsedTitleTextColor(int i8) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f24285k.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f24288n;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f24288n = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.f24288n.setCallback(this);
                this.f24288n.setAlpha(this.f24290p);
            }
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(int i8) {
        setContentScrim(new ColorDrawable(i8));
    }

    public void setContentScrimResource(int i8) {
        setContentScrim(androidx.core.content.a.getDrawable(getContext(), i8));
    }

    public void setExpandedTitleColor(int i8) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setExpandedTitleGravity(int i8) {
        this.f24285k.setExpandedTextGravity(i8);
    }

    public void setExpandedTitleMargin(int i8, int i9, int i10, int i11) {
        this.f24280f = i8;
        this.f24281g = i9;
        this.f24282h = i10;
        this.f24283i = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i8) {
        this.f24283i = i8;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i8) {
        this.f24282h = i8;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i8) {
        this.f24280f = i8;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i8) {
        this.f24281g = i8;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i8) {
        this.f24285k.setExpandedTextAppearance(i8);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f24285k.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f24285k.setExpandedTypeface(typeface);
    }

    public void setMaxLines(int i8) {
        this.f24285k.setMaxLines(i8);
    }

    void setScrimAlpha(int i8) {
        ViewGroup viewGroup;
        if (i8 != this.f24290p) {
            if (this.f24288n != null && (viewGroup = this.f24277c) != null) {
                AbstractC0985p0.postInvalidateOnAnimation(viewGroup);
            }
            this.f24290p = i8;
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(long j8) {
        this.f24293s = j8;
    }

    public void setScrimVisibleHeightTrigger(int i8) {
        if (this.f24294t != i8) {
            this.f24294t = i8;
            p();
        }
    }

    public void setScrimsShown(boolean z8) {
        setScrimsShown(z8, AbstractC0985p0.isLaidOut(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f24289o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f24289o = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f24289o.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.setLayoutDirection(this.f24289o, AbstractC0985p0.getLayoutDirection(this));
                this.f24289o.setVisible(getVisibility() == 0, false);
                this.f24289o.setCallback(this);
                this.f24289o.setAlpha(this.f24290p);
            }
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(int i8) {
        setStatusBarScrim(new ColorDrawable(i8));
    }

    public void setStatusBarScrimResource(int i8) {
        setStatusBarScrim(androidx.core.content.a.getDrawable(getContext(), i8));
    }

    public void setTitle(CharSequence charSequence) {
        this.f24285k.setText(charSequence);
        n();
    }

    public void setTitleEnabled(boolean z8) {
        if (z8 != this.f24286l) {
            this.f24286l = z8;
            n();
            o();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f24289o;
        if (drawable != null && drawable.isVisible() != z8) {
            this.f24289o.setVisible(z8, false);
        }
        Drawable drawable2 = this.f24288n;
        if (drawable2 == null || drawable2.isVisible() == z8) {
            return;
        }
        this.f24288n.setVisible(z8, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24288n || drawable == this.f24289o;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f24285k.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z8, boolean z9) {
        if (this.f24291q != z8) {
            if (z9) {
                a(z8 ? 255 : 0);
            } else {
                setScrimAlpha(z8 ? 255 : 0);
            }
            this.f24291q = z8;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24274x;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24275a = true;
        this.f24284j = new Rect();
        this.f24294t = -1;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f24285k = aVar;
        aVar.setTextSizeInterpolator(K2.a.DECELERATE_INTERPOLATOR);
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.CollapsingToolbarLayout, i8, i9, new int[0]);
        aVar.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(l.CollapsingToolbarLayout_expandedTitleGravity, L2.a.BOTTOM_START));
        aVar.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(l.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f24283i = dimensionPixelSize;
        this.f24282h = dimensionPixelSize;
        this.f24281g = dimensionPixelSize;
        this.f24280f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f24280f = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f24282h = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f24281g = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f24283i = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f24286l = typedArrayObtainStyledAttributes.getBoolean(l.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(l.CollapsingToolbarLayout_title));
        aVar.setExpandedTextAppearance(k.TextAppearance_Design_CollapsingToolbar_Expanded);
        aVar.setCollapsedTextAppearance(AbstractC5571i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            aVar.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(l.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            aVar.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(l.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f24294t = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(l.CollapsingToolbarLayout_maxLines)) {
            aVar.setMaxLines(typedArrayObtainStyledAttributes.getInt(l.CollapsingToolbarLayout_maxLines, 1));
        }
        this.f24293s = typedArrayObtainStyledAttributes.getInt(l.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(l.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(l.CollapsingToolbarLayout_statusBarScrim));
        this.f24276b = typedArrayObtainStyledAttributes.getResourceId(l.CollapsingToolbarLayout_toolbarId, -1);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        AbstractC0985p0.setOnApplyWindowInsetsListener(this, new a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;

        /* renamed from: a */
        int f24300a;

        /* renamed from: b */
        float f24301b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24300a = 0;
            this.f24301b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.CollapsingToolbarLayout_Layout);
            this.f24300a = typedArrayObtainStyledAttributes.getInt(l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.f24300a;
        }

        public float getParallaxMultiplier() {
            return this.f24301b;
        }

        public void setCollapseMode(int i8) {
            this.f24300a = i8;
        }

        public void setParallaxMultiplier(float f8) {
            this.f24301b = f8;
        }

        public c(int i8, int i9) {
            super(i8, i9);
            this.f24300a = 0;
            this.f24301b = 0.5f;
        }

        public c(int i8, int i9, int i10) {
            super(i8, i9, i10);
            this.f24300a = 0;
            this.f24301b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24300a = 0;
            this.f24301b = 0.5f;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24300a = 0;
            this.f24301b = 0.5f;
        }

        public c(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24300a = 0;
            this.f24301b = 0.5f;
        }
    }
}
