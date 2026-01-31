package H6;

/* loaded from: classes.dex */
public final class a implements Q6.a, G6.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1868c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Q6.a f1869a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f1870b = f1868c;

    private a(Q6.a aVar) {
        this.f1869a = aVar;
    }

    public static <P extends Q6.a, T> G6.a lazy(P p8) {
        return p8 instanceof G6.a ? (G6.a) p8 : new a((Q6.a) e.checkNotNull(p8));
    }

    public static <P extends Q6.a, T> Q6.a provider(P p8) {
        e.checkNotNull(p8);
        return p8 instanceof a ? p8 : new a(p8);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == f1868c || (obj instanceof d) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // Q6.a, G6.a
    public Object get() {
        Object obj = this.f1870b;
        Object obj2 = f1868c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1870b;
                    if (obj == obj2) {
                        obj = this.f1869a.get();
                        this.f1870b = reentrantCheck(this.f1870b, obj);
                        this.f1869a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
