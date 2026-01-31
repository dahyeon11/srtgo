package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f24322a;

    /* renamed from: b, reason: collision with root package name */
    private int f24323b;

    /* renamed from: c, reason: collision with root package name */
    private int f24324c;

    /* renamed from: d, reason: collision with root package name */
    private int f24325d;

    /* renamed from: e, reason: collision with root package name */
    private int f24326e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24327f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24328g = true;

    public e(View view) {
        this.f24322a = view;
    }

    void a() {
        View view = this.f24322a;
        AbstractC0985p0.offsetTopAndBottom(view, this.f24325d - (view.getTop() - this.f24323b));
        View view2 = this.f24322a;
        AbstractC0985p0.offsetLeftAndRight(view2, this.f24326e - (view2.getLeft() - this.f24324c));
    }

    void b() {
        this.f24323b = this.f24322a.getTop();
        this.f24324c = this.f24322a.getLeft();
    }

    public int getLayoutLeft() {
        return this.f24324c;
    }

    public int getLayoutTop() {
        return this.f24323b;
    }

    public int getLeftAndRightOffset() {
        return this.f24326e;
    }

    public int getTopAndBottomOffset() {
        return this.f24325d;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.f24328g;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.f24327f;
    }

    public void setHorizontalOffsetEnabled(boolean z8) {
        this.f24328g = z8;
    }

    public boolean setLeftAndRightOffset(int i8) {
        if (!this.f24328g || this.f24326e == i8) {
            return false;
        }
        this.f24326e = i8;
        a();
        return true;
    }

    public boolean setTopAndBottomOffset(int i8) {
        if (!this.f24327f || this.f24325d == i8) {
            return false;
        }
        this.f24325d = i8;
        a();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z8) {
        this.f24327f = z8;
    }
}
