package m1;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5903a extends AbstractC5905c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f34108a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34109b;

    /* renamed from: c, reason: collision with root package name */
    private final d f34110c;

    C5903a(Integer num, Object obj, d dVar) {
        this.f34108a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f34109b = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f34110c = dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5905c)) {
            return false;
        }
        AbstractC5905c abstractC5905c = (AbstractC5905c) obj;
        Integer num = this.f34108a;
        if (num != null ? num.equals(abstractC5905c.getCode()) : abstractC5905c.getCode() == null) {
            if (this.f34109b.equals(abstractC5905c.getPayload()) && this.f34110c.equals(abstractC5905c.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.AbstractC5905c
    public Integer getCode() {
        return this.f34108a;
    }

    @Override // m1.AbstractC5905c
    public Object getPayload() {
        return this.f34109b;
    }

    @Override // m1.AbstractC5905c
    public d getPriority() {
        return this.f34110c;
    }

    public int hashCode() {
        Integer num = this.f34108a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f34109b.hashCode()) * 1000003) ^ this.f34110c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f34108a + ", payload=" + this.f34109b + ", priority=" + this.f34110c + "}";
    }
}
