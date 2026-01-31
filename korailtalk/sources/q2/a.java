package Q2;

import X2.b;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class a {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    public static int compositeARGBWithAlpha(int i8, int i9) {
        return androidx.core.graphics.a.setAlphaComponent(i8, (Color.alpha(i8) * i9) / 255);
    }

    public static int getColor(View view, int i8) {
        return b.resolveOrThrow(view, i8);
    }

    public static int layer(View view, int i8, int i9) {
        return layer(view, i8, i9, 1.0f);
    }

    public static int getColor(Context context, int i8, String str) {
        return b.resolveOrThrow(context, i8, str);
    }

    public static int layer(View view, int i8, int i9, float f8) {
        return layer(getColor(view, i8), getColor(view, i9), f8);
    }

    public static int getColor(View view, int i8, int i9) {
        return getColor(view.getContext(), i8, i9);
    }

    public static int getColor(Context context, int i8, int i9) {
        TypedValue typedValueResolve = b.resolve(context, i8);
        return typedValueResolve != null ? typedValueResolve.data : i9;
    }

    public static int layer(int i8, int i9, float f8) {
        return layer(i8, androidx.core.graphics.a.setAlphaComponent(i9, Math.round(Color.alpha(i9) * f8)));
    }

    public static int layer(int i8, int i9) {
        return androidx.core.graphics.a.compositeColors(i9, i8);
    }
}
