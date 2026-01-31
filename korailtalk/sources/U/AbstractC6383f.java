package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6383f {
    public static <T> OutputConfiguration newOutputConfiguration(Size size, Class<T> cls) {
        return AbstractC6382e.a(size, cls);
    }

    public static void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
