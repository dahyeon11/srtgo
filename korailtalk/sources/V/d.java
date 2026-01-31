package v;

import Z.h;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.core.B0;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class d extends c {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f37185a;

        /* renamed from: b, reason: collision with root package name */
        String f37186b;

        a(OutputConfiguration outputConfiguration) {
            this.f37185a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f37185a, aVar.f37185a) && Objects.equals(this.f37186b, aVar.f37186b);
        }

        public int hashCode() {
            int iHashCode = this.f37185a.hashCode() ^ 31;
            int i8 = (iHashCode << 5) - iHashCode;
            String str = this.f37186b;
            return (str == null ? 0 : str.hashCode()) ^ i8;
        }
    }

    d(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    private static int c() throws NoSuchFieldException, SecurityException {
        Field declaredField = OutputConfiguration.class.getDeclaredField("MAX_SURFACES_COUNT");
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    private static List d(OutputConfiguration outputConfiguration) throws NoSuchFieldException, SecurityException {
        Field declaredField = OutputConfiguration.class.getDeclaredField("mSurfaces");
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    static d e(OutputConfiguration outputConfiguration) {
        return new d(new a(outputConfiguration));
    }

    @Override // v.c, v.f
    final boolean a() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // v.f, v.b.a
    public void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // v.c, v.f, v.b.a
    public void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // v.f, v.b.a
    public int getMaxSharedSurfaceCount() {
        try {
            return c();
        } catch (IllegalAccessException | NoSuchFieldException e8) {
            B0.e("OutputConfigCompat", "Unable to retrieve max shared surface count.", e8);
            return super.getMaxSharedSurfaceCount();
        }
    }

    @Override // v.c, v.f, v.b.a
    public Object getOutputConfiguration() {
        h.checkArgument(this.f37187a instanceof a);
        return ((a) this.f37187a).f37185a;
    }

    @Override // v.c, v.f, v.b.a
    public String getPhysicalCameraId() {
        return ((a) this.f37187a).f37186b;
    }

    @Override // v.c, v.f, v.b.a
    public List<Surface> getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // v.f, v.b.a
    public void removeSurface(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        try {
            if (d((OutputConfiguration) getOutputConfiguration()).remove(surface)) {
            } else {
                throw new IllegalArgumentException("Surface is not part of this output configuration");
            }
        } catch (IllegalAccessException | NoSuchFieldException e8) {
            B0.e("OutputConfigCompat", "Unable to remove surface from this output configuration.", e8);
        }
    }

    @Override // v.c, v.f, v.b.a
    public void setPhysicalCameraId(String str) {
        ((a) this.f37187a).f37186b = str;
    }

    d(Object obj) {
        super(obj);
    }
}
