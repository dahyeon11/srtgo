package com.google.android.material.appbar;

import J2.k;
import J2.l;
import a3.g;
import a3.h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import androidx.core.view.P;
import androidx.core.view.W;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.O;
import c0.AbstractC1087a;
import c3.AbstractC1090a;
import i.AbstractC5638a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: r */
    private static final int f24229r = k.Widget_Design_AppBarLayout;

    /* renamed from: a */
    private int f24230a;

    /* renamed from: b */
    private int f24231b;

    /* renamed from: c */
    private int f24232c;

    /* renamed from: d */
    private int f24233d;

    /* renamed from: e */
    private boolean f24234e;

    /* renamed from: f */
    private int f24235f;

    /* renamed from: g */
    private C0950d1 f24236g;

    /* renamed from: h */
    private List f24237h;

    /* renamed from: i */
    private boolean f24238i;

    /* renamed from: j */
    private boolean f24239j;

    /* renamed from: k */
    private boolean f24240k;

    /* renamed from: l */
    private boolean f24241l;

    /* renamed from: m */
    private int f24242m;

    /* renamed from: n */
    private WeakReference f24243n;

    /* renamed from: o */
    private ValueAnimator f24244o;

    /* renamed from: p */
    private int[] f24245p;

    /* renamed from: q */
    private Drawable f24246q;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.b {

        /* renamed from: k */
        private int f24247k;

        /* renamed from: l */
        private int f24248l;

        /* renamed from: m */
        private ValueAnimator f24249m;

        /* renamed from: n */
        private int f24250n;

        /* renamed from: o */
        private boolean f24251o;

        /* renamed from: p */
        private float f24252p;

        /* renamed from: q */
        private WeakReference f24253q;

        /* renamed from: r */
        private d f24254r;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f24255a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f24256b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f24255a = coordinatorLayout;
                this.f24256b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.j(this.f24255a, this.f24256b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b implements O {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f24258a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f24259b;

            /* renamed from: c */
            final /* synthetic */ View f24260c;

            /* renamed from: d */
            final /* synthetic */ int f24261d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8) {
                this.f24258a = coordinatorLayout;
                this.f24259b = appBarLayout;
                this.f24260c = view;
                this.f24261d = i8;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.O
            public boolean perform(View view, O.a aVar) throws Resources.NotFoundException {
                BaseBehavior.this.onNestedPreScroll(this.f24258a, (CoordinatorLayout) this.f24259b, this.f24260c, 0, this.f24261d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class c implements O {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f24263a;

            /* renamed from: b */
            final /* synthetic */ boolean f24264b;

            c(AppBarLayout appBarLayout, boolean z8) {
                this.f24263a = appBarLayout;
                this.f24264b = z8;
            }

            @Override // androidx.core.view.accessibility.O
            public boolean perform(View view, O.a aVar) {
                this.f24263a.setExpanded(this.f24264b);
                return true;
            }
        }

        public static abstract class d {
            public abstract boolean canDrag(AppBarLayout appBarLayout);
        }

        public BaseBehavior() {
            this.f24250n = -1;
        }

        private boolean B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
            int size = dependents.size();
            for (int i8 = 0; i8 < size; i8++) {
                CoordinatorLayout.c behavior = ((CoordinatorLayout.f) dependents.get(i8).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iG = g();
            int iV = v(appBarLayout, iG);
            if (iV >= 0) {
                View childAt = appBarLayout.getChildAt(iV);
                d dVar = (d) childAt.getLayoutParams();
                int scrollFlags = dVar.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i8 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iV == appBarLayout.getChildCount() - 1) {
                        minimumHeight += appBarLayout.getTopInset();
                    }
                    if (s(scrollFlags, 2)) {
                        minimumHeight += AbstractC0985p0.getMinimumHeight(childAt);
                    } else if (s(scrollFlags, 5)) {
                        int minimumHeight2 = AbstractC0985p0.getMinimumHeight(childAt) + minimumHeight;
                        if (iG < minimumHeight2) {
                            i8 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (s(scrollFlags, 32)) {
                        i8 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (iG < (minimumHeight + i8) / 2) {
                        i8 = minimumHeight;
                    }
                    o(coordinatorLayout, appBarLayout, X.a.clamp(i8, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            AbstractC0985p0.removeAccessibilityAction(coordinatorLayout, H.a.ACTION_SCROLL_FORWARD.getId());
            AbstractC0985p0.removeAccessibilityAction(coordinatorLayout, H.a.ACTION_SCROLL_BACKWARD.getId());
            View viewT = t(coordinatorLayout);
            if (viewT == null || appBarLayout.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) viewT.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior)) {
                return;
            }
            m(coordinatorLayout, appBarLayout, viewT);
        }

        private void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9, boolean z8) throws Resources.NotFoundException {
            View viewU = u(appBarLayout, i8);
            if (viewU != null) {
                int scrollFlags = ((d) viewU.getLayoutParams()).getScrollFlags();
                boolean zP = false;
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = AbstractC0985p0.getMinimumHeight(viewU);
                    if (i9 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i8) < (viewU.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i8) >= (viewU.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zP = true;
                    }
                }
                if (appBarLayout.isLiftOnScroll()) {
                    zP = appBarLayout.p(t(coordinatorLayout));
                }
                boolean zN = appBarLayout.n(zP);
                if (z8 || (zN && B(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        private void m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (g() != (-appBarLayout.getTotalScrollRange()) && view.canScrollVertically(1)) {
                n(coordinatorLayout, appBarLayout, H.a.ACTION_SCROLL_FORWARD, false);
            }
            if (g() != 0) {
                if (!view.canScrollVertically(-1)) {
                    n(coordinatorLayout, appBarLayout, H.a.ACTION_SCROLL_BACKWARD, true);
                    return;
                }
                int i8 = -appBarLayout.getDownNestedPreScrollRange();
                if (i8 != 0) {
                    AbstractC0985p0.replaceAccessibilityAction(coordinatorLayout, H.a.ACTION_SCROLL_BACKWARD, null, new b(coordinatorLayout, appBarLayout, view, i8));
                }
            }
        }

        private void n(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, H.a aVar, boolean z8) {
            AbstractC0985p0.replaceAccessibilityAction(coordinatorLayout, aVar, null, new c(appBarLayout, z8));
        }

        private void o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, float f8) {
            int iAbs = Math.abs(g() - i8);
            float fAbs = Math.abs(f8);
            p(coordinatorLayout, appBarLayout, i8, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9) {
            int iG = g();
            if (iG == i8) {
                ValueAnimator valueAnimator = this.f24249m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f24249m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f24249m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f24249m = valueAnimator3;
                valueAnimator3.setInterpolator(K2.a.DECELERATE_INTERPOLATOR);
                this.f24249m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f24249m.setDuration(Math.min(i9, 600));
            this.f24249m.setIntValues(iG, i8);
            this.f24249m.start();
        }

        private boolean r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.g() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean s(int i8, int i9) {
            return (i8 & i9) == i9;
        }

        private View t(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if ((childAt instanceof P) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View u(AppBarLayout appBarLayout, int i8) {
            int iAbs = Math.abs(i8);
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = appBarLayout.getChildAt(i9);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int v(AppBarLayout appBarLayout, int i8) {
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = appBarLayout.getChildAt(i9);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (s(dVar.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i10 = -i8;
                if (top <= i10 && bottom >= i10) {
                    return i9;
                }
            }
            return -1;
        }

        private int y(AppBarLayout appBarLayout, int i8) {
            int iAbs = Math.abs(i8);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i9);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator scrollInterpolator = dVar.getScrollInterpolator();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i9++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = dVar.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            topInset -= AbstractC0985p0.getMinimumHeight(childAt);
                        }
                    }
                    if (AbstractC0985p0.getFitsSystemWindows(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f8 = topInset;
                        return Integer.signum(i8) * (childAt.getTop() + Math.round(f8 * scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f8)));
                    }
                }
            }
            return i8;
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: A */
        public int k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9, int i10) throws Resources.NotFoundException {
            int iG = g();
            int i11 = 0;
            if (i9 == 0 || iG < i9 || iG > i10) {
                this.f24247k = 0;
            } else {
                int iClamp = X.a.clamp(i8, i9, i10);
                if (iG != iClamp) {
                    int iY = appBarLayout.e() ? y(appBarLayout, iClamp) : iClamp;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iY);
                    i11 = iG - iClamp;
                    this.f24247k = iClamp - iY;
                    if (!topAndBottomOffset && appBarLayout.e()) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.i(getTopAndBottomOffset());
                    E(coordinatorLayout, appBarLayout, iClamp, iClamp < iG ? -1 : 1, false);
                }
            }
            D(coordinatorLayout, appBarLayout);
            return i11;
        }

        @Override // com.google.android.material.appbar.b
        int g() {
            return getTopAndBottomOffset() + this.f24247k;
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: q */
        public boolean b(AppBarLayout appBarLayout) {
            d dVar = this.f24254r;
            if (dVar != null) {
                return dVar.canDrag(appBarLayout);
            }
            WeakReference weakReference = this.f24253q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public void setDragCallback(d dVar) {
            this.f24254r = dVar;
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: w */
        public int e(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: x */
        public int f(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: z */
        public void h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) throws Resources.NotFoundException {
            C(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.n(appBarLayout.p(t(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t8, int i8) throws Resources.NotFoundException {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, (View) t8, i8);
            int pendingAction = t8.getPendingAction();
            int i9 = this.f24250n;
            if (i9 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t8.getChildAt(i9);
                j(coordinatorLayout, t8, (-childAt.getBottom()) + (this.f24251o ? AbstractC0985p0.getMinimumHeight(childAt) + t8.getTopInset() : Math.round(childAt.getHeight() * this.f24252p)));
            } else if (pendingAction != 0) {
                boolean z8 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i10 = -t8.getUpNestedPreScrollRange();
                    if (z8) {
                        o(coordinatorLayout, t8, i10, 0.0f);
                    } else {
                        j(coordinatorLayout, t8, i10);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z8) {
                        o(coordinatorLayout, t8, 0, 0.0f);
                    } else {
                        j(coordinatorLayout, t8, 0);
                    }
                }
            }
            t8.k();
            this.f24250n = -1;
            setTopAndBottomOffset(X.a.clamp(getTopAndBottomOffset(), -t8.getTotalScrollRange(), 0));
            E(coordinatorLayout, t8, getTopAndBottomOffset(), 0, true);
            t8.i(getTopAndBottomOffset());
            D(coordinatorLayout, t8);
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t8, int i8, int i9, int i10, int i11) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t8.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, (View) t8, i8, i9, i10, i11);
            }
            coordinatorLayout.onMeasureChild(t8, i8, i9, View.MeasureSpec.makeMeasureSpec(0, 0), i11);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t8, View view, int i8, int i9, int[] iArr, int i10) throws Resources.NotFoundException {
            int i11;
            int downNestedPreScrollRange;
            if (i9 != 0) {
                if (i9 < 0) {
                    i11 = -t8.getTotalScrollRange();
                    downNestedPreScrollRange = t8.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -t8.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i12 = i11;
                int i13 = downNestedPreScrollRange;
                if (i12 != i13) {
                    iArr[1] = i(coordinatorLayout, t8, i9, i12, i13);
                }
            }
            if (t8.isLiftOnScroll()) {
                t8.n(t8.p(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t8, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            if (i11 < 0) {
                iArr[1] = i(coordinatorLayout, t8, i11, -t8.getDownNestedScrollRange(), 0);
            }
            if (i11 == 0) {
                D(coordinatorLayout, t8);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t8, Parcelable parcelable) {
            if (!(parcelable instanceof e)) {
                super.onRestoreInstanceState(coordinatorLayout, (View) t8, parcelable);
                this.f24250n = -1;
                return;
            }
            e eVar = (e) parcelable;
            super.onRestoreInstanceState(coordinatorLayout, (View) t8, eVar.getSuperState());
            this.f24250n = eVar.f24266b;
            this.f24252p = eVar.f24267c;
            this.f24251o = eVar.f24268d;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t8) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (View) t8);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t8.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = t8.getChildAt(i8);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    e eVar = new e(parcelableOnSaveInstanceState);
                    eVar.f24266b = i8;
                    eVar.f24268d = bottom == AbstractC0985p0.getMinimumHeight(childAt) + t8.getTopInset();
                    eVar.f24267c = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return parcelableOnSaveInstanceState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t8, View view, View view2, int i8, int i9) {
            ValueAnimator valueAnimator;
            boolean z8 = (i8 & 2) != 0 && (t8.isLiftOnScroll() || r(coordinatorLayout, t8, view));
            if (z8 && (valueAnimator = this.f24249m) != null) {
                valueAnimator.cancel();
            }
            this.f24253q = null;
            this.f24248l = i9;
            return z8;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t8, View view, int i8) throws Resources.NotFoundException {
            if (this.f24248l == 0 || i8 == 1) {
                C(coordinatorLayout, t8);
                if (t8.isLiftOnScroll()) {
                    t8.n(t8.p(view));
                }
            }
            this.f24253q = new WeakReference(view);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24250n = -1;
        }

        protected static class e extends AbstractC1087a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* renamed from: b */
            int f24266b;

            /* renamed from: c */
            float f24267c;

            /* renamed from: d */
            boolean f24268d;

            static class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                public e[] newArray(int i8) {
                    return new e[i8];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f24266b = parcel.readInt();
                this.f24267c = parcel.readFloat();
                this.f24268d = parcel.readByte() != 0;
            }

            @Override // c0.AbstractC1087a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i8) {
                super.writeToParcel(parcel, i8);
                parcel.writeInt(this.f24266b);
                parcel.writeFloat(this.f24267c);
                parcel.writeByte(this.f24268d ? (byte) 1 : (byte) 0);
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9, int i10, int i11) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i8, i9, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int i9, int[] iArr, int i10) throws Resources.NotFoundException {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i8, i9, iArr, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i8, i9, i10, i11, i12, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i8, int i9) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i8, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8) throws Resources.NotFoundException {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.d dVar) {
            super.setDragCallback(dVar);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z8) {
            super.setHorizontalOffsetEnabled(z8);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i8) {
            return super.setLeftAndRightOffset(i8);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i8) {
            return super.setTopAndBottomOffset(i8);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z8) {
            super.setVerticalOffsetEnabled(z8);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.c {
        public ScrollingViewBehavior() {
        }

        private static int j(AppBarLayout appBarLayout) {
            CoordinatorLayout.c behavior = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).g();
            }
            return 0;
        }

        private void k(View view, View view2) {
            CoordinatorLayout.c behavior = ((CoordinatorLayout.f) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                AbstractC0985p0.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f24247k) + f()) - c(view2));
            }
        }

        private void l(View view, View view2) throws Resources.NotFoundException {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.n(appBarLayout.p(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.c
        float d(View view) {
            int i8;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iJ = j(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iJ > downNestedPreScrollRange) && (i8 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iJ / i8) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.c
        int e(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.e(view);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.c
        /* renamed from: i */
        public AppBarLayout b(List list) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) list.get(i8);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            k(view, view2);
            l(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC0985p0.removeAccessibilityAction(coordinatorLayout, H.a.ACTION_SCROLL_FORWARD.getId());
                AbstractC0985p0.removeAccessibilityAction(coordinatorLayout, H.a.ACTION_SCROLL_BACKWARD.getId());
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i8) {
            return super.onLayoutChild(coordinatorLayout, view, i8);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
            return super.onMeasureChild(coordinatorLayout, view, i8, i9, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z8) {
            AppBarLayout appBarLayoutB = b(coordinatorLayout.getDependencies(view));
            if (appBarLayoutB != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f24315d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutB.setExpanded(false, !z8);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z8) {
            super.setHorizontalOffsetEnabled(z8);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i8) {
            return super.setLeftAndRightOffset(i8);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i8) {
            return super.setTopAndBottomOffset(i8);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z8) {
            super.setVerticalOffsetEnabled(z8);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements W {
        a() {
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
            return AppBarLayout.this.j(c0950d1);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ g f24270a;

        b(g gVar) {
            this.f24270a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24270a.setElevation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c {
        void onOffsetChanged(AppBarLayout appBarLayout, int i8);
    }

    public interface e extends c {
        @Override // com.google.android.material.appbar.AppBarLayout.c
        void onOffsetChanged(AppBarLayout appBarLayout, int i8);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void a() {
        WeakReference weakReference = this.f24243n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f24243n = null;
    }

    private View b(View view) {
        int i8;
        if (this.f24243n == null && (i8 = this.f24242m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i8) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f24242m);
            }
            if (viewFindViewById != null) {
                this.f24243n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f24243n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean f() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (((d) getChildAt(i8).getLayoutParams()).a()) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        this.f24231b = -1;
        this.f24232c = -1;
        this.f24233d = -1;
    }

    private void l(boolean z8, boolean z9, boolean z10) {
        this.f24235f = (z8 ? 1 : 2) | (z9 ? 4 : 0) | (z10 ? 8 : 0);
        requestLayout();
    }

    private boolean m(boolean z8) {
        if (this.f24239j == z8) {
            return false;
        }
        this.f24239j = z8;
        refreshDrawableState();
        return true;
    }

    private boolean o() {
        return this.f24246q != null && getTopInset() > 0;
    }

    private boolean q() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || AbstractC0985p0.getFitsSystemWindows(childAt)) ? false : true;
    }

    private void r(g gVar, boolean z8) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(J2.d.design_appbar_elevation);
        float f8 = z8 ? 0.0f : dimension;
        if (!z8) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f24244o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f8, dimension);
        this.f24244o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(J2.g.app_bar_elevation_anim_duration));
        this.f24244o.setInterpolator(K2.a.LINEAR_INTERPOLATOR);
        this.f24244o.addUpdateListener(new b(gVar));
        this.f24244o.start();
    }

    private void s() {
        setWillNotDraw(!o());
    }

    public void addOnOffsetChangedListener(c cVar) {
        if (this.f24237h == null) {
            this.f24237h = new ArrayList();
        }
        if (cVar == null || this.f24237h.contains(cVar)) {
            return;
        }
        this.f24237h.add(cVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (o()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f24230a);
            this.f24246q.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f24246q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    boolean e() {
        return this.f24234e;
    }

    boolean g() {
        return getTotalScrollRange() != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i8 = this.f24232c;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = dVar.f24272a;
            if ((i10 & 5) != 5) {
                if (i9 > 0) {
                    break;
                }
            } else {
                int i11 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i10 & 8) != 0) {
                    minimumHeight = AbstractC0985p0.getMinimumHeight(childAt);
                } else if ((i10 & 2) != 0) {
                    minimumHeight = measuredHeight - AbstractC0985p0.getMinimumHeight(childAt);
                } else {
                    iMin = i11 + measuredHeight;
                    if (childCount == 0 && AbstractC0985p0.getFitsSystemWindows(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i9 += iMin;
                }
                iMin = i11 + minimumHeight;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i9 += iMin;
            }
        }
        int iMax = Math.max(0, i9);
        this.f24232c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i8 = this.f24233d;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i10 = dVar.f24272a;
            if ((i10 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i10 & 2) != 0) {
                minimumHeight -= AbstractC0985p0.getMinimumHeight(childAt);
                break;
            }
            i9++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f24233d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f24242m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = AbstractC0985p0.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? AbstractC0985p0.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    int getPendingAction() {
        return this.f24235f;
    }

    public Drawable getStatusBarForeground() {
        return this.f24246q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0950d1 c0950d1 = this.f24236g;
        if (c0950d1 != null) {
            return c0950d1.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i8 = this.f24231b;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = dVar.f24272a;
            if ((i10 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i9 == 0 && AbstractC0985p0.getFitsSystemWindows(childAt)) {
                minimumHeight -= getTopInset();
            }
            if ((i10 & 2) != 0) {
                minimumHeight -= AbstractC0985p0.getMinimumHeight(childAt);
                break;
            }
            i9++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f24231b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    void i(int i8) {
        this.f24230a = i8;
        if (!willNotDraw()) {
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
        List list = this.f24237h;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                c cVar = (c) this.f24237h.get(i9);
                if (cVar != null) {
                    cVar.onOffsetChanged(this, i8);
                }
            }
        }
    }

    public boolean isLiftOnScroll() {
        return this.f24241l;
    }

    public boolean isLifted() {
        return this.f24240k;
    }

    C0950d1 j(C0950d1 c0950d1) {
        C0950d1 c0950d12 = AbstractC0985p0.getFitsSystemWindows(this) ? c0950d1 : null;
        if (!Z.c.equals(this.f24236g, c0950d12)) {
            this.f24236g = c0950d12;
            s();
            requestLayout();
        }
        return c0950d1;
    }

    void k() {
        this.f24235f = 0;
    }

    boolean n(boolean z8) throws Resources.NotFoundException {
        if (this.f24240k == z8) {
            return false;
        }
        this.f24240k = z8;
        refreshDrawableState();
        if (!this.f24241l || !(getBackground() instanceof g)) {
            return true;
        }
        r((g) getBackground(), z8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        if (this.f24245p == null) {
            this.f24245p = new int[4];
        }
        int[] iArr = this.f24245p;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i8 + iArr.length);
        boolean z8 = this.f24239j;
        int i9 = J2.b.state_liftable;
        if (!z8) {
            i9 = -i9;
        }
        iArr[0] = i9;
        iArr[1] = (z8 && this.f24240k) ? J2.b.state_lifted : -J2.b.state_lifted;
        int i10 = J2.b.state_collapsible;
        if (!z8) {
            i10 = -i10;
        }
        iArr[2] = i10;
        iArr[3] = (z8 && this.f24240k) ? J2.b.state_collapsed : -J2.b.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        boolean z9 = true;
        if (AbstractC0985p0.getFitsSystemWindows(this) && q()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC0985p0.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        h();
        this.f24234e = false;
        int childCount2 = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i12).getLayoutParams()).getScrollInterpolator() != null) {
                this.f24234e = true;
                break;
            }
            i12++;
        }
        Drawable drawable = this.f24246q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f24238i) {
            return;
        }
        if (!this.f24241l && !f()) {
            z9 = false;
        }
        m(z9);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != 1073741824 && AbstractC0985p0.getFitsSystemWindows(this) && q()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = X.a.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i9));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        h();
    }

    boolean p(View view) {
        View viewB = b(view);
        if (viewB != null) {
            view = viewB;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void removeOnOffsetChangedListener(c cVar) {
        List list = this.f24237h;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        h.setElevation(this, f8);
    }

    public void setExpanded(boolean z8) {
        setExpanded(z8, AbstractC0985p0.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z8) {
        this.f24241l = z8;
    }

    public void setLiftOnScrollTargetViewId(int i8) {
        this.f24242m = i8;
        a();
    }

    public boolean setLiftable(boolean z8) {
        this.f24238i = true;
        return m(z8);
    }

    public boolean setLifted(boolean z8) {
        return n(z8);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i8) {
        if (i8 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i8);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f24246q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f24246q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f24246q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.setLayoutDirection(this.f24246q, AbstractC0985p0.getLayoutDirection(this));
                this.f24246q.setVisible(getVisibility() == 0, false);
                this.f24246q.setCallback(this);
            }
            s();
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(int i8) {
        setStatusBarForeground(new ColorDrawable(i8));
    }

    public void setStatusBarForegroundResource(int i8) {
        setStatusBarForeground(AbstractC5638a.getDrawable(getContext(), i8));
    }

    @Deprecated
    public void setTargetElevation(float f8) {
        f.b(this, f8);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f24246q;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24246q;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.appBarLayoutStyle);
    }

    public void setExpanded(boolean z8, boolean z9) {
        l(z8, z9, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24229r;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24231b = -1;
        this.f24232c = -1;
        this.f24233d = -1;
        this.f24235f = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i10 = Build.VERSION.SDK_INT;
        f.a(this);
        f.c(this, attributeSet, i8, i9);
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.AppBarLayout, i8, i9, new int[0]);
        AbstractC0985p0.setBackground(this, typedArrayObtainStyledAttributes.getDrawable(l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            g gVar = new g();
            gVar.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.initializeElevationOverlay(context2);
            AbstractC0985p0.setBackground(this, gVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.AppBarLayout_expanded)) {
            l(typedArrayObtainStyledAttributes.getBoolean(l.AppBarLayout_expanded, false), false, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.AppBarLayout_elevation)) {
            f.b(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(l.AppBarLayout_elevation, 0));
        }
        if (i10 >= 26) {
            if (typedArrayObtainStyledAttributes.hasValue(l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayObtainStyledAttributes.hasValue(l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f24241l = typedArrayObtainStyledAttributes.getBoolean(l.AppBarLayout_liftOnScroll, false);
        this.f24242m = typedArrayObtainStyledAttributes.getResourceId(l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(l.AppBarLayout_statusBarForeground));
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0985p0.setOnApplyWindowInsetsListener(this, new a());
    }

    public void removeOnOffsetChangedListener(e eVar) {
        removeOnOffsetChangedListener((c) eVar);
    }

    public void addOnOffsetChangedListener(e eVar) {
        addOnOffsetChangedListener((c) eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public static class d extends LinearLayout.LayoutParams {
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;

        /* renamed from: a */
        int f24272a;

        /* renamed from: b */
        Interpolator f24273b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24272a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.AppBarLayout_Layout);
            this.f24272a = typedArrayObtainStyledAttributes.getInt(l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (typedArrayObtainStyledAttributes.hasValue(l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f24273b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a() {
            int i8 = this.f24272a;
            return (i8 & 1) == 1 && (i8 & 10) != 0;
        }

        public int getScrollFlags() {
            return this.f24272a;
        }

        public Interpolator getScrollInterpolator() {
            return this.f24273b;
        }

        public void setScrollFlags(int i8) {
            this.f24272a = i8;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.f24273b = interpolator;
        }

        public d(int i8, int i9) {
            super(i8, i9);
            this.f24272a = 1;
        }

        public d(int i8, int i9, float f8) {
            super(i8, i9, f8);
            this.f24272a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24272a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24272a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24272a = 1;
        }

        public d(d dVar) {
            super((LinearLayout.LayoutParams) dVar);
            this.f24272a = 1;
            this.f24272a = dVar.f24272a;
            this.f24273b = dVar.f24273b;
        }
    }
}
