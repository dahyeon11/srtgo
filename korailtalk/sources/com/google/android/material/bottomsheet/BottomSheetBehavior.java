package com.google.android.material.bottomsheet;

import J2.j;
import J2.k;
import J2.l;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.O;
import c0.AbstractC1087a;
import com.google.android.material.internal.o;
import d0.C5301c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {
    public static final int PEEK_HEIGHT_AUTO = -1;

    /* renamed from: R */
    private static final int f24403R = k.Widget_Design_BottomSheet_Modal;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    /* renamed from: A */
    C5301c f24404A;

    /* renamed from: B */
    private boolean f24405B;

    /* renamed from: C */
    private int f24406C;

    /* renamed from: D */
    private boolean f24407D;

    /* renamed from: E */
    private int f24408E;

    /* renamed from: F */
    int f24409F;

    /* renamed from: G */
    int f24410G;

    /* renamed from: H */
    WeakReference f24411H;

    /* renamed from: I */
    WeakReference f24412I;

    /* renamed from: J */
    private final ArrayList f24413J;

    /* renamed from: K */
    private VelocityTracker f24414K;

    /* renamed from: L */
    int f24415L;

    /* renamed from: M */
    private int f24416M;

    /* renamed from: N */
    boolean f24417N;

    /* renamed from: O */
    private Map f24418O;

    /* renamed from: P */
    private int f24419P;

    /* renamed from: Q */
    private final C5301c.AbstractC0272c f24420Q;

    /* renamed from: a */
    private int f24421a;

    /* renamed from: b */
    private boolean f24422b;

    /* renamed from: c */
    private boolean f24423c;

    /* renamed from: d */
    private float f24424d;

    /* renamed from: e */
    private int f24425e;

    /* renamed from: f */
    private boolean f24426f;

    /* renamed from: g */
    private int f24427g;

    /* renamed from: h */
    private int f24428h;

    /* renamed from: i */
    private boolean f24429i;

    /* renamed from: j */
    private a3.g f24430j;

    /* renamed from: k */
    private int f24431k;

    /* renamed from: l */
    private boolean f24432l;

    /* renamed from: m */
    private a3.k f24433m;

    /* renamed from: n */
    private boolean f24434n;

    /* renamed from: o */
    private h f24435o;

    /* renamed from: p */
    private ValueAnimator f24436p;

    /* renamed from: q */
    int f24437q;

    /* renamed from: r */
    int f24438r;

    /* renamed from: s */
    int f24439s;

    /* renamed from: t */
    float f24440t;

    /* renamed from: u */
    int f24441u;

    /* renamed from: v */
    float f24442v;

    /* renamed from: w */
    boolean f24443w;

    /* renamed from: x */
    private boolean f24444x;

    /* renamed from: y */
    private boolean f24445y;

    /* renamed from: z */
    int f24446z;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f24447a;

        /* renamed from: b */
        final /* synthetic */ int f24448b;

        a(View view, int i8) {
            this.f24447a = view;
            this.f24448b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.x(this.f24447a, this.f24448b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f24430j != null) {
                BottomSheetBehavior.this.f24430j.setInterpolation(fFloatValue);
            }
        }
    }

    class c implements o.e {
        c() {
        }

        @Override // com.google.android.material.internal.o.e
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1, o.f fVar) {
            BottomSheetBehavior.this.f24431k = c0950d1.getMandatorySystemGestureInsets().bottom;
            BottomSheetBehavior.this.E(false);
            return c0950d1;
        }
    }

    class d extends C5301c.AbstractC0272c {
        d() {
        }

        private boolean a(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f24410G + bottomSheetBehavior.getExpandedOffset()) / 2;
        }

        @Override // d0.C5301c.AbstractC0272c
        public int clampViewPositionHorizontal(View view, int i8, int i9) {
            return view.getLeft();
        }

        @Override // d0.C5301c.AbstractC0272c
        public int clampViewPositionVertical(View view, int i8, int i9) {
            int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return X.a.clamp(i8, expandedOffset, bottomSheetBehavior.f24443w ? bottomSheetBehavior.f24410G : bottomSheetBehavior.f24441u);
        }

        @Override // d0.C5301c.AbstractC0272c
        public int getViewVerticalDragRange(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f24443w ? bottomSheetBehavior.f24410G : bottomSheetBehavior.f24441u;
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewDragStateChanged(int i8) {
            if (i8 == 1 && BottomSheetBehavior.this.f24445y) {
                BottomSheetBehavior.this.v(1);
            }
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewPositionChanged(View view, int i8, int i9, int i10, int i11) {
            BottomSheetBehavior.this.p(i9);
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewReleased(View view, float f8, float f9) {
            int i8;
            int i9 = 6;
            if (f9 < 0.0f) {
                if (BottomSheetBehavior.this.f24422b) {
                    i8 = BottomSheetBehavior.this.f24438r;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i10 = bottomSheetBehavior.f24439s;
                    if (top > i10) {
                        i8 = i10;
                    } else {
                        i8 = bottomSheetBehavior.f24437q;
                    }
                }
                i9 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f24443w && bottomSheetBehavior2.z(view, f9)) {
                    if ((Math.abs(f8) >= Math.abs(f9) || f9 <= 500.0f) && !a(view)) {
                        if (BottomSheetBehavior.this.f24422b) {
                            i8 = BottomSheetBehavior.this.f24438r;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f24437q) < Math.abs(view.getTop() - BottomSheetBehavior.this.f24439s)) {
                            i8 = BottomSheetBehavior.this.f24437q;
                        } else {
                            i8 = BottomSheetBehavior.this.f24439s;
                        }
                        i9 = 3;
                    } else {
                        i8 = BottomSheetBehavior.this.f24410G;
                        i9 = 5;
                    }
                } else if (f9 == 0.0f || Math.abs(f8) > Math.abs(f9)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f24422b) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior3.f24439s;
                        if (top2 < i11) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.f24441u)) {
                                i8 = BottomSheetBehavior.this.f24437q;
                                i9 = 3;
                            } else {
                                i8 = BottomSheetBehavior.this.f24439s;
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - BottomSheetBehavior.this.f24441u)) {
                            i8 = BottomSheetBehavior.this.f24439s;
                        } else {
                            i8 = BottomSheetBehavior.this.f24441u;
                            i9 = 4;
                        }
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.f24438r) < Math.abs(top2 - BottomSheetBehavior.this.f24441u)) {
                        i8 = BottomSheetBehavior.this.f24438r;
                        i9 = 3;
                    } else {
                        i8 = BottomSheetBehavior.this.f24441u;
                        i9 = 4;
                    }
                } else {
                    if (BottomSheetBehavior.this.f24422b) {
                        i8 = BottomSheetBehavior.this.f24441u;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.f24439s) < Math.abs(top3 - BottomSheetBehavior.this.f24441u)) {
                            i8 = BottomSheetBehavior.this.f24439s;
                        } else {
                            i8 = BottomSheetBehavior.this.f24441u;
                        }
                    }
                    i9 = 4;
                }
            }
            BottomSheetBehavior.this.A(view, i9, i8, true);
        }

        @Override // d0.C5301c.AbstractC0272c
        public boolean tryCaptureView(View view, int i8) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i9 = bottomSheetBehavior.f24446z;
            if (i9 == 1 || bottomSheetBehavior.f24417N) {
                return false;
            }
            if (i9 == 3 && bottomSheetBehavior.f24415L == i8) {
                WeakReference weakReference = bottomSheetBehavior.f24412I;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference weakReference2 = BottomSheetBehavior.this.f24411H;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements O {

        /* renamed from: a */
        final /* synthetic */ int f24453a;

        e(int i8) {
            this.f24453a = i8;
        }

        @Override // androidx.core.view.accessibility.O
        public boolean perform(View view, O.a aVar) {
            BottomSheetBehavior.this.setState(this.f24453a);
            return true;
        }
    }

    public static abstract class f {
        public abstract void onSlide(View view, float f8);

        public abstract void onStateChanged(View view, int i8);
    }

    protected static class g extends AbstractC1087a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b */
        final int f24455b;

        /* renamed from: c */
        int f24456c;

        /* renamed from: d */
        boolean f24457d;

        /* renamed from: e */
        boolean f24458e;

        /* renamed from: f */
        boolean f24459f;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i8) {
                return new g[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f24455b);
            parcel.writeInt(this.f24456c);
            parcel.writeInt(this.f24457d ? 1 : 0);
            parcel.writeInt(this.f24458e ? 1 : 0);
            parcel.writeInt(this.f24459f ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24455b = parcel.readInt();
            this.f24456c = parcel.readInt();
            this.f24457d = parcel.readInt() == 1;
            this.f24458e = parcel.readInt() == 1;
            this.f24459f = parcel.readInt() == 1;
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f24455b = bottomSheetBehavior.f24446z;
            this.f24456c = ((BottomSheetBehavior) bottomSheetBehavior).f24425e;
            this.f24457d = ((BottomSheetBehavior) bottomSheetBehavior).f24422b;
            this.f24458e = bottomSheetBehavior.f24443w;
            this.f24459f = ((BottomSheetBehavior) bottomSheetBehavior).f24444x;
        }

        @Deprecated
        public g(Parcelable parcelable, int i8) {
            super(parcelable);
            this.f24455b = i8;
        }
    }

    private class h implements Runnable {

        /* renamed from: a */
        private final View f24460a;

        /* renamed from: b */
        private boolean f24461b;

        /* renamed from: c */
        int f24462c;

        h(View view, int i8) {
            this.f24460a = view;
            this.f24462c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5301c c5301c = BottomSheetBehavior.this.f24404A;
            if (c5301c == null || !c5301c.continueSettling(true)) {
                BottomSheetBehavior.this.v(this.f24462c);
            } else {
                AbstractC0985p0.postOnAnimation(this.f24460a, this);
            }
            this.f24461b = false;
        }
    }

    public BottomSheetBehavior() {
        this.f24421a = 0;
        this.f24422b = true;
        this.f24423c = false;
        this.f24435o = null;
        this.f24440t = 0.5f;
        this.f24442v = -1.0f;
        this.f24445y = true;
        this.f24446z = 4;
        this.f24413J = new ArrayList();
        this.f24419P = -1;
        this.f24420Q = new d();
    }

    private void B() {
        View view;
        WeakReference weakReference = this.f24411H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0985p0.removeAccessibilityAction(view, 524288);
        AbstractC0985p0.removeAccessibilityAction(view, 262144);
        AbstractC0985p0.removeAccessibilityAction(view, 1048576);
        int i8 = this.f24419P;
        if (i8 != -1) {
            AbstractC0985p0.removeAccessibilityAction(view, i8);
        }
        if (this.f24446z != 6) {
            this.f24419P = h(view, j.bottomsheet_action_expand_halfway, 6);
        }
        if (this.f24443w && this.f24446z != 5) {
            s(view, H.a.ACTION_DISMISS, 5);
        }
        int i9 = this.f24446z;
        if (i9 == 3) {
            s(view, H.a.ACTION_COLLAPSE, this.f24422b ? 4 : 6);
            return;
        }
        if (i9 == 4) {
            s(view, H.a.ACTION_EXPAND, this.f24422b ? 3 : 6);
        } else {
            if (i9 != 6) {
                return;
            }
            s(view, H.a.ACTION_COLLAPSE, 4);
            s(view, H.a.ACTION_EXPAND, 3);
        }
    }

    private void C(int i8) {
        ValueAnimator valueAnimator;
        if (i8 == 2) {
            return;
        }
        boolean z8 = i8 == 3;
        if (this.f24434n != z8) {
            this.f24434n = z8;
            if (this.f24430j == null || (valueAnimator = this.f24436p) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f24436p.reverse();
                return;
            }
            float f8 = z8 ? 0.0f : 1.0f;
            this.f24436p.setFloatValues(1.0f - f8, f8);
            this.f24436p.start();
        }
    }

    private void D(boolean z8) {
        Map map;
        WeakReference weakReference = this.f24411H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                if (this.f24418O != null) {
                    return;
                } else {
                    this.f24418O = new HashMap(childCount);
                }
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if (childAt != this.f24411H.get()) {
                    if (z8) {
                        this.f24418O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f24423c) {
                            AbstractC0985p0.setImportantForAccessibility(childAt, 4);
                        }
                    } else if (this.f24423c && (map = this.f24418O) != null && map.containsKey(childAt)) {
                        AbstractC0985p0.setImportantForAccessibility(childAt, ((Integer) this.f24418O.get(childAt)).intValue());
                    }
                }
            }
            if (!z8) {
                this.f24418O = null;
            } else if (this.f24423c) {
                ((View) this.f24411H.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public void E(boolean z8) {
        View view;
        if (this.f24411H != null) {
            i();
            if (this.f24446z != 4 || (view = (View) this.f24411H.get()) == null) {
                return;
            }
            if (z8) {
                y(this.f24446z);
            } else {
                view.requestLayout();
            }
        }
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v8) {
        ViewGroup.LayoutParams layoutParams = v8.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c behavior = ((CoordinatorLayout.f) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int h(View view, int i8, int i9) {
        return AbstractC0985p0.addAccessibilityAction(view, view.getResources().getString(i8), l(i9));
    }

    private void i() {
        int iK = k();
        if (this.f24422b) {
            this.f24441u = Math.max(this.f24410G - iK, this.f24438r);
        } else {
            this.f24441u = this.f24410G - iK;
        }
    }

    private void j() {
        this.f24439s = (int) (this.f24410G * (1.0f - this.f24440t));
    }

    private int k() {
        int i8;
        return this.f24426f ? Math.min(Math.max(this.f24427g, this.f24410G - ((this.f24409F * 9) / 16)), this.f24408E) : (this.f24432l || (i8 = this.f24431k) <= 0) ? this.f24425e : Math.max(this.f24425e, i8 + this.f24428h);
    }

    private O l(int i8) {
        return new e(i8);
    }

    private void m(Context context, AttributeSet attributeSet, boolean z8) {
        n(context, attributeSet, z8, null);
    }

    private void n(Context context, AttributeSet attributeSet, boolean z8, ColorStateList colorStateList) {
        if (this.f24429i) {
            this.f24433m = a3.k.builder(context, attributeSet, J2.b.bottomSheetStyle, f24403R).build();
            a3.g gVar = new a3.g(this.f24433m);
            this.f24430j = gVar;
            gVar.initializeElevationOverlay(context);
            if (z8 && colorStateList != null) {
                this.f24430j.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f24430j.setTint(typedValue.data);
        }
    }

    private void o() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f24436p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f24436p.addUpdateListener(new b());
    }

    private float r() {
        VelocityTracker velocityTracker = this.f24414K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f24424d);
        return this.f24414K.getYVelocity(this.f24415L);
    }

    private void s(View view, H.a aVar, int i8) {
        AbstractC0985p0.replaceAccessibilityAction(view, aVar, null, l(i8));
    }

    private void t() {
        this.f24415L = -1;
        VelocityTracker velocityTracker = this.f24414K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24414K = null;
        }
    }

    private void u(g gVar) {
        int i8 = this.f24421a;
        if (i8 == 0) {
            return;
        }
        if (i8 == -1 || (i8 & 1) == 1) {
            this.f24425e = gVar.f24456c;
        }
        if (i8 == -1 || (i8 & 2) == 2) {
            this.f24422b = gVar.f24457d;
        }
        if (i8 == -1 || (i8 & 4) == 4) {
            this.f24443w = gVar.f24458e;
        }
        if (i8 == -1 || (i8 & 8) == 8) {
            this.f24444x = gVar.f24459f;
        }
    }

    private void w(View view) {
        if (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.f24426f) {
            return;
        }
        o.doOnApplyWindowInsets(view, new c());
    }

    private void y(int i8) {
        View view = (View) this.f24411H.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && AbstractC0985p0.isAttachedToWindow(view)) {
            view.post(new a(view, i8));
        } else {
            x(view, i8);
        }
    }

    void A(View view, int i8, int i9, boolean z8) {
        C5301c c5301c = this.f24404A;
        if (c5301c == null || (!z8 ? c5301c.smoothSlideViewTo(view, view.getLeft(), i9) : c5301c.settleCapturedViewAt(view.getLeft(), i9))) {
            v(i8);
            return;
        }
        v(2);
        C(i8);
        if (this.f24435o == null) {
            this.f24435o = new h(view, i8);
        }
        if (this.f24435o.f24461b) {
            this.f24435o.f24462c = i8;
            return;
        }
        h hVar = this.f24435o;
        hVar.f24462c = i8;
        AbstractC0985p0.postOnAnimation(view, hVar);
        this.f24435o.f24461b = true;
    }

    public void addBottomSheetCallback(f fVar) {
        if (this.f24413J.contains(fVar)) {
            return;
        }
        this.f24413J.add(fVar);
    }

    public void disableShapeAnimations() {
        this.f24436p = null;
    }

    public int getExpandedOffset() {
        return this.f24422b ? this.f24438r : this.f24437q;
    }

    public float getHalfExpandedRatio() {
        return this.f24440t;
    }

    public int getPeekHeight() {
        if (this.f24426f) {
            return -1;
        }
        return this.f24425e;
    }

    public int getSaveFlags() {
        return this.f24421a;
    }

    public boolean getSkipCollapsed() {
        return this.f24444x;
    }

    public int getState() {
        return this.f24446z;
    }

    public boolean isDraggable() {
        return this.f24445y;
    }

    public boolean isFitToContents() {
        return this.f24422b;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f24432l;
    }

    public boolean isHideable() {
        return this.f24443w;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.f24411H = null;
        this.f24404A = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f24411H = null;
        this.f24404A = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        C5301c c5301c;
        if (!v8.isShown() || !this.f24445y) {
            this.f24405B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t();
        }
        if (this.f24414K == null) {
            this.f24414K = VelocityTracker.obtain();
        }
        this.f24414K.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x8 = (int) motionEvent.getX();
            this.f24416M = (int) motionEvent.getY();
            if (this.f24446z != 2) {
                WeakReference weakReference = this.f24412I;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x8, this.f24416M)) {
                    this.f24415L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f24417N = true;
                }
            }
            this.f24405B = this.f24415L == -1 && !coordinatorLayout.isPointInChildBounds(v8, x8, this.f24416M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f24417N = false;
            this.f24415L = -1;
            if (this.f24405B) {
                this.f24405B = false;
                return false;
            }
        }
        if (!this.f24405B && (c5301c = this.f24404A) != null && c5301c.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f24412I;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f24405B || this.f24446z == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f24404A == null || Math.abs(((float) this.f24416M) - motionEvent.getY()) <= ((float) this.f24404A.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        a3.g gVar;
        if (AbstractC0985p0.getFitsSystemWindows(coordinatorLayout) && !AbstractC0985p0.getFitsSystemWindows(v8)) {
            v8.setFitsSystemWindows(true);
        }
        if (this.f24411H == null) {
            this.f24427g = coordinatorLayout.getResources().getDimensionPixelSize(J2.d.design_bottom_sheet_peek_height_min);
            w(v8);
            this.f24411H = new WeakReference(v8);
            if (this.f24429i && (gVar = this.f24430j) != null) {
                AbstractC0985p0.setBackground(v8, gVar);
            }
            a3.g gVar2 = this.f24430j;
            if (gVar2 != null) {
                float elevation = this.f24442v;
                if (elevation == -1.0f) {
                    elevation = AbstractC0985p0.getElevation(v8);
                }
                gVar2.setElevation(elevation);
                boolean z8 = this.f24446z == 3;
                this.f24434n = z8;
                this.f24430j.setInterpolation(z8 ? 0.0f : 1.0f);
            }
            B();
            if (AbstractC0985p0.getImportantForAccessibility(v8) == 0) {
                AbstractC0985p0.setImportantForAccessibility(v8, 1);
            }
        }
        if (this.f24404A == null) {
            this.f24404A = C5301c.create(coordinatorLayout, this.f24420Q);
        }
        int top = v8.getTop();
        coordinatorLayout.onLayoutChild(v8, i8);
        this.f24409F = coordinatorLayout.getWidth();
        this.f24410G = coordinatorLayout.getHeight();
        int height = v8.getHeight();
        this.f24408E = height;
        this.f24438r = Math.max(0, this.f24410G - height);
        j();
        i();
        int i9 = this.f24446z;
        if (i9 == 3) {
            AbstractC0985p0.offsetTopAndBottom(v8, getExpandedOffset());
        } else if (i9 == 6) {
            AbstractC0985p0.offsetTopAndBottom(v8, this.f24439s);
        } else if (this.f24443w && i9 == 5) {
            AbstractC0985p0.offsetTopAndBottom(v8, this.f24410G);
        } else if (i9 == 4) {
            AbstractC0985p0.offsetTopAndBottom(v8, this.f24441u);
        } else if (i9 == 1 || i9 == 2) {
            AbstractC0985p0.offsetTopAndBottom(v8, top - v8.getTop());
        }
        this.f24412I = new WeakReference(q(v8));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v8, View view, float f8, float f9) {
        WeakReference weakReference = this.f24412I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f24446z != 3 || super.onNestedPreFling(coordinatorLayout, v8, view, f8, f9);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v8, View view, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 1) {
            return;
        }
        WeakReference weakReference = this.f24412I;
        if (view != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = v8.getTop();
        int i11 = top - i9;
        if (i9 > 0) {
            if (i11 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                AbstractC0985p0.offsetTopAndBottom(v8, -expandedOffset);
                v(3);
            } else {
                if (!this.f24445y) {
                    return;
                }
                iArr[1] = i9;
                AbstractC0985p0.offsetTopAndBottom(v8, -i9);
                v(1);
            }
        } else if (i9 < 0 && !view.canScrollVertically(-1)) {
            int i12 = this.f24441u;
            if (i11 > i12 && !this.f24443w) {
                int i13 = top - i12;
                iArr[1] = i13;
                AbstractC0985p0.offsetTopAndBottom(v8, -i13);
                v(4);
            } else {
                if (!this.f24445y) {
                    return;
                }
                iArr[1] = i9;
                AbstractC0985p0.offsetTopAndBottom(v8, -i9);
                v(1);
            }
        }
        p(v8.getTop());
        this.f24406C = i9;
        this.f24407D = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v8, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v8, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v8, gVar.getSuperState());
        u(gVar);
        int i8 = gVar.f24455b;
        if (i8 == 1 || i8 == 2) {
            this.f24446z = 4;
        } else {
            this.f24446z = i8;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v8) {
        return new g(super.onSaveInstanceState(coordinatorLayout, v8), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int i8, int i9) {
        this.f24406C = 0;
        this.f24407D = false;
        return (i8 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v8, View view, int i8) {
        int i9;
        int i10 = 3;
        if (v8.getTop() == getExpandedOffset()) {
            v(3);
            return;
        }
        WeakReference weakReference = this.f24412I;
        if (weakReference != null && view == weakReference.get() && this.f24407D) {
            if (this.f24406C > 0) {
                if (this.f24422b) {
                    i9 = this.f24438r;
                } else {
                    int top = v8.getTop();
                    int i11 = this.f24439s;
                    if (top > i11) {
                        i10 = 6;
                        i9 = i11;
                    } else {
                        i9 = this.f24437q;
                    }
                }
            } else if (this.f24443w && z(v8, r())) {
                i9 = this.f24410G;
                i10 = 5;
            } else if (this.f24406C == 0) {
                int top2 = v8.getTop();
                if (!this.f24422b) {
                    int i12 = this.f24439s;
                    if (top2 < i12) {
                        if (top2 < Math.abs(top2 - this.f24441u)) {
                            i9 = this.f24437q;
                        } else {
                            i9 = this.f24439s;
                        }
                    } else if (Math.abs(top2 - i12) < Math.abs(top2 - this.f24441u)) {
                        i9 = this.f24439s;
                    } else {
                        i9 = this.f24441u;
                        i10 = 4;
                    }
                    i10 = 6;
                } else if (Math.abs(top2 - this.f24438r) < Math.abs(top2 - this.f24441u)) {
                    i9 = this.f24438r;
                } else {
                    i9 = this.f24441u;
                    i10 = 4;
                }
            } else {
                if (this.f24422b) {
                    i9 = this.f24441u;
                } else {
                    int top3 = v8.getTop();
                    if (Math.abs(top3 - this.f24439s) < Math.abs(top3 - this.f24441u)) {
                        i9 = this.f24439s;
                        i10 = 6;
                    } else {
                        i9 = this.f24441u;
                    }
                }
                i10 = 4;
            }
            A(v8, i10, i9, false);
            this.f24407D = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        if (!v8.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f24446z == 1 && actionMasked == 0) {
            return true;
        }
        C5301c c5301c = this.f24404A;
        if (c5301c != null) {
            c5301c.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            t();
        }
        if (this.f24414K == null) {
            this.f24414K = VelocityTracker.obtain();
        }
        this.f24414K.addMovement(motionEvent);
        if (this.f24404A != null && actionMasked == 2 && !this.f24405B && Math.abs(this.f24416M - motionEvent.getY()) > this.f24404A.getTouchSlop()) {
            this.f24404A.captureChildView(v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f24405B;
    }

    void p(int i8) {
        float f8;
        float expandedOffset;
        View view = (View) this.f24411H.get();
        if (view == null || this.f24413J.isEmpty()) {
            return;
        }
        int i9 = this.f24441u;
        if (i8 > i9 || i9 == getExpandedOffset()) {
            int i10 = this.f24441u;
            f8 = i10 - i8;
            expandedOffset = this.f24410G - i10;
        } else {
            int i11 = this.f24441u;
            f8 = i11 - i8;
            expandedOffset = i11 - getExpandedOffset();
        }
        float f9 = f8 / expandedOffset;
        for (int i12 = 0; i12 < this.f24413J.size(); i12++) {
            ((f) this.f24413J.get(i12)).onSlide(view, f9);
        }
    }

    View q(View view) {
        if (AbstractC0985p0.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View viewQ = q(viewGroup.getChildAt(i8));
            if (viewQ != null) {
                return viewQ;
            }
        }
        return null;
    }

    public void removeBottomSheetCallback(f fVar) {
        this.f24413J.remove(fVar);
    }

    @Deprecated
    public void setBottomSheetCallback(f fVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f24413J.clear();
        if (fVar != null) {
            this.f24413J.add(fVar);
        }
    }

    public void setDraggable(boolean z8) {
        this.f24445y = z8;
    }

    public void setExpandedOffset(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f24437q = i8;
    }

    public void setFitToContents(boolean z8) {
        if (this.f24422b == z8) {
            return;
        }
        this.f24422b = z8;
        if (this.f24411H != null) {
            i();
        }
        v((this.f24422b && this.f24446z == 6) ? 3 : this.f24446z);
        B();
    }

    public void setGestureInsetBottomIgnored(boolean z8) {
        this.f24432l = z8;
    }

    public void setHalfExpandedRatio(float f8) {
        if (f8 <= 0.0f || f8 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f24440t = f8;
        if (this.f24411H != null) {
            j();
        }
    }

    public void setHideable(boolean z8) {
        if (this.f24443w != z8) {
            this.f24443w = z8;
            if (!z8 && this.f24446z == 5) {
                setState(4);
            }
            B();
        }
    }

    public void setPeekHeight(int i8) {
        setPeekHeight(i8, false);
    }

    public void setSaveFlags(int i8) {
        this.f24421a = i8;
    }

    public void setSkipCollapsed(boolean z8) {
        this.f24444x = z8;
    }

    public void setState(int i8) {
        if (i8 == this.f24446z) {
            return;
        }
        if (this.f24411H != null) {
            y(i8);
            return;
        }
        if (i8 == 4 || i8 == 3 || i8 == 6 || (this.f24443w && i8 == 5)) {
            this.f24446z = i8;
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z8) {
        this.f24423c = z8;
    }

    void v(int i8) {
        View view;
        if (this.f24446z == i8) {
            return;
        }
        this.f24446z = i8;
        WeakReference weakReference = this.f24411H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i8 == 3) {
            D(true);
        } else if (i8 == 6 || i8 == 5 || i8 == 4) {
            D(false);
        }
        C(i8);
        for (int i9 = 0; i9 < this.f24413J.size(); i9++) {
            ((f) this.f24413J.get(i9)).onStateChanged(view, i8);
        }
        B();
    }

    void x(View view, int i8) {
        int expandedOffset;
        int i9;
        if (i8 == 4) {
            expandedOffset = this.f24441u;
        } else if (i8 == 6) {
            expandedOffset = this.f24439s;
            if (this.f24422b && expandedOffset <= (i9 = this.f24438r)) {
                i8 = 3;
                expandedOffset = i9;
            }
        } else if (i8 == 3) {
            expandedOffset = getExpandedOffset();
        } else {
            if (!this.f24443w || i8 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i8);
            }
            expandedOffset = this.f24410G;
        }
        A(view, i8, expandedOffset, false);
    }

    boolean z(View view, float f8) {
        if (this.f24444x) {
            return true;
        }
        if (view.getTop() < this.f24441u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f8 * 0.1f)) - ((float) this.f24441u)) / ((float) k()) > 0.5f;
    }

    public final void setPeekHeight(int i8, boolean z8) {
        if (i8 == -1) {
            if (this.f24426f) {
                return;
            } else {
                this.f24426f = true;
            }
        } else {
            if (!this.f24426f && this.f24425e == i8) {
                return;
            }
            this.f24426f = false;
            this.f24425e = Math.max(0, i8);
        }
        E(z8);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i8;
        super(context, attributeSet);
        this.f24421a = 0;
        this.f24422b = true;
        this.f24423c = false;
        this.f24435o = null;
        this.f24440t = 0.5f;
        this.f24442v = -1.0f;
        this.f24445y = true;
        this.f24446z = 4;
        this.f24413J = new ArrayList();
        this.f24419P = -1;
        this.f24420Q = new d();
        this.f24428h = context.getResources().getDimensionPixelSize(J2.d.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.BottomSheetBehavior_Layout);
        this.f24429i = typedArrayObtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            n(context, attributeSet, zHasValue, X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, l.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m(context, attributeSet, zHasValue);
        }
        o();
        this.f24442v = typedArrayObtainStyledAttributes.getDimension(l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(l.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i8 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i8);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(l.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f24424d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
