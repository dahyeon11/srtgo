package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class Q extends T {
    Q(Context context) {
        super(context, null);
    }

    static Q b(Context context) {
        return new Q(context);
    }

    private boolean c(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && d(th);
    }

    private static boolean d(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void e(Throwable th) throws C6386i {
        throw new C6386i(C6386i.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, th);
    }

    @Override // u.T, u.P.b
    public CameraCharacteristics getCameraCharacteristics(String str) throws C6386i {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e8) {
            if (c(e8)) {
                e(e8);
            }
            throw e8;
        }
    }

    @Override // u.T, u.P.b
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C6386i, CameraAccessException {
        try {
            this.f36981a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        } catch (IllegalArgumentException e9) {
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (c(e11)) {
                e(e11);
            }
            throw e11;
        }
    }

    @Override // u.T, u.P.b
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f36981a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // u.T, u.P.b
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f36981a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
