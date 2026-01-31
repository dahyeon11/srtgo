package j7;

/* loaded from: classes3.dex */
final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final float f33503a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33504b;

    public e(float f8, float f9) {
        this.f33503a = f8;
        this.f33504b = f9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.f, j7.g, j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f33503a != eVar.f33503a || this.f33504b != eVar.f33504b) {
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
        return (Float.hashCode(this.f33503a) * 31) + Float.hashCode(this.f33504b);
    }

    @Override // j7.f, j7.g, j7.r
    public boolean isEmpty() {
        return this.f33503a > this.f33504b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.f
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f33503a + ".." + this.f33504b;
    }

    public boolean contains(float f8) {
        return f8 >= this.f33503a && f8 <= this.f33504b;
    }

    @Override // j7.f, j7.g
    public Float getEndInclusive() {
        return Float.valueOf(this.f33504b);
    }

    @Override // j7.f, j7.g, j7.r
    public Float getStart() {
        return Float.valueOf(this.f33503a);
    }

    public boolean lessThanOrEquals(float f8, float f9) {
        return f8 <= f9;
    }
}
