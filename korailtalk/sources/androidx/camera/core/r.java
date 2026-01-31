package androidx.camera.core;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public interface r {
    public static final String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";

    C0903t getCameraSelector();

    LiveData getCameraState();

    H getExposureState();

    String getImplementationType();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i8);

    LiveData getTorchState();

    LiveData getZoomState();

    boolean hasFlashUnit();

    default boolean isFocusMeteringSupported(J j8) {
        return false;
    }
}
