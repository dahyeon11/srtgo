package v;

import Z.h;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes.dex */
class e extends d {
    e(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    static e f(OutputConfiguration outputConfiguration) {
        return new e(outputConfiguration);
    }

    @Override // v.d, v.f, v.b.a
    public int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // v.d, v.c, v.f, v.b.a
    public Object getOutputConfiguration() {
        h.checkArgument(this.f37187a instanceof OutputConfiguration);
        return this.f37187a;
    }

    @Override // v.d, v.c, v.f, v.b.a
    public String getPhysicalCameraId() {
        return null;
    }

    @Override // v.d, v.f, v.b.a
    public void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // v.d, v.c, v.f, v.b.a
    public void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    e(Object obj) {
        super(obj);
    }
}
