package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class o extends RecyclerView.s {

    /* renamed from: a */
    RecyclerView f10621a;

    /* renamed from: b */
    private Scroller f10622b;

    /* renamed from: c */
    private final RecyclerView.u f10623c = new a();

    class a extends RecyclerView.u {

        /* renamed from: a */
        boolean f10624a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            super.onScrollStateChanged(recyclerView, i8);
            if (i8 == 0 && this.f10624a) {
                this.f10624a = false;
                o.this.f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            if (i8 == 0 && i9 == 0) {
                return;
            }
            this.f10624a = true;
        }
    }

    class b extends h {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.A
        protected void g(View view, RecyclerView.B b9, RecyclerView.A.a aVar) {
            o oVar = o.this;
            RecyclerView recyclerView = oVar.f10621a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = oVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
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
    }

    private void c() {
        this.f10621a.removeOnScrollListener(this.f10623c);
        this.f10621a.setOnFlingListener(null);
    }

    private void d() {
        if (this.f10621a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f10621a.addOnScrollListener(this.f10623c);
        this.f10621a.setOnFlingListener(this);
    }

    private boolean e(RecyclerView.p pVar, int i8, int i9) {
        RecyclerView.A a9;
        int iFindTargetSnapPosition;
        if (!(pVar instanceof RecyclerView.A.b) || (a9 = a(pVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(pVar, i8, i9)) == -1) {
            return false;
        }
        a9.setTargetPosition(iFindTargetSnapPosition);
        pVar.startSmoothScroll(a9);
        return true;
    }

    protected RecyclerView.A a(RecyclerView.p pVar) {
        return b(pVar);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10621a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            c();
        }
        this.f10621a = recyclerView;
        if (recyclerView != null) {
            d();
            this.f10622b = new Scroller(this.f10621a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    protected h b(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new b(this.f10621a.getContext());
        }
        return null;
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view);

    public int[] calculateScrollDistance(int i8, int i9) {
        this.f10622b.fling(0, 0, i8, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f10622b.getFinalX(), this.f10622b.getFinalY()};
    }

    void f() {
        RecyclerView.p layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.f10621a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i8 = iArrCalculateDistanceToFinalSnap[0];
        if (i8 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f10621a.smoothScrollBy(i8, iArrCalculateDistanceToFinalSnap[1]);
    }

    public abstract View findSnapView(RecyclerView.p pVar);

    public abstract int findTargetSnapPosition(RecyclerView.p pVar, int i8, int i9);

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean onFling(int i8, int i9) {
        RecyclerView.p layoutManager = this.f10621a.getLayoutManager();
        if (layoutManager == null || this.f10621a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f10621a.getMinFlingVelocity();
        return (Math.abs(i9) > minFlingVelocity || Math.abs(i8) > minFlingVelocity) && e(layoutManager, i8, i9);
    }
}
