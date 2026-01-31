package h4;

import F3.s;

/* loaded from: classes2.dex */
public final class d extends s {

    /* renamed from: c, reason: collision with root package name */
    private final float f31561c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31562d;

    d(float f8, float f9, float f10) {
        this(f8, f9, f10, 1);
    }

    boolean b(float f8, float f9, float f10) {
        if (Math.abs(f9 - getY()) > f8 || Math.abs(f10 - getX()) > f8) {
            return false;
        }
        float fAbs = Math.abs(f8 - this.f31561c);
        return fAbs <= 1.0f || fAbs <= this.f31561c;
    }

    d c(float f8, float f9, float f10) {
        int i8 = this.f31562d;
        int i9 = i8 + 1;
        float x8 = (i8 * getX()) + f9;
        float f11 = i9;
        return new d(x8 / f11, ((this.f31562d * getY()) + f8) / f11, ((this.f31562d * this.f31561c) + f10) / f11, i9);
    }

    int d() {
        return this.f31562d;
    }

    public float getEstimatedModuleSize() {
        return this.f31561c;
    }

    private d(float f8, float f9, float f10, int i8) {
        super(f8, f9);
        this.f31561c = f10;
        this.f31562d = i8;
    }
}
