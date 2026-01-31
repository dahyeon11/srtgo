package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
abstract class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final double f8054a = Math.cos(Math.toRadians(45.0d));

    static float a(float f8, float f9, boolean z8) {
        return z8 ? (float) (f8 + ((1.0d - f8054a) * f9)) : f8;
    }

    static float b(float f8, float f9, boolean z8) {
        return z8 ? (float) ((f8 * 1.5f) + ((1.0d - f8054a) * f9)) : f8 * 1.5f;
    }
}
