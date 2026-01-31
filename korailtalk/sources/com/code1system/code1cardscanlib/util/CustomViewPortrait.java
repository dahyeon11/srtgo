package com.code1system.code1cardscanlib.util;

import W.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CustomViewPortrait extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f11709a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f11710b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f11711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPortrait(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.f11709a = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(50.0f);
        this.f11710b = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(a.CATEGORY_MASK);
        paint3.setStrokeWidth(5.0f);
        paint3.setStyle(Paint.Style.STROKE);
        this.f11711c = paint3;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.f11710b.setTextSize(canvas.getWidth() / 22.0f);
        int width = canvas.getWidth();
        double d9 = width;
        float height = canvas.getHeight();
        float f8 = (float) ((height - r2) * 0.5d);
        float f9 = (float) ((height + r2) * 0.5d);
        float f10 = width;
        float f11 = (((float) (d9 * 0.975d)) - ((float) (0.025d * d9))) / 1.58f;
        float f12 = (float) ((f10 - f11) * 0.5d);
        float f13 = (float) ((f10 + f11) * 0.5d);
        RectF rectF = new RectF(f12, f8, f13, f9);
        RectF rectF2 = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        if (Build.VERSION.SDK_INT >= 29) {
            canvas.drawDoubleRoundRect(rectF2, 0.0f, 0.0f, rectF, 1.59f, 1.59f, this.f11709a);
        } else {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), f8, this.f11709a);
            canvas.drawRect(0.0f, f8, f12, f9, this.f11709a);
            canvas.drawRect(f13, f8, canvas.getWidth(), f9, this.f11709a);
            canvas.drawRect(0.0f, f9, canvas.getWidth(), canvas.getHeight(), this.f11709a);
        }
        Path path = new Path();
        path.moveTo(rectF.left, f8);
        path.lineTo(rectF.left, f9);
        path.lineTo(rectF.right, f9);
        path.lineTo(rectF.right, f8);
        path.close();
        canvas.drawPath(path, this.f11711c);
        canvas.drawText("카드번호와 유효기간이 사각형 안에", canvas.getWidth() * 0.5f, canvas.getHeight() * 0.13f, this.f11710b);
        canvas.drawText("가장 크게 보이도록 가깝게 맞춰주세요", canvas.getWidth() * 0.5f, canvas.getHeight() * 0.17f, this.f11710b);
    }
}
