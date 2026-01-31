package L3;

import android.hardware.Camera;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class a {
    public static final int NO_REQUESTED_CAMERA = -1;

    /* renamed from: a, reason: collision with root package name */
    private static final String f3061a = "L3.a";

    public static int getCameraId(int i8) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f3061a, "No cameras!");
            return -1;
        }
        boolean z8 = i8 >= 0;
        if (!z8) {
            i8 = 0;
            while (i8 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i8, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i8++;
            }
        }
        return i8 < numberOfCameras ? i8 : z8 ? -1 : 0;
    }

    public static Camera open(int i8) {
        int cameraId = getCameraId(i8);
        if (cameraId == -1) {
            return null;
        }
        return Camera.open(cameraId);
    }
}
