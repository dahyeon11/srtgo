package R7;

/* loaded from: classes3.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4511a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4512b;

    h(Object obj) {
        this.f4512b = System.identityHashCode(obj);
        this.f4511a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4512b == hVar.f4512b && this.f4511a == hVar.f4511a;
    }

    public int hashCode() {
        return this.f4512b;
    }
}
