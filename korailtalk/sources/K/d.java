package K;

import K.f;
import android.view.Surface;

/* loaded from: classes.dex */
final class d extends f.d {

    /* renamed from: e, reason: collision with root package name */
    private final Surface f2696e;

    d(Surface surface) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f2696e = surface;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.d) {
            return this.f2696e.equals(((f.d) obj).getSurface());
        }
        return false;
    }

    @Override // K.f.d, K.p
    public Surface getSurface() {
        return this.f2696e;
    }

    public int hashCode() {
        return this.f2696e.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SurfaceConfig{surface=" + this.f2696e + "}";
    }
}
