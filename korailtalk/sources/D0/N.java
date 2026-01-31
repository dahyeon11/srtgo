package D0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class N extends M {
    N() {
    }

    @Override // D0.E, D0.O
    public float getTransitionAlpha(View view) {
        return view.getTransitionAlpha();
    }

    @Override // D0.I, D0.O
    public void setAnimationMatrix(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // D0.K, D0.O
    public void setLeftTopRightBottom(View view, int i8, int i9, int i10, int i11) {
        view.setLeftTopRightBottom(i8, i9, i10, i11);
    }

    @Override // D0.E, D0.O
    public void setTransitionAlpha(View view, float f8) {
        view.setTransitionAlpha(f8);
    }

    @Override // D0.M, D0.O
    public void setTransitionVisibility(View view, int i8) {
        view.setTransitionVisibility(i8);
    }

    @Override // D0.I, D0.O
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // D0.I, D0.O
    public void transformMatrixToLocal(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
