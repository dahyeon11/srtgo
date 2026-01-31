package n1;

/* renamed from: n1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5933i extends AbstractC5944t {

    /* renamed from: a, reason: collision with root package name */
    private final long f34194a;

    C5933i(long j8) {
        this.f34194a = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC5944t) && this.f34194a == ((AbstractC5944t) obj).zza();
    }

    public int hashCode() {
        long j8 = this.f34194a;
        return ((int) (j8 ^ (j8 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f34194a + "}";
    }

    @Override // n1.AbstractC5944t
    public long zza() {
        return this.f34194a;
    }
}
