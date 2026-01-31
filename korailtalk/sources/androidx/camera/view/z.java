package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class z {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private static Matrix a(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix getExifTransform(int i8, int i9, int i10) {
        Matrix matrix = new Matrix();
        float f8 = i9;
        float f9 = i10;
        RectF rectF = new RectF(0.0f, 0.0f, f8, f9);
        RectF rectF2 = NORMALIZED_RECT;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        switch (i8) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f9, f8);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f9, f8);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f9, f8);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f9, f8);
                break;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static Matrix getNormalizedToBuffer(Rect rect) {
        return a(new RectF(rect));
    }

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i8) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i8);
        matrix.postConcat(a(rectF2));
        return matrix;
    }

    public static boolean is90or270(int i8) {
        if (i8 == 90 || i8 == 270) {
            return true;
        }
        if (i8 == 0 || i8 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i8);
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, boolean z8, Size size2, boolean z9) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z8) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z9) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static float max(float f8, float f9, float f10, float f11) {
        return Math.max(Math.max(f8, f9), Math.max(f10, f11));
    }

    public static float min(float f8, float f9, float f10, float f11) {
        return Math.min(Math.min(f8, f9), Math.min(f10, f11));
    }

    public static Size rectToSize(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static float[] rectToVertices(RectF rectF) {
        float f8 = rectF.left;
        float f9 = rectF.top;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        return new float[]{f8, f9, f10, f9, f10, f11, f8, f11};
    }

    public static float[] sizeToVertices(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static int surfaceRotationToRotationDegrees(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 1) {
            return 90;
        }
        if (i8 == 2) {
            return 180;
        }
        if (i8 == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i8);
    }

    public static RectF verticesToRect(float[] fArr) {
        return new RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }
}
