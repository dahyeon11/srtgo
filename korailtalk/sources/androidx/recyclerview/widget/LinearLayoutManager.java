package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.x;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements f, RecyclerView.A.b {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;

    /* renamed from: A, reason: collision with root package name */
    int f10196A;

    /* renamed from: B, reason: collision with root package name */
    int f10197B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f10198C;

    /* renamed from: D, reason: collision with root package name */
    d f10199D;

    /* renamed from: E, reason: collision with root package name */
    final a f10200E;

    /* renamed from: F, reason: collision with root package name */
    private final b f10201F;

    /* renamed from: G, reason: collision with root package name */
    private int f10202G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f10203H;

    /* renamed from: s, reason: collision with root package name */
    int f10204s;

    /* renamed from: t, reason: collision with root package name */
    private c f10205t;

    /* renamed from: u, reason: collision with root package name */
    j f10206u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10207v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10208w;

    /* renamed from: x, reason: collision with root package name */
    boolean f10209x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10210y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10211z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        j f10212a;

        /* renamed from: b, reason: collision with root package name */
        int f10213b;

        /* renamed from: c, reason: collision with root package name */
        int f10214c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10215d;

        /* renamed from: e, reason: collision with root package name */
        boolean f10216e;

        a() {
            c();
        }

        void a() {
            this.f10214c = this.f10215d ? this.f10212a.getEndAfterPadding() : this.f10212a.getStartAfterPadding();
        }

        public void assignFromView(View view, int i8) {
            if (this.f10215d) {
                this.f10214c = this.f10212a.getDecoratedEnd(view) + this.f10212a.getTotalSpaceChange();
            } else {
                this.f10214c = this.f10212a.getDecoratedStart(view);
            }
            this.f10213b = i8;
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i8) {
            int totalSpaceChange = this.f10212a.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view, i8);
                return;
            }
            this.f10213b = i8;
            if (this.f10215d) {
                int endAfterPadding = (this.f10212a.getEndAfterPadding() - totalSpaceChange) - this.f10212a.getDecoratedEnd(view);
                this.f10214c = this.f10212a.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.f10214c - this.f10212a.getDecoratedMeasurement(view);
                    int startAfterPadding = this.f10212a.getStartAfterPadding();
                    int iMin = decoratedMeasurement - (startAfterPadding + Math.min(this.f10212a.getDecoratedStart(view) - startAfterPadding, 0));
                    if (iMin < 0) {
                        this.f10214c += Math.min(endAfterPadding, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = this.f10212a.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.f10212a.getStartAfterPadding();
            this.f10214c = decoratedStart;
            if (startAfterPadding2 > 0) {
                int endAfterPadding2 = (this.f10212a.getEndAfterPadding() - Math.min(0, (this.f10212a.getEndAfterPadding() - totalSpaceChange) - this.f10212a.getDecoratedEnd(view))) - (decoratedStart + this.f10212a.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.f10214c -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        boolean b(View view, RecyclerView.B b9) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.isItemRemoved() && qVar.getViewLayoutPosition() >= 0 && qVar.getViewLayoutPosition() < b9.getItemCount();
        }

        void c() {
            this.f10213b = -1;
            this.f10214c = Integer.MIN_VALUE;
            this.f10215d = false;
            this.f10216e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f10213b + ", mCoordinate=" + this.f10214c + ", mLayoutFromEnd=" + this.f10215d + ", mValid=" + this.f10216e + '}';
        }
    }

    protected static class b {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected b() {
        }

        void a() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f10218b;

        /* renamed from: c, reason: collision with root package name */
        int f10219c;

        /* renamed from: d, reason: collision with root package name */
        int f10220d;

        /* renamed from: e, reason: collision with root package name */
        int f10221e;

        /* renamed from: f, reason: collision with root package name */
        int f10222f;

        /* renamed from: g, reason: collision with root package name */
        int f10223g;

        /* renamed from: k, reason: collision with root package name */
        int f10227k;

        /* renamed from: m, reason: collision with root package name */
        boolean f10229m;

        /* renamed from: a, reason: collision with root package name */
        boolean f10217a = true;

        /* renamed from: h, reason: collision with root package name */
        int f10224h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f10225i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f10226j = false;

        /* renamed from: l, reason: collision with root package name */
        List f10228l = null;

        c() {
        }

        private View c() {
            int size = this.f10228l.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = ((RecyclerView.E) this.f10228l.get(i8)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.isItemRemoved() && this.f10220d == qVar.getViewLayoutPosition()) {
                    assignPositionFromScrapList(view);
                    return view;
                }
            }
            return null;
        }

        boolean a(RecyclerView.B b9) {
            int i8 = this.f10220d;
            return i8 >= 0 && i8 < b9.getItemCount();
        }

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }

        View b(RecyclerView.w wVar) {
            if (this.f10228l != null) {
                return c();
            }
            View viewForPosition = wVar.getViewForPosition(this.f10220d);
            this.f10220d += this.f10221e;
            return viewForPosition;
        }

        public View nextViewInLimitedList(View view) {
            int viewLayoutPosition;
            int size = this.f10228l.size();
            View view2 = null;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < size; i9++) {
                View view3 = ((RecyclerView.E) this.f10228l.get(i9)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.isItemRemoved() && (viewLayoutPosition = (qVar.getViewLayoutPosition() - this.f10220d) * this.f10221e) >= 0 && viewLayoutPosition < i8) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i8 = viewLayoutPosition;
                }
            }
            return view2;
        }

        public void assignPositionFromScrapList(View view) {
            View viewNextViewInLimitedList = nextViewInLimitedList(view);
            if (viewNextViewInLimitedList == null) {
                this.f10220d = -1;
            } else {
                this.f10220d = ((RecyclerView.q) viewNextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
            }
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f10230a;

        /* renamed from: b, reason: collision with root package name */
        int f10231b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10232c;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d() {
        }

        boolean b() {
            return this.f10230a >= 0;
        }

        void c() {
            this.f10230a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f10230a);
            parcel.writeInt(this.f10231b);
            parcel.writeInt(this.f10232c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f10230a = parcel.readInt();
            this.f10231b = parcel.readInt();
            this.f10232c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f10230a = dVar.f10230a;
            this.f10231b = dVar.f10231b;
            this.f10232c = dVar.f10232c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int A(RecyclerView.B b9) {
        if (getChildCount() == 0) {
            return 0;
        }
        E();
        return m.b(b9, this.f10206u, I(!this.f10211z, true), H(!this.f10211z, true), this, this.f10211z, this.f10209x);
    }

    private int B(RecyclerView.B b9) {
        if (getChildCount() == 0) {
            return 0;
        }
        E();
        return m.c(b9, this.f10206u, I(!this.f10211z, true), H(!this.f10211z, true), this, this.f10211z);
    }

    private View G() {
        return K(0, getChildCount());
    }

    private View J() {
        return K(getChildCount() - 1, -1);
    }

    private View M() {
        return this.f10209x ? G() : J();
    }

    private View N() {
        return this.f10209x ? J() : G();
    }

    private int P(int i8, RecyclerView.w wVar, RecyclerView.B b9, boolean z8) {
        int endAfterPadding;
        int endAfterPadding2 = this.f10206u.getEndAfterPadding() - i8;
        if (endAfterPadding2 <= 0) {
            return 0;
        }
        int i9 = -e0(-endAfterPadding2, wVar, b9);
        int i10 = i8 + i9;
        if (!z8 || (endAfterPadding = this.f10206u.getEndAfterPadding() - i10) <= 0) {
            return i9;
        }
        this.f10206u.offsetChildren(endAfterPadding);
        return endAfterPadding + i9;
    }

    private int Q(int i8, RecyclerView.w wVar, RecyclerView.B b9, boolean z8) {
        int startAfterPadding;
        int startAfterPadding2 = i8 - this.f10206u.getStartAfterPadding();
        if (startAfterPadding2 <= 0) {
            return 0;
        }
        int i9 = -e0(startAfterPadding2, wVar, b9);
        int i10 = i8 + i9;
        if (!z8 || (startAfterPadding = i10 - this.f10206u.getStartAfterPadding()) <= 0) {
            return i9;
        }
        this.f10206u.offsetChildren(-startAfterPadding);
        return i9 - startAfterPadding;
    }

    private View R() {
        return getChildAt(this.f10209x ? 0 : getChildCount() - 1);
    }

    private View S() {
        return getChildAt(this.f10209x ? getChildCount() - 1 : 0);
    }

    private void W(RecyclerView.w wVar, RecyclerView.B b9, int i8, int i9) {
        if (!b9.willRunPredictiveAnimations() || getChildCount() == 0 || b9.isPreLayout() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.E> scrapList = wVar.getScrapList();
        int size = scrapList.size();
        int position = getPosition(getChildAt(0));
        int decoratedMeasurement = 0;
        int decoratedMeasurement2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView.E e8 = scrapList.get(i10);
            if (!e8.p()) {
                if ((e8.getLayoutPosition() < position) != this.f10209x) {
                    decoratedMeasurement += this.f10206u.getDecoratedMeasurement(e8.itemView);
                } else {
                    decoratedMeasurement2 += this.f10206u.getDecoratedMeasurement(e8.itemView);
                }
            }
        }
        this.f10205t.f10228l = scrapList;
        if (decoratedMeasurement > 0) {
            l0(getPosition(S()), i8);
            c cVar = this.f10205t;
            cVar.f10224h = decoratedMeasurement;
            cVar.f10219c = 0;
            cVar.assignPositionFromScrapList();
            F(wVar, this.f10205t, b9, false);
        }
        if (decoratedMeasurement2 > 0) {
            j0(getPosition(R()), i9);
            c cVar2 = this.f10205t;
            cVar2.f10224h = decoratedMeasurement2;
            cVar2.f10219c = 0;
            cVar2.assignPositionFromScrapList();
            F(wVar, this.f10205t, b9, false);
        }
        this.f10205t.f10228l = null;
    }

    private void Y(RecyclerView.w wVar, c cVar) {
        if (!cVar.f10217a || cVar.f10229m) {
            return;
        }
        int i8 = cVar.f10223g;
        int i9 = cVar.f10225i;
        if (cVar.f10222f == -1) {
            a0(wVar, i8, i9);
        } else {
            b0(wVar, i8, i9);
        }
    }

    private void Z(RecyclerView.w wVar, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        if (i9 <= i8) {
            while (i8 > i9) {
                removeAndRecycleViewAt(i8, wVar);
                i8--;
            }
        } else {
            for (int i10 = i9 - 1; i10 >= i8; i10--) {
                removeAndRecycleViewAt(i10, wVar);
            }
        }
    }

    private void a0(RecyclerView.w wVar, int i8, int i9) {
        int childCount = getChildCount();
        if (i8 < 0) {
            return;
        }
        int end = (this.f10206u.getEnd() - i8) + i9;
        if (this.f10209x) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (this.f10206u.getDecoratedStart(childAt) < end || this.f10206u.getTransformedStartWithDecoration(childAt) < end) {
                    Z(wVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = childCount - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            if (this.f10206u.getDecoratedStart(childAt2) < end || this.f10206u.getTransformedStartWithDecoration(childAt2) < end) {
                Z(wVar, i11, i12);
                return;
            }
        }
    }

    private void b0(RecyclerView.w wVar, int i8, int i9) {
        if (i8 < 0) {
            return;
        }
        int i10 = i8 - i9;
        int childCount = getChildCount();
        if (!this.f10209x) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (this.f10206u.getDecoratedEnd(childAt) > i10 || this.f10206u.getTransformedEndWithDecoration(childAt) > i10) {
                    Z(wVar, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = childCount - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            if (this.f10206u.getDecoratedEnd(childAt2) > i10 || this.f10206u.getTransformedEndWithDecoration(childAt2) > i10) {
                Z(wVar, i12, i13);
                return;
            }
        }
    }

    private void d0() {
        if (this.f10204s == 1 || !U()) {
            this.f10209x = this.f10208w;
        } else {
            this.f10209x = !this.f10208w;
        }
    }

    private boolean f0(RecyclerView.w wVar, RecyclerView.B b9, a aVar) {
        View viewO;
        boolean z8 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.b(focusedChild, b9)) {
            aVar.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z9 = this.f10207v;
        boolean z10 = this.f10210y;
        if (z9 != z10 || (viewO = O(wVar, b9, aVar.f10215d, z10)) == null) {
            return false;
        }
        aVar.assignFromView(viewO, getPosition(viewO));
        if (!b9.isPreLayout() && supportsPredictiveItemAnimations()) {
            int decoratedStart = this.f10206u.getDecoratedStart(viewO);
            int decoratedEnd = this.f10206u.getDecoratedEnd(viewO);
            int startAfterPadding = this.f10206u.getStartAfterPadding();
            int endAfterPadding = this.f10206u.getEndAfterPadding();
            boolean z11 = decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding;
            if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                z8 = true;
            }
            if (z11 || z8) {
                if (aVar.f10215d) {
                    startAfterPadding = endAfterPadding;
                }
                aVar.f10214c = startAfterPadding;
            }
        }
        return true;
    }

    private boolean g0(RecyclerView.B b9, a aVar) {
        int i8;
        if (!b9.isPreLayout() && (i8 = this.f10196A) != -1) {
            if (i8 >= 0 && i8 < b9.getItemCount()) {
                aVar.f10213b = this.f10196A;
                d dVar = this.f10199D;
                if (dVar != null && dVar.b()) {
                    boolean z8 = this.f10199D.f10232c;
                    aVar.f10215d = z8;
                    if (z8) {
                        aVar.f10214c = this.f10206u.getEndAfterPadding() - this.f10199D.f10231b;
                    } else {
                        aVar.f10214c = this.f10206u.getStartAfterPadding() + this.f10199D.f10231b;
                    }
                    return true;
                }
                if (this.f10197B != Integer.MIN_VALUE) {
                    boolean z9 = this.f10209x;
                    aVar.f10215d = z9;
                    if (z9) {
                        aVar.f10214c = this.f10206u.getEndAfterPadding() - this.f10197B;
                    } else {
                        aVar.f10214c = this.f10206u.getStartAfterPadding() + this.f10197B;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.f10196A);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f10215d = (this.f10196A < getPosition(getChildAt(0))) == this.f10209x;
                    }
                    aVar.a();
                } else {
                    if (this.f10206u.getDecoratedMeasurement(viewFindViewByPosition) > this.f10206u.getTotalSpace()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f10206u.getDecoratedStart(viewFindViewByPosition) - this.f10206u.getStartAfterPadding() < 0) {
                        aVar.f10214c = this.f10206u.getStartAfterPadding();
                        aVar.f10215d = false;
                        return true;
                    }
                    if (this.f10206u.getEndAfterPadding() - this.f10206u.getDecoratedEnd(viewFindViewByPosition) < 0) {
                        aVar.f10214c = this.f10206u.getEndAfterPadding();
                        aVar.f10215d = true;
                        return true;
                    }
                    aVar.f10214c = aVar.f10215d ? this.f10206u.getDecoratedEnd(viewFindViewByPosition) + this.f10206u.getTotalSpaceChange() : this.f10206u.getDecoratedStart(viewFindViewByPosition);
                }
                return true;
            }
            this.f10196A = -1;
            this.f10197B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void h0(RecyclerView.w wVar, RecyclerView.B b9, a aVar) {
        if (g0(b9, aVar) || f0(wVar, b9, aVar)) {
            return;
        }
        aVar.a();
        aVar.f10213b = this.f10210y ? b9.getItemCount() - 1 : 0;
    }

    private void i0(int i8, int i9, boolean z8, RecyclerView.B b9) {
        int startAfterPadding;
        this.f10205t.f10229m = c0();
        this.f10205t.f10222f = i8;
        int[] iArr = this.f10203H;
        iArr[0] = 0;
        iArr[1] = 0;
        x(b9, iArr);
        int iMax = Math.max(0, this.f10203H[0]);
        int iMax2 = Math.max(0, this.f10203H[1]);
        boolean z9 = i8 == 1;
        c cVar = this.f10205t;
        int i10 = z9 ? iMax2 : iMax;
        cVar.f10224h = i10;
        if (!z9) {
            iMax = iMax2;
        }
        cVar.f10225i = iMax;
        if (z9) {
            cVar.f10224h = i10 + this.f10206u.getEndPadding();
            View viewR = R();
            c cVar2 = this.f10205t;
            cVar2.f10221e = this.f10209x ? -1 : 1;
            int position = getPosition(viewR);
            c cVar3 = this.f10205t;
            cVar2.f10220d = position + cVar3.f10221e;
            cVar3.f10218b = this.f10206u.getDecoratedEnd(viewR);
            startAfterPadding = this.f10206u.getDecoratedEnd(viewR) - this.f10206u.getEndAfterPadding();
        } else {
            View viewS = S();
            this.f10205t.f10224h += this.f10206u.getStartAfterPadding();
            c cVar4 = this.f10205t;
            cVar4.f10221e = this.f10209x ? 1 : -1;
            int position2 = getPosition(viewS);
            c cVar5 = this.f10205t;
            cVar4.f10220d = position2 + cVar5.f10221e;
            cVar5.f10218b = this.f10206u.getDecoratedStart(viewS);
            startAfterPadding = (-this.f10206u.getDecoratedStart(viewS)) + this.f10206u.getStartAfterPadding();
        }
        c cVar6 = this.f10205t;
        cVar6.f10219c = i9;
        if (z8) {
            cVar6.f10219c = i9 - startAfterPadding;
        }
        cVar6.f10223g = startAfterPadding;
    }

    private void j0(int i8, int i9) {
        this.f10205t.f10219c = this.f10206u.getEndAfterPadding() - i9;
        c cVar = this.f10205t;
        cVar.f10221e = this.f10209x ? -1 : 1;
        cVar.f10220d = i8;
        cVar.f10222f = 1;
        cVar.f10218b = i9;
        cVar.f10223g = Integer.MIN_VALUE;
    }

    private void k0(a aVar) {
        j0(aVar.f10213b, aVar.f10214c);
    }

    private void l0(int i8, int i9) {
        this.f10205t.f10219c = i9 - this.f10206u.getStartAfterPadding();
        c cVar = this.f10205t;
        cVar.f10220d = i8;
        cVar.f10221e = this.f10209x ? 1 : -1;
        cVar.f10222f = -1;
        cVar.f10218b = i9;
        cVar.f10223g = Integer.MIN_VALUE;
    }

    private void m0(a aVar) {
        l0(aVar.f10213b, aVar.f10214c);
    }

    private int z(RecyclerView.B b9) {
        if (getChildCount() == 0) {
            return 0;
        }
        E();
        return m.a(b9, this.f10206u, I(!this.f10211z, true), H(!this.f10211z, true), this, this.f10211z);
    }

    int C(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 17 ? i8 != 33 ? i8 != 66 ? (i8 == 130 && this.f10204s == 1) ? 1 : Integer.MIN_VALUE : this.f10204s == 0 ? 1 : Integer.MIN_VALUE : this.f10204s == 1 ? -1 : Integer.MIN_VALUE : this.f10204s == 0 ? -1 : Integer.MIN_VALUE : (this.f10204s != 1 && U()) ? -1 : 1 : (this.f10204s != 1 && U()) ? 1 : -1;
    }

    c D() {
        return new c();
    }

    void E() {
        if (this.f10205t == null) {
            this.f10205t = D();
        }
    }

    int F(RecyclerView.w wVar, c cVar, RecyclerView.B b9, boolean z8) {
        int i8 = cVar.f10219c;
        int i9 = cVar.f10223g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                cVar.f10223g = i9 + i8;
            }
            Y(wVar, cVar);
        }
        int i10 = cVar.f10219c + cVar.f10224h;
        b bVar = this.f10201F;
        while (true) {
            if ((!cVar.f10229m && i10 <= 0) || !cVar.a(b9)) {
                break;
            }
            bVar.a();
            V(wVar, b9, cVar, bVar);
            if (!bVar.mFinished) {
                cVar.f10218b += bVar.mConsumed * cVar.f10222f;
                if (!bVar.mIgnoreConsumed || cVar.f10228l != null || !b9.isPreLayout()) {
                    int i11 = cVar.f10219c;
                    int i12 = bVar.mConsumed;
                    cVar.f10219c = i11 - i12;
                    i10 -= i12;
                }
                int i13 = cVar.f10223g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + bVar.mConsumed;
                    cVar.f10223g = i14;
                    int i15 = cVar.f10219c;
                    if (i15 < 0) {
                        cVar.f10223g = i14 + i15;
                    }
                    Y(wVar, cVar);
                }
                if (z8 && bVar.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - cVar.f10219c;
    }

    View H(boolean z8, boolean z9) {
        return this.f10209x ? L(0, getChildCount(), z8, z9) : L(getChildCount() - 1, -1, z8, z9);
    }

    View I(boolean z8, boolean z9) {
        return this.f10209x ? L(getChildCount() - 1, -1, z8, z9) : L(0, getChildCount(), z8, z9);
    }

    View K(int i8, int i9) {
        int i10;
        int i11;
        E();
        if (i9 <= i8 && i9 >= i8) {
            return getChildAt(i8);
        }
        if (this.f10206u.getDecoratedStart(getChildAt(i8)) < this.f10206u.getStartAfterPadding()) {
            i10 = 16644;
            i11 = 16388;
        } else {
            i10 = 4161;
            i11 = x.TRANSIT_FRAGMENT_OPEN;
        }
        return this.f10204s == 0 ? this.f10396e.a(i8, i9, i10, i11) : this.f10397f.a(i8, i9, i10, i11);
    }

    View L(int i8, int i9, boolean z8, boolean z9) {
        E();
        int i10 = z8 ? 24579 : 320;
        int i11 = z9 ? 320 : 0;
        return this.f10204s == 0 ? this.f10396e.a(i8, i9, i10, i11) : this.f10397f.a(i8, i9, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View O(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.B r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.E()
            int r1 = r16.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.getItemCount()
            androidx.recyclerview.widget.j r7 = r0.f10206u
            int r7 = r7.getStartAfterPadding()
            androidx.recyclerview.widget.j r8 = r0.f10206u
            int r8 = r8.getEndAfterPadding()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.j r14 = r0.f10206u
            int r14 = r14.getDecoratedStart(r12)
            androidx.recyclerview.widget.j r15 = r0.f10206u
            int r15 = r15.getDecoratedEnd(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.isItemRemoved()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.O(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean, boolean):android.view.View");
    }

    protected int T(RecyclerView.B b9) {
        if (b9.hasTargetScrollPosition()) {
            return this.f10206u.getTotalSpace();
        }
        return 0;
    }

    protected boolean U() {
        return getLayoutDirection() == 1;
    }

    void V(RecyclerView.w wVar, RecyclerView.B b9, c cVar, b bVar) {
        int i8;
        int i9;
        int i10;
        int paddingLeft;
        int decoratedMeasurementInOther;
        View viewB = cVar.b(wVar);
        if (viewB == null) {
            bVar.mFinished = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewB.getLayoutParams();
        if (cVar.f10228l == null) {
            if (this.f10209x == (cVar.f10222f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.f10209x == (cVar.f10222f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        bVar.mConsumed = this.f10206u.getDecoratedMeasurement(viewB);
        if (this.f10204s == 1) {
            if (U()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                paddingLeft = decoratedMeasurementInOther - this.f10206u.getDecoratedMeasurementInOther(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                decoratedMeasurementInOther = this.f10206u.getDecoratedMeasurementInOther(viewB) + paddingLeft;
            }
            if (cVar.f10222f == -1) {
                int i11 = cVar.f10218b;
                i10 = i11;
                i9 = decoratedMeasurementInOther;
                i8 = i11 - bVar.mConsumed;
            } else {
                int i12 = cVar.f10218b;
                i8 = i12;
                i9 = decoratedMeasurementInOther;
                i10 = bVar.mConsumed + i12;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.f10206u.getDecoratedMeasurementInOther(viewB) + paddingTop;
            if (cVar.f10222f == -1) {
                int i13 = cVar.f10218b;
                i9 = i13;
                i8 = paddingTop;
                i10 = decoratedMeasurementInOther2;
                paddingLeft = i13 - bVar.mConsumed;
            } else {
                int i14 = cVar.f10218b;
                i8 = paddingTop;
                i9 = bVar.mConsumed + i14;
                i10 = decoratedMeasurementInOther2;
                paddingLeft = i14;
            }
        }
        layoutDecoratedWithMargins(viewB, paddingLeft, i8, i9, i10);
        if (qVar.isItemRemoved() || qVar.isItemChanged()) {
            bVar.mIgnoreConsumed = true;
        }
        bVar.mFocusable = viewB.hasFocusable();
    }

    void X(RecyclerView.w wVar, RecyclerView.B b9, a aVar, int i8) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f10199D == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    boolean c0() {
        return this.f10206u.getMode() == 0 && this.f10206u.getEnd() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.f10204s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f10204s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i8, int i9, RecyclerView.B b9, RecyclerView.p.c cVar) {
        if (this.f10204s != 0) {
            i8 = i9;
        }
        if (getChildCount() == 0 || i8 == 0) {
            return;
        }
        E();
        i0(i8 > 0 ? 1 : -1, Math.abs(i8), true, b9);
        y(b9, this.f10205t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectInitialPrefetchPositions(int i8, RecyclerView.p.c cVar) {
        boolean z8;
        int i9;
        d dVar = this.f10199D;
        if (dVar == null || !dVar.b()) {
            d0();
            z8 = this.f10209x;
            i9 = this.f10196A;
            if (i9 == -1) {
                i9 = z8 ? i8 - 1 : 0;
            }
        } else {
            d dVar2 = this.f10199D;
            z8 = dVar2.f10232c;
            i9 = dVar2.f10230a;
        }
        int i10 = z8 ? -1 : 1;
        for (int i11 = 0; i11 < this.f10202G && i9 >= 0 && i9 < i8; i11++) {
            cVar.addPosition(i9, 0);
            i9 += i10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.B b9) {
        return z(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.B b9) {
        return A(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.B b9) {
        return B(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF computeScrollVectorForPosition(int i8) {
        if (getChildCount() == 0) {
            return null;
        }
        int i9 = (i8 < getPosition(getChildAt(0))) != this.f10209x ? -1 : 1;
        return this.f10204s == 0 ? new PointF(i9, 0.0f) : new PointF(0.0f, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.B b9) {
        return z(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.B b9) {
        return A(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.B b9) {
        return B(b9);
    }

    int e0(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        if (getChildCount() == 0 || i8 == 0) {
            return 0;
        }
        E();
        this.f10205t.f10217a = true;
        int i9 = i8 > 0 ? 1 : -1;
        int iAbs = Math.abs(i8);
        i0(i9, iAbs, true, b9);
        c cVar = this.f10205t;
        int iF = cVar.f10223g + F(wVar, cVar, b9, false);
        if (iF < 0) {
            return 0;
        }
        if (iAbs > iF) {
            i8 = i9 * iF;
        }
        this.f10206u.offsetChildren(-i8);
        this.f10205t.f10227k = i8;
        return i8;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewL = L(0, getChildCount(), true, false);
        if (viewL == null) {
            return -1;
        }
        return getPosition(viewL);
    }

    public int findFirstVisibleItemPosition() {
        View viewL = L(0, getChildCount(), false, true);
        if (viewL == null) {
            return -1;
        }
        return getPosition(viewL);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewL = L(getChildCount() - 1, -1, true, false);
        if (viewL == null) {
            return -1;
        }
        return getPosition(viewL);
    }

    public int findLastVisibleItemPosition() {
        View viewL = L(getChildCount() - 1, -1, false, true);
        if (viewL == null) {
            return -1;
        }
        return getPosition(viewL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View findViewByPosition(int i8) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i8 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i8) {
                return childAt;
            }
        }
        return super.findViewByPosition(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    public int getInitialPrefetchItemCount() {
        return this.f10202G;
    }

    public int getOrientation() {
        return this.f10204s;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.f10198C;
    }

    public boolean getReverseLayout() {
        return this.f10208w;
    }

    public boolean getStackFromEnd() {
        return this.f10210y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.f10211z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.f10198C) {
            removeAndRecycleAllViews(wVar);
            wVar.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        int iC;
        d0();
        if (getChildCount() == 0 || (iC = C(i8)) == Integer.MIN_VALUE) {
            return null;
        }
        E();
        i0(iC, (int) (this.f10206u.getTotalSpace() * 0.33333334f), false, b9);
        c cVar = this.f10205t;
        cVar.f10223g = Integer.MIN_VALUE;
        cVar.f10217a = false;
        F(wVar, cVar, b9, true);
        View viewN = iC == -1 ? N() : M();
        View viewS = iC == -1 ? S() : R();
        if (!viewS.hasFocusable()) {
            return viewN;
        }
        if (viewN == null) {
            return null;
        }
        return viewS;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.B b9) {
        int i8;
        int i9;
        int i10;
        int i11;
        int iP;
        int i12;
        View viewFindViewByPosition;
        int decoratedStart;
        int endAfterPadding;
        int i13 = -1;
        if (!(this.f10199D == null && this.f10196A == -1) && b9.getItemCount() == 0) {
            removeAndRecycleAllViews(wVar);
            return;
        }
        d dVar = this.f10199D;
        if (dVar != null && dVar.b()) {
            this.f10196A = this.f10199D.f10230a;
        }
        E();
        this.f10205t.f10217a = false;
        d0();
        View focusedChild = getFocusedChild();
        a aVar = this.f10200E;
        if (!aVar.f10216e || this.f10196A != -1 || this.f10199D != null) {
            aVar.c();
            a aVar2 = this.f10200E;
            aVar2.f10215d = this.f10209x ^ this.f10210y;
            h0(wVar, b9, aVar2);
            this.f10200E.f10216e = true;
        } else if (focusedChild != null && (this.f10206u.getDecoratedStart(focusedChild) >= this.f10206u.getEndAfterPadding() || this.f10206u.getDecoratedEnd(focusedChild) <= this.f10206u.getStartAfterPadding())) {
            this.f10200E.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.f10205t;
        cVar.f10222f = cVar.f10227k >= 0 ? 1 : -1;
        int[] iArr = this.f10203H;
        iArr[0] = 0;
        iArr[1] = 0;
        x(b9, iArr);
        int iMax = Math.max(0, this.f10203H[0]) + this.f10206u.getStartAfterPadding();
        int iMax2 = Math.max(0, this.f10203H[1]) + this.f10206u.getEndPadding();
        if (b9.isPreLayout() && (i12 = this.f10196A) != -1 && this.f10197B != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i12)) != null) {
            if (this.f10209x) {
                endAfterPadding = this.f10206u.getEndAfterPadding() - this.f10206u.getDecoratedEnd(viewFindViewByPosition);
                decoratedStart = this.f10197B;
            } else {
                decoratedStart = this.f10206u.getDecoratedStart(viewFindViewByPosition) - this.f10206u.getStartAfterPadding();
                endAfterPadding = this.f10197B;
            }
            int i14 = endAfterPadding - decoratedStart;
            if (i14 > 0) {
                iMax += i14;
            } else {
                iMax2 -= i14;
            }
        }
        a aVar3 = this.f10200E;
        if (!aVar3.f10215d ? !this.f10209x : this.f10209x) {
            i13 = 1;
        }
        X(wVar, b9, aVar3, i13);
        detachAndScrapAttachedViews(wVar);
        this.f10205t.f10229m = c0();
        this.f10205t.f10226j = b9.isPreLayout();
        this.f10205t.f10225i = 0;
        a aVar4 = this.f10200E;
        if (aVar4.f10215d) {
            m0(aVar4);
            c cVar2 = this.f10205t;
            cVar2.f10224h = iMax;
            F(wVar, cVar2, b9, false);
            c cVar3 = this.f10205t;
            i9 = cVar3.f10218b;
            int i15 = cVar3.f10220d;
            int i16 = cVar3.f10219c;
            if (i16 > 0) {
                iMax2 += i16;
            }
            k0(this.f10200E);
            c cVar4 = this.f10205t;
            cVar4.f10224h = iMax2;
            cVar4.f10220d += cVar4.f10221e;
            F(wVar, cVar4, b9, false);
            c cVar5 = this.f10205t;
            i8 = cVar5.f10218b;
            int i17 = cVar5.f10219c;
            if (i17 > 0) {
                l0(i15, i9);
                c cVar6 = this.f10205t;
                cVar6.f10224h = i17;
                F(wVar, cVar6, b9, false);
                i9 = this.f10205t.f10218b;
            }
        } else {
            k0(aVar4);
            c cVar7 = this.f10205t;
            cVar7.f10224h = iMax2;
            F(wVar, cVar7, b9, false);
            c cVar8 = this.f10205t;
            i8 = cVar8.f10218b;
            int i18 = cVar8.f10220d;
            int i19 = cVar8.f10219c;
            if (i19 > 0) {
                iMax += i19;
            }
            m0(this.f10200E);
            c cVar9 = this.f10205t;
            cVar9.f10224h = iMax;
            cVar9.f10220d += cVar9.f10221e;
            F(wVar, cVar9, b9, false);
            c cVar10 = this.f10205t;
            i9 = cVar10.f10218b;
            int i20 = cVar10.f10219c;
            if (i20 > 0) {
                j0(i18, i8);
                c cVar11 = this.f10205t;
                cVar11.f10224h = i20;
                F(wVar, cVar11, b9, false);
                i8 = this.f10205t.f10218b;
            }
        }
        if (getChildCount() > 0) {
            if (this.f10209x ^ this.f10210y) {
                int iP2 = P(i8, wVar, b9, true);
                i10 = i9 + iP2;
                i11 = i8 + iP2;
                iP = Q(i10, wVar, b9, false);
            } else {
                int iQ = Q(i9, wVar, b9, true);
                i10 = i9 + iQ;
                i11 = i8 + iQ;
                iP = P(i11, wVar, b9, false);
            }
            i9 = i10 + iP;
            i8 = i11 + iP;
        }
        W(wVar, b9, i9, i8);
        if (b9.isPreLayout()) {
            this.f10200E.c();
        } else {
            this.f10206u.onLayoutComplete();
        }
        this.f10207v = this.f10210y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.B b9) {
        super.onLayoutCompleted(b9);
        this.f10199D = null;
        this.f10196A = -1;
        this.f10197B = Integer.MIN_VALUE;
        this.f10200E.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f10199D = dVar;
            if (this.f10196A != -1) {
                dVar.c();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        if (this.f10199D != null) {
            return new d(this.f10199D);
        }
        d dVar = new d();
        if (getChildCount() > 0) {
            E();
            boolean z8 = this.f10207v ^ this.f10209x;
            dVar.f10232c = z8;
            if (z8) {
                View viewR = R();
                dVar.f10231b = this.f10206u.getEndAfterPadding() - this.f10206u.getDecoratedEnd(viewR);
                dVar.f10230a = getPosition(viewR);
            } else {
                View viewS = S();
                dVar.f10230a = getPosition(viewS);
                dVar.f10231b = this.f10206u.getDecoratedStart(viewS) - this.f10206u.getStartAfterPadding();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.f
    public void prepareForDrop(View view, View view2, int i8, int i9) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        E();
        d0();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c9 = position < position2 ? (char) 1 : (char) 65535;
        if (this.f10209x) {
            if (c9 == 1) {
                scrollToPositionWithOffset(position2, this.f10206u.getEndAfterPadding() - (this.f10206u.getDecoratedStart(view2) + this.f10206u.getDecoratedMeasurement(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.f10206u.getEndAfterPadding() - this.f10206u.getDecoratedEnd(view2));
                return;
            }
        }
        if (c9 == 65535) {
            scrollToPositionWithOffset(position2, this.f10206u.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.f10206u.getDecoratedEnd(view2) - this.f10206u.getDecoratedMeasurement(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        if (this.f10204s == 1) {
            return 0;
        }
        return e0(i8, wVar, b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i8) {
        this.f10196A = i8;
        this.f10197B = Integer.MIN_VALUE;
        d dVar = this.f10199D;
        if (dVar != null) {
            dVar.c();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i8, int i9) {
        this.f10196A = i8;
        this.f10197B = i9;
        d dVar = this.f10199D;
        if (dVar != null) {
            dVar.c();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        if (this.f10204s == 0) {
            return 0;
        }
        return e0(i8, wVar, b9);
    }

    public void setInitialPrefetchItemCount(int i8) {
        this.f10202G = i8;
    }

    public void setOrientation(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i8);
        }
        assertNotInLayoutOrScroll(null);
        if (i8 != this.f10204s || this.f10206u == null) {
            j jVarCreateOrientationHelper = j.createOrientationHelper(this, i8);
            this.f10206u = jVarCreateOrientationHelper;
            this.f10200E.f10212a = jVarCreateOrientationHelper;
            this.f10204s = i8;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z8) {
        this.f10198C = z8;
    }

    public void setReverseLayout(boolean z8) {
        assertNotInLayoutOrScroll(null);
        if (z8 == this.f10208w) {
            return;
        }
        this.f10208w = z8;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z8) {
        this.f10211z = z8;
    }

    public void setStackFromEnd(boolean z8) {
        assertNotInLayoutOrScroll(null);
        if (this.f10210y == z8) {
            return;
        }
        this.f10210y = z8;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.B b9, int i8) {
        h hVar = new h(recyclerView.getContext());
        hVar.setTargetPosition(i8);
        startSmoothScroll(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f10199D == null && this.f10207v == this.f10210y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean u() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !f()) ? false : true;
    }

    protected void x(RecyclerView.B b9, int[] iArr) {
        int i8;
        int iT = T(b9);
        if (this.f10205t.f10222f == -1) {
            i8 = 0;
        } else {
            i8 = iT;
            iT = 0;
        }
        iArr[0] = iT;
        iArr[1] = i8;
    }

    void y(RecyclerView.B b9, c cVar, RecyclerView.p.c cVar2) {
        int i8 = cVar.f10220d;
        if (i8 < 0 || i8 >= b9.getItemCount()) {
            return;
        }
        cVar2.addPosition(i8, Math.max(0, cVar.f10223g));
    }

    public LinearLayoutManager(Context context, int i8, boolean z8) {
        this.f10204s = 1;
        this.f10208w = false;
        this.f10209x = false;
        this.f10210y = false;
        this.f10211z = true;
        this.f10196A = -1;
        this.f10197B = Integer.MIN_VALUE;
        this.f10199D = null;
        this.f10200E = new a();
        this.f10201F = new b();
        this.f10202G = 2;
        this.f10203H = new int[2];
        setOrientation(i8);
        setReverseLayout(z8);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f10204s = 1;
        this.f10208w = false;
        this.f10209x = false;
        this.f10210y = false;
        this.f10211z = true;
        this.f10196A = -1;
        this.f10197B = Integer.MIN_VALUE;
        this.f10199D = null;
        this.f10200E = new a();
        this.f10201F = new b();
        this.f10202G = 2;
        this.f10203H = new int[2];
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i8, i9);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }
}
