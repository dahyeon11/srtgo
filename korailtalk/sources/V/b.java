package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.util.List;
import u.AbstractC6383f;

/* loaded from: classes.dex */
public final class b {
    public static final int SURFACE_GROUP_ID_NONE = -1;

    /* renamed from: a, reason: collision with root package name */
    private final a f37181a;

    interface a {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        int getMaxSharedSurfaceCount();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(Surface surface);

        void setPhysicalCameraId(String str);
    }

    public b(Surface surface) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            this.f37181a = new e(surface);
        } else if (i8 >= 26) {
            this.f37181a = new d(surface);
        } else {
            this.f37181a = new c(surface);
        }
    }

    public static b wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        int i8 = Build.VERSION.SDK_INT;
        a aVarF = i8 >= 28 ? e.f((OutputConfiguration) obj) : i8 >= 26 ? d.e((OutputConfiguration) obj) : c.b((OutputConfiguration) obj);
        if (aVarF == null) {
            return null;
        }
        return new b(aVarF);
    }

    public void addSurface(Surface surface) {
        this.f37181a.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.f37181a.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f37181a.equals(((b) obj).f37181a);
        }
        return false;
    }

    public int getMaxSharedSurfaceCount() {
        return this.f37181a.getMaxSharedSurfaceCount();
    }

    public String getPhysicalCameraId() {
        return this.f37181a.getPhysicalCameraId();
    }

    public Surface getSurface() {
        return this.f37181a.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.f37181a.getSurfaceGroupId();
    }

    public List<Surface> getSurfaces() {
        return this.f37181a.getSurfaces();
    }

    public int hashCode() {
        return this.f37181a.hashCode();
    }

    public void removeSurface(Surface surface) {
        this.f37181a.removeSurface(surface);
    }

    public void setPhysicalCameraId(String str) {
        this.f37181a.setPhysicalCameraId(str);
    }

    public Object unwrap() {
        return this.f37181a.getOutputConfiguration();
    }

    public <T> b(Size size, Class<T> cls) {
        OutputConfiguration outputConfigurationNewOutputConfiguration = AbstractC6383f.newOutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f37181a = e.f(outputConfigurationNewOutputConfiguration);
        } else {
            this.f37181a = d.e(outputConfigurationNewOutputConfiguration);
        }
    }

    private b(a aVar) {
        this.f37181a = aVar;
    }
}
