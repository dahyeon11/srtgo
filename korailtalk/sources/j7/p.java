package j7;

/* loaded from: classes3.dex */
final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    private final double f33525a;

    /* renamed from: b, reason: collision with root package name */
    private final double f33526b;

    public p(double d9, double d10) {
        this.f33525a = d9;
        this.f33526b = d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            if (!isEmpty() || !((p) obj).isEmpty()) {
                p pVar = (p) obj;
                if (this.f33525a != pVar.f33525a || this.f33526b != pVar.f33526b) {
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
        return (Double.hashCode(this.f33525a) * 31) + Double.hashCode(this.f33526b);
    }

    @Override // j7.r
    public boolean isEmpty() {
        return this.f33525a >= this.f33526b;
    }

    public String toString() {
        return this.f33525a + "..<" + this.f33526b;
    }

    public boolean contains(double d9) {
        return d9 >= this.f33525a && d9 < this.f33526b;
    }

    @Override // j7.r
    public Double getEndExclusive() {
        return Double.valueOf(this.f33526b);
    }

    @Override // j7.r
    public Double getStart() {
        return Double.valueOf(this.f33525a);
    }
}
