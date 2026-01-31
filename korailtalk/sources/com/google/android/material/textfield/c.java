package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
class c extends a3.g {

    /* renamed from: A, reason: collision with root package name */
    private int f25309A;

    /* renamed from: y, reason: collision with root package name */
    private final Paint f25310y;

    /* renamed from: z, reason: collision with root package name */
    private final RectF f25311z;

    c(a3.k kVar) {
        super(kVar == null ? new a3.k() : kVar);
        this.f25310y = new Paint(1);
        K();
        this.f25311z = new RectF();
    }

    private void E(Canvas canvas) {
        if (L(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f25309A);
    }

    private void F(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!L(callback)) {
            H(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    private void H(Canvas canvas) {
        this.f25309A = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    private void K() {
        this.f25310y.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f25310y.setColor(-1);
        this.f25310y.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean L(Drawable.Callback callback) {
        return callback instanceof View;
    }

    boolean D() {
        return !this.f25311z.isEmpty();
    }

    void G() {
        I(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void I(float f8, float f9, float f10, float f11) {
        RectF rectF = this.f25311z;
        if (f8 == rectF.left && f9 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f8, f9, f10, f11);
        invalidateSelf();
    }

    void J(RectF rectF) {
        I(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        F(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f25311z, this.f25310y);
        E(canvas);
    }
}
