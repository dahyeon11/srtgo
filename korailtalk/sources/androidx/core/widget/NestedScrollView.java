package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.C0996v;
import androidx.core.view.InterfaceC0943b0;
import androidx.core.view.InterfaceC0998w;
import androidx.core.view.M;
import androidx.core.view.O;
import androidx.core.view.Q;
import androidx.core.view.T;
import androidx.core.view.V;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.N;
import androidx.fragment.app.x;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements T, O, InterfaceC0943b0 {

    /* renamed from: B */
    private static final float f9289B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C */
    private static final a f9290C = new a();

    /* renamed from: D */
    private static final int[] f9291D = {R.attr.fillViewport};

    /* renamed from: A */
    C0996v f9292A;

    /* renamed from: a */
    private final float f9293a;

    /* renamed from: b */
    private long f9294b;

    /* renamed from: c */
    private final Rect f9295c;

    /* renamed from: d */
    private OverScroller f9296d;

    /* renamed from: e */
    private int f9297e;

    /* renamed from: f */
    private boolean f9298f;

    /* renamed from: g */
    private boolean f9299g;

    /* renamed from: h */
    private View f9300h;

    /* renamed from: i */
    private boolean f9301i;

    /* renamed from: j */
    private VelocityTracker f9302j;

    /* renamed from: k */
    private boolean f9303k;

    /* renamed from: l */
    private boolean f9304l;

    /* renamed from: m */
    private int f9305m;
    public EdgeEffect mEdgeGlowBottom;
    public EdgeEffect mEdgeGlowTop;

    /* renamed from: n */
    private int f9306n;

    /* renamed from: o */
    private int f9307o;

    /* renamed from: p */
    private int f9308p;

    /* renamed from: q */
    private final int[] f9309q;

    /* renamed from: r */
    private final int[] f9310r;

    /* renamed from: s */
    private int f9311s;

    /* renamed from: t */
    private int f9312t;

    /* renamed from: u */
    private e f9313u;

    /* renamed from: v */
    private final V f9314v;

    /* renamed from: w */
    private final Q f9315w;

    /* renamed from: x */
    private float f9316x;

    /* renamed from: y */
    private d f9317y;

    /* renamed from: z */
    final c f9318z;

    static class a extends C0923a {
        a() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            N.setMaxScrollX(accessibilityEvent, nestedScrollView.getScrollX());
            N.setMaxScrollY(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, h8);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            h8.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            h8.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                h8.addAction(H.a.ACTION_SCROLL_BACKWARD);
                h8.addAction(H.a.ACTION_SCROLL_UP);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                h8.addAction(H.a.ACTION_SCROLL_FORWARD);
                h8.addAction(H.a.ACTION_SCROLL_DOWN);
            }
        }

        @Override // androidx.core.view.C0923a
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            if (super.performAccessibilityAction(view, i8, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i8 != 4096) {
                if (i8 == 8192 || i8 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.H(0, iMax, true);
                    return true;
                }
                if (i8 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.H(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c implements InterfaceC0998w {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0998w
        public float getScaledScrollFactor() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC0998w
        public boolean startDifferentialMotionFling(float f8) {
            if (f8 == 0.0f) {
                return false;
            }
            stopDifferentialMotionFling();
            NestedScrollView.this.fling((int) f8);
            return true;
        }

        @Override // androidx.core.view.InterfaceC0998w
        public void stopDifferentialMotionFling() {
            NestedScrollView.this.f9296d.abortAnimation();
        }
    }

    public interface d {
        void onScrollChange(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11);
    }

    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int scrollPosition;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i8) {
                return new e[i8];
            }
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.scrollPosition);
        }

        e(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private boolean A(int i8, int i9, int i10) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z8 = false;
        boolean z9 = i8 == 33;
        View viewK = k(z9, i9, i10);
        if (viewK == null) {
            viewK = this;
        }
        if (i9 < scrollY || i10 > i11) {
            B(z9 ? i9 - scrollY : i10 - i11, 0, 1, true);
            z8 = true;
        }
        if (viewK != findFocus()) {
            viewK.requestFocus(i8);
        }
        return z8;
    }

    private int B(int i8, int i9, int i10, boolean z8) {
        int i11;
        int i12;
        VelocityTracker velocityTracker;
        if (i10 == 1) {
            startNestedScroll(2, i10);
        }
        boolean z9 = false;
        if (dispatchNestedPreScroll(0, i8, this.f9310r, this.f9309q, i10)) {
            i11 = i8 - this.f9310r[1];
            i12 = this.f9309q[1];
        } else {
            i11 = i8;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z10 = c() && !z8;
        boolean z11 = w(0, i11, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i10);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f9310r;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i11 - scrollY2, this.f9309q, i10, iArr);
        int i13 = i12 + this.f9309q[1];
        int i14 = i11 - this.f9310r[1];
        int i15 = scrollY + i14;
        if (i15 < 0) {
            if (z10) {
                androidx.core.widget.d.onPullDistance(this.mEdgeGlowTop, (-i14) / getHeight(), i9 / getWidth());
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i15 > scrollRange && z10) {
            androidx.core.widget.d.onPullDistance(this.mEdgeGlowBottom, i14 / getHeight(), 1.0f - (i9 / getWidth()));
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (this.mEdgeGlowTop.isFinished() && this.mEdgeGlowBottom.isFinished()) {
            z9 = z11;
        } else {
            postInvalidateOnAnimation();
        }
        if (z9 && i10 == 0 && (velocityTracker = this.f9302j) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            stopNestedScroll(i10);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return i13;
    }

    private void C(View view) {
        view.getDrawingRect(this.f9295c);
        offsetDescendantRectToMyCoords(view, this.f9295c);
        int iF = f(this.f9295c);
        if (iF != 0) {
            scrollBy(0, iF);
        }
    }

    private boolean D(Rect rect, boolean z8) {
        int iF = f(rect);
        boolean z9 = iF != 0;
        if (z9) {
            if (z8) {
                scrollBy(0, iF);
            } else {
                smoothScrollBy(0, iF);
            }
        }
        return z9;
    }

    private boolean E(EdgeEffect edgeEffect, int i8) {
        if (i8 > 0) {
            return true;
        }
        return l(-i8) < androidx.core.widget.d.getDistance(edgeEffect) * ((float) getHeight());
    }

    private void F(int i8, int i9, int i10, boolean z8) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9294b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9296d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, i10);
            z(z8);
        } else {
            if (!this.f9296d.isFinished()) {
                a();
            }
            scrollBy(i8, i9);
        }
        this.f9294b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean I(MotionEvent motionEvent) {
        boolean z8;
        if (androidx.core.widget.d.getDistance(this.mEdgeGlowTop) != 0.0f) {
            androidx.core.widget.d.onPullDistance(this.mEdgeGlowTop, 0.0f, motionEvent.getX() / getWidth());
            z8 = true;
        } else {
            z8 = false;
        }
        if (androidx.core.widget.d.getDistance(this.mEdgeGlowBottom) == 0.0f) {
            return z8;
        }
        androidx.core.widget.d.onPullDistance(this.mEdgeGlowBottom, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f9296d.abortAnimation();
        stopNestedScroll(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i8, int i9, int i10) {
        if (i9 >= i10 || i8 < 0) {
            return 0;
        }
        return i9 + i8 > i10 ? i10 - i9 : i8;
    }

    private void h(int i8) {
        if (i8 != 0) {
            if (this.f9304l) {
                smoothScrollBy(0, i8);
            } else {
                scrollBy(0, i8);
            }
        }
    }

    private boolean i(int i8) {
        if (androidx.core.widget.d.getDistance(this.mEdgeGlowTop) != 0.0f) {
            if (E(this.mEdgeGlowTop, i8)) {
                this.mEdgeGlowTop.onAbsorb(i8);
            } else {
                fling(-i8);
            }
        } else {
            if (androidx.core.widget.d.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                return false;
            }
            int i9 = -i8;
            if (E(this.mEdgeGlowBottom, i9)) {
                this.mEdgeGlowBottom.onAbsorb(i9);
            } else {
                fling(i9);
            }
        }
        return true;
    }

    private void j() {
        this.f9308p = -1;
        this.f9301i = false;
        x();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View k(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.k(boolean, int, int):android.view.View");
    }

    private float l(int i8) {
        double dLog = Math.log((Math.abs(i8) * 0.35f) / (this.f9293a * 0.015f));
        float f8 = f9289B;
        return (float) (this.f9293a * 0.015f * Math.exp((f8 / (f8 - 1.0d)) * dLog));
    }

    private boolean m(int i8, int i9) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i9 >= childAt.getTop() - scrollY && i9 < childAt.getBottom() - scrollY && i8 >= childAt.getLeft() && i8 < childAt.getRight();
    }

    private void n() {
        VelocityTracker velocityTracker = this.f9302j;
        if (velocityTracker == null) {
            this.f9302j = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void o() {
        this.f9296d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9305m = viewConfiguration.getScaledTouchSlop();
        this.f9306n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9307o = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void p() {
        if (this.f9302j == null) {
            this.f9302j = VelocityTracker.obtain();
        }
    }

    private void q(int i8, int i9) {
        this.f9297e = i8;
        this.f9308p = i9;
        startNestedScroll(2, 0);
    }

    private boolean r(View view) {
        return !t(view, 0, getHeight());
    }

    private static boolean s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && s((View) parent, view2);
    }

    private boolean t(View view, int i8, int i9) {
        view.getDrawingRect(this.f9295c);
        offsetDescendantRectToMyCoords(view, this.f9295c);
        return this.f9295c.bottom + i8 >= getScrollY() && this.f9295c.top - i8 <= getScrollY() + i9;
    }

    private void u(int i8, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i8);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9315w.dispatchNestedScroll(0, scrollY2, 0, i8 - scrollY2, null, i9, iArr);
    }

    private void v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9308p) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f9297e = (int) motionEvent.getY(i8);
            this.f9308p = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f9302j;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void x() {
        VelocityTracker velocityTracker = this.f9302j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9302j = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int y(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r0 = androidx.core.widget.d.getDistance(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r4 = -r4
            float r4 = androidx.core.widget.d.onPullDistance(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            float r5 = androidx.core.widget.d.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            float r0 = androidx.core.widget.d.getDistance(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.onPullDistance(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            float r5 = androidx.core.widget.d.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.y(int, float):int");
    }

    private void z(boolean z8) {
        if (z8) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f9312t = getScrollY();
        postInvalidateOnAnimation();
    }

    void G(int i8, int i9, int i10, boolean z8) {
        F(i8 - getScrollX(), i9 - getScrollY(), i10, z8);
    }

    void H(int i8, int i9, boolean z8) {
        G(i8, i9, 250, z8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean arrowScroll(int i8) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i8);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !t(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            B(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f9295c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f9295c);
            B(f(this.f9295c), 0, 1, true);
            viewFindNextFocus.requestFocus(i8);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && r(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f9296d.isFinished()) {
            return;
        }
        this.f9296d.computeScrollOffset();
        int currY = this.f9296d.getCurrY();
        int iG = g(currY - this.f9312t);
        this.f9312t = currY;
        int[] iArr = this.f9310r;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, iG, iArr, null, 1);
        int i8 = iG - this.f9310r[1];
        int scrollRange = getScrollRange();
        if (i8 != 0) {
            int scrollY = getScrollY();
            w(0, i8, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i9 = i8 - scrollY2;
            int[] iArr2 = this.f9310r;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i9, this.f9309q, 1, iArr2);
            i8 = i9 - this.f9310r[1];
        }
        if (i8 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i8 < 0) {
                    if (this.mEdgeGlowTop.isFinished()) {
                        this.mEdgeGlowTop.onAbsorb((int) this.f9296d.getCurrVelocity());
                    }
                } else if (this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onAbsorb((int) this.f9296d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f9296d.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        return this.f9315w.dispatchNestedFling(f8, f9, z8);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f9315w.dispatchNestedPreFling(f8, f9);
    }

    @Override // androidx.core.view.O, androidx.core.view.N
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return this.f9315w.dispatchNestedPreScroll(i8, i9, iArr, iArr2, i10);
    }

    @Override // androidx.core.view.O
    public void dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        this.f9315w.dispatchNestedScroll(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.mEdgeGlowBottom.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.mEdgeGlowBottom.setSize(width2, height2);
        if (this.mEdgeGlowBottom.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.f9295c.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? fullScroll(33) : arrowScroll(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? fullScroll(130) : arrowScroll(130);
        }
        if (keyCode == 62) {
            pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return fullScroll(33);
        }
        if (keyCode == 93) {
            return fullScroll(130);
        }
        if (keyCode == 122) {
            pageScroll(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        pageScroll(130);
        return false;
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i8 - verticalFadingEdgeLength : i8;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i9, (childAt.getBottom() + layoutParams.bottomMargin) - i8);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public void fling(int i8) {
        if (getChildCount() > 0) {
            this.f9296d.fling(getScrollX(), getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            z(true);
        }
    }

    public boolean fullScroll(int i8) {
        int childCount;
        boolean z8 = i8 == 130;
        int height = getHeight();
        Rect rect = this.f9295c;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f9295c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f9295c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f9295c;
        return A(i8, rect3.top, rect3.bottom);
    }

    int g(int i8) {
        int height = getHeight();
        if (i8 > 0 && androidx.core.widget.d.getDistance(this.mEdgeGlowTop) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.onPullDistance(this.mEdgeGlowTop, ((-i8) * 4.0f) / height, 0.5f));
            if (iRound != i8) {
                this.mEdgeGlowTop.finish();
            }
            return i8 - iRound;
        }
        if (i8 >= 0 || androidx.core.widget.d.getDistance(this.mEdgeGlowBottom) == 0.0f) {
            return i8;
        }
        float f8 = height;
        int iRound2 = Math.round((f8 / 4.0f) * androidx.core.widget.d.onPullDistance(this.mEdgeGlowBottom, (i8 * 4.0f) / f8, 0.5f));
        if (iRound2 != i8) {
            this.mEdgeGlowBottom.finish();
        }
        return i8 - iRound2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.T
    public int getNestedScrollAxes() {
        return this.f9314v.getNestedScrollAxes();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f9316x == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9316x = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9316x;
    }

    @Override // androidx.core.view.O, androidx.core.view.N
    public boolean hasNestedScrollingParent(int i8) {
        return this.f9315w.hasNestedScrollingParent(i8);
    }

    public boolean isFillViewport() {
        return this.f9303k;
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean isNestedScrollingEnabled() {
        return this.f9315w.isNestedScrollingEnabled();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.f9304l;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i8, int i9) {
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9299g = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i8;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f9301i) {
            if (M.isFromSource(motionEvent, 2)) {
                i8 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (M.isFromSource(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i8 = 26;
                axisValue = axisValue2;
            } else {
                i8 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                B(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, M.isFromSource(motionEvent, x.TRANSIT_FRAGMENT_CLOSE));
                if (i8 != 0) {
                    this.f9292A.onMotionEvent(motionEvent, i8);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        int measuredHeight = 0;
        this.f9298f = false;
        View view = this.f9300h;
        if (view != null && s(view, this)) {
            C(this.f9300h);
        }
        this.f9300h = null;
        if (!this.f9299g) {
            if (this.f9313u != null) {
                scrollTo(getScrollX(), this.f9313u.scrollPosition);
                this.f9313u = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iE = e(scrollY, paddingTop, measuredHeight);
            if (iE != scrollY) {
                scrollTo(getScrollX(), iE);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9299g = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f9303k && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (z8) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        fling((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return dispatchNestedPreFling(f8, f9);
    }

    @Override // androidx.core.view.T
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10) {
        dispatchNestedPreScroll(i8, i9, iArr, null, i10);
    }

    @Override // androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        u(i11, i12, iArr);
    }

    @Override // androidx.core.view.T
    public void onNestedScrollAccepted(View view, View view2, int i8, int i9) {
        this.f9314v.onNestedScrollAccepted(view, view2, i8, i9);
        startNestedScroll(2, i9);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i8, int i9, boolean z8, boolean z9) {
        super.scrollTo(i8, i9);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (i8 == 2) {
            i8 = 130;
        } else if (i8 == 1) {
            i8 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i8) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i8);
        if (viewFindNextFocus == null || r(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i8, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f9313u = eVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.scrollPosition = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
        d dVar = this.f9317y;
        if (dVar != null) {
            dVar.onScrollChange(this, i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !t(viewFindFocus, 0, i11)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f9295c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f9295c);
        h(f(this.f9295c));
    }

    @Override // androidx.core.view.T
    public boolean onStartNestedScroll(View view, View view2, int i8, int i9) {
        return (i8 & 2) != 0;
    }

    @Override // androidx.core.view.T
    public void onStopNestedScroll(View view, int i8) {
        this.f9314v.onStopNestedScroll(view, i8);
        stopNestedScroll(i8);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        p();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9311s = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f9311s);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f9302j;
                velocityTracker.computeCurrentVelocity(1000, this.f9307o);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f9308p);
                if (Math.abs(yVelocity) >= this.f9306n) {
                    if (!i(yVelocity)) {
                        int i8 = -yVelocity;
                        float f8 = i8;
                        if (!dispatchNestedPreFling(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            fling(i8);
                        }
                    }
                } else if (this.f9296d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                j();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9308p);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f9308p + " in onTouchEvent");
                } else {
                    int y8 = (int) motionEvent.getY(iFindPointerIndex);
                    int i9 = this.f9297e - y8;
                    int iY = i9 - y(i9, motionEvent.getX(iFindPointerIndex));
                    if (!this.f9301i && Math.abs(iY) > this.f9305m) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f9301i = true;
                        iY = iY > 0 ? iY - this.f9305m : iY + this.f9305m;
                    }
                    if (this.f9301i) {
                        int iB = B(iY, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f9297e = y8 - iB;
                        this.f9311s += iB;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f9301i && getChildCount() > 0 && this.f9296d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                j();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f9297e = (int) motionEvent.getY(actionIndex);
                this.f9308p = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                v(motionEvent);
                this.f9297e = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f9308p));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f9301i && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f9296d.isFinished()) {
                a();
            }
            q((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f9302j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean pageScroll(int i8) {
        boolean z8 = i8 == 130;
        int height = getHeight();
        if (z8) {
            this.f9295c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f9295c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f9295c.top = getScrollY() - height;
            Rect rect2 = this.f9295c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f9295c;
        int i9 = rect3.top;
        int i10 = height + i9;
        rect3.bottom = i10;
        return A(i8, i9, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f9298f) {
            this.f9300h = view2;
        } else {
            C(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return D(rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        if (z8) {
            x();
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f9298f = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iE = e(i8, width, width2);
            int iE2 = e(i9, height, height2);
            if (iE == getScrollX() && iE2 == getScrollY()) {
                return;
            }
            super.scrollTo(iE, iE2);
        }
    }

    public void setFillViewport(boolean z8) {
        if (z8 != this.f9303k) {
            this.f9303k = z8;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public void setNestedScrollingEnabled(boolean z8) {
        this.f9315w.setNestedScrollingEnabled(z8);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.f9317y = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f9304l = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int i8, int i9) {
        F(i8, i9, 250, false);
    }

    public final void smoothScrollTo(int i8, int i9) {
        G(i8, i9, 250, false);
    }

    @Override // androidx.core.view.O, androidx.core.view.N
    public boolean startNestedScroll(int i8, int i9) {
        return this.f9315w.startNestedScroll(i8, i9);
    }

    @Override // androidx.core.view.O, androidx.core.view.N
    public void stopNestedScroll(int i8) {
        this.f9315w.stopNestedScroll(i8);
    }

    boolean w(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z8) {
        boolean z9;
        boolean z10;
        int overScrollMode = getOverScrollMode();
        boolean z11 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z12 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        boolean z14 = overScrollMode == 0 || (overScrollMode == 1 && z12);
        int i16 = i10 + i8;
        int i17 = !z13 ? 0 : i14;
        int i18 = i11 + i9;
        int i19 = !z14 ? 0 : i15;
        int i20 = -i17;
        int i21 = i17 + i12;
        int i22 = -i19;
        int i23 = i19 + i13;
        if (i16 > i21) {
            i16 = i21;
            z9 = true;
        } else if (i16 < i20) {
            z9 = true;
            i16 = i20;
        } else {
            z9 = false;
        }
        if (i18 > i23) {
            i18 = i23;
            z10 = true;
        } else if (i18 < i22) {
            z10 = true;
            i18 = i22;
        } else {
            z10 = false;
        }
        if (z10 && !hasNestedScrollingParent(1)) {
            this.f9296d.springBack(i16, i18, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i16, i18, z9, z10);
        return z9 || z10;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, U.a.nestedScrollViewStyle);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i8, i9, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.O, androidx.core.view.N
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12) {
        return this.f9315w.dispatchNestedScroll(i8, i9, i10, i11, iArr, i12);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        onNestedPreScroll(view, i8, i9, iArr, 0);
    }

    @Override // androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12) {
        u(i11, i12, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        return onStartNestedScroll(view, view2, i8, 0);
    }

    public final void smoothScrollBy(int i8, int i9, int i10) {
        F(i8, i9, i10, false);
    }

    public final void smoothScrollTo(int i8, int i9, int i10) {
        G(i8, i9, i10, false);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean startNestedScroll(int i8) {
        return startNestedScroll(i8, 0);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f9295c = new Rect();
        this.f9298f = true;
        this.f9299g = false;
        this.f9300h = null;
        this.f9301i = false;
        this.f9304l = true;
        this.f9308p = -1;
        this.f9309q = new int[2];
        this.f9310r = new int[2];
        c cVar = new c();
        this.f9318z = cVar;
        this.f9292A = new C0996v(getContext(), cVar);
        this.mEdgeGlowTop = androidx.core.widget.d.create(context, attributeSet);
        this.mEdgeGlowBottom = androidx.core.widget.d.create(context, attributeSet);
        this.f9293a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9291D, i8, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f9314v = new V(this);
        this.f9315w = new Q(this);
        setNestedScrollingEnabled(true);
        AbstractC0985p0.setAccessibilityDelegate(this, f9290C);
    }

    @Override // android.view.View, androidx.core.view.O, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return this.f9315w.dispatchNestedScroll(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        u(i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        onNestedScrollAccepted(view, view2, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8) {
        if (getChildCount() <= 0) {
            super.addView(view, i8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
