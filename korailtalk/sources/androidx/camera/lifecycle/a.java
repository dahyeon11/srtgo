package androidx.camera.lifecycle;

import C.e;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.InterfaceC1025n;

/* loaded from: classes.dex */
final class a extends LifecycleCameraRepository.a {

    /* renamed from: a */
    private final InterfaceC1025n f7920a;

    /* renamed from: b */
    private final e.b f7921b;

    a(InterfaceC1025n interfaceC1025n, e.b bVar) {
        if (interfaceC1025n == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f7920a = interfaceC1025n;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f7921b = bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.a)) {
            return false;
        }
        LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
        return this.f7920a.equals(aVar.getLifecycleOwner()) && this.f7921b.equals(aVar.getCameraId());
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public e.b getCameraId() {
        return this.f7921b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public InterfaceC1025n getLifecycleOwner() {
        return this.f7920a;
    }

    public int hashCode() {
        return ((this.f7920a.hashCode() ^ 1000003) * 1000003) ^ this.f7921b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f7920a + ", cameraId=" + this.f7921b + "}";
    }
}
