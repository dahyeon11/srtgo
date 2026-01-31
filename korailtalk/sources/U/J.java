package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import u.C6387j;
import u.L;
import v.C6422a;

/* loaded from: classes.dex */
class J extends I {
    J(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static J e(CameraDevice cameraDevice, Handler handler) {
        return new J(cameraDevice, new L.a(handler));
    }

    @Override // u.I, u.L, u.C6373D.a
    public void createCaptureSession(v.g gVar) throws C6386i, CameraAccessException {
        L.b(this.f36967a, gVar);
        C6387j.c cVar = new C6387j.c(gVar.getExecutor(), gVar.getStateCallback());
        List<v.b> outputConfigurations = gVar.getOutputConfigurations();
        Handler handler = ((L.a) Z.h.checkNotNull((L.a) this.f36968b)).f36969a;
        C6422a inputConfiguration = gVar.getInputConfiguration();
        try {
            if (inputConfiguration != null) {
                InputConfiguration inputConfiguration2 = (InputConfiguration) inputConfiguration.unwrap();
                Z.h.checkNotNull(inputConfiguration2);
                this.f36967a.createReprocessableCaptureSessionByConfigurations(inputConfiguration2, v.g.transformFromCompat(outputConfigurations), cVar, handler);
            } else if (gVar.getSessionType() == 1) {
                this.f36967a.createConstrainedHighSpeedCaptureSession(L.d(outputConfigurations), cVar, handler);
            } else {
                this.f36967a.createCaptureSessionByOutputConfigurations(v.g.transformFromCompat(outputConfigurations), cVar, handler);
            }
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }
}
