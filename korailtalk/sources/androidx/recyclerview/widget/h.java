package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class h extends RecyclerView.A {
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;

    /* renamed from: k, reason: collision with root package name */
    protected PointF f10603k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f10604l;

    /* renamed from: n, reason: collision with root package name */
    private float f10606n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f10601i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f10602j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f10605m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f10607o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f10608p = 0;

    public h(Context context) {
        this.f10604l = context.getResources().getDisplayMetrics();
    }

    private int m(int i8, int i9) {
        int i10 = i8 - i9;
        if (i8 * i10 <= 0) {
            return 0;
        }
        return i10;
    }

    private float o() {
        if (!this.f10605m) {
            this.f10606n = j(this.f10604l);
            this.f10605m = true;
        }
        return this.f10606n;
    }

    public int calculateDtToFit(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == -1) {
            return i10 - i8;
        }
        if (i12 != 0) {
            if (i12 == 1) {
                return i11 - i9;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i13 = i10 - i8;
        if (i13 > 0) {
            return i13;
        }
        int i14 = i11 - i9;
        if (i14 < 0) {
            return i14;
        }
        return 0;
    }

    public int calculateDxToMakeVisible(View view, int i8) {
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i8);
    }

    public int calculateDyToMakeVisible(View view, int i8) {
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void d(int i8, int i9, RecyclerView.B b9, RecyclerView.A.a aVar) {
        if (getChildCount() == 0) {
            i();
            return;
        }
        this.f10607o = m(this.f10607o, i8);
        int iM = m(this.f10608p, i9);
        this.f10608p = iM;
        if (this.f10607o == 0 && iM == 0) {
            q(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void e() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void f() {
        this.f10608p = 0;
        this.f10607o = 0;
        this.f10603k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void g(View view, RecyclerView.B b9, RecyclerView.A.a aVar) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, n());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, p());
        int iK = k((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
        if (iK > 0) {
            aVar.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iK, this.f10602j);
        }
    }

    protected float j(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int k(int i8) {
        return (int) Math.ceil(l(i8) / 0.3356d);
    }

    protected int l(int i8) {
        return (int) Math.ceil(Math.abs(i8) * o());
    }

    protected int n() {
        PointF pointF = this.f10603k;
        if (pointF != null) {
            float f8 = pointF.x;
            if (f8 != 0.0f) {
                return f8 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int p() {
        PointF pointF = this.f10603k;
        if (pointF != null) {
            float f8 = pointF.y;
            if (f8 != 0.0f) {
                return f8 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void q(RecyclerView.A.a aVar) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            aVar.jumpTo(getTargetPosition());
            i();
            return;
        }
        a(pointFComputeScrollVectorForPosition);
        this.f10603k = pointFComputeScrollVectorForPosition;
        this.f10607o = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.f10608p = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        aVar.update((int) (this.f10607o * 1.2f), (int) (this.f10608p * 1.2f), (int) (l(10000) * 1.2f), this.f10601i);
    }
}
