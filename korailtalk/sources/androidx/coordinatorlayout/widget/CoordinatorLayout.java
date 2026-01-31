package androidx.coordinatorlayout.widget;

import Q7.C;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import androidx.core.view.S;
import androidx.core.view.T;
import androidx.core.view.V;
import androidx.core.view.W;
import c0.AbstractC1087a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements S, T {

    /* renamed from: u, reason: collision with root package name */
    static final String f8627u;

    /* renamed from: v, reason: collision with root package name */
    static final Class[] f8628v;

    /* renamed from: w, reason: collision with root package name */
    static final ThreadLocal f8629w;

    /* renamed from: x, reason: collision with root package name */
    static final Comparator f8630x;

    /* renamed from: y, reason: collision with root package name */
    private static final Z.e f8631y;

    /* renamed from: a, reason: collision with root package name */
    private final List f8632a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b f8633b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8634c;

    /* renamed from: d, reason: collision with root package name */
    private final List f8635d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f8636e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f8637f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f8638g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8639h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8640i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f8641j;

    /* renamed from: k, reason: collision with root package name */
    private View f8642k;

    /* renamed from: l, reason: collision with root package name */
    private View f8643l;

    /* renamed from: m, reason: collision with root package name */
    private g f8644m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f8645n;

    /* renamed from: o, reason: collision with root package name */
    private C0950d1 f8646o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8647p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f8648q;

    /* renamed from: r, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f8649r;

    /* renamed from: s, reason: collision with root package name */
    private W f8650s;

    /* renamed from: t, reason: collision with root package name */
    private final V f8651t;

    class a implements W {
        a() {
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
            return CoordinatorLayout.this.J(c0950d1);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public static Object getTag(View view) {
            return ((f) view.getLayoutParams()).f8666m;
        }

        public static void setTag(View view, Object obj) {
            ((f) view.getLayoutParams()).f8666m = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            return getScrimOpacity(coordinatorLayout, view) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public C0950d1 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, C0950d1 c0950d1) {
            return c0950d1;
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i8) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f8, float f9, boolean z8) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f8, float f9) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z8) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr, int i10) {
            if (i10 == 0) {
                onNestedPreScroll(coordinatorLayout, view, view2, i8, i9, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12) {
            if (i12 == 0) {
                onNestedScroll(coordinatorLayout, view, view2, i8, i9, i10, i11);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            if (i9 == 0) {
                onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i8);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            if (i9 == 0) {
                return onStartNestedScroll(coordinatorLayout, view, view2, view3, i8);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i8) {
            if (i8 == 0) {
                onStopNestedScroll(coordinatorLayout, view, view2);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
            onNestedScroll(coordinatorLayout, view, view2, i8, i9, i10, i11, i12);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8649r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.w(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8649r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.w(0);
            return true;
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            float z8 = AbstractC0985p0.getZ(view);
            float z9 = AbstractC0985p0.getZ(view2);
            if (z8 > z9) {
                return -1;
            }
            return z8 < z9 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f8627u = r02 != null ? r02.getName() : null;
        f8630x = new i();
        f8628v = new Class[]{Context.class, AttributeSet.class};
        f8629w = new ThreadLocal();
        f8631y = new Z.g(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static void B(Rect rect) {
        rect.setEmpty();
        f8631y.release(rect);
    }

    private void D(boolean z8) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            c behavior = ((f) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z8) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            ((f) getChildAt(i9).getLayoutParams()).l();
        }
        this.f8642k = null;
        this.f8639h = false;
    }

    private static int E(int i8) {
        if (i8 == 0) {
            return 17;
        }
        return i8;
    }

    private static int F(int i8) {
        if ((i8 & 7) == 0) {
            i8 |= A.START;
        }
        return (i8 & 112) == 0 ? i8 | 48 : i8;
    }

    private static int G(int i8) {
        return i8 == 0 ? L2.a.TOP_END : i8;
    }

    private void H(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i9 = fVar.f8657d;
        if (i9 != i8) {
            AbstractC0985p0.offsetLeftAndRight(view, i8 - i9);
            fVar.f8657d = i8;
        }
    }

    private void I(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i9 = fVar.f8658e;
        if (i9 != i8) {
            AbstractC0985p0.offsetTopAndBottom(view, i8 - i9);
            fVar.f8658e = i8;
        }
    }

    private void K() {
        if (!AbstractC0985p0.getFitsSystemWindows(this)) {
            AbstractC0985p0.setOnApplyWindowInsetsListener(this, null);
            return;
        }
        if (this.f8650s == null) {
            this.f8650s = new a();
        }
        AbstractC0985p0.setOnApplyWindowInsetsListener(this, this.f8650s);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) f8631y.acquire();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
    }

    private void d(f fVar, Rect rect, int i8, int i9) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i8) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i9) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i8 + iMax, i9 + iMax2);
    }

    private C0950d1 e(C0950d1 c0950d1) {
        c behavior;
        if (c0950d1.isConsumed()) {
            return c0950d1;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (AbstractC0985p0.getFitsSystemWindows(childAt) && (behavior = ((f) childAt.getLayoutParams()).getBehavior()) != null) {
                c0950d1 = behavior.onApplyWindowInsets(this, childAt, c0950d1);
                if (c0950d1.isConsumed()) {
                    break;
                }
            }
        }
        return c0950d1;
    }

    private void l(View view, int i8, Rect rect, Rect rect2, f fVar, int i9, int i10) {
        int absoluteGravity = A.getAbsoluteGravity(E(fVar.gravity), i8);
        int absoluteGravity2 = A.getAbsoluteGravity(F(fVar.anchorGravity), i8);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        int iWidth = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            iWidth -= i9 / 2;
        } else if (i11 != 5) {
            iWidth -= i9;
        }
        if (i12 == 16) {
            iHeight -= i10 / 2;
        } else if (i12 != 80) {
            iHeight -= i10;
        }
        rect2.set(iWidth, iHeight, i9 + iWidth, i10 + iHeight);
    }

    private int m(int i8) {
        int[] iArr = this.f8641j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i8);
            return 0;
        }
        if (i8 >= 0 && i8 < iArr.length) {
            return iArr[i8];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i8 + " out of range for " + this);
        return 0;
    }

    private void p(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i8) : i8));
        }
        Comparator comparator = f8630x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean q(View view) {
        return this.f8633b.hasOutgoingEdges(view);
    }

    private void r(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f8646o != null && AbstractC0985p0.getFitsSystemWindows(this) && !AbstractC0985p0.getFitsSystemWindows(view)) {
            rectA.left += this.f8646o.getSystemWindowInsetLeft();
            rectA.top += this.f8646o.getSystemWindowInsetTop();
            rectA.right -= this.f8646o.getSystemWindowInsetRight();
            rectA.bottom -= this.f8646o.getSystemWindowInsetBottom();
        }
        Rect rectA2 = a();
        A.apply(F(fVar.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i8);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        B(rectA);
        B(rectA2);
    }

    private void s(View view, View view2, int i8) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            j(view2, rectA);
            k(view, i8, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            B(rectA);
            B(rectA2);
        }
    }

    private void t(View view, int i8, int i9) {
        f fVar = (f) view.getLayoutParams();
        int absoluteGravity = A.getAbsoluteGravity(G(fVar.gravity), i9);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i9 == 1) {
            i8 = width - i8;
        }
        int iM = m(i8) - measuredWidth;
        if (i10 == 1) {
            iM += measuredWidth / 2;
        } else if (i10 == 5) {
            iM += measuredWidth;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void u(View view, Rect rect, int i8) {
        boolean z8;
        boolean z9;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        if (AbstractC0985p0.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c behavior = fVar.getBehavior();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior == null || !behavior.getInsetDodgeRect(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            B(rectA2);
            if (rectA.isEmpty()) {
                B(rectA);
                return;
            }
            int absoluteGravity = A.getAbsoluteGravity(fVar.dodgeInsetEdges, i8);
            boolean z10 = true;
            if ((absoluteGravity & 48) != 48 || (i13 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f8658e) >= (i14 = rect.top)) {
                z8 = false;
            } else {
                I(view, i14 - i13);
                z8 = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f8658e) < (i12 = rect.bottom)) {
                I(view, height - i12);
                z8 = true;
            }
            if (!z8) {
                I(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i10 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f8657d) >= (i11 = rect.left)) {
                z9 = false;
            } else {
                H(view, i11 - i10);
                z9 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f8657d) >= (i9 = rect.right)) {
                z10 = z9;
            } else {
                H(view, width - i9);
            }
            if (!z10) {
                H(view, 0);
            }
            B(rectA);
        }
    }

    static c x(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f8627u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + C.PACKAGE_SEPARATOR_CHAR + str;
            }
        }
        try {
            ThreadLocal threadLocal = f8629w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f8628v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e8) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e8);
        }
    }

    private boolean y(MotionEvent motionEvent, int i8) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f8634c;
        p(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) list.get(i9);
            f fVar = (f) view.getLayoutParams();
            c behavior = fVar.getBehavior();
            if (!(zOnInterceptTouchEvent || z8) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i8 == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i8 == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.f8642k = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z8 = zH && !zC;
                if (zH && !z8) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i8 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i8 == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    private void z() {
        this.f8632a.clear();
        this.f8633b.clear();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            f fVarO = o(childAt);
            fVarO.d(this, childAt);
            this.f8633b.addNode(childAt);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (i9 != i8) {
                    View childAt2 = getChildAt(i9);
                    if (fVarO.b(this, childAt, childAt2)) {
                        if (!this.f8633b.contains(childAt2)) {
                            this.f8633b.addNode(childAt2);
                        }
                        this.f8633b.addEdge(childAt2, childAt);
                    }
                }
            }
        }
        this.f8632a.addAll(this.f8633b.getSortedList());
        Collections.reverse(this.f8632a);
    }

    void A(View view, Rect rect) {
        ((f) view.getLayoutParams()).o(rect);
    }

    void C() {
        if (this.f8640i && this.f8644m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8644m);
        }
        this.f8645n = false;
    }

    final C0950d1 J(C0950d1 c0950d1) {
        if (Z.c.equals(this.f8646o, c0950d1)) {
            return c0950d1;
        }
        this.f8646o = c0950d1;
        boolean z8 = false;
        boolean z9 = c0950d1 != null && c0950d1.getSystemWindowInsetTop() > 0;
        this.f8647p = z9;
        if (!z9 && getBackground() == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        C0950d1 c0950d1E = e(c0950d1);
        requestLayout();
        return c0950d1E;
    }

    void b() {
        if (this.f8640i) {
            if (this.f8644m == null) {
                this.f8644m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8644m);
        }
        this.f8645n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        List incomingEdges = this.f8633b.getIncomingEdges(view);
        if (incomingEdges == null || incomingEdges.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < incomingEdges.size(); i8++) {
            View view2 = (View) incomingEdges.get(i8);
            c behavior = ((f) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z8 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectA = a();
        i(view, view.getParent() != this, rectA);
        Rect rectA2 = a();
        i(view2, view2.getParent() != this, rectA2);
        try {
            if (rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left) {
                if (rectA.bottom >= rectA2.top) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            B(rectA);
            B(rectA2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j8) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f8654a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f8636e == null) {
                    this.f8636e = new Paint();
                }
                this.f8636e.setColor(fVar.f8654a.getScrimColor(this, view));
                this.f8636e.setAlpha(c(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f8636e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8648q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void f() {
        int childCount = getChildCount();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            if (q(getChildAt(i8))) {
                z8 = true;
                break;
            }
            i8++;
        }
        if (z8 != this.f8645n) {
            if (z8) {
                b();
            } else {
                C();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public List<View> getDependencies(View view) {
        List<Object> outgoingEdges = this.f8633b.getOutgoingEdges(view);
        this.f8635d.clear();
        if (outgoingEdges != null) {
            this.f8635d.addAll(outgoingEdges);
        }
        return this.f8635d;
    }

    final List<View> getDependencySortedChildren() {
        z();
        return Collections.unmodifiableList(this.f8632a);
    }

    public List<View> getDependents(View view) {
        List incomingEdges = this.f8633b.getIncomingEdges(view);
        this.f8635d.clear();
        if (incomingEdges != null) {
            this.f8635d.addAll(incomingEdges);
        }
        return this.f8635d;
    }

    public final C0950d1 getLastWindowInsets() {
        return this.f8646o;
    }

    @Override // android.view.ViewGroup, androidx.core.view.S, androidx.core.view.T
    public int getNestedScrollAxes() {
        return this.f8651t.getNestedScrollAxes();
    }

    public Drawable getStatusBarBackground() {
        return this.f8648q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void i(View view, boolean z8, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z8) {
            j(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean isPointInChildBounds(View view, int i8, int i9) {
        Rect rectA = a();
        j(view, rectA);
        try {
            return rectA.contains(i8, i9);
        } finally {
            B(rectA);
        }
    }

    void j(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.getDescendantRect(this, view, rect);
    }

    void k(View view, int i8, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        l(view, i8, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    void n(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f o(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f8655b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.setBehavior(behavior);
                fVar.f8655b = true;
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.setBehavior((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e8) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e8);
                    }
                }
                fVar.f8655b = true;
            }
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D(false);
        if (this.f8645n) {
            if (this.f8644m == null) {
                this.f8644m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8644m);
        }
        if (this.f8646o == null && AbstractC0985p0.getFitsSystemWindows(this)) {
            AbstractC0985p0.requestApplyInsets(this);
        }
        this.f8640i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D(false);
        if (this.f8645n && this.f8644m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8644m);
        }
        View view = this.f8643l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f8640i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f8647p || this.f8648q == null) {
            return;
        }
        C0950d1 c0950d1 = this.f8646o;
        int systemWindowInsetTop = c0950d1 != null ? c0950d1.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f8648q.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f8648q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            D(true);
        }
        boolean zY = y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            D(true);
        }
        return zY;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        c behavior;
        int layoutDirection = AbstractC0985p0.getLayoutDirection(this);
        int size = this.f8632a.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f8632a.get(i12);
            if (view.getVisibility() != 8 && ((behavior = ((f) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f8659f;
        if (view2 != null) {
            s(view, view2, i8);
            return;
        }
        int i9 = fVar.keyline;
        if (i9 >= 0) {
            t(view, i9, i8);
        } else {
            r(view, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        c behavior;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (behavior = fVar.getBehavior()) != null) {
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view, f8, f9, z8);
                }
            }
        }
        if (zOnNestedFling) {
            w(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public boolean onNestedPreFling(View view, float f8, float f9) {
        c behavior;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (behavior = fVar.getBehavior()) != null) {
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view, f8, f9);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        onNestedPreScroll(view, i8, i9, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        onNestedScroll(view, i8, i9, i10, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        onNestedScrollAccepted(view, view2, i8, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        SparseArray sparseArray = hVar.f8668b;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            c behavior = o(childAt).getBehavior();
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            c behavior = ((f) childAt.getLayoutParams()).getBehavior();
            if (id != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        hVar.f8668b = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        return onStartNestedScroll(view, view2, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.S, androidx.core.view.U, androidx.core.view.T
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f8642k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.y(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f8642k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.getBehavior()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f8642k
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f8642k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.D(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        c behavior = ((f) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z8)) {
            return super.requestChildRectangleOnScreen(view, rect, z8);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (!z8 || this.f8639h) {
            return;
        }
        D(false);
        this.f8639h = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z8) {
        super.setFitsSystemWindows(z8);
        K();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8649r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f8648q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f8648q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f8648q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.setLayoutDirection(this.f8648q, AbstractC0985p0.getLayoutDirection(this));
                this.f8648q.setVisible(getVisibility() == 0, false);
                this.f8648q.setCallback(this);
            }
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(int i8) {
        setStatusBarBackground(new ColorDrawable(i8));
    }

    public void setStatusBarBackgroundResource(int i8) {
        setStatusBarBackground(i8 != 0 ? androidx.core.content.a.getDrawable(getContext(), i8) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f8648q;
        if (drawable == null || drawable.isVisible() == z8) {
            return;
        }
        this.f8648q.setVisible(z8, false);
    }

    void v(View view, int i8) {
        c behavior;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f8659f != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            j(fVar.f8659f, rectA);
            i(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            l(view, i8, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z8 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i9 = rectA3.left - rectA2.left;
            int i10 = rectA3.top - rectA2.top;
            if (i9 != 0) {
                AbstractC0985p0.offsetLeftAndRight(view, i9);
            }
            if (i10 != 0) {
                AbstractC0985p0.offsetTopAndBottom(view, i10);
            }
            if (z8 && (behavior = fVar.getBehavior()) != null) {
                behavior.onDependentViewChanged(this, view, fVar.f8659f);
            }
            B(rectA);
            B(rectA2);
            B(rectA3);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8648q;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void w(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.w(int):void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.coordinatorLayoutStyle);
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10) {
        c behavior;
        int childCount = getChildCount();
        boolean z8 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i10) && (behavior = fVar.getBehavior()) != null) {
                    int[] iArr2 = this.f8637f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i8, i9, iArr2, i10);
                    int[] iArr3 = this.f8637f;
                    iMax = i8 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f8637f;
                    iMax2 = i9 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z8) {
            w(1);
        }
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12) {
        onNestedScroll(view, i8, i9, i10, i11, 0, this.f8638g);
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onNestedScrollAccepted(View view, View view2, int i8, int i9) {
        c behavior;
        this.f8651t.onNestedScrollAccepted(view, view2, i8, i9);
        this.f8643l = view2;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i9) && (behavior = fVar.getBehavior()) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i8, i9);
            }
        }
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public boolean onStartNestedScroll(View view, View view2, int i8, int i9) {
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c behavior = fVar.getBehavior();
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i8, i9);
                    z8 |= zOnStartNestedScroll;
                    fVar.p(i9, zOnStartNestedScroll);
                } else {
                    fVar.p(i9, false);
                }
            }
        }
        return z8;
    }

    @Override // androidx.core.view.S, androidx.core.view.T
    public void onStopNestedScroll(View view, int i8) {
        this.f8651t.onStopNestedScroll(view, i8);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i8)) {
                c behavior = fVar.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i8);
                }
                fVar.k(i8);
                fVar.j();
            }
        }
        this.f8643l = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i8) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i8);
        this.f8632a = new ArrayList();
        this.f8633b = new androidx.coordinatorlayout.widget.b();
        this.f8634c = new ArrayList();
        this.f8635d = new ArrayList();
        this.f8637f = new int[2];
        this.f8638g = new int[2];
        this.f8651t = new V(this);
        if (i8 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T.c.CoordinatorLayout, 0, T.b.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T.c.CoordinatorLayout, i8, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i8 == 0) {
                saveAttributeDataForStyleable(context, T.c.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, T.b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, T.c.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i8, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(T.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f8641j = resources.getIntArray(resourceId);
            float f8 = resources.getDisplayMetrics().density;
            int length = this.f8641j.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.f8641j[i9] = (int) (r12[i9] * f8);
            }
        }
        this.f8648q = typedArrayObtainStyledAttributes.getDrawable(T.c.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        K();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC0985p0.getImportantForAccessibility(this) == 0) {
            AbstractC0985p0.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        c behavior;
        boolean z8;
        int iMin;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (behavior = fVar.getBehavior()) != null) {
                    int[] iArr2 = this.f8637f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i8, i9, i10, i11, i12, iArr2);
                    int[] iArr3 = this.f8637f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i11 > 0) {
                        z8 = true;
                        iMin = Math.max(i13, this.f8637f[1]);
                    } else {
                        z8 = true;
                        iMin = Math.min(i13, this.f8637f[1]);
                    }
                    i13 = iMin;
                    z9 = z8;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i13;
        if (z9) {
            w(1);
        }
    }

    protected static class h extends AbstractC1087a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        SparseArray f8668b;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public h[] newArray(int i8) {
                return new h[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i8 = parcel.readInt();
            int[] iArr = new int[i8];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f8668b = new SparseArray(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                this.f8668b.append(iArr[i9], parcelableArray[i9]);
            }
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            SparseArray sparseArray = this.f8668b;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr[i9] = this.f8668b.keyAt(i9);
                parcelableArr[i9] = (Parcelable) this.f8668b.valueAt(i9);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i8);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f8654a;
        public int anchorGravity;

        /* renamed from: b, reason: collision with root package name */
        boolean f8655b;

        /* renamed from: c, reason: collision with root package name */
        int f8656c;

        /* renamed from: d, reason: collision with root package name */
        int f8657d;
        public int dodgeInsetEdges;

        /* renamed from: e, reason: collision with root package name */
        int f8658e;

        /* renamed from: f, reason: collision with root package name */
        View f8659f;

        /* renamed from: g, reason: collision with root package name */
        View f8660g;
        public int gravity;

        /* renamed from: h, reason: collision with root package name */
        private boolean f8661h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8662i;
        public int insetEdge;

        /* renamed from: j, reason: collision with root package name */
        private boolean f8663j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f8664k;
        public int keyline;

        /* renamed from: l, reason: collision with root package name */
        final Rect f8665l;

        /* renamed from: m, reason: collision with root package name */
        Object f8666m;

        public f(int i8, int i9) {
            super(i8, i9);
            this.f8655b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f8656c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f8665l = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f8656c);
            this.f8659f = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f8660g = null;
                    this.f8659f = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f8656c) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f8660g = null;
                this.f8659f = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f8660g = null;
                    this.f8659f = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f8660g = viewFindViewById;
        }

        private boolean q(View view, int i8) {
            int absoluteGravity = A.getAbsoluteGravity(((f) view.getLayoutParams()).insetEdge, i8);
            return absoluteGravity != 0 && (A.getAbsoluteGravity(this.dodgeInsetEdges, i8) & absoluteGravity) == absoluteGravity;
        }

        private boolean r(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f8659f.getId() != this.f8656c) {
                return false;
            }
            View view2 = this.f8659f;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f8660g = null;
                    this.f8659f = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f8660g = view2;
            return true;
        }

        boolean a() {
            return this.f8659f == null && this.f8656c != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f8660g || q(view2, AbstractC0985p0.getLayoutDirection(coordinatorLayout)) || ((cVar = this.f8654a) != null && cVar.layoutDependsOn(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f8654a == null) {
                this.f8661h = false;
            }
            return this.f8661h;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f8656c == -1) {
                this.f8660g = null;
                this.f8659f = null;
                return null;
            }
            if (this.f8659f == null || !r(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f8659f;
        }

        boolean e() {
            return this.f8664k;
        }

        Rect f() {
            return this.f8665l;
        }

        void g() {
            this.f8660g = null;
            this.f8659f = null;
        }

        public int getAnchorId() {
            return this.f8656c;
        }

        public c getBehavior() {
            return this.f8654a;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z8 = this.f8661h;
            if (z8) {
                return true;
            }
            c cVar = this.f8654a;
            boolean zBlocksInteractionBelow = (cVar != null ? cVar.blocksInteractionBelow(coordinatorLayout, view) : false) | z8;
            this.f8661h = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        boolean i(int i8) {
            if (i8 == 0) {
                return this.f8662i;
            }
            if (i8 != 1) {
                return false;
            }
            return this.f8663j;
        }

        void j() {
            this.f8664k = false;
        }

        void k(int i8) {
            p(i8, false);
        }

        void l() {
            this.f8661h = false;
        }

        void n(boolean z8) {
            this.f8664k = z8;
        }

        void o(Rect rect) {
            this.f8665l.set(rect);
        }

        void p(int i8, boolean z8) {
            if (i8 == 0) {
                this.f8662i = z8;
            } else {
                if (i8 != 1) {
                    return;
                }
                this.f8663j = z8;
            }
        }

        public void setAnchorId(int i8) {
            g();
            this.f8656c = i8;
        }

        public void setBehavior(c cVar) {
            c cVar2 = this.f8654a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f8654a = cVar;
                this.f8666m = null;
                this.f8655b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8655b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f8656c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f8665l = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T.c.CoordinatorLayout_Layout);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(T.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f8656c = typedArrayObtainStyledAttributes.getResourceId(T.c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = typedArrayObtainStyledAttributes.getInteger(T.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = typedArrayObtainStyledAttributes.getInteger(T.c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = typedArrayObtainStyledAttributes.getInt(T.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = typedArrayObtainStyledAttributes.getInt(T.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(T.c.CoordinatorLayout_Layout_layout_behavior);
            this.f8655b = zHasValue;
            if (zHasValue) {
                this.f8654a = CoordinatorLayout.x(context, attributeSet, typedArrayObtainStyledAttributes.getString(T.c.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f8654a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f8655b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f8656c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f8665l = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8655b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f8656c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f8665l = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8655b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f8656c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f8665l = new Rect();
        }
    }
}
