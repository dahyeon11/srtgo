package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f24666a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f24667b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f24668c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f24669d;

    /* renamed from: e, reason: collision with root package name */
    private final int f24670e;

    /* renamed from: f, reason: collision with root package name */
    private final a3.k f24671f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i8, a3.k kVar, Rect rect) {
        Z.h.checkArgumentNonnegative(rect.left);
        Z.h.checkArgumentNonnegative(rect.top);
        Z.h.checkArgumentNonnegative(rect.right);
        Z.h.checkArgumentNonnegative(rect.bottom);
        this.f24666a = rect;
        this.f24667b = colorStateList2;
        this.f24668c = colorStateList;
        this.f24669d = colorStateList3;
        this.f24670e = i8;
        this.f24671f = kVar;
    }

    static b a(Context context, int i8) throws Resources.NotFoundException {
        Z.h.checkArgument(i8 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i8, J2.l.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(J2.l.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(J2.l.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(J2.l.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(J2.l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, J2.l.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, J2.l.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, J2.l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.MaterialCalendarItem_itemStrokeWidth, 0);
        a3.k kVarBuild = a3.k.builder(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, kVarBuild, rect);
    }

    void b(TextView textView) {
        a3.g gVar = new a3.g();
        a3.g gVar2 = new a3.g();
        gVar.setShapeAppearanceModel(this.f24671f);
        gVar2.setShapeAppearanceModel(this.f24671f);
        gVar.setFillColor(this.f24668c);
        gVar.setStroke(this.f24670e, this.f24669d);
        textView.setTextColor(this.f24667b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f24667b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f24666a;
        AbstractC0985p0.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
