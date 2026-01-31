package u;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;
import u.C6372C;

/* renamed from: u.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6371B implements C6372C.a {

    /* renamed from: a, reason: collision with root package name */
    protected final CameraCharacteristics f36952a;

    C6371B(CameraCharacteristics cameraCharacteristics) {
        this.f36952a = cameraCharacteristics;
    }

    @Override // u.C6372C.a
    public <T> T get(CameraCharacteristics.Key<T> key) {
        return (T) this.f36952a.get(key);
    }

    @Override // u.C6372C.a
    public Set<String> getPhysicalCameraIds() {
        return Collections.emptySet();
    }

    @Override // u.C6372C.a
    public CameraCharacteristics unwrap() {
        return this.f36952a;
    }
}
