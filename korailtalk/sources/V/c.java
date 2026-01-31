package v;

import Z.h;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class c extends f {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f37182a;

        /* renamed from: b, reason: collision with root package name */
        String f37183b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37184c;

        a(OutputConfiguration outputConfiguration) {
            this.f37182a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f37182a, aVar.f37182a) && this.f37184c == aVar.f37184c && Objects.equals(this.f37183b, aVar.f37183b);
        }

        public int hashCode() {
            int iHashCode = this.f37182a.hashCode() ^ 31;
            int i8 = (this.f37184c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i9 = (i8 << 5) - i8;
            String str = this.f37183b;
            return (str == null ? 0 : str.hashCode()) ^ i9;
        }
    }

    c(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    static c b(OutputConfiguration outputConfiguration) {
        return new c(new a(outputConfiguration));
    }

    @Override // v.f
    boolean a() {
        return ((a) this.f37187a).f37184c;
    }

    @Override // v.f, v.b.a
    public void enableSurfaceSharing() {
        ((a) this.f37187a).f37184c = true;
    }

    @Override // v.f, v.b.a
    public Object getOutputConfiguration() {
        h.checkArgument(this.f37187a instanceof a);
        return ((a) this.f37187a).f37182a;
    }

    @Override // v.f, v.b.a
    public String getPhysicalCameraId() {
        return ((a) this.f37187a).f37183b;
    }

    @Override // v.f, v.b.a
    public Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // v.f, v.b.a
    public int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // v.f, v.b.a
    public List<Surface> getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    @Override // v.f, v.b.a
    public void setPhysicalCameraId(String str) {
        ((a) this.f37187a).f37183b = str;
    }

    c(Object obj) {
        super(obj);
    }
}
