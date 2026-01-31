package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class j {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f10610a;

    /* renamed from: b, reason: collision with root package name */
    private int f10611b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f10612c;

    class a extends j {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedEnd(View view) {
            return this.f10610a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedMeasurement(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10610a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedMeasurementInOther(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10610a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedStart(View view) {
            return this.f10610a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getEnd() {
            return this.f10610a.getWidth();
        }

        @Override // androidx.recyclerview.widget.j
        public int getEndAfterPadding() {
            return this.f10610a.getWidth() - this.f10610a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.j
        public int getEndPadding() {
            return this.f10610a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.j
        public int getMode() {
            return this.f10610a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.j
        public int getModeInOther() {
            return this.f10610a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.j
        public int getStartAfterPadding() {
            return this.f10610a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.j
        public int getTotalSpace() {
            return (this.f10610a.getWidth() - this.f10610a.getPaddingLeft()) - this.f10610a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.j
        public int getTransformedEndWithDecoration(View view) {
            this.f10610a.getTransformedBoundingBox(view, true, this.f10612c);
            return this.f10612c.right;
        }

        @Override // androidx.recyclerview.widget.j
        public int getTransformedStartWithDecoration(View view) {
            this.f10610a.getTransformedBoundingBox(view, true, this.f10612c);
            return this.f10612c.left;
        }

        @Override // androidx.recyclerview.widget.j
        public void offsetChild(View view, int i8) {
            view.offsetLeftAndRight(i8);
        }

        @Override // androidx.recyclerview.widget.j
        public void offsetChildren(int i8) {
            this.f10610a.offsetChildrenHorizontal(i8);
        }
    }

    class b extends j {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedEnd(View view) {
            return this.f10610a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedMeasurement(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10610a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedMeasurementInOther(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10610a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getDecoratedStart(View view) {
            return this.f10610a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int getEnd() {
            return this.f10610a.getHeight();
        }

        @Override // androidx.recyclerview.widget.j
        public int getEndAfterPadding() {
            return this.f10610a.getHeight() - this.f10610a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.j
        public int getEndPadding() {
            return this.f10610a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.j
        public int getMode() {
            return this.f10610a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.j
        public int getModeInOther() {
            return this.f10610a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.j
        public int getStartAfterPadding() {
            return this.f10610a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.j
        public int getTotalSpace() {
            return (this.f10610a.getHeight() - this.f10610a.getPaddingTop()) - this.f10610a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.j
        public int getTransformedEndWithDecoration(View view) {
            this.f10610a.getTransformedBoundingBox(view, true, this.f10612c);
            return this.f10612c.bottom;
        }

        @Override // androidx.recyclerview.widget.j
        public int getTransformedStartWithDecoration(View view) {
            this.f10610a.getTransformedBoundingBox(view, true, this.f10612c);
            return this.f10612c.top;
        }

        @Override // androidx.recyclerview.widget.j
        public void offsetChild(View view, int i8) {
            view.offsetTopAndBottom(i8);
        }

        @Override // androidx.recyclerview.widget.j
        public void offsetChildren(int i8) {
            this.f10610a.offsetChildrenVertical(i8);
        }
    }

    /* synthetic */ j(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static j createHorizontalHelper(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static j createOrientationHelper(RecyclerView.p pVar, int i8) {
        if (i8 == 0) {
            return createHorizontalHelper(pVar);
        }
        if (i8 == 1) {
            return createVerticalHelper(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static j createVerticalHelper(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public RecyclerView.p getLayoutManager() {
        return this.f10610a;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        if (Integer.MIN_VALUE == this.f10611b) {
            return 0;
        }
        return getTotalSpace() - this.f10611b;
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i8);

    public abstract void offsetChildren(int i8);

    public void onLayoutComplete() {
        this.f10611b = getTotalSpace();
    }

    private j(RecyclerView.p pVar) {
        this.f10611b = Integer.MIN_VALUE;
        this.f10612c = new Rect();
        this.f10610a = pVar;
    }
}
