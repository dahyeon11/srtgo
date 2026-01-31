package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class k extends o {

    /* renamed from: d */
    private j f10613d;

    /* renamed from: e */
    private j f10614e;

    class a extends h {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.A
        protected void g(View view, RecyclerView.B b9, RecyclerView.A.a aVar) {
            k kVar = k.this;
            int[] iArrCalculateDistanceToFinalSnap = kVar.calculateDistanceToFinalSnap(kVar.f10621a.getLayoutManager(), view);
            int i8 = iArrCalculateDistanceToFinalSnap[0];
            int i9 = iArrCalculateDistanceToFinalSnap[1];
            int iK = k(Math.max(Math.abs(i8), Math.abs(i9)));
            if (iK > 0) {
                aVar.update(i8, i9, iK, this.f10602j);
            }
        }

        @Override // androidx.recyclerview.widget.h
        protected float j(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.h
        protected int l(int i8) {
            return Math.min(100, super.l(i8));
        }
    }

    private int g(View view, j jVar) {
        return (jVar.getDecoratedStart(view) + (jVar.getDecoratedMeasurement(view) / 2)) - (jVar.getStartAfterPadding() + (jVar.getTotalSpace() / 2));
    }

    private View h(RecyclerView.p pVar, j jVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = jVar.getStartAfterPadding() + (jVar.getTotalSpace() / 2);
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = pVar.getChildAt(i9);
            int iAbs = Math.abs((jVar.getDecoratedStart(childAt) + (jVar.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (iAbs < i8) {
                view = childAt;
                i8 = iAbs;
            }
        }
        return view;
    }

    private j i(RecyclerView.p pVar) {
        j jVar = this.f10614e;
        if (jVar == null || jVar.f10610a != pVar) {
            this.f10614e = j.createHorizontalHelper(pVar);
        }
        return this.f10614e;
    }

    private j j(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return k(pVar);
        }
        if (pVar.canScrollHorizontally()) {
            return i(pVar);
        }
        return null;
    }

    private j k(RecyclerView.p pVar) {
        j jVar = this.f10613d;
        if (jVar == null || jVar.f10610a != pVar) {
            this.f10613d = j.createVerticalHelper(pVar);
        }
        return this.f10613d;
    }

    private boolean l(RecyclerView.p pVar, int i8, int i9) {
        return pVar.canScrollHorizontally() ? i8 > 0 : i9 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean m(RecyclerView.p pVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.A.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.A.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.o
    protected RecyclerView.A a(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new a(this.f10621a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = g(view, i(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = g(view, k(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    public View findSnapView(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return h(pVar, k(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return h(pVar, i(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public int findTargetSnapPosition(RecyclerView.p pVar, int i8, int i9) {
        j jVarJ;
        int itemCount = pVar.getItemCount();
        if (itemCount == 0 || (jVarJ = j(pVar)) == null) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        View view = null;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = pVar.getChildAt(i12);
            if (childAt != null) {
                int iG = g(childAt, jVarJ);
                if (iG <= 0 && iG > i11) {
                    view2 = childAt;
                    i11 = iG;
                }
                if (iG >= 0 && iG < i10) {
                    view = childAt;
                    i10 = iG;
                }
            }
        }
        boolean zL = l(pVar, i8, i9);
        if (zL && view != null) {
            return pVar.getPosition(view);
        }
        if (!zL && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (zL) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = pVar.getPosition(view) + (m(pVar) == zL ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
