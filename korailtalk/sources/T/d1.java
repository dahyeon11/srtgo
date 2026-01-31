package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import u.C6387j;

/* loaded from: classes.dex */
interface d1 {
    void abortCaptures();

    int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    void close();

    void finishClose();

    CameraDevice getDevice();

    a getStateCallback();

    com.google.common.util.concurrent.C getSynchronizedBlocker(String str);

    int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    void stopRepeating();

    C6387j toCameraCaptureSessionCompat();

    public static abstract class a {
        void onActive(d1 d1Var) {
        }

        void onCaptureQueueEmpty(d1 d1Var) {
        }

        void onClosed(d1 d1Var) {
        }

        void onConfigureFailed(d1 d1Var) {
        }

        void onConfigured(d1 d1Var) {
        }

        void onReady(d1 d1Var) {
        }

        void onSessionFinished(d1 d1Var) {
        }

        void onSurfacePrepared(d1 d1Var, Surface surface) {
        }
    }
}
