package p1;

import p1.g;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6050b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f34570a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34571b;

    C6050b(g.a aVar, long j8) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f34570a = aVar;
        this.f34571b = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f34570a.equals(gVar.getStatus()) && this.f34571b == gVar.getNextRequestWaitMillis();
    }

    @Override // p1.g
    public long getNextRequestWaitMillis() {
        return this.f34571b;
    }

    @Override // p1.g
    public g.a getStatus() {
        return this.f34570a;
    }

    public int hashCode() {
        int iHashCode = (this.f34570a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f34571b;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f34570a + ", nextRequestWaitMillis=" + this.f34571b + "}";
    }
}
