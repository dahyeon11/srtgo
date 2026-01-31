package com.google.android.material.appbar;

import J2.k;
import J2.l;
import a3.g;
import a3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC0985p0;
import c3.AbstractC1090a;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: Q, reason: collision with root package name */
    private static final int f24303Q = k.Widget_MaterialComponents_Toolbar;

    /* renamed from: P, reason: collision with root package name */
    private Integer f24304P;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private void A(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.setFillColor(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.initializeElevationOverlay(context);
            gVar.setElevation(AbstractC0985p0.getElevation(this));
            AbstractC0985p0.setBackground(this, gVar);
        }
    }

    private Drawable B(Drawable drawable) {
        if (drawable == null || this.f24304P == null) {
            return drawable;
        }
        Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(drawable);
        androidx.core.graphics.drawable.a.setTint(drawableWrap, this.f24304P.intValue());
        return drawableWrap;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        h.setElevation(this, f8);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(B(drawable));
    }

    public void setNavigationIconTint(int i8) {
        this.f24304P = Integer.valueOf(i8);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24303Q;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.MaterialToolbar, i8, i9, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(l.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(l.MaterialToolbar_navigationIconTint, -1));
        }
        typedArrayObtainStyledAttributes.recycle();
        A(context2);
    }
}
