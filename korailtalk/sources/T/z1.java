package t;

/* loaded from: classes.dex */
class z1 implements androidx.camera.core.u1 {

    /* renamed from: a, reason: collision with root package name */
    private float f36861a;

    /* renamed from: b, reason: collision with root package name */
    private final float f36862b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36863c;

    /* renamed from: d, reason: collision with root package name */
    private float f36864d;

    z1(float f8, float f9) {
        this.f36862b = f8;
        this.f36863c = f9;
    }

    private float a(float f8) {
        float f9 = this.f36862b;
        float f10 = this.f36863c;
        if (f9 == f10) {
            return 0.0f;
        }
        if (f8 == f9) {
            return 1.0f;
        }
        if (f8 == f10) {
            return 0.0f;
        }
        float f11 = 1.0f / f10;
        return ((1.0f / f8) - f11) / ((1.0f / f9) - f11);
    }

    private float b(float f8) {
        if (f8 == 1.0f) {
            return this.f36862b;
        }
        if (f8 == 0.0f) {
            return this.f36863c;
        }
        float f9 = this.f36862b;
        float f10 = this.f36863c;
        double d9 = 1.0f / f10;
        return (float) X.a.clamp(1.0d / (d9 + (((1.0f / f9) - d9) * f8)), f10, f9);
    }

    void c(float f8) {
        if (f8 <= 1.0f && f8 >= 0.0f) {
            this.f36864d = f8;
            this.f36861a = b(f8);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f8 + " is not within valid range [0..1]");
        }
    }

    void d(float f8) {
        if (f8 <= this.f36862b && f8 >= this.f36863c) {
            this.f36861a = f8;
            this.f36864d = a(f8);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f8 + " is not within valid range [" + this.f36863c + " , " + this.f36862b + "]");
    }

    @Override // androidx.camera.core.u1
    public float getLinearZoom() {
        return this.f36864d;
    }

    @Override // androidx.camera.core.u1
    public float getMaxZoomRatio() {
        return this.f36862b;
    }

    @Override // androidx.camera.core.u1
    public float getMinZoomRatio() {
        return this.f36863c;
    }

    @Override // androidx.camera.core.u1
    public float getZoomRatio() {
        return this.f36861a;
    }
}
