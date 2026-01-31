package androidx.camera.core;

import android.util.Rational;

/* loaded from: classes.dex */
public class F0 {

    /* renamed from: a, reason: collision with root package name */
    private float f7411a;

    /* renamed from: b, reason: collision with root package name */
    private float f7412b;

    /* renamed from: c, reason: collision with root package name */
    private float f7413c;

    /* renamed from: d, reason: collision with root package name */
    private Rational f7414d;

    F0(float f8, float f9, float f10, Rational rational) {
        this.f7411a = f8;
        this.f7412b = f9;
        this.f7413c = f10;
        this.f7414d = rational;
    }

    public float getSize() {
        return this.f7413c;
    }

    public Rational getSurfaceAspectRatio() {
        return this.f7414d;
    }

    public float getX() {
        return this.f7411a;
    }

    public float getY() {
        return this.f7412b;
    }
}
