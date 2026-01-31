package y;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.r;
import java.util.Map;
import t.S;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final S f37550a;

    public j(S s8) {
        this.f37550a = s8;
    }

    public static CameraCharacteristics extractCameraCharacteristics(r rVar) {
        Z.h.checkState(rVar instanceof S, "CameraInfo does not contain any Camera2 information.");
        return ((S) rVar).getCameraCharacteristicsCompat().toCameraCharacteristics();
    }

    public static j from(r rVar) {
        Z.h.checkArgument(rVar instanceof S, "CameraInfo doesn't contain Camera2 implementation.");
        return ((S) rVar).getCamera2CameraInfo();
    }

    public <T> T getCameraCharacteristic(CameraCharacteristics.Key<T> key) {
        return (T) this.f37550a.getCameraCharacteristicsCompat().get(key);
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        return this.f37550a.getCameraCharacteristicsMap();
    }

    public String getCameraId() {
        return this.f37550a.getCameraId();
    }
}
