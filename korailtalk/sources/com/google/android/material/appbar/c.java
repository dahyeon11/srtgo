package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import java.util.List;

/* loaded from: classes2.dex */
abstract class c extends d {

    /* renamed from: d, reason: collision with root package name */
    final Rect f24315d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f24316e;

    /* renamed from: f, reason: collision with root package name */
    private int f24317f;

    /* renamed from: g, reason: collision with root package name */
    private int f24318g;

    public c() {
        this.f24315d = new Rect();
        this.f24316e = new Rect();
        this.f24317f = 0;
    }

    private static int g(int i8) {
        return i8 == 0 ? L2.a.TOP_START : i8;
    }

    @Override // com.google.android.material.appbar.d
    protected void a(CoordinatorLayout coordinatorLayout, View view, int i8) {
        View viewB = b(coordinatorLayout.getDependencies(view));
        if (viewB == null) {
            super.a(coordinatorLayout, view, i8);
            this.f24317f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f24315d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewB.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewB.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        C0950d1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && AbstractC0985p0.getFitsSystemWindows(coordinatorLayout) && !AbstractC0985p0.getFitsSystemWindows(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f24316e;
        A.apply(g(fVar.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i8);
        int iC = c(viewB);
        view.layout(rect2.left, rect2.top - iC, rect2.right, rect2.bottom - iC);
        this.f24317f = rect2.top - viewB.getBottom();
    }

    abstract View b(List list);

    final int c(View view) {
        if (this.f24318g == 0) {
            return 0;
        }
        float fD = d(view);
        int i8 = this.f24318g;
        return X.a.clamp((int) (fD * i8), 0, i8);
    }

    float d(View view) {
        return 1.0f;
    }

    int e(View view) {
        return view.getMeasuredHeight();
    }

    final int f() {
        return this.f24317f;
    }

    public final int getOverlayTop() {
        return this.f24318g;
    }

    protected boolean h() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
        View viewB;
        C0950d1 lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (viewB = b(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (AbstractC0985p0.getFitsSystemWindows(viewB) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iE = size + e(viewB);
        int measuredHeight = viewB.getMeasuredHeight();
        if (h()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iE -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i8, i9, View.MeasureSpec.makeMeasureSpec(iE, i12 == -1 ? 1073741824 : Integer.MIN_VALUE), i11);
        return true;
    }

    public final void setOverlayTop(int i8) {
        this.f24318g = i8;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24315d = new Rect();
        this.f24316e = new Rect();
        this.f24317f = 0;
    }
}
