package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: androidx.camera.core.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0882i extends R0 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f7654a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f7655b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7656c;

    C0882i(Size size, Rect rect, int i8) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.f7654a = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f7655b = rect;
        this.f7656c = i8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r02 = (R0) obj;
        return this.f7654a.equals(r02.getResolution()) && this.f7655b.equals(r02.getCropRect()) && this.f7656c == r02.getRotationDegrees();
    }

    @Override // androidx.camera.core.R0
    public Rect getCropRect() {
        return this.f7655b;
    }

    @Override // androidx.camera.core.R0
    public Size getResolution() {
        return this.f7654a;
    }

    @Override // androidx.camera.core.R0
    public int getRotationDegrees() {
        return this.f7656c;
    }

    public int hashCode() {
        return ((((this.f7654a.hashCode() ^ 1000003) * 1000003) ^ this.f7655b.hashCode()) * 1000003) ^ this.f7656c;
    }

    public String toString() {
        return "ResolutionInfo{resolution=" + this.f7654a + ", cropRect=" + this.f7655b + ", rotationDegrees=" + this.f7656c + "}";
    }
}
