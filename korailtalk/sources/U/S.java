package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class S extends Q {
    S(Context context) {
        super(context);
    }

    @Override // u.Q, u.T, u.P.b
    public CameraCharacteristics getCameraCharacteristics(String str) throws C6386i {
        try {
            return this.f36981a.getCameraCharacteristics(str);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }

    @Override // u.Q, u.T, u.P.b
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C6386i, CameraAccessException {
        try {
            this.f36981a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }
}
