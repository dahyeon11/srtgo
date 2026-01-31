package K2;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public class g implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f2866a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f2867b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f2868c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public Matrix evaluate(float f8, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f2866a);
        matrix2.getValues(this.f2867b);
        for (int i8 = 0; i8 < 9; i8++) {
            float[] fArr = this.f2867b;
            float f9 = fArr[i8];
            float f10 = this.f2866a[i8];
            fArr[i8] = f10 + ((f9 - f10) * f8);
        }
        this.f2868c.setValues(this.f2867b);
        return this.f2868c;
    }
}
