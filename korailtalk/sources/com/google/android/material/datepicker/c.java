package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f24672a;

    /* renamed from: b, reason: collision with root package name */
    final b f24673b;

    /* renamed from: c, reason: collision with root package name */
    final b f24674c;

    /* renamed from: d, reason: collision with root package name */
    final b f24675d;

    /* renamed from: e, reason: collision with root package name */
    final b f24676e;

    /* renamed from: f, reason: collision with root package name */
    final b f24677f;

    /* renamed from: g, reason: collision with root package name */
    final b f24678g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f24679h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X2.b.resolveOrThrow(context, J2.b.materialCalendarStyle, h.class.getCanonicalName()), J2.l.MaterialCalendar);
        this.f24672a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_dayStyle, 0));
        this.f24678g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_dayInvalidStyle, 0));
        this.f24673b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_daySelectedStyle, 0));
        this.f24674c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, J2.l.MaterialCalendar_rangeFillColor);
        this.f24675d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_yearStyle, 0));
        this.f24676e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_yearSelectedStyle, 0));
        this.f24677f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f24679h = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
