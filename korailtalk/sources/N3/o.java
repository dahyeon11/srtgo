package n3;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34238a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34239b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34240c;

    private o(Class cls, int i8, int i9) {
        this.f34238a = (Class) v.checkNotNull(cls, "Null dependency anInterface.");
        this.f34239b = i8;
        this.f34240c = i9;
    }

    public static o optional(Class<?> cls) {
        return new o(cls, 0, 0);
    }

    public static o optionalProvider(Class<?> cls) {
        return new o(cls, 0, 1);
    }

    public static o required(Class<?> cls) {
        return new o(cls, 1, 0);
    }

    public static o requiredProvider(Class<?> cls) {
        return new o(cls, 1, 1);
    }

    public static o setOf(Class<?> cls) {
        return new o(cls, 2, 0);
    }

    public static o setOfProvider(Class<?> cls) {
        return new o(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f34238a == oVar.f34238a && this.f34239b == oVar.f34239b && this.f34240c == oVar.f34240c;
    }

    public Class<?> getInterface() {
        return this.f34238a;
    }

    public int hashCode() {
        return ((((this.f34238a.hashCode() ^ 1000003) * 1000003) ^ this.f34239b) * 1000003) ^ this.f34240c;
    }

    public boolean isDirectInjection() {
        return this.f34240c == 0;
    }

    public boolean isRequired() {
        return this.f34239b == 1;
    }

    public boolean isSet() {
        return this.f34239b == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f34238a);
        sb.append(", type=");
        int i8 = this.f34239b;
        sb.append(i8 == 1 ? "required" : i8 == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f34240c == 0);
        sb.append("}");
        return sb.toString();
    }
}
