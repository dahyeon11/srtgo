package K2;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class f extends Property {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f2865a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f2865a = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        this.f2865a.set(imageView.getImageMatrix());
        return this.f2865a;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
