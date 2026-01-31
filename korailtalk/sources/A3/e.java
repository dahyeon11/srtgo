package a3;

/* loaded from: classes2.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    float f5866a;

    public e() {
        this.f5866a = -1.0f;
    }

    @Override // a3.d
    public void getCornerPath(m mVar, float f8, float f9, float f10) {
        mVar.reset(0.0f, f10 * f9, 180.0f, 180.0f - f8);
        double d9 = f10;
        double d10 = f9;
        mVar.lineTo((float) (Math.sin(Math.toRadians(f8)) * d9 * d10), (float) (Math.sin(Math.toRadians(90.0f - f8)) * d9 * d10));
    }

    @Deprecated
    public e(float f8) {
        this.f5866a = f8;
    }
}
