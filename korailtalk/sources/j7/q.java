package j7;

/* loaded from: classes3.dex */
final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    private final float f33527a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33528b;

    public q(float f8, float f9) {
        this.f33527a = f8;
        this.f33528b = f9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            if (!isEmpty() || !((q) obj).isEmpty()) {
                q qVar = (q) obj;
                if (this.f33527a != qVar.f33527a || this.f33528b != qVar.f33528b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f33527a) * 31) + Float.hashCode(this.f33528b);
    }

    @Override // j7.r
    public boolean isEmpty() {
        return this.f33527a >= this.f33528b;
    }

    public String toString() {
        return this.f33527a + "..<" + this.f33528b;
    }

    public boolean contains(float f8) {
        return f8 >= this.f33527a && f8 < this.f33528b;
    }

    @Override // j7.r
    public Float getEndExclusive() {
        return Float.valueOf(this.f33528b);
    }

    @Override // j7.r
    public Float getStart() {
        return Float.valueOf(this.f33527a);
    }
}
