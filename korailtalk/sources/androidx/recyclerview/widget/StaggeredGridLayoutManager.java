package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* renamed from: B, reason: collision with root package name */
    private BitSet f10434B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f10439G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f10440H;

    /* renamed from: I, reason: collision with root package name */
    private e f10441I;

    /* renamed from: J, reason: collision with root package name */
    private int f10442J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f10447O;

    /* renamed from: t, reason: collision with root package name */
    f[] f10450t;

    /* renamed from: u, reason: collision with root package name */
    j f10451u;

    /* renamed from: v, reason: collision with root package name */
    j f10452v;

    /* renamed from: w, reason: collision with root package name */
    private int f10453w;

    /* renamed from: x, reason: collision with root package name */
    private int f10454x;

    /* renamed from: y, reason: collision with root package name */
    private final g f10455y;

    /* renamed from: s, reason: collision with root package name */
    private int f10449s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f10456z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f10433A = false;

    /* renamed from: C, reason: collision with root package name */
    int f10435C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f10436D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    d f10437E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f10438F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f10443K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f10444L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f10445M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f10446N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f10448P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.D();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f10458a;

        /* renamed from: b, reason: collision with root package name */
        int f10459b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10460c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10461d;

        /* renamed from: e, reason: collision with root package name */
        boolean f10462e;

        /* renamed from: f, reason: collision with root package name */
        int[] f10463f;

        b() {
            c();
        }

        void a() {
            this.f10459b = this.f10460c ? StaggeredGridLayoutManager.this.f10451u.getEndAfterPadding() : StaggeredGridLayoutManager.this.f10451u.getStartAfterPadding();
        }

        void b(int i8) {
            if (this.f10460c) {
                this.f10459b = StaggeredGridLayoutManager.this.f10451u.getEndAfterPadding() - i8;
            } else {
                this.f10459b = StaggeredGridLayoutManager.this.f10451u.getStartAfterPadding() + i8;
            }
        }

        void c() {
            this.f10458a = -1;
            this.f10459b = Integer.MIN_VALUE;
            this.f10460c = false;
            this.f10461d = false;
            this.f10462e = false;
            int[] iArr = this.f10463f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f10463f;
            if (iArr == null || iArr.length < length) {
                this.f10463f = new int[StaggeredGridLayoutManager.this.f10450t.length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                this.f10463f[i8] = fVarArr[i8].m(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {
        public static final int INVALID_SPAN_ID = -1;

        /* renamed from: e, reason: collision with root package name */
        f f10465e;

        /* renamed from: f, reason: collision with root package name */
        boolean f10466f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            f fVar = this.f10465e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f10487e;
        }

        public boolean isFullSpan() {
            return this.f10466f;
        }

        public void setFullSpan(boolean z8) {
            this.f10466f = z8;
        }

        public c(int i8, int i9) {
            super(i8, i9);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.q qVar) {
            super(qVar);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f10473a;

        /* renamed from: b, reason: collision with root package name */
        int f10474b;

        /* renamed from: c, reason: collision with root package name */
        int f10475c;

        /* renamed from: d, reason: collision with root package name */
        int[] f10476d;

        /* renamed from: e, reason: collision with root package name */
        int f10477e;

        /* renamed from: f, reason: collision with root package name */
        int[] f10478f;

        /* renamed from: g, reason: collision with root package name */
        List f10479g;

        /* renamed from: h, reason: collision with root package name */
        boolean f10480h;

        /* renamed from: i, reason: collision with root package name */
        boolean f10481i;

        /* renamed from: j, reason: collision with root package name */
        boolean f10482j;

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

        public e() {
        }

        void b() {
            this.f10476d = null;
            this.f10475c = 0;
            this.f10473a = -1;
            this.f10474b = -1;
        }

        void c() {
            this.f10476d = null;
            this.f10475c = 0;
            this.f10477e = 0;
            this.f10478f = null;
            this.f10479g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f10473a);
            parcel.writeInt(this.f10474b);
            parcel.writeInt(this.f10475c);
            if (this.f10475c > 0) {
                parcel.writeIntArray(this.f10476d);
            }
            parcel.writeInt(this.f10477e);
            if (this.f10477e > 0) {
                parcel.writeIntArray(this.f10478f);
            }
            parcel.writeInt(this.f10480h ? 1 : 0);
            parcel.writeInt(this.f10481i ? 1 : 0);
            parcel.writeInt(this.f10482j ? 1 : 0);
            parcel.writeList(this.f10479g);
        }

        e(Parcel parcel) {
            this.f10473a = parcel.readInt();
            this.f10474b = parcel.readInt();
            int i8 = parcel.readInt();
            this.f10475c = i8;
            if (i8 > 0) {
                int[] iArr = new int[i8];
                this.f10476d = iArr;
                parcel.readIntArray(iArr);
            }
            int i9 = parcel.readInt();
            this.f10477e = i9;
            if (i9 > 0) {
                int[] iArr2 = new int[i9];
                this.f10478f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f10480h = parcel.readInt() == 1;
            this.f10481i = parcel.readInt() == 1;
            this.f10482j = parcel.readInt() == 1;
            this.f10479g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f10475c = eVar.f10475c;
            this.f10473a = eVar.f10473a;
            this.f10474b = eVar.f10474b;
            this.f10476d = eVar.f10476d;
            this.f10477e = eVar.f10477e;
            this.f10478f = eVar.f10478f;
            this.f10480h = eVar.f10480h;
            this.f10481i = eVar.f10481i;
            this.f10482j = eVar.f10482j;
            this.f10479g = eVar.f10479g;
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f10483a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f10484b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f10485c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f10486d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f10487e;

        f(int i8) {
            this.f10487e = i8;
        }

        void a(View view) {
            c cVarK = k(view);
            cVarK.f10465e = this;
            this.f10483a.add(view);
            this.f10485c = Integer.MIN_VALUE;
            if (this.f10483a.size() == 1) {
                this.f10484b = Integer.MIN_VALUE;
            }
            if (cVarK.isItemRemoved() || cVarK.isItemChanged()) {
                this.f10486d += StaggeredGridLayoutManager.this.f10451u.getDecoratedMeasurement(view);
            }
        }

        void b(boolean z8, int i8) {
            int iJ = z8 ? j(Integer.MIN_VALUE) : m(Integer.MIN_VALUE);
            e();
            if (iJ == Integer.MIN_VALUE) {
                return;
            }
            if (!z8 || iJ >= StaggeredGridLayoutManager.this.f10451u.getEndAfterPadding()) {
                if (z8 || iJ <= StaggeredGridLayoutManager.this.f10451u.getStartAfterPadding()) {
                    if (i8 != Integer.MIN_VALUE) {
                        iJ += i8;
                    }
                    this.f10485c = iJ;
                    this.f10484b = iJ;
                }
            }
        }

        void c() {
            d.a fullSpanItem;
            ArrayList arrayList = this.f10483a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarK = k(view);
            this.f10485c = StaggeredGridLayoutManager.this.f10451u.getDecoratedEnd(view);
            if (cVarK.f10466f && (fullSpanItem = StaggeredGridLayoutManager.this.f10437E.getFullSpanItem(cVarK.getViewLayoutPosition())) != null && fullSpanItem.f10470b == 1) {
                this.f10485c += fullSpanItem.b(this.f10487e);
            }
        }

        void d() {
            d.a fullSpanItem;
            View view = (View) this.f10483a.get(0);
            c cVarK = k(view);
            this.f10484b = StaggeredGridLayoutManager.this.f10451u.getDecoratedStart(view);
            if (cVarK.f10466f && (fullSpanItem = StaggeredGridLayoutManager.this.f10437E.getFullSpanItem(cVarK.getViewLayoutPosition())) != null && fullSpanItem.f10470b == -1) {
                this.f10484b -= fullSpanItem.b(this.f10487e);
            }
        }

        void e() {
            this.f10483a.clear();
            n();
            this.f10486d = 0;
        }

        int f(int i8, int i9, boolean z8, boolean z9, boolean z10) {
            int startAfterPadding = StaggeredGridLayoutManager.this.f10451u.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.f10451u.getEndAfterPadding();
            int i10 = i9 > i8 ? 1 : -1;
            while (i8 != i9) {
                View view = (View) this.f10483a.get(i8);
                int decoratedStart = StaggeredGridLayoutManager.this.f10451u.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.f10451u.getDecoratedEnd(view);
                boolean z11 = false;
                boolean z12 = !z10 ? decoratedStart >= endAfterPadding : decoratedStart > endAfterPadding;
                if (!z10 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z11 = true;
                }
                if (z12 && z11) {
                    if (z8 && z9) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z9) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i8 += i10;
            }
            return -1;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.f10456z ? h(this.f10483a.size() - 1, -1, true) : h(0, this.f10483a.size(), true);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.f10456z ? g(this.f10483a.size() - 1, -1, true) : g(0, this.f10483a.size(), true);
        }

        public int findFirstVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.f10456z ? h(this.f10483a.size() - 1, -1, false) : h(0, this.f10483a.size(), false);
        }

        public int findLastCompletelyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.f10456z ? h(0, this.f10483a.size(), true) : h(this.f10483a.size() - 1, -1, true);
        }

        public int findLastPartiallyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.f10456z ? g(0, this.f10483a.size(), true) : g(this.f10483a.size() - 1, -1, true);
        }

        public int findLastVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.f10456z ? h(0, this.f10483a.size(), false) : h(this.f10483a.size() - 1, -1, false);
        }

        int g(int i8, int i9, boolean z8) {
            return f(i8, i9, false, false, z8);
        }

        public int getDeletedSize() {
            return this.f10486d;
        }

        public View getFocusableViewAfter(int i8, int i9) {
            View view = null;
            if (i9 != -1) {
                int size = this.f10483a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f10483a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f10456z && staggeredGridLayoutManager.getPosition(view2) >= i8) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f10456z && staggeredGridLayoutManager2.getPosition(view2) <= i8) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f10483a.size();
                int i10 = 0;
                while (i10 < size2) {
                    View view3 = (View) this.f10483a.get(i10);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f10456z && staggeredGridLayoutManager3.getPosition(view3) <= i8) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f10456z && staggeredGridLayoutManager4.getPosition(view3) >= i8) || !view3.hasFocusable()) {
                        break;
                    }
                    i10++;
                    view = view3;
                }
            }
            return view;
        }

        int h(int i8, int i9, boolean z8) {
            return f(i8, i9, z8, true, false);
        }

        int i() {
            int i8 = this.f10485c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            c();
            return this.f10485c;
        }

        int j(int i8) {
            int i9 = this.f10485c;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f10483a.size() == 0) {
                return i8;
            }
            c();
            return this.f10485c;
        }

        c k(View view) {
            return (c) view.getLayoutParams();
        }

        int l() {
            int i8 = this.f10484b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            d();
            return this.f10484b;
        }

        int m(int i8) {
            int i9 = this.f10484b;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f10483a.size() == 0) {
                return i8;
            }
            d();
            return this.f10484b;
        }

        void n() {
            this.f10484b = Integer.MIN_VALUE;
            this.f10485c = Integer.MIN_VALUE;
        }

        void o(int i8) {
            int i9 = this.f10484b;
            if (i9 != Integer.MIN_VALUE) {
                this.f10484b = i9 + i8;
            }
            int i10 = this.f10485c;
            if (i10 != Integer.MIN_VALUE) {
                this.f10485c = i10 + i8;
            }
        }

        void p() {
            int size = this.f10483a.size();
            View view = (View) this.f10483a.remove(size - 1);
            c cVarK = k(view);
            cVarK.f10465e = null;
            if (cVarK.isItemRemoved() || cVarK.isItemChanged()) {
                this.f10486d -= StaggeredGridLayoutManager.this.f10451u.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.f10484b = Integer.MIN_VALUE;
            }
            this.f10485c = Integer.MIN_VALUE;
        }

        void q() {
            View view = (View) this.f10483a.remove(0);
            c cVarK = k(view);
            cVarK.f10465e = null;
            if (this.f10483a.size() == 0) {
                this.f10485c = Integer.MIN_VALUE;
            }
            if (cVarK.isItemRemoved() || cVarK.isItemChanged()) {
                this.f10486d -= StaggeredGridLayoutManager.this.f10451u.getDecoratedMeasurement(view);
            }
            this.f10484b = Integer.MIN_VALUE;
        }

        void r(View view) {
            c cVarK = k(view);
            cVarK.f10465e = this;
            this.f10483a.add(0, view);
            this.f10484b = Integer.MIN_VALUE;
            if (this.f10483a.size() == 1) {
                this.f10485c = Integer.MIN_VALUE;
            }
            if (cVarK.isItemRemoved() || cVarK.isItemChanged()) {
                this.f10486d += StaggeredGridLayoutManager.this.f10451u.getDecoratedMeasurement(view);
            }
        }

        void s(int i8) {
            this.f10484b = i8;
            this.f10485c = i8;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i8, i9);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.f10455y = new g();
        L();
    }

    private void B(View view, c cVar, g gVar) {
        if (gVar.f10596e == 1) {
            if (cVar.f10466f) {
                x(view);
                return;
            } else {
                cVar.f10465e.a(view);
                return;
            }
        }
        if (cVar.f10466f) {
            j0(view);
        } else {
            cVar.f10465e.r(view);
        }
    }

    private int C(int i8) {
        if (getChildCount() == 0) {
            return this.f10433A ? 1 : -1;
        }
        return (i8 < U()) != this.f10433A ? -1 : 1;
    }

    private boolean E(f fVar) {
        if (this.f10433A) {
            if (fVar.i() < this.f10451u.getEndAfterPadding()) {
                ArrayList arrayList = fVar.f10483a;
                return !fVar.k((View) arrayList.get(arrayList.size() - 1)).f10466f;
            }
        } else if (fVar.l() > this.f10451u.getStartAfterPadding()) {
            return !fVar.k((View) fVar.f10483a.get(0)).f10466f;
        }
        return false;
    }

    private int F(RecyclerView.B b9) {
        if (getChildCount() == 0) {
            return 0;
        }
        return m.a(b9, this.f10451u, P(!this.f10446N), O(!this.f10446N), this, this.f10446N);
    }

    private int G(RecyclerView.B b9) {
        if (getChildCount() == 0) {
            return 0;
        }
        return m.b(b9, this.f10451u, P(!this.f10446N), O(!this.f10446N), this, this.f10446N, this.f10433A);
    }

    private int H(RecyclerView.B b9) {
        if (getChildCount() == 0) {
            return 0;
        }
        return m.c(b9, this.f10451u, P(!this.f10446N), O(!this.f10446N), this, this.f10446N);
    }

    private int I(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 17 ? i8 != 33 ? i8 != 66 ? (i8 == 130 && this.f10453w == 1) ? 1 : Integer.MIN_VALUE : this.f10453w == 0 ? 1 : Integer.MIN_VALUE : this.f10453w == 1 ? -1 : Integer.MIN_VALUE : this.f10453w == 0 ? -1 : Integer.MIN_VALUE : (this.f10453w != 1 && d0()) ? -1 : 1 : (this.f10453w != 1 && d0()) ? 1 : -1;
    }

    private d.a J(int i8) {
        d.a aVar = new d.a();
        aVar.f10471c = new int[this.f10449s];
        for (int i9 = 0; i9 < this.f10449s; i9++) {
            aVar.f10471c[i9] = i8 - this.f10450t[i9].j(i8);
        }
        return aVar;
    }

    private d.a K(int i8) {
        d.a aVar = new d.a();
        aVar.f10471c = new int[this.f10449s];
        for (int i9 = 0; i9 < this.f10449s; i9++) {
            aVar.f10471c[i9] = this.f10450t[i9].m(i8) - i8;
        }
        return aVar;
    }

    private void L() {
        this.f10451u = j.createOrientationHelper(this, this.f10453w);
        this.f10452v = j.createOrientationHelper(this, 1 - this.f10453w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int M(RecyclerView.w wVar, g gVar, RecyclerView.B b9) {
        f fVarA0;
        int decoratedMeasurement;
        int i8;
        int decoratedMeasurement2;
        int decoratedMeasurement3;
        boolean z8;
        ?? r9 = 0;
        this.f10434B.set(0, this.f10449s, true);
        int i9 = this.f10455y.f10600i ? gVar.f10596e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : gVar.f10596e == 1 ? gVar.f10598g + gVar.f10593b : gVar.f10597f - gVar.f10593b;
        r0(gVar.f10596e, i9);
        int endAfterPadding = this.f10433A ? this.f10451u.getEndAfterPadding() : this.f10451u.getStartAfterPadding();
        boolean z9 = false;
        while (gVar.a(b9) && (this.f10455y.f10600i || !this.f10434B.isEmpty())) {
            View viewB = gVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int viewLayoutPosition = cVar.getViewLayoutPosition();
            int iD = this.f10437E.d(viewLayoutPosition);
            boolean z10 = iD == -1 ? true : r9;
            if (z10) {
                fVarA0 = cVar.f10466f ? this.f10450t[r9] : a0(gVar);
                this.f10437E.k(viewLayoutPosition, fVarA0);
            } else {
                fVarA0 = this.f10450t[iD];
            }
            f fVar = fVarA0;
            cVar.f10465e = fVar;
            if (gVar.f10596e == 1) {
                addView(viewB);
            } else {
                addView(viewB, r9);
            }
            f0(viewB, cVar, r9);
            if (gVar.f10596e == 1) {
                int iW = cVar.f10466f ? W(endAfterPadding) : fVar.j(endAfterPadding);
                int decoratedMeasurement4 = this.f10451u.getDecoratedMeasurement(viewB) + iW;
                if (z10 && cVar.f10466f) {
                    d.a aVarJ = J(iW);
                    aVarJ.f10470b = -1;
                    aVarJ.f10469a = viewLayoutPosition;
                    this.f10437E.addFullSpanItem(aVarJ);
                }
                i8 = decoratedMeasurement4;
                decoratedMeasurement = iW;
            } else {
                int iZ = cVar.f10466f ? Z(endAfterPadding) : fVar.m(endAfterPadding);
                decoratedMeasurement = iZ - this.f10451u.getDecoratedMeasurement(viewB);
                if (z10 && cVar.f10466f) {
                    d.a aVarK = K(iZ);
                    aVarK.f10470b = 1;
                    aVarK.f10469a = viewLayoutPosition;
                    this.f10437E.addFullSpanItem(aVarK);
                }
                i8 = iZ;
            }
            if (cVar.f10466f && gVar.f10595d == -1) {
                if (z10) {
                    this.f10445M = true;
                } else {
                    if (!(gVar.f10596e == 1 ? z() : A())) {
                        d.a fullSpanItem = this.f10437E.getFullSpanItem(viewLayoutPosition);
                        if (fullSpanItem != null) {
                            fullSpanItem.f10472d = true;
                        }
                        this.f10445M = true;
                    }
                }
            }
            B(viewB, cVar, gVar);
            if (d0() && this.f10453w == 1) {
                int endAfterPadding2 = cVar.f10466f ? this.f10452v.getEndAfterPadding() : this.f10452v.getEndAfterPadding() - (((this.f10449s - 1) - fVar.f10487e) * this.f10454x);
                decoratedMeasurement3 = endAfterPadding2;
                decoratedMeasurement2 = endAfterPadding2 - this.f10452v.getDecoratedMeasurement(viewB);
            } else {
                int startAfterPadding = cVar.f10466f ? this.f10452v.getStartAfterPadding() : (fVar.f10487e * this.f10454x) + this.f10452v.getStartAfterPadding();
                decoratedMeasurement2 = startAfterPadding;
                decoratedMeasurement3 = this.f10452v.getDecoratedMeasurement(viewB) + startAfterPadding;
            }
            if (this.f10453w == 1) {
                layoutDecoratedWithMargins(viewB, decoratedMeasurement2, decoratedMeasurement, decoratedMeasurement3, i8);
            } else {
                layoutDecoratedWithMargins(viewB, decoratedMeasurement, decoratedMeasurement2, i8, decoratedMeasurement3);
            }
            if (cVar.f10466f) {
                r0(this.f10455y.f10596e, i9);
            } else {
                x0(fVar, this.f10455y.f10596e, i9);
            }
            k0(wVar, this.f10455y);
            if (!this.f10455y.f10599h || !viewB.hasFocusable()) {
                z8 = false;
            } else if (cVar.f10466f) {
                this.f10434B.clear();
                z8 = false;
            } else {
                z8 = false;
                this.f10434B.set(fVar.f10487e, false);
            }
            r9 = z8;
            z9 = true;
        }
        int i10 = r9;
        if (!z9) {
            k0(wVar, this.f10455y);
        }
        int startAfterPadding2 = this.f10455y.f10596e == -1 ? this.f10451u.getStartAfterPadding() - Z(this.f10451u.getStartAfterPadding()) : W(this.f10451u.getEndAfterPadding()) - this.f10451u.getEndAfterPadding();
        return startAfterPadding2 > 0 ? Math.min(gVar.f10593b, startAfterPadding2) : i10;
    }

    private int N(int i8) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            int position = getPosition(getChildAt(i9));
            if (position >= 0 && position < i8) {
                return position;
            }
        }
        return 0;
    }

    private int R(int i8) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i8) {
                return position;
            }
        }
        return 0;
    }

    private void S(RecyclerView.w wVar, RecyclerView.B b9, boolean z8) {
        int endAfterPadding;
        int iW = W(Integer.MIN_VALUE);
        if (iW != Integer.MIN_VALUE && (endAfterPadding = this.f10451u.getEndAfterPadding() - iW) > 0) {
            int i8 = endAfterPadding - (-p0(-endAfterPadding, wVar, b9));
            if (!z8 || i8 <= 0) {
                return;
            }
            this.f10451u.offsetChildren(i8);
        }
    }

    private void T(RecyclerView.w wVar, RecyclerView.B b9, boolean z8) {
        int startAfterPadding;
        int iZ = Z(Integer.MAX_VALUE);
        if (iZ != Integer.MAX_VALUE && (startAfterPadding = iZ - this.f10451u.getStartAfterPadding()) > 0) {
            int iP0 = startAfterPadding - p0(startAfterPadding, wVar, b9);
            if (!z8 || iP0 <= 0) {
                return;
            }
            this.f10451u.offsetChildren(-iP0);
        }
    }

    private int W(int i8) {
        int iJ = this.f10450t[0].j(i8);
        for (int i9 = 1; i9 < this.f10449s; i9++) {
            int iJ2 = this.f10450t[i9].j(i8);
            if (iJ2 > iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    private int X(int i8) {
        int iM = this.f10450t[0].m(i8);
        for (int i9 = 1; i9 < this.f10449s; i9++) {
            int iM2 = this.f10450t[i9].m(i8);
            if (iM2 > iM) {
                iM = iM2;
            }
        }
        return iM;
    }

    private int Y(int i8) {
        int iJ = this.f10450t[0].j(i8);
        for (int i9 = 1; i9 < this.f10449s; i9++) {
            int iJ2 = this.f10450t[i9].j(i8);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    private int Z(int i8) {
        int iM = this.f10450t[0].m(i8);
        for (int i9 = 1; i9 < this.f10449s; i9++) {
            int iM2 = this.f10450t[i9].m(i8);
            if (iM2 < iM) {
                iM = iM2;
            }
        }
        return iM;
    }

    private f a0(g gVar) {
        int i8;
        int i9;
        int i10;
        if (h0(gVar.f10596e)) {
            i9 = this.f10449s - 1;
            i8 = -1;
            i10 = -1;
        } else {
            i8 = this.f10449s;
            i9 = 0;
            i10 = 1;
        }
        f fVar = null;
        if (gVar.f10596e == 1) {
            int startAfterPadding = this.f10451u.getStartAfterPadding();
            int i11 = Integer.MAX_VALUE;
            while (i9 != i8) {
                f fVar2 = this.f10450t[i9];
                int iJ = fVar2.j(startAfterPadding);
                if (iJ < i11) {
                    fVar = fVar2;
                    i11 = iJ;
                }
                i9 += i10;
            }
            return fVar;
        }
        int endAfterPadding = this.f10451u.getEndAfterPadding();
        int i12 = Integer.MIN_VALUE;
        while (i9 != i8) {
            f fVar3 = this.f10450t[i9];
            int iM = fVar3.m(endAfterPadding);
            if (iM > i12) {
                fVar = fVar3;
                i12 = iM;
            }
            i9 += i10;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f10433A
            if (r0 == 0) goto L9
            int r0 = r6.V()
            goto Ld
        L9:
            int r0 = r6.U()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f10437E
            r4.e(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f10437E
            r9.h(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f10437E
            r7.g(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f10437E
            r9.h(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f10437E
            r9.g(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f10433A
            if (r7 == 0) goto L4e
            int r7 = r6.U()
            goto L52
        L4e:
            int r7 = r6.V()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b0(int, int, int):void");
    }

    private void e0(View view, int i8, int i9, boolean z8) {
        calculateItemDecorationsForChild(view, this.f10443K);
        c cVar = (c) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f10443K;
        int iY0 = y0(i8, i10 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i11 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f10443K;
        int iY02 = y0(i9, i11 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z8 ? v(view, iY0, iY02, cVar) : t(view, iY0, iY02, cVar)) {
            view.measure(iY0, iY02);
        }
    }

    private void f0(View view, c cVar, boolean z8) {
        if (cVar.f10466f) {
            if (this.f10453w == 1) {
                e0(view, this.f10442J, RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z8);
                return;
            } else {
                e0(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f10442J, z8);
                return;
            }
        }
        if (this.f10453w == 1) {
            e0(view, RecyclerView.p.getChildMeasureSpec(this.f10454x, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z8);
        } else {
            e0(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.getChildMeasureSpec(this.f10454x, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g0(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    private boolean h0(int i8) {
        if (this.f10453w == 0) {
            return (i8 == -1) != this.f10433A;
        }
        return ((i8 == -1) == this.f10433A) == d0();
    }

    private void j0(View view) {
        for (int i8 = this.f10449s - 1; i8 >= 0; i8--) {
            this.f10450t[i8].r(view);
        }
    }

    private void k0(RecyclerView.w wVar, g gVar) {
        if (!gVar.f10592a || gVar.f10600i) {
            return;
        }
        if (gVar.f10593b == 0) {
            if (gVar.f10596e == -1) {
                l0(wVar, gVar.f10598g);
                return;
            } else {
                m0(wVar, gVar.f10597f);
                return;
            }
        }
        if (gVar.f10596e != -1) {
            int iY = Y(gVar.f10598g) - gVar.f10598g;
            m0(wVar, iY < 0 ? gVar.f10597f : Math.min(iY, gVar.f10593b) + gVar.f10597f);
        } else {
            int i8 = gVar.f10597f;
            int iX = i8 - X(i8);
            l0(wVar, iX < 0 ? gVar.f10598g : gVar.f10598g - Math.min(iX, gVar.f10593b));
        }
    }

    private void l0(RecyclerView.w wVar, int i8) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f10451u.getDecoratedStart(childAt) < i8 || this.f10451u.getTransformedStartWithDecoration(childAt) < i8) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f10466f) {
                for (int i9 = 0; i9 < this.f10449s; i9++) {
                    if (this.f10450t[i9].f10483a.size() == 1) {
                        return;
                    }
                }
                for (int i10 = 0; i10 < this.f10449s; i10++) {
                    this.f10450t[i10].p();
                }
            } else if (cVar.f10465e.f10483a.size() == 1) {
                return;
            } else {
                cVar.f10465e.p();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    private void m0(RecyclerView.w wVar, int i8) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f10451u.getDecoratedEnd(childAt) > i8 || this.f10451u.getTransformedEndWithDecoration(childAt) > i8) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f10466f) {
                for (int i9 = 0; i9 < this.f10449s; i9++) {
                    if (this.f10450t[i9].f10483a.size() == 1) {
                        return;
                    }
                }
                for (int i10 = 0; i10 < this.f10449s; i10++) {
                    this.f10450t[i10].q();
                }
            } else if (cVar.f10465e.f10483a.size() == 1) {
                return;
            } else {
                cVar.f10465e.q();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    private void n0() {
        if (this.f10452v.getMode() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            float decoratedMeasurement = this.f10452v.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= fMax) {
                if (((c) childAt.getLayoutParams()).isFullSpan()) {
                    decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.f10449s;
                }
                fMax = Math.max(fMax, decoratedMeasurement);
            }
        }
        int i9 = this.f10454x;
        int iRound = Math.round(fMax * this.f10449s);
        if (this.f10452v.getMode() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f10452v.getTotalSpace());
        }
        w0(iRound);
        if (this.f10454x == i9) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f10466f) {
                if (d0() && this.f10453w == 1) {
                    int i11 = this.f10449s;
                    int i12 = cVar.f10465e.f10487e;
                    childAt2.offsetLeftAndRight(((-((i11 - 1) - i12)) * this.f10454x) - ((-((i11 - 1) - i12)) * i9));
                } else {
                    int i13 = cVar.f10465e.f10487e;
                    int i14 = this.f10454x * i13;
                    int i15 = i13 * i9;
                    if (this.f10453w == 1) {
                        childAt2.offsetLeftAndRight(i14 - i15);
                    } else {
                        childAt2.offsetTopAndBottom(i14 - i15);
                    }
                }
            }
        }
    }

    private void o0() {
        if (this.f10453w == 1 || !d0()) {
            this.f10433A = this.f10456z;
        } else {
            this.f10433A = !this.f10456z;
        }
    }

    private void q0(int i8) {
        g gVar = this.f10455y;
        gVar.f10596e = i8;
        gVar.f10595d = this.f10433A != (i8 == -1) ? -1 : 1;
    }

    private void r0(int i8, int i9) {
        for (int i10 = 0; i10 < this.f10449s; i10++) {
            if (!this.f10450t[i10].f10483a.isEmpty()) {
                x0(this.f10450t[i10], i8, i9);
            }
        }
    }

    private boolean s0(RecyclerView.B b9, b bVar) {
        bVar.f10458a = this.f10439G ? R(b9.getItemCount()) : N(b9.getItemCount());
        bVar.f10459b = Integer.MIN_VALUE;
        return true;
    }

    private void v0(int i8, RecyclerView.B b9) {
        int totalSpace;
        int totalSpace2;
        int targetScrollPosition;
        g gVar = this.f10455y;
        boolean z8 = false;
        gVar.f10593b = 0;
        gVar.f10594c = i8;
        if (!isSmoothScrolling() || (targetScrollPosition = b9.getTargetScrollPosition()) == -1) {
            totalSpace = 0;
            totalSpace2 = 0;
        } else {
            if (this.f10433A == (targetScrollPosition < i8)) {
                totalSpace = this.f10451u.getTotalSpace();
                totalSpace2 = 0;
            } else {
                totalSpace2 = this.f10451u.getTotalSpace();
                totalSpace = 0;
            }
        }
        if (getClipToPadding()) {
            this.f10455y.f10597f = this.f10451u.getStartAfterPadding() - totalSpace2;
            this.f10455y.f10598g = this.f10451u.getEndAfterPadding() + totalSpace;
        } else {
            this.f10455y.f10598g = this.f10451u.getEnd() + totalSpace;
            this.f10455y.f10597f = -totalSpace2;
        }
        g gVar2 = this.f10455y;
        gVar2.f10599h = false;
        gVar2.f10592a = true;
        if (this.f10451u.getMode() == 0 && this.f10451u.getEnd() == 0) {
            z8 = true;
        }
        gVar2.f10600i = z8;
    }

    private void x(View view) {
        for (int i8 = this.f10449s - 1; i8 >= 0; i8--) {
            this.f10450t[i8].a(view);
        }
    }

    private void x0(f fVar, int i8, int i9) {
        int deletedSize = fVar.getDeletedSize();
        if (i8 == -1) {
            if (fVar.l() + deletedSize <= i9) {
                this.f10434B.set(fVar.f10487e, false);
            }
        } else if (fVar.i() - deletedSize >= i9) {
            this.f10434B.set(fVar.f10487e, false);
        }
    }

    private void y(b bVar) {
        e eVar = this.f10441I;
        int i8 = eVar.f10475c;
        if (i8 > 0) {
            if (i8 == this.f10449s) {
                for (int i9 = 0; i9 < this.f10449s; i9++) {
                    this.f10450t[i9].e();
                    e eVar2 = this.f10441I;
                    int endAfterPadding = eVar2.f10476d[i9];
                    if (endAfterPadding != Integer.MIN_VALUE) {
                        endAfterPadding += eVar2.f10481i ? this.f10451u.getEndAfterPadding() : this.f10451u.getStartAfterPadding();
                    }
                    this.f10450t[i9].s(endAfterPadding);
                }
            } else {
                eVar.c();
                e eVar3 = this.f10441I;
                eVar3.f10473a = eVar3.f10474b;
            }
        }
        e eVar4 = this.f10441I;
        this.f10440H = eVar4.f10482j;
        setReverseLayout(eVar4.f10480h);
        o0();
        e eVar5 = this.f10441I;
        int i10 = eVar5.f10473a;
        if (i10 != -1) {
            this.f10435C = i10;
            bVar.f10460c = eVar5.f10481i;
        } else {
            bVar.f10460c = this.f10433A;
        }
        if (eVar5.f10477e > 1) {
            d dVar = this.f10437E;
            dVar.f10467a = eVar5.f10478f;
            dVar.f10468b = eVar5.f10479g;
        }
    }

    private int y0(int i8, int i9, int i10) {
        if (i9 == 0 && i10 == 0) {
            return i8;
        }
        int mode = View.MeasureSpec.getMode(i8);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - i9) - i10), mode) : i8;
    }

    boolean A() {
        int iM = this.f10450t[0].m(Integer.MIN_VALUE);
        for (int i8 = 1; i8 < this.f10449s; i8++) {
            if (this.f10450t[i8].m(Integer.MIN_VALUE) != iM) {
                return false;
            }
        }
        return true;
    }

    boolean D() {
        int iU;
        int iV;
        if (getChildCount() == 0 || this.f10438F == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f10433A) {
            iU = V();
            iV = U();
        } else {
            iU = U();
            iV = V();
        }
        if (iU == 0 && c0() != null) {
            this.f10437E.a();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f10445M) {
            return false;
        }
        int i8 = this.f10433A ? -1 : 1;
        int i9 = iV + 1;
        d.a firstFullSpanItemInRange = this.f10437E.getFirstFullSpanItemInRange(iU, i9, i8, true);
        if (firstFullSpanItemInRange == null) {
            this.f10445M = false;
            this.f10437E.c(i9);
            return false;
        }
        d.a firstFullSpanItemInRange2 = this.f10437E.getFirstFullSpanItemInRange(iU, firstFullSpanItemInRange.f10469a, i8 * (-1), true);
        if (firstFullSpanItemInRange2 == null) {
            this.f10437E.c(firstFullSpanItemInRange.f10469a);
        } else {
            this.f10437E.c(firstFullSpanItemInRange2.f10469a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    View O(boolean z8) {
        int startAfterPadding = this.f10451u.getStartAfterPadding();
        int endAfterPadding = this.f10451u.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.f10451u.getDecoratedStart(childAt);
            int decoratedEnd = this.f10451u.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z8) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View P(boolean z8) {
        int startAfterPadding = this.f10451u.getStartAfterPadding();
        int endAfterPadding = this.f10451u.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int decoratedStart = this.f10451u.getDecoratedStart(childAt);
            if (this.f10451u.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z8) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int Q() {
        View viewO = this.f10433A ? O(true) : P(true);
        if (viewO == null) {
            return -1;
        }
        return getPosition(viewO);
    }

    int U() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    int V() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f10441I == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View c0() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f10449s
            r2.<init>(r3)
            int r3 = r12.f10449s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f10453w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.d0()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f10433A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f10465e
            int r9 = r9.f10487e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f10465e
            boolean r9 = r12.E(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f10465e
            int r9 = r9.f10487e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f10466f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f10433A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.j r10 = r12.f10451u
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.j r11 = r12.f10451u
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.j r10 = r12.f10451u
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.j r11 = r12.f10451u
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f10465e
            int r8 = r8.f10487e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f10465e
            int r9 = r9.f10487e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.f10453w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f10453w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i8, int i9, RecyclerView.B b9, RecyclerView.p.c cVar) {
        int iJ;
        int iM;
        if (this.f10453w != 0) {
            i8 = i9;
        }
        if (getChildCount() == 0 || i8 == 0) {
            return;
        }
        i0(i8, b9);
        int[] iArr = this.f10447O;
        if (iArr == null || iArr.length < this.f10449s) {
            this.f10447O = new int[this.f10449s];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f10449s; i11++) {
            g gVar = this.f10455y;
            if (gVar.f10595d == -1) {
                iJ = gVar.f10597f;
                iM = this.f10450t[i11].m(iJ);
            } else {
                iJ = this.f10450t[i11].j(gVar.f10598g);
                iM = this.f10455y.f10598g;
            }
            int i12 = iJ - iM;
            if (i12 >= 0) {
                this.f10447O[i10] = i12;
                i10++;
            }
        }
        Arrays.sort(this.f10447O, 0, i10);
        for (int i13 = 0; i13 < i10 && this.f10455y.a(b9); i13++) {
            cVar.addPosition(this.f10455y.f10594c, this.f10447O[i13]);
            g gVar2 = this.f10455y;
            gVar2.f10594c += gVar2.f10595d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.B b9) {
        return F(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.B b9) {
        return G(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.B b9) {
        return H(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF computeScrollVectorForPosition(int i8) {
        int iC = C(i8);
        PointF pointF = new PointF();
        if (iC == 0) {
            return null;
        }
        if (this.f10453w == 0) {
            pointF.x = iC;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iC;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.B b9) {
        return F(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.B b9) {
        return G(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.B b9) {
        return H(b9);
    }

    boolean d0() {
        return getLayoutDirection() == 1;
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f10449s];
        } else if (iArr.length < this.f10449s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f10449s + ", array size:" + iArr.length);
        }
        for (int i8 = 0; i8 < this.f10449s; i8++) {
            iArr[i8] = this.f10450t[i8].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f10449s];
        } else if (iArr.length < this.f10449s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f10449s + ", array size:" + iArr.length);
        }
        for (int i8 = 0; i8 < this.f10449s; i8++) {
            iArr[i8] = this.f10450t[i8].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f10449s];
        } else if (iArr.length < this.f10449s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f10449s + ", array size:" + iArr.length);
        }
        for (int i8 = 0; i8 < this.f10449s; i8++) {
            iArr[i8] = this.f10450t[i8].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f10449s];
        } else if (iArr.length < this.f10449s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f10449s + ", array size:" + iArr.length);
        }
        for (int i8 = 0; i8 < this.f10449s; i8++) {
            iArr[i8] = this.f10450t[i8].findLastVisibleItemPosition();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.f10453w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int getGapStrategy() {
        return this.f10438F;
    }

    public int getOrientation() {
        return this.f10453w;
    }

    public boolean getReverseLayout() {
        return this.f10456z;
    }

    public int getSpanCount() {
        return this.f10449s;
    }

    void i0(int i8, RecyclerView.B b9) {
        int iU;
        int i9;
        if (i8 > 0) {
            iU = V();
            i9 = 1;
        } else {
            iU = U();
            i9 = -1;
        }
        this.f10455y.f10592a = true;
        v0(iU, b9);
        q0(i9);
        g gVar = this.f10455y;
        gVar.f10594c = iU + gVar.f10595d;
        gVar.f10593b = Math.abs(i8);
    }

    public void invalidateSpanAssignments() {
        this.f10437E.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return this.f10438F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenHorizontal(int i8) {
        super.offsetChildrenHorizontal(i8);
        for (int i9 = 0; i9 < this.f10449s; i9++) {
            this.f10450t[i9].o(i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenVertical(int i8) {
        super.offsetChildrenVertical(i8);
        for (int i9 = 0; i9 < this.f10449s; i9++) {
            this.f10450t[i9].o(i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f10437E.a();
        for (int i8 = 0; i8 < this.f10449s; i8++) {
            this.f10450t[i8].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        removeCallbacks(this.f10448P);
        for (int i8 = 0; i8 < this.f10449s; i8++) {
            this.f10450t[i8].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        View viewFindContainingItemView;
        View focusableViewAfter;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        o0();
        int I8 = I(i8);
        if (I8 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewFindContainingItemView.getLayoutParams();
        boolean z8 = cVar.f10466f;
        f fVar = cVar.f10465e;
        int iV = I8 == 1 ? V() : U();
        v0(iV, b9);
        q0(I8);
        g gVar = this.f10455y;
        gVar.f10594c = gVar.f10595d + iV;
        gVar.f10593b = (int) (this.f10451u.getTotalSpace() * 0.33333334f);
        g gVar2 = this.f10455y;
        gVar2.f10599h = true;
        gVar2.f10592a = false;
        M(wVar, gVar2, b9);
        this.f10439G = this.f10433A;
        if (!z8 && (focusableViewAfter = fVar.getFocusableViewAfter(iV, I8)) != null && focusableViewAfter != viewFindContainingItemView) {
            return focusableViewAfter;
        }
        if (h0(I8)) {
            for (int i9 = this.f10449s - 1; i9 >= 0; i9--) {
                View focusableViewAfter2 = this.f10450t[i9].getFocusableViewAfter(iV, I8);
                if (focusableViewAfter2 != null && focusableViewAfter2 != viewFindContainingItemView) {
                    return focusableViewAfter2;
                }
            }
        } else {
            for (int i10 = 0; i10 < this.f10449s; i10++) {
                View focusableViewAfter3 = this.f10450t[i10].getFocusableViewAfter(iV, I8);
                if (focusableViewAfter3 != null && focusableViewAfter3 != viewFindContainingItemView) {
                    return focusableViewAfter3;
                }
            }
        }
        boolean z9 = (this.f10456z ^ true) == (I8 == -1);
        if (!z8) {
            View viewFindViewByPosition = findViewByPosition(z9 ? fVar.findFirstPartiallyVisibleItemPosition() : fVar.findLastPartiallyVisibleItemPosition());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (h0(I8)) {
            for (int i11 = this.f10449s - 1; i11 >= 0; i11--) {
                if (i11 != fVar.f10487e) {
                    View viewFindViewByPosition2 = findViewByPosition(z9 ? this.f10450t[i11].findFirstPartiallyVisibleItemPosition() : this.f10450t[i11].findLastPartiallyVisibleItemPosition());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f10449s; i12++) {
                View viewFindViewByPosition3 = findViewByPosition(z9 ? this.f10450t[i12].findFirstPartiallyVisibleItemPosition() : this.f10450t[i12].findLastPartiallyVisibleItemPosition());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewP = P(false);
            View viewO = O(false);
            if (viewP == null || viewO == null) {
                return;
            }
            int position = getPosition(viewP);
            int position2 = getPosition(viewO);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i8, int i9) {
        b0(i8, i9, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f10437E.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i8, int i9, int i10) {
        b0(i8, i9, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i8, int i9) {
        b0(i8, i9, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i8, int i9, Object obj) {
        b0(i8, i9, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.B b9) {
        g0(wVar, b9, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.B b9) {
        super.onLayoutCompleted(b9);
        this.f10435C = -1;
        this.f10436D = Integer.MIN_VALUE;
        this.f10441I = null;
        this.f10444L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f10441I = eVar;
            if (this.f10435C != -1) {
                eVar.b();
                this.f10441I.c();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        int iM;
        int startAfterPadding;
        int[] iArr;
        if (this.f10441I != null) {
            return new e(this.f10441I);
        }
        e eVar = new e();
        eVar.f10480h = this.f10456z;
        eVar.f10481i = this.f10439G;
        eVar.f10482j = this.f10440H;
        d dVar = this.f10437E;
        if (dVar == null || (iArr = dVar.f10467a) == null) {
            eVar.f10477e = 0;
        } else {
            eVar.f10478f = iArr;
            eVar.f10477e = iArr.length;
            eVar.f10479g = dVar.f10468b;
        }
        if (getChildCount() > 0) {
            eVar.f10473a = this.f10439G ? V() : U();
            eVar.f10474b = Q();
            int i8 = this.f10449s;
            eVar.f10475c = i8;
            eVar.f10476d = new int[i8];
            for (int i9 = 0; i9 < this.f10449s; i9++) {
                if (this.f10439G) {
                    iM = this.f10450t[i9].j(Integer.MIN_VALUE);
                    if (iM != Integer.MIN_VALUE) {
                        startAfterPadding = this.f10451u.getEndAfterPadding();
                        iM -= startAfterPadding;
                    }
                } else {
                    iM = this.f10450t[i9].m(Integer.MIN_VALUE);
                    if (iM != Integer.MIN_VALUE) {
                        startAfterPadding = this.f10451u.getStartAfterPadding();
                        iM -= startAfterPadding;
                    }
                }
                eVar.f10476d[i9] = iM;
            }
        } else {
            eVar.f10473a = -1;
            eVar.f10474b = -1;
            eVar.f10475c = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onScrollStateChanged(int i8) {
        if (i8 == 0) {
            D();
        }
    }

    int p0(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        if (getChildCount() == 0 || i8 == 0) {
            return 0;
        }
        i0(i8, b9);
        int iM = M(wVar, this.f10455y, b9);
        if (this.f10455y.f10593b >= iM) {
            i8 = i8 < 0 ? -iM : iM;
        }
        this.f10451u.offsetChildren(-i8);
        this.f10439G = this.f10433A;
        g gVar = this.f10455y;
        gVar.f10593b = 0;
        k0(wVar, gVar);
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        return p0(i8, wVar, b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i8) {
        e eVar = this.f10441I;
        if (eVar != null && eVar.f10473a != i8) {
            eVar.b();
        }
        this.f10435C = i8;
        this.f10436D = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i8, int i9) {
        e eVar = this.f10441I;
        if (eVar != null) {
            eVar.b();
        }
        this.f10435C = i8;
        this.f10436D = i9;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        return p0(i8, wVar, b9);
    }

    public void setGapStrategy(int i8) {
        assertNotInLayoutOrScroll(null);
        if (i8 == this.f10438F) {
            return;
        }
        if (i8 != 0 && i8 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f10438F = i8;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i8, int i9) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f10453w == 1) {
            iChooseSize2 = RecyclerView.p.chooseSize(i9, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.p.chooseSize(i8, (this.f10454x * this.f10449s) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.p.chooseSize(i8, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.p.chooseSize(i9, (this.f10454x * this.f10449s) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i8 == this.f10453w) {
            return;
        }
        this.f10453w = i8;
        j jVar = this.f10451u;
        this.f10451u = this.f10452v;
        this.f10452v = jVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z8) {
        assertNotInLayoutOrScroll(null);
        e eVar = this.f10441I;
        if (eVar != null && eVar.f10480h != z8) {
            eVar.f10480h = z8;
        }
        this.f10456z = z8;
        requestLayout();
    }

    public void setSpanCount(int i8) {
        assertNotInLayoutOrScroll(null);
        if (i8 != this.f10449s) {
            invalidateSpanAssignments();
            this.f10449s = i8;
            this.f10434B = new BitSet(this.f10449s);
            this.f10450t = new f[this.f10449s];
            for (int i9 = 0; i9 < this.f10449s; i9++) {
                this.f10450t[i9] = new f(i9);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.B b9, int i8) {
        h hVar = new h(recyclerView.getContext());
        hVar.setTargetPosition(i8);
        startSmoothScroll(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f10441I == null;
    }

    boolean t0(RecyclerView.B b9, b bVar) {
        int i8;
        if (!b9.isPreLayout() && (i8 = this.f10435C) != -1) {
            if (i8 >= 0 && i8 < b9.getItemCount()) {
                e eVar = this.f10441I;
                if (eVar == null || eVar.f10473a == -1 || eVar.f10475c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f10435C);
                    if (viewFindViewByPosition != null) {
                        bVar.f10458a = this.f10433A ? V() : U();
                        if (this.f10436D != Integer.MIN_VALUE) {
                            if (bVar.f10460c) {
                                bVar.f10459b = (this.f10451u.getEndAfterPadding() - this.f10436D) - this.f10451u.getDecoratedEnd(viewFindViewByPosition);
                            } else {
                                bVar.f10459b = (this.f10451u.getStartAfterPadding() + this.f10436D) - this.f10451u.getDecoratedStart(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f10451u.getDecoratedMeasurement(viewFindViewByPosition) > this.f10451u.getTotalSpace()) {
                            bVar.f10459b = bVar.f10460c ? this.f10451u.getEndAfterPadding() : this.f10451u.getStartAfterPadding();
                            return true;
                        }
                        int decoratedStart = this.f10451u.getDecoratedStart(viewFindViewByPosition) - this.f10451u.getStartAfterPadding();
                        if (decoratedStart < 0) {
                            bVar.f10459b = -decoratedStart;
                            return true;
                        }
                        int endAfterPadding = this.f10451u.getEndAfterPadding() - this.f10451u.getDecoratedEnd(viewFindViewByPosition);
                        if (endAfterPadding < 0) {
                            bVar.f10459b = endAfterPadding;
                            return true;
                        }
                        bVar.f10459b = Integer.MIN_VALUE;
                    } else {
                        int i9 = this.f10435C;
                        bVar.f10458a = i9;
                        int i10 = this.f10436D;
                        if (i10 == Integer.MIN_VALUE) {
                            bVar.f10460c = C(i9) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i10);
                        }
                        bVar.f10461d = true;
                    }
                } else {
                    bVar.f10459b = Integer.MIN_VALUE;
                    bVar.f10458a = this.f10435C;
                }
                return true;
            }
            this.f10435C = -1;
            this.f10436D = Integer.MIN_VALUE;
        }
        return false;
    }

    void u0(RecyclerView.B b9, b bVar) {
        if (t0(b9, bVar) || s0(b9, bVar)) {
            return;
        }
        bVar.a();
        bVar.f10458a = 0;
    }

    void w0(int i8) {
        this.f10454x = i8 / this.f10449s;
        this.f10442J = View.MeasureSpec.makeMeasureSpec(i8, this.f10452v.getMode());
    }

    boolean z() {
        int iJ = this.f10450t[0].j(Integer.MIN_VALUE);
        for (int i8 = 1; i8 < this.f10449s; i8++) {
            if (this.f10450t[i8].j(Integer.MIN_VALUE) != iJ) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f10467a;

        /* renamed from: b, reason: collision with root package name */
        List f10468b;

        d() {
        }

        private int f(int i8) {
            if (this.f10468b == null) {
                return -1;
            }
            a fullSpanItem = getFullSpanItem(i8);
            if (fullSpanItem != null) {
                this.f10468b.remove(fullSpanItem);
            }
            int size = this.f10468b.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    i9 = -1;
                    break;
                }
                if (((a) this.f10468b.get(i9)).f10469a >= i8) {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                return -1;
            }
            a aVar = (a) this.f10468b.get(i9);
            this.f10468b.remove(i9);
            return aVar.f10469a;
        }

        private void i(int i8, int i9) {
            List list = this.f10468b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10468b.get(size);
                int i10 = aVar.f10469a;
                if (i10 >= i8) {
                    aVar.f10469a = i10 + i9;
                }
            }
        }

        private void j(int i8, int i9) {
            List list = this.f10468b;
            if (list == null) {
                return;
            }
            int i10 = i8 + i9;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10468b.get(size);
                int i11 = aVar.f10469a;
                if (i11 >= i8) {
                    if (i11 < i10) {
                        this.f10468b.remove(size);
                    } else {
                        aVar.f10469a = i11 - i9;
                    }
                }
            }
        }

        void a() {
            int[] iArr = this.f10467a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10468b = null;
        }

        public void addFullSpanItem(a aVar) {
            if (this.f10468b == null) {
                this.f10468b = new ArrayList();
            }
            int size = this.f10468b.size();
            for (int i8 = 0; i8 < size; i8++) {
                a aVar2 = (a) this.f10468b.get(i8);
                if (aVar2.f10469a == aVar.f10469a) {
                    this.f10468b.remove(i8);
                }
                if (aVar2.f10469a >= aVar.f10469a) {
                    this.f10468b.add(i8, aVar);
                    return;
                }
            }
            this.f10468b.add(aVar);
        }

        void b(int i8) {
            int[] iArr = this.f10467a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i8, 10) + 1];
                this.f10467a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i8 >= iArr.length) {
                int[] iArr3 = new int[l(i8)];
                this.f10467a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f10467a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int c(int i8) {
            List list = this.f10468b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f10468b.get(size)).f10469a >= i8) {
                        this.f10468b.remove(size);
                    }
                }
            }
            return e(i8);
        }

        int d(int i8) {
            int[] iArr = this.f10467a;
            if (iArr == null || i8 >= iArr.length) {
                return -1;
            }
            return iArr[i8];
        }

        int e(int i8) {
            int[] iArr = this.f10467a;
            if (iArr == null || i8 >= iArr.length) {
                return -1;
            }
            int iF = f(i8);
            if (iF == -1) {
                int[] iArr2 = this.f10467a;
                Arrays.fill(iArr2, i8, iArr2.length, -1);
                return this.f10467a.length;
            }
            int iMin = Math.min(iF + 1, this.f10467a.length);
            Arrays.fill(this.f10467a, i8, iMin, -1);
            return iMin;
        }

        void g(int i8, int i9) {
            int[] iArr = this.f10467a;
            if (iArr == null || i8 >= iArr.length) {
                return;
            }
            int i10 = i8 + i9;
            b(i10);
            int[] iArr2 = this.f10467a;
            System.arraycopy(iArr2, i8, iArr2, i10, (iArr2.length - i8) - i9);
            Arrays.fill(this.f10467a, i8, i10, -1);
            i(i8, i9);
        }

        public a getFirstFullSpanItemInRange(int i8, int i9, int i10, boolean z8) {
            List list = this.f10468b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f10468b.get(i11);
                int i12 = aVar.f10469a;
                if (i12 >= i9) {
                    return null;
                }
                if (i12 >= i8 && (i10 == 0 || aVar.f10470b == i10 || (z8 && aVar.f10472d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a getFullSpanItem(int i8) {
            List list = this.f10468b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10468b.get(size);
                if (aVar.f10469a == i8) {
                    return aVar;
                }
            }
            return null;
        }

        void h(int i8, int i9) {
            int[] iArr = this.f10467a;
            if (iArr == null || i8 >= iArr.length) {
                return;
            }
            int i10 = i8 + i9;
            b(i10);
            int[] iArr2 = this.f10467a;
            System.arraycopy(iArr2, i10, iArr2, i8, (iArr2.length - i8) - i9);
            int[] iArr3 = this.f10467a;
            Arrays.fill(iArr3, iArr3.length - i9, iArr3.length, -1);
            j(i8, i9);
        }

        void k(int i8, f fVar) {
            b(i8);
            this.f10467a[i8] = fVar.f10487e;
        }

        int l(int i8) {
            int length = this.f10467a.length;
            while (length <= i8) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0160a();

            /* renamed from: a, reason: collision with root package name */
            int f10469a;

            /* renamed from: b, reason: collision with root package name */
            int f10470b;

            /* renamed from: c, reason: collision with root package name */
            int[] f10471c;

            /* renamed from: d, reason: collision with root package name */
            boolean f10472d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0160a implements Parcelable.Creator {
                C0160a() {
                }

                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            a(Parcel parcel) {
                this.f10469a = parcel.readInt();
                this.f10470b = parcel.readInt();
                this.f10472d = parcel.readInt() == 1;
                int i8 = parcel.readInt();
                if (i8 > 0) {
                    int[] iArr = new int[i8];
                    this.f10471c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int b(int i8) {
                int[] iArr = this.f10471c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i8];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f10469a + ", mGapDir=" + this.f10470b + ", mHasUnwantedGapAfter=" + this.f10472d + ", mGapPerSpan=" + Arrays.toString(this.f10471c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i8) {
                parcel.writeInt(this.f10469a);
                parcel.writeInt(this.f10470b);
                parcel.writeInt(this.f10472d ? 1 : 0);
                int[] iArr = this.f10471c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f10471c);
                }
            }

            a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i8, int i9) {
        this.f10453w = i9;
        setSpanCount(i8);
        this.f10455y = new g();
        L();
    }
}
