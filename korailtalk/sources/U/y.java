package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class y extends z {
    y(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // u.z, u.C6387j.a
    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // u.z, u.C6387j.a
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // u.z, u.C6387j.a
    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // u.z, u.C6387j.a
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
