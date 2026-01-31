package M3;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final float f3125a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3126b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3127c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3128d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3129e;

    /* renamed from: f, reason: collision with root package name */
    private final float f3130f;

    /* renamed from: g, reason: collision with root package name */
    private final float f3131g;

    /* renamed from: h, reason: collision with root package name */
    private final float f3132h;

    /* renamed from: i, reason: collision with root package name */
    private final float f3133i;

    private k(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f3125a = f8;
        this.f3126b = f11;
        this.f3127c = f14;
        this.f3128d = f9;
        this.f3129e = f12;
        this.f3130f = f15;
        this.f3131g = f10;
        this.f3132h = f13;
        this.f3133i = f16;
    }

    public static k quadrilateralToQuadrilateral(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        return squareToQuadrilateral(f16, f17, f18, f19, f20, f21, f22, f23).b(quadrilateralToSquare(f8, f9, f10, f11, f12, f13, f14, f15));
    }

    public static k quadrilateralToSquare(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        return squareToQuadrilateral(f8, f9, f10, f11, f12, f13, f14, f15).a();
    }

    public static k squareToQuadrilateral(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((f8 - f10) + f12) - f14;
        float f17 = ((f9 - f11) + f13) - f15;
        if (f16 == 0.0f && f17 == 0.0f) {
            return new k(f10 - f8, f12 - f10, f8, f11 - f9, f13 - f11, f9, 0.0f, 0.0f, 1.0f);
        }
        float f18 = f10 - f12;
        float f19 = f14 - f12;
        float f20 = f11 - f13;
        float f21 = f15 - f13;
        float f22 = (f18 * f21) - (f19 * f20);
        float f23 = ((f21 * f16) - (f19 * f17)) / f22;
        float f24 = ((f18 * f17) - (f16 * f20)) / f22;
        return new k((f23 * f10) + (f10 - f8), (f24 * f14) + (f14 - f8), f8, (f11 - f9) + (f23 * f11), (f15 - f9) + (f24 * f15), f9, f23, f24, 1.0f);
    }

    k a() {
        float f8 = this.f3129e;
        float f9 = this.f3133i;
        float f10 = this.f3130f;
        float f11 = this.f3132h;
        float f12 = (f8 * f9) - (f10 * f11);
        float f13 = this.f3131g;
        float f14 = this.f3128d;
        float f15 = (f10 * f13) - (f14 * f9);
        float f16 = (f14 * f11) - (f8 * f13);
        float f17 = this.f3127c;
        float f18 = this.f3126b;
        float f19 = (f17 * f11) - (f18 * f9);
        float f20 = this.f3125a;
        return new k(f12, f15, f16, f19, (f9 * f20) - (f17 * f13), (f13 * f18) - (f11 * f20), (f18 * f10) - (f17 * f8), (f17 * f14) - (f10 * f20), (f20 * f8) - (f18 * f14));
    }

    k b(k kVar) {
        float f8 = this.f3125a;
        float f9 = kVar.f3125a;
        float f10 = this.f3128d;
        float f11 = kVar.f3126b;
        float f12 = this.f3131g;
        float f13 = kVar.f3127c;
        float f14 = (f8 * f9) + (f10 * f11) + (f12 * f13);
        float f15 = kVar.f3128d;
        float f16 = kVar.f3129e;
        float f17 = kVar.f3130f;
        float f18 = (f8 * f15) + (f10 * f16) + (f12 * f17);
        float f19 = kVar.f3131g;
        float f20 = kVar.f3132h;
        float f21 = kVar.f3133i;
        float f22 = (f8 * f19) + (f10 * f20) + (f12 * f21);
        float f23 = this.f3126b;
        float f24 = this.f3129e;
        float f25 = this.f3132h;
        float f26 = (f23 * f9) + (f24 * f11) + (f25 * f13);
        float f27 = (f23 * f15) + (f24 * f16) + (f25 * f17);
        float f28 = (f25 * f21) + (f23 * f19) + (f24 * f20);
        float f29 = this.f3127c;
        float f30 = this.f3130f;
        float f31 = (f9 * f29) + (f11 * f30);
        float f32 = this.f3133i;
        return new k(f14, f18, f22, f26, f27, f28, (f13 * f32) + f31, (f15 * f29) + (f16 * f30) + (f17 * f32), (f29 * f19) + (f30 * f20) + (f32 * f21));
    }

    public void transformPoints(float[] fArr) {
        int length = fArr.length;
        float f8 = this.f3125a;
        float f9 = this.f3126b;
        float f10 = this.f3127c;
        float f11 = this.f3128d;
        float f12 = this.f3129e;
        float f13 = this.f3130f;
        float f14 = this.f3131g;
        float f15 = this.f3132h;
        float f16 = this.f3133i;
        for (int i8 = 0; i8 < length; i8 += 2) {
            float f17 = fArr[i8];
            int i9 = i8 + 1;
            float f18 = fArr[i9];
            float f19 = (f10 * f17) + (f13 * f18) + f16;
            fArr[i8] = (((f8 * f17) + (f11 * f18)) + f14) / f19;
            fArr[i9] = (((f17 * f9) + (f18 * f12)) + f15) / f19;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f8 = fArr[i8];
            float f9 = fArr2[i8];
            float f10 = (this.f3127c * f8) + (this.f3130f * f9) + this.f3133i;
            fArr[i8] = (((this.f3125a * f8) + (this.f3128d * f9)) + this.f3131g) / f10;
            fArr2[i8] = (((this.f3126b * f8) + (this.f3129e * f9)) + this.f3132h) / f10;
        }
    }
}
