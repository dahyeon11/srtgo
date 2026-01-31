package z;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6574d extends Z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37805a;

    C6574d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f37805a = obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z) {
            return this.f37805a.equals(((Z) obj).getValue());
        }
        return false;
    }

    @Override // z.Z
    public Object getValue() {
        return this.f37805a;
    }

    public int hashCode() {
        return this.f37805a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f37805a + "}";
    }
}
