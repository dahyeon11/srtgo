package com.google.android.material.timepicker;

import J2.f;
import J2.h;
import J2.l;
import a3.g;
import a3.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
class b extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    private int f25432A;

    /* renamed from: B, reason: collision with root package name */
    private g f25433B;

    /* renamed from: z, reason: collision with root package name */
    private final Runnable f25434z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.q();
        }
    }

    public b(Context context) {
        this(context, null);
    }

    private Drawable o() {
        g gVar = new g();
        this.f25433B = gVar;
        gVar.setCornerSize(new i(0.5f));
        this.f25433B.setFillColor(ColorStateList.valueOf(-1));
        return this.f25433B;
    }

    private static boolean p(View view) {
        return "skip".equals(view.getTag());
    }

    private void r() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f25434z);
            handler.post(this.f25434z);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        if (view.getId() == -1) {
            view.setId(AbstractC0985p0.generateViewId());
        }
        r();
    }

    public int getRadius() {
        return this.f25432A;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        r();
    }

    protected void q() {
        int childCount = getChildCount();
        int i8 = 1;
        for (int i9 = 0; i9 < childCount; i9++) {
            if (p(getChildAt(i9))) {
                i8++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.clone(this);
        float f8 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != f.circle_center && !p(childAt)) {
                dVar.constrainCircle(childAt.getId(), f.circle_center, this.f25432A, f8);
                f8 += 360.0f / (childCount - i8);
            }
        }
        dVar.applyTo(this);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        this.f25433B.setFillColor(ColorStateList.valueOf(i8));
    }

    public void setRadius(int i8) {
        this.f25432A = i8;
        q();
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater.from(context).inflate(h.material_radial_view_group, this);
        AbstractC0985p0.setBackground(this, o());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.RadialViewGroup, i8, 0);
        this.f25432A = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.RadialViewGroup_materialCircleRadius, 0);
        this.f25434z = new a();
        typedArrayObtainStyledAttributes.recycle();
    }
}
