package com.google.android.material.floatingactionbutton;

import J2.k;
import K2.h;
import a3.o;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0850j;
import androidx.appcompat.widget.C0854n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.InterfaceC0973l0;
import androidx.core.widget.l;
import b3.C1077a;
import c3.AbstractC1090a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.internal.p;
import java.util.List;

/* loaded from: classes2.dex */
public class FloatingActionButton extends p implements InterfaceC0973l0, l, U2.a, o, CoordinatorLayout.b {
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;

    /* renamed from: r, reason: collision with root package name */
    private static final int f24805r = k.Widget_Design_FloatingActionButton;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f24806b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f24807c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f24808d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f24809e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f24810f;

    /* renamed from: g, reason: collision with root package name */
    private int f24811g;

    /* renamed from: h, reason: collision with root package name */
    private int f24812h;

    /* renamed from: i, reason: collision with root package name */
    private int f24813i;

    /* renamed from: j, reason: collision with root package name */
    private int f24814j;

    /* renamed from: k, reason: collision with root package name */
    private int f24815k;

    /* renamed from: l, reason: collision with root package name */
    boolean f24816l;

    /* renamed from: m, reason: collision with root package name */
    final Rect f24817m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f24818n;

    /* renamed from: o, reason: collision with root package name */
    private final C0854n f24819o;

    /* renamed from: p, reason: collision with root package name */
    private final U2.c f24820p;

    /* renamed from: q, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.d f24821q;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private Rect f24822a;

        /* renamed from: b, reason: collision with root package name */
        private b f24823b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24824c;

        public BaseBehavior() {
            this.f24824c = true;
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f24817m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i8 = 0;
            int i9 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i8 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i8 = -rect.top;
            }
            if (i8 != 0) {
                AbstractC0985p0.offsetTopAndBottom(floatingActionButton, i8);
            }
            if (i9 != 0) {
                AbstractC0985p0.offsetLeftAndRight(floatingActionButton, i9);
            }
        }

        private boolean c(View view, FloatingActionButton floatingActionButton) {
            return this.f24824c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!c(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f24822a == null) {
                this.f24822a = new Rect();
            }
            Rect rect = this.f24822a;
            com.google.android.material.internal.b.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.e(this.f24823b, false);
                return true;
            }
            floatingActionButton.i(this.f24823b, false);
            return true;
        }

        private boolean e(View view, FloatingActionButton floatingActionButton) {
            if (!c(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.e(this.f24823b, false);
                return true;
            }
            floatingActionButton.i(this.f24823b, false);
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.f24824c;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.dodgeInsetEdges == 0) {
                fVar.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z8) {
            this.f24824c = z8;
        }

        public void setInternalAutoHideListener(b bVar) {
            this.f24823b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f24817m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                d(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!a(view)) {
                return false;
            }
            e(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i8) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = dependencies.get(i9);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && e(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (d(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i8);
            b(coordinatorLayout, floatingActionButton);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J2.l.FloatingActionButton_Behavior_Layout);
            this.f24824c = typedArrayObtainStyledAttributes.getBoolean(J2.l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            super.onAttachedToLayoutParams(fVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i8) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i8);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z8) {
            super.setAutoHideEnabled(z8);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(b bVar) {
            super.setInternalAutoHideListener(bVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements d.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f24825a;

        a(b bVar) {
            this.f24825a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void onHidden() {
            this.f24825a.onHidden(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void onShown() {
            this.f24825a.onShown(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements Z2.b {
        c() {
        }

        @Override // Z2.b
        public float getRadius() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // Z2.b
        public boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.f24816l;
        }

        @Override // Z2.b
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // Z2.b
        public void setShadowPadding(int i8, int i9, int i10, int i11) {
            FloatingActionButton.this.f24817m.set(i8, i9, i10, i11);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i8 + floatingActionButton.f24814j, i9 + FloatingActionButton.this.f24814j, i10 + FloatingActionButton.this.f24814j, i11 + FloatingActionButton.this.f24814j);
        }
    }

    class d implements d.i {

        /* renamed from: a, reason: collision with root package name */
        private final K2.k f24828a;

        d(K2.k kVar) {
            this.f24828a = kVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f24828a.equals(this.f24828a);
        }

        public int hashCode() {
            return this.f24828a.hashCode();
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void onScaleChanged() {
            this.f24828a.onScaleChanged(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void onTranslationChanged() {
            this.f24828a.onTranslationChanged(FloatingActionButton.this);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.d c() {
        return new e(this, new c());
    }

    private int d(int i8) {
        int i9 = this.f24813i;
        if (i9 != 0) {
            return i9;
        }
        Resources resources = getResources();
        return i8 != -1 ? i8 != 1 ? resources.getDimensionPixelSize(J2.d.design_fab_size_normal) : resources.getDimensionPixelSize(J2.d.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? d(1) : d(0);
    }

    private void f(Rect rect) {
        int i8 = rect.left;
        Rect rect2 = this.f24817m;
        rect.left = i8 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void g() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f24808d;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.a.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f24809e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0850j.getPorterDuffColorFilter(colorForState, mode));
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.f24821q == null) {
            this.f24821q = c();
        }
        return this.f24821q;
    }

    private static int h(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i8, size);
        }
        if (mode == 0) {
            return i8;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private d.j j(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().addOnHideAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void addTransformationCallback(K2.k kVar) {
        getImpl().e(new d(kVar));
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().B(getDrawableState());
    }

    void e(b bVar, boolean z8) {
        getImpl().t(j(bVar), z8);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f24806b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f24807c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().n();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().q();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    @Deprecated
    public boolean getContentRect(Rect rect) {
        if (!AbstractC0985p0.isLaidOut(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        f(rect);
        return true;
    }

    public int getCustomSize() {
        return this.f24813i;
    }

    @Override // U2.a
    public int getExpandedComponentIdHint() {
        return this.f24820p.getExpandedComponentIdHint();
    }

    public h getHideMotionSpec() {
        return getImpl().m();
    }

    public void getMeasuredContentRect(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        f(rect);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f24810f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f24810f;
    }

    @Override // a3.o
    public a3.k getShapeAppearanceModel() {
        return (a3.k) Z.h.checkNotNull(getImpl().r());
    }

    public h getShowMotionSpec() {
        return getImpl().s();
    }

    public int getSize() {
        return this.f24812h;
    }

    int getSizeDimension() {
        return d(this.f24812h);
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        return this.f24808d;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f24809e;
    }

    public boolean getUseCompatPadding() {
        return this.f24816l;
    }

    public void hide() {
        hide(null);
    }

    void i(b bVar, boolean z8) {
        getImpl().b0(j(bVar), z8);
    }

    @Override // U2.a, U2.b
    public boolean isExpanded() {
        return this.f24820p.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        return getImpl().v();
    }

    public boolean isOrWillBeShown() {
        return getImpl().w();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        int sizeDimension = getSizeDimension();
        this.f24814j = (sizeDimension - this.f24815k) / 2;
        getImpl().e0();
        int iMin = Math.min(h(sizeDimension, i8), h(sizeDimension, i9));
        Rect rect = this.f24817m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1077a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1077a c1077a = (C1077a) parcelable;
        super.onRestoreInstanceState(c1077a.getSuperState());
        this.f24820p.onRestoreInstanceState((Bundle) Z.h.checkNotNull(c1077a.extendableStates.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C1077a c1077a = new C1077a(parcelableOnSaveInstanceState);
        c1077a.extendableStates.put("expandableWidgetHelper", this.f24820p.onSaveInstanceState());
        return c1077a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getContentRect(this.f24818n) && !this.f24818n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().removeOnHideAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().H(animatorListener);
    }

    public void removeTransformationCallback(K2.k kVar) {
        getImpl().I(new d(kVar));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f24806b != colorStateList) {
            this.f24806b = colorStateList;
            getImpl().K(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f24807c != mode) {
            this.f24807c = mode;
            getImpl().L(mode);
        }
    }

    public void setCompatElevation(float f8) {
        getImpl().M(f8);
    }

    public void setCompatElevationResource(int i8) {
        setCompatElevation(getResources().getDimension(i8));
    }

    public void setCompatHoveredFocusedTranslationZ(float f8) {
        getImpl().P(f8);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i8) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i8));
    }

    public void setCompatPressedTranslationZ(float f8) {
        getImpl().T(f8);
    }

    public void setCompatPressedTranslationZResource(int i8) {
        setCompatPressedTranslationZ(getResources().getDimension(i8));
    }

    public void setCustomSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i8 != this.f24813i) {
            this.f24813i = i8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        getImpl().f0(f8);
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        if (z8 != getImpl().l()) {
            getImpl().N(z8);
            requestLayout();
        }
    }

    @Override // U2.a, U2.b
    public boolean setExpanded(boolean z8) {
        return this.f24820p.setExpanded(z8);
    }

    @Override // U2.a
    public void setExpandedComponentIdHint(int i8) {
        this.f24820p.setExpandedComponentIdHint(i8);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().O(hVar);
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(h.createFromResource(getContext(), i8));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().d0();
            if (this.f24808d != null) {
                g();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        this.f24819o.setImageResource(i8);
        g();
    }

    public void setRippleColor(int i8) {
        setRippleColor(ColorStateList.valueOf(i8));
    }

    @Override // android.view.View
    public void setScaleX(float f8) {
        super.setScaleX(f8);
        getImpl().F();
    }

    @Override // android.view.View
    public void setScaleY(float f8) {
        super.setScaleY(f8);
        getImpl().F();
    }

    public void setShadowPaddingEnabled(boolean z8) {
        getImpl().V(z8);
    }

    @Override // a3.o
    public void setShapeAppearanceModel(a3.k kVar) {
        getImpl().W(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().X(hVar);
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(h.createFromResource(getContext(), i8));
    }

    public void setSize(int i8) {
        this.f24813i = 0;
        if (i8 != this.f24812h) {
            this.f24812h = i8;
            requestLayout();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f24808d != colorStateList) {
            this.f24808d = colorStateList;
            g();
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f24809e != mode) {
            this.f24809e = mode;
            g();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f8) {
        super.setTranslationX(f8);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationY(float f8) {
        super.setTranslationY(f8);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationZ(float f8) {
        super.setTranslationZ(f8);
        getImpl().G();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f24816l != z8) {
            this.f24816l = z8;
            getImpl().z();
        }
    }

    @Override // com.google.android.material.internal.p, android.widget.ImageView, android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().l();
    }

    public void show() {
        show(null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.floatingActionButtonStyle);
    }

    public void hide(b bVar) {
        e(bVar, true);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f24810f != colorStateList) {
            this.f24810f = colorStateList;
            getImpl().U(this.f24810f);
        }
    }

    public void show(b bVar) {
        i(bVar, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i8) throws Resources.NotFoundException {
        int i9 = f24805r;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24817m = new Rect();
        this.f24818n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, J2.l.FloatingActionButton, i8, i9, new int[0]);
        this.f24806b = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, J2.l.FloatingActionButton_backgroundTint);
        this.f24807c = com.google.android.material.internal.o.parseTintMode(typedArrayObtainStyledAttributes.getInt(J2.l.FloatingActionButton_backgroundTintMode, -1), null);
        this.f24810f = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, J2.l.FloatingActionButton_rippleColor);
        this.f24812h = typedArrayObtainStyledAttributes.getInt(J2.l.FloatingActionButton_fabSize, -1);
        this.f24813i = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.FloatingActionButton_fabCustomSize, 0);
        this.f24811g = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(J2.l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(J2.l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(J2.l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f24816l = typedArrayObtainStyledAttributes.getBoolean(J2.l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(J2.d.mtrl_fab_min_touch_target);
        this.f24815k = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.FloatingActionButton_maxImageSize, 0);
        h hVarCreateFromAttribute = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, J2.l.FloatingActionButton_showMotionSpec);
        h hVarCreateFromAttribute2 = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, J2.l.FloatingActionButton_hideMotionSpec);
        a3.k kVarBuild = a3.k.builder(context2, attributeSet, i8, i9, a3.k.PILL).build();
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(J2.l.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(J2.l.FloatingActionButton_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        C0854n c0854n = new C0854n(this);
        this.f24819o = c0854n;
        c0854n.loadFromAttributes(attributeSet, i8);
        this.f24820p = new U2.c(this);
        getImpl().W(kVarBuild);
        getImpl().u(this.f24806b, this.f24807c, this.f24810f, this.f24811g);
        getImpl().S(dimensionPixelSize);
        getImpl().M(dimension);
        getImpl().P(dimension2);
        getImpl().T(dimension3);
        getImpl().R(this.f24815k);
        getImpl().X(hVarCreateFromAttribute);
        getImpl().O(hVarCreateFromAttribute2);
        getImpl().N(z8);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
