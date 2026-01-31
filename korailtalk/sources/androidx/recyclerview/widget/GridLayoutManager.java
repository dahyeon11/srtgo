package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.H;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final int DEFAULT_SPAN_COUNT = -1;

    /* renamed from: I */
    boolean f10181I;

    /* renamed from: J */
    int f10182J;

    /* renamed from: K */
    int[] f10183K;

    /* renamed from: L */
    View[] f10184L;

    /* renamed from: M */
    final SparseIntArray f10185M;

    /* renamed from: N */
    final SparseIntArray f10186N;

    /* renamed from: O */
    c f10187O;

    /* renamed from: P */
    final Rect f10188P;

    /* renamed from: Q */
    private boolean f10189Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanIndex(int i8, int i9) {
            return i8 % i9;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i8) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a */
        final SparseIntArray f10192a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f10193b = new SparseIntArray();

        /* renamed from: c */
        private boolean f10194c = false;

        /* renamed from: d */
        private boolean f10195d = false;

        static int a(SparseIntArray sparseIntArray, int i8) {
            int size = sparseIntArray.size() - 1;
            int i9 = 0;
            while (i9 <= size) {
                int i10 = (i9 + size) >>> 1;
                if (sparseIntArray.keyAt(i10) < i8) {
                    i9 = i10 + 1;
                } else {
                    size = i10 - 1;
                }
            }
            int i11 = i9 - 1;
            if (i11 < 0 || i11 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i11);
        }

        int b(int i8, int i9) {
            if (!this.f10195d) {
                return getSpanGroupIndex(i8, i9);
            }
            int i10 = this.f10193b.get(i8, -1);
            if (i10 != -1) {
                return i10;
            }
            int spanGroupIndex = getSpanGroupIndex(i8, i9);
            this.f10193b.put(i8, spanGroupIndex);
            return spanGroupIndex;
        }

        int c(int i8, int i9) {
            if (!this.f10194c) {
                return getSpanIndex(i8, i9);
            }
            int i10 = this.f10192a.get(i8, -1);
            if (i10 != -1) {
                return i10;
            }
            int spanIndex = getSpanIndex(i8, i9);
            this.f10192a.put(i8, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i8, int i9) {
            int i10;
            int i11;
            int iC;
            int iA;
            if (!this.f10195d || (iA = a(this.f10193b, i8)) == -1) {
                i10 = 0;
                i11 = 0;
                iC = 0;
            } else {
                i10 = this.f10193b.get(iA);
                i11 = iA + 1;
                iC = c(iA, i9) + getSpanSize(iA);
                if (iC == i9) {
                    i10++;
                    iC = 0;
                }
            }
            int spanSize = getSpanSize(i8);
            while (i11 < i8) {
                int spanSize2 = getSpanSize(i11);
                iC += spanSize2;
                if (iC == i9) {
                    i10++;
                    iC = 0;
                } else if (iC > i9) {
                    i10++;
                    iC = spanSize2;
                }
                i11++;
            }
            return iC + spanSize > i9 ? i10 + 1 : i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x002b -> B:39:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x002d -> B:39:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x002f -> B:39:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f10194c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f10192a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f10192a
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i8);

        public void invalidateSpanGroupIndexCache() {
            this.f10193b.clear();
        }

        public void invalidateSpanIndexCache() {
            this.f10192a.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.f10195d;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.f10194c;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z8) {
            if (!z8) {
                this.f10193b.clear();
            }
            this.f10195d = z8;
        }

        public void setSpanIndexCacheEnabled(boolean z8) {
            if (!z8) {
                this.f10193b.clear();
            }
            this.f10194c = z8;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10181I = false;
        this.f10182J = -1;
        this.f10185M = new SparseIntArray();
        this.f10186N = new SparseIntArray();
        this.f10187O = new a();
        this.f10188P = new Rect();
        setSpanCount(RecyclerView.p.getProperties(context, attributeSet, i8, i9).spanCount);
    }

    private void A0(float f8, int i8) {
        p0(Math.max(Math.round(f8 * this.f10182J), i8));
    }

    private void B0(View view, int i8, boolean z8) {
        int childMeasureSpec;
        int childMeasureSpec2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f10413b;
        int i9 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i10 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW0 = w0(bVar.f10190e, bVar.f10191f);
        if (this.f10204s == 1) {
            childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(iW0, i8, i10, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            childMeasureSpec = RecyclerView.p.getChildMeasureSpec(this.f10206u.getTotalSpace(), getHeightMode(), i9, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.p.getChildMeasureSpec(iW0, i8, i9, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec4 = RecyclerView.p.getChildMeasureSpec(this.f10206u.getTotalSpace(), getWidthMode(), i10, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        C0(view, childMeasureSpec2, childMeasureSpec, z8);
    }

    private void C0(View view, int i8, int i9, boolean z8) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z8 ? v(view, i8, i9, qVar) : t(view, i8, i9, qVar)) {
            view.measure(i8, i9);
        }
    }

    private void D0() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        p0(height - paddingTop);
    }

    private void n0(RecyclerView.w wVar, RecyclerView.B b9, int i8, boolean z8) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        if (z8) {
            i11 = 1;
            i10 = i8;
            i9 = 0;
        } else {
            i9 = i8 - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i9 != i10) {
            View view = this.f10184L[i9];
            b bVar = (b) view.getLayoutParams();
            int iZ0 = z0(wVar, b9, getPosition(view));
            bVar.f10191f = iZ0;
            bVar.f10190e = i12;
            i12 += iZ0;
            i9 += i11;
        }
    }

    private void o0() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            b bVar = (b) getChildAt(i8).getLayoutParams();
            int viewLayoutPosition = bVar.getViewLayoutPosition();
            this.f10185M.put(viewLayoutPosition, bVar.getSpanSize());
            this.f10186N.put(viewLayoutPosition, bVar.getSpanIndex());
        }
    }

    private void p0(int i8) {
        this.f10183K = q0(this.f10183K, this.f10182J, i8);
    }

    static int[] q0(int[] iArr, int i8, int i9) {
        int i10;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i9) {
            iArr = new int[i8 + 1];
        }
        int i11 = 0;
        iArr[0] = 0;
        int i12 = i9 / i8;
        int i13 = i9 % i8;
        int i14 = 0;
        for (int i15 = 1; i15 <= i8; i15++) {
            i11 += i13;
            if (i11 <= 0 || i8 - i11 >= i13) {
                i10 = i12;
            } else {
                i10 = i12 + 1;
                i11 -= i8;
            }
            i14 += i10;
            iArr[i15] = i14;
        }
        return iArr;
    }

    private void r0() {
        this.f10185M.clear();
        this.f10186N.clear();
    }

    private int s0(RecyclerView.B b9) {
        if (getChildCount() != 0 && b9.getItemCount() != 0) {
            E();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewI = I(!zIsSmoothScrollbarEnabled, true);
            View viewH = H(!zIsSmoothScrollbarEnabled, true);
            if (viewI != null && viewH != null) {
                int iB = this.f10187O.b(getPosition(viewI), this.f10182J);
                int iB2 = this.f10187O.b(getPosition(viewH), this.f10182J);
                int iMax = this.f10209x ? Math.max(0, ((this.f10187O.b(b9.getItemCount() - 1, this.f10182J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.f10206u.getDecoratedEnd(viewH) - this.f10206u.getDecoratedStart(viewI)) / ((this.f10187O.b(getPosition(viewH), this.f10182J) - this.f10187O.b(getPosition(viewI), this.f10182J)) + 1))) + (this.f10206u.getStartAfterPadding() - this.f10206u.getDecoratedStart(viewI)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int t0(RecyclerView.B b9) {
        if (getChildCount() != 0 && b9.getItemCount() != 0) {
            E();
            View viewI = I(!isSmoothScrollbarEnabled(), true);
            View viewH = H(!isSmoothScrollbarEnabled(), true);
            if (viewI != null && viewH != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f10187O.b(b9.getItemCount() - 1, this.f10182J) + 1;
                }
                int decoratedEnd = this.f10206u.getDecoratedEnd(viewH) - this.f10206u.getDecoratedStart(viewI);
                int iB = this.f10187O.b(getPosition(viewI), this.f10182J);
                return (int) ((decoratedEnd / ((this.f10187O.b(getPosition(viewH), this.f10182J) - iB) + 1)) * (this.f10187O.b(b9.getItemCount() - 1, this.f10182J) + 1));
            }
        }
        return 0;
    }

    private void u0(RecyclerView.w wVar, RecyclerView.B b9, LinearLayoutManager.a aVar, int i8) {
        boolean z8 = i8 == 1;
        int iY0 = y0(wVar, b9, aVar.f10213b);
        if (z8) {
            while (iY0 > 0) {
                int i9 = aVar.f10213b;
                if (i9 <= 0) {
                    return;
                }
                int i10 = i9 - 1;
                aVar.f10213b = i10;
                iY0 = y0(wVar, b9, i10);
            }
            return;
        }
        int itemCount = b9.getItemCount() - 1;
        int i11 = aVar.f10213b;
        while (i11 < itemCount) {
            int i12 = i11 + 1;
            int iY02 = y0(wVar, b9, i12);
            if (iY02 <= iY0) {
                break;
            }
            i11 = i12;
            iY0 = iY02;
        }
        aVar.f10213b = i11;
    }

    private void v0() {
        View[] viewArr = this.f10184L;
        if (viewArr == null || viewArr.length != this.f10182J) {
            this.f10184L = new View[this.f10182J];
        }
    }

    private int x0(RecyclerView.w wVar, RecyclerView.B b9, int i8) {
        if (!b9.isPreLayout()) {
            return this.f10187O.b(i8, this.f10182J);
        }
        int iConvertPreLayoutPositionToPostLayout = wVar.convertPreLayoutPositionToPostLayout(i8);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.f10187O.b(iConvertPreLayoutPositionToPostLayout, this.f10182J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i8);
        return 0;
    }

    private int y0(RecyclerView.w wVar, RecyclerView.B b9, int i8) {
        if (!b9.isPreLayout()) {
            return this.f10187O.c(i8, this.f10182J);
        }
        int i9 = this.f10186N.get(i8, -1);
        if (i9 != -1) {
            return i9;
        }
        int iConvertPreLayoutPositionToPostLayout = wVar.convertPreLayoutPositionToPostLayout(i8);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.f10187O.c(iConvertPreLayoutPositionToPostLayout, this.f10182J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
        return 0;
    }

    private int z0(RecyclerView.w wVar, RecyclerView.B b9, int i8) {
        if (!b9.isPreLayout()) {
            return this.f10187O.getSpanSize(i8);
        }
        int i9 = this.f10185M.get(i8, -1);
        if (i9 != -1) {
            return i9;
        }
        int iConvertPreLayoutPositionToPostLayout = wVar.convertPreLayoutPositionToPostLayout(i8);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.f10187O.getSpanSize(iConvertPreLayoutPositionToPostLayout);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View O(RecyclerView.w wVar, RecyclerView.B b9, boolean z8, boolean z9) {
        int i8;
        int childCount;
        int childCount2 = getChildCount();
        int i9 = 1;
        if (z9) {
            childCount = getChildCount() - 1;
            i8 = -1;
            i9 = -1;
        } else {
            i8 = childCount2;
            childCount = 0;
        }
        int itemCount = b9.getItemCount();
        E();
        int startAfterPadding = this.f10206u.getStartAfterPadding();
        int endAfterPadding = this.f10206u.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i8) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && y0(wVar, b9, position) == 0) {
                if (((RecyclerView.q) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f10206u.getDecoratedStart(childAt) < endAfterPadding && this.f10206u.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i9;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void V(RecyclerView.w wVar, RecyclerView.B b9, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int decoratedMeasurementInOther;
        int decoratedMeasurementInOther2;
        int decoratedMeasurementInOther3;
        int i15;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewB;
        int modeInOther = this.f10206u.getModeInOther();
        boolean z8 = modeInOther != 1073741824;
        int i16 = getChildCount() > 0 ? this.f10183K[this.f10182J] : 0;
        if (z8) {
            D0();
        }
        boolean z9 = cVar.f10221e == 1;
        int iY0 = this.f10182J;
        if (!z9) {
            iY0 = y0(wVar, b9, cVar.f10220d) + z0(wVar, b9, cVar.f10220d);
        }
        int i17 = 0;
        while (i17 < this.f10182J && cVar.a(b9) && iY0 > 0) {
            int i18 = cVar.f10220d;
            int iZ0 = z0(wVar, b9, i18);
            if (iZ0 > this.f10182J) {
                throw new IllegalArgumentException("Item at position " + i18 + " requires " + iZ0 + " spans but GridLayoutManager has only " + this.f10182J + " spans.");
            }
            iY0 -= iZ0;
            if (iY0 < 0 || (viewB = cVar.b(wVar)) == null) {
                break;
            }
            this.f10184L[i17] = viewB;
            i17++;
        }
        if (i17 == 0) {
            bVar.mFinished = true;
            return;
        }
        n0(wVar, b9, i17, z9);
        float f8 = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < i17; i20++) {
            View view = this.f10184L[i20];
            if (cVar.f10228l == null) {
                if (z9) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z9) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f10188P);
            B0(view, modeInOther, false);
            int decoratedMeasurement = this.f10206u.getDecoratedMeasurement(view);
            if (decoratedMeasurement > i19) {
                i19 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther4 = (this.f10206u.getDecoratedMeasurementInOther(view) * 1.0f) / ((b) view.getLayoutParams()).f10191f;
            if (decoratedMeasurementInOther4 > f8) {
                f8 = decoratedMeasurementInOther4;
            }
        }
        if (z8) {
            A0(f8, i16);
            i19 = 0;
            for (int i21 = 0; i21 < i17; i21++) {
                View view2 = this.f10184L[i21];
                B0(view2, 1073741824, true);
                int decoratedMeasurement2 = this.f10206u.getDecoratedMeasurement(view2);
                if (decoratedMeasurement2 > i19) {
                    i19 = decoratedMeasurement2;
                }
            }
        }
        for (int i22 = 0; i22 < i17; i22++) {
            View view3 = this.f10184L[i22];
            if (this.f10206u.getDecoratedMeasurement(view3) != i19) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f10413b;
                int i23 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i24 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW0 = w0(bVar2.f10190e, bVar2.f10191f);
                if (this.f10204s == 1) {
                    childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(iW0, 1073741824, i24, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    childMeasureSpec = RecyclerView.p.getChildMeasureSpec(iW0, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                C0(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        bVar.mConsumed = i19;
        if (this.f10204s == 1) {
            if (cVar.f10222f == -1) {
                i13 = cVar.f10218b;
                i15 = i13 - i19;
            } else {
                i15 = cVar.f10218b;
                i13 = i15 + i19;
            }
            i11 = i15;
            i12 = 0;
            i10 = 0;
        } else {
            if (cVar.f10222f == -1) {
                i9 = cVar.f10218b;
                i8 = i9 - i19;
            } else {
                i8 = cVar.f10218b;
                i9 = i8 + i19;
            }
            i10 = i8;
            i11 = 0;
            i12 = i9;
            i13 = 0;
        }
        int i25 = 0;
        while (i25 < i17) {
            View view4 = this.f10184L[i25];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f10204s == 1) {
                if (U()) {
                    int paddingLeft = getPaddingLeft() + this.f10183K[this.f10182J - bVar3.f10190e];
                    decoratedMeasurementInOther3 = i13;
                    decoratedMeasurementInOther = paddingLeft;
                    decoratedMeasurementInOther2 = paddingLeft - this.f10206u.getDecoratedMeasurementInOther(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f10183K[bVar3.f10190e];
                    decoratedMeasurementInOther3 = i13;
                    decoratedMeasurementInOther2 = paddingLeft2;
                    decoratedMeasurementInOther = this.f10206u.getDecoratedMeasurementInOther(view4) + paddingLeft2;
                }
                i14 = i11;
            } else {
                int paddingTop = getPaddingTop() + this.f10183K[bVar3.f10190e];
                i14 = paddingTop;
                decoratedMeasurementInOther = i12;
                decoratedMeasurementInOther2 = i10;
                decoratedMeasurementInOther3 = this.f10206u.getDecoratedMeasurementInOther(view4) + paddingTop;
            }
            layoutDecoratedWithMargins(view4, decoratedMeasurementInOther2, i14, decoratedMeasurementInOther, decoratedMeasurementInOther3);
            if (bVar3.isItemRemoved() || bVar3.isItemChanged()) {
                bVar.mIgnoreConsumed = true;
            }
            bVar.mFocusable |= view4.hasFocusable();
            i25++;
            i13 = decoratedMeasurementInOther3;
            i12 = decoratedMeasurementInOther;
            i10 = decoratedMeasurementInOther2;
            i11 = i14;
        }
        Arrays.fill(this.f10184L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void X(RecyclerView.w wVar, RecyclerView.B b9, LinearLayoutManager.a aVar, int i8) {
        super.X(wVar, b9, aVar, i8);
        D0();
        if (b9.getItemCount() > 0 && !b9.isPreLayout()) {
            u0(wVar, b9, aVar, i8);
        }
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.B b9) {
        return this.f10189Q ? s0(b9) : super.computeHorizontalScrollOffset(b9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.B b9) {
        return this.f10189Q ? t0(b9) : super.computeHorizontalScrollRange(b9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.B b9) {
        return this.f10189Q ? s0(b9) : super.computeVerticalScrollOffset(b9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.B b9) {
        return this.f10189Q ? t0(b9) : super.computeVerticalScrollRange(b9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.f10204s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.B b9) {
        if (this.f10204s == 1) {
            return this.f10182J;
        }
        if (b9.getItemCount() < 1) {
            return 0;
        }
        return x0(wVar, b9, b9.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.B b9) {
        if (this.f10204s == 0) {
            return this.f10182J;
        }
        if (b9.getItemCount() < 1) {
            return 0;
        }
        return x0(wVar, b9, b9.getItemCount() - 1) + 1;
    }

    public int getSpanCount() {
        return this.f10182J;
    }

    public c getSpanSizeLookup() {
        return this.f10187O;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.f10189Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.B r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.B b9, View view, H h8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.j(view, h8);
            return;
        }
        b bVar = (b) layoutParams;
        int iX0 = x0(wVar, b9, bVar.getViewLayoutPosition());
        if (this.f10204s == 0) {
            h8.setCollectionItemInfo(H.f.obtain(bVar.getSpanIndex(), bVar.getSpanSize(), iX0, 1, false, false));
        } else {
            h8.setCollectionItemInfo(H.f.obtain(iX0, 1, bVar.getSpanIndex(), bVar.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i8, int i9) {
        this.f10187O.invalidateSpanIndexCache();
        this.f10187O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f10187O.invalidateSpanIndexCache();
        this.f10187O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i8, int i9, int i10) {
        this.f10187O.invalidateSpanIndexCache();
        this.f10187O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i8, int i9) {
        this.f10187O.invalidateSpanIndexCache();
        this.f10187O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i8, int i9, Object obj) {
        this.f10187O.invalidateSpanIndexCache();
        this.f10187O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.B b9) {
        if (b9.isPreLayout()) {
            o0();
        }
        super.onLayoutChildren(wVar, b9);
        r0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.B b9) {
        super.onLayoutCompleted(b9);
        this.f10181I = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        D0();
        v0();
        return super.scrollHorizontallyBy(i8, wVar, b9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i8, RecyclerView.w wVar, RecyclerView.B b9) {
        D0();
        v0();
        return super.scrollVerticallyBy(i8, wVar, b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i8, int i9) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f10183K == null) {
            super.setMeasuredDimension(rect, i8, i9);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f10204s == 1) {
            iChooseSize2 = RecyclerView.p.chooseSize(i9, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f10183K;
            iChooseSize = RecyclerView.p.chooseSize(i8, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.p.chooseSize(i8, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f10183K;
            iChooseSize2 = RecyclerView.p.chooseSize(i9, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i8) {
        if (i8 == this.f10182J) {
            return;
        }
        this.f10181I = true;
        if (i8 >= 1) {
            this.f10182J = i8;
            this.f10187O.invalidateSpanIndexCache();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i8);
        }
    }

    public void setSpanSizeLookup(c cVar) {
        this.f10187O = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z8) {
        if (z8) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z8) {
        this.f10189Q = z8;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f10199D == null && !this.f10181I;
    }

    int w0(int i8, int i9) {
        if (this.f10204s != 1 || !U()) {
            int[] iArr = this.f10183K;
            return iArr[i9 + i8] - iArr[i8];
        }
        int[] iArr2 = this.f10183K;
        int i10 = this.f10182J;
        return iArr2[i10 - i8] - iArr2[(i10 - i8) - i9];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void y(RecyclerView.B b9, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int spanSize = this.f10182J;
        for (int i8 = 0; i8 < this.f10182J && cVar.a(b9) && spanSize > 0; i8++) {
            int i9 = cVar.f10220d;
            cVar2.addPosition(i9, Math.max(0, cVar.f10223g));
            spanSize -= this.f10187O.getSpanSize(i9);
            cVar.f10220d += cVar.f10221e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public static class b extends RecyclerView.q {
        public static final int INVALID_SPAN_ID = -1;

        /* renamed from: e */
        int f10190e;

        /* renamed from: f */
        int f10191f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10190e = -1;
            this.f10191f = 0;
        }

        public int getSpanIndex() {
            return this.f10190e;
        }

        public int getSpanSize() {
            return this.f10191f;
        }

        public b(int i8, int i9) {
            super(i8, i9);
            this.f10190e = -1;
            this.f10191f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10190e = -1;
            this.f10191f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10190e = -1;
            this.f10191f = 0;
        }

        public b(RecyclerView.q qVar) {
            super(qVar);
            this.f10190e = -1;
            this.f10191f = 0;
        }
    }

    public GridLayoutManager(Context context, int i8) {
        super(context);
        this.f10181I = false;
        this.f10182J = -1;
        this.f10185M = new SparseIntArray();
        this.f10186N = new SparseIntArray();
        this.f10187O = new a();
        this.f10188P = new Rect();
        setSpanCount(i8);
    }

    public GridLayoutManager(Context context, int i8, int i9, boolean z8) {
        super(context, i9, z8);
        this.f10181I = false;
        this.f10182J = -1;
        this.f10185M = new SparseIntArray();
        this.f10186N = new SparseIntArray();
        this.f10187O = new a();
        this.f10188P = new Rect();
        setSpanCount(i8);
    }
}
