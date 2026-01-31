package u;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6379b {
    public static void onSurfacePrepared(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
