package H6;

/* loaded from: classes.dex */
public final class c implements b, G6.a {

    /* renamed from: b, reason: collision with root package name */
    private static final c f1871b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f1872a;

    private c(Object obj) {
        this.f1872a = obj;
    }

    private static c a() {
        return f1871b;
    }

    public static <T> b create(T t8) {
        return new c(e.checkNotNull(t8, "instance cannot be null"));
    }

    public static <T> b createNullable(T t8) {
        return t8 == null ? a() : new c(t8);
    }

    @Override // H6.b, Q6.a, G6.a
    public Object get() {
        return this.f1872a;
    }
}
