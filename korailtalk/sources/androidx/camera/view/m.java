package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.G0;

/* loaded from: classes.dex */
class m extends G0 {

    /* renamed from: d, reason: collision with root package name */
    static final PointF f7996d = new PointF(2.0f, 2.0f);

    /* renamed from: b, reason: collision with root package name */
    private final f f7997b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f7998c;

    m(f fVar) {
        this.f7997b = fVar;
    }

    @Override // androidx.camera.core.G0
    protected PointF a(float f8, float f9) {
        float[] fArr = {f8, f9};
        synchronized (this) {
            try {
                Matrix matrix = this.f7998c;
                if (matrix == null) {
                    return f7996d;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void b(Size size, int i8) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    this.f7998c = this.f7997b.c(size, i8);
                    return;
                }
                this.f7998c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
