package u;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;

/* renamed from: u.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6370A extends C6371B {
    C6370A(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // u.C6371B, u.C6372C.a
    public Set<String> getPhysicalCameraIds() {
        return this.f36952a.getPhysicalCameraIds();
    }
}
