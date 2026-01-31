package C;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final float f379a;

    /* renamed from: b, reason: collision with root package name */
    private final float f380b;

    /* renamed from: c, reason: collision with root package name */
    private final float f381c;

    /* renamed from: d, reason: collision with root package name */
    private final float f382d;

    a(float f8, float f9, float f10, float f11) {
        this.f379a = f8;
        this.f380b = f9;
        this.f381c = f10;
        this.f382d = f11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.floatToIntBits(this.f379a) == Float.floatToIntBits(fVar.getZoomRatio()) && Float.floatToIntBits(this.f380b) == Float.floatToIntBits(fVar.getMaxZoomRatio()) && Float.floatToIntBits(this.f381c) == Float.floatToIntBits(fVar.getMinZoomRatio()) && Float.floatToIntBits(this.f382d) == Float.floatToIntBits(fVar.getLinearZoom());
    }

    @Override // C.f, androidx.camera.core.u1
    public float getLinearZoom() {
        return this.f382d;
    }

    @Override // C.f, androidx.camera.core.u1
    public float getMaxZoomRatio() {
        return this.f380b;
    }

    @Override // C.f, androidx.camera.core.u1
    public float getMinZoomRatio() {
        return this.f381c;
    }

    @Override // C.f, androidx.camera.core.u1
    public float getZoomRatio() {
        return this.f379a;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f379a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f380b)) * 1000003) ^ Float.floatToIntBits(this.f381c)) * 1000003) ^ Float.floatToIntBits(this.f382d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f379a + ", maxZoomRatio=" + this.f380b + ", minZoomRatio=" + this.f381c + ", linearZoom=" + this.f382d + "}";
    }
}
