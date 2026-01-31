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
public final class CustomViewLandscape extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f11706a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f11707b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f11708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewLandscape(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.f11706a = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(50.0f);
        this.f11707b = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(a.CATEGORY_MASK);
        paint3.setStrokeWidth(5.0f);
        paint3.setStyle(Paint.Style.STROKE);
        this.f11708c = paint3;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.f11707b.setTextSize(canvas.getWidth() / 22.0f);
        double width = canvas.getWidth();
        float f8 = (float) (0.025d * width);
        float f9 = (float) (width * 0.975d);
        float height = canvas.getHeight();
        float f10 = (f9 - f8) / 1.58f;
        float f11 = (float) ((height - f10) * 0.5d);
        float f12 = (float) ((height + f10) * 0.5d);
        RectF rectF = new RectF(f8, f11, f9, f12);
        RectF rectF2 = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        if (Build.VERSION.SDK_INT >= 29) {
            canvas.drawDoubleRoundRect(rectF2, 0.0f, 0.0f, rectF, 1.59f, 1.59f, this.f11706a);
        } else {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), f11, this.f11706a);
            canvas.drawRect(0.0f, f11, f8, f12, this.f11706a);
            canvas.drawRect(f9, f11, canvas.getWidth(), f12, this.f11706a);
            canvas.drawRect(0.0f, f12, canvas.getWidth(), canvas.getHeight(), this.f11706a);
        }
        Path path = new Path();
        path.moveTo(rectF.left, f11);
        path.lineTo(rectF.left, f12);
        path.lineTo(rectF.right, f12);
        path.lineTo(rectF.right, f11);
        path.close();
        canvas.drawPath(path, this.f11708c);
        canvas.drawText("카드번호와 유효기간이 사각형 안에", canvas.getWidth() * 0.5f, canvas.getHeight() * 0.13f, this.f11707b);
        canvas.drawText("가장 크게 보이도록 가깝게 맞춰주세요", canvas.getWidth() * 0.5f, canvas.getHeight() * 0.17f, this.f11707b);
    }
}
