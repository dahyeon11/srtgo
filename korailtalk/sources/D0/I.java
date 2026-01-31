package D0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
abstract class I extends E {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f721g = true;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f722h = true;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f723i = true;

    I() {
    }

    @Override // D0.O
    public void setAnimationMatrix(View view, Matrix matrix) {
        if (f721g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f721g = false;
            }
        }
    }

    @Override // D0.O
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        if (f722h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f722h = false;
            }
        }
    }

    @Override // D0.O
    public void transformMatrixToLocal(View view, Matrix matrix) {
        if (f723i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f723i = false;
            }
        }
    }
}
