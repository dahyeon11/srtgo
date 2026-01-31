package Y3;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5608a;

    /* renamed from: b, reason: collision with root package name */
    private final X3.b f5609b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.b f5610c;

    /* renamed from: d, reason: collision with root package name */
    private final X3.c f5611d;

    b(X3.b bVar, X3.b bVar2, X3.c cVar, boolean z8) {
        this.f5609b = bVar;
        this.f5610c = bVar2;
        this.f5611d = cVar;
        this.f5608a = z8;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    X3.c b() {
        return this.f5611d;
    }

    X3.b c() {
        return this.f5609b;
    }

    X3.b d() {
        return this.f5610c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a(this.f5609b, bVar.f5609b) && a(this.f5610c, bVar.f5610c) && a(this.f5611d, bVar.f5611d);
    }

    public int hashCode() {
        return (e(this.f5609b) ^ e(this.f5610c)) ^ e(this.f5611d);
    }

    public boolean mustBeLast() {
        return this.f5610c == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f5609b);
        sb.append(" , ");
        sb.append(this.f5610c);
        sb.append(" : ");
        X3.c cVar = this.f5611d;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.getValue()));
        sb.append(" ]");
        return sb.toString();
    }
}
