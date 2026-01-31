package C;

import android.graphics.Matrix;
import androidx.camera.core.InterfaceC0897p0;
import androidx.camera.core.impl.utils.h;
import z.InterfaceC6600q;
import z.J0;

/* loaded from: classes.dex */
public final class b implements InterfaceC0897p0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6600q f383a;

    public b(InterfaceC6600q interfaceC6600q) {
        this.f383a = interfaceC6600q;
    }

    public InterfaceC6600q getCameraCaptureResult() {
        return this.f383a;
    }

    @Override // androidx.camera.core.InterfaceC0897p0
    public int getRotationDegrees() {
        return 0;
    }

    @Override // androidx.camera.core.InterfaceC0897p0
    public Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }

    @Override // androidx.camera.core.InterfaceC0897p0
    public J0 getTagBundle() {
        return this.f383a.getTagBundle();
    }

    @Override // androidx.camera.core.InterfaceC0897p0
    public long getTimestamp() {
        return this.f383a.getTimestamp();
    }

    @Override // androidx.camera.core.InterfaceC0897p0
    public void populateExifData(h.b bVar) {
        this.f383a.populateExifData(bVar);
    }
}
