package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.k;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import h.AbstractC5563a;
import h.AbstractC5568f;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements O, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T {

    /* renamed from: F, reason: collision with root package name */
    static final int[] f6730F = {AbstractC5563a.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f6731A;

    /* renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f6732B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f6733C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f6734D;

    /* renamed from: E, reason: collision with root package name */
    private final androidx.core.view.V f6735E;

    /* renamed from: a, reason: collision with root package name */
    private int f6736a;

    /* renamed from: b, reason: collision with root package name */
    private int f6737b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f6738c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f6739d;

    /* renamed from: e, reason: collision with root package name */
    private P f6740e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f6741f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6742g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6743h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6744i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6745j;

    /* renamed from: k, reason: collision with root package name */
    boolean f6746k;

    /* renamed from: l, reason: collision with root package name */
    private int f6747l;

    /* renamed from: m, reason: collision with root package name */
    private int f6748m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f6749n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f6750o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f6751p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f6752q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f6753r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f6754s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f6755t;

    /* renamed from: u, reason: collision with root package name */
    private C0950d1 f6756u;

    /* renamed from: v, reason: collision with root package name */
    private C0950d1 f6757v;

    /* renamed from: w, reason: collision with root package name */
    private C0950d1 f6758w;

    /* renamed from: x, reason: collision with root package name */
    private C0950d1 f6759x;

    /* renamed from: y, reason: collision with root package name */
    private d f6760y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f6761z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f6731A = null;
            actionBarOverlayLayout.f6746k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f6731A = null;
            actionBarOverlayLayout.f6746k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.e();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f6731A = actionBarOverlayLayout.f6739d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f6732B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.e();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f6731A = actionBarOverlayLayout.f6739d.animate().translationY(-ActionBarOverlayLayout.this.f6739d.getHeight()).setListener(ActionBarOverlayLayout.this.f6732B);
        }
    }

    public interface d {
        void enableContentAnimations(boolean z8);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i8);

        void showForSystem();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i8, int i9) {
            super(i8, i9);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void a() {
        e();
        this.f6734D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.b(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private P d(View view) {
        if (view instanceof P) {
            return (P) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f6730F);
        this.f6736a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f6741f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f6742g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f6761z = new OverScroller(context);
    }

    private void g() {
        e();
        postDelayed(this.f6734D, 600L);
    }

    private void h() {
        e();
        postDelayed(this.f6733C, 600L);
    }

    private void j() {
        e();
        this.f6733C.run();
    }

    private boolean k(float f8) {
        this.f6761z.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f6761z.getFinalY() > this.f6739d.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // androidx.appcompat.widget.O
    public boolean canShowOverflowMenu() {
        i();
        return this.f6740e.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.O
    public void dismissPopups() {
        i();
        this.f6740e.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6741f == null || this.f6742g) {
            return;
        }
        int bottom = this.f6739d.getVisibility() == 0 ? (int) (this.f6739d.getBottom() + this.f6739d.getTranslationY() + 0.5f) : 0;
        this.f6741f.setBounds(0, bottom, getWidth(), this.f6741f.getIntrinsicHeight() + bottom);
        this.f6741f.draw(canvas);
    }

    void e() {
        removeCallbacks(this.f6733C);
        removeCallbacks(this.f6734D);
        ViewPropertyAnimator viewPropertyAnimator = this.f6731A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f6739d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public int getNestedScrollAxes() {
        return this.f6735E.getNestedScrollAxes();
    }

    @Override // androidx.appcompat.widget.O
    public CharSequence getTitle() {
        i();
        return this.f6740e.getTitle();
    }

    @Override // androidx.appcompat.widget.O
    public boolean hasIcon() {
        i();
        return this.f6740e.hasIcon();
    }

    @Override // androidx.appcompat.widget.O
    public boolean hasLogo() {
        i();
        return this.f6740e.hasLogo();
    }

    @Override // androidx.appcompat.widget.O
    public boolean hideOverflowMenu() {
        i();
        return this.f6740e.hideOverflowMenu();
    }

    void i() {
        if (this.f6738c == null) {
            this.f6738c = (ContentFrameLayout) findViewById(AbstractC5568f.action_bar_activity_content);
            this.f6739d = (ActionBarContainer) findViewById(AbstractC5568f.action_bar_container);
            this.f6740e = d(findViewById(AbstractC5568f.action_bar));
        }
    }

    @Override // androidx.appcompat.widget.O
    public void initFeature(int i8) {
        i();
        if (i8 == 2) {
            this.f6740e.initProgress();
        } else if (i8 == 5) {
            this.f6740e.initIndeterminateProgress();
        } else {
            if (i8 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.f6745j;
    }

    public boolean isInOverlayMode() {
        return this.f6743h;
    }

    @Override // androidx.appcompat.widget.O
    public boolean isOverflowMenuShowPending() {
        i();
        return this.f6740e.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.O
    public boolean isOverflowMenuShowing() {
        i();
        return this.f6740e.isOverflowMenuShowing();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i();
        C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(windowInsets, this);
        boolean zB = b(this.f6739d, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        AbstractC0985p0.computeSystemWindowInsets(this, windowInsetsCompat, this.f6749n);
        Rect rect = this.f6749n;
        C0950d1 c0950d1Inset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f6756u = c0950d1Inset;
        boolean z8 = true;
        if (!this.f6757v.equals(c0950d1Inset)) {
            this.f6757v = this.f6756u;
            zB = true;
        }
        if (this.f6750o.equals(this.f6749n)) {
            z8 = zB;
        } else {
            this.f6750o.set(this.f6749n);
        }
        if (z8) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(getContext());
        AbstractC0985p0.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.f6739d, i8, 0, i9, 0);
        e eVar = (e) this.f6739d.getLayoutParams();
        int iMax = Math.max(0, this.f6739d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f6739d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f6739d.getMeasuredState());
        boolean z8 = (AbstractC0985p0.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z8) {
            measuredHeight = this.f6736a;
            if (this.f6744i && this.f6739d.getTabContainer() != null) {
                measuredHeight += this.f6736a;
            }
        } else {
            measuredHeight = this.f6739d.getVisibility() != 8 ? this.f6739d.getMeasuredHeight() : 0;
        }
        this.f6751p.set(this.f6749n);
        C0950d1 c0950d1 = this.f6756u;
        this.f6758w = c0950d1;
        if (this.f6743h || z8) {
            this.f6758w = new C0950d1.b(this.f6758w).setSystemWindowInsets(androidx.core.graphics.b.of(c0950d1.getSystemWindowInsetLeft(), this.f6758w.getSystemWindowInsetTop() + measuredHeight, this.f6758w.getSystemWindowInsetRight(), this.f6758w.getSystemWindowInsetBottom())).build();
        } else {
            Rect rect = this.f6751p;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f6758w = c0950d1.inset(0, measuredHeight, 0, 0);
        }
        b(this.f6738c, this.f6751p, true, true, true, true);
        if (!this.f6759x.equals(this.f6758w)) {
            C0950d1 c0950d12 = this.f6758w;
            this.f6759x = c0950d12;
            AbstractC0985p0.dispatchApplyWindowInsets(this.f6738c, c0950d12);
        }
        measureChildWithMargins(this.f6738c, i8, 0, i9, 0);
        e eVar2 = (e) this.f6738c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f6738c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f6738c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f6738c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (!this.f6745j || !z8) {
            return false;
        }
        if (k(f9)) {
            a();
        } else {
            j();
        }
        this.f6746k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
    }

    @Override // androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        onNestedScroll(view, i8, i9, i10, i11, i12);
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onNestedScrollAccepted(View view, View view2, int i8, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i8);
        }
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public boolean onStartNestedScroll(View view, View view2, int i8, int i9) {
        return i9 == 0 && onStartNestedScroll(view, view2, i8);
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onStopNestedScroll(View view, int i8) {
        if (i8 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i8) {
        super.onWindowSystemUiVisibilityChanged(i8);
        i();
        int i9 = this.f6748m ^ i8;
        this.f6748m = i8;
        boolean z8 = (i8 & 4) == 0;
        boolean z9 = (i8 & 256) != 0;
        d dVar = this.f6760y;
        if (dVar != null) {
            dVar.enableContentAnimations(!z9);
            if (z8 || !z9) {
                this.f6760y.showForSystem();
            } else {
                this.f6760y.hideForSystem();
            }
        }
        if ((i9 & 256) == 0 || this.f6760y == null) {
            return;
        }
        AbstractC0985p0.requestApplyInsets(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f6737b = i8;
        d dVar = this.f6760y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i8);
        }
    }

    @Override // androidx.appcompat.widget.O
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        i();
        this.f6740e.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.O
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        i();
        this.f6740e.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i8) {
        e();
        this.f6739d.setTranslationY(-Math.max(0, Math.min(i8, this.f6739d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f6760y = dVar;
        if (getWindowToken() != null) {
            this.f6760y.onWindowVisibilityChanged(this.f6737b);
            int i8 = this.f6748m;
            if (i8 != 0) {
                onWindowSystemUiVisibilityChanged(i8);
                AbstractC0985p0.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.f6744i = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f6745j) {
            this.f6745j = z8;
            if (z8) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.O
    public void setIcon(int i8) {
        i();
        this.f6740e.setIcon(i8);
    }

    @Override // androidx.appcompat.widget.O
    public void setLogo(int i8) {
        i();
        this.f6740e.setLogo(i8);
    }

    @Override // androidx.appcompat.widget.O
    public void setMenu(Menu menu, k.a aVar) {
        i();
        this.f6740e.setMenu(menu, aVar);
    }

    @Override // androidx.appcompat.widget.O
    public void setMenuPrepared() {
        i();
        this.f6740e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z8) {
        this.f6743h = z8;
        this.f6742g = z8 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z8) {
    }

    @Override // androidx.appcompat.widget.O
    public void setUiOptions(int i8) {
    }

    @Override // androidx.appcompat.widget.O
    public void setWindowCallback(Window.Callback callback) {
        i();
        this.f6740e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.O
    public void setWindowTitle(CharSequence charSequence) {
        i();
        this.f6740e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.O
    public boolean showOverflowMenu() {
        i();
        return this.f6740e.showOverflowMenu();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6737b = 0;
        this.f6749n = new Rect();
        this.f6750o = new Rect();
        this.f6751p = new Rect();
        this.f6752q = new Rect();
        this.f6753r = new Rect();
        this.f6754s = new Rect();
        this.f6755t = new Rect();
        C0950d1 c0950d1 = C0950d1.CONSUMED;
        this.f6756u = c0950d1;
        this.f6757v = c0950d1;
        this.f6758w = c0950d1;
        this.f6759x = c0950d1;
        this.f6732B = new a();
        this.f6733C = new b();
        this.f6734D = new c();
        f(context);
        this.f6735E = new androidx.core.view.V(this);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(view, i8, i9, iArr);
        }
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i8, i9, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        this.f6735E.onNestedScrollAccepted(view, view2, i8);
        this.f6747l = getActionBarHideOffset();
        e();
        d dVar = this.f6760y;
        if (dVar != null) {
            dVar.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        if ((i8 & 2) == 0 || this.f6739d.getVisibility() != 0) {
            return false;
        }
        return this.f6745j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public void onStopNestedScroll(View view) {
        if (this.f6745j && !this.f6746k) {
            if (this.f6747l <= this.f6739d.getHeight()) {
                h();
            } else {
                g();
            }
        }
        d dVar = this.f6760y;
        if (dVar != null) {
            dVar.onContentScrollStopped();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.U, androidx.core.view.S, androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        int i12 = this.f6747l + i9;
        this.f6747l = i12;
        setActionBarHideOffset(i12);
    }

    @Override // androidx.appcompat.widget.O
    public void setIcon(Drawable drawable) {
        i();
        this.f6740e.setIcon(drawable);
    }
}
