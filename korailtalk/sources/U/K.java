package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
class K extends J {
    K(CameraDevice cameraDevice) {
        super((CameraDevice) Z.h.checkNotNull(cameraDevice), null);
    }

    @Override // u.J, u.I, u.L, u.C6373D.a
    public void createCaptureSession(v.g gVar) throws C6386i, CameraAccessException {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.unwrap();
        Z.h.checkNotNull(sessionConfiguration);
        try {
            this.f36967a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }
}
