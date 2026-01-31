package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.utils.h;

/* renamed from: androidx.camera.core.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0916z0 implements InterfaceC0897p0 {
    AbstractC0916z0() {
    }

    public static InterfaceC0897p0 create(z.J0 j02, long j8, int i8, Matrix matrix) {
        return new C0880h(j02, j8, i8, matrix);
    }

    @Override // androidx.camera.core.InterfaceC0897p0
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.InterfaceC0897p0
    public abstract Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.InterfaceC0897p0
    public abstract z.J0 getTagBundle();

    @Override // androidx.camera.core.InterfaceC0897p0
    public abstract long getTimestamp();

    @Override // androidx.camera.core.InterfaceC0897p0
    public void populateExifData(h.b bVar) {
        bVar.setOrientationDegrees(getRotationDegrees());
    }
}
