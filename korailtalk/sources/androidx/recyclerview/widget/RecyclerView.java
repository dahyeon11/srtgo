package androidx.recyclerview.widget;

import Q7.X;
import ai.maum.m2u.cdk.MapIf;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.AbstractC0993t0;
import androidx.core.view.C0923a;
import androidx.core.view.InterfaceC0943b0;
import androidx.core.view.M;
import androidx.core.view.N;
import androidx.core.view.O;
import androidx.core.view.Q;
import androidx.core.view.accessibility.AbstractC0927b;
import androidx.core.view.accessibility.H;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import c0.AbstractC1087a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u0.AbstractC6397a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0943b0, N, O {

    /* renamed from: A0 */
    private static final int[] f10233A0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: B0 */
    static final boolean f10234B0 = false;

    /* renamed from: C0 */
    static final boolean f10235C0 = true;

    /* renamed from: D0 */
    static final boolean f10236D0 = true;

    /* renamed from: E0 */
    static final boolean f10237E0 = true;

    /* renamed from: F0 */
    private static final boolean f10238F0 = false;

    /* renamed from: G0 */
    private static final boolean f10239G0 = false;

    /* renamed from: H0 */
    private static final Class[] f10240H0;
    public static final int HORIZONTAL = 0;

    /* renamed from: I0 */
    static final Interpolator f10241I0;
    public static final int INVALID_TYPE = -1;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;

    /* renamed from: A */
    boolean f10242A;

    /* renamed from: B */
    private final AccessibilityManager f10243B;

    /* renamed from: C */
    private List f10244C;

    /* renamed from: D */
    boolean f10245D;

    /* renamed from: E */
    boolean f10246E;

    /* renamed from: F */
    private int f10247F;

    /* renamed from: G */
    private int f10248G;

    /* renamed from: H */
    private l f10249H;

    /* renamed from: I */
    private EdgeEffect f10250I;

    /* renamed from: J */
    private EdgeEffect f10251J;

    /* renamed from: K */
    private EdgeEffect f10252K;

    /* renamed from: L */
    private EdgeEffect f10253L;

    /* renamed from: M */
    m f10254M;

    /* renamed from: N */
    private int f10255N;

    /* renamed from: O */
    private int f10256O;

    /* renamed from: P */
    private VelocityTracker f10257P;

    /* renamed from: Q */
    private int f10258Q;

    /* renamed from: R */
    private int f10259R;

    /* renamed from: S */
    private int f10260S;

    /* renamed from: T */
    private int f10261T;

    /* renamed from: U */
    private int f10262U;

    /* renamed from: V */
    private s f10263V;

    /* renamed from: W */
    private final int f10264W;

    /* renamed from: a */
    private final y f10265a;

    /* renamed from: a0 */
    private final int f10266a0;

    /* renamed from: b */
    final w f10267b;

    /* renamed from: b0 */
    private float f10268b0;

    /* renamed from: c */
    z f10269c;

    /* renamed from: c0 */
    private float f10270c0;

    /* renamed from: d */
    a f10271d;

    /* renamed from: d0 */
    private boolean f10272d0;

    /* renamed from: e */
    b f10273e;

    /* renamed from: e0 */
    final D f10274e0;

    /* renamed from: f */
    final androidx.recyclerview.widget.q f10275f;

    /* renamed from: f0 */
    e f10276f0;

    /* renamed from: g */
    boolean f10277g;

    /* renamed from: g0 */
    e.b f10278g0;

    /* renamed from: h */
    final Runnable f10279h;

    /* renamed from: h0 */
    final B f10280h0;

    /* renamed from: i */
    final Rect f10281i;

    /* renamed from: i0 */
    private u f10282i0;

    /* renamed from: j */
    private final Rect f10283j;

    /* renamed from: j0 */
    private List f10284j0;

    /* renamed from: k */
    final RectF f10285k;

    /* renamed from: k0 */
    boolean f10286k0;

    /* renamed from: l */
    h f10287l;

    /* renamed from: l0 */
    boolean f10288l0;

    /* renamed from: m */
    p f10289m;

    /* renamed from: m0 */
    private m.b f10290m0;

    /* renamed from: n */
    final List f10291n;

    /* renamed from: n0 */
    boolean f10292n0;

    /* renamed from: o */
    final ArrayList f10293o;

    /* renamed from: o0 */
    androidx.recyclerview.widget.l f10294o0;

    /* renamed from: p */
    private final ArrayList f10295p;

    /* renamed from: p0 */
    private final int[] f10296p0;

    /* renamed from: q */
    private t f10297q;

    /* renamed from: q0 */
    private Q f10298q0;

    /* renamed from: r */
    boolean f10299r;

    /* renamed from: r0 */
    private final int[] f10300r0;

    /* renamed from: s */
    boolean f10301s;

    /* renamed from: s0 */
    private final int[] f10302s0;

    /* renamed from: t */
    boolean f10303t;

    /* renamed from: t0 */
    final int[] f10304t0;

    /* renamed from: u */
    boolean f10305u;

    /* renamed from: u0 */
    final List f10306u0;

    /* renamed from: v */
    private int f10307v;

    /* renamed from: v0 */
    private Runnable f10308v0;

    /* renamed from: w */
    boolean f10309w;

    /* renamed from: w0 */
    private boolean f10310w0;

    /* renamed from: x */
    boolean f10311x;

    /* renamed from: x0 */
    private int f10312x0;

    /* renamed from: y */
    private boolean f10313y;

    /* renamed from: y0 */
    private int f10314y0;

    /* renamed from: z */
    private int f10315z;

    /* renamed from: z0 */
    private final q.b f10316z0;

    public static abstract class A {

        /* renamed from: b */
        private RecyclerView f10318b;

        /* renamed from: c */
        private p f10319c;

        /* renamed from: d */
        private boolean f10320d;

        /* renamed from: e */
        private boolean f10321e;

        /* renamed from: f */
        private View f10322f;

        /* renamed from: h */
        private boolean f10324h;

        /* renamed from: a */
        private int f10317a = -1;

        /* renamed from: g */
        private final a f10323g = new a(0, 0);

        public static class a {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;

            /* renamed from: a */
            private int f10325a;

            /* renamed from: b */
            private int f10326b;

            /* renamed from: c */
            private int f10327c;

            /* renamed from: d */
            private int f10328d;

            /* renamed from: e */
            private Interpolator f10329e;

            /* renamed from: f */
            private boolean f10330f;

            /* renamed from: g */
            private int f10331g;

            public a(int i8, int i9) {
                this(i8, i9, Integer.MIN_VALUE, null);
            }

            private void c() {
                if (this.f10329e != null && this.f10327c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f10327c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f10328d >= 0;
            }

            void b(RecyclerView recyclerView) {
                int i8 = this.f10328d;
                if (i8 >= 0) {
                    this.f10328d = -1;
                    recyclerView.g0(i8);
                    this.f10330f = false;
                } else {
                    if (!this.f10330f) {
                        this.f10331g = 0;
                        return;
                    }
                    c();
                    recyclerView.f10274e0.smoothScrollBy(this.f10325a, this.f10326b, this.f10327c, this.f10329e);
                    int i9 = this.f10331g + 1;
                    this.f10331g = i9;
                    if (i9 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f10330f = false;
                }
            }

            public int getDuration() {
                return this.f10327c;
            }

            public int getDx() {
                return this.f10325a;
            }

            public int getDy() {
                return this.f10326b;
            }

            public Interpolator getInterpolator() {
                return this.f10329e;
            }

            public void jumpTo(int i8) {
                this.f10328d = i8;
            }

            public void setDuration(int i8) {
                this.f10330f = true;
                this.f10327c = i8;
            }

            public void setDx(int i8) {
                this.f10330f = true;
                this.f10325a = i8;
            }

            public void setDy(int i8) {
                this.f10330f = true;
                this.f10326b = i8;
            }

            public void setInterpolator(Interpolator interpolator) {
                this.f10330f = true;
                this.f10329e = interpolator;
            }

            public void update(int i8, int i9, int i10, Interpolator interpolator) {
                this.f10325a = i8;
                this.f10326b = i9;
                this.f10327c = i10;
                this.f10329e = interpolator;
                this.f10330f = true;
            }

            public a(int i8, int i9, int i10) {
                this(i8, i9, i10, null);
            }

            public a(int i8, int i9, int i10, Interpolator interpolator) {
                this.f10328d = -1;
                this.f10330f = false;
                this.f10331g = 0;
                this.f10325a = i8;
                this.f10326b = i9;
                this.f10327c = i10;
                this.f10329e = interpolator;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i8);
        }

        protected void a(PointF pointF) {
            float f8 = pointF.x;
            float f9 = pointF.y;
            float fSqrt = (float) Math.sqrt((f8 * f8) + (f9 * f9));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void b(int i8, int i9) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.f10318b;
            if (this.f10317a == -1 || recyclerView == null) {
                i();
            }
            if (this.f10320d && this.f10322f == null && this.f10319c != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.f10317a)) != null) {
                float f8 = pointFComputeScrollVectorForPosition.x;
                if (f8 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.I0((int) Math.signum(f8), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.f10320d = false;
            View view = this.f10322f;
            if (view != null) {
                if (getChildPosition(view) == this.f10317a) {
                    g(this.f10322f, recyclerView.f10280h0, this.f10323g);
                    this.f10323g.b(recyclerView);
                    i();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f10322f = null;
                }
            }
            if (this.f10321e) {
                d(i8, i9, recyclerView.f10280h0, this.f10323g);
                boolean zA = this.f10323g.a();
                this.f10323g.b(recyclerView);
                if (zA && this.f10321e) {
                    this.f10320d = true;
                    recyclerView.f10274e0.c();
                }
            }
        }

        protected void c(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.f10322f = view;
            }
        }

        public PointF computeScrollVectorForPosition(int i8) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i8);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        protected abstract void d(int i8, int i9, B b9, a aVar);

        protected abstract void e();

        protected abstract void f();

        public View findViewByPosition(int i8) {
            return this.f10318b.f10289m.findViewByPosition(i8);
        }

        protected abstract void g(View view, B b9, a aVar);

        public int getChildCount() {
            return this.f10318b.f10289m.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.f10318b.getChildLayoutPosition(view);
        }

        public p getLayoutManager() {
            return this.f10319c;
        }

        public int getTargetPosition() {
            return this.f10317a;
        }

        void h(RecyclerView recyclerView, p pVar) {
            recyclerView.f10274e0.stop();
            if (this.f10324h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f10318b = recyclerView;
            this.f10319c = pVar;
            int i8 = this.f10317a;
            if (i8 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f10280h0.f10332a = i8;
            this.f10321e = true;
            this.f10320d = true;
            this.f10322f = findViewByPosition(getTargetPosition());
            e();
            this.f10318b.f10274e0.c();
            this.f10324h = true;
        }

        protected final void i() {
            if (this.f10321e) {
                this.f10321e = false;
                f();
                this.f10318b.f10280h0.f10332a = -1;
                this.f10322f = null;
                this.f10317a = -1;
                this.f10320d = false;
                this.f10319c.k(this);
                this.f10319c = null;
                this.f10318b = null;
            }
        }

        @Deprecated
        public void instantScrollToPosition(int i8) {
            this.f10318b.scrollToPosition(i8);
        }

        public boolean isPendingInitialRun() {
            return this.f10320d;
        }

        public boolean isRunning() {
            return this.f10321e;
        }

        public void setTargetPosition(int i8) {
            this.f10317a = i8;
        }
    }

    public static class B {

        /* renamed from: b */
        private SparseArray f10333b;

        /* renamed from: m */
        int f10344m;

        /* renamed from: n */
        long f10345n;

        /* renamed from: o */
        int f10346o;

        /* renamed from: p */
        int f10347p;

        /* renamed from: q */
        int f10348q;

        /* renamed from: a */
        int f10332a = -1;

        /* renamed from: c */
        int f10334c = 0;

        /* renamed from: d */
        int f10335d = 0;

        /* renamed from: e */
        int f10336e = 1;

        /* renamed from: f */
        int f10337f = 0;

        /* renamed from: g */
        boolean f10338g = false;

        /* renamed from: h */
        boolean f10339h = false;

        /* renamed from: i */
        boolean f10340i = false;

        /* renamed from: j */
        boolean f10341j = false;

        /* renamed from: k */
        boolean f10342k = false;

        /* renamed from: l */
        boolean f10343l = false;

        void a(int i8) {
            if ((this.f10336e & i8) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i8) + " but it is " + Integer.toBinaryString(this.f10336e));
        }

        void b(h hVar) {
            this.f10336e = 1;
            this.f10337f = hVar.getItemCount();
            this.f10339h = false;
            this.f10340i = false;
            this.f10341j = false;
        }

        public boolean didStructureChange() {
            return this.f10338g;
        }

        public <T> T get(int i8) {
            SparseArray sparseArray = this.f10333b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i8);
        }

        public int getItemCount() {
            return this.f10339h ? this.f10334c - this.f10335d : this.f10337f;
        }

        public int getRemainingScrollHorizontal() {
            return this.f10347p;
        }

        public int getRemainingScrollVertical() {
            return this.f10348q;
        }

        public int getTargetScrollPosition() {
            return this.f10332a;
        }

        public boolean hasTargetScrollPosition() {
            return this.f10332a != -1;
        }

        public boolean isMeasuring() {
            return this.f10341j;
        }

        public boolean isPreLayout() {
            return this.f10339h;
        }

        public void put(int i8, Object obj) {
            if (this.f10333b == null) {
                this.f10333b = new SparseArray();
            }
            this.f10333b.put(i8, obj);
        }

        public void remove(int i8) {
            SparseArray sparseArray = this.f10333b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i8);
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f10332a + ", mData=" + this.f10333b + ", mItemCount=" + this.f10337f + ", mIsMeasuring=" + this.f10341j + ", mPreviousLayoutItemCount=" + this.f10334c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10335d + ", mStructureChanged=" + this.f10338g + ", mInPreLayout=" + this.f10339h + ", mRunSimpleAnimations=" + this.f10342k + ", mRunPredictiveAnimations=" + this.f10343l + '}';
        }

        public boolean willRunPredictiveAnimations() {
            return this.f10343l;
        }

        public boolean willRunSimpleAnimations() {
            return this.f10342k;
        }
    }

    public static abstract class C {
        public abstract View getViewForPositionAndType(w wVar, int i8, int i9);
    }

    class D implements Runnable {

        /* renamed from: a */
        private int f10349a;

        /* renamed from: b */
        private int f10350b;

        /* renamed from: c */
        OverScroller f10351c;

        /* renamed from: d */
        Interpolator f10352d;

        /* renamed from: e */
        private boolean f10353e;

        /* renamed from: f */
        private boolean f10354f;

        D() {
            Interpolator interpolator = RecyclerView.f10241I0;
            this.f10352d = interpolator;
            this.f10353e = false;
            this.f10354f = false;
            this.f10351c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i8, int i9) {
            int iAbs = Math.abs(i8);
            int iAbs2 = Math.abs(i9);
            boolean z8 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z8 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z8) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        }

        private void b() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC0985p0.postOnAnimation(RecyclerView.this, this);
        }

        void c() {
            if (this.f10353e) {
                this.f10354f = true;
            } else {
                b();
            }
        }

        public void fling(int i8, int i9) {
            RecyclerView.this.setScrollState(2);
            this.f10350b = 0;
            this.f10349a = 0;
            Interpolator interpolator = this.f10352d;
            Interpolator interpolator2 = RecyclerView.f10241I0;
            if (interpolator != interpolator2) {
                this.f10352d = interpolator2;
                this.f10351c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f10351c.fling(0, 0, i8, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            c();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10289m == null) {
                stop();
                return;
            }
            this.f10354f = false;
            this.f10353e = true;
            recyclerView.q();
            OverScroller overScroller = this.f10351c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f10349a;
                int i11 = currY - this.f10350b;
                this.f10349a = currX;
                this.f10350b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f10304t0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i10, i11, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f10304t0;
                    i10 -= iArr2[0];
                    i11 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.p(i10, i11);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f10287l != null) {
                    int[] iArr3 = recyclerView3.f10304t0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.I0(i10, i11, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f10304t0;
                    i9 = iArr4[0];
                    i8 = iArr4[1];
                    i10 -= i9;
                    i11 -= i8;
                    A a9 = recyclerView4.f10289m.f10398g;
                    if (a9 != null && !a9.isPendingInitialRun() && a9.isRunning()) {
                        int itemCount = RecyclerView.this.f10280h0.getItemCount();
                        if (itemCount == 0) {
                            a9.i();
                        } else if (a9.getTargetPosition() >= itemCount) {
                            a9.setTargetPosition(itemCount - 1);
                            a9.b(i9, i8);
                        } else {
                            a9.b(i9, i8);
                        }
                    }
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (!RecyclerView.this.f10293o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f10304t0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i9, i8, i10, i11, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f10304t0;
                int i12 = i10 - iArr6[0];
                int i13 = i11 - iArr6[1];
                if (i9 != 0 || i8 != 0) {
                    recyclerView6.C(i9, i8);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z8 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                A a10 = RecyclerView.this.f10289m.f10398g;
                if ((a10 == null || !a10.isPendingInitialRun()) && z8) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i14, currVelocity);
                    }
                    if (RecyclerView.f10237E0) {
                        RecyclerView.this.f10278g0.a();
                    }
                } else {
                    c();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.f10276f0;
                    if (eVar != null) {
                        eVar.e(recyclerView7, i9, i8);
                    }
                }
            }
            A a11 = RecyclerView.this.f10289m.f10398g;
            if (a11 != null && a11.isPendingInitialRun()) {
                a11.b(0, 0);
            }
            this.f10353e = false;
            if (this.f10354f) {
                b();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        public void smoothScrollBy(int i8, int i9, int i10, Interpolator interpolator) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = a(i8, i9);
            }
            int i11 = i10;
            if (interpolator == null) {
                interpolator = RecyclerView.f10241I0;
            }
            if (this.f10352d != interpolator) {
                this.f10352d = interpolator;
                this.f10351c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f10350b = 0;
            this.f10349a = 0;
            RecyclerView.this.setScrollState(2);
            this.f10351c.startScroll(0, 0, i8, i9, i11);
            c();
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f10351c.abortAnimation();
        }
    }

    public static abstract class E {

        /* renamed from: s */
        private static final List f10356s = Collections.emptyList();

        /* renamed from: a */
        WeakReference f10357a;

        /* renamed from: i */
        int f10365i;
        public final View itemView;

        /* renamed from: q */
        RecyclerView f10373q;

        /* renamed from: r */
        h f10374r;

        /* renamed from: b */
        int f10358b = -1;

        /* renamed from: c */
        int f10359c = -1;

        /* renamed from: d */
        long f10360d = -1;

        /* renamed from: e */
        int f10361e = -1;

        /* renamed from: f */
        int f10362f = -1;

        /* renamed from: g */
        E f10363g = null;

        /* renamed from: h */
        E f10364h = null;

        /* renamed from: j */
        List f10366j = null;

        /* renamed from: k */
        List f10367k = null;

        /* renamed from: l */
        private int f10368l = 0;

        /* renamed from: m */
        w f10369m = null;

        /* renamed from: n */
        boolean f10370n = false;

        /* renamed from: o */
        private int f10371o = 0;

        /* renamed from: p */
        int f10372p = -1;

        public E(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void g() {
            if (this.f10366j == null) {
                ArrayList arrayList = new ArrayList();
                this.f10366j = arrayList;
                this.f10367k = Collections.unmodifiableList(arrayList);
            }
        }

        void A(w wVar, boolean z8) {
            this.f10369m = wVar;
            this.f10370n = z8;
        }

        boolean B() {
            return (this.f10365i & 16) != 0;
        }

        boolean C() {
            return (this.f10365i & 128) != 0;
        }

        void D() {
            this.f10365i &= -129;
        }

        void E() {
            this.f10369m.D(this);
        }

        boolean F() {
            return (this.f10365i & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f10365i) == 0) {
                g();
                this.f10366j.add(obj);
            }
        }

        void b(int i8) {
            this.f10365i = i8 | this.f10365i;
        }

        void c() {
            this.f10359c = -1;
            this.f10362f = -1;
        }

        void d() {
            List list = this.f10366j;
            if (list != null) {
                list.clear();
            }
            this.f10365i &= -1025;
        }

        void e() {
            this.f10365i &= -33;
        }

        void f() {
            this.f10365i &= -257;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.f10373q;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.Q(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h getBindingAdapter() {
            return this.f10374r;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iQ;
            if (this.f10374r == null || (recyclerView = this.f10373q) == null || (adapter = recyclerView.getAdapter()) == null || (iQ = this.f10373q.Q(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.f10374r, this, iQ);
        }

        public final long getItemId() {
            return this.f10360d;
        }

        public final int getItemViewType() {
            return this.f10361e;
        }

        public final int getLayoutPosition() {
            int i8 = this.f10362f;
            return i8 == -1 ? this.f10358b : i8;
        }

        public final int getOldPosition() {
            return this.f10359c;
        }

        @Deprecated
        public final int getPosition() {
            int i8 = this.f10362f;
            return i8 == -1 ? this.f10358b : i8;
        }

        boolean h() {
            return (this.f10365i & 16) == 0 && AbstractC0985p0.hasTransientState(this.itemView);
        }

        void i(int i8, int i9, boolean z8) {
            b(8);
            u(i9, z8);
            this.f10358b = i8;
        }

        public final boolean isRecyclable() {
            return (this.f10365i & 16) == 0 && !AbstractC0985p0.hasTransientState(this.itemView);
        }

        List j() {
            if ((this.f10365i & 1024) != 0) {
                return f10356s;
            }
            List list = this.f10366j;
            return (list == null || list.size() == 0) ? f10356s : this.f10367k;
        }

        boolean k(int i8) {
            return (i8 & this.f10365i) != 0;
        }

        boolean l() {
            return (this.f10365i & 512) != 0 || o();
        }

        boolean m() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.f10373q) ? false : true;
        }

        boolean n() {
            return (this.f10365i & 1) != 0;
        }

        boolean o() {
            return (this.f10365i & 4) != 0;
        }

        boolean p() {
            return (this.f10365i & 8) != 0;
        }

        boolean q() {
            return this.f10369m != null;
        }

        boolean r() {
            return (this.f10365i & 256) != 0;
        }

        boolean s() {
            return (this.f10365i & 2) != 0;
        }

        public final void setIsRecyclable(boolean z8) {
            int i8 = this.f10368l;
            int i9 = z8 ? i8 - 1 : i8 + 1;
            this.f10368l = i9;
            if (i9 < 0) {
                this.f10368l = 0;
                Log.e(MapIf.I_VIEW, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z8 && i9 == 1) {
                this.f10365i |= 16;
            } else if (z8 && i9 == 0) {
                this.f10365i &= -17;
            }
        }

        boolean t() {
            return (this.f10365i & 2) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f10358b + " id=" + this.f10360d + ", oldPos=" + this.f10359c + ", pLpos:" + this.f10362f);
            if (q()) {
                sb.append(" scrap ");
                sb.append(this.f10370n ? "[changeScrap]" : "[attachedScrap]");
            }
            if (o()) {
                sb.append(" invalid");
            }
            if (!n()) {
                sb.append(" unbound");
            }
            if (t()) {
                sb.append(" update");
            }
            if (p()) {
                sb.append(" removed");
            }
            if (C()) {
                sb.append(" ignored");
            }
            if (r()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.f10368l + ")");
            }
            if (l()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void u(int i8, boolean z8) {
            if (this.f10359c == -1) {
                this.f10359c = this.f10358b;
            }
            if (this.f10362f == -1) {
                this.f10362f = this.f10358b;
            }
            if (z8) {
                this.f10362f += i8;
            }
            this.f10358b += i8;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f10414c = true;
            }
        }

        void v(RecyclerView recyclerView) {
            int i8 = this.f10372p;
            if (i8 != -1) {
                this.f10371o = i8;
            } else {
                this.f10371o = AbstractC0985p0.getImportantForAccessibility(this.itemView);
            }
            recyclerView.K0(this, 4);
        }

        void w(RecyclerView recyclerView) {
            recyclerView.K0(this, this.f10371o);
            this.f10371o = 0;
        }

        void x() {
            this.f10365i = 0;
            this.f10358b = -1;
            this.f10359c = -1;
            this.f10360d = -1L;
            this.f10362f = -1;
            this.f10368l = 0;
            this.f10363g = null;
            this.f10364h = null;
            d();
            this.f10371o = 0;
            this.f10372p = -1;
            RecyclerView.n(this);
        }

        void y() {
            if (this.f10359c == -1) {
                this.f10359c = this.f10358b;
            }
        }

        void z(int i8, int i9) {
            this.f10365i = (i8 & i9) | (this.f10365i & (~i9));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class RunnableC1028a implements Runnable {
        RunnableC1028a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f10305u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f10299r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f10311x) {
                recyclerView2.f10309w = true;
            } else {
                recyclerView2.q();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class RunnableC1029b implements Runnable {
        RunnableC1029b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f10254M;
            if (mVar != null) {
                mVar.runPendingAnimations();
            }
            RecyclerView.this.f10292n0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class InterpolatorC1030c implements Interpolator {
        InterpolatorC1030c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1031d implements q.b {
        C1031d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void processAppeared(E e8, m.c cVar, m.c cVar2) {
            RecyclerView.this.g(e8, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void processDisappeared(E e8, m.c cVar, m.c cVar2) {
            RecyclerView.this.f10267b.D(e8);
            RecyclerView.this.i(e8, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void processPersistent(E e8, m.c cVar, m.c cVar2) {
            e8.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10245D) {
                if (recyclerView.f10254M.animateChange(e8, e8, cVar, cVar2)) {
                    RecyclerView.this.r0();
                }
            } else if (recyclerView.f10254M.animatePersistence(e8, cVar, cVar2)) {
                RecyclerView.this.r0();
            }
        }

        @Override // androidx.recyclerview.widget.q.b
        public void unused(E e8) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10289m.removeAndRecycleView(e8.itemView, recyclerView.f10267b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1032e implements b.InterfaceC0162b {
        C1032e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void addView(View view, int i8) {
            RecyclerView.this.addView(view, i8);
            RecyclerView.this.u(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void attachViewToParent(View view, int i8, ViewGroup.LayoutParams layoutParams) {
            E eS = RecyclerView.S(view);
            if (eS != null) {
                if (!eS.r() && !eS.C()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + eS + RecyclerView.this.J());
                }
                eS.f();
            }
            RecyclerView.this.attachViewToParent(view, i8, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void detachViewFromParent(int i8) {
            E eS;
            View childAt = getChildAt(i8);
            if (childAt != null && (eS = RecyclerView.S(childAt)) != null) {
                if (eS.r() && !eS.C()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + eS + RecyclerView.this.J());
                }
                eS.b(256);
            }
            RecyclerView.this.detachViewFromParent(i8);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public View getChildAt(int i8) {
            return RecyclerView.this.getChildAt(i8);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public E getChildViewHolder(View view) {
            return RecyclerView.S(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public int indexOfChild(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void onEnteredHiddenState(View view) {
            E eS = RecyclerView.S(view);
            if (eS != null) {
                eS.v(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void onLeftHiddenState(View view) {
            E eS = RecyclerView.S(view);
            if (eS != null) {
                eS.w(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void removeAllViews() {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                RecyclerView.this.v(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0162b
        public void removeViewAt(int i8) {
            View childAt = RecyclerView.this.getChildAt(i8);
            if (childAt != null) {
                RecyclerView.this.v(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i8);
        }
    }

    class f implements a.InterfaceC0161a {
        f() {
        }

        void a(a.b bVar) {
            int i8 = bVar.f10497a;
            if (i8 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f10289m.onItemsAdded(recyclerView, bVar.f10498b, bVar.f10500d);
                return;
            }
            if (i8 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f10289m.onItemsRemoved(recyclerView2, bVar.f10498b, bVar.f10500d);
            } else if (i8 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f10289m.onItemsUpdated(recyclerView3, bVar.f10498b, bVar.f10500d, bVar.f10499c);
            } else {
                if (i8 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f10289m.onItemsMoved(recyclerView4, bVar.f10498b, bVar.f10500d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public E findViewHolder(int i8) {
            E eP = RecyclerView.this.P(i8, true);
            if (eP == null || RecyclerView.this.f10273e.n(eP.itemView)) {
                return null;
            }
            return eP;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void markViewHoldersUpdated(int i8, int i9, Object obj) {
            RecyclerView.this.Q0(i8, i9, obj);
            RecyclerView.this.f10288l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void offsetPositionsForAdd(int i8, int i9) {
            RecyclerView.this.k0(i8, i9);
            RecyclerView.this.f10286k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void offsetPositionsForMove(int i8, int i9) {
            RecyclerView.this.l0(i8, i9);
            RecyclerView.this.f10286k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void offsetPositionsForRemovingInvisible(int i8, int i9) {
            RecyclerView.this.m0(i8, i9, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10286k0 = true;
            recyclerView.f10280h0.f10335d += i9;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void offsetPositionsForRemovingLaidOutOrNewView(int i8, int i9) {
            RecyclerView.this.m0(i8, i9, false);
            RecyclerView.this.f10286k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void onDispatchFirstPass(a.b bVar) {
            a(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0161a
        public void onDispatchSecondPass(a.b bVar) {
            a(bVar);
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f10380a;

        static {
            int[] iArr = new int[h.a.values().length];
            f10380a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10380a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {

        /* renamed from: a */
        private final i f10381a = new i();

        /* renamed from: b */
        private boolean f10382b = false;

        /* renamed from: c */
        private a f10383c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        boolean a() {
            int i8 = g.f10380a[this.f10383c.ordinal()];
            if (i8 != 1) {
                return i8 != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final void bindViewHolder(E e8, int i8) {
            boolean z8 = e8.f10374r == null;
            if (z8) {
                e8.f10358b = i8;
                if (hasStableIds()) {
                    e8.f10360d = getItemId(i8);
                }
                e8.z(1, 519);
                androidx.core.os.q.beginSection("RV OnBindView");
            }
            e8.f10374r = this;
            onBindViewHolder(e8, i8, e8.j());
            if (z8) {
                e8.d();
                ViewGroup.LayoutParams layoutParams = e8.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f10414c = true;
                }
                androidx.core.os.q.endSection();
            }
        }

        public final E createViewHolder(ViewGroup viewGroup, int i8) {
            try {
                androidx.core.os.q.beginSection("RV CreateView");
                E eOnCreateViewHolder = onCreateViewHolder(viewGroup, i8);
                if (eOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                eOnCreateViewHolder.f10361e = i8;
                return eOnCreateViewHolder;
            } finally {
                androidx.core.os.q.endSection();
            }
        }

        public int findRelativeAdapterPositionIn(h hVar, E e8, int i8) {
            if (hVar == this) {
                return i8;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i8) {
            return -1L;
        }

        public int getItemViewType(int i8) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.f10383c;
        }

        public final boolean hasObservers() {
            return this.f10381a.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.f10382b;
        }

        public final void notifyDataSetChanged() {
            this.f10381a.notifyChanged();
        }

        public final void notifyItemChanged(int i8) {
            this.f10381a.notifyItemRangeChanged(i8, 1);
        }

        public final void notifyItemInserted(int i8) {
            this.f10381a.notifyItemRangeInserted(i8, 1);
        }

        public final void notifyItemMoved(int i8, int i9) {
            this.f10381a.notifyItemMoved(i8, i9);
        }

        public final void notifyItemRangeChanged(int i8, int i9) {
            this.f10381a.notifyItemRangeChanged(i8, i9);
        }

        public final void notifyItemRangeInserted(int i8, int i9) {
            this.f10381a.notifyItemRangeInserted(i8, i9);
        }

        public final void notifyItemRangeRemoved(int i8, int i9) {
            this.f10381a.notifyItemRangeRemoved(i8, i9);
        }

        public final void notifyItemRemoved(int i8) {
            this.f10381a.notifyItemRangeRemoved(i8, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(E e8, int i8);

        public void onBindViewHolder(E e8, int i8, List<Object> list) {
            onBindViewHolder(e8, i8);
        }

        public abstract E onCreateViewHolder(ViewGroup viewGroup, int i8);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(E e8) {
            return false;
        }

        public void onViewAttachedToWindow(E e8) {
        }

        public void onViewDetachedFromWindow(E e8) {
        }

        public void onViewRecycled(E e8) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.f10381a.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z8) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f10382b = z8;
        }

        public void setStateRestorationPolicy(a aVar) {
            this.f10383c = aVar;
            this.f10381a.notifyStateRestorationPolicyChanged();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.f10381a.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i8, Object obj) {
            this.f10381a.notifyItemRangeChanged(i8, 1, obj);
        }

        public final void notifyItemRangeChanged(int i8, int i9, Object obj) {
            this.f10381a.notifyItemRangeChanged(i8, i9, obj);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void notifyItemMoved(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i8, i9, 1);
            }
        }

        public void notifyItemRangeChanged(int i8, int i9) {
            notifyItemRangeChanged(i8, i9, null);
        }

        public void notifyItemRangeInserted(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i8, i9);
            }
        }

        public void notifyItemRangeRemoved(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i8, i9);
            }
        }

        public void notifyStateRestorationPolicyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public void notifyItemRangeChanged(int i8, int i9, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i8, i9, obj);
            }
        }
    }

    public static abstract class j {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i8, int i9) {
        }

        public void onItemRangeInserted(int i8, int i9) {
        }

        public void onItemRangeMoved(int i8, int i9, int i10) {
        }

        public void onItemRangeRemoved(int i8, int i9) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i8, int i9, Object obj) {
            onItemRangeChanged(i8, i9);
        }
    }

    public interface k {
    }

    public static class l {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        protected EdgeEffect a(RecyclerView recyclerView, int i8) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;

        /* renamed from: a */
        private b f10385a = null;

        /* renamed from: b */
        private ArrayList f10386b = new ArrayList();

        /* renamed from: c */
        private long f10387c = 120;

        /* renamed from: d */
        private long f10388d = 120;

        /* renamed from: e */
        private long f10389e = 250;

        /* renamed from: f */
        private long f10390f = 250;

        public interface a {
            void a();
        }

        interface b {
            void onAnimationFinished(E e8);
        }

        public static class c {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            public c setFrom(E e8) {
                return setFrom(e8, 0);
            }

            public c setFrom(E e8, int i8) {
                View view = e8.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }

        static int a(E e8) {
            int i8 = e8.f10365i;
            int i9 = i8 & 14;
            if (e8.o()) {
                return 4;
            }
            if ((i8 & 4) != 0) {
                return i9;
            }
            int oldPosition = e8.getOldPosition();
            int absoluteAdapterPosition = e8.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i9 : i9 | 2048;
        }

        public abstract boolean animateAppearance(E e8, c cVar, c cVar2);

        public abstract boolean animateChange(E e8, E e9, c cVar, c cVar2);

        public abstract boolean animateDisappearance(E e8, c cVar, c cVar2);

        public abstract boolean animatePersistence(E e8, c cVar, c cVar2);

        void b(b bVar) {
            this.f10385a = bVar;
        }

        public boolean canReuseUpdatedViewHolder(E e8) {
            return true;
        }

        public final void dispatchAnimationFinished(E e8) {
            onAnimationFinished(e8);
            b bVar = this.f10385a;
            if (bVar != null) {
                bVar.onAnimationFinished(e8);
            }
        }

        public final void dispatchAnimationStarted(E e8) {
            onAnimationStarted(e8);
        }

        public final void dispatchAnimationsFinished() {
            if (this.f10386b.size() <= 0) {
                this.f10386b.clear();
            } else {
                android.support.v4.media.session.f.a(this.f10386b.get(0));
                throw null;
            }
        }

        public abstract void endAnimation(E e8);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.f10387c;
        }

        public long getChangeDuration() {
            return this.f10390f;
        }

        public long getMoveDuration() {
            return this.f10389e;
        }

        public long getRemoveDuration() {
            return this.f10388d;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean zIsRunning = isRunning();
            if (aVar != null) {
                if (zIsRunning) {
                    this.f10386b.add(aVar);
                } else {
                    aVar.a();
                }
            }
            return zIsRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(E e8) {
        }

        public void onAnimationStarted(E e8) {
        }

        public c recordPostLayoutInformation(B b9, E e8) {
            return obtainHolderInfo().setFrom(e8);
        }

        public c recordPreLayoutInformation(B b9, E e8, int i8, List<Object> list) {
            return obtainHolderInfo().setFrom(e8);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j8) {
            this.f10387c = j8;
        }

        public void setChangeDuration(long j8) {
            this.f10390f = j8;
        }

        public void setMoveDuration(long j8) {
            this.f10389e = j8;
        }

        public void setRemoveDuration(long j8) {
            this.f10388d = j8;
        }

        public boolean canReuseUpdatedViewHolder(E e8, List<Object> list) {
            return canReuseUpdatedViewHolder(e8);
        }
    }

    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void onAnimationFinished(E e8) {
            e8.setIsRecyclable(true);
            if (e8.f10363g != null && e8.f10364h == null) {
                e8.f10363g = null;
            }
            e8.f10364h = null;
            if (e8.B() || RecyclerView.this.A0(e8.itemView) || !e8.r()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e8.itemView, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i8, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, B b9) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, B b9) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, B b9) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* renamed from: a */
        androidx.recyclerview.widget.b f10392a;

        /* renamed from: b */
        RecyclerView f10393b;

        /* renamed from: c */
        private final p.b f10394c;

        /* renamed from: d */
        private final p.b f10395d;

        /* renamed from: e */
        androidx.recyclerview.widget.p f10396e;

        /* renamed from: f */
        androidx.recyclerview.widget.p f10397f;

        /* renamed from: g */
        A f10398g;

        /* renamed from: h */
        boolean f10399h;

        /* renamed from: i */
        boolean f10400i;

        /* renamed from: j */
        boolean f10401j;

        /* renamed from: k */
        private boolean f10402k;

        /* renamed from: l */
        private boolean f10403l;

        /* renamed from: m */
        int f10404m;

        /* renamed from: n */
        boolean f10405n;

        /* renamed from: o */
        private int f10406o;

        /* renamed from: p */
        private int f10407p;

        /* renamed from: q */
        private int f10408q;

        /* renamed from: r */
        private int f10409r;

        class a implements p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View getChildAt(int i8) {
                return p.this.getChildAt(i8);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getChildEnd(View view) {
                return p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getChildStart(View view) {
                return p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getParentEnd() {
                return p.this.getWidth() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getParentStart() {
                return p.this.getPaddingLeft();
            }
        }

        class b implements p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View getChildAt(int i8) {
                return p.this.getChildAt(i8);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getChildEnd(View view) {
                return p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getChildStart(View view) {
                return p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getParentEnd() {
                return p.this.getHeight() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int getParentStart() {
                return p.this.getPaddingTop();
            }
        }

        public interface c {
            void addPosition(int i8, int i9);
        }

        public static class d {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        public p() {
            a aVar = new a();
            this.f10394c = aVar;
            b bVar = new b();
            this.f10395d = bVar;
            this.f10396e = new androidx.recyclerview.widget.p(aVar);
            this.f10397f = new androidx.recyclerview.widget.p(bVar);
            this.f10399h = false;
            this.f10400i = false;
            this.f10401j = false;
            this.f10402k = true;
            this.f10403l = true;
        }

        private void a(View view, int i8, boolean z8) {
            E eS = RecyclerView.S(view);
            if (z8 || eS.p()) {
                this.f10393b.f10275f.b(eS);
            } else {
                this.f10393b.f10275f.o(eS);
            }
            q qVar = (q) view.getLayoutParams();
            if (eS.F() || eS.q()) {
                if (eS.q()) {
                    eS.E();
                } else {
                    eS.e();
                }
                this.f10392a.c(view, i8, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f10393b) {
                int iM = this.f10392a.m(view);
                if (i8 == -1) {
                    i8 = this.f10392a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f10393b.indexOfChild(view) + this.f10393b.J());
                }
                if (iM != i8) {
                    this.f10393b.f10289m.moveView(iM, i8);
                }
            } else {
                this.f10392a.a(view, i8, false);
                qVar.f10414c = true;
                A a9 = this.f10398g;
                if (a9 != null && a9.isRunning()) {
                    this.f10398g.c(view);
                }
            }
            if (qVar.f10415d) {
                eS.itemView.invalidate();
                qVar.f10415d = false;
            }
        }

        private void b(int i8, View view) {
            this.f10392a.d(i8);
        }

        public static int chooseSize(int i8, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i9, i10) : size : Math.min(size, Math.max(i9, i10));
        }

        private int[] e(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i8 = left - paddingLeft;
            int iMin = Math.min(0, i8);
            int i9 = top - paddingTop;
            int iMin2 = Math.min(0, i9);
            int i10 = iWidth - width;
            int iMax = Math.max(0, i10);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i8, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i10);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i9, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private boolean g(RecyclerView recyclerView, int i8, int i9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.f10393b.f10281i;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i8 < width && rect.right - i8 > paddingLeft && rect.top - i9 < height && rect.bottom - i9 > paddingTop;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:24:0x0010, B:28:0x0016, B:21:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x000e  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i8, int i9) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.c.RecyclerView, i8, i9);
            dVar.orientation = typedArrayObtainStyledAttributes.getInt(u0.c.RecyclerView_android_orientation, 1);
            dVar.spanCount = typedArrayObtainStyledAttributes.getInt(u0.c.RecyclerView_spanCount, 1);
            dVar.reverseLayout = typedArrayObtainStyledAttributes.getBoolean(u0.c.RecyclerView_reverseLayout, false);
            dVar.stackFromEnd = typedArrayObtainStyledAttributes.getBoolean(u0.c.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private static boolean h(int i8, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (i10 > 0 && i8 != i10) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i8;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i8;
            }
            return true;
        }

        private void o(w wVar, int i8, View view) {
            E eS = RecyclerView.S(view);
            if (eS.C()) {
                return;
            }
            if (eS.o() && !eS.p() && !this.f10393b.f10287l.hasStableIds()) {
                removeViewAt(i8);
                wVar.x(eS);
            } else {
                detachViewAt(i8);
                wVar.y(view);
                this.f10393b.f10275f.onViewDetached(eS);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                recyclerView.j(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                recyclerView.k(str);
            }
        }

        public void attachView(View view, int i8, q qVar) {
            E eS = RecyclerView.S(view);
            if (eS.p()) {
                this.f10393b.f10275f.b(eS);
            } else {
                this.f10393b.f10275f.o(eS);
            }
            this.f10392a.c(view, i8, qVar, eS.p());
        }

        void c(RecyclerView recyclerView) {
            this.f10400i = true;
            onAttachedToWindow(recyclerView);
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.W(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(q qVar) {
            return qVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i8, int i9, B b9, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i8, c cVar) {
        }

        public int computeHorizontalScrollExtent(B b9) {
            return 0;
        }

        public int computeHorizontalScrollOffset(B b9) {
            return 0;
        }

        public int computeHorizontalScrollRange(B b9) {
            return 0;
        }

        public int computeVerticalScrollExtent(B b9) {
            return 0;
        }

        public int computeVerticalScrollOffset(B b9) {
            return 0;
        }

        public int computeVerticalScrollRange(B b9) {
            return 0;
        }

        void d(RecyclerView recyclerView, w wVar) {
            this.f10400i = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        public void detachAndScrapAttachedViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                o(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, w wVar) {
            o(wVar, this.f10392a.m(view), view);
        }

        public void detachAndScrapViewAt(int i8, w wVar) {
            o(wVar, i8, getChildAt(i8));
        }

        public void detachView(View view) {
            int iM = this.f10392a.m(view);
            if (iM >= 0) {
                b(iM, view);
            }
        }

        public void detachViewAt(int i8) {
            b(i8, getChildAt(i8));
        }

        public void endAnimation(View view) {
            m mVar = this.f10393b.f10254M;
            if (mVar != null) {
                mVar.endAnimation(RecyclerView.S(view));
            }
        }

        boolean f() {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i8).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f10392a.n(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i8) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                E eS = RecyclerView.S(childAt);
                if (eS != null && eS.getLayoutPosition() == i8 && !eS.C() && (this.f10393b.f10280h0.isPreLayout() || !eS.p())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract q generateDefaultLayoutParams();

        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f10413b.bottom;
        }

        public View getChildAt(int i8) {
            androidx.recyclerview.widget.b bVar = this.f10392a;
            if (bVar != null) {
                return bVar.f(i8);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.b bVar = this.f10392a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.f10393b;
            return recyclerView != null && recyclerView.f10277g;
        }

        public int getColumnCountForAccessibility(w wVar, B b9) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.T(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((q) view.getLayoutParams()).f10413b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((q) view.getLayoutParams()).f10413b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f10392a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.f10409r;
        }

        public int getHeightMode() {
            return this.f10407p;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.f10393b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.S(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return AbstractC0985p0.getLayoutDirection(this.f10393b);
        }

        public int getLeftDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f10413b.left;
        }

        public int getMinimumHeight() {
            return AbstractC0985p0.getMinimumHeight(this.f10393b);
        }

        public int getMinimumWidth() {
            return AbstractC0985p0.getMinimumWidth(this.f10393b);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return AbstractC0985p0.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return AbstractC0985p0.getPaddingStart(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((q) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f10413b.right;
        }

        public int getRowCountForAccessibility(w wVar, B b9) {
            return -1;
        }

        public int getSelectionModeForAccessibility(w wVar, B b9) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f10413b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z8, Rect rect) {
            Matrix matrix;
            if (z8) {
                Rect rect2 = ((q) view.getLayoutParams()).f10413b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f10393b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f10393b.f10285k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.f10408q;
        }

        public int getWidthMode() {
            return this.f10406o;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.f10393b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        void i(H h8) {
            RecyclerView recyclerView = this.f10393b;
            onInitializeAccessibilityNodeInfo(recyclerView.f10267b, recyclerView.f10280h0, h8);
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f10393b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f10393b.J());
            }
            E eS = RecyclerView.S(view);
            eS.b(128);
            this.f10393b.f10275f.p(eS);
        }

        public boolean isAttachedToWindow() {
            return this.f10400i;
        }

        public boolean isAutoMeasureEnabled() {
            return this.f10401j;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.f10393b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.f10403l;
        }

        public boolean isLayoutHierarchical(w wVar, B b9) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.f10402k;
        }

        public boolean isSmoothScrolling() {
            A a9 = this.f10398g;
            return a9 != null && a9.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z8, boolean z9) {
            boolean z10 = this.f10396e.b(view, 24579) && this.f10397f.b(view, 24579);
            return z8 ? z10 : !z10;
        }

        void j(View view, H h8) {
            E eS = RecyclerView.S(view);
            if (eS == null || eS.p() || this.f10392a.n(eS.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f10393b;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f10267b, recyclerView.f10280h0, view, h8);
        }

        void k(A a9) {
            if (this.f10398g == a9) {
                this.f10398g = null;
            }
        }

        boolean l(int i8, Bundle bundle) {
            RecyclerView recyclerView = this.f10393b;
            return performAccessibilityAction(recyclerView.f10267b, recyclerView.f10280h0, i8, bundle);
        }

        public void layoutDecorated(View view, int i8, int i9, int i10, int i11) {
            Rect rect = ((q) view.getLayoutParams()).f10413b;
            view.layout(i8 + rect.left, i9 + rect.top, i10 - rect.right, i11 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i8, int i9, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f10413b;
            view.layout(i8 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i9 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i10 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i11 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        boolean m(View view, int i8, Bundle bundle) {
            RecyclerView recyclerView = this.f10393b;
            return performAccessibilityActionForItem(recyclerView.f10267b, recyclerView.f10280h0, view, i8, bundle);
        }

        public void measureChild(View view, int i8, int i9) {
            q qVar = (q) view.getLayoutParams();
            Rect rectW = this.f10393b.W(view);
            int i10 = i8 + rectW.left + rectW.right;
            int i11 = i9 + rectW.top + rectW.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i10, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i11, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (t(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i8, int i9) {
            q qVar = (q) view.getLayoutParams();
            Rect rectW = this.f10393b.W(view);
            int i10 = i8 + rectW.left + rectW.right;
            int i11 = i9 + rectW.top + rectW.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i10, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (t(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i8, int i9) {
            View childAt = getChildAt(i8);
            if (childAt != null) {
                detachViewAt(i8);
                attachView(childAt, i9);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i8 + this.f10393b.toString());
            }
        }

        void n(w wVar) {
            int iH = wVar.h();
            for (int i8 = iH - 1; i8 >= 0; i8--) {
                View viewK = wVar.k(i8);
                E eS = RecyclerView.S(viewK);
                if (!eS.C()) {
                    eS.setIsRecyclable(false);
                    if (eS.r()) {
                        this.f10393b.removeDetachedView(viewK, false);
                    }
                    m mVar = this.f10393b.f10254M;
                    if (mVar != null) {
                        mVar.endAnimation(eS);
                    }
                    eS.setIsRecyclable(true);
                    wVar.u(viewK);
                }
            }
            wVar.d();
            if (iH > 0) {
                this.f10393b.invalidate();
            }
        }

        public void offsetChildrenHorizontal(int i8) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i8);
            }
        }

        public void offsetChildrenVertical(int i8) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i8);
            }
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i8, int i9) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i8, w wVar, B b9) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f10393b;
            onInitializeAccessibilityEvent(recyclerView.f10267b, recyclerView.f10280h0, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(w wVar, B b9, H h8) {
            if (this.f10393b.canScrollVertically(-1) || this.f10393b.canScrollHorizontally(-1)) {
                h8.addAction(8192);
                h8.setScrollable(true);
            }
            if (this.f10393b.canScrollVertically(1) || this.f10393b.canScrollHorizontally(1)) {
                h8.addAction(4096);
                h8.setScrollable(true);
            }
            h8.setCollectionInfo(H.e.obtain(getRowCountForAccessibility(wVar, b9), getColumnCountForAccessibility(wVar, b9), isLayoutHierarchical(wVar, b9), getSelectionModeForAccessibility(wVar, b9)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(w wVar, B b9, View view, H h8) {
        }

        public View onInterceptFocusSearch(View view, int i8) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i8, int i9) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i8, int i9, int i10) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i8, int i9) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i8, int i9) {
        }

        public void onLayoutChildren(w wVar, B b9) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(B b9) {
        }

        public void onMeasure(w wVar, B b9, int i8, int i9) {
            this.f10393b.s(i8, i9);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i8) {
        }

        void p(RecyclerView recyclerView) {
            q(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean performAccessibilityAction(w wVar, B b9, int i8, Bundle bundle) {
            int height;
            int width;
            int i9;
            int i10;
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView == null) {
                return false;
            }
            if (i8 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f10393b.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i9 = height;
                    i10 = width;
                }
                i9 = height;
                i10 = 0;
            } else if (i8 != 8192) {
                i10 = 0;
                i9 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f10393b.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i9 = height;
                    i10 = width;
                }
                i9 = height;
                i10 = 0;
            }
            if (i9 == 0 && i10 == 0) {
                return false;
            }
            this.f10393b.M0(i10, i9, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(w wVar, B b9, View view, int i8, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                AbstractC0985p0.postOnAnimation(recyclerView, runnable);
            }
        }

        void q(int i8, int i9) {
            this.f10408q = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            this.f10406o = mode;
            if (mode == 0 && !RecyclerView.f10235C0) {
                this.f10408q = 0;
            }
            this.f10409r = View.MeasureSpec.getSize(i9);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f10407p = mode2;
            if (mode2 != 0 || RecyclerView.f10235C0) {
                return;
            }
            this.f10409r = 0;
        }

        void r(int i8, int i9) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.f10393b.s(i8, i9);
                return;
            }
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                Rect rect = this.f10393b.f10281i;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i15 = rect.left;
                if (i15 < i13) {
                    i13 = i15;
                }
                int i16 = rect.right;
                if (i16 > i10) {
                    i10 = i16;
                }
                int i17 = rect.top;
                if (i17 < i11) {
                    i11 = i17;
                }
                int i18 = rect.bottom;
                if (i18 > i12) {
                    i12 = i18;
                }
            }
            this.f10393b.f10281i.set(i13, i11, i10, i12);
            setMeasuredDimension(this.f10393b.f10281i, i8, i9);
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.f10392a.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.S(getChildAt(childCount)).C()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        public void removeAndRecycleView(View view, w wVar) {
            removeView(view);
            wVar.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i8, w wVar) {
            View childAt = getChildAt(i8);
            removeViewAt(i8);
            wVar.recycleView(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.f10393b.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.f10392a.p(view);
        }

        public void removeViewAt(int i8) {
            if (getChildAt(i8) != null) {
                this.f10392a.q(i8);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z8) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z8, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.f10399h = true;
        }

        void s(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f10393b = null;
                this.f10392a = null;
                this.f10408q = 0;
                this.f10409r = 0;
            } else {
                this.f10393b = recyclerView;
                this.f10392a = recyclerView.f10273e;
                this.f10408q = recyclerView.getWidth();
                this.f10409r = recyclerView.getHeight();
            }
            this.f10406o = 1073741824;
            this.f10407p = 1073741824;
        }

        public int scrollHorizontallyBy(int i8, w wVar, B b9) {
            return 0;
        }

        public void scrollToPosition(int i8) {
        }

        public int scrollVerticallyBy(int i8, w wVar, B b9) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z8) {
            this.f10401j = z8;
        }

        public final void setItemPrefetchEnabled(boolean z8) {
            if (z8 != this.f10403l) {
                this.f10403l = z8;
                this.f10404m = 0;
                RecyclerView recyclerView = this.f10393b;
                if (recyclerView != null) {
                    recyclerView.f10267b.E();
                }
            }
        }

        public void setMeasuredDimension(Rect rect, int i8, int i9) {
            setMeasuredDimension(chooseSize(i8, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i9, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasurementCacheEnabled(boolean z8) {
            this.f10402k = z8;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, B b9, int i8) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(A a9) {
            A a10 = this.f10398g;
            if (a10 != null && a9 != a10 && a10.isRunning()) {
                this.f10398g.i();
            }
            this.f10398g = a9;
            a9.h(this.f10393b, this);
        }

        public void stopIgnoringView(View view) {
            E eS = RecyclerView.S(view);
            eS.D();
            eS.x();
            eS.b(4);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        boolean t(View view, int i8, int i9, q qVar) {
            return (!view.isLayoutRequested() && this.f10402k && h(view.getWidth(), i8, ((ViewGroup.MarginLayoutParams) qVar).width) && h(view.getHeight(), i9, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        boolean u() {
            return false;
        }

        boolean v(View view, int i8, int i9, q qVar) {
            return (this.f10402k && h(view.getMeasuredWidth(), i8, ((ViewGroup.MarginLayoutParams) qVar).width) && h(view.getMeasuredHeight(), i9, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        void w() {
            A a9 = this.f10398g;
            if (a9 != null) {
                a9.i();
            }
        }

        public void addDisappearingView(View view, int i8) {
            a(view, i8, true);
        }

        public void addView(View view, int i8) {
            a(view, i8, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(w wVar, B b9, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f10393b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z8 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f10393b.canScrollVertically(-1) && !this.f10393b.canScrollHorizontally(-1) && !this.f10393b.canScrollHorizontally(1)) {
                z8 = false;
            }
            accessibilityEvent.setScrollable(z8);
            h hVar = this.f10393b.f10287l;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i8, int i9, Object obj) {
            onItemsUpdated(recyclerView, i8, i9);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, B b9, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
            int[] iArrE = e(view, rect);
            int i8 = iArrE[0];
            int i9 = iArrE[1];
            if ((z9 && !g(recyclerView, i8, i9)) || (i8 == 0 && i9 == 0)) {
                return false;
            }
            if (z8) {
                recyclerView.scrollBy(i8, i9);
            } else {
                recyclerView.smoothScrollBy(i8, i9);
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(View view, int i8) {
            attachView(view, i8, (q) view.getLayoutParams());
        }

        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void setMeasuredDimension(int i8, int i9) {
            this.f10393b.setMeasuredDimension(i8, i9);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    public interface r {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    public static abstract class s {
        public abstract boolean onFling(int i8, int i9);
    }

    public interface t {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z8);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
        }

        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
        }
    }

    public static class v {

        /* renamed from: a */
        SparseArray f10416a = new SparseArray();

        /* renamed from: b */
        private int f10417b = 0;

        static class a {

            /* renamed from: a */
            final ArrayList f10418a = new ArrayList();

            /* renamed from: b */
            int f10419b = 5;

            /* renamed from: c */
            long f10420c = 0;

            /* renamed from: d */
            long f10421d = 0;

            a() {
            }
        }

        private a e(int i8) {
            a aVar = (a) this.f10416a.get(i8);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f10416a.put(i8, aVar2);
            return aVar2;
        }

        void a() {
            this.f10417b++;
        }

        void b() {
            this.f10417b--;
        }

        void c(int i8, long j8) {
            a aVarE = e(i8);
            aVarE.f10421d = g(aVarE.f10421d, j8);
        }

        public void clear() {
            for (int i8 = 0; i8 < this.f10416a.size(); i8++) {
                ((a) this.f10416a.valueAt(i8)).f10418a.clear();
            }
        }

        void d(int i8, long j8) {
            a aVarE = e(i8);
            aVarE.f10420c = g(aVarE.f10420c, j8);
        }

        void f(h hVar, h hVar2, boolean z8) {
            if (hVar != null) {
                b();
            }
            if (!z8 && this.f10417b == 0) {
                clear();
            }
            if (hVar2 != null) {
                a();
            }
        }

        long g(long j8, long j9) {
            return j8 == 0 ? j9 : ((j8 / 4) * 3) + (j9 / 4);
        }

        public E getRecycledView(int i8) {
            a aVar = (a) this.f10416a.get(i8);
            if (aVar == null || aVar.f10418a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f10418a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((E) arrayList.get(size)).m()) {
                    return (E) arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i8) {
            return e(i8).f10418a.size();
        }

        boolean h(int i8, long j8, long j9) {
            long j10 = e(i8).f10421d;
            return j10 == 0 || j8 + j10 < j9;
        }

        boolean i(int i8, long j8, long j9) {
            long j10 = e(i8).f10420c;
            return j10 == 0 || j8 + j10 < j9;
        }

        public void putRecycledView(E e8) {
            int itemViewType = e8.getItemViewType();
            ArrayList arrayList = e(itemViewType).f10418a;
            if (((a) this.f10416a.get(itemViewType)).f10419b <= arrayList.size()) {
                return;
            }
            e8.x();
            arrayList.add(e8);
        }

        public void setMaxRecycledViews(int i8, int i9) {
            a aVarE = e(i8);
            aVarE.f10419b = i9;
            ArrayList arrayList = aVarE.f10418a;
            while (arrayList.size() > i9) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public final class w {

        /* renamed from: a */
        final ArrayList f10422a;

        /* renamed from: b */
        ArrayList f10423b;

        /* renamed from: c */
        final ArrayList f10424c;

        /* renamed from: d */
        private final List f10425d;

        /* renamed from: e */
        private int f10426e;

        /* renamed from: f */
        int f10427f;

        /* renamed from: g */
        v f10428g;

        /* renamed from: h */
        private C f10429h;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f10422a = arrayList;
            this.f10423b = null;
            this.f10424c = new ArrayList();
            this.f10425d = Collections.unmodifiableList(arrayList);
            this.f10426e = 2;
            this.f10427f = 2;
        }

        private boolean B(E e8, int i8, int i9, long j8) {
            e8.f10374r = null;
            e8.f10373q = RecyclerView.this;
            int itemViewType = e8.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j8 != Long.MAX_VALUE && !this.f10428g.h(itemViewType, nanoTime, j8)) {
                return false;
            }
            RecyclerView.this.f10287l.bindViewHolder(e8, i8);
            this.f10428g.c(e8.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e8);
            if (!RecyclerView.this.f10280h0.isPreLayout()) {
                return true;
            }
            e8.f10362f = i9;
            return true;
        }

        private void b(E e8) {
            if (RecyclerView.this.e0()) {
                View view = e8.itemView;
                if (AbstractC0985p0.getImportantForAccessibility(view) == 0) {
                    AbstractC0985p0.setImportantForAccessibility(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f10294o0;
                if (lVar == null) {
                    return;
                }
                C0923a itemDelegate = lVar.getItemDelegate();
                if (itemDelegate instanceof l.a) {
                    ((l.a) itemDelegate).f(view);
                }
                AbstractC0985p0.setAccessibilityDelegate(view, itemDelegate);
            }
        }

        private void m(ViewGroup viewGroup, boolean z8) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m((ViewGroup) childAt, true);
                }
            }
            if (z8) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void n(E e8) {
            View view = e8.itemView;
            if (view instanceof ViewGroup) {
                m((ViewGroup) view, false);
            }
        }

        void A(C c9) {
            this.f10429h = c9;
        }

        /* JADX WARN: Removed duplicated region for block: B:131:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x014a A[PHI: r1 r4
  0x014a: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$E) = (r1v11 androidx.recyclerview.widget.RecyclerView$E), (r1v31 androidx.recyclerview.widget.RecyclerView$E) binds: [B:141:0x005d, B:172:0x0102] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:141:0x005d, B:172:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x0229 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:221:0x022c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.E C(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.C(int, boolean, long):androidx.recyclerview.widget.RecyclerView$E");
        }

        void D(E e8) {
            if (e8.f10370n) {
                this.f10423b.remove(e8);
            } else {
                this.f10422a.remove(e8);
            }
            e8.f10369m = null;
            e8.f10370n = false;
            e8.e();
        }

        void E() {
            p pVar = RecyclerView.this.f10289m;
            this.f10427f = this.f10426e + (pVar != null ? pVar.f10404m : 0);
            for (int size = this.f10424c.size() - 1; size >= 0 && this.f10424c.size() > this.f10427f; size--) {
                w(size);
            }
        }

        boolean F(E e8) {
            if (e8.p()) {
                return RecyclerView.this.f10280h0.isPreLayout();
            }
            int i8 = e8.f10358b;
            if (i8 >= 0 && i8 < RecyclerView.this.f10287l.getItemCount()) {
                if (RecyclerView.this.f10280h0.isPreLayout() || RecyclerView.this.f10287l.getItemViewType(e8.f10358b) == e8.getItemViewType()) {
                    return !RecyclerView.this.f10287l.hasStableIds() || e8.getItemId() == RecyclerView.this.f10287l.getItemId(e8.f10358b);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e8 + RecyclerView.this.J());
        }

        void G(int i8, int i9) {
            int i10;
            int i11 = i9 + i8;
            for (int size = this.f10424c.size() - 1; size >= 0; size--) {
                E e8 = (E) this.f10424c.get(size);
                if (e8 != null && (i10 = e8.f10358b) >= i8 && i10 < i11) {
                    e8.b(2);
                    w(size);
                }
            }
        }

        void a(E e8, boolean z8) {
            RecyclerView.n(e8);
            View view = e8.itemView;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f10294o0;
            if (lVar != null) {
                C0923a itemDelegate = lVar.getItemDelegate();
                AbstractC0985p0.setAccessibilityDelegate(view, itemDelegate instanceof l.a ? ((l.a) itemDelegate).e(view) : null);
            }
            if (z8) {
                e(e8);
            }
            e8.f10374r = null;
            e8.f10373q = null;
            g().putRecycledView(e8);
        }

        public void bindViewToPosition(View view, int i8) {
            q qVar;
            E eS = RecyclerView.S(view);
            if (eS == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.J());
            }
            int iJ = RecyclerView.this.f10271d.j(i8);
            if (iJ < 0 || iJ >= RecyclerView.this.f10287l.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i8 + "(offset:" + iJ + ").state:" + RecyclerView.this.f10280h0.getItemCount() + RecyclerView.this.J());
            }
            B(eS, iJ, i8, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = eS.itemView.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                eS.itemView.setLayoutParams(qVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                qVar = (q) layoutParams;
            } else {
                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                eS.itemView.setLayoutParams(qVar);
            }
            qVar.f10414c = true;
            qVar.f10412a = eS;
            qVar.f10415d = eS.itemView.getParent() == null;
        }

        void c() {
            int size = this.f10424c.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((E) this.f10424c.get(i8)).c();
            }
            int size2 = this.f10422a.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((E) this.f10422a.get(i9)).c();
            }
            ArrayList arrayList = this.f10423b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    ((E) this.f10423b.get(i10)).c();
                }
            }
        }

        public void clear() {
            this.f10422a.clear();
            v();
        }

        public int convertPreLayoutPositionToPostLayout(int i8) {
            if (i8 >= 0 && i8 < RecyclerView.this.f10280h0.getItemCount()) {
                return !RecyclerView.this.f10280h0.isPreLayout() ? i8 : RecyclerView.this.f10271d.j(i8);
            }
            throw new IndexOutOfBoundsException("invalid position " + i8 + ". State item count is " + RecyclerView.this.f10280h0.getItemCount() + RecyclerView.this.J());
        }

        void d() {
            this.f10422a.clear();
            ArrayList arrayList = this.f10423b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        void e(E e8) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f10291n.size() > 0) {
                android.support.v4.media.session.f.a(RecyclerView.this.f10291n.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f10287l;
            if (hVar != null) {
                hVar.onViewRecycled(e8);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10280h0 != null) {
                recyclerView.f10275f.p(e8);
            }
        }

        E f(int i8) {
            int size;
            int iJ;
            ArrayList arrayList = this.f10423b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    E e8 = (E) this.f10423b.get(i9);
                    if (!e8.F() && e8.getLayoutPosition() == i8) {
                        e8.b(32);
                        return e8;
                    }
                }
                if (RecyclerView.this.f10287l.hasStableIds() && (iJ = RecyclerView.this.f10271d.j(i8)) > 0 && iJ < RecyclerView.this.f10287l.getItemCount()) {
                    long itemId = RecyclerView.this.f10287l.getItemId(iJ);
                    for (int i10 = 0; i10 < size; i10++) {
                        E e9 = (E) this.f10423b.get(i10);
                        if (!e9.F() && e9.getItemId() == itemId) {
                            e9.b(32);
                            return e9;
                        }
                    }
                }
            }
            return null;
        }

        v g() {
            if (this.f10428g == null) {
                this.f10428g = new v();
            }
            return this.f10428g;
        }

        public List<E> getScrapList() {
            return this.f10425d;
        }

        public View getViewForPosition(int i8) {
            return l(i8, false);
        }

        int h() {
            return this.f10422a.size();
        }

        E i(long j8, int i8, boolean z8) {
            for (int size = this.f10422a.size() - 1; size >= 0; size--) {
                E e8 = (E) this.f10422a.get(size);
                if (e8.getItemId() == j8 && !e8.F()) {
                    if (i8 == e8.getItemViewType()) {
                        e8.b(32);
                        if (e8.p() && !RecyclerView.this.f10280h0.isPreLayout()) {
                            e8.z(2, 14);
                        }
                        return e8;
                    }
                    if (!z8) {
                        this.f10422a.remove(size);
                        RecyclerView.this.removeDetachedView(e8.itemView, false);
                        u(e8.itemView);
                    }
                }
            }
            int size2 = this.f10424c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                E e9 = (E) this.f10424c.get(size2);
                if (e9.getItemId() == j8 && !e9.m()) {
                    if (i8 == e9.getItemViewType()) {
                        if (!z8) {
                            this.f10424c.remove(size2);
                        }
                        return e9;
                    }
                    if (!z8) {
                        w(size2);
                        return null;
                    }
                }
            }
        }

        E j(int i8, boolean z8) {
            View viewE;
            int size = this.f10422a.size();
            for (int i9 = 0; i9 < size; i9++) {
                E e8 = (E) this.f10422a.get(i9);
                if (!e8.F() && e8.getLayoutPosition() == i8 && !e8.o() && (RecyclerView.this.f10280h0.f10339h || !e8.p())) {
                    e8.b(32);
                    return e8;
                }
            }
            if (z8 || (viewE = RecyclerView.this.f10273e.e(i8)) == null) {
                int size2 = this.f10424c.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    E e9 = (E) this.f10424c.get(i10);
                    if (!e9.o() && e9.getLayoutPosition() == i8 && !e9.m()) {
                        if (!z8) {
                            this.f10424c.remove(i10);
                        }
                        return e9;
                    }
                }
                return null;
            }
            E eS = RecyclerView.S(viewE);
            RecyclerView.this.f10273e.s(viewE);
            int iM = RecyclerView.this.f10273e.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f10273e.d(iM);
                y(viewE);
                eS.b(8224);
                return eS;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + eS + RecyclerView.this.J());
        }

        View k(int i8) {
            return ((E) this.f10422a.get(i8)).itemView;
        }

        View l(int i8, boolean z8) {
            return C(i8, z8, Long.MAX_VALUE).itemView;
        }

        void o() {
            int size = this.f10424c.size();
            for (int i8 = 0; i8 < size; i8++) {
                q qVar = (q) ((E) this.f10424c.get(i8)).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f10414c = true;
                }
            }
        }

        void p() {
            int size = this.f10424c.size();
            for (int i8 = 0; i8 < size; i8++) {
                E e8 = (E) this.f10424c.get(i8);
                if (e8 != null) {
                    e8.b(6);
                    e8.a(null);
                }
            }
            h hVar = RecyclerView.this.f10287l;
            if (hVar == null || !hVar.hasStableIds()) {
                v();
            }
        }

        void q(int i8, int i9) {
            int size = this.f10424c.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e8 = (E) this.f10424c.get(i10);
                if (e8 != null && e8.f10358b >= i8) {
                    e8.u(i9, false);
                }
            }
        }

        void r(int i8, int i9) {
            int i10;
            int i11;
            int i12;
            int i13;
            if (i8 < i9) {
                i10 = -1;
                i12 = i8;
                i11 = i9;
            } else {
                i10 = 1;
                i11 = i8;
                i12 = i9;
            }
            int size = this.f10424c.size();
            for (int i14 = 0; i14 < size; i14++) {
                E e8 = (E) this.f10424c.get(i14);
                if (e8 != null && (i13 = e8.f10358b) >= i12 && i13 <= i11) {
                    if (i13 == i8) {
                        e8.u(i9 - i8, false);
                    } else {
                        e8.u(i10, false);
                    }
                }
            }
        }

        public void recycleView(View view) {
            E eS = RecyclerView.S(view);
            if (eS.r()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (eS.q()) {
                eS.E();
            } else if (eS.F()) {
                eS.e();
            }
            x(eS);
            if (RecyclerView.this.f10254M == null || eS.isRecyclable()) {
                return;
            }
            RecyclerView.this.f10254M.endAnimation(eS);
        }

        void s(int i8, int i9, boolean z8) {
            int i10 = i8 + i9;
            for (int size = this.f10424c.size() - 1; size >= 0; size--) {
                E e8 = (E) this.f10424c.get(size);
                if (e8 != null) {
                    int i11 = e8.f10358b;
                    if (i11 >= i10) {
                        e8.u(-i9, z8);
                    } else if (i11 >= i8) {
                        e8.b(8);
                        w(size);
                    }
                }
            }
        }

        public void setViewCacheSize(int i8) {
            this.f10426e = i8;
            E();
        }

        void t(h hVar, h hVar2, boolean z8) {
            clear();
            g().f(hVar, hVar2, z8);
        }

        void u(View view) {
            E eS = RecyclerView.S(view);
            eS.f10369m = null;
            eS.f10370n = false;
            eS.e();
            x(eS);
        }

        void v() {
            for (int size = this.f10424c.size() - 1; size >= 0; size--) {
                w(size);
            }
            this.f10424c.clear();
            if (RecyclerView.f10237E0) {
                RecyclerView.this.f10278g0.a();
            }
        }

        void w(int i8) {
            a((E) this.f10424c.get(i8), true);
            this.f10424c.remove(i8);
        }

        void x(E e8) {
            boolean z8;
            boolean z9 = true;
            if (e8.q() || e8.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e8.q());
                sb.append(" isAttached:");
                sb.append(e8.itemView.getParent() != null);
                sb.append(RecyclerView.this.J());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e8.r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e8 + RecyclerView.this.J());
            }
            if (e8.C()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.J());
            }
            boolean zH = e8.h();
            h hVar = RecyclerView.this.f10287l;
            if ((hVar != null && zH && hVar.onFailedToRecycleView(e8)) || e8.isRecyclable()) {
                if (this.f10427f <= 0 || e8.k(526)) {
                    z8 = false;
                } else {
                    int size = this.f10424c.size();
                    if (size >= this.f10427f && size > 0) {
                        w(0);
                        size--;
                    }
                    if (RecyclerView.f10237E0 && size > 0 && !RecyclerView.this.f10278g0.c(e8.f10358b)) {
                        int i8 = size - 1;
                        while (i8 >= 0) {
                            if (!RecyclerView.this.f10278g0.c(((E) this.f10424c.get(i8)).f10358b)) {
                                break;
                            } else {
                                i8--;
                            }
                        }
                        size = i8 + 1;
                    }
                    this.f10424c.add(size, e8);
                    z8 = true;
                }
                if (z8) {
                    z9 = false;
                } else {
                    a(e8, true);
                }
                z = z8;
            } else {
                z9 = false;
            }
            RecyclerView.this.f10275f.p(e8);
            if (z || z9 || !zH) {
                return;
            }
            e8.f10374r = null;
            e8.f10373q = null;
        }

        void y(View view) {
            E eS = RecyclerView.S(view);
            if (!eS.k(12) && eS.s() && !RecyclerView.this.l(eS)) {
                if (this.f10423b == null) {
                    this.f10423b = new ArrayList();
                }
                eS.A(this, true);
                this.f10423b.add(eS);
                return;
            }
            if (!eS.o() || eS.p() || RecyclerView.this.f10287l.hasStableIds()) {
                eS.A(this, false);
                this.f10422a.add(eS);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.J());
            }
        }

        void z(v vVar) {
            v vVar2 = this.f10428g;
            if (vVar2 != null) {
                vVar2.b();
            }
            this.f10428g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f10428g.a();
        }
    }

    public interface x {
    }

    private class y extends j {
        y() {
        }

        void a() {
            if (RecyclerView.f10236D0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f10301s && recyclerView.f10299r) {
                    AbstractC0985p0.postOnAnimation(recyclerView, recyclerView.f10279h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f10242A = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            RecyclerView.this.k(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10280h0.f10338g = true;
            recyclerView.u0(true);
            if (RecyclerView.this.f10271d.m()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i8, int i9, Object obj) {
            RecyclerView.this.k(null);
            if (RecyclerView.this.f10271d.o(i8, i9, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i8, int i9) {
            RecyclerView.this.k(null);
            if (RecyclerView.this.f10271d.p(i8, i9)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i8, int i9, int i10) {
            RecyclerView.this.k(null);
            if (RecyclerView.this.f10271d.q(i8, i9, i10)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i8, int i9) {
            RecyclerView.this.k(null);
            if (RecyclerView.this.f10271d.r(i8, i9)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10269c == null || (hVar = recyclerView.f10287l) == null || !hVar.a()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f10240H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f10241I0 = new InterpolatorC1030c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A() {
        this.f10280h0.a(4);
        N0();
        n0();
        B b9 = this.f10280h0;
        b9.f10336e = 1;
        if (b9.f10342k) {
            for (int iG = this.f10273e.g() - 1; iG >= 0; iG--) {
                E eS = S(this.f10273e.f(iG));
                if (!eS.C()) {
                    long jR = R(eS);
                    m.c cVarRecordPostLayoutInformation = this.f10254M.recordPostLayoutInformation(this.f10280h0, eS);
                    E eG = this.f10275f.g(jR);
                    if (eG == null || eG.C()) {
                        this.f10275f.d(eS, cVarRecordPostLayoutInformation);
                    } else {
                        boolean zH = this.f10275f.h(eG);
                        boolean zH2 = this.f10275f.h(eS);
                        if (zH && eG == eS) {
                            this.f10275f.d(eS, cVarRecordPostLayoutInformation);
                        } else {
                            m.c cVarM = this.f10275f.m(eG);
                            this.f10275f.d(eS, cVarRecordPostLayoutInformation);
                            m.c cVarL = this.f10275f.l(eS);
                            if (cVarM == null) {
                                X(jR, eS, eG);
                            } else {
                                h(eG, eS, cVarM, cVarL, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f10275f.n(this.f10316z0);
        }
        this.f10289m.n(this.f10267b);
        B b10 = this.f10280h0;
        b10.f10334c = b10.f10337f;
        this.f10245D = false;
        this.f10246E = false;
        b10.f10342k = false;
        b10.f10343l = false;
        this.f10289m.f10399h = false;
        ArrayList arrayList = this.f10267b.f10423b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.f10289m;
        if (pVar.f10405n) {
            pVar.f10404m = 0;
            pVar.f10405n = false;
            this.f10267b.E();
        }
        this.f10289m.onLayoutCompleted(this.f10280h0);
        o0();
        O0(false);
        this.f10275f.f();
        int[] iArr = this.f10296p0;
        if (t(iArr[0], iArr[1])) {
            C(0, 0);
        }
        x0();
        D0();
    }

    private void C0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f10281i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f10414c) {
                Rect rect = qVar.f10413b;
                Rect rect2 = this.f10281i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f10281i);
            offsetRectIntoDescendantCoords(view, this.f10281i);
        }
        this.f10289m.requestChildRectangleOnScreen(this, view, this.f10281i, !this.f10305u, view2 == null);
    }

    private void D0() {
        B b9 = this.f10280h0;
        b9.f10345n = -1L;
        b9.f10344m = -1;
        b9.f10346o = -1;
    }

    private boolean E(MotionEvent motionEvent) {
        t tVar = this.f10297q;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return L(motionEvent);
        }
        tVar.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f10297q = null;
        }
        return true;
    }

    private void E0() {
        VelocityTracker velocityTracker = this.f10257P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        y0();
    }

    private void F0() {
        View focusedChild = (this.f10272d0 && hasFocus() && this.f10287l != null) ? getFocusedChild() : null;
        E eFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (eFindContainingViewHolder == null) {
            D0();
            return;
        }
        this.f10280h0.f10345n = this.f10287l.hasStableIds() ? eFindContainingViewHolder.getItemId() : -1L;
        this.f10280h0.f10344m = this.f10245D ? -1 : eFindContainingViewHolder.p() ? eFindContainingViewHolder.f10359c : eFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.f10280h0.f10346o = U(eFindContainingViewHolder.itemView);
    }

    private void J0(h hVar, boolean z8, boolean z9) {
        h hVar2 = this.f10287l;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f10265a);
            this.f10287l.onDetachedFromRecyclerView(this);
        }
        if (!z8 || z9) {
            z0();
        }
        this.f10271d.v();
        h hVar3 = this.f10287l;
        this.f10287l = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f10265a);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.f10287l);
        }
        this.f10267b.t(hVar3, this.f10287l, z8);
        this.f10280h0.f10338g = true;
    }

    private boolean L(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f10295p.size();
        for (int i8 = 0; i8 < size; i8++) {
            t tVar = (t) this.f10295p.get(i8);
            if (tVar.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.f10297q = tVar;
                return true;
            }
        }
        return false;
    }

    private void M(int[] iArr) {
        int iG = this.f10273e.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < iG; i10++) {
            E eS = S(this.f10273e.f(i10));
            if (!eS.C()) {
                int layoutPosition = eS.getLayoutPosition();
                if (layoutPosition < i8) {
                    i8 = layoutPosition;
                }
                if (layoutPosition > i9) {
                    i9 = layoutPosition;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
    }

    static RecyclerView N(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            RecyclerView recyclerViewN = N(viewGroup.getChildAt(i8));
            if (recyclerViewN != null) {
                return recyclerViewN;
            }
        }
        return null;
    }

    private View O() {
        E eFindViewHolderForAdapterPosition;
        B b9 = this.f10280h0;
        int i8 = b9.f10344m;
        if (i8 == -1) {
            i8 = 0;
        }
        int itemCount = b9.getItemCount();
        for (int i9 = i8; i9 < itemCount; i9++) {
            E eFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i9);
            if (eFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (eFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return eFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(itemCount, i8);
        do {
            iMin--;
            if (iMin < 0 || (eFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!eFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return eFindViewHolderForAdapterPosition.itemView;
    }

    private void P0() {
        this.f10274e0.stop();
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.w();
        }
    }

    static E S(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f10412a;
    }

    static void T(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f10413b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int U(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String V(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
    }

    private void X(long j8, E e8, E e9) {
        int iG = this.f10273e.g();
        for (int i8 = 0; i8 < iG; i8++) {
            E eS = S(this.f10273e.f(i8));
            if (eS != e8 && R(eS) == j8) {
                h hVar = this.f10287l;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + eS + " \n View Holder 2:" + e8 + J());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + eS + " \n View Holder 2:" + e8 + J());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e9 + " cannot be found but it is necessary for " + e8 + J());
    }

    private boolean Y() {
        int iG = this.f10273e.g();
        for (int i8 = 0; i8 < iG; i8++) {
            E eS = S(this.f10273e.f(i8));
            if (eS != null && !eS.C() && eS.s()) {
                return true;
            }
        }
        return false;
    }

    private void a0() {
        if (AbstractC0985p0.getImportantForAutofill(this) == 0) {
            AbstractC0985p0.setImportantForAutofill(this, 8);
        }
    }

    private void b0() {
        this.f10273e = new b(new C1032e());
    }

    private void f(E e8) {
        View view = e8.itemView;
        boolean z8 = view.getParent() == this;
        this.f10267b.D(getChildViewHolder(view));
        if (e8.r()) {
            this.f10273e.c(view, -1, view.getLayoutParams(), true);
        } else if (z8) {
            this.f10273e.k(view);
        } else {
            this.f10273e.b(view, true);
        }
    }

    private boolean f0(View view, View view2, int i8) {
        int i9;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.f10281i.set(0, 0, view.getWidth(), view.getHeight());
        this.f10283j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f10281i);
        offsetDescendantRectToMyCoords(view2, this.f10283j);
        char c9 = 65535;
        int i10 = this.f10289m.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.f10281i;
        int i11 = rect.left;
        Rect rect2 = this.f10283j;
        int i12 = rect2.left;
        if ((i11 < i12 || rect.right <= i12) && rect.right < rect2.right) {
            i9 = 1;
        } else {
            int i13 = rect.right;
            int i14 = rect2.right;
            i9 = ((i13 > i14 || i11 >= i14) && i11 > i12) ? -1 : 0;
        }
        int i15 = rect.top;
        int i16 = rect2.top;
        if ((i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom) {
            c9 = 1;
        } else {
            int i17 = rect.bottom;
            int i18 = rect2.bottom;
            if ((i17 <= i18 && i15 < i18) || i15 <= i16) {
                c9 = 0;
            }
        }
        if (i8 == 1) {
            return c9 < 0 || (c9 == 0 && i9 * i10 < 0);
        }
        if (i8 == 2) {
            return c9 > 0 || (c9 == 0 && i9 * i10 > 0);
        }
        if (i8 == 17) {
            return i9 < 0;
        }
        if (i8 == 33) {
            return c9 < 0;
        }
        if (i8 == 66) {
            return i9 > 0;
        }
        if (i8 == 130) {
            return c9 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i8 + J());
    }

    private Q getScrollingChildHelper() {
        if (this.f10298q0 == null) {
            this.f10298q0 = new Q(this);
        }
        return this.f10298q0;
    }

    private void h(E e8, E e9, m.c cVar, m.c cVar2, boolean z8, boolean z9) {
        e8.setIsRecyclable(false);
        if (z8) {
            f(e8);
        }
        if (e8 != e9) {
            if (z9) {
                f(e9);
            }
            e8.f10363g = e9;
            f(e8);
            this.f10267b.D(e8);
            e9.setIsRecyclable(false);
            e9.f10364h = e8;
        }
        if (this.f10254M.animateChange(e8, e9, cVar, cVar2)) {
            r0();
        }
    }

    private void j0(int i8, int i9, MotionEvent motionEvent, int i10) {
        p pVar = this.f10289m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10311x) {
            return;
        }
        int[] iArr = this.f10304t0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10289m.canScrollVertically();
        startNestedScroll(zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0, i10);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? i8 : 0, zCanScrollVertically ? i9 : 0, this.f10304t0, this.f10300r0, i10)) {
            int[] iArr2 = this.f10304t0;
            i8 -= iArr2[0];
            i9 -= iArr2[1];
        }
        H0(zCanScrollHorizontally ? i8 : 0, zCanScrollVertically ? i9 : 0, motionEvent, i10);
        e eVar = this.f10276f0;
        if (eVar != null && (i8 != 0 || i9 != 0)) {
            eVar.e(this, i8, i9);
        }
        stopNestedScroll(i10);
    }

    private void m() {
        E0();
        setScrollState(0);
    }

    static void n(E e8) {
        WeakReference weakReference = e8.f10357a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == e8.itemView) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            e8.f10357a = null;
        }
    }

    private void q0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10256O) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f10256O = motionEvent.getPointerId(i8);
            int x8 = (int) (motionEvent.getX(i8) + 0.5f);
            this.f10260S = x8;
            this.f10258Q = x8;
            int y8 = (int) (motionEvent.getY(i8) + 0.5f);
            this.f10261T = y8;
            this.f10259R = y8;
        }
    }

    private void r(Context context, String str, AttributeSet attributeSet, int i8, int i9) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strV = V(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strV, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f10240H0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i8), Integer.valueOf(i9)};
                } catch (NoSuchMethodException e8) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e9) {
                        e9.initCause(e8);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strV, e9);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strV, e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strV, e11);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strV, e12);
            } catch (InstantiationException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strV, e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strV, e14);
            }
        }
    }

    private boolean s0() {
        return this.f10254M != null && this.f10289m.supportsPredictiveItemAnimations();
    }

    private boolean t(int i8, int i9) {
        M(this.f10296p0);
        int[] iArr = this.f10296p0;
        return (iArr[0] == i8 && iArr[1] == i9) ? false : true;
    }

    private void t0() {
        boolean z8;
        if (this.f10245D) {
            this.f10271d.v();
            if (this.f10246E) {
                this.f10289m.onItemsChanged(this);
            }
        }
        if (s0()) {
            this.f10271d.t();
        } else {
            this.f10271d.g();
        }
        boolean z9 = this.f10286k0 || this.f10288l0;
        this.f10280h0.f10342k = this.f10305u && this.f10254M != null && ((z8 = this.f10245D) || z9 || this.f10289m.f10399h) && (!z8 || this.f10287l.hasStableIds());
        B b9 = this.f10280h0;
        b9.f10343l = b9.f10342k && z9 && !this.f10245D && s0();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.G()
            android.widget.EdgeEffect r1 = r6.f10250I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.onPull(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.H()
            android.widget.EdgeEffect r1 = r6.f10252K
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.onPull(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.I()
            android.widget.EdgeEffect r9 = r6.f10251J
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.onPull(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.F()
            android.widget.EdgeEffect r9 = r6.f10253L
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.onPull(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.AbstractC0985p0.postInvalidateOnAnimation(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v0(float, float, float, float):void");
    }

    private void w() {
        int i8 = this.f10315z;
        this.f10315z = 0;
        if (i8 == 0 || !e0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC0927b.setContentChangeTypes(accessibilityEventObtain, i8);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void x0() {
        View viewFindViewById;
        if (!this.f10272d0 || this.f10287l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f10239G0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f10273e.n(focusedChild)) {
                    return;
                }
            } else if (this.f10273e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewO = null;
        E eFindViewHolderForItemId = (this.f10280h0.f10345n == -1 || !this.f10287l.hasStableIds()) ? null : findViewHolderForItemId(this.f10280h0.f10345n);
        if (eFindViewHolderForItemId != null && !this.f10273e.n(eFindViewHolderForItemId.itemView) && eFindViewHolderForItemId.itemView.hasFocusable()) {
            viewO = eFindViewHolderForItemId.itemView;
        } else if (this.f10273e.g() > 0) {
            viewO = O();
        }
        if (viewO != null) {
            int i8 = this.f10280h0.f10346o;
            if (i8 != -1 && (viewFindViewById = viewO.findViewById(i8)) != null && viewFindViewById.isFocusable()) {
                viewO = viewFindViewById;
            }
            viewO.requestFocus();
        }
    }

    private void y() {
        this.f10280h0.a(1);
        K(this.f10280h0);
        this.f10280h0.f10341j = false;
        N0();
        this.f10275f.f();
        n0();
        t0();
        F0();
        B b9 = this.f10280h0;
        b9.f10340i = b9.f10342k && this.f10288l0;
        this.f10288l0 = false;
        this.f10286k0 = false;
        b9.f10339h = b9.f10343l;
        b9.f10337f = this.f10287l.getItemCount();
        M(this.f10296p0);
        if (this.f10280h0.f10342k) {
            int iG = this.f10273e.g();
            for (int i8 = 0; i8 < iG; i8++) {
                E eS = S(this.f10273e.f(i8));
                if (!eS.C() && (!eS.o() || this.f10287l.hasStableIds())) {
                    this.f10275f.e(eS, this.f10254M.recordPreLayoutInformation(this.f10280h0, eS, m.a(eS), eS.j()));
                    if (this.f10280h0.f10340i && eS.s() && !eS.p() && !eS.C() && !eS.o()) {
                        this.f10275f.c(R(eS), eS);
                    }
                }
            }
        }
        if (this.f10280h0.f10343l) {
            G0();
            B b10 = this.f10280h0;
            boolean z8 = b10.f10338g;
            b10.f10338g = false;
            this.f10289m.onLayoutChildren(this.f10267b, b10);
            this.f10280h0.f10338g = z8;
            for (int i9 = 0; i9 < this.f10273e.g(); i9++) {
                E eS2 = S(this.f10273e.f(i9));
                if (!eS2.C() && !this.f10275f.i(eS2)) {
                    int iA = m.a(eS2);
                    boolean zK = eS2.k(8192);
                    if (!zK) {
                        iA |= 4096;
                    }
                    m.c cVarRecordPreLayoutInformation = this.f10254M.recordPreLayoutInformation(this.f10280h0, eS2, iA, eS2.j());
                    if (zK) {
                        w0(eS2, cVarRecordPreLayoutInformation);
                    } else {
                        this.f10275f.a(eS2, cVarRecordPreLayoutInformation);
                    }
                }
            }
            o();
        } else {
            o();
        }
        o0();
        O0(false);
        this.f10280h0.f10336e = 2;
    }

    private void y0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10250I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f10250I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f10251J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f10251J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10252K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f10252K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10253L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f10253L.isFinished();
        }
        if (zIsFinished) {
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    private void z() {
        N0();
        n0();
        this.f10280h0.a(6);
        this.f10271d.g();
        this.f10280h0.f10337f = this.f10287l.getItemCount();
        this.f10280h0.f10335d = 0;
        if (this.f10269c != null && this.f10287l.a()) {
            Parcelable parcelable = this.f10269c.f10432b;
            if (parcelable != null) {
                this.f10289m.onRestoreInstanceState(parcelable);
            }
            this.f10269c = null;
        }
        B b9 = this.f10280h0;
        b9.f10339h = false;
        this.f10289m.onLayoutChildren(this.f10267b, b9);
        B b10 = this.f10280h0;
        b10.f10338g = false;
        b10.f10342k = b10.f10342k && this.f10254M != null;
        b10.f10336e = 4;
        o0();
        O0(false);
    }

    boolean A0(View view) {
        N0();
        boolean zR = this.f10273e.r(view);
        if (zR) {
            E eS = S(view);
            this.f10267b.D(eS);
            this.f10267b.x(eS);
        }
        O0(!zR);
        return zR;
    }

    void B(int i8) {
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.onScrollStateChanged(i8);
        }
        onScrollStateChanged(i8);
        u uVar = this.f10282i0;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i8);
        }
        List list = this.f10284j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f10284j0.get(size)).onScrollStateChanged(this, i8);
            }
        }
    }

    void B0() {
        E e8;
        int iG = this.f10273e.g();
        for (int i8 = 0; i8 < iG; i8++) {
            View viewF = this.f10273e.f(i8);
            E childViewHolder = getChildViewHolder(viewF);
            if (childViewHolder != null && (e8 = childViewHolder.f10364h) != null) {
                View view = e8.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void C(int i8, int i9) {
        this.f10248G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i8, scrollY - i9);
        onScrolled(i8, i9);
        u uVar = this.f10282i0;
        if (uVar != null) {
            uVar.onScrolled(this, i8, i9);
        }
        List list = this.f10284j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f10284j0.get(size)).onScrolled(this, i8, i9);
            }
        }
        this.f10248G--;
    }

    void D() {
        int i8;
        for (int size = this.f10306u0.size() - 1; size >= 0; size--) {
            E e8 = (E) this.f10306u0.get(size);
            if (e8.itemView.getParent() == this && !e8.C() && (i8 = e8.f10372p) != -1) {
                AbstractC0985p0.setImportantForAccessibility(e8.itemView, i8);
                e8.f10372p = -1;
            }
        }
        this.f10306u0.clear();
    }

    void F() {
        if (this.f10253L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10249H.a(this, 3);
        this.f10253L = edgeEffectA;
        if (this.f10277g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void G() {
        if (this.f10250I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10249H.a(this, 0);
        this.f10250I = edgeEffectA;
        if (this.f10277g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void G0() {
        int iJ = this.f10273e.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            E eS = S(this.f10273e.i(i8));
            if (!eS.C()) {
                eS.y();
            }
        }
    }

    void H() {
        if (this.f10252K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10249H.a(this, 2);
        this.f10252K = edgeEffectA;
        if (this.f10277g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    boolean H0(int i8, int i9, MotionEvent motionEvent, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        q();
        if (this.f10287l != null) {
            int[] iArr = this.f10304t0;
            iArr[0] = 0;
            iArr[1] = 0;
            I0(i8, i9, iArr);
            int[] iArr2 = this.f10304t0;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            i11 = i16;
            i12 = i15;
            i13 = i8 - i15;
            i14 = i9 - i16;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.f10293o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f10304t0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i12, i11, i13, i14, this.f10300r0, i10, iArr3);
        int[] iArr4 = this.f10304t0;
        int i17 = iArr4[0];
        int i18 = i13 - i17;
        int i19 = iArr4[1];
        int i20 = i14 - i19;
        boolean z8 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.f10260S;
        int[] iArr5 = this.f10300r0;
        int i22 = iArr5[0];
        this.f10260S = i21 - i22;
        int i23 = this.f10261T;
        int i24 = iArr5[1];
        this.f10261T = i23 - i24;
        int[] iArr6 = this.f10302s0;
        iArr6[0] = iArr6[0] + i22;
        iArr6[1] = iArr6[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !M.isFromSource(motionEvent, androidx.fragment.app.x.TRANSIT_FRAGMENT_CLOSE)) {
                v0(motionEvent.getX(), i18, motionEvent.getY(), i20);
            }
            p(i8, i9);
        }
        if (i12 != 0 || i11 != 0) {
            C(i12, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z8 && i12 == 0 && i11 == 0) ? false : true;
    }

    void I() {
        if (this.f10251J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10249H.a(this, 1);
        this.f10251J = edgeEffectA;
        if (this.f10277g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void I0(int i8, int i9, int[] iArr) {
        N0();
        n0();
        androidx.core.os.q.beginSection("RV Scroll");
        K(this.f10280h0);
        int iScrollHorizontallyBy = i8 != 0 ? this.f10289m.scrollHorizontallyBy(i8, this.f10267b, this.f10280h0) : 0;
        int iScrollVerticallyBy = i9 != 0 ? this.f10289m.scrollVerticallyBy(i9, this.f10267b, this.f10280h0) : 0;
        androidx.core.os.q.endSection();
        B0();
        o0();
        O0(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    String J() {
        return X.SPACE + super.toString() + ", adapter:" + this.f10287l + ", layout:" + this.f10289m + ", context:" + getContext();
    }

    final void K(B b9) {
        if (getScrollState() != 2) {
            b9.f10347p = 0;
            b9.f10348q = 0;
        } else {
            OverScroller overScroller = this.f10274e0.f10351c;
            b9.f10347p = overScroller.getFinalX() - overScroller.getCurrX();
            b9.f10348q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    boolean K0(E e8, int i8) {
        if (!isComputingLayout()) {
            AbstractC0985p0.setImportantForAccessibility(e8.itemView, i8);
            return true;
        }
        e8.f10372p = i8;
        this.f10306u0.add(e8);
        return false;
    }

    boolean L0(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? AbstractC0927b.getContentChangeTypes(accessibilityEvent) : 0;
        this.f10315z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    void M0(int i8, int i9, Interpolator interpolator, int i10, boolean z8) {
        p pVar = this.f10289m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10311x) {
            return;
        }
        if (!pVar.canScrollHorizontally()) {
            i8 = 0;
        }
        if (!this.f10289m.canScrollVertically()) {
            i9 = 0;
        }
        if (i8 == 0 && i9 == 0) {
            return;
        }
        if (i10 != Integer.MIN_VALUE && i10 <= 0) {
            scrollBy(i8, i9);
            return;
        }
        if (z8) {
            int i11 = i8 != 0 ? 1 : 0;
            if (i9 != 0) {
                i11 |= 2;
            }
            startNestedScroll(i11, 1);
        }
        this.f10274e0.smoothScrollBy(i8, i9, i10, interpolator);
    }

    void N0() {
        int i8 = this.f10307v + 1;
        this.f10307v = i8;
        if (i8 != 1 || this.f10311x) {
            return;
        }
        this.f10309w = false;
    }

    void O0(boolean z8) {
        if (this.f10307v < 1) {
            this.f10307v = 1;
        }
        if (!z8 && !this.f10311x) {
            this.f10309w = false;
        }
        if (this.f10307v == 1) {
            if (z8 && this.f10309w && !this.f10311x && this.f10289m != null && this.f10287l != null) {
                x();
            }
            if (!this.f10311x) {
                this.f10309w = false;
            }
        }
        this.f10307v--;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.E P(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f10273e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f10273e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$E r3 = S(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.p()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f10358b
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f10273e
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P(int, boolean):androidx.recyclerview.widget.RecyclerView$E");
    }

    int Q(E e8) {
        if (e8.k(524) || !e8.n()) {
            return -1;
        }
        return this.f10271d.applyPendingUpdatesToPosition(e8.f10358b);
    }

    void Q0(int i8, int i9, Object obj) {
        int i10;
        int iJ = this.f10273e.j();
        int i11 = i8 + i9;
        for (int i12 = 0; i12 < iJ; i12++) {
            View viewI = this.f10273e.i(i12);
            E eS = S(viewI);
            if (eS != null && !eS.C() && (i10 = eS.f10358b) >= i8 && i10 < i11) {
                eS.b(2);
                eS.a(obj);
                ((q) viewI.getLayoutParams()).f10414c = true;
            }
        }
        this.f10267b.G(i8, i9);
    }

    long R(E e8) {
        return this.f10287l.hasStableIds() ? e8.getItemId() : e8.f10358b;
    }

    Rect W(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f10414c) {
            return qVar.f10413b;
        }
        if (this.f10280h0.isPreLayout() && (qVar.isItemChanged() || qVar.isViewInvalid())) {
            return qVar.f10413b;
        }
        Rect rect = qVar.f10413b;
        rect.set(0, 0, 0, 0);
        int size = this.f10293o.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f10281i.set(0, 0, 0, 0);
            ((o) this.f10293o.get(i8)).getItemOffsets(this.f10281i, view, this, this.f10280h0);
            int i9 = rect.left;
            Rect rect2 = this.f10281i;
            rect.left = i9 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f10414c = false;
        return rect;
    }

    void Z() {
        this.f10271d = new a(new f());
    }

    void a(int i8, int i9) {
        if (i8 < 0) {
            G();
            if (this.f10250I.isFinished()) {
                this.f10250I.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            H();
            if (this.f10252K.isFinished()) {
                this.f10252K.onAbsorb(i8);
            }
        }
        if (i9 < 0) {
            I();
            if (this.f10251J.isFinished()) {
                this.f10251J.onAbsorb(-i9);
            }
        } else if (i9 > 0) {
            F();
            if (this.f10253L.isFinished()) {
                this.f10253L.onAbsorb(i9);
            }
        }
        if (i8 == 0 && i9 == 0) {
            return;
        }
        AbstractC0985p0.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        p pVar = this.f10289m;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i8, i9)) {
            super.addFocusables(arrayList, i8, i9);
        }
    }

    public void addItemDecoration(o oVar, int i8) {
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f10293o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i8 < 0) {
            this.f10293o.add(oVar);
        } else {
            this.f10293o.add(i8, oVar);
        }
        h0();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.f10244C == null) {
            this.f10244C = new ArrayList();
        }
        this.f10244C.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.f10295p.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.f10284j0 == null) {
            this.f10284j0 = new ArrayList();
        }
        this.f10284j0.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        Z.h.checkArgument(xVar != null, "'listener' arg cannot be null.");
        this.f10291n.add(xVar);
    }

    void c0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(u0.b.fastscroll_default_thickness), resources.getDimensionPixelSize(u0.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(u0.b.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + J());
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f10289m.checkLayoutParams((q) layoutParams);
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.f10244C;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list = this.f10284j0;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeHorizontalScrollExtent() {
        p pVar = this.f10289m;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.f10289m.computeHorizontalScrollExtent(this.f10280h0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeHorizontalScrollOffset() {
        p pVar = this.f10289m;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.f10289m.computeHorizontalScrollOffset(this.f10280h0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeHorizontalScrollRange() {
        p pVar = this.f10289m;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.f10289m.computeHorizontalScrollRange(this.f10280h0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeVerticalScrollExtent() {
        p pVar = this.f10289m;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.f10289m.computeVerticalScrollExtent(this.f10280h0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeVerticalScrollOffset() {
        p pVar = this.f10289m;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.f10289m.computeVerticalScrollOffset(this.f10280h0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0943b0
    public int computeVerticalScrollRange() {
        p pVar = this.f10289m;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.f10289m.computeVerticalScrollRange(this.f10280h0);
        }
        return 0;
    }

    void d0() {
        this.f10253L = null;
        this.f10251J = null;
        this.f10252K = null;
        this.f10250I = null;
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        return getScrollingChildHelper().dispatchNestedFling(f8, f9, z8);
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return getScrollingChildHelper().dispatchNestedPreFling(f8, f9);
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i8, i9, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z8;
        super.draw(canvas);
        int size = this.f10293o.size();
        boolean z9 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ((o) this.f10293o.get(i8)).onDrawOver(canvas, this, this.f10280h0);
        }
        EdgeEffect edgeEffect = this.f10250I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z8 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f10277g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f10250I;
            z8 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f10251J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f10277g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f10251J;
            z8 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f10252K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f10277g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f10252K;
            z8 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f10253L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f10277g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f10253L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z9 = true;
            }
            z8 |= z9;
            canvas.restoreToCount(iSave4);
        }
        if ((z8 || this.f10254M == null || this.f10293o.size() <= 0 || !this.f10254M.isRunning()) ? z8 : true) {
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j8) {
        return super.drawChild(canvas, view, j8);
    }

    boolean e0() {
        AccessibilityManager accessibilityManager = this.f10243B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public View findChildViewUnder(float f8, float f9) {
        for (int iG = this.f10273e.g() - 1; iG >= 0; iG--) {
            View viewF = this.f10273e.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f8 >= viewF.getLeft() + translationX && f8 <= viewF.getRight() + translationX && f9 >= viewF.getTop() + translationY && f9 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public E findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public E findViewHolderForAdapterPosition(int i8) {
        E e8 = null;
        if (this.f10245D) {
            return null;
        }
        int iJ = this.f10273e.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            E eS = S(this.f10273e.i(i9));
            if (eS != null && !eS.p() && Q(eS) == i8) {
                if (!this.f10273e.n(eS.itemView)) {
                    return eS;
                }
                e8 = eS;
            }
        }
        return e8;
    }

    public E findViewHolderForItemId(long j8) {
        h hVar = this.f10287l;
        E e8 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.f10273e.j();
            for (int i8 = 0; i8 < iJ; i8++) {
                E eS = S(this.f10273e.i(i8));
                if (eS != null && !eS.p() && eS.getItemId() == j8) {
                    if (!this.f10273e.n(eS.itemView)) {
                        return eS;
                    }
                    e8 = eS;
                }
            }
        }
        return e8;
    }

    public E findViewHolderForLayoutPosition(int i8) {
        return P(i8, false);
    }

    @Deprecated
    public E findViewHolderForPosition(int i8) {
        return P(i8, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i8, int i9) {
        p pVar = this.f10289m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f10311x) {
            return false;
        }
        int iCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10289m.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i8) < this.f10264W) {
            i8 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i9) < this.f10264W) {
            i9 = 0;
        }
        if (i8 == 0 && i9 == 0) {
            return false;
        }
        float f8 = i8;
        float f9 = i9;
        if (!dispatchNestedPreFling(f8, f9)) {
            boolean z8 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f8, f9, z8);
            s sVar = this.f10263V;
            if (sVar != null && sVar.onFling(i8, i9)) {
                return true;
            }
            if (z8) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i10 = this.f10266a0;
                int iMax = Math.max(-i10, Math.min(i8, i10));
                int i11 = this.f10266a0;
                this.f10274e0.fling(iMax, Math.max(-i11, Math.min(i9, i11)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i8) {
        View viewOnFocusSearchFailed;
        boolean z8;
        View viewOnInterceptFocusSearch = this.f10289m.onInterceptFocusSearch(view, i8);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z9 = (this.f10287l == null || this.f10289m == null || isComputingLayout() || this.f10311x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z9 && (i8 == 2 || i8 == 1)) {
            if (this.f10289m.canScrollVertically()) {
                int i9 = i8 == 2 ? 130 : 33;
                z8 = focusFinder.findNextFocus(this, view, i9) == null;
                if (f10238F0) {
                    i8 = i9;
                }
            } else {
                z8 = false;
            }
            if (!z8 && this.f10289m.canScrollHorizontally()) {
                int i10 = (this.f10289m.getLayoutDirection() == 1) ^ (i8 == 2) ? 66 : 17;
                boolean z10 = focusFinder.findNextFocus(this, view, i10) == null;
                if (f10238F0) {
                    i8 = i10;
                }
                z8 = z10;
            }
            if (z8) {
                q();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                N0();
                this.f10289m.onFocusSearchFailed(view, i8, this.f10267b, this.f10280h0);
                O0(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i8);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i8);
            if (viewFindNextFocus == null && z9) {
                q();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                N0();
                viewOnFocusSearchFailed = this.f10289m.onFocusSearchFailed(view, i8, this.f10267b, this.f10280h0);
                O0(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return f0(view, viewOnFocusSearchFailed, i8) ? viewOnFocusSearchFailed : super.focusSearch(view, i8);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i8);
        }
        C0(viewOnFocusSearchFailed, null);
        return view;
    }

    void g(E e8, m.c cVar, m.c cVar2) {
        e8.setIsRecyclable(false);
        if (this.f10254M.animateAppearance(e8, cVar, cVar2)) {
            r0();
        }
    }

    void g0(int i8) {
        if (this.f10289m == null) {
            return;
        }
        setScrollState(2);
        this.f10289m.scrollToPosition(i8);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f10289m;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + J());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f10289m;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + J());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f10287l;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f10289m;
        return pVar != null ? pVar.getBaseline() : super.getBaseline();
    }

    public int getChildAdapterPosition(View view) {
        E eS = S(view);
        if (eS != null) {
            return eS.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        return super.getChildDrawingOrder(i8, i9);
    }

    public long getChildItemId(View view) {
        E eS;
        h hVar = this.f10287l;
        if (hVar == null || !hVar.hasStableIds() || (eS = S(view)) == null) {
            return -1L;
        }
        return eS.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        E eS = S(view);
        if (eS != null) {
            return eS.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public E getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return S(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f10277g;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f10294o0;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        T(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.f10249H;
    }

    public m getItemAnimator() {
        return this.f10254M;
    }

    public o getItemDecorationAt(int i8) {
        int itemDecorationCount = getItemDecorationCount();
        if (i8 >= 0 && i8 < itemDecorationCount) {
            return (o) this.f10293o.get(i8);
        }
        throw new IndexOutOfBoundsException(i8 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.f10293o.size();
    }

    public p getLayoutManager() {
        return this.f10289m;
    }

    public int getMaxFlingVelocity() {
        return this.f10266a0;
    }

    public int getMinFlingVelocity() {
        return this.f10264W;
    }

    long getNanoTime() {
        if (f10237E0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f10263V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f10272d0;
    }

    public v getRecycledViewPool() {
        return this.f10267b.g();
    }

    public int getScrollState() {
        return this.f10255N;
    }

    void h0() {
        int iJ = this.f10273e.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            ((q) this.f10273e.i(i8).getLayoutParams()).f10414c = true;
        }
        this.f10267b.o();
    }

    public boolean hasFixedSize() {
        return this.f10301s;
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.f10305u || this.f10245D || this.f10271d.m();
    }

    void i(E e8, m.c cVar, m.c cVar2) {
        f(e8);
        e8.setIsRecyclable(false);
        if (this.f10254M.animateDisappearance(e8, cVar, cVar2)) {
            r0();
        }
    }

    void i0() {
        int iJ = this.f10273e.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            E eS = S(this.f10273e.i(i8));
            if (eS != null && !eS.C()) {
                eS.b(6);
            }
        }
        h0();
        this.f10267b.p();
    }

    public void invalidateItemDecorations() {
        if (this.f10293o.size() == 0) {
            return;
        }
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        h0();
        requestLayout();
    }

    public boolean isAnimating() {
        m mVar = this.f10254M;
        return mVar != null && mVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f10299r;
    }

    public boolean isComputingLayout() {
        return this.f10247F > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f10311x;
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    void j(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + J());
        }
        throw new IllegalStateException(str + J());
    }

    void k(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + J());
        }
        if (this.f10248G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + J()));
        }
    }

    void k0(int i8, int i9) {
        int iJ = this.f10273e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eS = S(this.f10273e.i(i10));
            if (eS != null && !eS.C() && eS.f10358b >= i8) {
                eS.u(i9, false);
                this.f10280h0.f10338g = true;
            }
        }
        this.f10267b.q(i8, i9);
        requestLayout();
    }

    boolean l(E e8) {
        m mVar = this.f10254M;
        return mVar == null || mVar.canReuseUpdatedViewHolder(e8, e8.j());
    }

    void l0(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iJ = this.f10273e.j();
        if (i8 < i9) {
            i12 = -1;
            i11 = i8;
            i10 = i9;
        } else {
            i10 = i8;
            i11 = i9;
            i12 = 1;
        }
        for (int i14 = 0; i14 < iJ; i14++) {
            E eS = S(this.f10273e.i(i14));
            if (eS != null && (i13 = eS.f10358b) >= i11 && i13 <= i10) {
                if (i13 == i8) {
                    eS.u(i9 - i8, false);
                } else {
                    eS.u(i12, false);
                }
                this.f10280h0.f10338g = true;
            }
        }
        this.f10267b.r(i8, i9);
        requestLayout();
    }

    void m0(int i8, int i9, boolean z8) {
        int i10 = i8 + i9;
        int iJ = this.f10273e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            E eS = S(this.f10273e.i(i11));
            if (eS != null && !eS.C()) {
                int i12 = eS.f10358b;
                if (i12 >= i10) {
                    eS.u(-i9, z8);
                    this.f10280h0.f10338g = true;
                } else if (i12 >= i8) {
                    eS.i(i8 - 1, -i9, z8);
                    this.f10280h0.f10338g = true;
                }
            }
        }
        this.f10267b.s(i8, i9, z8);
        requestLayout();
    }

    void n0() {
        this.f10247F++;
    }

    public void nestedScrollBy(int i8, int i9) {
        j0(i8, i9, null, 1);
    }

    void o() {
        int iJ = this.f10273e.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            E eS = S(this.f10273e.i(i8));
            if (!eS.C()) {
                eS.c();
            }
        }
        this.f10267b.c();
    }

    void o0() {
        p0(true);
    }

    public void offsetChildrenHorizontal(int i8) {
        int iG = this.f10273e.g();
        for (int i9 = 0; i9 < iG; i9++) {
            this.f10273e.f(i9).offsetLeftAndRight(i8);
        }
    }

    public void offsetChildrenVertical(int i8) {
        int iG = this.f10273e.g();
        for (int i9 = 0; i9 < iG; i9++) {
            this.f10273e.f(i9).offsetTopAndBottom(i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f10247F = r0
            r1 = 1
            r5.f10299r = r1
            boolean r2 = r5.f10305u
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f10305u = r1
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f10289m
            if (r1 == 0) goto L1e
            r1.c(r5)
        L1e:
            r5.f10292n0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f10237E0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f10582e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f10276f0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f10276f0 = r1
            android.view.Display r1 = androidx.core.view.AbstractC0985p0.getDisplay(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f10276f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f10586c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f10276f0
            r0.add(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        m mVar = this.f10254M;
        if (mVar != null) {
            mVar.endAnimations();
        }
        stopScroll();
        this.f10299r = false;
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.d(this, this.f10267b);
        }
        this.f10306u0.clear();
        removeCallbacks(this.f10308v0);
        this.f10275f.j();
        if (!f10237E0 || (eVar = this.f10276f0) == null) {
            return;
        }
        eVar.remove(this);
        this.f10276f0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f10293o.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((o) this.f10293o.get(i8)).onDraw(canvas, this, this.f10280h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f10289m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f10311x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f10289m
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f10289m
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f10289m
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f10289m
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f10268b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f10270c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.j0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        if (this.f10311x) {
            return false;
        }
        this.f10297q = null;
        if (L(motionEvent)) {
            m();
            return true;
        }
        p pVar = this.f10289m;
        if (pVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10289m.canScrollVertically();
        if (this.f10257P == null) {
            this.f10257P = VelocityTracker.obtain();
        }
        this.f10257P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f10313y) {
                this.f10313y = false;
            }
            this.f10256O = motionEvent.getPointerId(0);
            int x8 = (int) (motionEvent.getX() + 0.5f);
            this.f10260S = x8;
            this.f10258Q = x8;
            int y8 = (int) (motionEvent.getY() + 0.5f);
            this.f10261T = y8;
            this.f10259R = y8;
            if (this.f10255N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.f10302s0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i8 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i8 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i8, 0);
        } else if (actionMasked == 1) {
            this.f10257P.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f10256O);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10256O + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x9 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f10255N != 1) {
                int i9 = x9 - this.f10258Q;
                int i10 = y9 - this.f10259R;
                if (zCanScrollHorizontally == 0 || Math.abs(i9) <= this.f10262U) {
                    z8 = false;
                } else {
                    this.f10260S = x9;
                    z8 = true;
                }
                if (zCanScrollVertically && Math.abs(i10) > this.f10262U) {
                    this.f10261T = y9;
                    z8 = true;
                }
                if (z8) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m();
        } else if (actionMasked == 5) {
            this.f10256O = motionEvent.getPointerId(actionIndex);
            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f10260S = x10;
            this.f10258Q = x10;
            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f10261T = y10;
            this.f10259R = y10;
        } else if (actionMasked == 6) {
            q0(motionEvent);
        }
        return this.f10255N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        androidx.core.os.q.beginSection("RV OnLayout");
        x();
        androidx.core.os.q.endSection();
        this.f10305u = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        p pVar = this.f10289m;
        if (pVar == null) {
            s(i8, i9);
            return;
        }
        boolean z8 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f10289m.onMeasure(this.f10267b, this.f10280h0, i8, i9);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z8 = true;
            }
            this.f10310w0 = z8;
            if (z8 || this.f10287l == null) {
                return;
            }
            if (this.f10280h0.f10336e == 1) {
                y();
            }
            this.f10289m.q(i8, i9);
            this.f10280h0.f10341j = true;
            z();
            this.f10289m.r(i8, i9);
            if (this.f10289m.u()) {
                this.f10289m.q(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f10280h0.f10341j = true;
                z();
                this.f10289m.r(i8, i9);
            }
            this.f10312x0 = getMeasuredWidth();
            this.f10314y0 = getMeasuredHeight();
            return;
        }
        if (this.f10301s) {
            this.f10289m.onMeasure(this.f10267b, this.f10280h0, i8, i9);
            return;
        }
        if (this.f10242A) {
            N0();
            n0();
            t0();
            o0();
            B b9 = this.f10280h0;
            if (b9.f10343l) {
                b9.f10339h = true;
            } else {
                this.f10271d.g();
                this.f10280h0.f10339h = false;
            }
            this.f10242A = false;
            O0(false);
        } else if (this.f10280h0.f10343l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f10287l;
        if (hVar != null) {
            this.f10280h0.f10337f = hVar.getItemCount();
        } else {
            this.f10280h0.f10337f = 0;
        }
        N0();
        this.f10289m.onMeasure(this.f10267b, this.f10280h0, i8, i9);
        O0(false);
        this.f10280h0.f10339h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f10269c = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f10269c;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            p pVar = this.f10289m;
            if (pVar != null) {
                zVar.f10432b = pVar.onSaveInstanceState();
            } else {
                zVar.f10432b = null;
            }
        }
        return zVar;
    }

    public void onScrollStateChanged(int i8) {
    }

    public void onScrolled(int i8, int i9) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 == i10 && i9 == i11) {
            return;
        }
        d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00df A[PHI: r0
  0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:147:0x00c8, B:151:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void p(int i8, int i9) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10250I;
        if (edgeEffect == null || edgeEffect.isFinished() || i8 <= 0) {
            zIsFinished = false;
        } else {
            this.f10250I.onRelease();
            zIsFinished = this.f10250I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f10252K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i8 < 0) {
            this.f10252K.onRelease();
            zIsFinished |= this.f10252K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10251J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i9 > 0) {
            this.f10251J.onRelease();
            zIsFinished |= this.f10251J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10253L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i9 < 0) {
            this.f10253L.onRelease();
            zIsFinished |= this.f10253L.isFinished();
        }
        if (zIsFinished) {
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    void p0(boolean z8) {
        int i8 = this.f10247F - 1;
        this.f10247F = i8;
        if (i8 < 1) {
            this.f10247F = 0;
            if (z8) {
                w();
                D();
            }
        }
    }

    void q() {
        if (!this.f10305u || this.f10245D) {
            androidx.core.os.q.beginSection("RV FullInvalidate");
            x();
            androidx.core.os.q.endSection();
            return;
        }
        if (this.f10271d.m()) {
            if (!this.f10271d.l(4) || this.f10271d.l(11)) {
                if (this.f10271d.m()) {
                    androidx.core.os.q.beginSection("RV FullInvalidate");
                    x();
                    androidx.core.os.q.endSection();
                    return;
                }
                return;
            }
            androidx.core.os.q.beginSection("RV PartialInvalidate");
            N0();
            n0();
            this.f10271d.t();
            if (!this.f10309w) {
                if (Y()) {
                    x();
                } else {
                    this.f10271d.f();
                }
            }
            O0(true);
            o0();
            androidx.core.os.q.endSection();
        }
    }

    void r0() {
        if (this.f10292n0 || !this.f10299r) {
            return;
        }
        AbstractC0985p0.postOnAnimation(this, this.f10308v0);
        this.f10292n0 = true;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z8) {
        E eS = S(view);
        if (eS != null) {
            if (eS.r()) {
                eS.f();
            } else if (!eS.C()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + eS + J());
            }
        }
        view.clearAnimation();
        v(view);
        super.removeDetachedView(view, z8);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f10293o.remove(oVar);
        if (this.f10293o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        h0();
        requestLayout();
    }

    public void removeItemDecorationAt(int i8) {
        int itemDecorationCount = getItemDecorationCount();
        if (i8 >= 0 && i8 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i8));
            return;
        }
        throw new IndexOutOfBoundsException(i8 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List list = this.f10244C;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.f10295p.remove(tVar);
        if (this.f10297q == tVar) {
            this.f10297q = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List list = this.f10284j0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.f10291n.remove(xVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f10289m.onRequestChildFocus(this, this.f10280h0, view, view2) && view2 != null) {
            C0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        return this.f10289m.requestChildRectangleOnScreen(this, view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        int size = this.f10295p.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((t) this.f10295p.get(i8)).onRequestDisallowInterceptTouchEvent(z8);
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f10307v != 0 || this.f10311x) {
            this.f10309w = true;
        } else {
            super.requestLayout();
        }
    }

    void s(int i8, int i9) {
        setMeasuredDimension(p.chooseSize(i8, getPaddingLeft() + getPaddingRight(), AbstractC0985p0.getMinimumWidth(this)), p.chooseSize(i9, getPaddingTop() + getPaddingBottom(), AbstractC0985p0.getMinimumHeight(this)));
    }

    @Override // android.view.View
    public void scrollBy(int i8, int i9) {
        p pVar = this.f10289m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10311x) {
            return;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10289m.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i8 = 0;
            }
            if (!zCanScrollVertically) {
                i9 = 0;
            }
            H0(i8, i9, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i8) {
        if (this.f10311x) {
            return;
        }
        stopScroll();
        p pVar = this.f10289m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.scrollToPosition(i8);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (L0(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f10294o0 = lVar;
        AbstractC0985p0.setAccessibilityDelegate(this, lVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        J0(hVar, false, true);
        u0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z8) {
        if (z8 != this.f10277g) {
            d0();
        }
        this.f10277g = z8;
        super.setClipToPadding(z8);
        if (this.f10305u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        Z.h.checkNotNull(lVar);
        this.f10249H = lVar;
        d0();
    }

    public void setHasFixedSize(boolean z8) {
        this.f10301s = z8;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f10254M;
        if (mVar2 != null) {
            mVar2.endAnimations();
            this.f10254M.b(null);
        }
        this.f10254M = mVar;
        if (mVar != null) {
            mVar.b(this.f10290m0);
        }
    }

    public void setItemViewCacheSize(int i8) {
        this.f10267b.setViewCacheSize(i8);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z8) {
        suppressLayout(z8);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f10289m) {
            return;
        }
        stopScroll();
        if (this.f10289m != null) {
            m mVar = this.f10254M;
            if (mVar != null) {
                mVar.endAnimations();
            }
            this.f10289m.removeAndRecycleAllViews(this.f10267b);
            this.f10289m.n(this.f10267b);
            this.f10267b.clear();
            if (this.f10299r) {
                this.f10289m.d(this, this.f10267b);
            }
            this.f10289m.s(null);
            this.f10289m = null;
        } else {
            this.f10267b.clear();
        }
        this.f10273e.o();
        this.f10289m = pVar;
        if (pVar != null) {
            if (pVar.f10393b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f10393b.J());
            }
            pVar.s(this);
            if (this.f10299r) {
                this.f10289m.c(this);
            }
        }
        this.f10267b.E();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public void setNestedScrollingEnabled(boolean z8) {
        getScrollingChildHelper().setNestedScrollingEnabled(z8);
    }

    public void setOnFlingListener(s sVar) {
        this.f10263V = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f10282i0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z8) {
        this.f10272d0 = z8;
    }

    public void setRecycledViewPool(v vVar) {
        this.f10267b.z(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    void setScrollState(int i8) {
        if (i8 == this.f10255N) {
            return;
        }
        this.f10255N = i8;
        if (i8 != 2) {
            P0();
        }
        B(i8);
    }

    public void setScrollingTouchSlop(int i8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i8 != 0) {
            if (i8 == 1) {
                this.f10262U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i8 + "; using default value");
        }
        this.f10262U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c9) {
        this.f10267b.A(c9);
    }

    public void smoothScrollBy(int i8, int i9) {
        smoothScrollBy(i8, i9, null);
    }

    public void smoothScrollToPosition(int i8) {
        if (this.f10311x) {
            return;
        }
        p pVar = this.f10289m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.smoothScrollToPosition(this, this.f10280h0, i8);
        }
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public boolean startNestedScroll(int i8) {
        return getScrollingChildHelper().startNestedScroll(i8);
    }

    @Override // android.view.View, androidx.core.view.N, androidx.core.view.P
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        setScrollState(0);
        P0();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z8) {
        if (z8 != this.f10311x) {
            k("Do not suppressLayout in layout or scroll");
            if (z8) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f10311x = true;
                this.f10313y = true;
                stopScroll();
                return;
            }
            this.f10311x = false;
            if (this.f10309w && this.f10289m != null && this.f10287l != null) {
                requestLayout();
            }
            this.f10309w = false;
        }
    }

    public void swapAdapter(h hVar, boolean z8) {
        setLayoutFrozen(false);
        J0(hVar, true, z8);
        u0(true);
        requestLayout();
    }

    void u(View view) {
        E eS = S(view);
        onChildAttachedToWindow(view);
        h hVar = this.f10287l;
        if (hVar != null && eS != null) {
            hVar.onViewAttachedToWindow(eS);
        }
        List list = this.f10244C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f10244C.get(size)).onChildViewAttachedToWindow(view);
            }
        }
    }

    void u0(boolean z8) {
        this.f10246E = z8 | this.f10246E;
        this.f10245D = true;
        i0();
    }

    void v(View view) {
        E eS = S(view);
        onChildDetachedFromWindow(view);
        h hVar = this.f10287l;
        if (hVar != null && eS != null) {
            hVar.onViewDetachedFromWindow(eS);
        }
        List list = this.f10244C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f10244C.get(size)).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void w0(E e8, m.c cVar) {
        e8.z(0, 8192);
        if (this.f10280h0.f10340i && e8.s() && !e8.p() && !e8.C()) {
            this.f10275f.c(R(e8), e8);
        }
        this.f10275f.e(e8, cVar);
    }

    void x() {
        if (this.f10287l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f10289m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f10280h0.f10341j = false;
        boolean z8 = this.f10310w0 && !(this.f10312x0 == getWidth() && this.f10314y0 == getHeight());
        this.f10312x0 = 0;
        this.f10314y0 = 0;
        this.f10310w0 = false;
        if (this.f10280h0.f10336e == 1) {
            y();
            this.f10289m.p(this);
            z();
        } else if (this.f10271d.n() || z8 || this.f10289m.getWidth() != getWidth() || this.f10289m.getHeight() != getHeight()) {
            this.f10289m.p(this);
            z();
        } else {
            this.f10289m.p(this);
        }
        A();
    }

    void z0() {
        m mVar = this.f10254M;
        if (mVar != null) {
            mVar.endAnimations();
        }
        p pVar = this.f10289m;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.f10267b);
            this.f10289m.n(this.f10267b);
        }
        this.f10267b.clear();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6397a.recyclerViewStyle);
    }

    @Override // androidx.core.view.N
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i8, i9, iArr, iArr2, i10);
    }

    @Override // androidx.core.view.N
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12) {
        return getScrollingChildHelper().dispatchNestedScroll(i8, i9, i10, i11, iArr, i12);
    }

    @Override // androidx.core.view.N
    public boolean hasNestedScrollingParent(int i8) {
        return getScrollingChildHelper().hasNestedScrollingParent(i8);
    }

    public void smoothScrollBy(int i8, int i9, Interpolator interpolator) {
        smoothScrollBy(i8, i9, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.N
    public boolean startNestedScroll(int i8, int i9) {
        return getScrollingChildHelper().startNestedScroll(i8, i9);
    }

    @Override // androidx.core.view.N
    public void stopNestedScroll(int i8) {
        getScrollingChildHelper().stopNestedScroll(i8);
    }

    public static class z extends AbstractC1087a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: b */
        Parcelable f10432b;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public z[] newArray(int i8) {
                return new z[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10432b = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f10432b = zVar.f10432b;
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeParcelable(this.f10432b, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i8) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i8);
        this.f10265a = new y();
        this.f10267b = new w();
        this.f10275f = new androidx.recyclerview.widget.q();
        this.f10279h = new RunnableC1028a();
        this.f10281i = new Rect();
        this.f10283j = new Rect();
        this.f10285k = new RectF();
        this.f10291n = new ArrayList();
        this.f10293o = new ArrayList();
        this.f10295p = new ArrayList();
        this.f10307v = 0;
        this.f10245D = false;
        this.f10246E = false;
        this.f10247F = 0;
        this.f10248G = 0;
        this.f10249H = new l();
        this.f10254M = new c();
        this.f10255N = 0;
        this.f10256O = -1;
        this.f10268b0 = Float.MIN_VALUE;
        this.f10270c0 = Float.MIN_VALUE;
        this.f10272d0 = true;
        this.f10274e0 = new D();
        this.f10278g0 = f10237E0 ? new e.b() : null;
        this.f10280h0 = new B();
        this.f10286k0 = false;
        this.f10288l0 = false;
        this.f10290m0 = new n();
        this.f10292n0 = false;
        this.f10296p0 = new int[2];
        this.f10300r0 = new int[2];
        this.f10302s0 = new int[2];
        this.f10304t0 = new int[2];
        this.f10306u0 = new ArrayList();
        this.f10308v0 = new RunnableC1029b();
        this.f10312x0 = 0;
        this.f10314y0 = 0;
        this.f10316z0 = new C1031d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10262U = viewConfiguration.getScaledTouchSlop();
        this.f10268b0 = AbstractC0993t0.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.f10270c0 = AbstractC0993t0.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.f10264W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10266a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f10254M.b(this.f10290m0);
        Z();
        b0();
        a0();
        if (AbstractC0985p0.getImportantForAccessibility(this) == 0) {
            AbstractC0985p0.setImportantForAccessibility(this, 1);
        }
        this.f10243B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.c.RecyclerView, i8, 0);
        AbstractC0985p0.saveAttributeDataForStyleable(this, context, u0.c.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i8, 0);
        String string = typedArrayObtainStyledAttributes.getString(u0.c.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(u0.c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f10277g = typedArrayObtainStyledAttributes.getBoolean(u0.c.RecyclerView_android_clipToPadding, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(u0.c.RecyclerView_fastScrollEnabled, false);
        this.f10303t = z8;
        if (z8) {
            c0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(u0.c.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(u0.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(u0.c.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(u0.c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        r(context, string, attributeSet, i8, 0);
        int[] iArr = f10233A0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i8, 0);
        AbstractC0985p0.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i8, 0);
        boolean z9 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z9);
    }

    @Override // androidx.core.view.O
    public final void dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    public void smoothScrollBy(int i8, int i9, Interpolator interpolator, int i10) {
        M0(i8, i9, interpolator, i10, false);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        E f10412a;

        /* renamed from: b */
        final Rect f10413b;

        /* renamed from: c */
        boolean f10414c;

        /* renamed from: d */
        boolean f10415d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10413b = new Rect();
            this.f10414c = true;
            this.f10415d = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.f10412a.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.f10412a.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.f10412a.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.f10412a.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.f10412a.getPosition();
        }

        public boolean isItemChanged() {
            return this.f10412a.s();
        }

        public boolean isItemRemoved() {
            return this.f10412a.p();
        }

        public boolean isViewInvalid() {
            return this.f10412a.o();
        }

        public boolean viewNeedsUpdate() {
            return this.f10412a.t();
        }

        public q(int i8, int i9) {
            super(i8, i9);
            this.f10413b = new Rect();
            this.f10414c = true;
            this.f10415d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10413b = new Rect();
            this.f10414c = true;
            this.f10415d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10413b = new Rect();
            this.f10414c = true;
            this.f10415d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f10413b = new Rect();
            this.f10414c = true;
            this.f10415d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f10289m;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + J());
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }
}
