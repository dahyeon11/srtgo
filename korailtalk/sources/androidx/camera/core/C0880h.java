package androidx.camera.core;

import android.graphics.Matrix;

/* renamed from: androidx.camera.core.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0880h extends AbstractC0916z0 {

    /* renamed from: a, reason: collision with root package name */
    private final z.J0 f7633a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7634b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7635c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f7636d;

    C0880h(z.J0 j02, long j8, int i8, Matrix matrix) {
        if (j02 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f7633a = j02;
        this.f7634b = j8;
        this.f7635c = i8;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f7636d = matrix;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0916z0)) {
            return false;
        }
        AbstractC0916z0 abstractC0916z0 = (AbstractC0916z0) obj;
        return this.f7633a.equals(abstractC0916z0.getTagBundle()) && this.f7634b == abstractC0916z0.getTimestamp() && this.f7635c == abstractC0916z0.getRotationDegrees() && this.f7636d.equals(abstractC0916z0.getSensorToBufferTransformMatrix());
    }

    @Override // androidx.camera.core.AbstractC0916z0, androidx.camera.core.InterfaceC0897p0
    public int getRotationDegrees() {
        return this.f7635c;
    }

    @Override // androidx.camera.core.AbstractC0916z0, androidx.camera.core.InterfaceC0897p0
    public Matrix getSensorToBufferTransformMatrix() {
        return this.f7636d;
    }

    @Override // androidx.camera.core.AbstractC0916z0, androidx.camera.core.InterfaceC0897p0
    public z.J0 getTagBundle() {
        return this.f7633a;
    }

    @Override // androidx.camera.core.AbstractC0916z0, androidx.camera.core.InterfaceC0897p0
    public long getTimestamp() {
        return this.f7634b;
    }

    public int hashCode() {
        int iHashCode = (this.f7633a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f7634b;
        return ((((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f7635c) * 1000003) ^ this.f7636d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f7633a + ", timestamp=" + this.f7634b + ", rotationDegrees=" + this.f7635c + ", sensorToBufferTransformMatrix=" + this.f7636d + "}";
    }
}
