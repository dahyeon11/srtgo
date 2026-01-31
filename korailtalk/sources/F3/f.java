package F3;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f1139a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1140b;

    public f(int i8, int i9) {
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException();
        }
        this.f1139a = i8;
        this.f1140b = i9;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f1139a == fVar.f1139a && this.f1140b == fVar.f1140b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f1140b;
    }

    public int getWidth() {
        return this.f1139a;
    }

    public int hashCode() {
        return (this.f1139a * 32713) + this.f1140b;
    }

    public String toString() {
        return this.f1139a + "x" + this.f1140b;
    }
}
