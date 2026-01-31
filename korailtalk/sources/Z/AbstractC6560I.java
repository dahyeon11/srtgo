package z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.C0903t;

/* renamed from: z.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6560I {

    /* renamed from: z.I$a */
    public static class a extends Exception {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void validateCameras(Context context, C6556E c6556e, C0903t c0903t) throws a {
        Integer lensFacing;
        if (c0903t != null) {
            try {
                lensFacing = c0903t.getLensFacing();
                if (lensFacing == null) {
                    androidx.camera.core.B0.w("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e8) {
                androidx.camera.core.B0.e("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e8);
                return;
            }
        } else {
            lensFacing = null;
        }
        androidx.camera.core.B0.d("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + lensFacing);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0903t == null || lensFacing.intValue() == 1)) {
                C0903t.DEFAULT_BACK_CAMERA.select(c6556e.getCameras());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c0903t == null || lensFacing.intValue() == 0) {
                    C0903t.DEFAULT_FRONT_CAMERA.select(c6556e.getCameras());
                }
            }
        } catch (IllegalArgumentException e9) {
            androidx.camera.core.B0.e("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c6556e.getCameras());
            throw new a("Expected camera missing from device.", e9);
        }
    }
}
