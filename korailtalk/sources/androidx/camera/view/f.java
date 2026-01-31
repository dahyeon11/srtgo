package androidx.camera.view;

import Q7.X;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.B0;
import androidx.camera.core.g1;
import androidx.camera.view.PreviewView;

/* loaded from: classes.dex */
final class f {

    /* renamed from: g, reason: collision with root package name */
    private static final PreviewView.e f7975g = PreviewView.e.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    private Size f7976a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f7977b;

    /* renamed from: c, reason: collision with root package name */
    private int f7978c;

    /* renamed from: d, reason: collision with root package name */
    private int f7979d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7980e;

    /* renamed from: f, reason: collision with root package name */
    private PreviewView.e f7981f = f7975g;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7982a;

        static {
            int[] iArr = new int[PreviewView.e.values().length];
            f7982a = iArr;
            try {
                iArr[PreviewView.e.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7982a[PreviewView.e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7982a[PreviewView.e.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7982a[PreviewView.e.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7982a[PreviewView.e.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7982a[PreviewView.e.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f() {
    }

    private static RectF b(RectF rectF, float f8) {
        float f9 = f8 + f8;
        return new RectF(f9 - rectF.right, rectF.top, f9 - rectF.left, rectF.bottom);
    }

    private Size e() {
        return z.is90or270(this.f7978c) ? new Size(this.f7977b.height(), this.f7977b.width()) : new Size(this.f7977b.width(), this.f7977b.height());
    }

    private RectF j(Size size, int i8) {
        Z.h.checkState(k());
        Matrix matrixH = h(size, i8);
        RectF rectF = new RectF(0.0f, 0.0f, this.f7976a.getWidth(), this.f7976a.getHeight());
        matrixH.mapRect(rectF);
        return rectF;
    }

    private boolean k() {
        return (this.f7977b == null || this.f7976a == null) ? false : true;
    }

    private static void m(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.e eVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f7982a[eVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                B0.e("PreviewTransform", "Unexpected crop rect: " + eVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (eVar == PreviewView.e.FIT_CENTER || eVar == PreviewView.e.FIT_START || eVar == PreviewView.e.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    Bitmap a(Bitmap bitmap, Size size, int i8) {
        if (!k()) {
            return bitmap;
        }
        Matrix matrixI = i();
        RectF rectFJ = j(size, i8);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixI);
        matrix.postScale(rectFJ.width() / this.f7976a.getWidth(), rectFJ.height() / this.f7976a.getHeight());
        matrix.postTranslate(rectFJ.left, rectFJ.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix c(Size size, int i8) {
        if (!k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i8).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f7976a.getWidth(), this.f7976a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i8) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeE = e();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight());
        Matrix matrix = new Matrix();
        m(matrix, rectF2, rectF, this.f7981f);
        matrix.mapRect(rectF2);
        return i8 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    PreviewView.e f() {
        return this.f7981f;
    }

    Rect g() {
        return this.f7977b;
    }

    Matrix h(Size size, int i8) {
        Z.h.checkState(k());
        Matrix rectToRect = z.getRectToRect(new RectF(this.f7977b), l(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i8), this.f7978c);
        if (this.f7980e) {
            if (z.is90or270(this.f7978c)) {
                rectToRect.preScale(1.0f, -1.0f, this.f7977b.centerX(), this.f7977b.centerY());
            } else {
                rectToRect.preScale(-1.0f, 1.0f, this.f7977b.centerX(), this.f7977b.centerY());
            }
        }
        return rectToRect;
    }

    Matrix i() {
        Z.h.checkState(k());
        RectF rectF = new RectF(0.0f, 0.0f, this.f7976a.getWidth(), this.f7976a.getHeight());
        return z.getRectToRect(rectF, rectF, -z.surfaceRotationToRotationDegrees(this.f7979d));
    }

    boolean l(Size size) {
        return z.isAspectRatioMatchingWithRoundingError(size, true, e(), false);
    }

    void n(PreviewView.e eVar) {
        this.f7981f = eVar;
    }

    void o(g1.g gVar, Size size, boolean z8) {
        B0.d("PreviewTransform", "Transformation info set: " + gVar + X.SPACE + size + X.SPACE + z8);
        this.f7977b = gVar.getCropRect();
        this.f7978c = gVar.getRotationDegrees();
        this.f7979d = gVar.getTargetRotation();
        this.f7976a = size;
        this.f7980e = z8;
    }

    void p(Size size, int i8, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            B0.w("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (k()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(i());
            } else {
                Display display = view.getDisplay();
                if (display != null && display.getRotation() != this.f7979d) {
                    B0.e("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF rectFJ = j(size, i8);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFJ.width() / this.f7976a.getWidth());
            view.setScaleY(rectFJ.height() / this.f7976a.getHeight());
            view.setTranslationX(rectFJ.left - view.getLeft());
            view.setTranslationY(rectFJ.top - view.getTop());
        }
    }
}
