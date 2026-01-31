package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import c3.AbstractC1090a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: G, reason: collision with root package name */
    private static final int f24769G = J2.k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: H, reason: collision with root package name */
    static final Property f24770H = new d(Float.class, "width");

    /* renamed from: I, reason: collision with root package name */
    static final Property f24771I = new e(Float.class, "height");

    /* renamed from: J, reason: collision with root package name */
    static final Property f24772J = new f(Float.class, "paddingStart");

    /* renamed from: K, reason: collision with root package name */
    static final Property f24773K = new g(Float.class, "paddingEnd");

    /* renamed from: A, reason: collision with root package name */
    private int f24774A;

    /* renamed from: B, reason: collision with root package name */
    private final CoordinatorLayout.c f24775B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f24776C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f24777D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f24778E;

    /* renamed from: F, reason: collision with root package name */
    protected ColorStateList f24779F;

    /* renamed from: s, reason: collision with root package name */
    private int f24780s;

    /* renamed from: t, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f24781t;

    /* renamed from: u, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f24782u;

    /* renamed from: v, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f24783v;

    /* renamed from: w, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f24784w;

    /* renamed from: x, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f24785x;

    /* renamed from: y, reason: collision with root package name */
    private final int f24786y;

    /* renamed from: z, reason: collision with root package name */
    private int f24787z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private Rect f24788a;

        /* renamed from: b, reason: collision with root package name */
        private j f24789b;

        /* renamed from: c, reason: collision with root package name */
        private j f24790c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f24791d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f24792e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f24791d = false;
            this.f24792e = true;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean c(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f24791d || this.f24792e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        private boolean e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!c(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f24788a == null) {
                this.f24788a = new Rect();
            }
            Rect rect = this.f24788a;
            com.google.android.material.internal.b.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                d(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        private boolean f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!c(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                d(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        protected void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z8 = this.f24792e;
            extendedFloatingActionButton.x(z8 ? extendedFloatingActionButton.f24783v : extendedFloatingActionButton.f24784w, z8 ? this.f24790c : this.f24789b);
        }

        protected void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z8 = this.f24792e;
            extendedFloatingActionButton.x(z8 ? extendedFloatingActionButton.f24782u : extendedFloatingActionButton.f24785x, z8 ? this.f24790c : this.f24789b);
        }

        public boolean isAutoHideEnabled() {
            return this.f24791d;
        }

        public boolean isAutoShrinkEnabled() {
            return this.f24792e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.dodgeInsetEdges == 0) {
                fVar.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z8) {
            this.f24791d = z8;
        }

        public void setAutoShrinkEnabled(boolean z8) {
            this.f24792e = z8;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (View) extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                e(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!b(view)) {
                return false;
            }
            f(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i8) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = dependencies.get(i9);
                if (!(view instanceof AppBarLayout)) {
                    if (b(view) && f(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (e(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i8);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J2.l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f24791d = typedArrayObtainStyledAttributes.getBoolean(J2.l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f24792e = typedArrayObtainStyledAttributes.getBoolean(J2.l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements l {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f24774A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f24787z;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f24787z + ExtendedFloatingActionButton.this.f24774A;
        }
    }

    class b implements l {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f24795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f24796b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f24797c;

        c(com.google.android.material.floatingactionbutton.f fVar, j jVar) {
            this.f24796b = fVar;
            this.f24797c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24795a = true;
            this.f24796b.onAnimationCancel();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24796b.onAnimationEnd();
            if (this.f24795a) {
                return;
            }
            this.f24796b.onChange(this.f24797c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f24796b.onAnimationStart(animator);
            this.f24795a = false;
        }
    }

    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f8) {
            view.getLayoutParams().width = f8.intValue();
            view.requestLayout();
        }
    }

    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f8) {
            view.getLayoutParams().height = f8.intValue();
            view.requestLayout();
        }
    }

    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(AbstractC0985p0.getPaddingStart(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f8) {
            AbstractC0985p0.setPaddingRelative(view, f8.intValue(), view.getPaddingTop(), AbstractC0985p0.getPaddingEnd(view), view.getPaddingBottom());
        }
    }

    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(AbstractC0985p0.getPaddingEnd(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f8) {
            AbstractC0985p0.setPaddingRelative(view, AbstractC0985p0.getPaddingStart(view), view.getPaddingTop(), f8.intValue(), view.getPaddingBottom());
        }
    }

    class h extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private final l f24799g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f24800h;

        h(com.google.android.material.floatingactionbutton.a aVar, l lVar, boolean z8) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f24799g = lVar;
            this.f24800h = z8;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public AnimatorSet createAnimator() {
            K2.h currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f24799g.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f24799g.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(AbstractC0985p0.getPaddingStart(ExtendedFloatingActionButton.this), this.f24799g.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(AbstractC0985p0.getPaddingEnd(ExtendedFloatingActionButton.this), this.f24799g.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z8 = this.f24800h;
                propertyValues5[0].setFloatValues(z8 ? 0.0f : 1.0f, z8 ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.b(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public int getDefaultMotionSpecResource() {
            return this.f24800h ? J2.a.mtrl_extended_fab_change_size_expand_motion_spec : J2.a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f24777D = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f24799g.getLayoutParams().width;
            layoutParams.height = this.f24799g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f24776C = this.f24800h;
            ExtendedFloatingActionButton.this.f24777D = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onChange(j jVar) {
            if (jVar == null) {
                return;
            }
            if (this.f24800h) {
                jVar.onExtended(ExtendedFloatingActionButton.this);
            } else {
                jVar.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void performNow() {
            ExtendedFloatingActionButton.this.f24776C = this.f24800h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f24799g.getLayoutParams().width;
            layoutParams.height = this.f24799g.getLayoutParams().height;
            AbstractC0985p0.setPaddingRelative(ExtendedFloatingActionButton.this, this.f24799g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f24799g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public boolean shouldCancel() {
            return this.f24800h == ExtendedFloatingActionButton.this.f24776C || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    class i extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private boolean f24802g;

        public i(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public int getDefaultMotionSpecResource() {
            return J2.a.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.f24802g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f24780s = 0;
            if (this.f24802g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f24802g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f24780s = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onChange(j jVar) {
            if (jVar != null) {
                jVar.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.v();
        }
    }

    public static abstract class j {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class k extends com.google.android.material.floatingactionbutton.b {
        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public int getDefaultMotionSpecResource() {
            return J2.a.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f24780s = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f24780s = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onChange(j jVar) {
            if (jVar != null) {
                jVar.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.w();
        }
    }

    interface l {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v() {
        return getVisibility() == 0 ? this.f24780s == 1 : this.f24780s != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        return getVisibility() != 0 ? this.f24780s == 2 : this.f24780s != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(com.google.android.material.floatingactionbutton.f fVar, j jVar) {
        if (fVar.shouldCancel()) {
            return;
        }
        if (!z()) {
            fVar.performNow();
            fVar.onChange(jVar);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetCreateAnimator = fVar.createAnimator();
        animatorSetCreateAnimator.addListener(new c(fVar, jVar));
        Iterator<Animator.AnimatorListener> it = fVar.getListeners().iterator();
        while (it.hasNext()) {
            animatorSetCreateAnimator.addListener(it.next());
        }
        animatorSetCreateAnimator.start();
    }

    private void y() {
        this.f24779F = getTextColors();
    }

    private boolean z() {
        return (AbstractC0985p0.isLaidOut(this) || (!w() && this.f24778E)) && !isInEditMode();
    }

    protected void A(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24783v.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24785x.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24784w.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24782u.addAnimationListener(animatorListener);
    }

    public void extend() {
        x(this.f24783v, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return this.f24775B;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i8 = this.f24786y;
        return i8 < 0 ? (Math.min(AbstractC0985p0.getPaddingStart(this), AbstractC0985p0.getPaddingEnd(this)) * 2) + getIconSize() : i8;
    }

    public K2.h getExtendMotionSpec() {
        return this.f24783v.getMotionSpec();
    }

    public K2.h getHideMotionSpec() {
        return this.f24785x.getMotionSpec();
    }

    public K2.h getShowMotionSpec() {
        return this.f24784w.getMotionSpec();
    }

    public K2.h getShrinkMotionSpec() {
        return this.f24782u.getMotionSpec();
    }

    public void hide() {
        x(this.f24785x, null);
    }

    public final boolean isExtended() {
        return this.f24776C;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24776C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f24776C = false;
            this.f24782u.performNow();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24783v.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24785x.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24784w.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24782u.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z8) {
        this.f24778E = z8;
    }

    public void setExtendMotionSpec(K2.h hVar) {
        this.f24783v.setMotionSpec(hVar);
    }

    public void setExtendMotionSpecResource(int i8) {
        setExtendMotionSpec(K2.h.createFromResource(getContext(), i8));
    }

    public void setExtended(boolean z8) {
        if (this.f24776C == z8) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z8 ? this.f24783v : this.f24782u;
        if (fVar.shouldCancel()) {
            return;
        }
        fVar.performNow();
    }

    public void setHideMotionSpec(K2.h hVar) {
        this.f24785x.setMotionSpec(hVar);
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(K2.h.createFromResource(getContext(), i8));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        super.setPadding(i8, i9, i10, i11);
        if (!this.f24776C || this.f24777D) {
            return;
        }
        this.f24787z = AbstractC0985p0.getPaddingStart(this);
        this.f24774A = AbstractC0985p0.getPaddingEnd(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i8, int i9, int i10, int i11) {
        super.setPaddingRelative(i8, i9, i10, i11);
        if (!this.f24776C || this.f24777D) {
            return;
        }
        this.f24787z = i8;
        this.f24774A = i10;
    }

    public void setShowMotionSpec(K2.h hVar) {
        this.f24784w.setMotionSpec(hVar);
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(K2.h.createFromResource(getContext(), i8));
    }

    public void setShrinkMotionSpec(K2.h hVar) {
        this.f24782u.setMotionSpec(hVar);
    }

    public void setShrinkMotionSpecResource(int i8) {
        setShrinkMotionSpec(K2.h.createFromResource(getContext(), i8));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i8) {
        super.setTextColor(i8);
        y();
    }

    public void show() {
        x(this.f24784w, null);
    }

    public void shrink() {
        x(this.f24782u, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.extendedFloatingActionButtonStyle);
    }

    public void extend(j jVar) {
        x(this.f24783v, jVar);
    }

    public void hide(j jVar) {
        x(this.f24785x, jVar);
    }

    public void show(j jVar) {
        x(this.f24784w, jVar);
    }

    public void shrink(j jVar) {
        x(this.f24782u, jVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24769G;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24780s = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.f24781t = aVar;
        k kVar = new k(aVar);
        this.f24784w = kVar;
        i iVar = new i(aVar);
        this.f24785x = iVar;
        this.f24776C = true;
        this.f24777D = false;
        this.f24778E = false;
        Context context2 = getContext();
        this.f24775B = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, J2.l.ExtendedFloatingActionButton, i8, i9, new int[0]);
        K2.h hVarCreateFromAttribute = K2.h.createFromAttribute(context2, typedArrayObtainStyledAttributes, J2.l.ExtendedFloatingActionButton_showMotionSpec);
        K2.h hVarCreateFromAttribute2 = K2.h.createFromAttribute(context2, typedArrayObtainStyledAttributes, J2.l.ExtendedFloatingActionButton_hideMotionSpec);
        K2.h hVarCreateFromAttribute3 = K2.h.createFromAttribute(context2, typedArrayObtainStyledAttributes, J2.l.ExtendedFloatingActionButton_extendMotionSpec);
        K2.h hVarCreateFromAttribute4 = K2.h.createFromAttribute(context2, typedArrayObtainStyledAttributes, J2.l.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.f24786y = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.ExtendedFloatingActionButton_collapsedSize, -1);
        this.f24787z = AbstractC0985p0.getPaddingStart(this);
        this.f24774A = AbstractC0985p0.getPaddingEnd(this);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        h hVar = new h(aVar2, new a(), true);
        this.f24783v = hVar;
        h hVar2 = new h(aVar2, new b(), false);
        this.f24782u = hVar2;
        kVar.setMotionSpec(hVarCreateFromAttribute);
        iVar.setMotionSpec(hVarCreateFromAttribute2);
        hVar.setMotionSpec(hVarCreateFromAttribute3);
        hVar2.setMotionSpec(hVarCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(a3.k.builder(context2, attributeSet, i8, i9, a3.k.PILL).build());
        y();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        y();
    }
}
