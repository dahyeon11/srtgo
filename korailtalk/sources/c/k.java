package C;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.h1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k {
    private static RectF a(boolean z8, int i8, RectF rectF, RectF rectF2) {
        boolean z9 = false;
        boolean z10 = i8 == 0 && !z8;
        boolean z11 = i8 == 90 && z8;
        if (z10 || z11) {
            return rectF2;
        }
        boolean z12 = i8 == 0 && z8;
        boolean z13 = i8 == 270 && !z8;
        if (z12 || z13) {
            return b(rectF2, rectF.centerX());
        }
        boolean z14 = i8 == 90 && !z8;
        boolean z15 = i8 == 180 && z8;
        if (z14 || z15) {
            return c(rectF2, rectF.centerY());
        }
        boolean z16 = i8 == 180 && !z8;
        if (i8 == 270 && z8) {
            z9 = true;
        }
        if (z16 || z9) {
            return b(c(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z8 + " rotation " + i8);
    }

    private static RectF b(RectF rectF, float f8) {
        return new RectF(d(rectF.right, f8), rectF.top, d(rectF.left, f8), rectF.bottom);
    }

    private static RectF c(RectF rectF, float f8) {
        return new RectF(rectF.left, e(rectF.bottom, f8), rectF.right, e(rectF.top, f8));
    }

    public static Map<h1, Rect> calculateViewPortRects(Rect rect, boolean z8, Rational rational, int i8, int i9, int i10, Map<h1, Size> map) {
        Z.h.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<h1, Size> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, G.a.getRotatedAspectRatio(i8, rational), i9, z8, i10, i8);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((h1) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static float d(float f8, float f9) {
        return (f9 + f9) - f8;
    }

    private static float e(float f8, float f9) {
        return (f9 + f9) - f8;
    }

    private static boolean f(boolean z8, int i8) {
        return z8 ^ (i8 == 1);
    }

    public static RectF getScaledRect(RectF rectF, Rational rational, int i8, boolean z8, int i9, int i10) {
        if (i8 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i8 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i8 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i8);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return a(f(z8, i9), i10, rectF, rectF3);
    }
}
