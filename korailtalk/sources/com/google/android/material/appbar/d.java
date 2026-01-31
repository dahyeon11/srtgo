package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
class d extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private e f24319a;

    /* renamed from: b, reason: collision with root package name */
    private int f24320b;

    /* renamed from: c, reason: collision with root package name */
    private int f24321c;

    public d() {
        this.f24320b = 0;
        this.f24321c = 0;
    }

    protected void a(CoordinatorLayout coordinatorLayout, View view, int i8) {
        coordinatorLayout.onLayoutChild(view, i8);
    }

    public int getLeftAndRightOffset() {
        e eVar = this.f24319a;
        if (eVar != null) {
            return eVar.getLeftAndRightOffset();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        e eVar = this.f24319a;
        if (eVar != null) {
            return eVar.getTopAndBottomOffset();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        e eVar = this.f24319a;
        return eVar != null && eVar.isHorizontalOffsetEnabled();
    }

    public boolean isVerticalOffsetEnabled() {
        e eVar = this.f24319a;
        return eVar != null && eVar.isVerticalOffsetEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i8) {
        a(coordinatorLayout, view, i8);
        if (this.f24319a == null) {
            this.f24319a = new e(view);
        }
        this.f24319a.b();
        this.f24319a.a();
        int i9 = this.f24320b;
        if (i9 != 0) {
            this.f24319a.setTopAndBottomOffset(i9);
            this.f24320b = 0;
        }
        int i10 = this.f24321c;
        if (i10 == 0) {
            return true;
        }
        this.f24319a.setLeftAndRightOffset(i10);
        this.f24321c = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z8) {
        e eVar = this.f24319a;
        if (eVar != null) {
            eVar.setHorizontalOffsetEnabled(z8);
        }
    }

    public boolean setLeftAndRightOffset(int i8) {
        e eVar = this.f24319a;
        if (eVar != null) {
            return eVar.setLeftAndRightOffset(i8);
        }
        this.f24321c = i8;
        return false;
    }

    public boolean setTopAndBottomOffset(int i8) {
        e eVar = this.f24319a;
        if (eVar != null) {
            return eVar.setTopAndBottomOffset(i8);
        }
        this.f24320b = i8;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z8) {
        e eVar = this.f24319a;
        if (eVar != null) {
            eVar.setVerticalOffsetEnabled(z8);
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24320b = 0;
        this.f24321c = 0;
    }
}
