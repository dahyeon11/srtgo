package com.google.android.material.bottomappbar;

import a3.f;
import a3.m;

/* loaded from: classes2.dex */
public class a extends f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private float f24398a;

    /* renamed from: b, reason: collision with root package name */
    private float f24399b;

    /* renamed from: c, reason: collision with root package name */
    private float f24400c;

    /* renamed from: d, reason: collision with root package name */
    private float f24401d;

    /* renamed from: e, reason: collision with root package name */
    private float f24402e;

    public a(float f8, float f9, float f10) {
        this.f24399b = f8;
        this.f24398a = f9;
        e(f10);
        this.f24402e = 0.0f;
    }

    float b() {
        return this.f24401d;
    }

    float c() {
        return this.f24399b;
    }

    float d() {
        return this.f24398a;
    }

    void e(float f8) {
        if (f8 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f24401d = f8;
    }

    void f(float f8) {
        this.f24399b = f8;
    }

    void g(float f8) {
        this.f24398a = f8;
    }

    @Override // a3.f
    public void getEdgePath(float f8, float f9, float f10, m mVar) {
        float f11 = this.f24400c;
        if (f11 == 0.0f) {
            mVar.lineTo(f8, 0.0f);
            return;
        }
        float f12 = ((this.f24399b * 2.0f) + f11) / 2.0f;
        float f13 = f10 * this.f24398a;
        float f14 = f9 + this.f24402e;
        float f15 = (this.f24401d * f10) + ((1.0f - f10) * f12);
        if (f15 / f12 >= 1.0f) {
            mVar.lineTo(f8, 0.0f);
            return;
        }
        float f16 = f12 + f13;
        float f17 = f15 + f13;
        float fSqrt = (float) Math.sqrt((f16 * f16) - (f17 * f17));
        float f18 = f14 - fSqrt;
        float f19 = f14 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f17));
        float f20 = 90.0f - degrees;
        mVar.lineTo(f18, 0.0f);
        float f21 = f13 * 2.0f;
        mVar.addArc(f18 - f13, 0.0f, f18 + f13, f21, 270.0f, degrees);
        mVar.addArc(f14 - f12, (-f12) - f15, f14 + f12, f12 - f15, 180.0f - f20, (f20 * 2.0f) - 180.0f);
        mVar.addArc(f19 - f13, 0.0f, f19 + f13, f21, 270.0f - degrees, degrees);
        mVar.lineTo(f8, 0.0f);
    }

    public float getFabDiameter() {
        return this.f24400c;
    }

    public float getHorizontalOffset() {
        return this.f24402e;
    }

    void h(float f8) {
        this.f24402e = f8;
    }

    public void setFabDiameter(float f8) {
        this.f24400c = f8;
    }
}
