package u1;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6406b extends AbstractC6412h {

    /* renamed from: a, reason: collision with root package name */
    private final long f37072a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f37073b;

    /* renamed from: c, reason: collision with root package name */
    private final o1.h f37074c;

    C6406b(long j8, o1.l lVar, o1.h hVar) {
        this.f37072a = j8;
        if (lVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f37073b = lVar;
        if (hVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f37074c = hVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6412h)) {
            return false;
        }
        AbstractC6412h abstractC6412h = (AbstractC6412h) obj;
        return this.f37072a == abstractC6412h.getId() && this.f37073b.equals(abstractC6412h.getTransportContext()) && this.f37074c.equals(abstractC6412h.getEvent());
    }

    @Override // u1.AbstractC6412h
    public o1.h getEvent() {
        return this.f37074c;
    }

    @Override // u1.AbstractC6412h
    public long getId() {
        return this.f37072a;
    }

    @Override // u1.AbstractC6412h
    public o1.l getTransportContext() {
        return this.f37073b;
    }

    public int hashCode() {
        long j8 = this.f37072a;
        return ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f37073b.hashCode()) * 1000003) ^ this.f37074c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f37072a + ", transportContext=" + this.f37073b + ", event=" + this.f37074c + "}";
    }
}
