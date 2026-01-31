package androidx.camera.core.impl.utils;

import androidx.camera.core.B0;

/* loaded from: classes.dex */
public abstract class c {
    public static int degreesToSurfaceRotation(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 90) {
            return 1;
        }
        if (i8 == 180) {
            return 2;
        }
        if (i8 == 270) {
            return 3;
        }
        throw new IllegalStateException("Invalid sensor rotation: " + i8);
    }

    public static int getRelativeImageRotation(int i8, int i9, boolean z8) {
        int i10 = z8 ? ((i9 - i8) + 360) % 360 : (i9 + i8) % 360;
        if (B0.isDebugEnabled("CameraOrientationUtil")) {
            B0.d("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i8), Integer.valueOf(i9), Boolean.valueOf(z8), Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int surfaceRotationToDegrees(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 1) {
            return 90;
        }
        if (i8 == 2) {
            return 180;
        }
        if (i8 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i8);
    }
}
