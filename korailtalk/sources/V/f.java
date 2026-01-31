package v;

import Z.h;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import v.b;

/* loaded from: classes.dex */
abstract class f implements b.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f37187a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List f37188a;

        /* renamed from: b, reason: collision with root package name */
        String f37189b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37190c;
    }

    f(Object obj) {
        this.f37187a = obj;
    }

    abstract boolean a();

    @Override // v.b.a
    public void addSurface(Surface surface) {
        h.checkNotNull(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!a()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // v.b.a
    public void enableSurfaceSharing() {
        ((a) this.f37187a).f37190c = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return Objects.equals(this.f37187a, ((f) obj).f37187a);
        }
        return false;
    }

    @Override // v.b.a
    public int getMaxSharedSurfaceCount() {
        return 1;
    }

    @Override // v.b.a
    public Object getOutputConfiguration() {
        return null;
    }

    @Override // v.b.a
    public String getPhysicalCameraId() {
        return ((a) this.f37187a).f37189b;
    }

    @Override // v.b.a
    public Surface getSurface() {
        List list = ((a) this.f37187a).f37188a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    @Override // v.b.a
    public int getSurfaceGroupId() {
        return -1;
    }

    @Override // v.b.a
    public List<Surface> getSurfaces() {
        return ((a) this.f37187a).f37188a;
    }

    public int hashCode() {
        return this.f37187a.hashCode();
    }

    @Override // v.b.a
    public void removeSurface(Surface surface) {
        if (getSurface() != surface) {
            throw new IllegalArgumentException("Surface is not part of this output configuration");
        }
        throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // v.b.a
    public void setPhysicalCameraId(String str) {
        ((a) this.f37187a).f37189b = str;
    }
}
