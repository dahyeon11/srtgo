package u;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: u.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6372C {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36953a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final a f36954b;

    /* renamed from: u.C$a */
    public interface a {
        <T> T get(CameraCharacteristics.Key<T> key);

        Set<String> getPhysicalCameraIds();

        CameraCharacteristics unwrap();
    }

    private C6372C(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36954b = new C6370A(cameraCharacteristics);
        } else {
            this.f36954b = new C6371B(cameraCharacteristics);
        }
    }

    private boolean a(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static C6372C toCameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics) {
        return new C6372C(cameraCharacteristics);
    }

    public <T> T get(CameraCharacteristics.Key<T> key) {
        if (a(key)) {
            return (T) this.f36954b.get(key);
        }
        synchronized (this) {
            try {
                T t8 = (T) this.f36953a.get(key);
                if (t8 != null) {
                    return t8;
                }
                T t9 = (T) this.f36954b.get(key);
                if (t9 != null) {
                    this.f36953a.put(key, t9);
                }
                return t9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<String> getPhysicalCameraIds() {
        return this.f36954b.getPhysicalCameraIds();
    }

    public CameraCharacteristics toCameraCharacteristics() {
        return this.f36954b.unwrap();
    }
}
