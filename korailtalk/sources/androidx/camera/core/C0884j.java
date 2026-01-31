package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.g1;

/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
final class C0884j extends g1.f {

    /* renamed from: a */
    private final int f7719a;

    /* renamed from: b */
    private final Surface f7720b;

    C0884j(int i8, Surface surface) {
        this.f7719a = i8;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f7720b = surface;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1.f)) {
            return false;
        }
        g1.f fVar = (g1.f) obj;
        return this.f7719a == fVar.getResultCode() && this.f7720b.equals(fVar.getSurface());
    }

    @Override // androidx.camera.core.g1.f
    public int getResultCode() {
        return this.f7719a;
    }

    @Override // androidx.camera.core.g1.f
    public Surface getSurface() {
        return this.f7720b;
    }

    public int hashCode() {
        return ((this.f7719a ^ 1000003) * 1000003) ^ this.f7720b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f7719a + ", surface=" + this.f7720b + "}";
    }
}
