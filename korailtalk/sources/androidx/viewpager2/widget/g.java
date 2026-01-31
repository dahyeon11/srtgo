package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.O;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;

    /* renamed from: u, reason: collision with root package name */
    static boolean f11000u = true;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f11001a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f11002b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f11003c;

    /* renamed from: d, reason: collision with root package name */
    int f11004d;

    /* renamed from: e, reason: collision with root package name */
    boolean f11005e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f11006f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayoutManager f11007g;

    /* renamed from: h, reason: collision with root package name */
    private int f11008h;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f11009i;

    /* renamed from: j, reason: collision with root package name */
    RecyclerView f11010j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.recyclerview.widget.k f11011k;

    /* renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.e f11012l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f11013m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.c f11014n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f11015o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.m f11016p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11017q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11018r;

    /* renamed from: s, reason: collision with root package name */
    private int f11019s;

    /* renamed from: t, reason: collision with root package name */
    e f11020t;

    class a extends AbstractC0174g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.g.AbstractC0174g, androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            g gVar = g.this;
            gVar.f11005e = true;
            gVar.f11012l.l();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.g.i
        public void onPageScrollStateChanged(int i8) {
            if (i8 == 0) {
                g.this.j();
            }
        }

        @Override // androidx.viewpager2.widget.g.i
        public void onPageSelected(int i8) {
            g gVar = g.this;
            if (gVar.f11004d != i8) {
                gVar.f11004d = i8;
                gVar.f11020t.onSetNewCurrentItem();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.g.i
        public void onPageSelected(int i8) {
            g.this.clearFocus();
            if (g.this.hasFocus()) {
                g.this.f11010j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onChildViewAttachedToWindow(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onChildViewDetachedFromWindow(View view) {
        }
    }

    private abstract class e {
        private e() {
        }

        boolean handlesGetAccessibilityClassName() {
            return false;
        }

        boolean handlesLmPerformAccessibilityAction(int i8) {
            return false;
        }

        boolean handlesPerformAccessibilityAction(int i8, Bundle bundle) {
            return false;
        }

        boolean handlesRvGetAccessibilityClassName() {
            return false;
        }

        void onAttachAdapter(RecyclerView.h hVar) {
        }

        void onDetachAdapter(RecyclerView.h hVar) {
        }

        String onGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        void onInitialize(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void onLmInitializeAccessibilityNodeInfo(H h8) {
        }

        boolean onLmPerformAccessibilityAction(int i8) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean onPerformAccessibilityAction(int i8, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void onRestorePendingState() {
        }

        CharSequence onRvGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        void onRvInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        }

        void onSetLayoutDirection() {
        }

        void onSetNewCurrentItem() {
        }

        void onSetOrientation() {
        }

        void onSetUserInputEnabled() {
        }

        /* synthetic */ e(g gVar, a aVar) {
            this();
        }
    }

    class f extends e {
        f() {
            super(g.this, null);
        }

        @Override // androidx.viewpager2.widget.g.e
        public boolean handlesLmPerformAccessibilityAction(int i8) {
            return (i8 == 8192 || i8 == 4096) && !g.this.isUserInputEnabled();
        }

        @Override // androidx.viewpager2.widget.g.e
        public boolean handlesRvGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onLmInitializeAccessibilityNodeInfo(H h8) {
            if (g.this.isUserInputEnabled()) {
                return;
            }
            h8.removeAction(H.a.ACTION_SCROLL_BACKWARD);
            h8.removeAction(H.a.ACTION_SCROLL_FORWARD);
            h8.setScrollable(false);
        }

        @Override // androidx.viewpager2.widget.g.e
        public boolean onLmPerformAccessibilityAction(int i8) {
            if (handlesLmPerformAccessibilityAction(i8)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.g.e
        public CharSequence onRvGetAccessibilityClassName() {
            if (handlesRvGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.g$g, reason: collision with other inner class name */
    private static abstract class AbstractC0174g extends RecyclerView.j {
        private AbstractC0174g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i8, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i8, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i8, int i9, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i8, int i9) {
            onChanged();
        }

        /* synthetic */ AbstractC0174g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i8, int i9, Object obj) {
            onChanged();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.B b9, H h8) {
            super.onInitializeAccessibilityNodeInfo(wVar, b9, h8);
            g.this.f11020t.onLmInitializeAccessibilityNodeInfo(h8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean performAccessibilityAction(RecyclerView.w wVar, RecyclerView.B b9, int i8, Bundle bundle) {
            return g.this.f11020t.handlesLmPerformAccessibilityAction(i8) ? g.this.f11020t.onLmPerformAccessibilityAction(i8) : super.performAccessibilityAction(wVar, b9, i8, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void x(RecyclerView.B b9, int[] iArr) {
            int offscreenPageLimit = g.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.x(b9, iArr);
                return;
            }
            int pageSize = g.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    public static abstract class i {
        public void onPageScrollStateChanged(int i8) {
        }

        public void onPageScrolled(int i8, float f8, int i9) {
        }

        public void onPageSelected(int i8) {
        }
    }

    class j extends e {

        /* renamed from: b, reason: collision with root package name */
        private final O f11028b;

        /* renamed from: c, reason: collision with root package name */
        private final O f11029c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f11030d;

        class a implements O {
            a() {
            }

            @Override // androidx.core.view.accessibility.O
            public boolean perform(View view, O.a aVar) {
                j.this.c(((g) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements O {
            b() {
            }

            @Override // androidx.core.view.accessibility.O
            public boolean perform(View view, O.a aVar) {
                j.this.c(((g) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends AbstractC0174g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.g.AbstractC0174g, androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                j.this.d();
            }
        }

        j() {
            super(g.this, null);
            this.f11028b = new a();
            this.f11029c = new b();
        }

        private void a(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (g.this.getAdapter() == null) {
                itemCount = 0;
                itemCount2 = 0;
            } else if (g.this.getOrientation() == 1) {
                itemCount = g.this.getAdapter().getItemCount();
                itemCount2 = 0;
            } else {
                itemCount2 = g.this.getAdapter().getItemCount();
                itemCount = 0;
            }
            H.wrap(accessibilityNodeInfo).setCollectionInfo(H.e.obtain(itemCount, itemCount2, false, 0));
        }

        private void b(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.h adapter = g.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !g.this.isUserInputEnabled()) {
                return;
            }
            if (g.this.f11004d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (g.this.f11004d < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        void c(int i8) {
            if (g.this.isUserInputEnabled()) {
                g.this.f(i8, true);
            }
        }

        void d() {
            int itemCount;
            g gVar = g.this;
            int i8 = R.id.accessibilityActionPageLeft;
            AbstractC0985p0.removeAccessibilityAction(gVar, R.id.accessibilityActionPageLeft);
            AbstractC0985p0.removeAccessibilityAction(gVar, R.id.accessibilityActionPageRight);
            AbstractC0985p0.removeAccessibilityAction(gVar, R.id.accessibilityActionPageUp);
            AbstractC0985p0.removeAccessibilityAction(gVar, R.id.accessibilityActionPageDown);
            if (g.this.getAdapter() == null || (itemCount = g.this.getAdapter().getItemCount()) == 0 || !g.this.isUserInputEnabled()) {
                return;
            }
            if (g.this.getOrientation() != 0) {
                if (g.this.f11004d < itemCount - 1) {
                    AbstractC0985p0.replaceAccessibilityAction(gVar, new H.a(R.id.accessibilityActionPageDown, null), null, this.f11028b);
                }
                if (g.this.f11004d > 0) {
                    AbstractC0985p0.replaceAccessibilityAction(gVar, new H.a(R.id.accessibilityActionPageUp, null), null, this.f11029c);
                    return;
                }
                return;
            }
            boolean zC = g.this.c();
            int i9 = zC ? 16908360 : 16908361;
            if (zC) {
                i8 = 16908361;
            }
            if (g.this.f11004d < itemCount - 1) {
                AbstractC0985p0.replaceAccessibilityAction(gVar, new H.a(i9, null), null, this.f11028b);
            }
            if (g.this.f11004d > 0) {
                AbstractC0985p0.replaceAccessibilityAction(gVar, new H.a(i8, null), null, this.f11029c);
            }
        }

        @Override // androidx.viewpager2.widget.g.e
        public boolean handlesGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.g.e
        public boolean handlesPerformAccessibilityAction(int i8, Bundle bundle) {
            return i8 == 8192 || i8 == 4096;
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onAttachAdapter(RecyclerView.h hVar) {
            d();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f11030d);
            }
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onDetachAdapter(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f11030d);
            }
        }

        @Override // androidx.viewpager2.widget.g.e
        public String onGetAccessibilityClassName() {
            if (handlesGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onInitialize(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            AbstractC0985p0.setImportantForAccessibility(recyclerView, 2);
            this.f11030d = new c();
            if (AbstractC0985p0.getImportantForAccessibility(g.this) == 0) {
                AbstractC0985p0.setImportantForAccessibility(g.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            a(accessibilityNodeInfo);
            b(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.g.e
        public boolean onPerformAccessibilityAction(int i8, Bundle bundle) {
            if (!handlesPerformAccessibilityAction(i8, bundle)) {
                throw new IllegalStateException();
            }
            c(i8 == 8192 ? g.this.getCurrentItem() - 1 : g.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onRestorePendingState() {
            d();
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onRvInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(g.this);
            accessibilityEvent.setClassName(onGetAccessibilityClassName());
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onSetLayoutDirection() {
            d();
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onSetNewCurrentItem() {
            d();
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onSetOrientation() {
            d();
        }

        @Override // androidx.viewpager2.widget.g.e
        public void onSetUserInputEnabled() {
            d();
        }
    }

    public interface k {
    }

    private class l extends androidx.recyclerview.widget.k {
        l() {
        }

        @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.o
        public View findSnapView(RecyclerView.p pVar) {
            if (g.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(pVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return g.this.f11020t.handlesRvGetAccessibilityClassName() ? g.this.f11020t.onRvGetAccessibilityClassName() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(g.this.f11004d);
            accessibilityEvent.setToIndex(g.this.f11004d);
            g.this.f11020t.onRvInitializeAccessibilityEvent(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return g.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return g.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }
    }

    private static class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f11040a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f11041b;

        o(int i8, RecyclerView recyclerView) {
            this.f11040a = i8;
            this.f11041b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11041b.smoothScrollToPosition(this.f11040a);
        }
    }

    public g(Context context) {
        super(context);
        this.f11001a = new Rect();
        this.f11002b = new Rect();
        this.f11003c = new androidx.viewpager2.widget.b(3);
        this.f11005e = false;
        this.f11006f = new a();
        this.f11008h = -1;
        this.f11016p = null;
        this.f11017q = false;
        this.f11018r = true;
        this.f11019s = -1;
        b(context, null);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f11020t = f11000u ? new j() : new f();
        m mVar = new m(context);
        this.f11010j = mVar;
        mVar.setId(AbstractC0985p0.generateViewId());
        this.f11010j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f11007g = hVar;
        this.f11010j.setLayoutManager(hVar);
        this.f11010j.setScrollingTouchSlop(1);
        g(context, attributeSet);
        this.f11010j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f11010j.addOnChildAttachStateChangeListener(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f11012l = eVar;
        this.f11014n = new androidx.viewpager2.widget.c(this, eVar, this.f11010j);
        l lVar = new l();
        this.f11011k = lVar;
        lVar.attachToRecyclerView(this.f11010j);
        this.f11010j.addOnScrollListener(this.f11012l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f11013m = bVar;
        this.f11012l.p(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f11013m.a(bVar2);
        this.f11013m.a(cVar);
        this.f11020t.onInitialize(this.f11013m, this.f11010j);
        this.f11013m.a(this.f11003c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f11007g);
        this.f11015o = dVar;
        this.f11013m.a(dVar);
        RecyclerView recyclerView = this.f11010j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void d(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f11006f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        RecyclerView.h adapter;
        if (this.f11008h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f11009i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).restoreState(parcelable);
            }
            this.f11009i = null;
        }
        int iMax = Math.max(0, Math.min(this.f11008h, adapter.getItemCount() - 1));
        this.f11004d = iMax;
        this.f11008h = -1;
        this.f11010j.scrollToPosition(iMax);
        this.f11020t.onRestorePendingState();
    }

    private void g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F0.a.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, F0.a.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(F0.a.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void i(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f11006f);
        }
    }

    public void addItemDecoration(RecyclerView.o oVar) {
        this.f11010j.addItemDecoration(oVar);
    }

    public boolean beginFakeDrag() {
        return this.f11014n.b();
    }

    boolean c() {
        return this.f11007g.getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        return this.f11010j.canScrollHorizontally(i8);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i8) {
        return this.f11010j.canScrollVertically(i8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i8 = ((n) parcelable).f11037a;
            sparseArray.put(this.f11010j.getId(), sparseArray.get(i8));
            sparseArray.remove(i8);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        e();
    }

    public boolean endFakeDrag() {
        return this.f11014n.d();
    }

    void f(int i8, boolean z8) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f11008h != -1) {
                this.f11008h = Math.max(i8, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i8, 0), adapter.getItemCount() - 1);
        if (iMin == this.f11004d && this.f11012l.i()) {
            return;
        }
        int i9 = this.f11004d;
        if (iMin == i9 && z8) {
            return;
        }
        double dE = i9;
        this.f11004d = iMin;
        this.f11020t.onSetNewCurrentItem();
        if (!this.f11012l.i()) {
            dE = this.f11012l.e();
        }
        this.f11012l.n(iMin, z8);
        if (!z8) {
            this.f11010j.scrollToPosition(iMin);
            return;
        }
        double d9 = iMin;
        if (Math.abs(d9 - dE) <= 3.0d) {
            this.f11010j.smoothScrollToPosition(iMin);
            return;
        }
        this.f11010j.scrollToPosition(d9 > dE ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f11010j;
        recyclerView.post(new o(iMin, recyclerView));
    }

    public boolean fakeDragBy(float f8) {
        return this.f11014n.e(f8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f11020t.handlesGetAccessibilityClassName() ? this.f11020t.onGetAccessibilityClassName() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f11010j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f11004d;
    }

    public RecyclerView.o getItemDecorationAt(int i8) {
        return this.f11010j.getItemDecorationAt(i8);
    }

    public int getItemDecorationCount() {
        return this.f11010j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f11019s;
    }

    public int getOrientation() {
        return this.f11007g.getOrientation();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f11010j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f11012l.f();
    }

    void h() {
        View viewFindSnapView = this.f11011k.findSnapView(this.f11007g);
        if (viewFindSnapView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.f11011k.calculateDistanceToFinalSnap(this.f11007g, viewFindSnapView);
        int i8 = iArrCalculateDistanceToFinalSnap[0];
        if (i8 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f11010j.smoothScrollBy(i8, iArrCalculateDistanceToFinalSnap[1]);
    }

    public void invalidateItemDecorations() {
        this.f11010j.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.f11014n.f();
    }

    public boolean isUserInputEnabled() {
        return this.f11018r;
    }

    void j() {
        androidx.recyclerview.widget.k kVar = this.f11011k;
        if (kVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = kVar.findSnapView(this.f11007g);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f11007g.getPosition(viewFindSnapView);
        if (position != this.f11004d && getScrollState() == 0) {
            this.f11013m.onPageSelected(position);
        }
        this.f11005e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f11020t.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int measuredWidth = this.f11010j.getMeasuredWidth();
        int measuredHeight = this.f11010j.getMeasuredHeight();
        this.f11001a.left = getPaddingLeft();
        this.f11001a.right = (i10 - i8) - getPaddingRight();
        this.f11001a.top = getPaddingTop();
        this.f11001a.bottom = (i11 - i9) - getPaddingBottom();
        Gravity.apply(L2.a.TOP_START, measuredWidth, measuredHeight, this.f11001a, this.f11002b);
        RecyclerView recyclerView = this.f11010j;
        Rect rect = this.f11002b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f11005e) {
            j();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        measureChild(this.f11010j, i8, i9);
        int measuredWidth = this.f11010j.getMeasuredWidth();
        int measuredHeight = this.f11010j.getMeasuredHeight();
        int measuredState = this.f11010j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f11008h = nVar.f11038b;
        this.f11009i = nVar.f11039c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f11037a = this.f11010j.getId();
        int i8 = this.f11008h;
        if (i8 == -1) {
            i8 = this.f11004d;
        }
        nVar.f11038b = i8;
        Parcelable parcelable = this.f11009i;
        if (parcelable != null) {
            nVar.f11039c = parcelable;
        } else {
            Object adapter = this.f11010j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                nVar.f11039c = ((androidx.viewpager2.adapter.b) adapter).saveState();
            }
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(g.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i8, Bundle bundle) {
        return this.f11020t.handlesPerformAccessibilityAction(i8, bundle) ? this.f11020t.onPerformAccessibilityAction(i8, bundle) : super.performAccessibilityAction(i8, bundle);
    }

    public void registerOnPageChangeCallback(i iVar) {
        this.f11003c.a(iVar);
    }

    public void removeItemDecoration(RecyclerView.o oVar) {
        this.f11010j.removeItemDecoration(oVar);
    }

    public void removeItemDecorationAt(int i8) {
        this.f11010j.removeItemDecorationAt(i8);
    }

    public void requestTransform() {
        this.f11015o.a();
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f11010j.getAdapter();
        this.f11020t.onDetachAdapter(adapter);
        i(adapter);
        this.f11010j.setAdapter(hVar);
        this.f11004d = 0;
        e();
        this.f11020t.onAttachAdapter(hVar);
        d(hVar);
    }

    public void setCurrentItem(int i8) {
        setCurrentItem(i8, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
        super.setLayoutDirection(i8);
        this.f11020t.onSetLayoutDirection();
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 < 1 && i8 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f11019s = i8;
        this.f11010j.requestLayout();
    }

    public void setOrientation(int i8) {
        this.f11007g.setOrientation(i8);
        this.f11020t.onSetOrientation();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f11017q) {
                this.f11016p = this.f11010j.getItemAnimator();
                this.f11017q = true;
            }
            this.f11010j.setItemAnimator(null);
        } else if (this.f11017q) {
            this.f11010j.setItemAnimator(this.f11016p);
            this.f11016p = null;
            this.f11017q = false;
        }
        this.f11015o.a();
        if (kVar == null) {
            return;
        }
        this.f11015o.b(kVar);
        requestTransform();
    }

    public void setUserInputEnabled(boolean z8) {
        this.f11018r = z8;
        this.f11020t.onSetUserInputEnabled();
    }

    public void unregisterOnPageChangeCallback(i iVar) {
        this.f11003c.b(iVar);
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f11037a;

        /* renamed from: b, reason: collision with root package name */
        int f11038b;

        /* renamed from: c, reason: collision with root package name */
        Parcelable f11039c;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public n[] newArray(int i8) {
                return new n[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f11037a = parcel.readInt();
            this.f11038b = parcel.readInt();
            this.f11039c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f11037a);
            parcel.writeInt(this.f11038b);
            parcel.writeParcelable(this.f11039c, i8);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void addItemDecoration(RecyclerView.o oVar, int i8) {
        this.f11010j.addItemDecoration(oVar, i8);
    }

    public void setCurrentItem(int i8, boolean z8) {
        if (isFakeDragging()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        f(i8, z8);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11001a = new Rect();
        this.f11002b = new Rect();
        this.f11003c = new androidx.viewpager2.widget.b(3);
        this.f11005e = false;
        this.f11006f = new a();
        this.f11008h = -1;
        this.f11016p = null;
        this.f11017q = false;
        this.f11018r = true;
        this.f11019s = -1;
        b(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f11001a = new Rect();
        this.f11002b = new Rect();
        this.f11003c = new androidx.viewpager2.widget.b(3);
        this.f11005e = false;
        this.f11006f = new a();
        this.f11008h = -1;
        this.f11016p = null;
        this.f11017q = false;
        this.f11018r = true;
        this.f11019s = -1;
        b(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f11001a = new Rect();
        this.f11002b = new Rect();
        this.f11003c = new androidx.viewpager2.widget.b(3);
        this.f11005e = false;
        this.f11006f = new a();
        this.f11008h = -1;
        this.f11016p = null;
        this.f11017q = false;
        this.f11018r = true;
        this.f11019s = -1;
        b(context, attributeSet);
    }
}
