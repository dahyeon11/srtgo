package f1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private float f30517a;

    /* renamed from: b, reason: collision with root package name */
    private int f30518b;

    public void add(float f8) {
        float f9 = this.f30517a + f8;
        this.f30517a = f9;
        int i8 = this.f30518b + 1;
        this.f30518b = i8;
        if (i8 == Integer.MAX_VALUE) {
            this.f30517a = f9 / 2.0f;
            this.f30518b = i8 / 2;
        }
    }

    public float getMean() {
        int i8 = this.f30518b;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.f30517a / i8;
    }
}
