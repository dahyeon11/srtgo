package g1;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5537d {

    /* renamed from: a, reason: collision with root package name */
    private float f31275a;

    /* renamed from: b, reason: collision with root package name */
    private float f31276b;

    public C5537d(float f8, float f9) {
        this.f31275a = f8;
        this.f31276b = f9;
    }

    public boolean equals(float f8, float f9) {
        return this.f31275a == f8 && this.f31276b == f9;
    }

    public float getScaleX() {
        return this.f31275a;
    }

    public float getScaleY() {
        return this.f31276b;
    }

    public void set(float f8, float f9) {
        this.f31275a = f8;
        this.f31276b = f9;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public C5537d() {
        this(1.0f, 1.0f);
    }
}
