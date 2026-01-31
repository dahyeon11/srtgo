package j7;

/* loaded from: classes3.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final double f33501a;

    /* renamed from: b, reason: collision with root package name */
    private final double f33502b;

    public d(double d9, double d10) {
        this.f33501a = d9;
        this.f33502b = d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.f, j7.g, j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f33501a != dVar.f33501a || this.f33502b != dVar.f33502b) {
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
        return (Double.hashCode(this.f33501a) * 31) + Double.hashCode(this.f33502b);
    }

    @Override // j7.f, j7.g, j7.r
    public boolean isEmpty() {
        return this.f33501a > this.f33502b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.f
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        return this.f33501a + ".." + this.f33502b;
    }

    public boolean contains(double d9) {
        return d9 >= this.f33501a && d9 <= this.f33502b;
    }

    @Override // j7.f, j7.g
    public Double getEndInclusive() {
        return Double.valueOf(this.f33502b);
    }

    @Override // j7.f, j7.g, j7.r
    public Double getStart() {
        return Double.valueOf(this.f33501a);
    }

    public boolean lessThanOrEquals(double d9, double d10) {
        return d9 <= d10;
    }
}
