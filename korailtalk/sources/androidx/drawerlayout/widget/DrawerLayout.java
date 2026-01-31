package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import c0.AbstractC1087a;
import d0.C5301c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f9362A;

    /* renamed from: B, reason: collision with root package name */
    private CharSequence f9363B;

    /* renamed from: C, reason: collision with root package name */
    private Object f9364C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f9365D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f9366E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f9367F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f9368G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f9369H;

    /* renamed from: I, reason: collision with root package name */
    private final ArrayList f9370I;

    /* renamed from: J, reason: collision with root package name */
    private Rect f9371J;

    /* renamed from: K, reason: collision with root package name */
    private Matrix f9372K;

    /* renamed from: a, reason: collision with root package name */
    private final c f9373a;

    /* renamed from: b, reason: collision with root package name */
    private float f9374b;

    /* renamed from: c, reason: collision with root package name */
    private int f9375c;

    /* renamed from: d, reason: collision with root package name */
    private int f9376d;

    /* renamed from: e, reason: collision with root package name */
    private float f9377e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f9378f;

    /* renamed from: g, reason: collision with root package name */
    private final C5301c f9379g;

    /* renamed from: h, reason: collision with root package name */
    private final C5301c f9380h;

    /* renamed from: i, reason: collision with root package name */
    private final g f9381i;

    /* renamed from: j, reason: collision with root package name */
    private final g f9382j;

    /* renamed from: k, reason: collision with root package name */
    private int f9383k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9384l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9385m;

    /* renamed from: n, reason: collision with root package name */
    private int f9386n;

    /* renamed from: o, reason: collision with root package name */
    private int f9387o;

    /* renamed from: p, reason: collision with root package name */
    private int f9388p;

    /* renamed from: q, reason: collision with root package name */
    private int f9389q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9390r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9391s;

    /* renamed from: t, reason: collision with root package name */
    private d f9392t;

    /* renamed from: u, reason: collision with root package name */
    private List f9393u;

    /* renamed from: v, reason: collision with root package name */
    private float f9394v;

    /* renamed from: w, reason: collision with root package name */
    private float f9395w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f9396x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f9397y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f9398z;

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f9358L = {R.attr.colorPrimaryDark};

    /* renamed from: M, reason: collision with root package name */
    static final int[] f9359M = {R.attr.layout_gravity};

    /* renamed from: N, reason: collision with root package name */
    static final boolean f9360N = true;

    /* renamed from: O, reason: collision with root package name */
    private static final boolean f9361O = true;

    class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class b extends C0923a {

        /* renamed from: d, reason: collision with root package name */
        private final Rect f9400d = new Rect();

        b() {
        }

        private void e(H h8, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (DrawerLayout.r(childAt)) {
                    h8.addChild(childAt);
                }
            }
        }

        private void f(H h8, H h9) {
            Rect rect = this.f9400d;
            h9.getBoundsInParent(rect);
            h8.setBoundsInParent(rect);
            h9.getBoundsInScreen(rect);
            h8.setBoundsInScreen(rect);
            h8.setVisibleToUser(h9.isVisibleToUser());
            h8.setPackageName(h9.getPackageName());
            h8.setClassName(h9.getClassName());
            h8.setContentDescription(h9.getContentDescription());
            h8.setEnabled(h9.isEnabled());
            h8.setClickable(h9.isClickable());
            h8.setFocusable(h9.isFocusable());
            h8.setFocused(h9.isFocused());
            h8.setAccessibilityFocused(h9.isAccessibilityFocused());
            h8.setSelected(h9.isSelected());
            h8.setLongClickable(h9.isLongClickable());
            h8.addAction(h9.getActions());
        }

        @Override // androidx.core.view.C0923a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewJ = DrawerLayout.this.j();
            if (viewJ == null) {
                return true;
            }
            CharSequence drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.k(viewJ));
            if (drawerTitle == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            if (DrawerLayout.f9360N) {
                super.onInitializeAccessibilityNodeInfo(view, h8);
            } else {
                H hObtain = H.obtain(h8);
                super.onInitializeAccessibilityNodeInfo(view, hObtain);
                h8.setSource(view);
                Object parentForAccessibility = AbstractC0985p0.getParentForAccessibility(view);
                if (parentForAccessibility instanceof View) {
                    h8.setParent((View) parentForAccessibility);
                }
                f(h8, hObtain);
                hObtain.recycle();
                e(h8, (ViewGroup) view);
            }
            h8.setClassName(DrawerLayout.class.getName());
            h8.setFocusable(false);
            h8.setFocused(false);
            h8.removeAction(H.a.ACTION_FOCUS);
            h8.removeAction(H.a.ACTION_CLEAR_FOCUS);
        }

        @Override // androidx.core.view.C0923a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f9360N || DrawerLayout.r(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class c extends C0923a {
        c() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            if (DrawerLayout.r(view)) {
                return;
            }
            h8.setParent(null);
        }
    }

    public interface d {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f8);

        void onDrawerStateChanged(int i8);
    }

    private class g extends C5301c.AbstractC0272c {

        /* renamed from: a, reason: collision with root package name */
        private final int f9410a;

        /* renamed from: b, reason: collision with root package name */
        private C5301c f9411b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f9412c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.b();
            }
        }

        g(int i8) {
            this.f9410a = i8;
        }

        private void a() {
            View viewH = DrawerLayout.this.h(this.f9410a == 3 ? 5 : 3);
            if (viewH != null) {
                DrawerLayout.this.closeDrawer(viewH);
            }
        }

        void b() {
            View viewH;
            int width;
            int edgeSize = this.f9411b.getEdgeSize();
            boolean z8 = this.f9410a == 3;
            if (z8) {
                viewH = DrawerLayout.this.h(3);
                width = (viewH != null ? -viewH.getWidth() : 0) + edgeSize;
            } else {
                viewH = DrawerLayout.this.h(5);
                width = DrawerLayout.this.getWidth() - edgeSize;
            }
            if (viewH != null) {
                if (((!z8 || viewH.getLeft() >= width) && (z8 || viewH.getLeft() <= width)) || DrawerLayout.this.getDrawerLockMode(viewH) != 0) {
                    return;
                }
                e eVar = (e) viewH.getLayoutParams();
                this.f9411b.smoothSlideViewTo(viewH, width, viewH.getTop());
                eVar.f9403b = true;
                DrawerLayout.this.invalidate();
                a();
                DrawerLayout.this.a();
            }
        }

        @Override // d0.C5301c.AbstractC0272c
        public int clampViewPositionHorizontal(View view, int i8, int i9) {
            if (DrawerLayout.this.b(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i8, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i8, width));
        }

        @Override // d0.C5301c.AbstractC0272c
        public int clampViewPositionVertical(View view, int i8, int i9) {
            return view.getTop();
        }

        @Override // d0.C5301c.AbstractC0272c
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.t(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onEdgeDragStarted(int i8, int i9) {
            View viewH = (i8 & 1) == 1 ? DrawerLayout.this.h(3) : DrawerLayout.this.h(5);
            if (viewH == null || DrawerLayout.this.getDrawerLockMode(viewH) != 0) {
                return;
            }
            this.f9411b.captureChildView(viewH, i9);
        }

        @Override // d0.C5301c.AbstractC0272c
        public boolean onEdgeLock(int i8) {
            return false;
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onEdgeTouched(int i8, int i9) {
            DrawerLayout.this.postDelayed(this.f9412c, 160L);
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewCaptured(View view, int i8) {
            ((e) view.getLayoutParams()).f9403b = false;
            a();
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewDragStateChanged(int i8) {
            DrawerLayout.this.C(this.f9410a, i8, this.f9411b.getCapturedView());
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewPositionChanged(View view, int i8, int i9, int i10, int i11) {
            float width = (DrawerLayout.this.b(view, 3) ? i8 + r3 : DrawerLayout.this.getWidth() - i8) / view.getWidth();
            DrawerLayout.this.A(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewReleased(View view, float f8, float f9) {
            int i8;
            float fL = DrawerLayout.this.l(view);
            int width = view.getWidth();
            if (DrawerLayout.this.b(view, 3)) {
                i8 = (f8 > 0.0f || (f8 == 0.0f && fL > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f8 < 0.0f || (f8 == 0.0f && fL > 0.5f)) {
                    width2 -= width;
                }
                i8 = width2;
            }
            this.f9411b.settleCapturedViewAt(i8, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public void removeCallbacks() {
            DrawerLayout.this.removeCallbacks(this.f9412c);
        }

        public void setDragger(C5301c c5301c) {
            this.f9411b = c5301c;
        }

        @Override // d0.C5301c.AbstractC0272c
        public boolean tryCaptureView(View view, int i8) {
            return DrawerLayout.this.t(view) && DrawerLayout.this.b(view, this.f9410a) && DrawerLayout.this.getDrawerLockMode(view) == 0;
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    private void B(View view, boolean z8) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((z8 || t(childAt)) && !(z8 && childAt == view)) {
                AbstractC0985p0.setImportantForAccessibility(childAt, 4);
            } else {
                AbstractC0985p0.setImportantForAccessibility(childAt, 1);
            }
        }
    }

    private boolean g(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM = m(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM);
            motionEventM.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent m(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f9372K == null) {
                this.f9372K = new Matrix();
            }
            matrix.invert(this.f9372K);
            motionEventObtain.transform(this.f9372K);
        }
        return motionEventObtain;
    }

    static String n(int i8) {
        return (i8 & 3) == 3 ? "LEFT" : (i8 & 5) == 5 ? "RIGHT" : Integer.toHexString(i8);
    }

    private static boolean o(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean p() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (((e) getChildAt(i8).getLayoutParams()).f9403b) {
                return true;
            }
        }
        return false;
    }

    private boolean q() {
        return j() != null;
    }

    static boolean r(View view) {
        return (AbstractC0985p0.getImportantForAccessibility(view) == 4 || AbstractC0985p0.getImportantForAccessibility(view) == 2) ? false : true;
    }

    private boolean u(float f8, float f9, View view) {
        if (this.f9371J == null) {
            this.f9371J = new Rect();
        }
        view.getHitRect(this.f9371J);
        return this.f9371J.contains((int) f8, (int) f9);
    }

    private boolean v(Drawable drawable, int i8) {
        if (drawable == null || !androidx.core.graphics.drawable.a.isAutoMirrored(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.setLayoutDirection(drawable, i8);
        return true;
    }

    private Drawable x() {
        int layoutDirection = AbstractC0985p0.getLayoutDirection(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.f9366E;
            if (drawable != null) {
                v(drawable, layoutDirection);
                return this.f9366E;
            }
        } else {
            Drawable drawable2 = this.f9367F;
            if (drawable2 != null) {
                v(drawable2, layoutDirection);
                return this.f9367F;
            }
        }
        return this.f9368G;
    }

    private Drawable y() {
        int layoutDirection = AbstractC0985p0.getLayoutDirection(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.f9367F;
            if (drawable != null) {
                v(drawable, layoutDirection);
                return this.f9367F;
            }
        } else {
            Drawable drawable2 = this.f9366E;
            if (drawable2 != null) {
                v(drawable2, layoutDirection);
                return this.f9366E;
            }
        }
        return this.f9369H;
    }

    private void z() {
        if (f9361O) {
            return;
        }
        this.f9397y = x();
        this.f9398z = y();
    }

    void A(View view, float f8) {
        e eVar = (e) view.getLayoutParams();
        if (f8 == eVar.f9402a) {
            return;
        }
        eVar.f9402a = f8;
        f(view, f8);
    }

    void C(int i8, int i9, View view) {
        int i10;
        int viewDragState = this.f9379g.getViewDragState();
        int viewDragState2 = this.f9380h.getViewDragState();
        if (viewDragState == 1 || viewDragState2 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (viewDragState != 2 && viewDragState2 != 2) {
                i10 = 0;
            }
        }
        if (view != null && i9 == 0) {
            float f8 = ((e) view.getLayoutParams()).f9402a;
            if (f8 == 0.0f) {
                d(view);
            } else if (f8 == 1.0f) {
                e(view);
            }
        }
        if (i10 != this.f9383k) {
            this.f9383k = i10;
            List list = this.f9393u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((d) this.f9393u.get(size)).onDrawerStateChanged(i10);
                }
            }
        }
    }

    void a() {
        if (this.f9391s) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f9391s = true;
    }

    public void addDrawerListener(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f9393u == null) {
            this.f9393u = new ArrayList();
        }
        this.f9393u.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!t(childAt)) {
                this.f9370I.add(childAt);
            } else if (isDrawerOpen(childAt)) {
                childAt.addFocusables(arrayList, i8, i9);
                z8 = true;
            }
        }
        if (!z8) {
            int size = this.f9370I.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) this.f9370I.get(i11);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i8, i9);
                }
            }
        }
        this.f9370I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        if (i() != null || t(view)) {
            AbstractC0985p0.setImportantForAccessibility(view, 4);
        } else {
            AbstractC0985p0.setImportantForAccessibility(view, 1);
        }
        if (f9360N) {
            return;
        }
        AbstractC0985p0.setAccessibilityDelegate(view, this.f9373a);
    }

    boolean b(View view, int i8) {
        return (k(view) & i8) == i8;
    }

    void c(boolean z8) {
        int childCount = getChildCount();
        boolean zSmoothSlideViewTo = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            e eVar = (e) childAt.getLayoutParams();
            if (t(childAt) && (!z8 || eVar.f9403b)) {
                zSmoothSlideViewTo |= b(childAt, 3) ? this.f9379g.smoothSlideViewTo(childAt, -childAt.getWidth(), childAt.getTop()) : this.f9380h.smoothSlideViewTo(childAt, getWidth(), childAt.getTop());
                eVar.f9403b = false;
            }
        }
        this.f9381i.removeCallbacks();
        this.f9382j.removeCallbacks();
        if (zSmoothSlideViewTo) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        c(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i8 = 0; i8 < childCount; i8++) {
            fMax = Math.max(fMax, ((e) getChildAt(i8).getLayoutParams()).f9402a);
        }
        this.f9377e = fMax;
        boolean zContinueSettling = this.f9379g.continueSettling(true);
        boolean zContinueSettling2 = this.f9380h.continueSettling(true);
        if (zContinueSettling || zContinueSettling2) {
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    void d(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f9404c & 1) == 1) {
            eVar.f9404c = 0;
            List list = this.f9393u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((d) this.f9393u.get(size)).onDrawerClosed(view);
                }
            }
            B(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f9377e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt = getChildAt(i8);
            if (u(x8, y8, childAt) && !s(childAt) && g(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j8) {
        int height = getHeight();
        boolean zS = s(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i8 = 0;
        if (zS) {
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && childAt.getVisibility() == 0 && o(childAt) && t(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i9) {
                            i9 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i9, 0, width, getHeight());
            i8 = i9;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j8);
        canvas.restoreToCount(iSave);
        float f8 = this.f9377e;
        if (f8 > 0.0f && zS) {
            this.f9378f.setColor((this.f9376d & AbstractC0985p0.MEASURED_SIZE_MASK) | (((int) ((((-16777216) & r2) >>> 24) * f8)) << 24));
            canvas.drawRect(i8, 0.0f, width, getHeight(), this.f9378f);
        } else if (this.f9397y != null && b(view, 3)) {
            int intrinsicWidth = this.f9397y.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f9379g.getEdgeSize(), 1.0f));
            this.f9397y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f9397y.setAlpha((int) (fMax * 255.0f));
            this.f9397y.draw(canvas);
        } else if (this.f9398z != null && b(view, 5)) {
            int intrinsicWidth2 = this.f9398z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f9380h.getEdgeSize(), 1.0f));
            this.f9398z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f9398z.setAlpha((int) (fMax2 * 255.0f));
            this.f9398z.draw(canvas);
        }
        return zDrawChild;
    }

    void e(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f9404c & 1) == 0) {
            eVar.f9404c = 1;
            List list = this.f9393u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((d) this.f9393u.get(size)).onDrawerOpened(view);
                }
            }
            B(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void f(View view, float f8) {
        List list = this.f9393u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((d) this.f9393u.get(size)).onDrawerSlide(view, f8);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f9361O) {
            return this.f9374b;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i8) {
        int layoutDirection = AbstractC0985p0.getLayoutDirection(this);
        if (i8 == 3) {
            int i9 = this.f9386n;
            if (i9 != 3) {
                return i9;
            }
            int i10 = layoutDirection == 0 ? this.f9388p : this.f9389q;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i8 == 5) {
            int i11 = this.f9387o;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.f9389q : this.f9388p;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i8 == 8388611) {
            int i13 = this.f9388p;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.f9386n : this.f9387o;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i8 != 8388613) {
            return 0;
        }
        int i15 = this.f9389q;
        if (i15 != 3) {
            return i15;
        }
        int i16 = layoutDirection == 0 ? this.f9387o : this.f9386n;
        if (i16 != 3) {
            return i16;
        }
        return 0;
    }

    public CharSequence getDrawerTitle(int i8) {
        int absoluteGravity = A.getAbsoluteGravity(i8, AbstractC0985p0.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            return this.f9362A;
        }
        if (absoluteGravity == 5) {
            return this.f9363B;
        }
        return null;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f9396x;
    }

    View h(int i8) {
        int absoluteGravity = A.getAbsoluteGravity(i8, AbstractC0985p0.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if ((k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    View i() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((((e) childAt.getLayoutParams()).f9404c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public boolean isDrawerOpen(View view) {
        if (t(view)) {
            return (((e) view.getLayoutParams()).f9404c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerVisible(View view) {
        if (t(view)) {
            return ((e) view.getLayoutParams()).f9402a > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    View j() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (t(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    int k(View view) {
        return A.getAbsoluteGravity(((e) view.getLayoutParams()).gravity, AbstractC0985p0.getLayoutDirection(this));
    }

    float l(View view) {
        return ((e) view.getLayoutParams()).f9402a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9385m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9385m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9365D || this.f9396x == null) {
            return;
        }
        Object obj = this.f9364C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f9396x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f9396x.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            d0.c r1 = r6.f9379g
            boolean r1 = r1.shouldInterceptTouchEvent(r7)
            d0.c r2 = r6.f9380h
            boolean r2 = r2.shouldInterceptTouchEvent(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            d0.c r7 = r6.f9379g
            boolean r7 = r7.checkTouchSlop(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f9381i
            r7.removeCallbacks()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f9382j
            r7.removeCallbacks()
            goto L38
        L31:
            r6.c(r2)
            r6.f9390r = r3
            r6.f9391s = r3
        L38:
            r7 = r3
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f9394v = r0
            r6.f9395w = r7
            float r4 = r6.f9377e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            d0.c r4 = r6.f9379g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.findTopChildUnder(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.s(r7)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r3
        L60:
            r6.f9390r = r3
            r6.f9391s = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.p()
            if (r7 != 0) goto L74
            boolean r7 = r6.f9391s
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (i8 != 4 || !q()) {
            return super.onKeyDown(i8, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return super.onKeyUp(i8, keyEvent);
        }
        View viewJ = j();
        if (viewJ != null && getDrawerLockMode(viewJ) == 0) {
            closeDrawers();
        }
        return viewJ != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        float f8;
        int i12;
        boolean z9 = true;
        this.f9384l = true;
        int i13 = i10 - i8;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (s(childAt)) {
                    int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i15, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i15, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f9 = measuredWidth;
                        i12 = (-measuredWidth) + ((int) (eVar.f9402a * f9));
                        f8 = (measuredWidth + i12) / f9;
                    } else {
                        float f10 = measuredWidth;
                        f8 = (i13 - r11) / f10;
                        i12 = i13 - ((int) (eVar.f9402a * f10));
                    }
                    boolean z10 = f8 != eVar.f9402a ? z9 : false;
                    int i16 = eVar.gravity & 112;
                    if (i16 == 16) {
                        int i17 = i11 - i9;
                        int i18 = (i17 - measuredHeight) / 2;
                        int i19 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i18 < i19) {
                            i18 = i19;
                        } else {
                            int i20 = i18 + measuredHeight;
                            int i21 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i20 > i17 - i21) {
                                i18 = (i17 - i21) - measuredHeight;
                            }
                        }
                        childAt.layout(i12, i18, measuredWidth + i12, measuredHeight + i18);
                    } else if (i16 != 80) {
                        int i22 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i12, i22, measuredWidth + i12, measuredHeight + i22);
                    } else {
                        int i23 = i11 - i9;
                        childAt.layout(i12, (i23 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i12, i23 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z10) {
                        A(childAt, f8);
                    }
                    int i24 = eVar.f9402a > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i24) {
                        childAt.setVisibility(i24);
                    }
                }
            }
            i14++;
            z9 = true;
        }
        this.f9384l = false;
        this.f9385m = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z8 = this.f9364C != null && AbstractC0985p0.getFitsSystemWindows(this);
        int layoutDirection = AbstractC0985p0.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z9 = false;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z8) {
                    int absoluteGravity = A.getAbsoluteGravity(eVar.gravity, layoutDirection);
                    if (AbstractC0985p0.getFitsSystemWindows(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f9364C;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f9364C;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (s(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else {
                    if (!t(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i10 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f9361O) {
                        float elevation = AbstractC0985p0.getElevation(childAt);
                        float f8 = this.f9374b;
                        if (elevation != f8) {
                            AbstractC0985p0.setElevation(childAt, f8);
                        }
                    }
                    int iK = k(childAt) & 7;
                    boolean z11 = iK == 3;
                    if ((z11 && z9) || (!z11 && z10)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + n(iK) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z11) {
                        z9 = true;
                    } else {
                        z10 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i8, this.f9375c + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i9, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewH;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        int i8 = fVar.f9405b;
        if (i8 != 0 && (viewH = h(i8)) != null) {
            openDrawer(viewH);
        }
        int i9 = fVar.f9406c;
        if (i9 != 3) {
            setDrawerLockMode(i9, 3);
        }
        int i10 = fVar.f9407d;
        if (i10 != 3) {
            setDrawerLockMode(i10, 5);
        }
        int i11 = fVar.f9408e;
        if (i11 != 3) {
            setDrawerLockMode(i11, A.START);
        }
        int i12 = fVar.f9409f;
        if (i12 != 3) {
            setDrawerLockMode(i12, A.END);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        z();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            e eVar = (e) getChildAt(i8).getLayoutParams();
            int i9 = eVar.f9404c;
            boolean z8 = i9 == 1;
            boolean z9 = i9 == 2;
            if (z8 || z9) {
                fVar.f9405b = eVar.gravity;
                break;
            }
        }
        fVar.f9406c = this.f9386n;
        fVar.f9407d = this.f9387o;
        fVar.f9408e = this.f9388p;
        fVar.f9409f = this.f9389q;
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            d0.c r0 = r6.f9379g
            r0.processTouchEvent(r7)
            d0.c r0 = r6.f9380h
            r0.processTouchEvent(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L66
            if (r0 == r2) goto L22
            r7 = 3
            if (r0 == r7) goto L1a
            goto L76
        L1a:
            r6.c(r2)
            r6.f9390r = r1
            r6.f9391s = r1
            goto L76
        L22:
            float r0 = r7.getX()
            float r7 = r7.getY()
            d0.c r3 = r6.f9379g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.findTopChildUnder(r4, r5)
            if (r3 == 0) goto L5f
            boolean r3 = r6.s(r3)
            if (r3 == 0) goto L5f
            float r3 = r6.f9394v
            float r0 = r0 - r3
            float r3 = r6.f9395w
            float r7 = r7 - r3
            d0.c r3 = r6.f9379g
            int r3 = r3.getTouchSlop()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5f
            android.view.View r7 = r6.i()
            if (r7 == 0) goto L5f
            int r7 = r6.getDrawerLockMode(r7)
            r0 = 2
            if (r7 != r0) goto L5d
            goto L5f
        L5d:
            r7 = r1
            goto L60
        L5f:
            r7 = r2
        L60:
            r6.c(r7)
            r6.f9390r = r1
            goto L76
        L66:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f9394v = r0
            r6.f9395w = r7
            r6.f9390r = r1
            r6.f9391s = r1
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(d dVar) {
        List list;
        if (dVar == null || (list = this.f9393u) == null) {
            return;
        }
        list.remove(dVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        this.f9390r = z8;
        if (z8) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f9384l) {
            return;
        }
        super.requestLayout();
    }

    boolean s(View view) {
        return ((e) view.getLayoutParams()).gravity == 0;
    }

    public void setChildInsets(Object obj, boolean z8) {
        this.f9364C = obj;
        this.f9365D = z8;
        setWillNotDraw(!z8 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f8) {
        this.f9374b = f8;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (t(childAt)) {
                AbstractC0985p0.setElevation(childAt, this.f9374b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f9392t;
        if (dVar2 != null) {
            removeDrawerListener(dVar2);
        }
        if (dVar != null) {
            addDrawerListener(dVar);
        }
        this.f9392t = dVar;
    }

    public void setDrawerLockMode(int i8) {
        setDrawerLockMode(i8, 3);
        setDrawerLockMode(i8, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i8) {
        if (f9361O) {
            return;
        }
        if ((i8 & A.START) == 8388611) {
            this.f9366E = drawable;
        } else if ((i8 & A.END) == 8388613) {
            this.f9367F = drawable;
        } else if ((i8 & 3) == 3) {
            this.f9368G = drawable;
        } else if ((i8 & 5) != 5) {
            return;
        } else {
            this.f9369H = drawable;
        }
        z();
        invalidate();
    }

    public void setDrawerTitle(int i8, CharSequence charSequence) {
        int absoluteGravity = A.getAbsoluteGravity(i8, AbstractC0985p0.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            this.f9362A = charSequence;
        } else if (absoluteGravity == 5) {
            this.f9363B = charSequence;
        }
    }

    public void setScrimColor(int i8) {
        this.f9376d = i8;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f9396x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i8) {
        this.f9396x = new ColorDrawable(i8);
        invalidate();
    }

    boolean t(View view) {
        int absoluteGravity = A.getAbsoluteGravity(((e) view.getLayoutParams()).gravity, AbstractC0985p0.getLayoutDirection(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    void w(View view, float f8) {
        float fL = l(view);
        float width = view.getWidth();
        int i8 = ((int) (width * f8)) - ((int) (fL * width));
        if (!b(view, 3)) {
            i8 = -i8;
        }
        view.offsetLeftAndRight(i8);
        A(view, f8);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void closeDrawer(View view, boolean z8) {
        if (!t(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f9385m) {
            eVar.f9402a = 0.0f;
            eVar.f9404c = 0;
        } else if (z8) {
            eVar.f9404c |= 4;
            if (b(view, 3)) {
                this.f9379g.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
            } else {
                this.f9380h.smoothSlideViewTo(view, getWidth(), view.getTop());
            }
        } else {
            w(view, 0.0f);
            C(eVar.gravity, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void openDrawer(View view, boolean z8) {
        if (!t(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f9385m) {
            eVar.f9402a = 1.0f;
            eVar.f9404c = 1;
            B(view, true);
        } else if (z8) {
            eVar.f9404c |= 2;
            if (b(view, 3)) {
                this.f9379g.smoothSlideViewTo(view, 0, view.getTop());
            } else {
                this.f9380h.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            w(view, 1.0f);
            C(eVar.gravity, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f9373a = new c();
        this.f9376d = -1728053248;
        this.f9378f = new Paint();
        this.f9385m = true;
        this.f9386n = 3;
        this.f9387o = 3;
        this.f9388p = 3;
        this.f9389q = 3;
        this.f9366E = null;
        this.f9367F = null;
        this.f9368G = null;
        this.f9369H = null;
        setDescendantFocusability(262144);
        float f8 = getResources().getDisplayMetrics().density;
        this.f9375c = (int) ((64.0f * f8) + 0.5f);
        float f9 = 400.0f * f8;
        g gVar = new g(3);
        this.f9381i = gVar;
        g gVar2 = new g(5);
        this.f9382j = gVar2;
        C5301c c5301cCreate = C5301c.create(this, 1.0f, gVar);
        this.f9379g = c5301cCreate;
        c5301cCreate.setEdgeTrackingEnabled(1);
        c5301cCreate.setMinVelocity(f9);
        gVar.setDragger(c5301cCreate);
        C5301c c5301cCreate2 = C5301c.create(this, 1.0f, gVar2);
        this.f9380h = c5301cCreate2;
        c5301cCreate2.setEdgeTrackingEnabled(2);
        c5301cCreate2.setMinVelocity(f9);
        gVar2.setDragger(c5301cCreate2);
        setFocusableInTouchMode(true);
        AbstractC0985p0.setImportantForAccessibility(this, 1);
        AbstractC0985p0.setAccessibilityDelegate(this, new b());
        setMotionEventSplittingEnabled(false);
        if (AbstractC0985p0.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9358L);
            try {
                this.f9396x = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f9374b = f8 * 10.0f;
        this.f9370I = new ArrayList();
    }

    public void setDrawerLockMode(int i8, int i9) {
        View viewH;
        int absoluteGravity = A.getAbsoluteGravity(i9, AbstractC0985p0.getLayoutDirection(this));
        if (i9 == 3) {
            this.f9386n = i8;
        } else if (i9 == 5) {
            this.f9387o = i8;
        } else if (i9 == 8388611) {
            this.f9388p = i8;
        } else if (i9 == 8388613) {
            this.f9389q = i8;
        }
        if (i8 != 0) {
            (absoluteGravity == 3 ? this.f9379g : this.f9380h).cancel();
        }
        if (i8 != 1) {
            if (i8 == 2 && (viewH = h(absoluteGravity)) != null) {
                openDrawer(viewH);
                return;
            }
            return;
        }
        View viewH2 = h(absoluteGravity);
        if (viewH2 != null) {
            closeDrawer(viewH2);
        }
    }

    public void setStatusBarBackground(int i8) {
        this.f9396x = i8 != 0 ? androidx.core.content.a.getDrawable(getContext(), i8) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i8) {
        View viewH = h(i8);
        if (viewH != null) {
            return isDrawerVisible(viewH);
        }
        return false;
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        float f9402a;

        /* renamed from: b, reason: collision with root package name */
        boolean f9403b;

        /* renamed from: c, reason: collision with root package name */
        int f9404c;
        public int gravity;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f9359M);
            this.gravity = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public e(int i8, int i9) {
            super(i8, i9);
            this.gravity = 0;
        }

        public e(int i8, int i9, int i10) {
            this(i8, i9);
            this.gravity = i10;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.gravity = 0;
            this.gravity = eVar.gravity;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    public boolean isDrawerOpen(int i8) {
        View viewH = h(i8);
        if (viewH != null) {
            return isDrawerOpen(viewH);
        }
        return false;
    }

    protected static class f extends AbstractC1087a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f9405b;

        /* renamed from: c, reason: collision with root package name */
        int f9406c;

        /* renamed from: d, reason: collision with root package name */
        int f9407d;

        /* renamed from: e, reason: collision with root package name */
        int f9408e;

        /* renamed from: f, reason: collision with root package name */
        int f9409f;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i8) {
                return new f[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9405b = 0;
            this.f9405b = parcel.readInt();
            this.f9406c = parcel.readInt();
            this.f9407d = parcel.readInt();
            this.f9408e = parcel.readInt();
            this.f9409f = parcel.readInt();
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f9405b);
            parcel.writeInt(this.f9406c);
            parcel.writeInt(this.f9407d);
            parcel.writeInt(this.f9408e);
            parcel.writeInt(this.f9409f);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f9405b = 0;
        }
    }

    public void setDrawerShadow(int i8, int i9) {
        setDrawerShadow(androidx.core.content.a.getDrawable(getContext(), i8), i9);
    }

    public int getDrawerLockMode(View view) {
        if (t(view)) {
            return getDrawerLockMode(((e) view.getLayoutParams()).gravity);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i8, View view) {
        if (t(view)) {
            setDrawerLockMode(i8, ((e) view.getLayoutParams()).gravity);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i8) {
        closeDrawer(i8, true);
    }

    public void closeDrawer(int i8, boolean z8) {
        View viewH = h(i8);
        if (viewH != null) {
            closeDrawer(viewH, z8);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + n(i8));
    }

    public void openDrawer(int i8) {
        openDrawer(i8, true);
    }

    public void openDrawer(int i8, boolean z8) {
        View viewH = h(i8);
        if (viewH != null) {
            openDrawer(viewH, z8);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + n(i8));
    }
}
