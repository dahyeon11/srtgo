package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.C0950d1;
import androidx.core.view.W;
import androidx.core.view.accessibility.H;
import c0.AbstractC1087a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;

    /* renamed from: h0, reason: collision with root package name */
    static final int[] f10863h0 = {R.attr.layout_gravity};

    /* renamed from: i0, reason: collision with root package name */
    private static final Comparator f10864i0 = new a();

    /* renamed from: j0, reason: collision with root package name */
    private static final Interpolator f10865j0 = new b();

    /* renamed from: k0, reason: collision with root package name */
    private static final n f10866k0 = new n();

    /* renamed from: A, reason: collision with root package name */
    private int f10867A;

    /* renamed from: B, reason: collision with root package name */
    private int f10868B;

    /* renamed from: C, reason: collision with root package name */
    private int f10869C;

    /* renamed from: D, reason: collision with root package name */
    private float f10870D;

    /* renamed from: E, reason: collision with root package name */
    private float f10871E;

    /* renamed from: F, reason: collision with root package name */
    private float f10872F;

    /* renamed from: G, reason: collision with root package name */
    private float f10873G;

    /* renamed from: H, reason: collision with root package name */
    private int f10874H;

    /* renamed from: I, reason: collision with root package name */
    private VelocityTracker f10875I;

    /* renamed from: J, reason: collision with root package name */
    private int f10876J;

    /* renamed from: K, reason: collision with root package name */
    private int f10877K;

    /* renamed from: L, reason: collision with root package name */
    private int f10878L;

    /* renamed from: M, reason: collision with root package name */
    private int f10879M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f10880N;

    /* renamed from: O, reason: collision with root package name */
    private long f10881O;

    /* renamed from: P, reason: collision with root package name */
    private EdgeEffect f10882P;

    /* renamed from: Q, reason: collision with root package name */
    private EdgeEffect f10883Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f10884R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f10885S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f10886T;

    /* renamed from: U, reason: collision with root package name */
    private int f10887U;

    /* renamed from: V, reason: collision with root package name */
    private List f10888V;

    /* renamed from: W, reason: collision with root package name */
    private j f10889W;

    /* renamed from: a, reason: collision with root package name */
    private int f10890a;

    /* renamed from: a0, reason: collision with root package name */
    private j f10891a0;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f10892b;

    /* renamed from: b0, reason: collision with root package name */
    private List f10893b0;

    /* renamed from: c, reason: collision with root package name */
    private final f f10894c;

    /* renamed from: c0, reason: collision with root package name */
    private int f10895c0;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f10896d;

    /* renamed from: d0, reason: collision with root package name */
    private int f10897d0;

    /* renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f10898e;

    /* renamed from: e0, reason: collision with root package name */
    private ArrayList f10899e0;

    /* renamed from: f, reason: collision with root package name */
    int f10900f;

    /* renamed from: f0, reason: collision with root package name */
    private final Runnable f10901f0;

    /* renamed from: g, reason: collision with root package name */
    private int f10902g;

    /* renamed from: g0, reason: collision with root package name */
    private int f10903g0;

    /* renamed from: h, reason: collision with root package name */
    private Parcelable f10904h;

    /* renamed from: i, reason: collision with root package name */
    private ClassLoader f10905i;

    /* renamed from: j, reason: collision with root package name */
    private Scroller f10906j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10907k;

    /* renamed from: l, reason: collision with root package name */
    private l f10908l;

    /* renamed from: m, reason: collision with root package name */
    private int f10909m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f10910n;

    /* renamed from: o, reason: collision with root package name */
    private int f10911o;

    /* renamed from: p, reason: collision with root package name */
    private int f10912p;

    /* renamed from: q, reason: collision with root package name */
    private float f10913q;

    /* renamed from: r, reason: collision with root package name */
    private float f10914r;

    /* renamed from: s, reason: collision with root package name */
    private int f10915s;

    /* renamed from: t, reason: collision with root package name */
    private int f10916t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10917u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10918v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10919w;

    /* renamed from: x, reason: collision with root package name */
    private int f10920x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10921y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10922z;

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            return fVar.f10927b - fVar2.f10927b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.z();
        }
    }

    class d implements W {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f10924a = new Rect();

        d() {
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
            C0950d1 c0950d1OnApplyWindowInsets = AbstractC0985p0.onApplyWindowInsets(view, c0950d1);
            if (c0950d1OnApplyWindowInsets.isConsumed()) {
                return c0950d1OnApplyWindowInsets;
            }
            Rect rect = this.f10924a;
            rect.left = c0950d1OnApplyWindowInsets.getSystemWindowInsetLeft();
            rect.top = c0950d1OnApplyWindowInsets.getSystemWindowInsetTop();
            rect.right = c0950d1OnApplyWindowInsets.getSystemWindowInsetRight();
            rect.bottom = c0950d1OnApplyWindowInsets.getSystemWindowInsetBottom();
            int childCount = ViewPager.this.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                C0950d1 c0950d1DispatchApplyWindowInsets = AbstractC0985p0.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i8), c0950d1OnApplyWindowInsets);
                rect.left = Math.min(c0950d1DispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                rect.top = Math.min(c0950d1DispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                rect.right = Math.min(c0950d1DispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                rect.bottom = Math.min(c0950d1DispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
            }
            return c0950d1OnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f10926a;

        /* renamed from: b, reason: collision with root package name */
        int f10927b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10928c;

        /* renamed from: d, reason: collision with root package name */
        float f10929d;

        /* renamed from: e, reason: collision with root package name */
        float f10930e;

        f() {
        }
    }

    class h extends C0923a {
        h() {
        }

        private boolean e() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f10898e;
            return aVar != null && aVar.getCount() > 1;
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(e());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f10898e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.f10900f);
            accessibilityEvent.setToIndex(ViewPager.this.f10900f);
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setClassName(ViewPager.class.getName());
            h8.setScrollable(e());
            if (ViewPager.this.canScrollHorizontally(1)) {
                h8.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                h8.addAction(8192);
            }
        }

        @Override // androidx.core.view.C0923a
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) throws Resources.NotFoundException {
            if (super.performAccessibilityAction(view, i8, bundle)) {
                return true;
            }
            if (i8 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f10900f + 1);
                return true;
            }
            if (i8 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f10900f - 1);
            return true;
        }
    }

    public interface i {
        void onAdapterChanged(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void onPageScrollStateChanged(int i8);

        void onPageScrolled(int i8, float f8, int i9);

        void onPageSelected(int i8);
    }

    public interface k {
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.e();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.e();
        }
    }

    public static class m extends AbstractC1087a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f10937b;

        /* renamed from: c, reason: collision with root package name */
        Parcelable f10938c;

        /* renamed from: d, reason: collision with root package name */
        ClassLoader f10939d;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public m[] newArray(int i8) {
                return new m[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f10937b + "}";
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f10937b);
            parcel.writeParcelable(this.f10938c, i8);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f10937b = parcel.readInt();
            this.f10938c = parcel.readParcelable(classLoader);
            this.f10939d = classLoader;
        }
    }

    static class n implements Comparator {
        n() {
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z8 = gVar.isDecor;
            return z8 != gVar2.isDecor ? z8 ? 1 : -1 : gVar.f10933c - gVar2.f10933c;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f10892b = new ArrayList();
        this.f10894c = new f();
        this.f10896d = new Rect();
        this.f10902g = -1;
        this.f10904h = null;
        this.f10905i = null;
        this.f10913q = -3.4028235E38f;
        this.f10914r = Float.MAX_VALUE;
        this.f10920x = 1;
        this.f10874H = -1;
        this.f10884R = true;
        this.f10885S = false;
        this.f10901f0 = new c();
        this.f10903g0 = 0;
        q();
    }

    private void B(int i8, int i9, int i10, int i11) {
        if (i9 > 0 && !this.f10892b.isEmpty()) {
            if (!this.f10906j.isFinished()) {
                this.f10906j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)) * (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)), getScrollY());
                return;
            }
        }
        f fVarP = p(this.f10900f);
        int iMin = (int) ((fVarP != null ? Math.min(fVarP.f10930e, this.f10914r) : 0.0f) * ((i8 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void C() {
        int i8 = 0;
        while (i8 < getChildCount()) {
            if (!((g) getChildAt(i8).getLayoutParams()).isDecor) {
                removeViewAt(i8);
                i8--;
            }
            i8++;
        }
    }

    private void D(boolean z8) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z8);
        }
    }

    private boolean E() {
        this.f10874H = -1;
        k();
        this.f10882P.onRelease();
        this.f10883Q.onRelease();
        return this.f10882P.isFinished() || this.f10883Q.isFinished();
    }

    private void F(int i8, boolean z8, int i9, boolean z9) throws Resources.NotFoundException {
        f fVarP = p(i8);
        int clientWidth = fVarP != null ? (int) (getClientWidth() * Math.max(this.f10913q, Math.min(fVarP.f10930e, this.f10914r))) : 0;
        if (z8) {
            I(clientWidth, 0, i9);
            if (z9) {
                h(i8);
                return;
            }
            return;
        }
        if (z9) {
            h(i8);
        }
        d(false);
        scrollTo(clientWidth, 0);
        x(clientWidth);
    }

    private void J() {
        if (this.f10897d0 != 0) {
            ArrayList arrayList = this.f10899e0;
            if (arrayList == null) {
                this.f10899e0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                this.f10899e0.add(getChildAt(i8));
            }
            Collections.sort(this.f10899e0, f10866k0);
        }
    }

    private void b(f fVar, int i8, f fVar2) {
        int i9;
        int i10;
        f fVar3;
        f fVar4;
        int count = this.f10898e.getCount();
        int clientWidth = getClientWidth();
        float f8 = clientWidth > 0 ? this.f10909m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i11 = fVar2.f10927b;
            int i12 = fVar.f10927b;
            if (i11 < i12) {
                float pageWidth = fVar2.f10930e + fVar2.f10929d + f8;
                int i13 = i11 + 1;
                int i14 = 0;
                while (i13 <= fVar.f10927b && i14 < this.f10892b.size()) {
                    Object obj = this.f10892b.get(i14);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i13 <= fVar4.f10927b || i14 >= this.f10892b.size() - 1) {
                            break;
                        }
                        i14++;
                        obj = this.f10892b.get(i14);
                    }
                    while (i13 < fVar4.f10927b) {
                        pageWidth += this.f10898e.getPageWidth(i13) + f8;
                        i13++;
                    }
                    fVar4.f10930e = pageWidth;
                    pageWidth += fVar4.f10929d + f8;
                    i13++;
                }
            } else if (i11 > i12) {
                int size = this.f10892b.size() - 1;
                float pageWidth2 = fVar2.f10930e;
                while (true) {
                    i11--;
                    if (i11 < fVar.f10927b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f10892b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i11 >= fVar3.f10927b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f10892b.get(size);
                    }
                    while (i11 > fVar3.f10927b) {
                        pageWidth2 -= this.f10898e.getPageWidth(i11) + f8;
                        i11--;
                    }
                    pageWidth2 -= fVar3.f10929d + f8;
                    fVar3.f10930e = pageWidth2;
                }
            }
        }
        int size2 = this.f10892b.size();
        float pageWidth3 = fVar.f10930e;
        int i15 = fVar.f10927b;
        int i16 = i15 - 1;
        this.f10913q = i15 == 0 ? pageWidth3 : -3.4028235E38f;
        int i17 = count - 1;
        this.f10914r = i15 == i17 ? (fVar.f10929d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i18 = i8 - 1;
        while (i18 >= 0) {
            f fVar5 = (f) this.f10892b.get(i18);
            while (true) {
                i10 = fVar5.f10927b;
                if (i16 <= i10) {
                    break;
                }
                pageWidth3 -= this.f10898e.getPageWidth(i16) + f8;
                i16--;
            }
            pageWidth3 -= fVar5.f10929d + f8;
            fVar5.f10930e = pageWidth3;
            if (i10 == 0) {
                this.f10913q = pageWidth3;
            }
            i18--;
            i16--;
        }
        float pageWidth4 = fVar.f10930e + fVar.f10929d + f8;
        int i19 = fVar.f10927b + 1;
        int i20 = i8 + 1;
        while (i20 < size2) {
            f fVar6 = (f) this.f10892b.get(i20);
            while (true) {
                i9 = fVar6.f10927b;
                if (i19 >= i9) {
                    break;
                }
                pageWidth4 += this.f10898e.getPageWidth(i19) + f8;
                i19++;
            }
            if (i9 == i17) {
                this.f10914r = (fVar6.f10929d + pageWidth4) - 1.0f;
            }
            fVar6.f10930e = pageWidth4;
            pageWidth4 += fVar6.f10929d + f8;
            i20++;
            i19++;
        }
        this.f10885S = false;
    }

    private void d(boolean z8) {
        boolean z9 = this.f10903g0 == 2;
        if (z9) {
            setScrollingCacheEnabled(false);
            if (!this.f10906j.isFinished()) {
                this.f10906j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f10906j.getCurrX();
                int currY = this.f10906j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        x(currX);
                    }
                }
            }
        }
        this.f10919w = false;
        for (int i8 = 0; i8 < this.f10892b.size(); i8++) {
            f fVar = (f) this.f10892b.get(i8);
            if (fVar.f10928c) {
                fVar.f10928c = false;
                z9 = true;
            }
        }
        if (z9) {
            if (z8) {
                AbstractC0985p0.postOnAnimation(this, this.f10901f0);
            } else {
                this.f10901f0.run();
            }
        }
    }

    private int f(int i8, float f8, int i9, int i10) {
        if (Math.abs(i10) <= this.f10878L || Math.abs(i9) <= this.f10876J) {
            i8 += (int) (f8 + (i8 >= this.f10900f ? 0.4f : 0.6f));
        } else if (i9 <= 0) {
            i8++;
        }
        if (this.f10892b.size() <= 0) {
            return i8;
        }
        return Math.max(((f) this.f10892b.get(0)).f10927b, Math.min(i8, ((f) this.f10892b.get(r4.size() - 1)).f10927b));
    }

    private void g(int i8, float f8, int i9) {
        j jVar = this.f10889W;
        if (jVar != null) {
            jVar.onPageScrolled(i8, f8, i9);
        }
        List list = this.f10888V;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar2 = (j) this.f10888V.get(i10);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i8, f8, i9);
                }
            }
        }
        j jVar3 = this.f10891a0;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i8, f8, i9);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i8) {
        j jVar = this.f10889W;
        if (jVar != null) {
            jVar.onPageSelected(i8);
        }
        List list = this.f10888V;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                j jVar2 = (j) this.f10888V.get(i9);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i8);
                }
            }
        }
        j jVar3 = this.f10891a0;
        if (jVar3 != null) {
            jVar3.onPageSelected(i8);
        }
    }

    private void i(int i8) {
        j jVar = this.f10889W;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i8);
        }
        List list = this.f10888V;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                j jVar2 = (j) this.f10888V.get(i9);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i8);
                }
            }
        }
        j jVar3 = this.f10891a0;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i8);
        }
    }

    private void k() {
        this.f10921y = false;
        this.f10922z = false;
        VelocityTracker velocityTracker = this.f10875I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10875I = null;
        }
    }

    private Rect l(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f o() {
        int i8;
        int clientWidth = getClientWidth();
        float f8 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f9 = clientWidth > 0 ? this.f10909m / clientWidth : 0.0f;
        int i9 = 0;
        boolean z8 = true;
        f fVar = null;
        int i10 = -1;
        float f10 = 0.0f;
        while (i9 < this.f10892b.size()) {
            f fVar2 = (f) this.f10892b.get(i9);
            if (!z8 && fVar2.f10927b != (i8 = i10 + 1)) {
                fVar2 = this.f10894c;
                fVar2.f10930e = f8 + f10 + f9;
                fVar2.f10927b = i8;
                fVar2.f10929d = this.f10898e.getPageWidth(i8);
                i9--;
            }
            f fVar3 = fVar2;
            f8 = fVar3.f10930e;
            float f11 = fVar3.f10929d + f8 + f9;
            if (!z8 && scrollX < f8) {
                return fVar;
            }
            if (scrollX < f11 || i9 == this.f10892b.size() - 1) {
                return fVar3;
            }
            int i11 = fVar3.f10927b;
            float f12 = fVar3.f10929d;
            i9++;
            z8 = false;
            i10 = i11;
            f10 = f12;
            fVar = fVar3;
        }
        return fVar;
    }

    private static boolean r(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean s(float f8, float f9) {
        return (f8 < ((float) this.f10868B) && f9 > 0.0f) || (f8 > ((float) (getWidth() - this.f10868B)) && f9 < 0.0f);
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.f10918v != z8) {
            this.f10918v = z8;
        }
    }

    private void u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10874H) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f10870D = motionEvent.getX(i8);
            this.f10874H = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f10875I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean x(int i8) {
        if (this.f10892b.size() == 0) {
            if (this.f10884R) {
                return false;
            }
            this.f10886T = false;
            t(0, 0.0f, 0);
            if (this.f10886T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarO = o();
        int clientWidth = getClientWidth();
        int i9 = this.f10909m;
        int i10 = clientWidth + i9;
        float f8 = clientWidth;
        int i11 = fVarO.f10927b;
        float f9 = ((i8 / f8) - fVarO.f10930e) / (fVarO.f10929d + (i9 / f8));
        this.f10886T = false;
        t(i11, f9, (int) (i10 * f9));
        if (this.f10886T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean y(float f8) {
        boolean z8;
        boolean z9;
        float f9 = this.f10870D - f8;
        this.f10870D = f8;
        float scrollX = getScrollX() + f9;
        float clientWidth = getClientWidth();
        float f10 = this.f10913q * clientWidth;
        float f11 = this.f10914r * clientWidth;
        boolean z10 = false;
        f fVar = (f) this.f10892b.get(0);
        ArrayList arrayList = this.f10892b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f10927b != 0) {
            f10 = fVar.f10930e * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (fVar2.f10927b != this.f10898e.getCount() - 1) {
            f11 = fVar2.f10930e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (scrollX < f10) {
            if (z8) {
                this.f10882P.onPull(Math.abs(f10 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = f10;
        } else if (scrollX > f11) {
            if (z9) {
                this.f10883Q.onPull(Math.abs(scrollX - f11) / clientWidth);
                z10 = true;
            }
            scrollX = f11;
        }
        int i8 = (int) scrollX;
        this.f10870D += scrollX - i8;
        scrollTo(i8, getScrollY());
        x(i8);
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[PHI: r7 r10 r15
  0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void A(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A(int):void");
    }

    void G(int i8, boolean z8, boolean z9) throws Resources.NotFoundException {
        H(i8, z8, z9, 0);
    }

    void H(int i8, boolean z8, boolean z9, int i9) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f10898e;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z9 && this.f10900f == i8 && this.f10892b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        } else if (i8 >= this.f10898e.getCount()) {
            i8 = this.f10898e.getCount() - 1;
        }
        int i10 = this.f10920x;
        int i11 = this.f10900f;
        if (i8 > i11 + i10 || i8 < i11 - i10) {
            for (int i12 = 0; i12 < this.f10892b.size(); i12++) {
                ((f) this.f10892b.get(i12)).f10928c = true;
            }
        }
        boolean z10 = this.f10900f != i8;
        if (!this.f10884R) {
            A(i8);
            F(i8, z8, i9, z10);
        } else {
            this.f10900f = i8;
            if (z10) {
                h(i8);
            }
            requestLayout();
        }
    }

    void I(int i8, int i9, int i10) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f10906j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f10907k ? this.f10906j.getCurrX() : this.f10906j.getStartX();
            this.f10906j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i11 = scrollX;
        int scrollY = getScrollY();
        int i12 = i8 - i11;
        int i13 = i9 - scrollY;
        if (i12 == 0 && i13 == 0) {
            d(false);
            z();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i14 = clientWidth / 2;
        float f8 = clientWidth;
        float f9 = i14;
        float fJ = f9 + (j(Math.min(1.0f, (Math.abs(i12) * 1.0f) / f8)) * f9);
        int iAbs = Math.abs(i10);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fJ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i12) / ((f8 * this.f10898e.getPageWidth(this.f10900f)) + this.f10909m)) + 1.0f) * 100.0f), 600);
        this.f10907k = false;
        this.f10906j.startScroll(i11, scrollY, i12, i13, iMin);
        AbstractC0985p0.postInvalidateOnAnimation(this);
    }

    f a(int i8, int i9) {
        f fVar = new f();
        fVar.f10927b = i8;
        fVar.f10926a = this.f10898e.instantiateItem((ViewGroup) this, i8);
        fVar.f10929d = this.f10898e.getPageWidth(i8);
        if (i9 < 0 || i9 >= this.f10892b.size()) {
            this.f10892b.add(fVar);
        } else {
            this.f10892b.add(i9, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        f fVarN;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f10927b == this.f10900f) {
                    childAt.addFocusables(arrayList, i8, i9);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i9 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public void addOnAdapterChangeListener(i iVar) {
        if (this.f10893b0 == null) {
            this.f10893b0 = new ArrayList();
        }
        this.f10893b0.add(iVar);
    }

    public void addOnPageChangeListener(j jVar) {
        if (this.f10888V == null) {
            this.f10888V = new ArrayList();
        }
        this.f10888V.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarN;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f10927b == this.f10900f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zR = gVar.isDecor | r(view);
        gVar.isDecor = zR;
        if (!this.f10917u) {
            super.addView(view, i8, layoutParams);
        } else {
            if (zR) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f10932b = true;
            addViewInLayout(view, i8, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.f10896d
            android.graphics.Rect r2 = r4.l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f10896d
            android.graphics.Rect r3 = r4.l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.v()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.f10896d
            android.graphics.Rect r2 = r4.l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f10896d
            android.graphics.Rect r3 = r4.l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.w()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.w()
            goto Lca
        Lc6:
            boolean r0 = r4.v()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.f10921y) {
            return false;
        }
        this.f10880N = true;
        setScrollState(1);
        this.f10870D = 0.0f;
        this.f10872F = 0.0f;
        VelocityTracker velocityTracker = this.f10875I;
        if (velocityTracker == null) {
            this.f10875I = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f10875I.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f10881O = jUptimeMillis;
        return true;
    }

    protected boolean c(View view, boolean z8, int i8, int i9, int i10) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = i9 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = i10 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && c(childAt, true, i8, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z8 && view.canScrollHorizontally(-i8);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        if (this.f10898e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i8 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f10913q)) : i8 > 0 && scrollX < ((int) (((float) clientWidth) * this.f10914r));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List list = this.f10888V;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f10907k = true;
        if (this.f10906j.isFinished() || !this.f10906j.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10906j.getCurrX();
        int currY = this.f10906j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!x(currX)) {
                this.f10906j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AbstractC0985p0.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarN;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f10927b == this.f10900f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f10898e) != null && aVar.getCount() > 1)) {
            if (!this.f10882P.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f10913q * width);
                this.f10882P.setSize(height, width);
                zDraw = this.f10882P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f10883Q.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f10914r + 1.0f)) * width2);
                this.f10883Q.setSize(height2, width2);
                zDraw |= this.f10883Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f10882P.finish();
            this.f10883Q.finish();
        }
        if (zDraw) {
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10910n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    void e() throws Resources.NotFoundException {
        int count = this.f10898e.getCount();
        this.f10890a = count;
        boolean z8 = this.f10892b.size() < (this.f10920x * 2) + 1 && this.f10892b.size() < count;
        int iMax = this.f10900f;
        int i8 = 0;
        boolean z9 = false;
        while (i8 < this.f10892b.size()) {
            f fVar = (f) this.f10892b.get(i8);
            int itemPosition = this.f10898e.getItemPosition(fVar.f10926a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f10892b.remove(i8);
                    i8--;
                    if (!z9) {
                        this.f10898e.startUpdate((ViewGroup) this);
                        z9 = true;
                    }
                    this.f10898e.destroyItem((ViewGroup) this, fVar.f10927b, fVar.f10926a);
                    int i9 = this.f10900f;
                    if (i9 == fVar.f10927b) {
                        iMax = Math.max(0, Math.min(i9, count - 1));
                    }
                } else {
                    int i10 = fVar.f10927b;
                    if (i10 != itemPosition) {
                        if (i10 == this.f10900f) {
                            iMax = itemPosition;
                        }
                        fVar.f10927b = itemPosition;
                    }
                }
                z8 = true;
            }
            i8++;
        }
        if (z9) {
            this.f10898e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f10892b, f10864i0);
        if (z8) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                g gVar = (g) getChildAt(i11).getLayoutParams();
                if (!gVar.isDecor) {
                    gVar.f10931a = 0.0f;
                }
            }
            G(iMax, false, true);
            requestLayout();
        }
    }

    public void endFakeDrag() throws Resources.NotFoundException {
        if (!this.f10880N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f10898e != null) {
            VelocityTracker velocityTracker = this.f10875I;
            velocityTracker.computeCurrentVelocity(1000, this.f10877K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f10874H);
            this.f10919w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarO = o();
            H(f(fVarO.f10927b, ((scrollX / clientWidth) - fVarO.f10930e) / fVarO.f10929d, xVelocity, (int) (this.f10870D - this.f10872F)), true, true, xVelocity);
        }
        k();
        this.f10880N = false;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? v() : arrowScroll(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? w() : arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f8) {
        if (!this.f10880N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f10898e == null) {
            return;
        }
        this.f10870D += f8;
        float scrollX = getScrollX() - f8;
        float clientWidth = getClientWidth();
        float f9 = this.f10913q * clientWidth;
        float f10 = this.f10914r * clientWidth;
        f fVar = (f) this.f10892b.get(0);
        f fVar2 = (f) this.f10892b.get(r4.size() - 1);
        if (fVar.f10927b != 0) {
            f9 = fVar.f10930e * clientWidth;
        }
        if (fVar2.f10927b != this.f10898e.getCount() - 1) {
            f10 = fVar2.f10930e * clientWidth;
        }
        if (scrollX < f9) {
            scrollX = f9;
        } else if (scrollX > f10) {
            scrollX = f10;
        }
        int i8 = (int) scrollX;
        this.f10870D += scrollX - i8;
        scrollTo(i8, getScrollY());
        x(i8);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f10881O, SystemClock.uptimeMillis(), 2, this.f10870D, 0.0f, 0);
        this.f10875I.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f10898e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        if (this.f10897d0 == 2) {
            i9 = (i8 - 1) - i9;
        }
        return ((g) ((View) this.f10899e0.get(i9)).getLayoutParams()).f10934d;
    }

    public int getCurrentItem() {
        return this.f10900f;
    }

    public int getOffscreenPageLimit() {
        return this.f10920x;
    }

    public int getPageMargin() {
        return this.f10909m;
    }

    public boolean isFakeDragging() {
        return this.f10880N;
    }

    float j(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    f m(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return n(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f n(View view) {
        for (int i8 = 0; i8 < this.f10892b.size(); i8++) {
            f fVar = (f) this.f10892b.get(i8);
            if (this.f10898e.isViewFromObject(view, fVar.f10926a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10884R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f10901f0);
        Scroller scroller = this.f10906j;
        if (scroller != null && !scroller.isFinished()) {
            this.f10906j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i8;
        float f8;
        float f9;
        super.onDraw(canvas);
        if (this.f10909m <= 0 || this.f10910n == null || this.f10892b.size() <= 0 || this.f10898e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f10 = this.f10909m / width;
        int i9 = 0;
        f fVar = (f) this.f10892b.get(0);
        float f11 = fVar.f10930e;
        int size = this.f10892b.size();
        int i10 = fVar.f10927b;
        int i11 = ((f) this.f10892b.get(size - 1)).f10927b;
        while (i10 < i11) {
            while (true) {
                i8 = fVar.f10927b;
                if (i10 <= i8 || i9 >= size) {
                    break;
                }
                i9++;
                fVar = (f) this.f10892b.get(i9);
            }
            if (i10 == i8) {
                float f12 = fVar.f10930e;
                float f13 = fVar.f10929d;
                f8 = (f12 + f13) * width;
                f11 = f12 + f13 + f10;
            } else {
                float pageWidth = this.f10898e.getPageWidth(i10);
                f8 = (f11 + pageWidth) * width;
                f11 += pageWidth + f10;
            }
            if (this.f10909m + f8 > scrollX) {
                f9 = f10;
                this.f10910n.setBounds(Math.round(f8), this.f10911o, Math.round(this.f10909m + f8), this.f10912p);
                this.f10910n.draw(canvas);
            } else {
                f9 = f10;
            }
            if (f8 > scrollX + r2) {
                return;
            }
            i10++;
            f10 = f9;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            E();
            return false;
        }
        if (action != 0) {
            if (this.f10921y) {
                return true;
            }
            if (this.f10922z) {
                return false;
            }
        }
        if (action == 0) {
            float x8 = motionEvent.getX();
            this.f10872F = x8;
            this.f10870D = x8;
            float y8 = motionEvent.getY();
            this.f10873G = y8;
            this.f10871E = y8;
            this.f10874H = motionEvent.getPointerId(0);
            this.f10922z = false;
            this.f10907k = true;
            this.f10906j.computeScrollOffset();
            if (this.f10903g0 != 2 || Math.abs(this.f10906j.getFinalX() - this.f10906j.getCurrX()) <= this.f10879M) {
                d(false);
                this.f10921y = false;
            } else {
                this.f10906j.abortAnimation();
                this.f10919w = false;
                z();
                this.f10921y = true;
                D(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i8 = this.f10874H;
            if (i8 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i8);
                float x9 = motionEvent.getX(iFindPointerIndex);
                float f8 = x9 - this.f10870D;
                float fAbs = Math.abs(f8);
                float y9 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y9 - this.f10873G);
                if (f8 != 0.0f && !s(this.f10870D, f8) && c(this, false, (int) f8, (int) x9, (int) y9)) {
                    this.f10870D = x9;
                    this.f10871E = y9;
                    this.f10922z = true;
                    return false;
                }
                int i9 = this.f10869C;
                if (fAbs > i9 && fAbs * 0.5f > fAbs2) {
                    this.f10921y = true;
                    D(true);
                    setScrollState(1);
                    float f9 = this.f10872F;
                    float f10 = this.f10869C;
                    this.f10870D = f8 > 0.0f ? f9 + f10 : f9 - f10;
                    this.f10871E = y9;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i9) {
                    this.f10922z = true;
                }
                if (this.f10921y && y(x9)) {
                    AbstractC0985p0.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            u(motionEvent);
        }
        if (this.f10875I == null) {
            this.f10875I = VelocityTracker.obtain();
        }
        this.f10875I.addMovement(motionEvent);
        return this.f10921y;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) throws Resources.NotFoundException {
        g gVar;
        g gVar2;
        int i10;
        setMeasuredDimension(View.getDefaultSize(0, i8), View.getDefaultSize(0, i9));
        int measuredWidth = getMeasuredWidth();
        this.f10868B = Math.min(measuredWidth / 10, this.f10867A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            boolean z8 = true;
            int i12 = 1073741824;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.isDecor) {
                int i13 = gVar2.gravity;
                int i14 = i13 & 7;
                int i15 = i13 & 112;
                boolean z9 = i15 == 48 || i15 == 80;
                if (i14 != 3 && i14 != 5) {
                    z8 = false;
                }
                int i16 = Integer.MIN_VALUE;
                if (z9) {
                    i10 = Integer.MIN_VALUE;
                    i16 = 1073741824;
                } else {
                    i10 = z8 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i17 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i17 != -2) {
                    if (i17 == -1) {
                        i17 = paddingLeft;
                    }
                    i16 = 1073741824;
                } else {
                    i17 = paddingLeft;
                }
                int i18 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i18 == -2) {
                    i18 = measuredHeight;
                    i12 = i10;
                } else if (i18 == -1) {
                    i18 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, i16), View.MeasureSpec.makeMeasureSpec(i18, i12));
                if (z9) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z8) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i11++;
        }
        this.f10915s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f10916t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f10917u = true;
        z();
        this.f10917u = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f10931a), 1073741824), this.f10916t);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int i9;
        int i10;
        int i11;
        f fVarN;
        int childCount = getChildCount();
        if ((i8 & 2) != 0) {
            i10 = childCount;
            i9 = 0;
            i11 = 1;
        } else {
            i9 = childCount - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i9 != i10) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f10927b == this.f10900f && childAt.requestFocus(i8, rect)) {
                return true;
            }
            i9 += i11;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        androidx.viewpager.widget.a aVar = this.f10898e;
        if (aVar != null) {
            aVar.restoreState(mVar.f10938c, mVar.f10939d);
            G(mVar.f10937b, false, true);
        } else {
            this.f10902g = mVar.f10937b;
            this.f10904h = mVar.f10938c;
            this.f10905i = mVar.f10939d;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f10937b = this.f10900f;
        androidx.viewpager.widget.a aVar = this.f10898e;
        if (aVar != null) {
            mVar.f10938c = aVar.saveState();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 != i10) {
            int i12 = this.f10909m;
            B(i8, i10, i12, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    f p(int i8) {
        for (int i9 = 0; i9 < this.f10892b.size(); i9++) {
            f fVar = (f) this.f10892b.get(i9);
            if (fVar.f10927b == i8) {
                return fVar;
            }
        }
        return null;
    }

    void q() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f10906j = new Scroller(context, f10865j0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f10869C = viewConfiguration.getScaledPagingTouchSlop();
        this.f10876J = (int) (400.0f * f8);
        this.f10877K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10882P = new EdgeEffect(context);
        this.f10883Q = new EdgeEffect(context);
        this.f10878L = (int) (25.0f * f8);
        this.f10879M = (int) (2.0f * f8);
        this.f10867A = (int) (f8 * 16.0f);
        AbstractC0985p0.setAccessibilityDelegate(this, new h());
        if (AbstractC0985p0.getImportantForAccessibility(this) == 0) {
            AbstractC0985p0.setImportantForAccessibility(this, 1);
        }
        AbstractC0985p0.setOnApplyWindowInsetsListener(this, new d());
    }

    public void removeOnAdapterChangeListener(i iVar) {
        List list = this.f10893b0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void removeOnPageChangeListener(j jVar) {
        List list = this.f10888V;
        if (list != null) {
            list.remove(jVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f10917u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar2 = this.f10898e;
        if (aVar2 != null) {
            aVar2.a(null);
            this.f10898e.startUpdate((ViewGroup) this);
            for (int i8 = 0; i8 < this.f10892b.size(); i8++) {
                f fVar = (f) this.f10892b.get(i8);
                this.f10898e.destroyItem((ViewGroup) this, fVar.f10927b, fVar.f10926a);
            }
            this.f10898e.finishUpdate((ViewGroup) this);
            this.f10892b.clear();
            C();
            this.f10900f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f10898e;
        this.f10898e = aVar;
        this.f10890a = 0;
        if (aVar != null) {
            if (this.f10908l == null) {
                this.f10908l = new l();
            }
            this.f10898e.a(this.f10908l);
            this.f10919w = false;
            boolean z8 = this.f10884R;
            this.f10884R = true;
            this.f10890a = this.f10898e.getCount();
            if (this.f10902g >= 0) {
                this.f10898e.restoreState(this.f10904h, this.f10905i);
                G(this.f10902g, false, true);
                this.f10902g = -1;
                this.f10904h = null;
                this.f10905i = null;
            } else if (z8) {
                requestLayout();
            } else {
                z();
            }
        }
        List list = this.f10893b0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f10893b0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((i) this.f10893b0.get(i9)).onAdapterChanged(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i8) throws Resources.NotFoundException {
        this.f10919w = false;
        G(i8, !this.f10884R, false);
    }

    public void setOffscreenPageLimit(int i8) throws Resources.NotFoundException {
        if (i8 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i8 + " too small; defaulting to 1");
            i8 = 1;
        }
        if (i8 != this.f10920x) {
            this.f10920x = i8;
            z();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f10889W = jVar;
    }

    public void setPageMargin(int i8) {
        int i9 = this.f10909m;
        this.f10909m = i8;
        int width = getWidth();
        B(width, width, i8, i9);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f10910n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z8, k kVar) throws Resources.NotFoundException {
        setPageTransformer(z8, kVar, 2);
    }

    void setScrollState(int i8) {
        if (this.f10903g0 == i8) {
            return;
        }
        this.f10903g0 = i8;
        i(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void t(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f10887U
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.isDecor
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.gravity
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.g(r12, r13, r14)
            r11.f10886T = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.t(int, float, int):void");
    }

    boolean v() throws Resources.NotFoundException {
        int i8 = this.f10900f;
        if (i8 <= 0) {
            return false;
        }
        setCurrentItem(i8 - 1, true);
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10910n;
    }

    boolean w() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f10898e;
        if (aVar == null || this.f10900f >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.f10900f + 1, true);
        return true;
    }

    void z() throws Resources.NotFoundException {
        A(this.f10900f);
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        float f10931a;

        /* renamed from: b, reason: collision with root package name */
        boolean f10932b;

        /* renamed from: c, reason: collision with root package name */
        int f10933c;

        /* renamed from: d, reason: collision with root package name */
        int f10934d;
        public int gravity;
        public boolean isDecor;

        public g() {
            super(-1, -1);
            this.f10931a = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10931a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f10863h0);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z8, k kVar, int i8) throws Resources.NotFoundException {
        boolean z9 = kVar != null;
        setChildrenDrawingOrderEnabled(z9);
        if (z9) {
            this.f10897d0 = z8 ? 2 : 1;
            this.f10895c0 = i8;
        } else {
            this.f10897d0 = 0;
        }
        if (z9) {
            z();
        }
    }

    public void setCurrentItem(int i8, boolean z8) throws Resources.NotFoundException {
        this.f10919w = false;
        G(i8, z8, false);
    }

    public void setPageMarginDrawable(int i8) {
        setPageMarginDrawable(androidx.core.content.a.getDrawable(getContext(), i8));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10892b = new ArrayList();
        this.f10894c = new f();
        this.f10896d = new Rect();
        this.f10902g = -1;
        this.f10904h = null;
        this.f10905i = null;
        this.f10913q = -3.4028235E38f;
        this.f10914r = Float.MAX_VALUE;
        this.f10920x = 1;
        this.f10874H = -1;
        this.f10884R = true;
        this.f10885S = false;
        this.f10901f0 = new c();
        this.f10903g0 = 0;
        q();
    }
}
